package com.vehicleManager.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleManager.service.VehicleService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VehicleResource_Factory implements Factory<VehicleResource> {
  private final Provider<VehicleService> vehicleServiceProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public VehicleResource_Factory(Provider<VehicleService> vehicleServiceProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    this.vehicleServiceProvider = vehicleServiceProvider;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public VehicleResource get() {
    return newInstance(vehicleServiceProvider.get(), objectMapperProvider.get());
  }

  public static VehicleResource_Factory create(Provider<VehicleService> vehicleServiceProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return new VehicleResource_Factory(vehicleServiceProvider, objectMapperProvider);
  }

  public static VehicleResource newInstance(VehicleService vehicleService,
      ObjectMapper objectMapper) {
    return new VehicleResource(vehicleService, objectMapper);
  }
}
