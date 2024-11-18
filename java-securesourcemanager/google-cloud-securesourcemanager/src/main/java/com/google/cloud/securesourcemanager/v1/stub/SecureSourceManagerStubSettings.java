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

package com.google.cloud.securesourcemanager.v1.stub;

import static com.google.cloud.securesourcemanager.v1.SecureSourceManagerClient.ListBranchRulesPagedResponse;
import static com.google.cloud.securesourcemanager.v1.SecureSourceManagerClient.ListInstancesPagedResponse;
import static com.google.cloud.securesourcemanager.v1.SecureSourceManagerClient.ListLocationsPagedResponse;
import static com.google.cloud.securesourcemanager.v1.SecureSourceManagerClient.ListRepositoriesPagedResponse;

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
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.securesourcemanager.v1.BranchRule;
import com.google.cloud.securesourcemanager.v1.CreateBranchRuleRequest;
import com.google.cloud.securesourcemanager.v1.CreateInstanceRequest;
import com.google.cloud.securesourcemanager.v1.CreateRepositoryRequest;
import com.google.cloud.securesourcemanager.v1.DeleteBranchRuleRequest;
import com.google.cloud.securesourcemanager.v1.DeleteInstanceRequest;
import com.google.cloud.securesourcemanager.v1.DeleteRepositoryRequest;
import com.google.cloud.securesourcemanager.v1.GetBranchRuleRequest;
import com.google.cloud.securesourcemanager.v1.GetInstanceRequest;
import com.google.cloud.securesourcemanager.v1.GetRepositoryRequest;
import com.google.cloud.securesourcemanager.v1.Instance;
import com.google.cloud.securesourcemanager.v1.ListBranchRulesRequest;
import com.google.cloud.securesourcemanager.v1.ListBranchRulesResponse;
import com.google.cloud.securesourcemanager.v1.ListInstancesRequest;
import com.google.cloud.securesourcemanager.v1.ListInstancesResponse;
import com.google.cloud.securesourcemanager.v1.ListRepositoriesRequest;
import com.google.cloud.securesourcemanager.v1.ListRepositoriesResponse;
import com.google.cloud.securesourcemanager.v1.OperationMetadata;
import com.google.cloud.securesourcemanager.v1.Repository;
import com.google.cloud.securesourcemanager.v1.UpdateBranchRuleRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link SecureSourceManagerStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (securesourcemanager.googleapis.com) and default port (443) are
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
 * of getInstance:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecureSourceManagerStubSettings.Builder secureSourceManagerSettingsBuilder =
 *     SecureSourceManagerStubSettings.newBuilder();
 * secureSourceManagerSettingsBuilder
 *     .getInstanceSettings()
 *     .setRetrySettings(
 *         secureSourceManagerSettingsBuilder
 *             .getInstanceSettings()
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
 * SecureSourceManagerStubSettings secureSourceManagerSettings =
 *     secureSourceManagerSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createInstance:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecureSourceManagerStubSettings.Builder secureSourceManagerSettingsBuilder =
 *     SecureSourceManagerStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * secureSourceManagerSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class SecureSourceManagerStubSettings extends StubSettings<SecureSourceManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings;
  private final UnaryCallSettings<GetInstanceRequest, Instance> getInstanceSettings;
  private final UnaryCallSettings<CreateInstanceRequest, Operation> createInstanceSettings;
  private final OperationCallSettings<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationSettings;
  private final UnaryCallSettings<DeleteInstanceRequest, Operation> deleteInstanceSettings;
  private final OperationCallSettings<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationSettings;
  private final PagedCallSettings<
          ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>
      listRepositoriesSettings;
  private final UnaryCallSettings<GetRepositoryRequest, Repository> getRepositorySettings;
  private final UnaryCallSettings<CreateRepositoryRequest, Operation> createRepositorySettings;
  private final OperationCallSettings<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationSettings;
  private final UnaryCallSettings<DeleteRepositoryRequest, Operation> deleteRepositorySettings;
  private final OperationCallSettings<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationSettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicyRepoSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicyRepoSettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsRepoSettings;
  private final UnaryCallSettings<CreateBranchRuleRequest, Operation> createBranchRuleSettings;
  private final OperationCallSettings<CreateBranchRuleRequest, BranchRule, OperationMetadata>
      createBranchRuleOperationSettings;
  private final PagedCallSettings<
          ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>
      listBranchRulesSettings;
  private final UnaryCallSettings<GetBranchRuleRequest, BranchRule> getBranchRuleSettings;
  private final UnaryCallSettings<UpdateBranchRuleRequest, Operation> updateBranchRuleSettings;
  private final OperationCallSettings<UpdateBranchRuleRequest, BranchRule, OperationMetadata>
      updateBranchRuleOperationSettings;
  private final UnaryCallSettings<DeleteBranchRuleRequest, Operation> deleteBranchRuleSettings;
  private final OperationCallSettings<DeleteBranchRuleRequest, Empty, OperationMetadata>
      deleteBranchRuleOperationSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<ListInstancesRequest, ListInstancesResponse, Instance>
      LIST_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<ListInstancesRequest, ListInstancesResponse, Instance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstancesRequest injectToken(ListInstancesRequest payload, String token) {
              return ListInstancesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInstancesRequest injectPageSize(ListInstancesRequest payload, int pageSize) {
              return ListInstancesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInstancesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Instance> extractResources(ListInstancesResponse payload) {
              return payload.getInstancesList();
            }
          };

  private static final PagedListDescriptor<
          ListRepositoriesRequest, ListRepositoriesResponse, Repository>
      LIST_REPOSITORIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListRepositoriesRequest, ListRepositoriesResponse, Repository>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRepositoriesRequest injectToken(
                ListRepositoriesRequest payload, String token) {
              return ListRepositoriesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListRepositoriesRequest injectPageSize(
                ListRepositoriesRequest payload, int pageSize) {
              return ListRepositoriesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListRepositoriesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRepositoriesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Repository> extractResources(ListRepositoriesResponse payload) {
              return payload.getRepositoriesList();
            }
          };

  private static final PagedListDescriptor<
          ListBranchRulesRequest, ListBranchRulesResponse, BranchRule>
      LIST_BRANCH_RULES_PAGE_STR_DESC =
          new PagedListDescriptor<ListBranchRulesRequest, ListBranchRulesResponse, BranchRule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListBranchRulesRequest injectToken(
                ListBranchRulesRequest payload, String token) {
              return ListBranchRulesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListBranchRulesRequest injectPageSize(
                ListBranchRulesRequest payload, int pageSize) {
              return ListBranchRulesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListBranchRulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListBranchRulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<BranchRule> extractResources(ListBranchRulesResponse payload) {
              return payload.getBranchRulesList();
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
          ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      LIST_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstancesRequest, ListInstancesResponse> callable,
                ListInstancesRequest request,
                ApiCallContext context,
                ApiFuture<ListInstancesResponse> futureResponse) {
              PageContext<ListInstancesRequest, ListInstancesResponse, Instance> pageContext =
                  PageContext.create(callable, LIST_INSTANCES_PAGE_STR_DESC, request, context);
              return ListInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>
      LIST_REPOSITORIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>() {
            @Override
            public ApiFuture<ListRepositoriesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse> callable,
                ListRepositoriesRequest request,
                ApiCallContext context,
                ApiFuture<ListRepositoriesResponse> futureResponse) {
              PageContext<ListRepositoriesRequest, ListRepositoriesResponse, Repository>
                  pageContext =
                      PageContext.create(
                          callable, LIST_REPOSITORIES_PAGE_STR_DESC, request, context);
              return ListRepositoriesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>
      LIST_BRANCH_RULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>() {
            @Override
            public ApiFuture<ListBranchRulesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListBranchRulesRequest, ListBranchRulesResponse> callable,
                ListBranchRulesRequest request,
                ApiCallContext context,
                ApiFuture<ListBranchRulesResponse> futureResponse) {
              PageContext<ListBranchRulesRequest, ListBranchRulesResponse, BranchRule> pageContext =
                  PageContext.create(callable, LIST_BRANCH_RULES_PAGE_STR_DESC, request, context);
              return ListBranchRulesPagedResponse.createAsync(pageContext, futureResponse);
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

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings() {
    return listInstancesSettings;
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public UnaryCallSettings<GetInstanceRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public UnaryCallSettings<CreateInstanceRequest, Operation> createInstanceSettings() {
    return createInstanceSettings;
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public OperationCallSettings<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationSettings() {
    return createInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public UnaryCallSettings<DeleteInstanceRequest, Operation> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public OperationCallSettings<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationSettings() {
    return deleteInstanceOperationSettings;
  }

  /** Returns the object with the settings used for calls to listRepositories. */
  public PagedCallSettings<
          ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>
      listRepositoriesSettings() {
    return listRepositoriesSettings;
  }

  /** Returns the object with the settings used for calls to getRepository. */
  public UnaryCallSettings<GetRepositoryRequest, Repository> getRepositorySettings() {
    return getRepositorySettings;
  }

  /** Returns the object with the settings used for calls to createRepository. */
  public UnaryCallSettings<CreateRepositoryRequest, Operation> createRepositorySettings() {
    return createRepositorySettings;
  }

  /** Returns the object with the settings used for calls to createRepository. */
  public OperationCallSettings<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationSettings() {
    return createRepositoryOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteRepository. */
  public UnaryCallSettings<DeleteRepositoryRequest, Operation> deleteRepositorySettings() {
    return deleteRepositorySettings;
  }

  /** Returns the object with the settings used for calls to deleteRepository. */
  public OperationCallSettings<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationSettings() {
    return deleteRepositoryOperationSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicyRepo. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicyRepoSettings() {
    return getIamPolicyRepoSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicyRepo. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicyRepoSettings() {
    return setIamPolicyRepoSettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissionsRepo. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsRepoSettings() {
    return testIamPermissionsRepoSettings;
  }

  /** Returns the object with the settings used for calls to createBranchRule. */
  public UnaryCallSettings<CreateBranchRuleRequest, Operation> createBranchRuleSettings() {
    return createBranchRuleSettings;
  }

  /** Returns the object with the settings used for calls to createBranchRule. */
  public OperationCallSettings<CreateBranchRuleRequest, BranchRule, OperationMetadata>
      createBranchRuleOperationSettings() {
    return createBranchRuleOperationSettings;
  }

  /** Returns the object with the settings used for calls to listBranchRules. */
  public PagedCallSettings<
          ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>
      listBranchRulesSettings() {
    return listBranchRulesSettings;
  }

  /** Returns the object with the settings used for calls to getBranchRule. */
  public UnaryCallSettings<GetBranchRuleRequest, BranchRule> getBranchRuleSettings() {
    return getBranchRuleSettings;
  }

  /** Returns the object with the settings used for calls to updateBranchRule. */
  public UnaryCallSettings<UpdateBranchRuleRequest, Operation> updateBranchRuleSettings() {
    return updateBranchRuleSettings;
  }

  /** Returns the object with the settings used for calls to updateBranchRule. */
  public OperationCallSettings<UpdateBranchRuleRequest, BranchRule, OperationMetadata>
      updateBranchRuleOperationSettings() {
    return updateBranchRuleOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteBranchRule. */
  public UnaryCallSettings<DeleteBranchRuleRequest, Operation> deleteBranchRuleSettings() {
    return deleteBranchRuleSettings;
  }

  /** Returns the object with the settings used for calls to deleteBranchRule. */
  public OperationCallSettings<DeleteBranchRuleRequest, Empty, OperationMetadata>
      deleteBranchRuleOperationSettings() {
    return deleteBranchRuleOperationSettings;
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

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public SecureSourceManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSecureSourceManagerStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSecureSourceManagerStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "securesourcemanager";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "securesourcemanager.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "securesourcemanager.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(SecureSourceManagerStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(SecureSourceManagerStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SecureSourceManagerStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected SecureSourceManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listInstancesSettings = settingsBuilder.listInstancesSettings().build();
    getInstanceSettings = settingsBuilder.getInstanceSettings().build();
    createInstanceSettings = settingsBuilder.createInstanceSettings().build();
    createInstanceOperationSettings = settingsBuilder.createInstanceOperationSettings().build();
    deleteInstanceSettings = settingsBuilder.deleteInstanceSettings().build();
    deleteInstanceOperationSettings = settingsBuilder.deleteInstanceOperationSettings().build();
    listRepositoriesSettings = settingsBuilder.listRepositoriesSettings().build();
    getRepositorySettings = settingsBuilder.getRepositorySettings().build();
    createRepositorySettings = settingsBuilder.createRepositorySettings().build();
    createRepositoryOperationSettings = settingsBuilder.createRepositoryOperationSettings().build();
    deleteRepositorySettings = settingsBuilder.deleteRepositorySettings().build();
    deleteRepositoryOperationSettings = settingsBuilder.deleteRepositoryOperationSettings().build();
    getIamPolicyRepoSettings = settingsBuilder.getIamPolicyRepoSettings().build();
    setIamPolicyRepoSettings = settingsBuilder.setIamPolicyRepoSettings().build();
    testIamPermissionsRepoSettings = settingsBuilder.testIamPermissionsRepoSettings().build();
    createBranchRuleSettings = settingsBuilder.createBranchRuleSettings().build();
    createBranchRuleOperationSettings = settingsBuilder.createBranchRuleOperationSettings().build();
    listBranchRulesSettings = settingsBuilder.listBranchRulesSettings().build();
    getBranchRuleSettings = settingsBuilder.getBranchRuleSettings().build();
    updateBranchRuleSettings = settingsBuilder.updateBranchRuleSettings().build();
    updateBranchRuleOperationSettings = settingsBuilder.updateBranchRuleOperationSettings().build();
    deleteBranchRuleSettings = settingsBuilder.deleteBranchRuleSettings().build();
    deleteBranchRuleOperationSettings = settingsBuilder.deleteBranchRuleOperationSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for SecureSourceManagerStubSettings. */
  public static class Builder
      extends StubSettings.Builder<SecureSourceManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings;
    private final UnaryCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings;
    private final UnaryCallSettings.Builder<CreateInstanceRequest, Operation>
        createInstanceSettings;
    private final OperationCallSettings.Builder<CreateInstanceRequest, Instance, OperationMetadata>
        createInstanceOperationSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceRequest, Operation>
        deleteInstanceSettings;
    private final OperationCallSettings.Builder<DeleteInstanceRequest, Empty, OperationMetadata>
        deleteInstanceOperationSettings;
    private final PagedCallSettings.Builder<
            ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>
        listRepositoriesSettings;
    private final UnaryCallSettings.Builder<GetRepositoryRequest, Repository> getRepositorySettings;
    private final UnaryCallSettings.Builder<CreateRepositoryRequest, Operation>
        createRepositorySettings;
    private final OperationCallSettings.Builder<
            CreateRepositoryRequest, Repository, OperationMetadata>
        createRepositoryOperationSettings;
    private final UnaryCallSettings.Builder<DeleteRepositoryRequest, Operation>
        deleteRepositorySettings;
    private final OperationCallSettings.Builder<DeleteRepositoryRequest, Empty, OperationMetadata>
        deleteRepositoryOperationSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicyRepoSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicyRepoSettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsRepoSettings;
    private final UnaryCallSettings.Builder<CreateBranchRuleRequest, Operation>
        createBranchRuleSettings;
    private final OperationCallSettings.Builder<
            CreateBranchRuleRequest, BranchRule, OperationMetadata>
        createBranchRuleOperationSettings;
    private final PagedCallSettings.Builder<
            ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>
        listBranchRulesSettings;
    private final UnaryCallSettings.Builder<GetBranchRuleRequest, BranchRule> getBranchRuleSettings;
    private final UnaryCallSettings.Builder<UpdateBranchRuleRequest, Operation>
        updateBranchRuleSettings;
    private final OperationCallSettings.Builder<
            UpdateBranchRuleRequest, BranchRule, OperationMetadata>
        updateBranchRuleOperationSettings;
    private final UnaryCallSettings.Builder<DeleteBranchRuleRequest, Operation>
        deleteBranchRuleSettings;
    private final OperationCallSettings.Builder<DeleteBranchRuleRequest, Empty, OperationMetadata>
        deleteBranchRuleOperationSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(10000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listInstancesSettings = PagedCallSettings.newBuilder(LIST_INSTANCES_PAGE_STR_FACT);
      getInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createInstanceOperationSettings = OperationCallSettings.newBuilder();
      deleteInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteInstanceOperationSettings = OperationCallSettings.newBuilder();
      listRepositoriesSettings = PagedCallSettings.newBuilder(LIST_REPOSITORIES_PAGE_STR_FACT);
      getRepositorySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRepositorySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRepositoryOperationSettings = OperationCallSettings.newBuilder();
      deleteRepositorySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteRepositoryOperationSettings = OperationCallSettings.newBuilder();
      getIamPolicyRepoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicyRepoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsRepoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createBranchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createBranchRuleOperationSettings = OperationCallSettings.newBuilder();
      listBranchRulesSettings = PagedCallSettings.newBuilder(LIST_BRANCH_RULES_PAGE_STR_FACT);
      getBranchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateBranchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateBranchRuleOperationSettings = OperationCallSettings.newBuilder();
      deleteBranchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteBranchRuleOperationSettings = OperationCallSettings.newBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listInstancesSettings,
              getInstanceSettings,
              createInstanceSettings,
              deleteInstanceSettings,
              listRepositoriesSettings,
              getRepositorySettings,
              createRepositorySettings,
              deleteRepositorySettings,
              getIamPolicyRepoSettings,
              setIamPolicyRepoSettings,
              testIamPermissionsRepoSettings,
              createBranchRuleSettings,
              listBranchRulesSettings,
              getBranchRuleSettings,
              updateBranchRuleSettings,
              deleteBranchRuleSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(SecureSourceManagerStubSettings settings) {
      super(settings);

      listInstancesSettings = settings.listInstancesSettings.toBuilder();
      getInstanceSettings = settings.getInstanceSettings.toBuilder();
      createInstanceSettings = settings.createInstanceSettings.toBuilder();
      createInstanceOperationSettings = settings.createInstanceOperationSettings.toBuilder();
      deleteInstanceSettings = settings.deleteInstanceSettings.toBuilder();
      deleteInstanceOperationSettings = settings.deleteInstanceOperationSettings.toBuilder();
      listRepositoriesSettings = settings.listRepositoriesSettings.toBuilder();
      getRepositorySettings = settings.getRepositorySettings.toBuilder();
      createRepositorySettings = settings.createRepositorySettings.toBuilder();
      createRepositoryOperationSettings = settings.createRepositoryOperationSettings.toBuilder();
      deleteRepositorySettings = settings.deleteRepositorySettings.toBuilder();
      deleteRepositoryOperationSettings = settings.deleteRepositoryOperationSettings.toBuilder();
      getIamPolicyRepoSettings = settings.getIamPolicyRepoSettings.toBuilder();
      setIamPolicyRepoSettings = settings.setIamPolicyRepoSettings.toBuilder();
      testIamPermissionsRepoSettings = settings.testIamPermissionsRepoSettings.toBuilder();
      createBranchRuleSettings = settings.createBranchRuleSettings.toBuilder();
      createBranchRuleOperationSettings = settings.createBranchRuleOperationSettings.toBuilder();
      listBranchRulesSettings = settings.listBranchRulesSettings.toBuilder();
      getBranchRuleSettings = settings.getBranchRuleSettings.toBuilder();
      updateBranchRuleSettings = settings.updateBranchRuleSettings.toBuilder();
      updateBranchRuleOperationSettings = settings.updateBranchRuleOperationSettings.toBuilder();
      deleteBranchRuleSettings = settings.deleteBranchRuleSettings.toBuilder();
      deleteBranchRuleOperationSettings = settings.deleteBranchRuleOperationSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listInstancesSettings,
              getInstanceSettings,
              createInstanceSettings,
              deleteInstanceSettings,
              listRepositoriesSettings,
              getRepositorySettings,
              createRepositorySettings,
              deleteRepositorySettings,
              getIamPolicyRepoSettings,
              setIamPolicyRepoSettings,
              testIamPermissionsRepoSettings,
              createBranchRuleSettings,
              listBranchRulesSettings,
              getBranchRuleSettings,
              updateBranchRuleSettings,
              deleteBranchRuleSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
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
          .listInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listRepositoriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getRepositorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createRepositorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteRepositorySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getIamPolicyRepoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setIamPolicyRepoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .testIamPermissionsRepoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createBranchRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listBranchRulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getBranchRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateBranchRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteBranchRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateInstanceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Instance.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .deleteInstanceOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteInstanceRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .createRepositoryOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateRepositoryRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Repository.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .deleteRepositoryOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteRepositoryRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .createBranchRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateBranchRuleRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(BranchRule.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .updateBranchRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateBranchRuleRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(BranchRule.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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
          .deleteBranchRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteBranchRuleRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
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

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings() {
      return listInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public UnaryCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public UnaryCallSettings.Builder<CreateInstanceRequest, Operation> createInstanceSettings() {
      return createInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public OperationCallSettings.Builder<CreateInstanceRequest, Instance, OperationMetadata>
        createInstanceOperationSettings() {
      return createInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public UnaryCallSettings.Builder<DeleteInstanceRequest, Operation> deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public OperationCallSettings.Builder<DeleteInstanceRequest, Empty, OperationMetadata>
        deleteInstanceOperationSettings() {
      return deleteInstanceOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listRepositories. */
    public PagedCallSettings.Builder<
            ListRepositoriesRequest, ListRepositoriesResponse, ListRepositoriesPagedResponse>
        listRepositoriesSettings() {
      return listRepositoriesSettings;
    }

    /** Returns the builder for the settings used for calls to getRepository. */
    public UnaryCallSettings.Builder<GetRepositoryRequest, Repository> getRepositorySettings() {
      return getRepositorySettings;
    }

    /** Returns the builder for the settings used for calls to createRepository. */
    public UnaryCallSettings.Builder<CreateRepositoryRequest, Operation>
        createRepositorySettings() {
      return createRepositorySettings;
    }

    /** Returns the builder for the settings used for calls to createRepository. */
    public OperationCallSettings.Builder<CreateRepositoryRequest, Repository, OperationMetadata>
        createRepositoryOperationSettings() {
      return createRepositoryOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRepository. */
    public UnaryCallSettings.Builder<DeleteRepositoryRequest, Operation>
        deleteRepositorySettings() {
      return deleteRepositorySettings;
    }

    /** Returns the builder for the settings used for calls to deleteRepository. */
    public OperationCallSettings.Builder<DeleteRepositoryRequest, Empty, OperationMetadata>
        deleteRepositoryOperationSettings() {
      return deleteRepositoryOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicyRepo. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicyRepoSettings() {
      return getIamPolicyRepoSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicyRepo. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicyRepoSettings() {
      return setIamPolicyRepoSettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissionsRepo. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsRepoSettings() {
      return testIamPermissionsRepoSettings;
    }

    /** Returns the builder for the settings used for calls to createBranchRule. */
    public UnaryCallSettings.Builder<CreateBranchRuleRequest, Operation>
        createBranchRuleSettings() {
      return createBranchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to createBranchRule. */
    public OperationCallSettings.Builder<CreateBranchRuleRequest, BranchRule, OperationMetadata>
        createBranchRuleOperationSettings() {
      return createBranchRuleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listBranchRules. */
    public PagedCallSettings.Builder<
            ListBranchRulesRequest, ListBranchRulesResponse, ListBranchRulesPagedResponse>
        listBranchRulesSettings() {
      return listBranchRulesSettings;
    }

    /** Returns the builder for the settings used for calls to getBranchRule. */
    public UnaryCallSettings.Builder<GetBranchRuleRequest, BranchRule> getBranchRuleSettings() {
      return getBranchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to updateBranchRule. */
    public UnaryCallSettings.Builder<UpdateBranchRuleRequest, Operation>
        updateBranchRuleSettings() {
      return updateBranchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to updateBranchRule. */
    public OperationCallSettings.Builder<UpdateBranchRuleRequest, BranchRule, OperationMetadata>
        updateBranchRuleOperationSettings() {
      return updateBranchRuleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBranchRule. */
    public UnaryCallSettings.Builder<DeleteBranchRuleRequest, Operation>
        deleteBranchRuleSettings() {
      return deleteBranchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBranchRule. */
    public OperationCallSettings.Builder<DeleteBranchRuleRequest, Empty, OperationMetadata>
        deleteBranchRuleOperationSettings() {
      return deleteBranchRuleOperationSettings;
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

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public SecureSourceManagerStubSettings build() throws IOException {
      return new SecureSourceManagerStubSettings(this);
    }
  }
}
