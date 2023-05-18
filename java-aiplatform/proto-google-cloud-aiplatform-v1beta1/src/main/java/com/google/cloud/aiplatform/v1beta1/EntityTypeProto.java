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
// source: google/cloud/aiplatform/v1beta1/entity_type.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1beta1/entity"
          + "_type.proto\022\037google.cloud.aiplatform.v1b"
          + "eta1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\032=google/cloud/a"
          + "iplatform/v1beta1/featurestore_monitorin"
          + "g.proto\032\037google/protobuf/timestamp.proto"
          + "\"\310\004\n\nEntityType\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\030\n\013de"
          + "scription\030\002 \001(\tB\003\340A\001\0224\n\013create_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022L\n\006labels\030\006 \003(\01327.google.cloud."
          + "aiplatform.v1beta1.EntityType.LabelsEntr"
          + "yB\003\340A\001\022\021\n\004etag\030\007 \001(\tB\003\340A\001\022]\n\021monitoring_"
          + "config\030\010 \001(\0132=.google.cloud.aiplatform.v"
          + "1beta1.FeaturestoreMonitoringConfigB\003\340A\001"
          + "\022%\n\030offline_storage_ttl_days\030\n \001(\005B\003\340A\001\032"
          + "-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001:\212\001\352A\206\001\n$aiplatform.googleapis.com"
          + "/EntityType\022^projects/{project}/location"
          + "s/{location}/featurestores/{featurestore"
          + "}/entityTypes/{entity_type}B\346\001\n#com.goog"
          + "le.cloud.aiplatform.v1beta1B\017EntityTypeP"
          + "rotoP\001ZCcloud.google.com/go/aiplatform/a"
          + "piv1beta1/aiplatformpb;aiplatformpb\252\002\037Go"
          + "ogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\C"
          + "loud\\AIPlatform\\V1beta1\352\002\"Google::Cloud:"
          + ":AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "MonitoringConfig",
              "OfflineStorageTtlDays",
            });
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_EntityType_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
