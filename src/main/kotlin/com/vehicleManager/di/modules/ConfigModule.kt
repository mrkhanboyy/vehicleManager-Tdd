package com.vehicleManager.di.modules

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class ConfigModule {

    private val hostName: String = "http://localhost"
    private val port: Int = 8080

    @Provides
    @Named("host")
    fun provideHost(): String {
        return hostName
    }

    @Provides
    @Named("port")
    fun providePort(): Int {
        return port
    }
}