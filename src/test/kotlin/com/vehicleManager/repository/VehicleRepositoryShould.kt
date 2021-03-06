package com.vehicleManager.repository


import com.fasterxml.jackson.databind.ObjectMapper
import com.fretron.vehicleManager.utils.EmbeddedMongoDb
import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import com.vehicleManager.exception.vehicleExceptions.DuplicateRegistrationNumberException
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException
import com.vehicleManager.helper.TestData
import com.vehicleManager.models.Vehicle
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import java.util.*

class VehicleRepositoryShould {


    private val uuid: String = "1a1c5fe5-3ee0-453d-8425-5fec44961029"
    private lateinit var embeddedMongoDb: EmbeddedMongoDb
    private lateinit var database: MongoDatabase
    private val objectMapper = ObjectMapper()
    private lateinit var  vehicleRepository: VehicleRepository

    @Before
    fun configure() {

        startMongoDb()
        val mongoClient = MongoClient("localhost", embeddedMongoDb.port)
        database = mongoClient.getDatabase("vehicle")
        vehicleRepository = VehicleRepository(database, ObjectMapper())
    }

    @After
    fun closeConnections() {
        embeddedMongoDb.stop()
    }

    private fun startMongoDb() {
        val rand = Random()
        val n = rand.nextInt(99) + 9900
        embeddedMongoDb = EmbeddedMongoDb(n)
        embeddedMongoDb.start()
    }


    @Test
    fun create_New_Vehicle_With_New_RegistrationNumber() {
        var vehicle = TestData.getVehicle()
        var vehicleAfterCreation = createNewVehicle(vehicle)
        assertNotNull(vehicleAfterCreation)
    }

    @Test
    fun throw_exception_on_duplicate_registration_number() {
        var vehicle = TestData.getVehicle()
        assertThrows(DuplicateRegistrationNumberException::class.java) {
            createNewVehicle(vehicle)
            createNewVehicle(vehicle)
        }
    }

    private fun createNewVehicle(vehicle: Vehicle): Vehicle? {
        return vehicleRepository.createNewVehicle(vehicle)
    }

    @Test
    fun getVehicleById(){

        assertThrows(VehicleNotFoundException::class.java) {
                vehicleRepository.getVehicleById(uuid)
        }
        var vehicle = TestData.getVehicle()
        var vehicle2: Vehicle? = createNewVehicle(vehicle)
        assertTrue(vehicle2 != null)
        println("vehicle2 : $vehicle2")
        if (vehicle2 != null) {
            assert(vehicle.getRegistrationNumber() == vehicle2.getRegistrationNumber())
        }
    }

    @Test
    fun return_list_of_all_vehicle(){

        var vehicles_list_size_before_adding_any = vehicleRepository.getAllVehicles().size
        assertTrue(vehicles_list_size_before_adding_any == 0)
        println("vehicles_list_size_before_adding_any --> $vehicles_list_size_before_adding_any")

        vehicleRepository.createNewVehicle(TestData.getVehicle())
        var vehicles_list_size_after_adding_vehicle  = vehicleRepository.getAllVehicles().size
        assertTrue(vehicles_list_size_after_adding_vehicle == 1)
        println("vehicles_list_size_after_adding_1_vehicle --> $vehicles_list_size_after_adding_vehicle")
    }

    @Test
    fun return_vehicle_after_deletion_successfull(){
        assertThrows(VehicleNotFoundException::class.java) {
            vehicleRepository.deleteVehicleById(uuid)
        }

        createNewVehicle(TestData.getVehicle())
        val deleteVehicleById = vehicleRepository.deleteVehicleById(uuid)
        println("deleted vehicle uuid --> ${deleteVehicleById?.getUuid()}")
        assertTrue(deleteVehicleById?.getUuid() == uuid)

    }

    @Test
    fun return_vehicle_after_update(){

        val oldVehicle = TestData.getVehicle()
        val newVehicle = TestData.getUpdatedVehicle()
        assertTrue(oldVehicle.getUuid() == newVehicle.getUuid())
        assertTrue(oldVehicle.getDriverName() != newVehicle.getDriverName())
        createNewVehicle(oldVehicle)
        val vehicleAfterUpdate = vehicleRepository.updateVehicle(newVehicle)
        assertTrue(vehicleAfterUpdate?.getUuid() != null)
        assertTrue((vehicleAfterUpdate?.getUuid() == oldVehicle.getUuid()))
        assert(vehicleAfterUpdate?.getDriverName() != oldVehicle.getDriverName())

        }

}