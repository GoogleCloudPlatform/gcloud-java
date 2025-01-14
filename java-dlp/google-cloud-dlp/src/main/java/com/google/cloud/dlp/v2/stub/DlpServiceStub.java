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

package com.google.cloud.dlp.v2.stub;

import static com.google.cloud.dlp.v2.DlpServiceClient.ListColumnDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListConnectionsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDeidentifyTemplatesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDiscoveryConfigsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListDlpJobsPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListFileStoreDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListInspectTemplatesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListJobTriggersPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListProjectDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListStoredInfoTypesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.ListTableDataProfilesPagedResponse;
import static com.google.cloud.dlp.v2.DlpServiceClient.SearchConnectionsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.privacy.dlp.v2.ActivateJobTriggerRequest;
import com.google.privacy.dlp.v2.CancelDlpJobRequest;
import com.google.privacy.dlp.v2.ColumnDataProfile;
import com.google.privacy.dlp.v2.Connection;
import com.google.privacy.dlp.v2.CreateConnectionRequest;
import com.google.privacy.dlp.v2.CreateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.CreateDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.CreateDlpJobRequest;
import com.google.privacy.dlp.v2.CreateInspectTemplateRequest;
import com.google.privacy.dlp.v2.CreateJobTriggerRequest;
import com.google.privacy.dlp.v2.CreateStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2.DeidentifyTemplate;
import com.google.privacy.dlp.v2.DeleteConnectionRequest;
import com.google.privacy.dlp.v2.DeleteDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.DeleteDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.DeleteDlpJobRequest;
import com.google.privacy.dlp.v2.DeleteFileStoreDataProfileRequest;
import com.google.privacy.dlp.v2.DeleteInspectTemplateRequest;
import com.google.privacy.dlp.v2.DeleteJobTriggerRequest;
import com.google.privacy.dlp.v2.DeleteStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.DeleteTableDataProfileRequest;
import com.google.privacy.dlp.v2.DiscoveryConfig;
import com.google.privacy.dlp.v2.DlpJob;
import com.google.privacy.dlp.v2.FileStoreDataProfile;
import com.google.privacy.dlp.v2.FinishDlpJobRequest;
import com.google.privacy.dlp.v2.GetColumnDataProfileRequest;
import com.google.privacy.dlp.v2.GetConnectionRequest;
import com.google.privacy.dlp.v2.GetDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.GetDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.GetDlpJobRequest;
import com.google.privacy.dlp.v2.GetFileStoreDataProfileRequest;
import com.google.privacy.dlp.v2.GetInspectTemplateRequest;
import com.google.privacy.dlp.v2.GetJobTriggerRequest;
import com.google.privacy.dlp.v2.GetProjectDataProfileRequest;
import com.google.privacy.dlp.v2.GetStoredInfoTypeRequest;
import com.google.privacy.dlp.v2.GetTableDataProfileRequest;
import com.google.privacy.dlp.v2.HybridInspectDlpJobRequest;
import com.google.privacy.dlp.v2.HybridInspectJobTriggerRequest;
import com.google.privacy.dlp.v2.HybridInspectResponse;
import com.google.privacy.dlp.v2.InspectContentRequest;
import com.google.privacy.dlp.v2.InspectContentResponse;
import com.google.privacy.dlp.v2.InspectTemplate;
import com.google.privacy.dlp.v2.JobTrigger;
import com.google.privacy.dlp.v2.ListColumnDataProfilesRequest;
import com.google.privacy.dlp.v2.ListColumnDataProfilesResponse;
import com.google.privacy.dlp.v2.ListConnectionsRequest;
import com.google.privacy.dlp.v2.ListConnectionsResponse;
import com.google.privacy.dlp.v2.ListDeidentifyTemplatesRequest;
import com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse;
import com.google.privacy.dlp.v2.ListDiscoveryConfigsRequest;
import com.google.privacy.dlp.v2.ListDiscoveryConfigsResponse;
import com.google.privacy.dlp.v2.ListDlpJobsRequest;
import com.google.privacy.dlp.v2.ListDlpJobsResponse;
import com.google.privacy.dlp.v2.ListFileStoreDataProfilesRequest;
import com.google.privacy.dlp.v2.ListFileStoreDataProfilesResponse;
import com.google.privacy.dlp.v2.ListInfoTypesRequest;
import com.google.privacy.dlp.v2.ListInfoTypesResponse;
import com.google.privacy.dlp.v2.ListInspectTemplatesRequest;
import com.google.privacy.dlp.v2.ListInspectTemplatesResponse;
import com.google.privacy.dlp.v2.ListJobTriggersRequest;
import com.google.privacy.dlp.v2.ListJobTriggersResponse;
import com.google.privacy.dlp.v2.ListProjectDataProfilesRequest;
import com.google.privacy.dlp.v2.ListProjectDataProfilesResponse;
import com.google.privacy.dlp.v2.ListStoredInfoTypesRequest;
import com.google.privacy.dlp.v2.ListStoredInfoTypesResponse;
import com.google.privacy.dlp.v2.ListTableDataProfilesRequest;
import com.google.privacy.dlp.v2.ListTableDataProfilesResponse;
import com.google.privacy.dlp.v2.ProjectDataProfile;
import com.google.privacy.dlp.v2.RedactImageRequest;
import com.google.privacy.dlp.v2.RedactImageResponse;
import com.google.privacy.dlp.v2.ReidentifyContentRequest;
import com.google.privacy.dlp.v2.ReidentifyContentResponse;
import com.google.privacy.dlp.v2.SearchConnectionsRequest;
import com.google.privacy.dlp.v2.SearchConnectionsResponse;
import com.google.privacy.dlp.v2.StoredInfoType;
import com.google.privacy.dlp.v2.TableDataProfile;
import com.google.privacy.dlp.v2.UpdateConnectionRequest;
import com.google.privacy.dlp.v2.UpdateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2.UpdateDiscoveryConfigRequest;
import com.google.privacy.dlp.v2.UpdateInspectTemplateRequest;
import com.google.privacy.dlp.v2.UpdateJobTriggerRequest;
import com.google.privacy.dlp.v2.UpdateStoredInfoTypeRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the DlpService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class DlpServiceStub implements BackgroundResource {

  public UnaryCallable<InspectContentRequest, InspectContentResponse> inspectContentCallable() {
    throw new UnsupportedOperationException("Not implemented: inspectContentCallable()");
  }

  public UnaryCallable<RedactImageRequest, RedactImageResponse> redactImageCallable() {
    throw new UnsupportedOperationException("Not implemented: redactImageCallable()");
  }

  public UnaryCallable<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentCallable() {
    throw new UnsupportedOperationException("Not implemented: deidentifyContentCallable()");
  }

  public UnaryCallable<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentCallable() {
    throw new UnsupportedOperationException("Not implemented: reidentifyContentCallable()");
  }

  public UnaryCallable<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInfoTypesCallable()");
  }

  public UnaryCallable<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: createInspectTemplateCallable()");
  }

  public UnaryCallable<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: updateInspectTemplateCallable()");
  }

  public UnaryCallable<GetInspectTemplateRequest, InspectTemplate> getInspectTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: getInspectTemplateCallable()");
  }

  public UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesPagedResponse>
      listInspectTemplatesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInspectTemplatesPagedCallable()");
  }

  public UnaryCallable<ListInspectTemplatesRequest, ListInspectTemplatesResponse>
      listInspectTemplatesCallable() {
    throw new UnsupportedOperationException("Not implemented: listInspectTemplatesCallable()");
  }

  public UnaryCallable<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInspectTemplateCallable()");
  }

  public UnaryCallable<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: createDeidentifyTemplateCallable()");
  }

  public UnaryCallable<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDeidentifyTemplateCallable()");
  }

  public UnaryCallable<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: getDeidentifyTemplateCallable()");
  }

  public UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesPagedResponse>
      listDeidentifyTemplatesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDeidentifyTemplatesPagedCallable()");
  }

  public UnaryCallable<ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse>
      listDeidentifyTemplatesCallable() {
    throw new UnsupportedOperationException("Not implemented: listDeidentifyTemplatesCallable()");
  }

  public UnaryCallable<DeleteDeidentifyTemplateRequest, Empty> deleteDeidentifyTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDeidentifyTemplateCallable()");
  }

  public UnaryCallable<CreateJobTriggerRequest, JobTrigger> createJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: createJobTriggerCallable()");
  }

  public UnaryCallable<UpdateJobTriggerRequest, JobTrigger> updateJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: updateJobTriggerCallable()");
  }

  public UnaryCallable<HybridInspectJobTriggerRequest, HybridInspectResponse>
      hybridInspectJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: hybridInspectJobTriggerCallable()");
  }

  public UnaryCallable<GetJobTriggerRequest, JobTrigger> getJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: getJobTriggerCallable()");
  }

  public UnaryCallable<ListJobTriggersRequest, ListJobTriggersPagedResponse>
      listJobTriggersPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listJobTriggersPagedCallable()");
  }

  public UnaryCallable<ListJobTriggersRequest, ListJobTriggersResponse> listJobTriggersCallable() {
    throw new UnsupportedOperationException("Not implemented: listJobTriggersCallable()");
  }

  public UnaryCallable<DeleteJobTriggerRequest, Empty> deleteJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteJobTriggerCallable()");
  }

  public UnaryCallable<ActivateJobTriggerRequest, DlpJob> activateJobTriggerCallable() {
    throw new UnsupportedOperationException("Not implemented: activateJobTriggerCallable()");
  }

  public UnaryCallable<CreateDiscoveryConfigRequest, DiscoveryConfig>
      createDiscoveryConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createDiscoveryConfigCallable()");
  }

  public UnaryCallable<UpdateDiscoveryConfigRequest, DiscoveryConfig>
      updateDiscoveryConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDiscoveryConfigCallable()");
  }

  public UnaryCallable<GetDiscoveryConfigRequest, DiscoveryConfig> getDiscoveryConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getDiscoveryConfigCallable()");
  }

  public UnaryCallable<ListDiscoveryConfigsRequest, ListDiscoveryConfigsPagedResponse>
      listDiscoveryConfigsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiscoveryConfigsPagedCallable()");
  }

  public UnaryCallable<ListDiscoveryConfigsRequest, ListDiscoveryConfigsResponse>
      listDiscoveryConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiscoveryConfigsCallable()");
  }

  public UnaryCallable<DeleteDiscoveryConfigRequest, Empty> deleteDiscoveryConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDiscoveryConfigCallable()");
  }

  public UnaryCallable<CreateDlpJobRequest, DlpJob> createDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: createDlpJobCallable()");
  }

  public UnaryCallable<ListDlpJobsRequest, ListDlpJobsPagedResponse> listDlpJobsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDlpJobsPagedCallable()");
  }

  public UnaryCallable<ListDlpJobsRequest, ListDlpJobsResponse> listDlpJobsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDlpJobsCallable()");
  }

  public UnaryCallable<GetDlpJobRequest, DlpJob> getDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: getDlpJobCallable()");
  }

  public UnaryCallable<DeleteDlpJobRequest, Empty> deleteDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDlpJobCallable()");
  }

  public UnaryCallable<CancelDlpJobRequest, Empty> cancelDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: cancelDlpJobCallable()");
  }

  public UnaryCallable<CreateStoredInfoTypeRequest, StoredInfoType> createStoredInfoTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: createStoredInfoTypeCallable()");
  }

  public UnaryCallable<UpdateStoredInfoTypeRequest, StoredInfoType> updateStoredInfoTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateStoredInfoTypeCallable()");
  }

  public UnaryCallable<GetStoredInfoTypeRequest, StoredInfoType> getStoredInfoTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: getStoredInfoTypeCallable()");
  }

  public UnaryCallable<ListStoredInfoTypesRequest, ListStoredInfoTypesPagedResponse>
      listStoredInfoTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listStoredInfoTypesPagedCallable()");
  }

  public UnaryCallable<ListStoredInfoTypesRequest, ListStoredInfoTypesResponse>
      listStoredInfoTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listStoredInfoTypesCallable()");
  }

  public UnaryCallable<DeleteStoredInfoTypeRequest, Empty> deleteStoredInfoTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteStoredInfoTypeCallable()");
  }

  public UnaryCallable<ListProjectDataProfilesRequest, ListProjectDataProfilesPagedResponse>
      listProjectDataProfilesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listProjectDataProfilesPagedCallable()");
  }

  public UnaryCallable<ListProjectDataProfilesRequest, ListProjectDataProfilesResponse>
      listProjectDataProfilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listProjectDataProfilesCallable()");
  }

  public UnaryCallable<ListTableDataProfilesRequest, ListTableDataProfilesPagedResponse>
      listTableDataProfilesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTableDataProfilesPagedCallable()");
  }

  public UnaryCallable<ListTableDataProfilesRequest, ListTableDataProfilesResponse>
      listTableDataProfilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTableDataProfilesCallable()");
  }

  public UnaryCallable<ListColumnDataProfilesRequest, ListColumnDataProfilesPagedResponse>
      listColumnDataProfilesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listColumnDataProfilesPagedCallable()");
  }

  public UnaryCallable<ListColumnDataProfilesRequest, ListColumnDataProfilesResponse>
      listColumnDataProfilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listColumnDataProfilesCallable()");
  }

  public UnaryCallable<GetProjectDataProfileRequest, ProjectDataProfile>
      getProjectDataProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: getProjectDataProfileCallable()");
  }

  public UnaryCallable<ListFileStoreDataProfilesRequest, ListFileStoreDataProfilesPagedResponse>
      listFileStoreDataProfilesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listFileStoreDataProfilesPagedCallable()");
  }

  public UnaryCallable<ListFileStoreDataProfilesRequest, ListFileStoreDataProfilesResponse>
      listFileStoreDataProfilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listFileStoreDataProfilesCallable()");
  }

  public UnaryCallable<GetFileStoreDataProfileRequest, FileStoreDataProfile>
      getFileStoreDataProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: getFileStoreDataProfileCallable()");
  }

  public UnaryCallable<DeleteFileStoreDataProfileRequest, Empty>
      deleteFileStoreDataProfileCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteFileStoreDataProfileCallable()");
  }

  public UnaryCallable<GetTableDataProfileRequest, TableDataProfile> getTableDataProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: getTableDataProfileCallable()");
  }

  public UnaryCallable<GetColumnDataProfileRequest, ColumnDataProfile>
      getColumnDataProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: getColumnDataProfileCallable()");
  }

  public UnaryCallable<DeleteTableDataProfileRequest, Empty> deleteTableDataProfileCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTableDataProfileCallable()");
  }

  public UnaryCallable<HybridInspectDlpJobRequest, HybridInspectResponse>
      hybridInspectDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: hybridInspectDlpJobCallable()");
  }

  public UnaryCallable<FinishDlpJobRequest, Empty> finishDlpJobCallable() {
    throw new UnsupportedOperationException("Not implemented: finishDlpJobCallable()");
  }

  public UnaryCallable<CreateConnectionRequest, Connection> createConnectionCallable() {
    throw new UnsupportedOperationException("Not implemented: createConnectionCallable()");
  }

  public UnaryCallable<GetConnectionRequest, Connection> getConnectionCallable() {
    throw new UnsupportedOperationException("Not implemented: getConnectionCallable()");
  }

  public UnaryCallable<ListConnectionsRequest, ListConnectionsPagedResponse>
      listConnectionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listConnectionsPagedCallable()");
  }

  public UnaryCallable<ListConnectionsRequest, ListConnectionsResponse> listConnectionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listConnectionsCallable()");
  }

  public UnaryCallable<SearchConnectionsRequest, SearchConnectionsPagedResponse>
      searchConnectionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: searchConnectionsPagedCallable()");
  }

  public UnaryCallable<SearchConnectionsRequest, SearchConnectionsResponse>
      searchConnectionsCallable() {
    throw new UnsupportedOperationException("Not implemented: searchConnectionsCallable()");
  }

  public UnaryCallable<DeleteConnectionRequest, Empty> deleteConnectionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteConnectionCallable()");
  }

  public UnaryCallable<UpdateConnectionRequest, Connection> updateConnectionCallable() {
    throw new UnsupportedOperationException("Not implemented: updateConnectionCallable()");
  }

  @Override
  public abstract void close();
}
