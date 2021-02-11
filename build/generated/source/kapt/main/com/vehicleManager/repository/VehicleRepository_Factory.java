package com.vehicleManager.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoDatabase;
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
public final class VehicleRepository_Factory implements Factory<VehicleRepository> {
  private final Provider<MongoDatabase> databaseProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public VehicleRepository_Factory(Provider<MongoDatabase> databaseProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    this.databaseProvider = databaseProvider;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public VehicleRepository get() {
    return newInstance(databaseProvider.get(), objectMapperProvider.get());
  }

  public static VehicleRepository_Factory create(Provider<MongoDatabase> databaseProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return new VehicleRepository_Factory(databaseProvider, objectMapperProvider);
  }

  public static VehicleRepository newInstance(MongoDatabase database, ObjectMapper objectMapper) {
    return new VehicleRepository(database, objectMapper);
  }
}
