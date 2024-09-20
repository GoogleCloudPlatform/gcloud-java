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
// source: google/cloud/aiplatform/v1/tensorboard.proto

package com.google.cloud.aiplatform.v1;

public final class TensorboardProto {
  private TensorboardProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tensorboard_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tensorboard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tensorboard_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tensorboard_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/aiplatform/v1/tensorboard"
          + ".proto\022\032google.cloud.aiplatform.v1\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\0320google/cloud/aiplatform/"
          + "v1/encryption_spec.proto\032\037google/protobu"
          + "f/timestamp.proto\"\376\004\n\013Tensorboard\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022"
          + "\023\n\013description\030\003 \001(\t\022C\n\017encryption_spec\030"
          + "\013 \001(\0132*.google.cloud.aiplatform.v1.Encry"
          + "ptionSpec\022%\n\030blob_storage_path_prefix\030\n "
          + "\001(\tB\003\340A\003\022\026\n\trun_count\030\005 \001(\005B\003\340A\003\0224\n\013crea"
          + "te_time\030\006 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\0224\n\013update_time\030\007 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022C\n\006labels\030\010 \003(\01323.g"
          + "oogle.cloud.aiplatform.v1.Tensorboard.La"
          + "belsEntry\022\014\n\004etag\030\t \001(\t\022\022\n\nis_default\030\014 "
          + "\001(\010\022\032\n\rsatisfies_pzs\030\r \001(\010B\003\340A\003\022\032\n\rsatis"
          + "fies_pzi\030\016 \001(\010B\003\340A\003\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:n\352Ak\n%aiplatf"
          + "orm.googleapis.com/Tensorboard\022Bprojects"
          + "/{project}/locations/{location}/tensorbo"
          + "ards/{tensorboard}B\316\001\n\036com.google.cloud."
          + "aiplatform.v1B\020TensorboardProtoP\001Z>cloud"
          + ".google.com/go/aiplatform/apiv1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Tensorboard_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tensorboard_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tensorboard_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "EncryptionSpec",
              "BlobStoragePathPrefix",
              "RunCount",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "IsDefault",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_Tensorboard_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Tensorboard_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tensorboard_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tensorboard_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
