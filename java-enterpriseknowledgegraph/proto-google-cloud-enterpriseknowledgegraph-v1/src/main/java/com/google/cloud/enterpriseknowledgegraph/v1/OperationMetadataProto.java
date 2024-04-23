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
// source: google/cloud/enterpriseknowledgegraph/v1/operation_metadata.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.enterpriseknowledgegraph.v1;

public final class OperationMetadataProto {
  private OperationMetadataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_enterpriseknowledgegraph_v1_CommonOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_enterpriseknowledgegraph_v1_CommonOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/enterpriseknowledgegraph/"
          + "v1/operation_metadata.proto\022(google.clou"
          + "d.enterpriseknowledgegraph.v1\032\037google/pr"
          + "otobuf/timestamp.proto\"\307\002\n\027CommonOperati"
          + "onMetadata\022V\n\005state\030\001 \001(\0162G.google.cloud"
          + ".enterpriseknowledgegraph.v1.CommonOpera"
          + "tionMetadata.State\022/\n\013create_time\030\002 \001(\0132"
          + "\032.google.protobuf.Timestamp\022/\n\013update_ti"
          + "me\030\003 \001(\0132\032.google.protobuf.Timestamp\"r\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RUNNING\020"
          + "\001\022\016\n\nCANCELLING\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n\006FAIL"
          + "ED\020\004\022\r\n\tCANCELLED\020\005\022\013\n\007PENDING\020\006B\266\002\n,com"
          + ".google.cloud.enterpriseknowledgegraph.v"
          + "1B\026OperationMetadataProtoP\001Zhcloud.googl"
          + "e.com/go/enterpriseknowledgegraph/apiv1/"
          + "enterpriseknowledgegraphpb;enterprisekno"
          + "wledgegraphpb\252\002(Google.Cloud.EnterpriseK"
          + "nowledgeGraph.V1\312\002(Google\\Cloud\\Enterpri"
          + "seKnowledgeGraph\\V1\352\002+Google::Cloud::Ent"
          + "erpriseKnowledgeGraph::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_enterpriseknowledgegraph_v1_CommonOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_enterpriseknowledgegraph_v1_CommonOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_enterpriseknowledgegraph_v1_CommonOperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
