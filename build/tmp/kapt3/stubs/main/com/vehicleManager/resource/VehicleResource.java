package com.vehicleManager.resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/vehicleManager/resource/VehicleResource;", "", "vehicleService", "Lcom/vehicleManager/service/VehicleService;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/vehicleManager/service/VehicleService;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "createNewVehicle", "Ljavax/ws/rs/core/Response;", "request", "", "getVehicle", "id", "VehicleManager-TDD"})
@javax.ws.rs.Path(value = "vehicle/v1")
public final class VehicleResource {
    private final com.vehicleManager.service.VehicleService vehicleService = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.Path(value = "/vehicle")
    @javax.ws.rs.POST()
    public final javax.ws.rs.core.Response createNewVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/vehicle/{uuid}")
    @javax.ws.rs.GET()
    public final javax.ws.rs.core.Response getVehicle(@org.jetbrains.annotations.NotNull()
    @javax.ws.rs.PathParam(value = "uuid")
    java.lang.String id) {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleResource(@org.jetbrains.annotations.NotNull()
    com.vehicleManager.service.VehicleService vehicleService, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}