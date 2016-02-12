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

package com.google.gcloud.pubsub;

import com.google.common.collect.ImmutableSet;
import com.google.gcloud.ServiceOptions;
import com.google.gcloud.pubsub.spi.DefaultPubSubRpc;
import com.google.gcloud.pubsub.spi.PubSubRpc;
import com.google.gcloud.pubsub.spi.PubSubRpcFactory;

import java.util.Set;

public class PubSubOptions extends ServiceOptions<PubSub, PubSubRpc, PubSubOptions> {

  private static final long serialVersionUID = 6740347843343421456L;
  private static final String PUBSUB_SCOPE = "https://www.googleapis.com/auth/pubsub";
  private static final Set<String> SCOPES = ImmutableSet.of(PUBSUB_SCOPE);
  private static final String DEFAULT_HOST = "https://pubsub.googleapis.com";

  public static class DefaultPubSubFactory implements PubSubFactory {
    private static final PubSubFactory INSTANCE = new DefaultPubSubFactory();

    @Override
    public PubSub create(PubSubOptions options) {
      return new PubSubImpl(options);
    }
  }

  /**
   * Returns a default {@code PubSubOptions} instance.
   */
  public static PubSubOptions defaultInstance() {
    return builder().build();
  }

  public static class DefaultPubSubRpcFactory implements PubSubRpcFactory {
    private static final PubSubRpcFactory INSTANCE =
        new DefaultPubSubRpcFactory();

    @Override
    public PubSubRpc create(PubSubOptions options) {
      return new DefaultPubSubRpc(options);
    }
  }

  @Override
  protected String defaultHost() {
    return DEFAULT_HOST;
  }

  public static class Builder extends
      ServiceOptions.Builder<PubSub, PubSubRpc, PubSubOptions, Builder> {

    private Builder() {}

    private Builder(PubSubOptions options) {
      super(options);
    }

    @Override
    public PubSubOptions build() {
      return new PubSubOptions(this);
    }
  }

  private PubSubOptions(Builder builder) {
    super(PubSubFactory.class, PubSubRpcFactory.class, builder);
  }

  @Override
  protected PubSubFactory defaultServiceFactory() {
    return DefaultPubSubFactory.INSTANCE;
  }

  @Override
  protected PubSubRpcFactory defaultRpcFactory() {
    return DefaultPubSubRpcFactory.INSTANCE;
  }

  @Override
  protected Set<String> scopes() {
    return SCOPES;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof PubSubOptions && baseEquals((PubSubOptions) obj);
  }

  @Override
  public int hashCode() {
    return baseHashCode();
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  public static Builder builder() {
    return new Builder();
  }
}
