/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.datalabeling.v1beta1.stub;

import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListAnnotatedDatasetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListAnnotationSpecSetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListDataItemsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListDatasetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListExamplesPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListInstructionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
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
import com.google.cloud.datalabeling.v1beta1.AnnotatedDataset;
import com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet;
import com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata;
import com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.DataItem;
import com.google.cloud.datalabeling.v1beta1.Dataset;
import com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.Example;
import com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse;
import com.google.cloud.datalabeling.v1beta1.ExportDataRequest;
import com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.GetDataItemRequest;
import com.google.cloud.datalabeling.v1beta1.GetDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.GetExampleRequest;
import com.google.cloud.datalabeling.v1beta1.GetInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse;
import com.google.cloud.datalabeling.v1beta1.ImportDataRequest;
import com.google.cloud.datalabeling.v1beta1.Instruction;
import com.google.cloud.datalabeling.v1beta1.LabelAudioRequest;
import com.google.cloud.datalabeling.v1beta1.LabelImageRequest;
import com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.LabelTextRequest;
import com.google.cloud.datalabeling.v1beta1.LabelVideoRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest;
import com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse;
import com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListExamplesRequest;
import com.google.cloud.datalabeling.v1beta1.ListExamplesResponse;
import com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest;
import com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link DataLabelingServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (datalabeling.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of createDataset to 30 seconds:
 *
 * <pre>
 * <code>
 * DataLabelingServiceStubSettings.Builder dataLabelingServiceSettingsBuilder =
 *     DataLabelingServiceStubSettings.newBuilder();
 * dataLabelingServiceSettingsBuilder.createDatasetSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * DataLabelingServiceStubSettings dataLabelingServiceSettings = dataLabelingServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DataLabelingServiceStubSettings extends StubSettings<DataLabelingServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateDatasetRequest, Dataset> createDatasetSettings;
  private final UnaryCallSettings<GetDatasetRequest, Dataset> getDatasetSettings;
  private final PagedCallSettings<
          ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      listDatasetsSettings;
  private final UnaryCallSettings<DeleteDatasetRequest, Empty> deleteDatasetSettings;
  private final UnaryCallSettings<ImportDataRequest, Operation> importDataSettings;
  private final OperationCallSettings<
          ImportDataRequest, ImportDataOperationResponse, ImportDataOperationMetadata>
      importDataOperationSettings;
  private final UnaryCallSettings<ExportDataRequest, Operation> exportDataSettings;
  private final OperationCallSettings<
          ExportDataRequest, ExportDataOperationResponse, ExportDataOperationMetadata>
      exportDataOperationSettings;
  private final UnaryCallSettings<GetDataItemRequest, DataItem> getDataItemSettings;
  private final PagedCallSettings<
          ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>
      listDataItemsSettings;
  private final UnaryCallSettings<GetAnnotatedDatasetRequest, AnnotatedDataset>
      getAnnotatedDatasetSettings;
  private final PagedCallSettings<
          ListAnnotatedDatasetsRequest,
          ListAnnotatedDatasetsResponse,
          ListAnnotatedDatasetsPagedResponse>
      listAnnotatedDatasetsSettings;
  private final UnaryCallSettings<LabelImageRequest, Operation> labelImageSettings;
  private final OperationCallSettings<LabelImageRequest, AnnotatedDataset, LabelOperationMetadata>
      labelImageOperationSettings;
  private final UnaryCallSettings<LabelVideoRequest, Operation> labelVideoSettings;
  private final OperationCallSettings<LabelVideoRequest, AnnotatedDataset, LabelOperationMetadata>
      labelVideoOperationSettings;
  private final UnaryCallSettings<LabelTextRequest, Operation> labelTextSettings;
  private final OperationCallSettings<LabelTextRequest, AnnotatedDataset, LabelOperationMetadata>
      labelTextOperationSettings;
  private final UnaryCallSettings<LabelAudioRequest, Operation> labelAudioSettings;
  private final OperationCallSettings<LabelAudioRequest, AnnotatedDataset, LabelOperationMetadata>
      labelAudioOperationSettings;
  private final UnaryCallSettings<GetExampleRequest, Example> getExampleSettings;
  private final PagedCallSettings<
          ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>
      listExamplesSettings;
  private final UnaryCallSettings<CreateAnnotationSpecSetRequest, AnnotationSpecSet>
      createAnnotationSpecSetSettings;
  private final UnaryCallSettings<GetAnnotationSpecSetRequest, AnnotationSpecSet>
      getAnnotationSpecSetSettings;
  private final PagedCallSettings<
          ListAnnotationSpecSetsRequest,
          ListAnnotationSpecSetsResponse,
          ListAnnotationSpecSetsPagedResponse>
      listAnnotationSpecSetsSettings;
  private final UnaryCallSettings<DeleteAnnotationSpecSetRequest, Empty>
      deleteAnnotationSpecSetSettings;
  private final UnaryCallSettings<CreateInstructionRequest, Operation> createInstructionSettings;
  private final OperationCallSettings<
          CreateInstructionRequest, Instruction, CreateInstructionMetadata>
      createInstructionOperationSettings;
  private final UnaryCallSettings<GetInstructionRequest, Instruction> getInstructionSettings;
  private final PagedCallSettings<
          ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>
      listInstructionsSettings;
  private final UnaryCallSettings<DeleteInstructionRequest, Empty> deleteInstructionSettings;
  private final UnaryCallSettings<DeleteAnnotatedDatasetRequest, Empty>
      deleteAnnotatedDatasetSettings;

  /** Returns the object with the settings used for calls to createDataset. */
  public UnaryCallSettings<CreateDatasetRequest, Dataset> createDatasetSettings() {
    return createDatasetSettings;
  }

  /** Returns the object with the settings used for calls to getDataset. */
  public UnaryCallSettings<GetDatasetRequest, Dataset> getDatasetSettings() {
    return getDatasetSettings;
  }

  /** Returns the object with the settings used for calls to listDatasets. */
  public PagedCallSettings<ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      listDatasetsSettings() {
    return listDatasetsSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataset. */
  public UnaryCallSettings<DeleteDatasetRequest, Empty> deleteDatasetSettings() {
    return deleteDatasetSettings;
  }

  /** Returns the object with the settings used for calls to importData. */
  public UnaryCallSettings<ImportDataRequest, Operation> importDataSettings() {
    return importDataSettings;
  }

  /** Returns the object with the settings used for calls to importData. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          ImportDataRequest, ImportDataOperationResponse, ImportDataOperationMetadata>
      importDataOperationSettings() {
    return importDataOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportData. */
  public UnaryCallSettings<ExportDataRequest, Operation> exportDataSettings() {
    return exportDataSettings;
  }

  /** Returns the object with the settings used for calls to exportData. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          ExportDataRequest, ExportDataOperationResponse, ExportDataOperationMetadata>
      exportDataOperationSettings() {
    return exportDataOperationSettings;
  }

  /** Returns the object with the settings used for calls to getDataItem. */
  public UnaryCallSettings<GetDataItemRequest, DataItem> getDataItemSettings() {
    return getDataItemSettings;
  }

  /** Returns the object with the settings used for calls to listDataItems. */
  public PagedCallSettings<ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>
      listDataItemsSettings() {
    return listDataItemsSettings;
  }

  /** Returns the object with the settings used for calls to getAnnotatedDataset. */
  public UnaryCallSettings<GetAnnotatedDatasetRequest, AnnotatedDataset>
      getAnnotatedDatasetSettings() {
    return getAnnotatedDatasetSettings;
  }

  /** Returns the object with the settings used for calls to listAnnotatedDatasets. */
  public PagedCallSettings<
          ListAnnotatedDatasetsRequest,
          ListAnnotatedDatasetsResponse,
          ListAnnotatedDatasetsPagedResponse>
      listAnnotatedDatasetsSettings() {
    return listAnnotatedDatasetsSettings;
  }

  /** Returns the object with the settings used for calls to labelImage. */
  public UnaryCallSettings<LabelImageRequest, Operation> labelImageSettings() {
    return labelImageSettings;
  }

  /** Returns the object with the settings used for calls to labelImage. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<LabelImageRequest, AnnotatedDataset, LabelOperationMetadata>
      labelImageOperationSettings() {
    return labelImageOperationSettings;
  }

  /** Returns the object with the settings used for calls to labelVideo. */
  public UnaryCallSettings<LabelVideoRequest, Operation> labelVideoSettings() {
    return labelVideoSettings;
  }

  /** Returns the object with the settings used for calls to labelVideo. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<LabelVideoRequest, AnnotatedDataset, LabelOperationMetadata>
      labelVideoOperationSettings() {
    return labelVideoOperationSettings;
  }

  /** Returns the object with the settings used for calls to labelText. */
  public UnaryCallSettings<LabelTextRequest, Operation> labelTextSettings() {
    return labelTextSettings;
  }

  /** Returns the object with the settings used for calls to labelText. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<LabelTextRequest, AnnotatedDataset, LabelOperationMetadata>
      labelTextOperationSettings() {
    return labelTextOperationSettings;
  }

  /** Returns the object with the settings used for calls to labelAudio. */
  public UnaryCallSettings<LabelAudioRequest, Operation> labelAudioSettings() {
    return labelAudioSettings;
  }

  /** Returns the object with the settings used for calls to labelAudio. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<LabelAudioRequest, AnnotatedDataset, LabelOperationMetadata>
      labelAudioOperationSettings() {
    return labelAudioOperationSettings;
  }

  /** Returns the object with the settings used for calls to getExample. */
  public UnaryCallSettings<GetExampleRequest, Example> getExampleSettings() {
    return getExampleSettings;
  }

  /** Returns the object with the settings used for calls to listExamples. */
  public PagedCallSettings<ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>
      listExamplesSettings() {
    return listExamplesSettings;
  }

  /** Returns the object with the settings used for calls to createAnnotationSpecSet. */
  public UnaryCallSettings<CreateAnnotationSpecSetRequest, AnnotationSpecSet>
      createAnnotationSpecSetSettings() {
    return createAnnotationSpecSetSettings;
  }

  /** Returns the object with the settings used for calls to getAnnotationSpecSet. */
  public UnaryCallSettings<GetAnnotationSpecSetRequest, AnnotationSpecSet>
      getAnnotationSpecSetSettings() {
    return getAnnotationSpecSetSettings;
  }

  /** Returns the object with the settings used for calls to listAnnotationSpecSets. */
  public PagedCallSettings<
          ListAnnotationSpecSetsRequest,
          ListAnnotationSpecSetsResponse,
          ListAnnotationSpecSetsPagedResponse>
      listAnnotationSpecSetsSettings() {
    return listAnnotationSpecSetsSettings;
  }

  /** Returns the object with the settings used for calls to deleteAnnotationSpecSet. */
  public UnaryCallSettings<DeleteAnnotationSpecSetRequest, Empty>
      deleteAnnotationSpecSetSettings() {
    return deleteAnnotationSpecSetSettings;
  }

  /** Returns the object with the settings used for calls to createInstruction. */
  public UnaryCallSettings<CreateInstructionRequest, Operation> createInstructionSettings() {
    return createInstructionSettings;
  }

  /** Returns the object with the settings used for calls to createInstruction. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<CreateInstructionRequest, Instruction, CreateInstructionMetadata>
      createInstructionOperationSettings() {
    return createInstructionOperationSettings;
  }

  /** Returns the object with the settings used for calls to getInstruction. */
  public UnaryCallSettings<GetInstructionRequest, Instruction> getInstructionSettings() {
    return getInstructionSettings;
  }

  /** Returns the object with the settings used for calls to listInstructions. */
  public PagedCallSettings<
          ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>
      listInstructionsSettings() {
    return listInstructionsSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstruction. */
  public UnaryCallSettings<DeleteInstructionRequest, Empty> deleteInstructionSettings() {
    return deleteInstructionSettings;
  }

  /** Returns the object with the settings used for calls to deleteAnnotatedDataset. */
  public UnaryCallSettings<DeleteAnnotatedDatasetRequest, Empty> deleteAnnotatedDatasetSettings() {
    return deleteAnnotatedDatasetSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DataLabelingServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDataLabelingServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "datalabeling.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataLabelingServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected DataLabelingServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createDatasetSettings = settingsBuilder.createDatasetSettings().build();
    getDatasetSettings = settingsBuilder.getDatasetSettings().build();
    listDatasetsSettings = settingsBuilder.listDatasetsSettings().build();
    deleteDatasetSettings = settingsBuilder.deleteDatasetSettings().build();
    importDataSettings = settingsBuilder.importDataSettings().build();
    importDataOperationSettings = settingsBuilder.importDataOperationSettings().build();
    exportDataSettings = settingsBuilder.exportDataSettings().build();
    exportDataOperationSettings = settingsBuilder.exportDataOperationSettings().build();
    getDataItemSettings = settingsBuilder.getDataItemSettings().build();
    listDataItemsSettings = settingsBuilder.listDataItemsSettings().build();
    getAnnotatedDatasetSettings = settingsBuilder.getAnnotatedDatasetSettings().build();
    listAnnotatedDatasetsSettings = settingsBuilder.listAnnotatedDatasetsSettings().build();
    labelImageSettings = settingsBuilder.labelImageSettings().build();
    labelImageOperationSettings = settingsBuilder.labelImageOperationSettings().build();
    labelVideoSettings = settingsBuilder.labelVideoSettings().build();
    labelVideoOperationSettings = settingsBuilder.labelVideoOperationSettings().build();
    labelTextSettings = settingsBuilder.labelTextSettings().build();
    labelTextOperationSettings = settingsBuilder.labelTextOperationSettings().build();
    labelAudioSettings = settingsBuilder.labelAudioSettings().build();
    labelAudioOperationSettings = settingsBuilder.labelAudioOperationSettings().build();
    getExampleSettings = settingsBuilder.getExampleSettings().build();
    listExamplesSettings = settingsBuilder.listExamplesSettings().build();
    createAnnotationSpecSetSettings = settingsBuilder.createAnnotationSpecSetSettings().build();
    getAnnotationSpecSetSettings = settingsBuilder.getAnnotationSpecSetSettings().build();
    listAnnotationSpecSetsSettings = settingsBuilder.listAnnotationSpecSetsSettings().build();
    deleteAnnotationSpecSetSettings = settingsBuilder.deleteAnnotationSpecSetSettings().build();
    createInstructionSettings = settingsBuilder.createInstructionSettings().build();
    createInstructionOperationSettings =
        settingsBuilder.createInstructionOperationSettings().build();
    getInstructionSettings = settingsBuilder.getInstructionSettings().build();
    listInstructionsSettings = settingsBuilder.listInstructionsSettings().build();
    deleteInstructionSettings = settingsBuilder.deleteInstructionSettings().build();
    deleteAnnotatedDatasetSettings = settingsBuilder.deleteAnnotatedDatasetSettings().build();
  }

  private static final PagedListDescriptor<ListDatasetsRequest, ListDatasetsResponse, Dataset>
      LIST_DATASETS_PAGE_STR_DESC =
          new PagedListDescriptor<ListDatasetsRequest, ListDatasetsResponse, Dataset>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDatasetsRequest injectToken(ListDatasetsRequest payload, String token) {
              return ListDatasetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDatasetsRequest injectPageSize(ListDatasetsRequest payload, int pageSize) {
              return ListDatasetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDatasetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDatasetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Dataset> extractResources(ListDatasetsResponse payload) {
              return payload.getDatasetsList() != null
                  ? payload.getDatasetsList()
                  : ImmutableList.<Dataset>of();
            }
          };

  private static final PagedListDescriptor<ListDataItemsRequest, ListDataItemsResponse, DataItem>
      LIST_DATA_ITEMS_PAGE_STR_DESC =
          new PagedListDescriptor<ListDataItemsRequest, ListDataItemsResponse, DataItem>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDataItemsRequest injectToken(ListDataItemsRequest payload, String token) {
              return ListDataItemsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDataItemsRequest injectPageSize(ListDataItemsRequest payload, int pageSize) {
              return ListDataItemsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDataItemsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDataItemsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DataItem> extractResources(ListDataItemsResponse payload) {
              return payload.getDataItemsList() != null
                  ? payload.getDataItemsList()
                  : ImmutableList.<DataItem>of();
            }
          };

  private static final PagedListDescriptor<
          ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsResponse, AnnotatedDataset>
      LIST_ANNOTATED_DATASETS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsResponse, AnnotatedDataset>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAnnotatedDatasetsRequest injectToken(
                ListAnnotatedDatasetsRequest payload, String token) {
              return ListAnnotatedDatasetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAnnotatedDatasetsRequest injectPageSize(
                ListAnnotatedDatasetsRequest payload, int pageSize) {
              return ListAnnotatedDatasetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAnnotatedDatasetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAnnotatedDatasetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AnnotatedDataset> extractResources(
                ListAnnotatedDatasetsResponse payload) {
              return payload.getAnnotatedDatasetsList() != null
                  ? payload.getAnnotatedDatasetsList()
                  : ImmutableList.<AnnotatedDataset>of();
            }
          };

  private static final PagedListDescriptor<ListExamplesRequest, ListExamplesResponse, Example>
      LIST_EXAMPLES_PAGE_STR_DESC =
          new PagedListDescriptor<ListExamplesRequest, ListExamplesResponse, Example>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListExamplesRequest injectToken(ListExamplesRequest payload, String token) {
              return ListExamplesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListExamplesRequest injectPageSize(ListExamplesRequest payload, int pageSize) {
              return ListExamplesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListExamplesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListExamplesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Example> extractResources(ListExamplesResponse payload) {
              return payload.getExamplesList() != null
                  ? payload.getExamplesList()
                  : ImmutableList.<Example>of();
            }
          };

  private static final PagedListDescriptor<
          ListAnnotationSpecSetsRequest, ListAnnotationSpecSetsResponse, AnnotationSpecSet>
      LIST_ANNOTATION_SPEC_SETS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAnnotationSpecSetsRequest, ListAnnotationSpecSetsResponse, AnnotationSpecSet>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAnnotationSpecSetsRequest injectToken(
                ListAnnotationSpecSetsRequest payload, String token) {
              return ListAnnotationSpecSetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAnnotationSpecSetsRequest injectPageSize(
                ListAnnotationSpecSetsRequest payload, int pageSize) {
              return ListAnnotationSpecSetsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListAnnotationSpecSetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAnnotationSpecSetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AnnotationSpecSet> extractResources(
                ListAnnotationSpecSetsResponse payload) {
              return payload.getAnnotationSpecSetsList() != null
                  ? payload.getAnnotationSpecSetsList()
                  : ImmutableList.<AnnotationSpecSet>of();
            }
          };

  private static final PagedListDescriptor<
          ListInstructionsRequest, ListInstructionsResponse, Instruction>
      LIST_INSTRUCTIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListInstructionsRequest, ListInstructionsResponse, Instruction>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstructionsRequest injectToken(
                ListInstructionsRequest payload, String token) {
              return ListInstructionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInstructionsRequest injectPageSize(
                ListInstructionsRequest payload, int pageSize) {
              return ListInstructionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInstructionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListInstructionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Instruction> extractResources(ListInstructionsResponse payload) {
              return payload.getInstructionsList() != null
                  ? payload.getInstructionsList()
                  : ImmutableList.<Instruction>of();
            }
          };

  private static final PagedListResponseFactory<
          ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      LIST_DATASETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>() {
            @Override
            public ApiFuture<ListDatasetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDatasetsRequest, ListDatasetsResponse> callable,
                ListDatasetsRequest request,
                ApiCallContext context,
                ApiFuture<ListDatasetsResponse> futureResponse) {
              PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> pageContext =
                  PageContext.create(callable, LIST_DATASETS_PAGE_STR_DESC, request, context);
              return ListDatasetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>
      LIST_DATA_ITEMS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>() {
            @Override
            public ApiFuture<ListDataItemsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDataItemsRequest, ListDataItemsResponse> callable,
                ListDataItemsRequest request,
                ApiCallContext context,
                ApiFuture<ListDataItemsResponse> futureResponse) {
              PageContext<ListDataItemsRequest, ListDataItemsResponse, DataItem> pageContext =
                  PageContext.create(callable, LIST_DATA_ITEMS_PAGE_STR_DESC, request, context);
              return ListDataItemsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAnnotatedDatasetsRequest,
          ListAnnotatedDatasetsResponse,
          ListAnnotatedDatasetsPagedResponse>
      LIST_ANNOTATED_DATASETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAnnotatedDatasetsRequest,
              ListAnnotatedDatasetsResponse,
              ListAnnotatedDatasetsPagedResponse>() {
            @Override
            public ApiFuture<ListAnnotatedDatasetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsResponse> callable,
                ListAnnotatedDatasetsRequest request,
                ApiCallContext context,
                ApiFuture<ListAnnotatedDatasetsResponse> futureResponse) {
              PageContext<
                      ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsResponse, AnnotatedDataset>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ANNOTATED_DATASETS_PAGE_STR_DESC, request, context);
              return ListAnnotatedDatasetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>
      LIST_EXAMPLES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>() {
            @Override
            public ApiFuture<ListExamplesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListExamplesRequest, ListExamplesResponse> callable,
                ListExamplesRequest request,
                ApiCallContext context,
                ApiFuture<ListExamplesResponse> futureResponse) {
              PageContext<ListExamplesRequest, ListExamplesResponse, Example> pageContext =
                  PageContext.create(callable, LIST_EXAMPLES_PAGE_STR_DESC, request, context);
              return ListExamplesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAnnotationSpecSetsRequest,
          ListAnnotationSpecSetsResponse,
          ListAnnotationSpecSetsPagedResponse>
      LIST_ANNOTATION_SPEC_SETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAnnotationSpecSetsRequest,
              ListAnnotationSpecSetsResponse,
              ListAnnotationSpecSetsPagedResponse>() {
            @Override
            public ApiFuture<ListAnnotationSpecSetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAnnotationSpecSetsRequest, ListAnnotationSpecSetsResponse>
                    callable,
                ListAnnotationSpecSetsRequest request,
                ApiCallContext context,
                ApiFuture<ListAnnotationSpecSetsResponse> futureResponse) {
              PageContext<
                      ListAnnotationSpecSetsRequest,
                      ListAnnotationSpecSetsResponse,
                      AnnotationSpecSet>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ANNOTATION_SPEC_SETS_PAGE_STR_DESC, request, context);
              return ListAnnotationSpecSetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>
      LIST_INSTRUCTIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>() {
            @Override
            public ApiFuture<ListInstructionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstructionsRequest, ListInstructionsResponse> callable,
                ListInstructionsRequest request,
                ApiCallContext context,
                ApiFuture<ListInstructionsResponse> futureResponse) {
              PageContext<ListInstructionsRequest, ListInstructionsResponse, Instruction>
                  pageContext =
                      PageContext.create(
                          callable, LIST_INSTRUCTIONS_PAGE_STR_DESC, request, context);
              return ListInstructionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for DataLabelingServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<DataLabelingServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateDatasetRequest, Dataset> createDatasetSettings;
    private final UnaryCallSettings.Builder<GetDatasetRequest, Dataset> getDatasetSettings;
    private final PagedCallSettings.Builder<
            ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
        listDatasetsSettings;
    private final UnaryCallSettings.Builder<DeleteDatasetRequest, Empty> deleteDatasetSettings;
    private final UnaryCallSettings.Builder<ImportDataRequest, Operation> importDataSettings;
    private final OperationCallSettings.Builder<
            ImportDataRequest, ImportDataOperationResponse, ImportDataOperationMetadata>
        importDataOperationSettings;
    private final UnaryCallSettings.Builder<ExportDataRequest, Operation> exportDataSettings;
    private final OperationCallSettings.Builder<
            ExportDataRequest, ExportDataOperationResponse, ExportDataOperationMetadata>
        exportDataOperationSettings;
    private final UnaryCallSettings.Builder<GetDataItemRequest, DataItem> getDataItemSettings;
    private final PagedCallSettings.Builder<
            ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>
        listDataItemsSettings;
    private final UnaryCallSettings.Builder<GetAnnotatedDatasetRequest, AnnotatedDataset>
        getAnnotatedDatasetSettings;
    private final PagedCallSettings.Builder<
            ListAnnotatedDatasetsRequest,
            ListAnnotatedDatasetsResponse,
            ListAnnotatedDatasetsPagedResponse>
        listAnnotatedDatasetsSettings;
    private final UnaryCallSettings.Builder<LabelImageRequest, Operation> labelImageSettings;
    private final OperationCallSettings.Builder<
            LabelImageRequest, AnnotatedDataset, LabelOperationMetadata>
        labelImageOperationSettings;
    private final UnaryCallSettings.Builder<LabelVideoRequest, Operation> labelVideoSettings;
    private final OperationCallSettings.Builder<
            LabelVideoRequest, AnnotatedDataset, LabelOperationMetadata>
        labelVideoOperationSettings;
    private final UnaryCallSettings.Builder<LabelTextRequest, Operation> labelTextSettings;
    private final OperationCallSettings.Builder<
            LabelTextRequest, AnnotatedDataset, LabelOperationMetadata>
        labelTextOperationSettings;
    private final UnaryCallSettings.Builder<LabelAudioRequest, Operation> labelAudioSettings;
    private final OperationCallSettings.Builder<
            LabelAudioRequest, AnnotatedDataset, LabelOperationMetadata>
        labelAudioOperationSettings;
    private final UnaryCallSettings.Builder<GetExampleRequest, Example> getExampleSettings;
    private final PagedCallSettings.Builder<
            ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>
        listExamplesSettings;
    private final UnaryCallSettings.Builder<CreateAnnotationSpecSetRequest, AnnotationSpecSet>
        createAnnotationSpecSetSettings;
    private final UnaryCallSettings.Builder<GetAnnotationSpecSetRequest, AnnotationSpecSet>
        getAnnotationSpecSetSettings;
    private final PagedCallSettings.Builder<
            ListAnnotationSpecSetsRequest,
            ListAnnotationSpecSetsResponse,
            ListAnnotationSpecSetsPagedResponse>
        listAnnotationSpecSetsSettings;
    private final UnaryCallSettings.Builder<DeleteAnnotationSpecSetRequest, Empty>
        deleteAnnotationSpecSetSettings;
    private final UnaryCallSettings.Builder<CreateInstructionRequest, Operation>
        createInstructionSettings;
    private final OperationCallSettings.Builder<
            CreateInstructionRequest, Instruction, CreateInstructionMetadata>
        createInstructionOperationSettings;
    private final UnaryCallSettings.Builder<GetInstructionRequest, Instruction>
        getInstructionSettings;
    private final PagedCallSettings.Builder<
            ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>
        listInstructionsSettings;
    private final UnaryCallSettings.Builder<DeleteInstructionRequest, Empty>
        deleteInstructionSettings;
    private final UnaryCallSettings.Builder<DeleteAnnotatedDatasetRequest, Empty>
        deleteAnnotatedDatasetSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(30000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(300000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listDatasetsSettings = PagedCallSettings.newBuilder(LIST_DATASETS_PAGE_STR_FACT);

      deleteDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      importDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      importDataOperationSettings = OperationCallSettings.newBuilder();

      exportDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      exportDataOperationSettings = OperationCallSettings.newBuilder();

      getDataItemSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listDataItemsSettings = PagedCallSettings.newBuilder(LIST_DATA_ITEMS_PAGE_STR_FACT);

      getAnnotatedDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listAnnotatedDatasetsSettings =
          PagedCallSettings.newBuilder(LIST_ANNOTATED_DATASETS_PAGE_STR_FACT);

      labelImageSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      labelImageOperationSettings = OperationCallSettings.newBuilder();

      labelVideoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      labelVideoOperationSettings = OperationCallSettings.newBuilder();

      labelTextSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      labelTextOperationSettings = OperationCallSettings.newBuilder();

      labelAudioSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      labelAudioOperationSettings = OperationCallSettings.newBuilder();

      getExampleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listExamplesSettings = PagedCallSettings.newBuilder(LIST_EXAMPLES_PAGE_STR_FACT);

      createAnnotationSpecSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getAnnotationSpecSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listAnnotationSpecSetsSettings =
          PagedCallSettings.newBuilder(LIST_ANNOTATION_SPEC_SETS_PAGE_STR_FACT);

      deleteAnnotationSpecSetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createInstructionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createInstructionOperationSettings = OperationCallSettings.newBuilder();

      getInstructionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listInstructionsSettings = PagedCallSettings.newBuilder(LIST_INSTRUCTIONS_PAGE_STR_FACT);

      deleteInstructionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteAnnotatedDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createDatasetSettings,
              getDatasetSettings,
              listDatasetsSettings,
              deleteDatasetSettings,
              importDataSettings,
              exportDataSettings,
              getDataItemSettings,
              listDataItemsSettings,
              getAnnotatedDatasetSettings,
              listAnnotatedDatasetsSettings,
              labelImageSettings,
              labelVideoSettings,
              labelTextSettings,
              labelAudioSettings,
              getExampleSettings,
              listExamplesSettings,
              createAnnotationSpecSetSettings,
              getAnnotationSpecSetSettings,
              listAnnotationSpecSetsSettings,
              deleteAnnotationSpecSetSettings,
              createInstructionSettings,
              getInstructionSettings,
              listInstructionsSettings,
              deleteInstructionSettings,
              deleteAnnotatedDatasetSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .createDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listDatasetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .importDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .exportDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getDataItemSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listDataItemsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getAnnotatedDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listAnnotatedDatasetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .labelImageSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .labelVideoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .labelTextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .labelAudioSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getExampleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listExamplesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createAnnotationSpecSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getAnnotationSpecSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listAnnotationSpecSetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteAnnotationSpecSetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createInstructionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstructionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listInstructionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstructionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteAnnotatedDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .importDataOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ImportDataRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ImportDataOperationResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ImportDataOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .exportDataOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ExportDataRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ExportDataOperationResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ExportDataOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .labelImageOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<LabelImageRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(AnnotatedDataset.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(LabelOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .labelVideoOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<LabelVideoRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(AnnotatedDataset.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(LabelOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .labelTextOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<LabelTextRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(AnnotatedDataset.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(LabelOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .labelAudioOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<LabelAudioRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(AnnotatedDataset.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(LabelOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));
      builder
          .createInstructionOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateInstructionRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Instruction.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateInstructionMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(DataLabelingServiceStubSettings settings) {
      super(settings);

      createDatasetSettings = settings.createDatasetSettings.toBuilder();
      getDatasetSettings = settings.getDatasetSettings.toBuilder();
      listDatasetsSettings = settings.listDatasetsSettings.toBuilder();
      deleteDatasetSettings = settings.deleteDatasetSettings.toBuilder();
      importDataSettings = settings.importDataSettings.toBuilder();
      importDataOperationSettings = settings.importDataOperationSettings.toBuilder();
      exportDataSettings = settings.exportDataSettings.toBuilder();
      exportDataOperationSettings = settings.exportDataOperationSettings.toBuilder();
      getDataItemSettings = settings.getDataItemSettings.toBuilder();
      listDataItemsSettings = settings.listDataItemsSettings.toBuilder();
      getAnnotatedDatasetSettings = settings.getAnnotatedDatasetSettings.toBuilder();
      listAnnotatedDatasetsSettings = settings.listAnnotatedDatasetsSettings.toBuilder();
      labelImageSettings = settings.labelImageSettings.toBuilder();
      labelImageOperationSettings = settings.labelImageOperationSettings.toBuilder();
      labelVideoSettings = settings.labelVideoSettings.toBuilder();
      labelVideoOperationSettings = settings.labelVideoOperationSettings.toBuilder();
      labelTextSettings = settings.labelTextSettings.toBuilder();
      labelTextOperationSettings = settings.labelTextOperationSettings.toBuilder();
      labelAudioSettings = settings.labelAudioSettings.toBuilder();
      labelAudioOperationSettings = settings.labelAudioOperationSettings.toBuilder();
      getExampleSettings = settings.getExampleSettings.toBuilder();
      listExamplesSettings = settings.listExamplesSettings.toBuilder();
      createAnnotationSpecSetSettings = settings.createAnnotationSpecSetSettings.toBuilder();
      getAnnotationSpecSetSettings = settings.getAnnotationSpecSetSettings.toBuilder();
      listAnnotationSpecSetsSettings = settings.listAnnotationSpecSetsSettings.toBuilder();
      deleteAnnotationSpecSetSettings = settings.deleteAnnotationSpecSetSettings.toBuilder();
      createInstructionSettings = settings.createInstructionSettings.toBuilder();
      createInstructionOperationSettings = settings.createInstructionOperationSettings.toBuilder();
      getInstructionSettings = settings.getInstructionSettings.toBuilder();
      listInstructionsSettings = settings.listInstructionsSettings.toBuilder();
      deleteInstructionSettings = settings.deleteInstructionSettings.toBuilder();
      deleteAnnotatedDatasetSettings = settings.deleteAnnotatedDatasetSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createDatasetSettings,
              getDatasetSettings,
              listDatasetsSettings,
              deleteDatasetSettings,
              importDataSettings,
              exportDataSettings,
              getDataItemSettings,
              listDataItemsSettings,
              getAnnotatedDatasetSettings,
              listAnnotatedDatasetsSettings,
              labelImageSettings,
              labelVideoSettings,
              labelTextSettings,
              labelAudioSettings,
              getExampleSettings,
              listExamplesSettings,
              createAnnotationSpecSetSettings,
              getAnnotationSpecSetSettings,
              listAnnotationSpecSetsSettings,
              deleteAnnotationSpecSetSettings,
              createInstructionSettings,
              getInstructionSettings,
              listInstructionsSettings,
              deleteInstructionSettings,
              deleteAnnotatedDatasetSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createDataset. */
    public UnaryCallSettings.Builder<CreateDatasetRequest, Dataset> createDatasetSettings() {
      return createDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to getDataset. */
    public UnaryCallSettings.Builder<GetDatasetRequest, Dataset> getDatasetSettings() {
      return getDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to listDatasets. */
    public PagedCallSettings.Builder<
            ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
        listDatasetsSettings() {
      return listDatasetsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataset. */
    public UnaryCallSettings.Builder<DeleteDatasetRequest, Empty> deleteDatasetSettings() {
      return deleteDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to importData. */
    public UnaryCallSettings.Builder<ImportDataRequest, Operation> importDataSettings() {
      return importDataSettings;
    }

    /** Returns the builder for the settings used for calls to importData. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ImportDataRequest, ImportDataOperationResponse, ImportDataOperationMetadata>
        importDataOperationSettings() {
      return importDataOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportData. */
    public UnaryCallSettings.Builder<ExportDataRequest, Operation> exportDataSettings() {
      return exportDataSettings;
    }

    /** Returns the builder for the settings used for calls to exportData. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ExportDataRequest, ExportDataOperationResponse, ExportDataOperationMetadata>
        exportDataOperationSettings() {
      return exportDataOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getDataItem. */
    public UnaryCallSettings.Builder<GetDataItemRequest, DataItem> getDataItemSettings() {
      return getDataItemSettings;
    }

    /** Returns the builder for the settings used for calls to listDataItems. */
    public PagedCallSettings.Builder<
            ListDataItemsRequest, ListDataItemsResponse, ListDataItemsPagedResponse>
        listDataItemsSettings() {
      return listDataItemsSettings;
    }

    /** Returns the builder for the settings used for calls to getAnnotatedDataset. */
    public UnaryCallSettings.Builder<GetAnnotatedDatasetRequest, AnnotatedDataset>
        getAnnotatedDatasetSettings() {
      return getAnnotatedDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to listAnnotatedDatasets. */
    public PagedCallSettings.Builder<
            ListAnnotatedDatasetsRequest,
            ListAnnotatedDatasetsResponse,
            ListAnnotatedDatasetsPagedResponse>
        listAnnotatedDatasetsSettings() {
      return listAnnotatedDatasetsSettings;
    }

    /** Returns the builder for the settings used for calls to labelImage. */
    public UnaryCallSettings.Builder<LabelImageRequest, Operation> labelImageSettings() {
      return labelImageSettings;
    }

    /** Returns the builder for the settings used for calls to labelImage. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            LabelImageRequest, AnnotatedDataset, LabelOperationMetadata>
        labelImageOperationSettings() {
      return labelImageOperationSettings;
    }

    /** Returns the builder for the settings used for calls to labelVideo. */
    public UnaryCallSettings.Builder<LabelVideoRequest, Operation> labelVideoSettings() {
      return labelVideoSettings;
    }

    /** Returns the builder for the settings used for calls to labelVideo. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            LabelVideoRequest, AnnotatedDataset, LabelOperationMetadata>
        labelVideoOperationSettings() {
      return labelVideoOperationSettings;
    }

    /** Returns the builder for the settings used for calls to labelText. */
    public UnaryCallSettings.Builder<LabelTextRequest, Operation> labelTextSettings() {
      return labelTextSettings;
    }

    /** Returns the builder for the settings used for calls to labelText. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<LabelTextRequest, AnnotatedDataset, LabelOperationMetadata>
        labelTextOperationSettings() {
      return labelTextOperationSettings;
    }

    /** Returns the builder for the settings used for calls to labelAudio. */
    public UnaryCallSettings.Builder<LabelAudioRequest, Operation> labelAudioSettings() {
      return labelAudioSettings;
    }

    /** Returns the builder for the settings used for calls to labelAudio. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            LabelAudioRequest, AnnotatedDataset, LabelOperationMetadata>
        labelAudioOperationSettings() {
      return labelAudioOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getExample. */
    public UnaryCallSettings.Builder<GetExampleRequest, Example> getExampleSettings() {
      return getExampleSettings;
    }

    /** Returns the builder for the settings used for calls to listExamples. */
    public PagedCallSettings.Builder<
            ListExamplesRequest, ListExamplesResponse, ListExamplesPagedResponse>
        listExamplesSettings() {
      return listExamplesSettings;
    }

    /** Returns the builder for the settings used for calls to createAnnotationSpecSet. */
    public UnaryCallSettings.Builder<CreateAnnotationSpecSetRequest, AnnotationSpecSet>
        createAnnotationSpecSetSettings() {
      return createAnnotationSpecSetSettings;
    }

    /** Returns the builder for the settings used for calls to getAnnotationSpecSet. */
    public UnaryCallSettings.Builder<GetAnnotationSpecSetRequest, AnnotationSpecSet>
        getAnnotationSpecSetSettings() {
      return getAnnotationSpecSetSettings;
    }

    /** Returns the builder for the settings used for calls to listAnnotationSpecSets. */
    public PagedCallSettings.Builder<
            ListAnnotationSpecSetsRequest,
            ListAnnotationSpecSetsResponse,
            ListAnnotationSpecSetsPagedResponse>
        listAnnotationSpecSetsSettings() {
      return listAnnotationSpecSetsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAnnotationSpecSet. */
    public UnaryCallSettings.Builder<DeleteAnnotationSpecSetRequest, Empty>
        deleteAnnotationSpecSetSettings() {
      return deleteAnnotationSpecSetSettings;
    }

    /** Returns the builder for the settings used for calls to createInstruction. */
    public UnaryCallSettings.Builder<CreateInstructionRequest, Operation>
        createInstructionSettings() {
      return createInstructionSettings;
    }

    /** Returns the builder for the settings used for calls to createInstruction. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateInstructionRequest, Instruction, CreateInstructionMetadata>
        createInstructionOperationSettings() {
      return createInstructionOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getInstruction. */
    public UnaryCallSettings.Builder<GetInstructionRequest, Instruction> getInstructionSettings() {
      return getInstructionSettings;
    }

    /** Returns the builder for the settings used for calls to listInstructions. */
    public PagedCallSettings.Builder<
            ListInstructionsRequest, ListInstructionsResponse, ListInstructionsPagedResponse>
        listInstructionsSettings() {
      return listInstructionsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstruction. */
    public UnaryCallSettings.Builder<DeleteInstructionRequest, Empty> deleteInstructionSettings() {
      return deleteInstructionSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAnnotatedDataset. */
    public UnaryCallSettings.Builder<DeleteAnnotatedDatasetRequest, Empty>
        deleteAnnotatedDatasetSettings() {
      return deleteAnnotatedDatasetSettings;
    }

    @Override
    public DataLabelingServiceStubSettings build() throws IOException {
      return new DataLabelingServiceStubSettings(this);
    }
  }
}
