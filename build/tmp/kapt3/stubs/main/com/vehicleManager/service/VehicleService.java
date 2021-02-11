package com.vehicleManager.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/vehicleManager/service/VehicleService;", "", "vehicleRepo", "Lcom/vehicleManager/repository/VehicleRepository;", "(Lcom/vehicleManager/repository/VehicleRepository;)V", "createNewVehicle", "Lcom/vehicleManager/models/Vehicle;", "vehicle", "getVehicleById", "id", "", "validateVehicelData", "", "VehicleManager-TDD"})
public final class VehicleService {
    private final com.vehicleManager.repository.VehicleRepository vehicleRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vehicleManager.models.Vehicle createNewVehicle(@org.jetbrains.annotations.NotNull()
    com.vehicleManager.models.Vehicle vehicle) throws com.vehicleManager.exception.vehicleExceptions.VehicleException {
        return null;
    }
    
    private final void validateVehicelData(com.vehicleManager.models.Vehicle vehicle) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vehicleManager.models.Vehicle getVehicleById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) throws com.vehicleManager.exception.vehicleExceptions.VehicleNotFoundException {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleService(@org.jetbrains.annotations.NotNull()
    com.vehicleManager.repository.VehicleRepository vehicleRepo) {
        super();
    }
}