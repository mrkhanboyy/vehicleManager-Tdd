package com.vehicleManager.di.modules

import com.vehicleManager.repository.VehicleRepository
import com.vehicleManager.service.VehicleService
import dagger.Module
import dagger.Provides

@Module
class ServiceModule {

    @Provides
    fun serviceProvider(vehicleRepo: VehicleRepository):VehicleService{
        return VehicleService(vehicleRepo)
    }


}