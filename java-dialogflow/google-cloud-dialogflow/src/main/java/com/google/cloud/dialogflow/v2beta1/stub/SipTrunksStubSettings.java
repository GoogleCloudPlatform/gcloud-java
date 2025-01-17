/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.SipTrunksClient.ListLocationsPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.SipTrunksClient.ListSipTrunksPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.CreateSipTrunkRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteSipTrunkRequest;
import com.google.cloud.dialogflow.v2beta1.GetSipTrunkRequest;
import com.google.cloud.dialogflow.v2beta1.ListSipTrunksRequest;
import com.google.cloud.dialogflow.v2beta1.ListSipTrunksResponse;
import com.google.cloud.dialogflow.v2beta1.SipTrunk;
import com.google.cloud.dialogflow.v2beta1.UpdateSipTrunkRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link SipTrunksStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createSipTrunk:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SipTrunksStubSettings.Builder sipTrunksSettingsBuilder = SipTrunksStubSettings.newBuilder();
 * sipTrunksSettingsBuilder
 *     .createSipTrunkSettings()
 *     .setRetrySettings(
 *         sipTrunksSettingsBuilder
 *             .createSipTrunkSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * SipTrunksStubSettings sipTrunksSettings = sipTrunksSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SipTrunksStubSettings extends StubSettings<SipTrunksStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final UnaryCallSettings<CreateSipTrunkRequest, SipTrunk> createSipTrunkSettings;
  private final UnaryCallSettings<DeleteSipTrunkRequest, Empty> deleteSipTrunkSettings;
  private final PagedCallSettings<
          ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>
      listSipTrunksSettings;
  private final UnaryCallSettings<GetSipTrunkRequest, SipTrunk> getSipTrunkSettings;
  private final UnaryCallSettings<UpdateSipTrunkRequest, SipTrunk> updateSipTrunkSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<ListSipTrunksRequest, ListSipTrunksResponse, SipTrunk>
      LIST_SIP_TRUNKS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSipTrunksRequest, ListSipTrunksResponse, SipTrunk>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSipTrunksRequest injectToken(ListSipTrunksRequest payload, String token) {
              return ListSipTrunksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSipTrunksRequest injectPageSize(ListSipTrunksRequest payload, int pageSize) {
              return ListSipTrunksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSipTrunksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSipTrunksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SipTrunk> extractResources(ListSipTrunksResponse payload) {
              return payload.getSipTrunksList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>
      LIST_SIP_TRUNKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>() {
            @Override
            public ApiFuture<ListSipTrunksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSipTrunksRequest, ListSipTrunksResponse> callable,
                ListSipTrunksRequest request,
                ApiCallContext context,
                ApiFuture<ListSipTrunksResponse> futureResponse) {
              PageContext<ListSipTrunksRequest, ListSipTrunksResponse, SipTrunk> pageContext =
                  PageContext.create(callable, LIST_SIP_TRUNKS_PAGE_STR_DESC, request, context);
              return ListSipTrunksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createSipTrunk. */
  public UnaryCallSettings<CreateSipTrunkRequest, SipTrunk> createSipTrunkSettings() {
    return createSipTrunkSettings;
  }

  /** Returns the object with the settings used for calls to deleteSipTrunk. */
  public UnaryCallSettings<DeleteSipTrunkRequest, Empty> deleteSipTrunkSettings() {
    return deleteSipTrunkSettings;
  }

  /** Returns the object with the settings used for calls to listSipTrunks. */
  public PagedCallSettings<ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>
      listSipTrunksSettings() {
    return listSipTrunksSettings;
  }

  /** Returns the object with the settings used for calls to getSipTrunk. */
  public UnaryCallSettings<GetSipTrunkRequest, SipTrunk> getSipTrunkSettings() {
    return getSipTrunkSettings;
  }

  /** Returns the object with the settings used for calls to updateSipTrunk. */
  public UnaryCallSettings<UpdateSipTrunkRequest, SipTrunk> updateSipTrunkSettings() {
    return updateSipTrunkSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  public SipTrunksStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSipTrunksStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSipTrunksStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "dialogflow";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "dialogflow.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dialogflow.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(SipTrunksStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(SipTrunksStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SipTrunksStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected SipTrunksStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createSipTrunkSettings = settingsBuilder.createSipTrunkSettings().build();
    deleteSipTrunkSettings = settingsBuilder.deleteSipTrunkSettings().build();
    listSipTrunksSettings = settingsBuilder.listSipTrunksSettings().build();
    getSipTrunkSettings = settingsBuilder.getSipTrunkSettings().build();
    updateSipTrunkSettings = settingsBuilder.updateSipTrunkSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for SipTrunksStubSettings. */
  public static class Builder extends StubSettings.Builder<SipTrunksStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateSipTrunkRequest, SipTrunk> createSipTrunkSettings;
    private final UnaryCallSettings.Builder<DeleteSipTrunkRequest, Empty> deleteSipTrunkSettings;
    private final PagedCallSettings.Builder<
            ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>
        listSipTrunksSettings;
    private final UnaryCallSettings.Builder<GetSipTrunkRequest, SipTrunk> getSipTrunkSettings;
    private final UnaryCallSettings.Builder<UpdateSipTrunkRequest, SipTrunk> updateSipTrunkSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createSipTrunkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteSipTrunkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSipTrunksSettings = PagedCallSettings.newBuilder(LIST_SIP_TRUNKS_PAGE_STR_FACT);
      getSipTrunkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSipTrunkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSipTrunkSettings,
              deleteSipTrunkSettings,
              listSipTrunksSettings,
              getSipTrunkSettings,
              updateSipTrunkSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(SipTrunksStubSettings settings) {
      super(settings);

      createSipTrunkSettings = settings.createSipTrunkSettings.toBuilder();
      deleteSipTrunkSettings = settings.deleteSipTrunkSettings.toBuilder();
      listSipTrunksSettings = settings.listSipTrunksSettings.toBuilder();
      getSipTrunkSettings = settings.getSipTrunkSettings.toBuilder();
      updateSipTrunkSettings = settings.updateSipTrunkSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSipTrunkSettings,
              deleteSipTrunkSettings,
              listSipTrunksSettings,
              getSipTrunkSettings,
              updateSipTrunkSettings,
              listLocationsSettings,
              getLocationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createSipTrunkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteSipTrunkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listSipTrunksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getSipTrunkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateSipTrunkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createSipTrunk. */
    public UnaryCallSettings.Builder<CreateSipTrunkRequest, SipTrunk> createSipTrunkSettings() {
      return createSipTrunkSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSipTrunk. */
    public UnaryCallSettings.Builder<DeleteSipTrunkRequest, Empty> deleteSipTrunkSettings() {
      return deleteSipTrunkSettings;
    }

    /** Returns the builder for the settings used for calls to listSipTrunks. */
    public PagedCallSettings.Builder<
            ListSipTrunksRequest, ListSipTrunksResponse, ListSipTrunksPagedResponse>
        listSipTrunksSettings() {
      return listSipTrunksSettings;
    }

    /** Returns the builder for the settings used for calls to getSipTrunk. */
    public UnaryCallSettings.Builder<GetSipTrunkRequest, SipTrunk> getSipTrunkSettings() {
      return getSipTrunkSettings;
    }

    /** Returns the builder for the settings used for calls to updateSipTrunk. */
    public UnaryCallSettings.Builder<UpdateSipTrunkRequest, SipTrunk> updateSipTrunkSettings() {
      return updateSipTrunkSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    @Override
    public SipTrunksStubSettings build() throws IOException {
      return new SipTrunksStubSettings(this);
    }
  }
}
