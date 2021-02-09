package com.vehicleManager.di.modules;

import com.mongodb.client.MongoDatabase;
import com.vehicleManager.repository.VehicleRepository;
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
public final class RepositoryModule_VehicleRepoFactory implements Factory<VehicleRepository> {
  private final RepositoryModule module;

  private final Provider<MongoDatabase> databaseProvider;

  public RepositoryModule_VehicleRepoFactory(RepositoryModule module,
      Provider<MongoDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public VehicleRepository get() {
    return vehicleRepo(module, databaseProvider.get());
  }

  public static RepositoryModule_VehicleRepoFactory create(RepositoryModule module,
      Provider<MongoDatabase> databaseProvider) {
    return new RepositoryModule_VehicleRepoFactory(module, databaseProvider);
  }

  public static VehicleRepository vehicleRepo(RepositoryModule instance, MongoDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.vehicleRepo(database));
  }
}
