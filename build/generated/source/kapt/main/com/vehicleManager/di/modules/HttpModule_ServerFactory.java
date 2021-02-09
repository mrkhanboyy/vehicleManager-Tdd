package com.vehicleManager.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
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
public final class HttpModule_ServerFactory implements Factory<HttpServer> {
  private final HttpModule module;

  private final Provider<String> hostProvider;

  private final Provider<Integer> portProvider;

  private final Provider<ResourceConfig> configProvider;

  public HttpModule_ServerFactory(HttpModule module, Provider<String> hostProvider,
      Provider<Integer> portProvider, Provider<ResourceConfig> configProvider) {
    this.module = module;
    this.hostProvider = hostProvider;
    this.portProvider = portProvider;
    this.configProvider = configProvider;
  }

  @Override
  public HttpServer get() {
    return server(module, hostProvider.get(), portProvider.get(), configProvider.get());
  }

  public static HttpModule_ServerFactory create(HttpModule module, Provider<String> hostProvider,
      Provider<Integer> portProvider, Provider<ResourceConfig> configProvider) {
    return new HttpModule_ServerFactory(module, hostProvider, portProvider, configProvider);
  }

  public static HttpServer server(HttpModule instance, String host, int port,
      ResourceConfig config) {
    return Preconditions.checkNotNullFromProvides(instance.server(host, port, config));
  }
}
