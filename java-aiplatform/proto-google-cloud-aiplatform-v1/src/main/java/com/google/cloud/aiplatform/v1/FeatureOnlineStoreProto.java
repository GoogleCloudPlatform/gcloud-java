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
// source: google/cloud/aiplatform/v1/feature_online_store.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureOnlineStoreProto {
  private FeatureOnlineStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/feature_onl"
          + "ine_store.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\0320google/cloud/ai"
          + "platform/v1/encryption_spec.proto\0323googl"
          + "e/cloud/aiplatform/v1/service_networking"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\211\013\n\022FeatureOnlineStore\022K\n\010bigtable\030\010 \001(\013"
          + "27.google.cloud.aiplatform.v1.FeatureOnl"
          + "ineStore.BigtableH\000\022M\n\toptimized\030\014 \001(\01328"
          + ".google.cloud.aiplatform.v1.FeatureOnlin"
          + "eStore.OptimizedH\000\022\021\n\004name\030\001 \001(\tB\003\340A\010\0224\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\022\021\n\004etag\030\005 \001(\tB"
          + "\003\340A\001\022O\n\006labels\030\006 \003(\0132:.google.cloud.aipl"
          + "atform.v1.FeatureOnlineStore.LabelsEntry"
          + "B\003\340A\001\022H\n\005state\030\007 \001(\01624.google.cloud.aipl"
          + "atform.v1.FeatureOnlineStore.StateB\003\340A\003\022"
          + "p\n\032dedicated_serving_endpoint\030\n \001(\0132G.go"
          + "ogle.cloud.aiplatform.v1.FeatureOnlineSt"
          + "ore.DedicatedServingEndpointB\003\340A\001\022H\n\017enc"
          + "ryption_spec\030\r \001(\0132*.google.cloud.aiplat"
          + "form.v1.EncryptionSpecB\003\340A\001\022\032\n\rsatisfies"
          + "_pzs\030\017 \001(\010B\003\340A\003\022\032\n\rsatisfies_pzi\030\020 \001(\010B\003"
          + "\340A\003\032\330\001\n\010Bigtable\022^\n\014auto_scaling\030\001 \001(\0132C"
          + ".google.cloud.aiplatform.v1.FeatureOnlin"
          + "eStore.Bigtable.AutoScalingB\003\340A\002\032l\n\013Auto"
          + "Scaling\022\033\n\016min_node_count\030\001 \001(\005B\003\340A\002\022\033\n\016"
          + "max_node_count\030\002 \001(\005B\003\340A\002\022#\n\026cpu_utiliza"
          + "tion_target\030\003 \001(\005B\003\340A\001\032\013\n\tOptimized\032\313\001\n\030"
          + "DedicatedServingEndpoint\022(\n\033public_endpo"
          + "int_domain_name\030\002 \001(\tB\003\340A\003\022d\n\036private_se"
          + "rvice_connect_config\030\003 \001(\01327.google.clou"
          + "d.aiplatform.v1.PrivateServiceConnectCon"
          + "figB\003\340A\001\022\037\n\022service_attachment\030\004 \001(\tB\003\340A"
          + "\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"8\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000"
          + "\022\n\n\006STABLE\020\001\022\014\n\010UPDATING\020\002:\206\001\352A\202\001\n,aipla"
          + "tform.googleapis.com/FeatureOnlineStore\022"
          + "Rprojects/{project}/locations/{location}"
          + "/featureOnlineStores/{feature_online_sto"
          + "re}B\016\n\014storage_typeB\325\001\n\036com.google.cloud"
          + ".aiplatform.v1B\027FeatureOnlineStoreProtoP"
          + "\001Z>cloud.google.com/go/aiplatform/apiv1/"
          + "aiplatformpb;aiplatformpb\252\002\032Google.Cloud"
          + ".AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform"
          + "\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor,
            new java.lang.String[] {
              "Bigtable",
              "Optimized",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "State",
              "DedicatedServingEndpoint",
              "EncryptionSpec",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "StorageType",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor,
            new java.lang.String[] {
              "AutoScaling",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor,
            new java.lang.String[] {
              "MinNodeCount", "MaxNodeCount", "CpuUtilizationTarget",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor,
            new java.lang.String[] {
              "PublicEndpointDomainName", "PrivateServiceConnectConfig", "ServiceAttachment",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
