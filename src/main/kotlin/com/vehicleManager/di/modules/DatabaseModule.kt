package com.vehicleManager.di.modules

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DatabaseModule {
//
//    @Provides
//    fun provideMongoClient(): MongoClient {
//
//        return
//    }

    @Provides
    fun providesMongoDatabase(
    ): MongoDatabase {
        return MongoClient("localhost", 27017).getDatabase("vehicle")
    }



}