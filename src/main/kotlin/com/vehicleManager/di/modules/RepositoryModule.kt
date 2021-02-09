package com.vehicleManager.di.modules

import com.mongodb.client.MongoDatabase
import com.vehicleManager.repository.VehicleRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun vehicleRepo(database: MongoDatabase): VehicleRepository{
        return VehicleRepository(database)
    }

}