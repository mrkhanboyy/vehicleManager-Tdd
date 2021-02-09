package com.vehicleManager.service;

import com.vehicleManager.repository.VehicleRepository;
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
public final class VehicleService_Factory implements Factory<VehicleService> {
  private final Provider<VehicleRepository> vehicleRepoProvider;

  public VehicleService_Factory(Provider<VehicleRepository> vehicleRepoProvider) {
    this.vehicleRepoProvider = vehicleRepoProvider;
  }

  @Override
  public VehicleService get() {
    return newInstance(vehicleRepoProvider.get());
  }

  public static VehicleService_Factory create(Provider<VehicleRepository> vehicleRepoProvider) {
    return new VehicleService_Factory(vehicleRepoProvider);
  }

  public static VehicleService newInstance(VehicleRepository vehicleRepo) {
    return new VehicleService(vehicleRepo);
  }
}
