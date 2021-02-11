package com.vehicleManager.helper

import com.vehicleManager.models.Vehicle
import org.codehaus.jackson.map.ObjectMapper

object TestData {

    private var objectMapper = ObjectMapper()

    fun createVehicleRequest(): String {
        return "{\n" +
                "\"uuid\":\"1a1c5fe5-3ee0-453d-8425-5fec44961029\",\n" +
                "\"registrationNumber\":\"11\",\n" +
                "\"driverName\":\"Driver Name\",\n" +
                "\"carryingCapacity\":\"40\",\n" +
                "\"bodyType\":\"Type-1\",\n" +
                "\"chassisType\":\"Type-2\"\n" +
                "}"

    }
    fun getVehicle(): Vehicle {
        return objectMapper.readValue(createVehicleRequest(), Vehicle::class.java)
    }

    fun getNullVehicle(): Vehicle? {
        return null
    }

    fun updateVehicleRequest(): String {
        return "{\n" +
                "\"uuid\":\"1a1c5fe5-3ee0-453d-8425-5fec44961029\",\n" +
                "\"registrationNumber\":\"11\",\n" +
                "\"driverName\":\"updated name\",\n" +
                "\"carryingCapacity\":\"updated capacity\",\n" +
                "\"bodyType\":\"Type-1\",\n" +
                "\"chassisType\":\"Type-2\"\n" +
                "}"

    }
    fun getUpdatedVehicle(): Vehicle {
        return objectMapper.readValue(updateVehicleRequest(), Vehicle::class.java)
    }




}