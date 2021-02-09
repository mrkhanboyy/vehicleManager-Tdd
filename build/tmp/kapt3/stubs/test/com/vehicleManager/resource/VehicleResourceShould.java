package com.vehicleManager.resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/vehicleManager/resource/VehicleResourceShould;", "Lorg/glassfish/jersey/test/JerseyTest;", "()V", "baseUrl", "", "uuid", "vehicleService", "Lcom/vehicleManager/service/VehicleService;", "configure", "Ljavax/ws/rs/core/Application;", "return_200_and_vehicle_from_uuid", "", "VehicleManager-TDD"})
public final class VehicleResourceShould extends org.glassfish.jersey.test.JerseyTest {
    private final java.lang.String baseUrl = "vehicle/v1";
    private com.vehicleManager.service.VehicleService vehicleService;
    private final java.lang.String uuid = "1a1c5fe5-3ee0-453d-8425-5fec44961029";
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected javax.ws.rs.core.Application configure() {
        return null;
    }
    
    @org.junit.Test()
    public final void return_200_and_vehicle_from_uuid() {
    }
    
    public VehicleResourceShould() {
        super();
    }
}