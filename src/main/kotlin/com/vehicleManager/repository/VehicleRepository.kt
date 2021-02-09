package com.vehicleManager.repository

import com.mongodb.client.MongoDatabase
import com.vehicleManager.exception.DuplicateRegistrationNumberException
import com.vehicleManager.models.Vehicle
import org.bson.Document
import javax.inject.Inject
import com.mongodb.BasicDBObject


class VehicleRepository @Inject constructor(
    private val database: MongoDatabase
) {
    private val collectionName: String = "vehicle"


    @Throws(DuplicateRegistrationNumberException::class)
    fun createNewVehicle(vehicle: Vehicle): Vehicle? {
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


}
