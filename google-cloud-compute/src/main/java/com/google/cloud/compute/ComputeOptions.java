/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute;

import com.google.cloud.HttpTransportOptions;
import com.google.cloud.ServiceDefaults;
import com.google.cloud.ServiceFactory;
import com.google.cloud.ServiceOptions;
import com.google.cloud.TransportOptions;
import com.google.cloud.compute.spi.ComputeRpc;
import com.google.cloud.compute.spi.ComputeRpcFactory;
import com.google.cloud.compute.spi.DefaultComputeRpc;
import com.google.cloud.spi.ServiceRpcFactory;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class ComputeOptions extends ServiceOptions<Compute, ComputeRpc, ComputeOptions> {

  private static final String API_SHORT_NAME = "Compute";
  private static final String COMPUTE_SCOPE = "https://www.googleapis.com/auth/compute";
  private static final Set<String> SCOPES = ImmutableSet.of(COMPUTE_SCOPE);
  private static final long serialVersionUID = 6983703596543425691L;

  public static class DefaultComputeFactory implements ComputeFactory {

    private static final ComputeFactory INSTANCE = new DefaultComputeFactory();

    @Override
    public Compute create(ComputeOptions options) {
      return new ComputeImpl(options);
    }
  }

  public static class DefaultComputeRpcFactory implements ComputeRpcFactory {

    private static final ComputeRpcFactory INSTANCE = new DefaultComputeRpcFactory();

    @Override
    public ComputeRpc create(ComputeOptions options) {
      return new DefaultComputeRpc(options);
    }
  }

  public static class Builder extends
      ServiceOptions.Builder<Compute, ComputeRpc, ComputeOptions, Builder> {

    private Builder() {
    }

    private Builder(ComputeOptions options) {
      super(options);
    }

    @Override
    public Builder setTransportOptions(TransportOptions transportOptions) {
      if (!(transportOptions instanceof HttpTransportOptions)) {
        throw new IllegalArgumentException(
            "Only http transport is allowed for " + API_SHORT_NAME + ".");
      }
      return super.setTransportOptions(transportOptions);
    }

    @Override
    public ComputeOptions build() {
      return new ComputeOptions(this);
    }
  }

  private ComputeOptions(Builder builder) {
    super(ComputeFactory.class, ComputeRpcFactory.class, builder, new ComputeDefaults());
  }

  private static class ComputeDefaults implements
      ServiceDefaults<Compute, ComputeRpc, ComputeOptions> {

    @Override
    public ComputeFactory getDefaultServiceFactory() {
      return DefaultComputeFactory.INSTANCE;
    }

    @Override
    public ComputeRpcFactory getDefaultRpcFactory() {
      return DefaultComputeRpcFactory.INSTANCE;
    }

    @Override
    public TransportOptions getDefaultTransportOptions() {
      return getDefaultHttpTransportOptions();
    }
  }

  public static HttpTransportOptions getDefaultHttpTransportOptions() {
    return HttpTransportOptions.newBuilder().build();
  }

  @Override
  protected Set<String> getScopes() {
    return SCOPES;
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public int hashCode() {
    return baseHashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ComputeOptions)) {
      return false;
    }
    ComputeOptions other = (ComputeOptions) obj;
    return baseEquals(other);
  }

  @Deprecated
  public static ComputeOptions defaultInstance() {
    return getDefaultInstance();
  }

  public static ComputeOptions getDefaultInstance() {
    return newBuilder().build();
  }

  @Deprecated
  public static Builder builder() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return new Builder();
  }
}
