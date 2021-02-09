package com.vehicleManager.repository


import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import com.vehicleManager.exception.DuplicateRegistrationNumberException
import com.vehicleManager.helper.EmbeddedMongodb
import com.vehicleManager.helper.TestData
import com.vehicleManager.models.Vehicle
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import java.util.*

class VehicleRepositoryShould {
    private lateinit var embeddedMongoDb: EmbeddedMongodb
    private lateinit var database: MongoDatabase
    private lateinit var vehicleRepository: VehicleRepository

    @Before
    fun configure() {

        startMongoDb()
        val mongoClient = MongoClient("localhost", embeddedMongoDb.port)
        database = mongoClient.getDatabase("vehicle")
        vehicleRepository = VehicleRepository(database)
    }

    @After
    fun closeConnections() {
        embeddedMongoDb.stop()
    }

    private fun startMongoDb() {
        val rand = Random()
        val n = rand.nextInt(99) + 9900
        embeddedMongoDb = EmbeddedMongodb(n)
        embeddedMongoDb.start()
    }

    @Test
    fun create_New_Vehicle_With_New_RegistrationNumber() {
        var vehicle = TestData.getVehicle()
        assertTrue((createNewVehicle(vehicle)?.getRegistrationNumber()).equals(vehicle.getRegistrationNumber()))

    }

    @Test
    fun create_New_Vehicle_With_Old_RegistrationNumber() {
        var vehicle = TestData.getVehicle()
        assertThrows(DuplicateRegistrationNumberException::class.java) {
            createNewVehicle(vehicle)
            createNewVehicle(vehicle)
        }
    }

    private fun createNewVehicle(vehicle: Vehicle): Vehicle? {
        return vehicleRepository.createNewVehicle(vehicle)
    }

}