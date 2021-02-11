package com.vehicleManager.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vehicleManager/repository/VehicleRepository;", "", "database", "Lcom/mongodb/client/MongoDatabase;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/mongodb/client/MongoDatabase;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "collectionName", "", "createNewVehicle", "Lcom/vehicleManager/models/Vehicle;", "vehicle", "deleteVehicleById", "uuid", "getAllVehicles", "", "getVehicleById", "isRegistrationNumberDuplicate", "", "updateVehicle", "VehicleManager-TDD"})
public final class VehicleRepository {
    private final java.lang.String collectionName = "vehicle";
    private final com.mongodb.client.MongoDatabase database = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vehicleManager.models.Vehicle createNewVehicle(@org.jetbrains.annotations.NotNull()
    com.vehicleManager.models.Vehicle vehicle) throws com.vehicleManager.exception.DuplicateRegistrationNumberException {
        return null;
    }
    
    private final boolean isRegistrationNumberDuplicate(com.vehicleManager.models.Vehicle vehicle) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vehicleManager.models.Vehicle getVehicleById(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) throws com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vehicleManager.models.Vehicle> getAllVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vehicleManager.models.Vehicle deleteVehicleById(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) throws com.vehicleManager.exception.MongoDbException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vehicleManager.models.Vehicle updateVehicle(@org.jetbrains.annotations.Nullable()
    com.vehicleManager.models.Vehicle vehicle) {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase database, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}