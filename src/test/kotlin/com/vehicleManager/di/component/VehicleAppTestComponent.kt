package com.vehicleManager.di.component

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.di.modules.*
import com.vehicleManager.repository.VehicleRepository
import com.vehicleManager.service.VehicleService
import dagger.Component
import org.glassfish.grizzly.http.server.HttpServer

@Component(
    modules = [
        MapperModule::class,
        ConfigModule::class,
        HttpModule::class,
        RepositoryModule::class,
        ServiceModule::class,
        DatabaseModule::class
    ]
)
interface VehicleAppTestComponent {
    fun vehicleRepository(): VehicleRepository
    fun vehicleService(): VehicleService
    fun objectMapper(): ObjectMapper
}