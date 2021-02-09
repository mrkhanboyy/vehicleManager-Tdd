package com.vehicleManager.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\nH\u0007J\b\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/vehicleManager/repository/VehicleRepositoryShould;", "", "()V", "database", "Lcom/mongodb/client/MongoDatabase;", "embeddedMongoDb", "Lcom/vehicleManager/helper/EmbeddedMongodb;", "vehicleRepository", "Lcom/vehicleManager/repository/VehicleRepository;", "closeConnections", "", "configure", "createNewVehicle", "Lcom/vehicleManager/models/Vehicle;", "vehicle", "create_New_Vehicle_With_New_RegistrationNumber", "create_New_Vehicle_With_Old_RegistrationNumber", "startMongoDb", "VehicleManager-TDD"})
public final class VehicleRepositoryShould {
    private com.vehicleManager.helper.EmbeddedMongodb embeddedMongoDb;
    private com.mongodb.client.MongoDatabase database;
    private com.vehicleManager.repository.VehicleRepository vehicleRepository;
    
    @org.junit.Before()
    public final void configure() {
    }
    
    @org.junit.After()
    public final void closeConnections() {
    }
    
    private final void startMongoDb() {
    }
    
    @org.junit.Test()
    public final void create_New_Vehicle_With_New_RegistrationNumber() {
    }
    
    @org.junit.Test()
    public final void create_New_Vehicle_With_Old_RegistrationNumber() {
    }
    
    private final com.vehicleManager.models.Vehicle createNewVehicle(com.vehicleManager.models.Vehicle vehicle) {
        return null;
    }
    
    public VehicleRepositoryShould() {
        super();
    }
}