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
// source: google/cloud/aiplatform/v1/notebook_execution_job.proto

package com.google.cloud.aiplatform.v1;

public final class NotebookExecutionJobProto {
  private NotebookExecutionJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DataformRepositorySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DataformRepositorySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_GcsNotebookSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_GcsNotebookSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DirectNotebookSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DirectNotebookSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1/notebook_ex"
          + "ecution_job.proto\022\032google.cloud.aiplatfo"
          + "rm.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\0320google/cloud/"
          + "aiplatform/v1/encryption_spec.proto\032*goo"
          + "gle/cloud/aiplatform/v1/job_state.proto\032"
          + "\036google/protobuf/duration.proto\032\037google/"
          + "protobuf/timestamp.proto\032\027google/rpc/sta"
          + "tus.proto\"\222\014\n\024NotebookExecutionJob\022o\n\032da"
          + "taform_repository_source\030\003 \001(\0132I.google."
          + "cloud.aiplatform.v1.NotebookExecutionJob"
          + ".DataformRepositorySourceH\000\022a\n\023gcs_noteb"
          + "ook_source\030\004 \001(\0132B.google.cloud.aiplatfo"
          + "rm.v1.NotebookExecutionJob.GcsNotebookSo"
          + "urceH\000\022g\n\026direct_notebook_source\030\021 \001(\0132E"
          + ".google.cloud.aiplatform.v1.NotebookExec"
          + "utionJob.DirectNotebookSourceH\000\022i\n\'noteb"
          + "ook_runtime_template_resource_name\030\016 \001(\t"
          + "B6\372A3\n1aiplatform.googleapis.com/Noteboo"
          + "kRuntimeTemplateH\001\022\030\n\016gcs_output_uri\030\010 \001"
          + "(\tH\002\022\030\n\016execution_user\030\t \001(\tH\003\022\031\n\017servic"
          + "e_account\030\022 \001(\tH\003\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014"
          + "display_name\030\002 \001(\t\0224\n\021execution_timeout\030"
          + "\005 \001(\0132\031.google.protobuf.Duration\022J\n\026sche"
          + "dule_resource_name\030\006 \001(\tB*\340A\003\372A$\n\"aiplat"
          + "form.googleapis.com/Schedule\022<\n\tjob_stat"
          + "e\030\n \001(\0162$.google.cloud.aiplatform.v1.Job"
          + "StateB\003\340A\003\022\'\n\006status\030\013 \001(\0132\022.google.rpc."
          + "StatusB\003\340A\003\0224\n\013create_time\030\014 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time"
          + "\030\r \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "L\n\006labels\030\023 \003(\0132<.google.cloud.aiplatfor"
          + "m.v1.NotebookExecutionJob.LabelsEntry\022C\n"
          + "\017encryption_spec\030\026 \001(\0132*.google.cloud.ai"
          + "platform.v1.EncryptionSpec\032Y\n\030DataformRe"
          + "positorySource\022)\n!dataform_repository_re"
          + "source_name\030\001 \001(\t\022\022\n\ncommit_sha\030\002 \001(\t\0324\n"
          + "\021GcsNotebookSource\022\013\n\003uri\030\001 \001(\t\022\022\n\ngener"
          + "ation\030\002 \001(\t\032\'\n\024DirectNotebookSource\022\017\n\007c"
          + "ontent\030\001 \001(\014\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001:\271\001\352A\265\001\n.aiplatform.g"
          + "oogleapis.com/NotebookExecutionJob\022Vproj"
          + "ects/{project}/locations/{location}/note"
          + "bookExecutionJobs/{notebook_execution_jo"
          + "b}*\025notebookExecutionJobs2\024notebookExecu"
          + "tionJobB\021\n\017notebook_sourceB\022\n\020environmen"
          + "t_specB\020\n\016execution_sinkB\024\n\022execution_id"
          + "entityB\327\001\n\036com.google.cloud.aiplatform.v"
          + "1B\031NotebookExecutionJobProtoP\001Z>cloud.go"
          + "ogle.com/go/aiplatform/apiv1/aiplatformp"
          + "b;aiplatformpb\252\002\032Google.Cloud.AIPlatform"
          + ".V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Googl"
          + "e::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor,
            new java.lang.String[] {
              "DataformRepositorySource",
              "GcsNotebookSource",
              "DirectNotebookSource",
              "NotebookRuntimeTemplateResourceName",
              "GcsOutputUri",
              "ExecutionUser",
              "ServiceAccount",
              "Name",
              "DisplayName",
              "ExecutionTimeout",
              "ScheduleResourceName",
              "JobState",
              "Status",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
              "NotebookSource",
              "EnvironmentSpec",
              "ExecutionSink",
              "ExecutionIdentity",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DataformRepositorySource_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DataformRepositorySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DataformRepositorySource_descriptor,
            new java.lang.String[] {
              "DataformRepositoryResourceName", "CommitSha",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_GcsNotebookSource_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_GcsNotebookSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_GcsNotebookSource_descriptor,
            new java.lang.String[] {
              "Uri", "Generation",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DirectNotebookSource_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DirectNotebookSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_DirectNotebookSource_descriptor,
            new java.lang.String[] {
              "Content",
            });
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NotebookExecutionJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
