package com.vehicleManager.di.modules;

import com.fasterxml.jackson.databind.ObjectMapper;
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
public final class MapperModule_ProvidesObjectMapperFactory implements Factory<ObjectMapper> {
  private final MapperModule module;

  public MapperModule_ProvidesObjectMapperFactory(MapperModule module) {
    this.module = module;
  }

  @Override
  public ObjectMapper get() {
    return providesObjectMapper(module);
  }

  public static MapperModule_ProvidesObjectMapperFactory create(MapperModule module) {
    return new MapperModule_ProvidesObjectMapperFactory(module);
  }

  public static ObjectMapper providesObjectMapper(MapperModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesObjectMapper());
  }
}
