package com.vehicleManager.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/vehicleManager/di/modules/MapperModule;", "", "()V", "providesObjectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "VehicleManager-TDD"})
@dagger.Module()
public final class MapperModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fasterxml.jackson.databind.ObjectMapper providesObjectMapper() {
        return null;
    }
    
    public MapperModule() {
        super();
    }
}