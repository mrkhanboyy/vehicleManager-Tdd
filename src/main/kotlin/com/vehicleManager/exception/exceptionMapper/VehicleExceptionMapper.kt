package com.vehicleManager.exception.exceptionMapper

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.exception.vehicleExceptions.DuplicateRegistrationNumberException
import com.vehicleManager.exception.vehicleExceptions.InvalidVehicleDataException
import com.vehicleManager.exception.vehicleExceptions.VehicleException
import com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException
import com.vehicleManager.models.ErrorResponse
import java.time.LocalDateTime
import javax.inject.Inject
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper

class VehicleExceptionMapper @Inject constructor(
    private val objectMapper: ObjectMapper
) : ExceptionMapper<VehicleException> {


    override fun toResponse(exception: VehicleException?): Response {

        var errorResponse = ErrorResponse()
        errorResponse.setTimeStamp(LocalDateTime.now().toString())
        errorResponse.setMessage(exception?.message)

        when(exception){

            is InvalidVehicleDataException -> {
                errorResponse.setErrorCode("400")
                return Response.ok().entity(objectMapper.writeValueAsString(errorResponse)).build()
            }

            is VehicleNotFoundException -> {
                errorResponse.setErrorCode("404")
                return Response.ok().entity(objectMapper.writeValueAsString(errorResponse)).build()
            }

            is DuplicateRegistrationNumberException -> {

                    errorResponse.setErrorCode("400")
                    return Response.ok().entity(objectMapper.writeValueAsString(errorResponse)).build()

            }

        }
        return Response.ok("an error has occured").build()
    }
}