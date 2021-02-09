package com.vehicleManager.di.modules

import com.fasterxml.jackson.databind.ObjectMapper
import dagger.Module
import dagger.Provides

@Module
class MapperModule {

    @Provides
    fun providesObjectMapper(): ObjectMapper {
        return ObjectMapper()
    }
}