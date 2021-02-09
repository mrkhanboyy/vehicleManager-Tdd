package com.vehicleManager.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vehicleManager/di/modules/ConfigModule;", "", "()V", "hostName", "", "port", "", "provideHost", "providePort", "VehicleManager-TDD"})
@dagger.Module()
public final class ConfigModule {
    private final java.lang.String hostName = "http://localhost";
    private final int port = 8080;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "host")
    @dagger.Provides()
    public final java.lang.String provideHost() {
        return null;
    }
    
    @javax.inject.Named(value = "port")
    @dagger.Provides()
    public final int providePort() {
        return 0;
    }
    
    public ConfigModule() {
        super();
    }
}