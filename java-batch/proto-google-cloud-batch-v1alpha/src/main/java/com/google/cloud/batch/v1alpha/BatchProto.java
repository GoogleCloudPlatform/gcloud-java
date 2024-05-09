/*
 * Copyright 2024 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/batch.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.batch.v1alpha;

public final class BatchProto {
  private BatchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/batch/v1alpha/batch.proto"
          + "\022\032google.cloud.batch.v1alpha\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\033go"
          + "ogle/api/field_info.proto\032\031google/api/re"
          + "source.proto\032$google/cloud/batch/v1alpha"
          + "/job.proto\0323google/cloud/batch/v1alpha/r"
          + "esource_allowance.proto\032%google/cloud/ba"
          + "tch/v1alpha/task.proto\032#google/longrunni"
          + "ng/operations.proto\032\033google/protobuf/emp"
          + "ty.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\240\001\n\020"
          + "CreateJobRequest\0220\n\006parent\030\001 \001(\tB \340A\002\372A\032"
          + "\022\030batch.googleapis.com/Job\022\016\n\006job_id\030\002 \001"
          + "(\t\0221\n\003job\030\003 \001(\0132\037.google.cloud.batch.v1a"
          + "lpha.JobB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"?"
          + "\n\rGetJobRequest\022.\n\004name\030\001 \001(\tB \340A\002\372A\032\n\030b"
          + "atch.googleapis.com/Job\"N\n\020DeleteJobRequ"
          + "est\022\014\n\004name\030\001 \001(\t\022\023\n\006reason\030\002 \001(\tB\003\340A\001\022\027"
          + "\n\nrequest_id\030\004 \001(\tB\003\340A\001\"\234\001\n\020UpdateJobReq"
          + "uest\0221\n\003job\030\001 \001(\0132\037.google.cloud.batch.v"
          + "1alpha.JobB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.g"
          + "oogle.protobuf.FieldMaskB\003\340A\002\022\037\n\nrequest"
          + "_id\030\003 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"o\n\017ListJobsReques"
          + "t\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\004 \001(\t\022\025\n\010ord"
          + "er_by\030\005 \001(\tB\003\340A\001\022\021\n\tpage_size\030\002 \001(\005\022\022\n\np"
          + "age_token\030\003 \001(\t\"o\n\020ListJobsResponse\022-\n\004j"
          + "obs\030\001 \003(\0132\037.google.cloud.batch.v1alpha.J"
          + "ob\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachab"
          + "le\030\003 \003(\t\"\223\001\n\020ListTasksRequest\0226\n\006parent\030"
          + "\001 \001(\tB&\340A\002\372A \n\036batch.googleapis.com/Task"
          + "Group\022\016\n\006filter\030\002 \001(\t\022\020\n\010order_by\030\005 \001(\t\022"
          + "\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"r"
          + "\n\021ListTasksResponse\022/\n\005tasks\030\001 \003(\0132 .goo"
          + "gle.cloud.batch.v1alpha.Task\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"A\n\016Ge"
          + "tTaskRequest\022/\n\004name\030\001 \001(\tB!\340A\002\372A\033\n\031batc"
          + "h.googleapis.com/Task\"\360\001\n\036CreateResource"
          + "AllowanceRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372A("
          + "\022&batch.googleapis.com/ResourceAllowance"
          + "\022\035\n\025resource_allowance_id\030\002 \001(\t\022N\n\022resou"
          + "rce_allowance\030\003 \001(\0132-.google.cloud.batch"
          + ".v1alpha.ResourceAllowanceB\003\340A\002\022\037\n\nreque"
          + "st_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"[\n\033GetResourceA"
          + "llowanceRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&b"
          + "atch.googleapis.com/ResourceAllowance\"\224\001"
          + "\n\036DeleteResourceAllowanceRequest\022<\n\004name"
          + "\030\001 \001(\tB.\340A\002\372A(\n&batch.googleapis.com/Res"
          + "ourceAllowance\022\023\n\006reason\030\002 \001(\tB\003\340A\001\022\037\n\nr"
          + "equest_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"\220\001\n\035ListRes"
          + "ourceAllowancesRequest\022>\n\006parent\030\001 \001(\tB."
          + "\340A\002\372A(\022&batch.googleapis.com/ResourceAll"
          + "owance\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_t"
          + "oken\030\003 \001(\tB\003\340A\001\"\232\001\n\036ListResourceAllowanc"
          + "esResponse\022J\n\023resource_allowances\030\001 \003(\0132"
          + "-.google.cloud.batch.v1alpha.ResourceAll"
          + "owance\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unrea"
          + "chable\030\003 \003(\t\"\307\001\n\036UpdateResourceAllowance"
          + "Request\022N\n\022resource_allowance\030\001 \001(\0132-.go"
          + "ogle.cloud.batch.v1alpha.ResourceAllowan"
          + "ceB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.pr"
          + "otobuf.FieldMaskB\003\340A\002\022\037\n\nrequest_id\030\003 \001("
          + "\tB\013\340A\001\342\214\317\327\010\002\010\001\"\200\002\n\021OperationMetadata\0224\n\013"
          + "create_time\030\001 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340"
          + "A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_message\030"
          + "\005 \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006 \001"
          + "(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\0032\241\024\n\014Ba"
          + "tchService\022\252\001\n\tCreateJob\022,.google.cloud."
          + "batch.v1alpha.CreateJobRequest\032\037.google."
          + "cloud.batch.v1alpha.Job\"N\332A\021parent,job,j"
          + "ob_id\202\323\344\223\0024\"-/v1alpha/{parent=projects/*"
          + "/locations/*}/jobs:\003job\022\222\001\n\006GetJob\022).goo"
          + "gle.cloud.batch.v1alpha.GetJobRequest\032\037."
          + "google.cloud.batch.v1alpha.Job\"<\332A\004name\202"
          + "\323\344\223\002/\022-/v1alpha/{name=projects/*/locatio"
          + "ns/*/jobs/*}\022\337\001\n\tDeleteJob\022,.google.clou"
          + "d.batch.v1alpha.DeleteJobRequest\032\035.googl"
          + "e.longrunning.Operation\"\204\001\312AE\n\025google.pr"
          + "otobuf.Empty\022,google.cloud.batch.v1alpha"
          + ".OperationMetadata\332A\004name\202\323\344\223\002/*-/v1alph"
          + "a/{name=projects/*/locations/*/jobs/*}\022\254"
          + "\001\n\tUpdateJob\022,.google.cloud.batch.v1alph"
          + "a.UpdateJobRequest\032\037.google.cloud.batch."
          + "v1alpha.Job\"P\332A\017job,update_mask\202\323\344\223\002821/"
          + "v1alpha/{job.name=projects/*/locations/*"
          + "/jobs/*}:\003job\022\245\001\n\010ListJobs\022+.google.clou"
          + "d.batch.v1alpha.ListJobsRequest\032,.google"
          + ".cloud.batch.v1alpha.ListJobsResponse\">\332"
          + "A\006parent\202\323\344\223\002/\022-/v1alpha/{parent=project"
          + "s/*/locations/*}/jobs\022\252\001\n\007GetTask\022*.goog"
          + "le.cloud.batch.v1alpha.GetTaskRequest\032 ."
          + "google.cloud.batch.v1alpha.Task\"Q\332A\004name"
          + "\202\323\344\223\002D\022B/v1alpha/{name=projects/*/locati"
          + "ons/*/jobs/*/taskGroups/*/tasks/*}\022\275\001\n\tL"
          + "istTasks\022,.google.cloud.batch.v1alpha.Li"
          + "stTasksRequest\032-.google.cloud.batch.v1al"
          + "pha.ListTasksResponse\"S\332A\006parent\202\323\344\223\002D\022B"
          + "/v1alpha/{parent=projects/*/locations/*/"
          + "jobs/*/taskGroups/*}/tasks\022\220\002\n\027CreateRes"
          + "ourceAllowance\022:.google.cloud.batch.v1al"
          + "pha.CreateResourceAllowanceRequest\032-.goo"
          + "gle.cloud.batch.v1alpha.ResourceAllowanc"
          + "e\"\211\001\332A/parent,resource_allowance,resourc"
          + "e_allowance_id\202\323\344\223\002Q\";/v1alpha/{parent=p"
          + "rojects/*/locations/*}/resourceAllowance"
          + "s:\022resource_allowance\022\312\001\n\024GetResourceAll"
          + "owance\0227.google.cloud.batch.v1alpha.GetR"
          + "esourceAllowanceRequest\032-.google.cloud.b"
          + "atch.v1alpha.ResourceAllowance\"J\332A\004name\202"
          + "\323\344\223\002=\022;/v1alpha/{name=projects/*/locatio"
          + "ns/*/resourceAllowances/*}\022\211\002\n\027DeleteRes"
          + "ourceAllowance\022:.google.cloud.batch.v1al"
          + "pha.DeleteResourceAllowanceRequest\032\035.goo"
          + "gle.longrunning.Operation\"\222\001\312AE\n\025google."
          + "protobuf.Empty\022,google.cloud.batch.v1alp"
          + "ha.OperationMetadata\332A\004name\202\323\344\223\002=*;/v1al"
          + "pha/{name=projects/*/locations/*/resourc"
          + "eAllowances/*}\022\335\001\n\026ListResourceAllowance"
          + "s\0229.google.cloud.batch.v1alpha.ListResou"
          + "rceAllowancesRequest\032:.google.cloud.batc"
          + "h.v1alpha.ListResourceAllowancesResponse"
          + "\"L\332A\006parent\202\323\344\223\002=\022;/v1alpha/{parent=proj"
          + "ects/*/locations/*}/resourceAllowances\022\222"
          + "\002\n\027UpdateResourceAllowance\022:.google.clou"
          + "d.batch.v1alpha.UpdateResourceAllowanceR"
          + "equest\032-.google.cloud.batch.v1alpha.Reso"
          + "urceAllowance\"\213\001\332A\036resource_allowance,up"
          + "date_mask\202\323\344\223\002d2N/v1alpha/{resource_allo"
          + "wance.name=projects/*/locations/*/resour"
          + "ceAllowances/*}:\022resource_allowance\032H\312A\024"
          + "batch.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\304\001\n\036com.go"
          + "ogle.cloud.batch.v1alphaB\nBatchProtoP\001Z4"
          + "cloud.google.com/go/batch/apiv1alpha/bat"
          + "chpb;batchpb\242\002\003GCB\252\002\032Google.Cloud.Batch."
          + "V1Alpha\312\002\032Google\\Cloud\\Batch\\V1alpha\352\002\035G"
          + "oogle::Cloud::Batch::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.JobProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.ResourceAllowanceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.TaskProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "JobId", "Job", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "Reason", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_ListTasksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_ListTasksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor,
            new java.lang.String[] {
              "Tasks", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1alpha_GetTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ResourceAllowanceId", "ResourceAllowance", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "Reason", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor,
            new java.lang.String[] {
              "ResourceAllowances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "ResourceAllowance", "UpdateMask", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_batch_v1alpha_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.JobProto.getDescriptor();
    com.google.cloud.batch.v1alpha.ResourceAllowanceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.TaskProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
