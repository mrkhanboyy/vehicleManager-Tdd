package com.vehicleManager.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\b\u0010\u0014\u001a\u00020\u000eH\u0007J\b\u0010\u0015\u001a\u00020\u000eH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0007J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/vehicleManager/repository/VehicleRepositoryShould;", "", "()V", "database", "Lcom/mongodb/client/MongoDatabase;", "embeddedMongoDb", "Lcom/fretron/vehicleManager/utils/EmbeddedMongoDb;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "uuid", "", "vehicleRepository", "Lcom/vehicleManager/repository/VehicleRepository;", "closeConnections", "", "configure", "createNewVehicle", "Lcom/vehicleManager/models/Vehicle;", "vehicle", "create_New_Vehicle_With_New_RegistrationNumber", "getVehicleById", "return_list_of_all_vehicle", "return_vehicle_after_deletion_successfull", "return_vehicle_after_update", "startMongoDb", "throw_exception_on_duplicate_registration_number", "VehicleManager-TDD"})
public final class VehicleRepositoryShould {
    private final java.lang.String uuid = "1a1c5fe5-3ee0-453d-8425-5fec44961029";
    private com.fretron.vehicleManager.utils.EmbeddedMongoDb embeddedMongoDb;
    private com.mongodb.client.MongoDatabase database;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
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
    public final void throw_exception_on_duplicate_registration_number() {
    }
    
    private final com.vehicleManager.models.Vehicle createNewVehicle(com.vehicleManager.models.Vehicle vehicle) {
        return null;
    }
    
    @org.junit.Test()
    public final void getVehicleById() {
    }
    
    @org.junit.Test()
    public final void return_list_of_all_vehicle() {
    }
    
    @org.junit.Test()
    public final void return_vehicle_after_deletion_successfull() {
    }
    
    @org.junit.Test()
    public final void return_vehicle_after_update() {
    }
    
    public VehicleRepositoryShould() {
        super();
    }
}