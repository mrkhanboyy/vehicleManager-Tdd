package com.vehicleManager.di.modules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleManager.resource.VehicleResource;
import com.vehicleManager.service.VehicleService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ResourceModule_VehicleResourceProviderFactory implements Factory<VehicleResource> {
  private final ResourceModule module;

  private final Provider<VehicleService> vehicleServiceProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public ResourceModule_VehicleResourceProviderFactory(ResourceModule module,
      Provider<VehicleService> vehicleServiceProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    this.module = module;
    this.vehicleServiceProvider = vehicleServiceProvider;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public VehicleResource get() {
    return vehicleResourceProvider(module, vehicleServiceProvider.get(), objectMapperProvider.get());
  }

  public static ResourceModule_VehicleResourceProviderFactory create(ResourceModule module,
      Provider<VehicleService> vehicleServiceProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return new ResourceModule_VehicleResourceProviderFactory(module, vehicleServiceProvider, objectMapperProvider);
  }

  public static VehicleResource vehicleResourceProvider(ResourceModule instance,
      VehicleService vehicleService, ObjectMapper objectMapper) {
    return Preconditions.checkNotNullFromProvides(instance.vehicleResourceProvider(vehicleService, objectMapper));
  }
}
