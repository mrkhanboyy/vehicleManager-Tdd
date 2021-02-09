package com.vehicleManager.di.modules;

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
public final class ConfigModule_ProvideHostFactory implements Factory<String> {
  private final ConfigModule module;

  public ConfigModule_ProvideHostFactory(ConfigModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideHost(module);
  }

  public static ConfigModule_ProvideHostFactory create(ConfigModule module) {
    return new ConfigModule_ProvideHostFactory(module);
  }

  public static String provideHost(ConfigModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHost());
  }
}
