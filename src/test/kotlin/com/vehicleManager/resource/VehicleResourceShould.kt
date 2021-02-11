package com.vehicleManager.resource

import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.client.MongoDatabase
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import com.vehicleManager.di.component.DaggerVehicleAppTestComponent
import com.vehicleManager.helper.TestData
import com.vehicleManager.models.Vehicle
import com.vehicleManager.service.VehicleService
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.test.JerseyTest
import org.json.JSONObject
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.Mockito
import java.lang.Exception
import javax.ws.rs.client.Entity
import javax.ws.rs.core.Application
import javax.ws.rs.core.MediaType

class VehicleResourceShould : JerseyTest() {

    private val baseUrl: String = "vehicle/v1"
    private val uuid = "1a1c5fe5-3ee0-453d-8425-5fec44961029"


    override fun configure(): Application {
        val component = DaggerVehicleAppTestComponent.builder().build()
        return ResourceConfig().register(VehicleResource(component.vehicleService(), component.objectMapper()))
    }

    @Test
    fun get_200_after_creating_vehicle() {

        val request = TestData.createVehicleRequest()
        val response = target("$baseUrl/vehicle").request().post(Entity.entity(request, MediaType.APPLICATION_JSON))
        println("responsestatus : ${response.status}")
        assertTrue("response status : ", response.status == 200)
        val responseJson = JSONObject(response.readEntity(String::class.java))
        print(responseJson)
        var uuid = responseJson.get("uuid").toString()
        println("response uuid check : $uuid")
    }

    @Test
    fun return_200_and_vehicle_from_uuid() {

        val response = target("$baseUrl/vehicle/$uuid").request().get()
        println(response.status)
        val i = TestData.getVehicle()
        val responseJson = JSONObject(response.readEntity(String::class.java))
        println(responseJson)

    }

}