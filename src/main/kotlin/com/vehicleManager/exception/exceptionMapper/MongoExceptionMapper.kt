package com.vehicleManager.exception.exceptionMapper

import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.MongoException
import com.vehicleManager.models.ErrorResponse
import java.time.LocalDateTime
import javax.inject.Inject
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper

class MongoExceptionMapper @Inject constructor(
    private val objectMapper: ObjectMapper
) : ExceptionMapper<MongoException> {

    override fun toResponse(exception: MongoException?): Response {

        var errorResponse = ErrorResponse()
        errorResponse.setTimeStamp(LocalDateTime.now().toString())
        errorResponse.setMessage(exception?.message)

        when (exception) {
            is MongoException -> {
                errorResponse.setErrorCode("500")
                return Response.ok().entity(objectMapper.writeValueAsString(errorResponse)).build()
            }

        }
        return Response.ok("an error has occured").build()
    }
}