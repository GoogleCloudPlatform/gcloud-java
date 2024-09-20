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
// source: google/cloud/aiplatform/v1beta1/feature.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeatureProto {
  private FeatureProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/featur"
          + "e.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032>google/cloud/aipla"
          + "tform/v1beta1/feature_monitoring_stats.p"
          + "roto\032=google/cloud/aiplatform/v1beta1/fe"
          + "aturestore_monitoring.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\333\013\n\007Feature\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\005\022\023\n\013description\030\002 \001(\t\022K\n\nvalu"
          + "e_type\030\003 \001(\01622.google.cloud.aiplatform.v"
          + "1beta1.Feature.ValueTypeB\003\340A\005\0224\n\013create_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013update_time\030\005 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022I\n\006labels\030\006 \003(\01324.goog"
          + "le.cloud.aiplatform.v1beta1.Feature.Labe"
          + "lsEntryB\003\340A\001\022\014\n\004etag\030\007 \001(\t\022_\n\021monitoring"
          + "_config\030\t \001(\0132=.google.cloud.aiplatform."
          + "v1beta1.FeaturestoreMonitoringConfigB\005\030\001"
          + "\340A\001\022\037\n\022disable_monitoring\030\014 \001(\010B\003\340A\001\022S\n\020"
          + "monitoring_stats\030\n \003(\01324.google.cloud.ai"
          + "platform.v1beta1.FeatureStatsAnomalyB\003\340A"
          + "\003\022h\n\032monitoring_stats_anomalies\030\013 \003(\0132?."
          + "google.cloud.aiplatform.v1beta1.Feature."
          + "MonitoringStatsAnomalyB\003\340A\003\022\033\n\023version_c"
          + "olumn_name\030j \001(\t\022\030\n\020point_of_contact\030k \001"
          + "(\t\032\261\002\n\026MonitoringStatsAnomaly\022a\n\tobjecti"
          + "ve\030\001 \001(\0162I.google.cloud.aiplatform.v1bet"
          + "a1.Feature.MonitoringStatsAnomaly.Object"
          + "iveB\003\340A\003\022X\n\025feature_stats_anomaly\030\002 \001(\0132"
          + "4.google.cloud.aiplatform.v1beta1.Featur"
          + "eStatsAnomalyB\003\340A\003\"Z\n\tObjective\022\031\n\025OBJEC"
          + "TIVE_UNSPECIFIED\020\000\022\033\n\027IMPORT_FEATURE_ANA"
          + "LYSIS\020\001\022\025\n\021SNAPSHOT_ANALYSIS\020\002\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\260\001"
          + "\n\tValueType\022\032\n\026VALUE_TYPE_UNSPECIFIED\020\000\022"
          + "\010\n\004BOOL\020\001\022\016\n\nBOOL_ARRAY\020\002\022\n\n\006DOUBLE\020\003\022\020\n"
          + "\014DOUBLE_ARRAY\020\004\022\t\n\005INT64\020\t\022\017\n\013INT64_ARRA"
          + "Y\020\n\022\n\n\006STRING\020\013\022\020\n\014STRING_ARRAY\020\014\022\t\n\005BYT"
          + "ES\020\r\022\n\n\006STRUCT\020\016:\207\002\352A\203\002\n!aiplatform.goog"
          + "leapis.com/Feature\022qprojects/{project}/l"
          + "ocations/{location}/featurestores/{featu"
          + "restore}/entityTypes/{entity_type}/featu"
          + "res/{feature}\022Xprojects/{project}/locati"
          + "ons/{location}/featureGroups/{feature_gr"
          + "oup}/features/{feature}*\010features2\007featu"
          + "reB\343\001\n#com.google.cloud.aiplatform.v1bet"
          + "a1B\014FeatureProtoP\001ZCcloud.google.com/go/"
          + "aiplatform/apiv1beta1/aiplatformpb;aipla"
          + "tformpb\252\002\037Google.Cloud.AIPlatform.V1Beta"
          + "1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Go"
          + "ogle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "ValueType",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "MonitoringConfig",
              "DisableMonitoring",
              "MonitoringStats",
              "MonitoringStatsAnomalies",
              "VersionColumnName",
              "PointOfContact",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Feature_MonitoringStatsAnomaly_descriptor,
            new java.lang.String[] {
              "Objective", "FeatureStatsAnomaly",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Feature_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Feature_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
