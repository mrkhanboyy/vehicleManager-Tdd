package com.vehicleManager.resource

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.whenever
import com.vehicleManager.di.component.DaggerVehicleAppTestComponent
import com.vehicleManager.helper.TestData
import com.vehicleManager.service.VehicleService
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.test.JerseyTest
import org.json.JSONObject
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import java.lang.Exception
import javax.ws.rs.client.Entity
import javax.ws.rs.core.Application
import javax.ws.rs.core.MediaType

class VehicleResourceShould : JerseyTest() {

    private val baseUrl: String = "vehicle/v1"
    private val uuid = "1a1c5fe5-3ee0-453d-8425-5fec44961029"
    private lateinit var vehicleService: VehicleService


    override fun configure(): Application {
        vehicleService = mock(VehicleService::class.java)

        val component = DaggerVehicleAppTestComponent.builder().build()
        return ResourceConfig().register(VehicleResource(vehicleService, component.objectMapper()))
    }

    @Before
    fun before(){
        whenever(vehicleService.createNewVehicle(any())).thenReturn(TestData.getVehicle())
        whenever(vehicleService.getVehicleById(any())).thenReturn(TestData.getVehicle())
        whenever(vehicleService.getALlVehicles()).thenReturn(listOf(TestData.getVehicle()))
        whenever(vehicleService.deleteVehicle(any())).thenReturn(TestData.getVehicle())
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
        val responseJson = JSONObject(response.readEntity(String::class.java))
        assertNotNull(responseJson)
        println("response  uuid : ${responseJson.get("uuid").toString()}")

    }

    @Test
    fun return_200_after_getting_list_of_all_vehicles(){

        val response = target("$baseUrl/vehicles").request().get()
        assertTrue(response.status == 200)
        print("response status --->  ${response.status}")
        assertNotNull(response)
    }

    @Test
    fun return_200_after_delete_vehicle(){

        val response = target("$baseUrl/vehicle/$uuid").request().delete()
        assertTrue(response.status == 200)
        assertNotNull(response.entity)
        val responseJson = JSONObject(response.readEntity(String::class.java))
        assertNotNull(responseJson)
        println("response  uuid : ${responseJson.get("uuid").toString()}")

    }

    @Test
    fun return_200_after_updating_vehicle(){
        var vehicle = TestData.updateVehicleRequest()
        val response = target("$baseUrl/vehicle").request().put(Entity.entity(vehicle, MediaType.APPLICATION_JSON))
        assertTrue(response.status == 200)


    }

}