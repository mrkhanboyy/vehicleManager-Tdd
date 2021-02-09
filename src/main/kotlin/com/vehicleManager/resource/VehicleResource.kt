package com.vehicleManager.resource

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.models.Vehicle
import com.vehicleManager.service.VehicleService
import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
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
       var v = vehicleService.createNewVehicle(objectMapper.readValue(request, Vehicle::class.java))
       return Response.ok(v.toString()).build()
    }









}