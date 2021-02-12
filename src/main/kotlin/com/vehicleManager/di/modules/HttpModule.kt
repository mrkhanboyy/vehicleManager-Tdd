package com.vehicleManager.di.modules

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.exception.exceptionMapper.MongoExceptionMapper
import com.vehicleManager.exception.exceptionMapper.VehicleExceptionMapper
import com.vehicleManager.resource.VehicleResource
import dagger.Module
import dagger.Provides
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import javax.inject.Named
import javax.ws.rs.core.UriBuilder


@Module
class HttpModule {

    @Provides
    fun provideResource(vehicleResources: VehicleResource, mapper: ObjectMapper): ResourceConfig {
        return ResourceConfig().register(vehicleResources).register(VehicleExceptionMapper(mapper))
            .register(MongoExceptionMapper(mapper))
    }

    @Provides
    fun server(@Named("host") host : String, @Named("port") port :Int, config : ResourceConfig): HttpServer {
        val url = UriBuilder.fromUri(host).port(port).build()
        return GrizzlyHttpServerFactory.createHttpServer(url,config)
    }

}