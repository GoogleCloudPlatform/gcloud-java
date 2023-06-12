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
// source: google/cloud/osconfig/v1/os_policy_assignments.proto

package com.google.cloud.osconfig.v1;

public final class OsPolicyAssignmentsProto {
  private OsPolicyAssignmentsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_Inventory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_Inventory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_Rollout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_Rollout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_UpdateOSPolicyAssignmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_UpdateOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1_DeleteOSPolicyAssignmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1_DeleteOSPolicyAssignmentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/osconfig/v1/os_policy_ass"
          + "ignments.proto\022\030google.cloud.osconfig.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032(google/cloud/oscon"
          + "fig/v1/os_policy.proto\032.google/cloud/osc"
          + "onfig/v1/osconfig_common.proto\032\036google/p"
          + "rotobuf/duration.proto\032 google/protobuf/"
          + "field_mask.proto\032\037google/protobuf/timest"
          + "amp.proto\"\260\013\n\022OSPolicyAssignment\022\014\n\004name"
          + "\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022=\n\013os_polici"
          + "es\030\003 \003(\0132\".google.cloud.osconfig.v1.OSPo"
          + "licyB\004\342A\001\002\022Z\n\017instance_filter\030\004 \001(\0132;.go"
          + "ogle.cloud.osconfig.v1.OSPolicyAssignmen"
          + "t.InstanceFilterB\004\342A\001\002\022K\n\007rollout\030\005 \001(\0132"
          + "4.google.cloud.osconfig.v1.OSPolicyAssig"
          + "nment.RolloutB\004\342A\001\002\022\031\n\013revision_id\030\006 \001(\t"
          + "B\004\342A\001\003\022>\n\024revision_create_time\030\007 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\004\342A\001\003\022\014\n\004etag\030\010"
          + " \001(\t\022V\n\rrollout_state\030\t \001(\01629.google.clo"
          + "ud.osconfig.v1.OSPolicyAssignment.Rollou"
          + "tStateB\004\342A\001\003\022\026\n\010baseline\030\n \001(\010B\004\342A\001\003\022\025\n\007"
          + "deleted\030\013 \001(\010B\004\342A\001\003\022\031\n\013reconciling\030\014 \001(\010"
          + "B\004\342A\001\003\022\021\n\003uid\030\r \001(\tB\004\342A\001\003\032\214\001\n\010LabelSet\022Q"
          + "\n\006labels\030\001 \003(\0132A.google.cloud.osconfig.v"
          + "1.OSPolicyAssignment.LabelSet.LabelsEntr"
          + "y\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\032\331\002\n\016InstanceFilter\022\013\n\003all\030\001 \001(\010"
          + "\022O\n\020inclusion_labels\030\002 \003(\01325.google.clou"
          + "d.osconfig.v1.OSPolicyAssignment.LabelSe"
          + "t\022O\n\020exclusion_labels\030\003 \003(\01325.google.clo"
          + "ud.osconfig.v1.OSPolicyAssignment.LabelS"
          + "et\022Z\n\013inventories\030\004 \003(\0132E.google.cloud.o"
          + "sconfig.v1.OSPolicyAssignment.InstanceFi"
          + "lter.Inventory\032<\n\tInventory\022\033\n\ros_short_"
          + "name\030\001 \001(\tB\004\342A\001\002\022\022\n\nos_version\030\002 \001(\t\032\220\001\n"
          + "\007Rollout\022I\n\021disruption_budget\030\001 \001(\0132(.go"
          + "ogle.cloud.osconfig.v1.FixedOrPercentB\004\342"
          + "A\001\002\022:\n\021min_wait_duration\030\002 \001(\0132\031.google."
          + "protobuf.DurationB\004\342A\001\002\"l\n\014RolloutState\022"
          + "\035\n\031ROLLOUT_STATE_UNSPECIFIED\020\000\022\017\n\013IN_PRO"
          + "GRESS\020\001\022\016\n\nCANCELLING\020\002\022\r\n\tCANCELLED\020\003\022\r"
          + "\n\tSUCCEEDED\020\004:\204\001\352A\200\001\n*osconfig.googleapi"
          + "s.com/OSPolicyAssignment\022Rprojects/{proj"
          + "ect}/locations/{location}/osPolicyAssign"
          + "ments/{os_policy_assignment}\"\340\004\n#OSPolic"
          + "yAssignmentOperationMetadata\022M\n\024os_polic"
          + "y_assignment\030\001 \001(\tB/\372A,\n*osconfig.google"
          + "apis.com/OSPolicyAssignment\022[\n\napi_metho"
          + "d\030\002 \001(\0162G.google.cloud.osconfig.v1.OSPol"
          + "icyAssignmentOperationMetadata.APIMethod"
          + "\022a\n\rrollout_state\030\003 \001(\0162J.google.cloud.o"
          + "sconfig.v1.OSPolicyAssignmentOperationMe"
          + "tadata.RolloutState\0226\n\022rollout_start_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.Timestamp\0227\n\023r"
          + "ollout_update_time\030\005 \001(\0132\032.google.protob"
          + "uf.Timestamp\"K\n\tAPIMethod\022\032\n\026API_METHOD_"
          + "UNSPECIFIED\020\000\022\n\n\006CREATE\020\001\022\n\n\006UPDATE\020\002\022\n\n"
          + "\006DELETE\020\003\"l\n\014RolloutState\022\035\n\031ROLLOUT_STA"
          + "TE_UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\016\n\nCAN"
          + "CELLING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tSUCCEEDED\020\004\""
          + "\326\001\n\037CreateOSPolicyAssignmentRequest\022:\n\006p"
          + "arent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleap"
          + "is.com/Location\022P\n\024os_policy_assignment\030"
          + "\002 \001(\0132,.google.cloud.osconfig.v1.OSPolic"
          + "yAssignmentB\004\342A\001\002\022%\n\027os_policy_assignmen"
          + "t_id\030\003 \001(\tB\004\342A\001\002\"\252\001\n\037UpdateOSPolicyAssig"
          + "nmentRequest\022P\n\024os_policy_assignment\030\001 \001"
          + "(\0132,.google.cloud.osconfig.v1.OSPolicyAs"
          + "signmentB\004\342A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.go"
          + "ogle.protobuf.FieldMaskB\004\342A\001\001\"a\n\034GetOSPo"
          + "licyAssignmentRequest\022A\n\004name\030\001 \001(\tB3\342A\001"
          + "\002\372A,\n*osconfig.googleapis.com/OSPolicyAs"
          + "signment\"\203\001\n\036ListOSPolicyAssignmentsRequ"
          + "est\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations."
          + "googleapis.com/Location\022\021\n\tpage_size\030\002 \001"
          + "(\005\022\022\n\npage_token\030\003 \001(\t\"\207\001\n\037ListOSPolicyA"
          + "ssignmentsResponse\022K\n\025os_policy_assignme"
          + "nts\030\001 \003(\0132,.google.cloud.osconfig.v1.OSP"
          + "olicyAssignment\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"\222\001\n&ListOSPolicyAssignmentRevisionsRequ"
          + "est\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*osconfig.goo"
          + "gleapis.com/OSPolicyAssignment\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\217\001\n\'ListOS"
          + "PolicyAssignmentRevisionsResponse\022K\n\025os_"
          + "policy_assignments\030\001 \003(\0132,.google.cloud."
          + "osconfig.v1.OSPolicyAssignment\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"d\n\037DeleteOSPolicyAssignm"
          + "entRequest\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*oscon"
          + "fig.googleapis.com/OSPolicyAssignmentB\310\001"
          + "\n\034com.google.cloud.osconfig.v1B\030OsPolicy"
          + "AssignmentsProtoP\001Z8cloud.google.com/go/"
          + "osconfig/apiv1/osconfigpb;osconfigpb\252\002\030G"
          + "oogle.Cloud.OsConfig.V1\312\002\030Google\\Cloud\\O"
          + "sConfig\\V1\352\002\033Google::Cloud::OsConfig::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.osconfig.v1.OsPolicyProto.getDescriptor(),
              com.google.cloud.osconfig.v1.Common.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "OsPolicies",
              "InstanceFilter",
              "Rollout",
              "RevisionId",
              "RevisionCreateTime",
              "Etag",
              "RolloutState",
              "Baseline",
              "Deleted",
              "Reconciling",
              "Uid",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_descriptor,
            new java.lang.String[] {
              "Labels",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_LabelSet_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_descriptor,
            new java.lang.String[] {
              "All", "InclusionLabels", "ExclusionLabels", "Inventories",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_Inventory_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_Inventory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_InstanceFilter_Inventory_descriptor,
            new java.lang.String[] {
              "OsShortName", "OsVersion",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_Rollout_descriptor =
        internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_Rollout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignment_Rollout_descriptor,
            new java.lang.String[] {
              "DisruptionBudget", "MinWaitDuration",
            });
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_OSPolicyAssignmentOperationMetadata_descriptor,
            new java.lang.String[] {
              "OsPolicyAssignment",
              "ApiMethod",
              "RolloutState",
              "RolloutStartTime",
              "RolloutUpdateTime",
            });
    internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_CreateOSPolicyAssignmentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "OsPolicyAssignment", "OsPolicyAssignmentId",
            });
    internal_static_google_cloud_osconfig_v1_UpdateOSPolicyAssignmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1_UpdateOSPolicyAssignmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_UpdateOSPolicyAssignmentRequest_descriptor,
            new java.lang.String[] {
              "OsPolicyAssignment", "UpdateMask",
            });
    internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_GetOSPolicyAssignmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor,
            new java.lang.String[] {
              "OsPolicyAssignments", "NextPageToken",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentRevisionsResponse_descriptor,
            new java.lang.String[] {
              "OsPolicyAssignments", "NextPageToken",
            });
    internal_static_google_cloud_osconfig_v1_DeleteOSPolicyAssignmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_osconfig_v1_DeleteOSPolicyAssignmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1_DeleteOSPolicyAssignmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1.OsPolicyProto.getDescriptor();
    com.google.cloud.osconfig.v1.Common.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
