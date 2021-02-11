package com.vehicleManager.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/vehicleManager/di/component/VehicleAppTestComponent;", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "vehicleRepository", "Lcom/vehicleManager/repository/VehicleRepository;", "vehicleService", "Lcom/vehicleManager/service/VehicleService;", "VehicleManager-TDD"})
@dagger.Component(modules = {com.vehicleManager.di.modules.MapperModule.class, com.vehicleManager.di.modules.ConfigModule.class, com.vehicleManager.di.modules.HttpModule.class, com.vehicleManager.di.modules.DatabaseModule.class})
public abstract interface VehicleAppTestComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vehicleManager.repository.VehicleRepository vehicleRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vehicleManager.service.VehicleService vehicleService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fasterxml.jackson.databind.ObjectMapper objectMapper();
}