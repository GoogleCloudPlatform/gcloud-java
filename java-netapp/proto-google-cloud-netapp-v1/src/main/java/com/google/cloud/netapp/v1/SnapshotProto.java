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
// source: google/cloud/netapp/v1/snapshot.proto

package com.google.cloud.netapp.v1;

public final class SnapshotProto {
  private SnapshotProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Snapshot_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Snapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/netapp/v1/snapshot.proto\022"
          + "\026google.cloud.netapp.v1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032 google/protobuf/field_mask.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\230\001\n\024ListS"
          + "napshotsRequest\0227\n\006parent\030\001 \001(\tB\'\342A\001\002\372A "
          + "\022\036netapp.googleapis.com/Snapshot\022\021\n\tpage"
          + "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\020\n\010order"
          + "_by\030\004 \001(\t\022\016\n\006filter\030\005 \001(\t\"z\n\025ListSnapsho"
          + "tsResponse\0223\n\tsnapshots\030\001 \003(\0132 .google.c"
          + "loud.netapp.v1.Snapshot\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"K\n\022GetSnap"
          + "shotRequest\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372A \n\036neta"
          + "pp.googleapis.com/Snapshot\"\245\001\n\025CreateSna"
          + "pshotRequest\0227\n\006parent\030\001 \001(\tB\'\342A\001\002\372A \022\036n"
          + "etapp.googleapis.com/Snapshot\0228\n\010snapsho"
          + "t\030\002 \001(\0132 .google.cloud.netapp.v1.Snapsho"
          + "tB\004\342A\001\002\022\031\n\013snapshot_id\030\003 \001(\tB\004\342A\001\002\"N\n\025De"
          + "leteSnapshotRequest\0225\n\004name\030\001 \001(\tB\'\342A\001\002\372"
          + "A \n\036netapp.googleapis.com/Snapshot\"\210\001\n\025U"
          + "pdateSnapshotRequest\0225\n\013update_mask\030\001 \001("
          + "\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\0228\n\010s"
          + "napshot\030\002 \001(\0132 .google.cloud.netapp.v1.S"
          + "napshotB\004\342A\001\002\"\304\004\n\010Snapshot\022\022\n\004name\030\001 \001(\t"
          + "B\004\342A\001\010\022;\n\005state\030\002 \001(\0162&.google.cloud.net"
          + "app.v1.Snapshot.StateB\004\342A\001\003\022\033\n\rstate_det"
          + "ails\030\003 \001(\tB\004\342A\001\003\022\023\n\013description\030\004 \001(\t\022\030\n"
          + "\nused_bytes\030\005 \001(\001B\004\342A\001\003\0225\n\013create_time\030\006"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022<"
          + "\n\006labels\030\007 \003(\0132,.google.cloud.netapp.v1."
          + "Snapshot.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"l\n\005State\022\025\n\021"
          + "STATE_UNSPECIFIED\020\000\022\t\n\005READY\020\001\022\014\n\010CREATI"
          + "NG\020\002\022\014\n\010DELETING\020\003\022\014\n\010UPDATING\020\004\022\014\n\010DISA"
          + "BLED\020\005\022\t\n\005ERROR\020\006:\210\001\352A\204\001\n\036netapp.googlea"
          + "pis.com/Snapshot\022Mprojects/{project}/loc"
          + "ations/{location}/volumes/{volume}/snaps"
          + "hots/{snapshot}*\tsnapshots2\010snapshotB\257\001\n"
          + "\032com.google.cloud.netapp.v1B\rSnapshotPro"
          + "toP\001Z2cloud.google.com/go/netapp/apiv1/n"
          + "etapppb;netapppb\252\002\026Google.Cloud.NetApp.V"
          + "1\312\002\026Google\\Cloud\\NetApp\\V1\352\002\031Google::Clo"
          + "ud::NetApp::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListSnapshotsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "OrderBy", "Filter",
            });
    internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListSnapshotsResponse_descriptor,
            new java.lang.String[] {
              "Snapshots", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_GetSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_GetSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_CreateSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Snapshot", "SnapshotId",
            });
    internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_DeleteSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_UpdateSnapshotRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Snapshot",
            });
    internal_static_google_cloud_netapp_v1_Snapshot_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_Snapshot_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Snapshot_descriptor,
            new java.lang.String[] {
              "Name", "State", "StateDetails", "Description", "UsedBytes", "CreateTime", "Labels",
            });
    internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor =
        internal_static_google_cloud_netapp_v1_Snapshot_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_Snapshot_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
