/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/saved_query.proto

package com.google.cloud.aiplatform.v1beta1;

public final class SavedQueryProto {
  private SavedQueryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SavedQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SavedQuery_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/saved_"
          + "query.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032\034google/protobu"
          + "f/struct.proto\032\037google/protobuf/timestam"
          + "p.proto\"\356\003\n\nSavedQuery\022\022\n\004name\030\001 \001(\tB\004\342A"
          + "\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022(\n\010metada"
          + "ta\030\014 \001(\0132\026.google.protobuf.Value\0225\n\013crea"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0225\n\013update_time\030\004 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\037\n\021annotation_fil"
          + "ter\030\005 \001(\tB\004\342A\001\003\022\032\n\014problem_type\030\006 \001(\tB\004\342"
          + "A\001\002\022#\n\025annotation_spec_count\030\n \001(\005B\004\342A\001\003"
          + "\022\014\n\004etag\030\010 \001(\t\022%\n\027support_automl_trainin"
          + "g\030\t \001(\010B\004\342A\001\003:\200\001\352A}\n$aiplatform.googleap"
          + "is.com/SavedQuery\022Uprojects/{project}/lo"
          + "cations/{location}/datasets/{dataset}/sa"
          + "vedQueries/{saved_query}B\346\001\n#com.google."
          + "cloud.aiplatform.v1beta1B\017SavedQueryProt"
          + "oP\001ZCcloud.google.com/go/aiplatform/apiv"
          + "1beta1/aiplatformpb;aiplatformpb\252\002\037Googl"
          + "e.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clou"
          + "d\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AI"
          + "Platform::V1beta1b\006proto3"
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
    internal_static_google_cloud_aiplatform_v1beta1_SavedQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SavedQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SavedQuery_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Metadata",
              "CreateTime",
              "UpdateTime",
              "AnnotationFilter",
              "ProblemType",
              "AnnotationSpecCount",
              "Etag",
              "SupportAutomlTraining",
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
