package com.vehicleManager.di.modules

import com.fasterxml.jackson.databind.ObjectMapper
import com.vehicleManager.resource.VehicleResource
import com.vehicleManager.service.VehicleService
import dagger.Module
import dagger.Provides

@Module
class ResourceModule {

    @Provides
    fun vehicleResourceProvider(vehicleService: VehicleService, objectMapper: ObjectMapper):VehicleResource{
        return VehicleResource(vehicleService, objectMapper)
    }
}