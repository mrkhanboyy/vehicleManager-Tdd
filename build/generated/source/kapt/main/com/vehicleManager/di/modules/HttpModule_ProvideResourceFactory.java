package com.vehicleManager.di.modules;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleManager.resource.VehicleResource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HttpModule_ProvideResourceFactory implements Factory<ResourceConfig> {
  private final HttpModule module;

  private final Provider<VehicleResource> vehicleResourcesProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public HttpModule_ProvideResourceFactory(HttpModule module,
      Provider<VehicleResource> vehicleResourcesProvider, Provider<ObjectMapper> mapperProvider) {
    this.module = module;
    this.vehicleResourcesProvider = vehicleResourcesProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public ResourceConfig get() {
    return provideResource(module, vehicleResourcesProvider.get(), mapperProvider.get());
  }

  public static HttpModule_ProvideResourceFactory create(HttpModule module,
      Provider<VehicleResource> vehicleResourcesProvider, Provider<ObjectMapper> mapperProvider) {
    return new HttpModule_ProvideResourceFactory(module, vehicleResourcesProvider, mapperProvider);
  }

  public static ResourceConfig provideResource(HttpModule instance,
      VehicleResource vehicleResources, ObjectMapper mapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideResource(vehicleResources, mapper));
  }
}
