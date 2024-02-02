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
// source: google/cloud/aiplatform/v1/execution.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ExecutionProto {
  private ExecutionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Execution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/aiplatform/v1/execution.p"
          + "roto\022\032google.cloud.aiplatform.v1\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032\034google/protobuf/struct.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\304\005\n\t"
          + "Execution\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\024\n\014display"
          + "_name\030\002 \001(\t\022:\n\005state\030\006 \001(\0162+.google.clou"
          + "d.aiplatform.v1.Execution.State\022\014\n\004etag\030"
          + "\t \001(\t\022A\n\006labels\030\n \003(\01321.google.cloud.aip"
          + "latform.v1.Execution.LabelsEntry\0225\n\013crea"
          + "te_time\030\013 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0225\n\013update_time\030\014 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\024\n\014schema_title\030\r"
          + " \001(\t\022\026\n\016schema_version\030\016 \001(\t\022)\n\010metadata"
          + "\030\017 \001(\0132\027.google.protobuf.Struct\022\023\n\013descr"
          + "iption\030\020 \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"i\n\005State\022\025\n\021STATE_UN"
          + "SPECIFIED\020\000\022\007\n\003NEW\020\001\022\013\n\007RUNNING\020\002\022\014\n\010COM"
          + "PLETE\020\003\022\n\n\006FAILED\020\004\022\n\n\006CACHED\020\005\022\r\n\tCANCE"
          + "LLED\020\006:\211\001\352A\205\001\n#aiplatform.googleapis.com"
          + "/Execution\022^projects/{project}/locations"
          + "/{location}/metadataStores/{metadata_sto"
          + "re}/executions/{execution}B\314\001\n\036com.googl"
          + "e.cloud.aiplatform.v1B\016ExecutionProtoP\001Z"
          + ">cloud.google.com/go/aiplatform/apiv1/ai"
          + "platformpb;aiplatformpb\252\002\032Google.Cloud.A"
          + "IPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V"
          + "1\352\002\035Google::Cloud::AIPlatform::V1b\006proto"
          + "3"
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
    internal_static_google_cloud_aiplatform_v1_Execution_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Execution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Execution_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "State",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "SchemaTitle",
              "SchemaVersion",
              "Metadata",
              "Description",
            });
    internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Execution_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Execution_LabelsEntry_descriptor,
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
