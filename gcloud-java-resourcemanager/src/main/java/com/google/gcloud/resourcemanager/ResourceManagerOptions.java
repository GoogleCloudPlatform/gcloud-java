/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.gcloud.resourcemanager;

import com.google.common.collect.ImmutableSet;
import com.google.gcloud.ServiceOptions;
import com.google.gcloud.spi.DefaultResourceManagerRpc;
import com.google.gcloud.spi.ResourceManagerRpc;
import com.google.gcloud.spi.ResourceManagerRpcFactory;

import java.util.Set;

public class ResourceManagerOptions
    extends ServiceOptions<ResourceManager, ResourceManagerRpc, ResourceManagerOptions> {

  private static final long serialVersionUID = 538303101192527452L;
  private static final String GCRM_SCOPE = "https://www.googleapis.com/auth/cloud-platform";
  private static final Set<String> SCOPES = ImmutableSet.of(GCRM_SCOPE);
  private static final String DEFAULT_HOST = "https://cloudresourcemanager.googleapis.com";

  public static class DefaultResourceManagerFactory implements ResourceManagerFactory {
    private static final ResourceManagerFactory INSTANCE = new DefaultResourceManagerFactory();

    @Override
    public ResourceManager create(ResourceManagerOptions options) {
      return new ResourceManagerImpl(options);
    }
  }

  /**
   * Returns a default {@code ResourceManagerOptions} instance.
   */
  public static ResourceManagerOptions defaultInstance() {
    return builder().build();
  }

  public static class DefaultResourceManagerRpcFactory implements ResourceManagerRpcFactory {
    private static final ResourceManagerRpcFactory INSTANCE =
        new DefaultResourceManagerRpcFactory();

    @Override
    public ResourceManagerRpc create(ResourceManagerOptions options) {
      return new DefaultResourceManagerRpc(options);
    }
  }

  @Override
  protected String defaultHost() {
    return DEFAULT_HOST;
  }

  public static class Builder extends ServiceOptions.Builder<ResourceManager, ResourceManagerRpc,
      ResourceManagerOptions, Builder> {

    private Builder() {}

    private Builder(ResourceManagerOptions options) {
      super(options);
    }

    @Override
    public ResourceManagerOptions build() {
      return new ResourceManagerOptions(this);
    }
  }

  private ResourceManagerOptions(Builder builder) {
    super(ResourceManagerFactory.class, ResourceManagerRpcFactory.class, builder);
  }

  @Override
  protected boolean projectIdRequired() {
    return false;
  }

  @Override
  protected ResourceManagerFactory defaultServiceFactory() {
    return DefaultResourceManagerFactory.INSTANCE;
  }

  @Override
  protected ResourceManagerRpcFactory defaultRpcFactory() {
    return DefaultResourceManagerRpcFactory.INSTANCE;
  }

  @Override
  protected Set<String> scopes() {
    return SCOPES;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof ResourceManagerOptions && baseEquals((ResourceManagerOptions) obj);
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  public static Builder builder() {
    return new Builder();
  }
}
