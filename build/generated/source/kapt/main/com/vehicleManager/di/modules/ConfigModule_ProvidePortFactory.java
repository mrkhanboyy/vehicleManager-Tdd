package com.vehicleManager.di.modules;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConfigModule_ProvidePortFactory implements Factory<Integer> {
  private final ConfigModule module;

  public ConfigModule_ProvidePortFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return providePort(module);
  }

  public static ConfigModule_ProvidePortFactory create(ConfigModule module) {
    return new ConfigModule_ProvidePortFactory(module);
  }

  public static int providePort(ConfigModule instance) {
    return instance.providePort();
  }
}
