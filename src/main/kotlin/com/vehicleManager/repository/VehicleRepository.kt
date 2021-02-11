package com.vehicleManager.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.client.MongoDatabase
import com.vehicleManager.exception.DuplicateRegistrationNumberException
import com.vehicleManager.models.Vehicle
import org.bson.Document
import javax.inject.Inject
import com.mongodb.BasicDBObject
import com.mongodb.util.JSON
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException


class VehicleRepository @Inject constructor(
    private val database: MongoDatabase,
    private val objectMapper: ObjectMapper
) {
    private val collectionName: String = "vehicle"


    @Throws(DuplicateRegistrationNumberException::class)
    fun createNewVehicle(vehicle: Vehicle): Vehicle {
        var collection = database.getCollection(collectionName)
        var document = Document.parse(vehicle.toString())
        document["_id"] = vehicle.getUuid()
        if (isRegistrationNumberDuplicate(vehicle)) {
            throw DuplicateRegistrationNumberException("duplicate registration number : ${vehicle.getRegistrationNumber()}")
        }
        collection.insertOne(document)
        return vehicle
    }

    private fun isRegistrationNumberDuplicate(vehicle: Vehicle): Boolean {
        val query = BasicDBObject()
        query["registrationNumber"] = vehicle.getRegistrationNumber()
        var result = database.getCollection(collectionName).find(query).limit(1).iterator()
        return result.hasNext()
    }

    @Throws(VehicleNotFoundException::class)
    fun getVehicleById(id: String): Vehicle? {
        var collection = database.getCollection(collectionName)
        val query = BasicDBObject()
        query["_id"] = id
        var result = database.getCollection(collectionName).find(query).limit(1).iterator()

        if (result.hasNext()) {
            val document = result.next()
            document.remove("_id")
            val json = JSON.serialize(document)
            return objectMapper.readValue(json, Vehicle::class.java)
        }
        throw VehicleNotFoundException("Vehicle Not Found  with id :: $id")
    }


}
