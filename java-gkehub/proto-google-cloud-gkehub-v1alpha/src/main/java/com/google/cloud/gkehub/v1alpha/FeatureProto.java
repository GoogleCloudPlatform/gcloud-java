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
// source: google/cloud/gkehub/v1alpha/feature.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1alpha;

public final class FeatureProto {
  private FeatureProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_Feature_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_Feature_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipSpecsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipSpecsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipStatesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipStatesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_FeatureResourceState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_FeatureResourceState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_FeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_FeatureState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_CommonFeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_CommonFeatureState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/gkehub/v1alpha/feature.pr"
          + "oto\022\033google.cloud.gkehub.v1alpha\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032Egoogle/cloud/gkehub/v1alph"
          + "a/cloudauditlogging/cloudauditlogging.pr"
          + "oto\032Cgoogle/cloud/gkehub/v1alpha/configm"
          + "anagement/configmanagement.proto\0323google"
          + "/cloud/gkehub/v1alpha/metering/metering."
          + "proto\032Igoogle/cloud/gkehub/v1alpha/multi"
          + "clusteringress/multiclusteringress.proto"
          + "\0329google/cloud/gkehub/v1alpha/servicemes"
          + "h/servicemesh.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\367\007\n\007Feature\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\003\022@\n\006labels\030\002 \003(\01320.google.cloud.gkehu"
          + "b.v1alpha.Feature.LabelsEntry\022N\n\016resourc"
          + "e_state\030\003 \001(\01321.google.cloud.gkehub.v1al"
          + "pha.FeatureResourceStateB\003\340A\003\022A\n\004spec\030\004 "
          + "\001(\0132..google.cloud.gkehub.v1alpha.Common"
          + "FeatureSpecB\003\340A\001\022X\n\020membership_specs\030\005 \003"
          + "(\01329.google.cloud.gkehub.v1alpha.Feature"
          + ".MembershipSpecsEntryB\003\340A\001\022C\n\005state\030\006 \001("
          + "\0132/.google.cloud.gkehub.v1alpha.CommonFe"
          + "atureStateB\003\340A\003\022Z\n\021membership_states\030\007 \003"
          + "(\0132:.google.cloud.gkehub.v1alpha.Feature"
          + ".MembershipStatesEntryB\003\340A\003\0224\n\013create_ti"
          + "me\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\0224\n\013update_time\030\t \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0224\n\013delete_time\030\n \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032j\n\024"
          + "MembershipSpecsEntry\022\013\n\003key\030\001 \001(\t\022A\n\005val"
          + "ue\030\002 \001(\01322.google.cloud.gkehub.v1alpha.M"
          + "embershipFeatureSpec:\0028\001\032l\n\025MembershipSt"
          + "atesEntry\022\013\n\003key\030\001 \001(\t\022B\n\005value\030\002 \001(\01323."
          + "google.cloud.gkehub.v1alpha.MembershipFe"
          + "atureState:\0028\001:^\352A[\n\035gkehub.googleapis.c"
          + "om/Feature\022:projects/{project}/locations"
          + "/{location}/features/{feature}\"\313\001\n\024Featu"
          + "reResourceState\022F\n\005state\030\001 \001(\01627.google."
          + "cloud.gkehub.v1alpha.FeatureResourceStat"
          + "e.State\"k\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022"
          + "\014\n\010ENABLING\020\001\022\n\n\006ACTIVE\020\002\022\r\n\tDISABLING\020\003"
          + "\022\014\n\010UPDATING\020\004\022\024\n\020SERVICE_UPDATING\020\005\"\320\001\n"
          + "\014FeatureState\022<\n\004code\030\001 \001(\0162..google.clo"
          + "ud.gkehub.v1alpha.FeatureState.Code\022\023\n\013d"
          + "escription\030\002 \001(\t\022/\n\013update_time\030\003 \001(\0132\032."
          + "google.protobuf.Timestamp\"<\n\004Code\022\024\n\020COD"
          + "E_UNSPECIFIED\020\000\022\006\n\002OK\020\001\022\013\n\007WARNING\020\002\022\t\n\005"
          + "ERROR\020\003\"\331\001\n\021CommonFeatureSpec\022[\n\023multicl"
          + "usteringress\030f \001(\0132<.google.cloud.gkehub"
          + ".multiclusteringress.v1alpha.FeatureSpec"
          + "H\000\022W\n\021cloudauditlogging\030l \001(\0132:.google.c"
          + "loud.gkehub.cloudauditlogging.v1alpha.Fe"
          + "atureSpecH\000B\016\n\014feature_spec\"\262\001\n\022CommonFe"
          + "atureState\022L\n\013servicemesh\030d \001(\01325.google"
          + ".cloud.gkehub.servicemesh.v1alpha.Featur"
          + "eStateH\000\022=\n\005state\030\001 \001(\0132).google.cloud.g"
          + "kehub.v1alpha.FeatureStateB\003\340A\003B\017\n\rfeatu"
          + "re_state\"\201\001\n\025MembershipFeatureSpec\022X\n\020co"
          + "nfigmanagement\030j \001(\0132<.google.cloud.gkeh"
          + "ub.configmanagement.v1alpha.MembershipSp"
          + "ecH\000B\016\n\014feature_spec\"\332\002\n\026MembershipFeatu"
          + "reState\022O\n\013servicemesh\030d \001(\01328.google.cl"
          + "oud.gkehub.servicemesh.v1alpha.Membershi"
          + "pStateH\000\022I\n\010metering\030h \001(\01325.google.clou"
          + "d.gkehub.metering.v1alpha.MembershipStat"
          + "eH\000\022Y\n\020configmanagement\030j \001(\0132=.google.c"
          + "loud.gkehub.configmanagement.v1alpha.Mem"
          + "bershipStateH\000\0228\n\005state\030\001 \001(\0132).google.c"
          + "loud.gkehub.v1alpha.FeatureStateB\017\n\rfeat"
          + "ure_stateB\307\001\n\037com.google.cloud.gkehub.v1"
          + "alphaB\014FeatureProtoP\001Z7cloud.google.com/"
          + "go/gkehub/apiv1alpha/gkehubpb;gkehubpb\252\002"
          + "\033Google.Cloud.GkeHub.V1Alpha\312\002\033Google\\Cl"
          + "oud\\GkeHub\\V1alpha\352\002\036Google::Cloud::GkeH"
          + "ub::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto
                  .getDescriptor(),
              com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
                  .getDescriptor(),
              com.google.cloud.gkehub.metering.v1alpha.MeteringProto.getDescriptor(),
              com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto
                  .getDescriptor(),
              com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1alpha_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "ResourceState",
              "Spec",
              "MembershipSpecs",
              "State",
              "MembershipStates",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
            });
    internal_static_google_cloud_gkehub_v1alpha_Feature_LabelsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkehub_v1alpha_Feature_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_Feature_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipSpecsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipSpecsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipSpecsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipStatesEntry_descriptor =
        internal_static_google_cloud_gkehub_v1alpha_Feature_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipStatesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_Feature_MembershipStatesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1alpha_FeatureResourceState_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1alpha_FeatureResourceState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_FeatureResourceState_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_gkehub_v1alpha_FeatureState_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1alpha_FeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_FeatureState_descriptor,
            new java.lang.String[] {
              "Code", "Description", "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_CommonFeatureSpec_descriptor,
            new java.lang.String[] {
              "Multiclusteringress", "Cloudauditlogging", "FeatureSpec",
            });
    internal_static_google_cloud_gkehub_v1alpha_CommonFeatureState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1alpha_CommonFeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_CommonFeatureState_descriptor,
            new java.lang.String[] {
              "Servicemesh", "State", "FeatureState",
            });
    internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureSpec_descriptor,
            new java.lang.String[] {
              "Configmanagement", "FeatureSpec",
            });
    internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureState_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_MembershipFeatureState_descriptor,
            new java.lang.String[] {
              "Servicemesh", "Metering", "Configmanagement", "State", "FeatureState",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.getDescriptor();
    com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.getDescriptor();
    com.google.cloud.gkehub.metering.v1alpha.MeteringProto.getDescriptor();
    com.google.cloud.gkehub.multiclusteringress.v1alpha.MultiClusterIngressProto.getDescriptor();
    com.google.cloud.gkehub.servicemesh.v1alpha.ServiceMeshProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
