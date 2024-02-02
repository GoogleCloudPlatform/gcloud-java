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

// Protobuf Java Version: 3.25.2
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
          + "f/timestamp.proto\"\314\004\n\013Tensorboard\022\022\n\004nam"
          + "e\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001"
          + "\002\022\023\n\013description\030\003 \001(\t\022C\n\017encryption_spe"
          + "c\030\013 \001(\0132*.google.cloud.aiplatform.v1.Enc"
          + "ryptionSpec\022&\n\030blob_storage_path_prefix\030"
          + "\n \001(\tB\004\342A\001\003\022\027\n\trun_count\030\005 \001(\005B\004\342A\001\003\0225\n\013"
          + "create_time\030\006 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\003\0225\n\013update_time\030\007 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\004\342A\001\003\022C\n\006labels\030\010 \003"
          + "(\01323.google.cloud.aiplatform.v1.Tensorbo"
          + "ard.LabelsEntry\022\014\n\004etag\030\t \001(\t\022\022\n\nis_defa"
          + "ult\030\014 \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:n\352Ak\n%aiplatform.google"
          + "apis.com/Tensorboard\022Bprojects/{project}"
          + "/locations/{location}/tensorboards/{tens"
          + "orboard}B\316\001\n\036com.google.cloud.aiplatform"
          + ".v1B\020TensorboardProtoP\001Z>cloud.google.co"
          + "m/go/aiplatform/apiv1/aiplatformpb;aipla"
          + "tformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032G"
          + "oogle\\Cloud\\AIPlatform\\V1\352\002\035Google::Clou"
          + "d::AIPlatform::V1b\006proto3"
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
