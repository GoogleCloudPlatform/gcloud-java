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

package com.google.cloud.discoveryengine.v1beta;

import static com.google.cloud.discoveryengine.v1beta.EvaluationServiceClient.ListEvaluationResultsPagedResponse;
import static com.google.cloud.discoveryengine.v1beta.EvaluationServiceClient.ListEvaluationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.discoveryengine.v1beta.stub.EvaluationServiceStubSettings;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EvaluationServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (discoveryengine.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getEvaluation:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EvaluationServiceSettings.Builder evaluationServiceSettingsBuilder =
 *     EvaluationServiceSettings.newBuilder();
 * evaluationServiceSettingsBuilder
 *     .getEvaluationSettings()
 *     .setRetrySettings(
 *         evaluationServiceSettingsBuilder
 *             .getEvaluationSettings()
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
 * EvaluationServiceSettings evaluationServiceSettings = evaluationServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createEvaluation:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EvaluationServiceSettings.Builder evaluationServiceSettingsBuilder =
 *     EvaluationServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * evaluationServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class EvaluationServiceSettings extends ClientSettings<EvaluationServiceSettings> {

  /** Returns the object with the settings used for calls to getEvaluation. */
  public UnaryCallSettings<GetEvaluationRequest, Evaluation> getEvaluationSettings() {
    return ((EvaluationServiceStubSettings) getStubSettings()).getEvaluationSettings();
  }

  /** Returns the object with the settings used for calls to listEvaluations. */
  public PagedCallSettings<
          ListEvaluationsRequest, ListEvaluationsResponse, ListEvaluationsPagedResponse>
      listEvaluationsSettings() {
    return ((EvaluationServiceStubSettings) getStubSettings()).listEvaluationsSettings();
  }

  /** Returns the object with the settings used for calls to createEvaluation. */
  public UnaryCallSettings<CreateEvaluationRequest, Operation> createEvaluationSettings() {
    return ((EvaluationServiceStubSettings) getStubSettings()).createEvaluationSettings();
  }

  /** Returns the object with the settings used for calls to createEvaluation. */
  public OperationCallSettings<CreateEvaluationRequest, Evaluation, CreateEvaluationMetadata>
      createEvaluationOperationSettings() {
    return ((EvaluationServiceStubSettings) getStubSettings()).createEvaluationOperationSettings();
  }

  /** Returns the object with the settings used for calls to listEvaluationResults. */
  public PagedCallSettings<
          ListEvaluationResultsRequest,
          ListEvaluationResultsResponse,
          ListEvaluationResultsPagedResponse>
      listEvaluationResultsSettings() {
    return ((EvaluationServiceStubSettings) getStubSettings()).listEvaluationResultsSettings();
  }

  public static final EvaluationServiceSettings create(EvaluationServiceStubSettings stub)
      throws IOException {
    return new EvaluationServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return EvaluationServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return EvaluationServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return EvaluationServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return EvaluationServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return EvaluationServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return EvaluationServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return EvaluationServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EvaluationServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected EvaluationServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for EvaluationServiceSettings. */
  public static class Builder extends ClientSettings.Builder<EvaluationServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(EvaluationServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(EvaluationServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(EvaluationServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(EvaluationServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(EvaluationServiceStubSettings.newHttpJsonBuilder());
    }

    public EvaluationServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((EvaluationServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to getEvaluation. */
    public UnaryCallSettings.Builder<GetEvaluationRequest, Evaluation> getEvaluationSettings() {
      return getStubSettingsBuilder().getEvaluationSettings();
    }

    /** Returns the builder for the settings used for calls to listEvaluations. */
    public PagedCallSettings.Builder<
            ListEvaluationsRequest, ListEvaluationsResponse, ListEvaluationsPagedResponse>
        listEvaluationsSettings() {
      return getStubSettingsBuilder().listEvaluationsSettings();
    }

    /** Returns the builder for the settings used for calls to createEvaluation. */
    public UnaryCallSettings.Builder<CreateEvaluationRequest, Operation>
        createEvaluationSettings() {
      return getStubSettingsBuilder().createEvaluationSettings();
    }

    /** Returns the builder for the settings used for calls to createEvaluation. */
    public OperationCallSettings.Builder<
            CreateEvaluationRequest, Evaluation, CreateEvaluationMetadata>
        createEvaluationOperationSettings() {
      return getStubSettingsBuilder().createEvaluationOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listEvaluationResults. */
    public PagedCallSettings.Builder<
            ListEvaluationResultsRequest,
            ListEvaluationResultsResponse,
            ListEvaluationResultsPagedResponse>
        listEvaluationResultsSettings() {
      return getStubSettingsBuilder().listEvaluationResultsSettings();
    }

    @Override
    public EvaluationServiceSettings build() throws IOException {
      return new EvaluationServiceSettings(this);
    }
  }
}
