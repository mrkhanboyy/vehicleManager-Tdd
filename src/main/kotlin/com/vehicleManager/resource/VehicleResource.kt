package com.vehicleManager.resource

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.models.Vehicle
import com.vehicleManager.service.VehicleService
import java.lang.Exception
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("vehicle/v1")
class VehicleResource @Inject constructor(private val vehicleService: VehicleService,
private val objectMapper: ObjectMapper) {


    @POST
    @Path("/vehicle")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun createNewVehicle(request: String): Response {
            var  v = vehicleService.createNewVehicle(objectMapper.readValue(request, Vehicle::class.java))
        return Response.ok(v.toString()).build()
    }


    @GET
    @Path("/vehicle/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getVehicle(@PathParam("uuid") id: String): Response{
        var v:Vehicle? = vehicleService.getVehicleById(id)
        return Response.ok(v.toString()).build()
    }


    @GET
    @Path("/vehicles")
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllVehicles(): Response{
        var vehicles = vehicleService.getALlVehicles()
        return Response.ok(vehicles.toString()).build()
    }

    @DELETE
    @Path("/vehicle/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteVehicle(@PathParam("uuid") uuid: String): Response{
        val vehicle: Vehicle? = vehicleService.deleteVehicle(uuid)
        return Response.ok(vehicle.toString()).build()
    }


    @PUT
    @Path("/vehicle")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun updateVehicle(request: String): Response{
        val vehicle: Vehicle =  vehicleService.updateVehicle(objectMapper.readValue(request,Vehicle::class.java))
        return Response.ok().build()
    }







}