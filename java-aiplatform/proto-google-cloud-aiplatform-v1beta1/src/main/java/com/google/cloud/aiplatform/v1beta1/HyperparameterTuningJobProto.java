/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/hyperparameter_tuning_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class HyperparameterTuningJobProto {
  private HyperparameterTuningJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/aiplatform/v1beta1/hyperp"
          + "arameter_tuning_job.proto\022\037google.cloud."
          + "aiplatform.v1beta1\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\0320"
          + "google/cloud/aiplatform/v1beta1/custom_j"
          + "ob.proto\0325google/cloud/aiplatform/v1beta"
          + "1/encryption_spec.proto\032/google/cloud/ai"
          + "platform/v1beta1/job_state.proto\032+google"
          + "/cloud/aiplatform/v1beta1/study.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\032\027google/r"
          + "pc/status.proto\"\231\010\n\027HyperparameterTuning"
          + "Job\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002"
          + " \001(\tB\003\340A\002\022C\n\nstudy_spec\030\004 \001(\0132*.google.c"
          + "loud.aiplatform.v1beta1.StudySpecB\003\340A\002\022\034"
          + "\n\017max_trial_count\030\005 \001(\005B\003\340A\002\022!\n\024parallel"
          + "_trial_count\030\006 \001(\005B\003\340A\002\022\036\n\026max_failed_tr"
          + "ial_count\030\007 \001(\005\022K\n\016trial_job_spec\030\010 \001(\0132"
          + "..google.cloud.aiplatform.v1beta1.Custom"
          + "JobSpecB\003\340A\002\022;\n\006trials\030\t \003(\0132&.google.cl"
          + "oud.aiplatform.v1beta1.TrialB\003\340A\003\022=\n\005sta"
          + "te\030\n \001(\0162).google.cloud.aiplatform.v1bet"
          + "a1.JobStateB\003\340A\003\0224\n\013create_time\030\013 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0223\n\nstart_"
          + "time\030\014 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0221\n\010end_time\030\r \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\0224\n\013update_time\030\016 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\022&\n\005error\030\017 "
          + "\001(\0132\022.google.rpc.StatusB\003\340A\003\022T\n\006labels\030\020"
          + " \003(\0132D.google.cloud.aiplatform.v1beta1.H"
          + "yperparameterTuningJob.LabelsEntry\022H\n\017en"
          + "cryption_spec\030\021 \001(\0132/.google.cloud.aipla"
          + "tform.v1beta1.EncryptionSpec\032-\n\013LabelsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\225\001\352A"
          + "\221\001\n1aiplatform.googleapis.com/Hyperparam"
          + "eterTuningJob\022\\projects/{project}/locati"
          + "ons/{location}/hyperparameterTuningJobs/"
          + "{hyperparameter_tuning_job}B\363\001\n#com.goog"
          + "le.cloud.aiplatform.v1beta1B\034Hyperparame"
          + "terTuningJobProtoP\001ZCcloud.google.com/go"
          + "/aiplatform/apiv1beta1/aiplatformpb;aipl"
          + "atformpb\252\002\037Google.Cloud.AIPlatform.V1Bet"
          + "a1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"G"
          + "oogle::Cloud::AIPlatform::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.CustomJobProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.StudyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "StudySpec",
              "MaxTrialCount",
              "ParallelTrialCount",
              "MaxFailedTrialCount",
              "TrialJobSpec",
              "Trials",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_HyperparameterTuningJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.CustomJobProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.StudyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
