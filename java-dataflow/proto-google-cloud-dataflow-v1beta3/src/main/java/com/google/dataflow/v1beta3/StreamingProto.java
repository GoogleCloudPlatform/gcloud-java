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
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public final class StreamingProto {
  private StreamingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_TopologyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_TopologyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_TopologyConfig_UserStageToComputationNameMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_TopologyConfig_UserStageToComputationNameMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_PubsubLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_PubsubLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StreamingStageLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StreamingStageLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StreamingSideInputLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StreamingSideInputLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_CustomSourceLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_CustomSourceLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StreamLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StreamLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StateFamilyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StateFamilyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_ComputationTopology_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_ComputationTopology_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_KeyRangeLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_KeyRangeLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_MountedDataDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_DataDiskAssignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StreamingComputationRanges_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/dataflow/v1beta3/streaming.prot"
          + "o\022\027google.dataflow.v1beta3\"\235\003\n\016TopologyC"
          + "onfig\022B\n\014computations\030\001 \003(\0132,.google.dat"
          + "aflow.v1beta3.ComputationTopology\022J\n\025dat"
          + "a_disk_assignments\030\002 \003(\0132+.google.datafl"
          + "ow.v1beta3.DataDiskAssignment\022v\n\"user_st"
          + "age_to_computation_name_map\030\003 \003(\0132J.goog"
          + "le.dataflow.v1beta3.TopologyConfig.UserS"
          + "tageToComputationNameMapEntry\022\033\n\023forward"
          + "ing_key_bits\030\004 \001(\005\022 \n\030persistent_state_v"
          + "ersion\030\005 \001(\005\032D\n\"UserStageToComputationNa"
          + "meMapEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\"\260\001\n\016PubsubLocation\022\r\n\005topic\030\001 \001(\t\022\024\n\014"
          + "subscription\030\002 \001(\t\022\027\n\017timestamp_label\030\003 "
          + "\001(\t\022\020\n\010id_label\030\004 \001(\t\022\026\n\016drop_late_data\030"
          + "\005 \001(\010\022\035\n\025tracking_subscription\030\006 \001(\t\022\027\n\017"
          + "with_attributes\030\007 \001(\010\"+\n\026StreamingStageL"
          + "ocation\022\021\n\tstream_id\030\001 \001(\t\"?\n\032StreamingS"
          + "ideInputLocation\022\013\n\003tag\030\001 \001(\t\022\024\n\014state_f"
          + "amily\030\002 \001(\t\"(\n\024CustomSourceLocation\022\020\n\010s"
          + "tateful\030\001 \001(\010\"\332\002\n\016StreamLocation\022S\n\030stre"
          + "aming_stage_location\030\001 \001(\0132/.google.data"
          + "flow.v1beta3.StreamingStageLocationH\000\022B\n"
          + "\017pubsub_location\030\002 \001(\0132\'.google.dataflow"
          + ".v1beta3.PubsubLocationH\000\022R\n\023side_input_"
          + "location\030\003 \001(\01323.google.dataflow.v1beta3"
          + ".StreamingSideInputLocationH\000\022O\n\026custom_"
          + "source_location\030\004 \001(\0132-.google.dataflow."
          + "v1beta3.CustomSourceLocationH\000B\n\n\010locati"
          + "on\":\n\021StateFamilyConfig\022\024\n\014state_family\030"
          + "\001 \001(\t\022\017\n\007is_read\030\002 \001(\010\"\276\002\n\023ComputationTo"
          + "pology\022\031\n\021system_stage_name\030\001 \001(\t\022\026\n\016com"
          + "putation_id\030\005 \001(\t\022=\n\nkey_ranges\030\002 \003(\0132)."
          + "google.dataflow.v1beta3.KeyRangeLocation"
          + "\0227\n\006inputs\030\003 \003(\0132\'.google.dataflow.v1bet"
          + "a3.StreamLocation\0228\n\007outputs\030\004 \003(\0132\'.goo"
          + "gle.dataflow.v1beta3.StreamLocation\022B\n\016s"
          + "tate_families\030\007 \003(\0132*.google.dataflow.v1"
          + "beta3.StateFamilyConfig\"\211\001\n\020KeyRangeLoca"
          + "tion\022\r\n\005start\030\001 \001(\t\022\013\n\003end\030\002 \001(\t\022\031\n\021deli"
          + "very_endpoint\030\003 \001(\t\022\021\n\tdata_disk\030\005 \001(\t\022+"
          + "\n\037deprecated_persistent_directory\030\004 \001(\tB"
          + "\002\030\001\"$\n\017MountedDataDisk\022\021\n\tdata_disk\030\001 \001("
          + "\t\"=\n\022DataDiskAssignment\022\023\n\013vm_instance\030\001"
          + " \001(\t\022\022\n\ndata_disks\030\002 \003(\t\"K\n\032KeyRangeData"
          + "DiskAssignment\022\r\n\005start\030\001 \001(\t\022\013\n\003end\030\002 \001"
          + "(\t\022\021\n\tdata_disk\030\003 \001(\t\"\204\001\n\032StreamingCompu"
          + "tationRanges\022\026\n\016computation_id\030\001 \001(\t\022N\n\021"
          + "range_assignments\030\002 \003(\01323.google.dataflo"
          + "w.v1beta3.KeyRangeDataDiskAssignment\"V\n "
          + "StreamingApplianceSnapshotConfig\022\023\n\013snap"
          + "shot_id\030\001 \001(\t\022\035\n\025import_state_endpoint\030\002"
          + " \001(\tB\321\001\n\033com.google.dataflow.v1beta3B\016St"
          + "reamingProtoP\001Z=cloud.google.com/go/data"
          + "flow/apiv1beta3/dataflowpb;dataflowpb\252\002\035"
          + "Google.Cloud.Dataflow.V1Beta3\312\002\035Google\\C"
          + "loud\\Dataflow\\V1beta3\352\002 Google::Cloud::D"
          + "ataflow::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_dataflow_v1beta3_TopologyConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_dataflow_v1beta3_TopologyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_TopologyConfig_descriptor,
            new java.lang.String[] {
              "Computations",
              "DataDiskAssignments",
              "UserStageToComputationNameMap",
              "ForwardingKeyBits",
              "PersistentStateVersion",
            });
    internal_static_google_dataflow_v1beta3_TopologyConfig_UserStageToComputationNameMapEntry_descriptor =
        internal_static_google_dataflow_v1beta3_TopologyConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_dataflow_v1beta3_TopologyConfig_UserStageToComputationNameMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_TopologyConfig_UserStageToComputationNameMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_dataflow_v1beta3_PubsubLocation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_dataflow_v1beta3_PubsubLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_PubsubLocation_descriptor,
            new java.lang.String[] {
              "Topic",
              "Subscription",
              "TimestampLabel",
              "IdLabel",
              "DropLateData",
              "TrackingSubscription",
              "WithAttributes",
            });
    internal_static_google_dataflow_v1beta3_StreamingStageLocation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_dataflow_v1beta3_StreamingStageLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StreamingStageLocation_descriptor,
            new java.lang.String[] {
              "StreamId",
            });
    internal_static_google_dataflow_v1beta3_StreamingSideInputLocation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_dataflow_v1beta3_StreamingSideInputLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StreamingSideInputLocation_descriptor,
            new java.lang.String[] {
              "Tag", "StateFamily",
            });
    internal_static_google_dataflow_v1beta3_CustomSourceLocation_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_dataflow_v1beta3_CustomSourceLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_CustomSourceLocation_descriptor,
            new java.lang.String[] {
              "Stateful",
            });
    internal_static_google_dataflow_v1beta3_StreamLocation_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_dataflow_v1beta3_StreamLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StreamLocation_descriptor,
            new java.lang.String[] {
              "StreamingStageLocation",
              "PubsubLocation",
              "SideInputLocation",
              "CustomSourceLocation",
              "Location",
            });
    internal_static_google_dataflow_v1beta3_StateFamilyConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_dataflow_v1beta3_StateFamilyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StateFamilyConfig_descriptor,
            new java.lang.String[] {
              "StateFamily", "IsRead",
            });
    internal_static_google_dataflow_v1beta3_ComputationTopology_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_dataflow_v1beta3_ComputationTopology_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_ComputationTopology_descriptor,
            new java.lang.String[] {
              "SystemStageName", "ComputationId", "KeyRanges", "Inputs", "Outputs", "StateFamilies",
            });
    internal_static_google_dataflow_v1beta3_KeyRangeLocation_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_dataflow_v1beta3_KeyRangeLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_KeyRangeLocation_descriptor,
            new java.lang.String[] {
              "Start", "End", "DeliveryEndpoint", "DataDisk", "DeprecatedPersistentDirectory",
            });
    internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_dataflow_v1beta3_MountedDataDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_MountedDataDisk_descriptor,
            new java.lang.String[] {
              "DataDisk",
            });
    internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_dataflow_v1beta3_DataDiskAssignment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_DataDiskAssignment_descriptor,
            new java.lang.String[] {
              "VmInstance", "DataDisks",
            });
    internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_KeyRangeDataDiskAssignment_descriptor,
            new java.lang.String[] {
              "Start", "End", "DataDisk",
            });
    internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_dataflow_v1beta3_StreamingComputationRanges_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor,
            new java.lang.String[] {
              "ComputationId", "RangeAssignments",
            });
    internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_StreamingApplianceSnapshotConfig_descriptor,
            new java.lang.String[] {
              "SnapshotId", "ImportStateEndpoint",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
