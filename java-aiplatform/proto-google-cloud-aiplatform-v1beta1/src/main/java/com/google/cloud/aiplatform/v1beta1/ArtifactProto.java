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
// source: google/cloud/aiplatform/v1beta1/artifact.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ArtifactProto {
  private ArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Artifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Artifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Artifact_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Artifact_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1beta1/artifa"
          + "ct.proto\022\037google.cloud.aiplatform.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\236\005\n\010Artifact\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014"
          + "display_name\030\002 \001(\t\022\013\n\003uri\030\006 \001(\t\022\014\n\004etag\030"
          + "\t \001(\t\022E\n\006labels\030\n \003(\01325.google.cloud.aip"
          + "latform.v1beta1.Artifact.LabelsEntry\0224\n\013"
          + "create_time\030\013 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0224\n\013update_time\030\014 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\022>\n\005state\030\r \001(\0162"
          + "/.google.cloud.aiplatform.v1beta1.Artifa"
          + "ct.State\022\024\n\014schema_title\030\016 \001(\t\022\026\n\016schema"
          + "_version\030\017 \001(\t\022)\n\010metadata\030\020 \001(\0132\027.googl"
          + "e.protobuf.Struct\022\023\n\013description\030\021 \001(\t\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"5\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007PENDING\020\001\022\010\n\004LIVE\020\002:\206\001\352A\202\001\n\"aiplatform."
          + "googleapis.com/Artifact\022\\projects/{proje"
          + "ct}/locations/{location}/metadataStores/"
          + "{metadata_store}/artifacts/{artifact}B\344\001"
          + "\n#com.google.cloud.aiplatform.v1beta1B\rA"
          + "rtifactProtoP\001ZCcloud.google.com/go/aipl"
          + "atform/apiv1beta1/aiplatformpb;aiplatfor"
          + "mpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037"
          + "Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google"
          + "::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Artifact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Artifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Artifact_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Uri",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "State",
              "SchemaTitle",
              "SchemaVersion",
              "Metadata",
              "Description",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Artifact_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Artifact_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Artifact_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Artifact_LabelsEntry_descriptor,
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
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
