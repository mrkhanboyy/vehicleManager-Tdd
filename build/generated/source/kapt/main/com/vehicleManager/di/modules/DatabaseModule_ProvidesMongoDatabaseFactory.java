package com.vehicleManager.di.modules;

import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
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
public final class DatabaseModule_ProvidesMongoDatabaseFactory implements Factory<MongoDatabase> {
  private final DatabaseModule module;

  public DatabaseModule_ProvidesMongoDatabaseFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public MongoDatabase get() {
    return providesMongoDatabase(module);
  }

  public static DatabaseModule_ProvidesMongoDatabaseFactory create(DatabaseModule module) {
    return new DatabaseModule_ProvidesMongoDatabaseFactory(module);
  }

  public static MongoDatabase providesMongoDatabase(DatabaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesMongoDatabase());
  }
}
