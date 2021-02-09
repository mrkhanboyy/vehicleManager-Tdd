package com.vehicleManager.helper

import com.vehicleManager.models.Vehicle
import org.codehaus.jackson.map.ObjectMapper

object TestData {

    private var objectMapper = ObjectMapper()

    fun createVehicleRequest(): String {
        return "{" +
                "\"uuid\":\"1a1c5fe5-3ee0-453d-8425-5fec44961029\"," +
                "\"registrationNumber\":\"11\"," +
                "\"driverName\": \"Driver Name\"," +
                "\"carryingCapacity\":\"40\"," +
                "\"bodyType\": \"Type-1\"," +
                "\"chassisType\": \"Type-2\"" +
                " }"
    }
    fun getVehicle(): Vehicle {
        val jsonString = "{\n" +
                "    \"uuid\": \"1a1c5fe5-3ee0-453d-8425-5fec44961029\",\n" +
                "    \"registrationNumber\": \"11\",\n" +
                "    \"driverName\": \"Driver Name\",\n" +
                "    \"bodyType\": \"Type-1\",\n" +
                "    \"chassisType\": \"Type-2\",\n" +
                "    \"carryingCapacity\": \"40\"\n" +
                "}"
        return objectMapper.readValue(jsonString, Vehicle::class.java)
    }


}