/*
 * Copyright 2024 Google LLC
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

import static com.google.cloud.dialogflow.v2beta1.ConversationProfilesClient.ListConversationProfilesPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.ConversationProfilesClient.ListLocationsPagedResponse;

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
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.ClearSuggestionFeatureConfigOperationMetadata;
import com.google.cloud.dialogflow.v2beta1.ClearSuggestionFeatureConfigRequest;
import com.google.cloud.dialogflow.v2beta1.ConversationProfile;
import com.google.cloud.dialogflow.v2beta1.CreateConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.GetConversationProfileRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesRequest;
import com.google.cloud.dialogflow.v2beta1.ListConversationProfilesResponse;
import com.google.cloud.dialogflow.v2beta1.SetSuggestionFeatureConfigOperationMetadata;
import com.google.cloud.dialogflow.v2beta1.SetSuggestionFeatureConfigRequest;
import com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ConversationProfilesStub}.
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
 * of getConversationProfile:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ConversationProfilesStubSettings.Builder conversationProfilesSettingsBuilder =
 *     ConversationProfilesStubSettings.newBuilder();
 * conversationProfilesSettingsBuilder
 *     .getConversationProfileSettings()
 *     .setRetrySettings(
 *         conversationProfilesSettingsBuilder
 *             .getConversationProfileSettings()
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
 * ConversationProfilesStubSettings conversationProfilesSettings =
 *     conversationProfilesSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for setSuggestionFeatureConfig:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ConversationProfilesStubSettings.Builder conversationProfilesSettingsBuilder =
 *     ConversationProfilesStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * conversationProfilesSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ConversationProfilesStubSettings
    extends StubSettings<ConversationProfilesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListConversationProfilesRequest,
          ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      listConversationProfilesSettings;
  private final UnaryCallSettings<GetConversationProfileRequest, ConversationProfile>
      getConversationProfileSettings;
  private final UnaryCallSettings<CreateConversationProfileRequest, ConversationProfile>
      createConversationProfileSettings;
  private final UnaryCallSettings<UpdateConversationProfileRequest, ConversationProfile>
      updateConversationProfileSettings;
  private final UnaryCallSettings<DeleteConversationProfileRequest, Empty>
      deleteConversationProfileSettings;
  private final UnaryCallSettings<SetSuggestionFeatureConfigRequest, Operation>
      setSuggestionFeatureConfigSettings;
  private final OperationCallSettings<
          SetSuggestionFeatureConfigRequest,
          ConversationProfile,
          SetSuggestionFeatureConfigOperationMetadata>
      setSuggestionFeatureConfigOperationSettings;
  private final UnaryCallSettings<ClearSuggestionFeatureConfigRequest, Operation>
      clearSuggestionFeatureConfigSettings;
  private final OperationCallSettings<
          ClearSuggestionFeatureConfigRequest,
          ConversationProfile,
          ClearSuggestionFeatureConfigOperationMetadata>
      clearSuggestionFeatureConfigOperationSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          ListConversationProfilesRequest, ListConversationProfilesResponse, ConversationProfile>
      LIST_CONVERSATION_PROFILES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListConversationProfilesRequest,
              ListConversationProfilesResponse,
              ConversationProfile>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConversationProfilesRequest injectToken(
                ListConversationProfilesRequest payload, String token) {
              return ListConversationProfilesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListConversationProfilesRequest injectPageSize(
                ListConversationProfilesRequest payload, int pageSize) {
              return ListConversationProfilesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListConversationProfilesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConversationProfilesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ConversationProfile> extractResources(
                ListConversationProfilesResponse payload) {
              return payload.getConversationProfilesList();
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
          ListConversationProfilesRequest,
          ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      LIST_CONVERSATION_PROFILES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConversationProfilesRequest,
              ListConversationProfilesResponse,
              ListConversationProfilesPagedResponse>() {
            @Override
            public ApiFuture<ListConversationProfilesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConversationProfilesRequest, ListConversationProfilesResponse>
                    callable,
                ListConversationProfilesRequest request,
                ApiCallContext context,
                ApiFuture<ListConversationProfilesResponse> futureResponse) {
              PageContext<
                      ListConversationProfilesRequest,
                      ListConversationProfilesResponse,
                      ConversationProfile>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONVERSATION_PROFILES_PAGE_STR_DESC, request, context);
              return ListConversationProfilesPagedResponse.createAsync(pageContext, futureResponse);
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

  /** Returns the object with the settings used for calls to listConversationProfiles. */
  public PagedCallSettings<
          ListConversationProfilesRequest,
          ListConversationProfilesResponse,
          ListConversationProfilesPagedResponse>
      listConversationProfilesSettings() {
    return listConversationProfilesSettings;
  }

  /** Returns the object with the settings used for calls to getConversationProfile. */
  public UnaryCallSettings<GetConversationProfileRequest, ConversationProfile>
      getConversationProfileSettings() {
    return getConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to createConversationProfile. */
  public UnaryCallSettings<CreateConversationProfileRequest, ConversationProfile>
      createConversationProfileSettings() {
    return createConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to updateConversationProfile. */
  public UnaryCallSettings<UpdateConversationProfileRequest, ConversationProfile>
      updateConversationProfileSettings() {
    return updateConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to deleteConversationProfile. */
  public UnaryCallSettings<DeleteConversationProfileRequest, Empty>
      deleteConversationProfileSettings() {
    return deleteConversationProfileSettings;
  }

  /** Returns the object with the settings used for calls to setSuggestionFeatureConfig. */
  public UnaryCallSettings<SetSuggestionFeatureConfigRequest, Operation>
      setSuggestionFeatureConfigSettings() {
    return setSuggestionFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to setSuggestionFeatureConfig. */
  public OperationCallSettings<
          SetSuggestionFeatureConfigRequest,
          ConversationProfile,
          SetSuggestionFeatureConfigOperationMetadata>
      setSuggestionFeatureConfigOperationSettings() {
    return setSuggestionFeatureConfigOperationSettings;
  }

  /** Returns the object with the settings used for calls to clearSuggestionFeatureConfig. */
  public UnaryCallSettings<ClearSuggestionFeatureConfigRequest, Operation>
      clearSuggestionFeatureConfigSettings() {
    return clearSuggestionFeatureConfigSettings;
  }

  /** Returns the object with the settings used for calls to clearSuggestionFeatureConfig. */
  public OperationCallSettings<
          ClearSuggestionFeatureConfigRequest,
          ConversationProfile,
          ClearSuggestionFeatureConfigOperationMetadata>
      clearSuggestionFeatureConfigOperationSettings() {
    return clearSuggestionFeatureConfigOperationSettings;
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

  public ConversationProfilesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcConversationProfilesStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonConversationProfilesStub.create(this);
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
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ConversationProfilesStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ConversationProfilesStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ConversationProfilesStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected ConversationProfilesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listConversationProfilesSettings = settingsBuilder.listConversationProfilesSettings().build();
    getConversationProfileSettings = settingsBuilder.getConversationProfileSettings().build();
    createConversationProfileSettings = settingsBuilder.createConversationProfileSettings().build();
    updateConversationProfileSettings = settingsBuilder.updateConversationProfileSettings().build();
    deleteConversationProfileSettings = settingsBuilder.deleteConversationProfileSettings().build();
    setSuggestionFeatureConfigSettings =
        settingsBuilder.setSuggestionFeatureConfigSettings().build();
    setSuggestionFeatureConfigOperationSettings =
        settingsBuilder.setSuggestionFeatureConfigOperationSettings().build();
    clearSuggestionFeatureConfigSettings =
        settingsBuilder.clearSuggestionFeatureConfigSettings().build();
    clearSuggestionFeatureConfigOperationSettings =
        settingsBuilder.clearSuggestionFeatureConfigOperationSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for ConversationProfilesStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ConversationProfilesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListConversationProfilesRequest,
            ListConversationProfilesResponse,
            ListConversationProfilesPagedResponse>
        listConversationProfilesSettings;
    private final UnaryCallSettings.Builder<GetConversationProfileRequest, ConversationProfile>
        getConversationProfileSettings;
    private final UnaryCallSettings.Builder<CreateConversationProfileRequest, ConversationProfile>
        createConversationProfileSettings;
    private final UnaryCallSettings.Builder<UpdateConversationProfileRequest, ConversationProfile>
        updateConversationProfileSettings;
    private final UnaryCallSettings.Builder<DeleteConversationProfileRequest, Empty>
        deleteConversationProfileSettings;
    private final UnaryCallSettings.Builder<SetSuggestionFeatureConfigRequest, Operation>
        setSuggestionFeatureConfigSettings;
    private final OperationCallSettings.Builder<
            SetSuggestionFeatureConfigRequest,
            ConversationProfile,
            SetSuggestionFeatureConfigOperationMetadata>
        setSuggestionFeatureConfigOperationSettings;
    private final UnaryCallSettings.Builder<ClearSuggestionFeatureConfigRequest, Operation>
        clearSuggestionFeatureConfigSettings;
    private final OperationCallSettings.Builder<
            ClearSuggestionFeatureConfigRequest,
            ConversationProfile,
            ClearSuggestionFeatureConfigOperationMetadata>
        clearSuggestionFeatureConfigOperationSettings;
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

      listConversationProfilesSettings =
          PagedCallSettings.newBuilder(LIST_CONVERSATION_PROFILES_PAGE_STR_FACT);
      getConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteConversationProfileSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSuggestionFeatureConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSuggestionFeatureConfigOperationSettings = OperationCallSettings.newBuilder();
      clearSuggestionFeatureConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      clearSuggestionFeatureConfigOperationSettings = OperationCallSettings.newBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConversationProfilesSettings,
              getConversationProfileSettings,
              createConversationProfileSettings,
              updateConversationProfileSettings,
              deleteConversationProfileSettings,
              setSuggestionFeatureConfigSettings,
              clearSuggestionFeatureConfigSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(ConversationProfilesStubSettings settings) {
      super(settings);

      listConversationProfilesSettings = settings.listConversationProfilesSettings.toBuilder();
      getConversationProfileSettings = settings.getConversationProfileSettings.toBuilder();
      createConversationProfileSettings = settings.createConversationProfileSettings.toBuilder();
      updateConversationProfileSettings = settings.updateConversationProfileSettings.toBuilder();
      deleteConversationProfileSettings = settings.deleteConversationProfileSettings.toBuilder();
      setSuggestionFeatureConfigSettings = settings.setSuggestionFeatureConfigSettings.toBuilder();
      setSuggestionFeatureConfigOperationSettings =
          settings.setSuggestionFeatureConfigOperationSettings.toBuilder();
      clearSuggestionFeatureConfigSettings =
          settings.clearSuggestionFeatureConfigSettings.toBuilder();
      clearSuggestionFeatureConfigOperationSettings =
          settings.clearSuggestionFeatureConfigOperationSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConversationProfilesSettings,
              getConversationProfileSettings,
              createConversationProfileSettings,
              updateConversationProfileSettings,
              deleteConversationProfileSettings,
              setSuggestionFeatureConfigSettings,
              clearSuggestionFeatureConfigSettings,
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
          .listConversationProfilesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteConversationProfileSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setSuggestionFeatureConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .clearSuggestionFeatureConfigSettings()
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

      builder
          .setSuggestionFeatureConfigOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetSuggestionFeatureConfigRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConversationProfile.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  SetSuggestionFeatureConfigOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .clearSuggestionFeatureConfigOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ClearSuggestionFeatureConfigRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConversationProfile.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ClearSuggestionFeatureConfigOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to listConversationProfiles. */
    public PagedCallSettings.Builder<
            ListConversationProfilesRequest,
            ListConversationProfilesResponse,
            ListConversationProfilesPagedResponse>
        listConversationProfilesSettings() {
      return listConversationProfilesSettings;
    }

    /** Returns the builder for the settings used for calls to getConversationProfile. */
    public UnaryCallSettings.Builder<GetConversationProfileRequest, ConversationProfile>
        getConversationProfileSettings() {
      return getConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to createConversationProfile. */
    public UnaryCallSettings.Builder<CreateConversationProfileRequest, ConversationProfile>
        createConversationProfileSettings() {
      return createConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to updateConversationProfile. */
    public UnaryCallSettings.Builder<UpdateConversationProfileRequest, ConversationProfile>
        updateConversationProfileSettings() {
      return updateConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConversationProfile. */
    public UnaryCallSettings.Builder<DeleteConversationProfileRequest, Empty>
        deleteConversationProfileSettings() {
      return deleteConversationProfileSettings;
    }

    /** Returns the builder for the settings used for calls to setSuggestionFeatureConfig. */
    public UnaryCallSettings.Builder<SetSuggestionFeatureConfigRequest, Operation>
        setSuggestionFeatureConfigSettings() {
      return setSuggestionFeatureConfigSettings;
    }

    /** Returns the builder for the settings used for calls to setSuggestionFeatureConfig. */
    public OperationCallSettings.Builder<
            SetSuggestionFeatureConfigRequest,
            ConversationProfile,
            SetSuggestionFeatureConfigOperationMetadata>
        setSuggestionFeatureConfigOperationSettings() {
      return setSuggestionFeatureConfigOperationSettings;
    }

    /** Returns the builder for the settings used for calls to clearSuggestionFeatureConfig. */
    public UnaryCallSettings.Builder<ClearSuggestionFeatureConfigRequest, Operation>
        clearSuggestionFeatureConfigSettings() {
      return clearSuggestionFeatureConfigSettings;
    }

    /** Returns the builder for the settings used for calls to clearSuggestionFeatureConfig. */
    public OperationCallSettings.Builder<
            ClearSuggestionFeatureConfigRequest,
            ConversationProfile,
            ClearSuggestionFeatureConfigOperationMetadata>
        clearSuggestionFeatureConfigOperationSettings() {
      return clearSuggestionFeatureConfigOperationSettings;
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
    public ConversationProfilesStubSettings build() throws IOException {
      return new ConversationProfilesStubSettings(this);
    }
  }
}
