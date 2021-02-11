package com.vehicleManager.di.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicleManager.di.modules.ConfigModule;
import com.vehicleManager.di.modules.DatabaseModule;
import com.vehicleManager.di.modules.DatabaseModule_ProvidesMongoDatabaseFactory;
import com.vehicleManager.di.modules.HttpModule;
import com.vehicleManager.di.modules.MapperModule;
import com.vehicleManager.di.modules.MapperModule_ProvidesObjectMapperFactory;
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

  private final MapperModule mapperModule;

  private DaggerVehicleAppTestComponent(MapperModule mapperModuleParam,
      DatabaseModule databaseModuleParam) {
    this.databaseModule = databaseModuleParam;
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
    return new VehicleRepository(DatabaseModule_ProvidesMongoDatabaseFactory.providesMongoDatabase(databaseModule), MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule));
  }

  @Override
  public VehicleService vehicleService() {
    return new VehicleService(vehicleRepository());
  }

  @Override
  public ObjectMapper objectMapper() {
    return MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule);
  }

  public static final class Builder {
    private MapperModule mapperModule;

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

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public VehicleAppTestComponent build() {
      if (mapperModule == null) {
        this.mapperModule = new MapperModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      return new DaggerVehicleAppTestComponent(mapperModule, databaseModule);
    }
  }
}
