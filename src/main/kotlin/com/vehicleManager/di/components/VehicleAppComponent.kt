package com.vehicleManager.di.components

import com.vehicleManager.di.modules.*
import dagger.Component
import org.glassfish.grizzly.http.server.HttpServer

@Component(
    modules = [
        MapperModule::class,
        ConfigModule::class,
        HttpModule::class,
        DatabaseModule::class
    ]
)
interface VehicleAppComponent {
    fun server(): HttpServer
}