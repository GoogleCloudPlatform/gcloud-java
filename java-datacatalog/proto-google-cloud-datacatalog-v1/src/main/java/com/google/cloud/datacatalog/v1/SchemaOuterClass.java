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
// source: google/cloud/datacatalog/v1/schema.proto

package com.google.cloud.datacatalog.v1;

public final class SchemaOuterClass {
  private SchemaOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_LookerColumnSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_LookerColumnSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/datacatalog/v1/schema.pro"
          + "to\022\033google.cloud.datacatalog.v1\032\037google/"
          + "api/field_behavior.proto\"D\n\006Schema\022:\n\007co"
          + "lumns\030\002 \003(\0132).google.cloud.datacatalog.v"
          + "1.ColumnSchema\"\321\006\n\014ColumnSchema\022\023\n\006colum"
          + "n\030\006 \001(\tB\003\340A\002\022\021\n\004type\030\001 \001(\tB\003\340A\002\022\030\n\013descr"
          + "iption\030\002 \001(\tB\003\340A\001\022\021\n\004mode\030\003 \001(\tB\003\340A\001\022\032\n\r"
          + "default_value\030\010 \001(\tB\003\340A\001\022\035\n\020ordinal_posi"
          + "tion\030\t \001(\005B\003\340A\001\022Z\n\025highest_indexing_type"
          + "\030\n \001(\01626.google.cloud.datacatalog.v1.Col"
          + "umnSchema.IndexingTypeB\003\340A\001\022B\n\nsubcolumn"
          + "s\030\007 \003(\0132).google.cloud.datacatalog.v1.Co"
          + "lumnSchemaB\003\340A\001\022X\n\022looker_column_spec\030\022 "
          + "\001(\0132:.google.cloud.datacatalog.v1.Column"
          + "Schema.LookerColumnSpecH\000\022\024\n\007gc_rule\030\013 \001"
          + "(\tB\003\340A\001\032\362\001\n\020LookerColumnSpec\022Y\n\004type\030\001 \001"
          + "(\0162K.google.cloud.datacatalog.v1.ColumnS"
          + "chema.LookerColumnSpec.LookerColumnType\""
          + "\202\001\n\020LookerColumnType\022\"\n\036LOOKER_COLUMN_TY"
          + "PE_UNSPECIFIED\020\000\022\r\n\tDIMENSION\020\001\022\023\n\017DIMEN"
          + "SION_GROUP\020\002\022\n\n\006FILTER\020\003\022\013\n\007MEASURE\020\004\022\r\n"
          + "\tPARAMETER\020\005\"\234\001\n\014IndexingType\022\035\n\031INDEXIN"
          + "G_TYPE_UNSPECIFIED\020\000\022\026\n\022INDEXING_TYPE_NO"
          + "NE\020\001\022\034\n\030INDEXING_TYPE_NON_UNIQUE\020\002\022\030\n\024IN"
          + "DEXING_TYPE_UNIQUE\020\003\022\035\n\031INDEXING_TYPE_PR"
          + "IMARY_KEY\020\004B\r\n\013system_specB\306\001\n\037com.googl"
          + "e.cloud.datacatalog.v1P\001ZAcloud.google.c"
          + "om/go/datacatalog/apiv1/datacatalogpb;da"
          + "tacatalogpb\370\001\001\252\002\033Google.Cloud.DataCatalo"
          + "g.V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Goo"
          + "gle::Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Schema_descriptor,
            new java.lang.String[] {
              "Columns",
            });
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor,
            new java.lang.String[] {
              "Column",
              "Type",
              "Description",
              "Mode",
              "DefaultValue",
              "OrdinalPosition",
              "HighestIndexingType",
              "Subcolumns",
              "LookerColumnSpec",
              "GcRule",
              "SystemSpec",
            });
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_LookerColumnSpec_descriptor =
        internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_LookerColumnSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ColumnSchema_LookerColumnSpec_descriptor,
            new java.lang.String[] {
              "Type",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
