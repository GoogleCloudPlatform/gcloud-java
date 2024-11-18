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
// source: google/cloud/alloydb/v1alpha/data_model.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public final class DataModelProto {
  private DataModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1alpha_SqlResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1alpha_SqlResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1alpha_SqlResultColumn_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1alpha_SqlResultColumn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1alpha_SqlResultRow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1alpha_SqlResultRow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1alpha_SqlResultValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1alpha_SqlResultValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/alloydb/v1alpha/data_mode"
          + "l.proto\022\034google.cloud.alloydb.v1alpha\"\205\001"
          + "\n\tSqlResult\022>\n\007columns\030\001 \003(\0132-.google.cl"
          + "oud.alloydb.v1alpha.SqlResultColumn\0228\n\004r"
          + "ows\030\002 \003(\0132*.google.cloud.alloydb.v1alpha"
          + ".SqlResultRow\"-\n\017SqlResultColumn\022\014\n\004name"
          + "\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"L\n\014SqlResultRow\022<\n\006"
          + "values\030\001 \003(\0132,.google.cloud.alloydb.v1al"
          + "pha.SqlResultValue\"V\n\016SqlResultValue\022\022\n\005"
          + "value\030\001 \001(\tH\000\210\001\001\022\027\n\nnull_value\030\002 \001(\010H\001\210\001"
          + "\001B\010\n\006_valueB\r\n\013_null_valueB\320\001\n com.googl"
          + "e.cloud.alloydb.v1alphaB\016DataModelProtoP"
          + "\001Z:cloud.google.com/go/alloydb/apiv1alph"
          + "a/alloydbpb;alloydbpb\252\002\034Google.Cloud.All"
          + "oyDb.V1Alpha\312\002\034Google\\Cloud\\AlloyDb\\V1al"
          + "pha\352\002\037Google::Cloud::AlloyDB::V1alphab\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_alloydb_v1alpha_SqlResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_alloydb_v1alpha_SqlResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1alpha_SqlResult_descriptor,
            new java.lang.String[] {
              "Columns", "Rows",
            });
    internal_static_google_cloud_alloydb_v1alpha_SqlResultColumn_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_alloydb_v1alpha_SqlResultColumn_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1alpha_SqlResultColumn_descriptor,
            new java.lang.String[] {
              "Name", "Type",
            });
    internal_static_google_cloud_alloydb_v1alpha_SqlResultRow_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_alloydb_v1alpha_SqlResultRow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1alpha_SqlResultRow_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_alloydb_v1alpha_SqlResultValue_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_alloydb_v1alpha_SqlResultValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1alpha_SqlResultValue_descriptor,
            new java.lang.String[] {
              "Value", "NullValue",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
