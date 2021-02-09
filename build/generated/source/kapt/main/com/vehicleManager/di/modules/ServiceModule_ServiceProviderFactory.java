package com.vehicleManager.di.modules;

import com.vehicleManager.repository.VehicleRepository;
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
public final class ServiceModule_ServiceProviderFactory implements Factory<VehicleService> {
  private final ServiceModule module;

  private final Provider<VehicleRepository> vehicleRepoProvider;

  public ServiceModule_ServiceProviderFactory(ServiceModule module,
      Provider<VehicleRepository> vehicleRepoProvider) {
    this.module = module;
    this.vehicleRepoProvider = vehicleRepoProvider;
  }

  @Override
  public VehicleService get() {
    return serviceProvider(module, vehicleRepoProvider.get());
  }

  public static ServiceModule_ServiceProviderFactory create(ServiceModule module,
      Provider<VehicleRepository> vehicleRepoProvider) {
    return new ServiceModule_ServiceProviderFactory(module, vehicleRepoProvider);
  }

  public static VehicleService serviceProvider(ServiceModule instance,
      VehicleRepository vehicleRepo) {
    return Preconditions.checkNotNullFromProvides(instance.serviceProvider(vehicleRepo));
  }
}
