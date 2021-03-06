package com.vehicleManager.di.components;

import com.vehicleManager.di.modules.ConfigModule;
import com.vehicleManager.di.modules.ConfigModule_ProvideHostFactory;
import com.vehicleManager.di.modules.DatabaseModule;
import com.vehicleManager.di.modules.DatabaseModule_ProvidesMongoDatabaseFactory;
import com.vehicleManager.di.modules.HttpModule;
import com.vehicleManager.di.modules.HttpModule_ProvideResourceFactory;
import com.vehicleManager.di.modules.HttpModule_ServerFactory;
import com.vehicleManager.di.modules.MapperModule;
import com.vehicleManager.di.modules.MapperModule_ProvidesObjectMapperFactory;
import com.vehicleManager.repository.VehicleRepository;
import com.vehicleManager.resource.VehicleResource;
import com.vehicleManager.service.VehicleService;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerVehicleAppComponent implements VehicleAppComponent {
  private final ConfigModule configModule;

  private final DatabaseModule databaseModule;

  private final MapperModule mapperModule;

  private final HttpModule httpModule;

  private DaggerVehicleAppComponent(MapperModule mapperModuleParam, ConfigModule configModuleParam,
      HttpModule httpModuleParam, DatabaseModule databaseModuleParam) {
    this.configModule = configModuleParam;
    this.databaseModule = databaseModuleParam;
    this.mapperModule = mapperModuleParam;
    this.httpModule = httpModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VehicleAppComponent create() {
    return new Builder().build();
  }

  private VehicleRepository vehicleRepository() {
    return new VehicleRepository(DatabaseModule_ProvidesMongoDatabaseFactory.providesMongoDatabase(databaseModule), MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule));
  }

  private VehicleService vehicleService() {
    return new VehicleService(vehicleRepository());
  }

  private VehicleResource vehicleResource() {
    return new VehicleResource(vehicleService(), MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule));
  }

  private ResourceConfig resourceConfig() {
    return HttpModule_ProvideResourceFactory.provideResource(httpModule, vehicleResource(), MapperModule_ProvidesObjectMapperFactory.providesObjectMapper(mapperModule));
  }

  @Override
  public HttpServer server() {
    return HttpModule_ServerFactory.server(httpModule, ConfigModule_ProvideHostFactory.provideHost(configModule), configModule.providePort(), resourceConfig());
  }

  public static final class Builder {
    private MapperModule mapperModule;

    private ConfigModule configModule;

    private HttpModule httpModule;

    private DatabaseModule databaseModule;

    private Builder() {
    }

    public Builder mapperModule(MapperModule mapperModule) {
      this.mapperModule = Preconditions.checkNotNull(mapperModule);
      return this;
    }

    public Builder configModule(ConfigModule configModule) {
      this.configModule = Preconditions.checkNotNull(configModule);
      return this;
    }

    public Builder httpModule(HttpModule httpModule) {
      this.httpModule = Preconditions.checkNotNull(httpModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public VehicleAppComponent build() {
      if (mapperModule == null) {
        this.mapperModule = new MapperModule();
      }
      if (configModule == null) {
        this.configModule = new ConfigModule();
      }
      if (httpModule == null) {
        this.httpModule = new HttpModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      return new DaggerVehicleAppComponent(mapperModule, configModule, httpModule, databaseModule);
    }
  }
}
