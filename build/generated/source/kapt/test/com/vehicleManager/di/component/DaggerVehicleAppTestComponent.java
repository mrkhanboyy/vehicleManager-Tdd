package com.vehicleManager.di.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleManager.di.modules.ConfigModule;
import com.vehicleManager.di.modules.DatabaseModule;
import com.vehicleManager.di.modules.DatabaseModule_ProvidesMongoDatabaseFactory;
import com.vehicleManager.di.modules.HttpModule;
import com.vehicleManager.di.modules.MapperModule;
import com.vehicleManager.di.modules.MapperModule_ProvidesObjectMapperFactory;
import com.vehicleManager.di.modules.RepositoryModule;
import com.vehicleManager.di.modules.RepositoryModule_VehicleRepoFactory;
import com.vehicleManager.di.modules.ServiceModule;
import com.vehicleManager.di.modules.ServiceModule_ServiceProviderFactory;
import com.vehicleManager.repository.VehicleRepository;
import com.vehicleManager.service.VehicleService;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerVehicleAppTestComponent implements VehicleAppTestComponent {
  private final DatabaseModule databaseModule;

  private final RepositoryModule repositoryModule;

  private final ServiceModule serviceModule;

  private final MapperModule mapperModule;

  private DaggerVehicleAppTestComponent(MapperModule mapperModuleParam,
      RepositoryModule repositoryModuleParam, ServiceModule serviceModuleParam,
      DatabaseModule databaseModuleParam) {
    this.databaseModule = databaseModuleParam;
    this.repositoryModule = repositoryModuleParam;
    this.serviceModule = serviceModuleParam;
    this.mapperModule = mapperModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VehicleAppTestComponent create() {
    return new Builder().build();
  }

  @Override
  public VehicleRepository vehicleRepository() {
    return RepositoryModule_VehicleRepoFactory.vehicleRepo(repositoryModule, DatabaseModule_ProvidesMongoDatabaseFactory.providesMongoDatabase(databaseModule));
  }

  @Override
  public VehicleService vehicleService() {
    return ServiceModule_ServiceProviderFactory.serviceProvider(serviceModule, vehicleRepository());
  }

  @Override
  public ObjectMapper objectMapper() {
    return MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule);
  }

  public static final class Builder {
    private MapperModule mapperModule;

    private RepositoryModule repositoryModule;

    private ServiceModule serviceModule;

    private DatabaseModule databaseModule;

    private Builder() {
    }

    public Builder mapperModule(MapperModule mapperModule) {
      this.mapperModule = Preconditions.checkNotNull(mapperModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder configModule(ConfigModule configModule) {
      Preconditions.checkNotNull(configModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder httpModule(HttpModule httpModule) {
      Preconditions.checkNotNull(httpModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public VehicleAppTestComponent build() {
      if (mapperModule == null) {
        this.mapperModule = new MapperModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      return new DaggerVehicleAppTestComponent(mapperModule, repositoryModule, serviceModule, databaseModule);
    }
  }
}
