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
// source: google/cloud/baremetalsolution/v2/volume_snapshot.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.baremetalsolution.v2;

public final class VolumeSnapshotProto {
  private VolumeSnapshotProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_VolumeSnapshot_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_VolumeSnapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetVolumeSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetVolumeSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DeleteVolumeSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DeleteVolumeSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_CreateVolumeSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_CreateVolumeSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/baremetalsolution/v2/volu"
          + "me_snapshot.proto\022!google.cloud.baremeta"
          + "lsolution.v2\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\032\037google"
          + "/protobuf/timestamp.proto\"\347\003\n\016VolumeSnap"
          + "shot\022\014\n\004name\030\001 \001(\t\022\017\n\002id\030\006 \001(\tB\003\340A\003\022\023\n\013d"
          + "escription\030\002 \001(\t\0224\n\013create_time\030\004 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022G\n\016storag"
          + "e_volume\030\005 \001(\tB/\340A\003\372A)\n\'baremetalsolutio"
          + "n.googleapis.com/Volume\022Q\n\004type\030\007 \001(\0162>."
          + "google.cloud.baremetalsolution.v2.Volume"
          + "Snapshot.SnapshotTypeB\003\340A\003\"H\n\014SnapshotTy"
          + "pe\022\035\n\031SNAPSHOT_TYPE_UNSPECIFIED\020\000\022\n\n\006AD_"
          + "HOC\020\001\022\r\n\tSCHEDULED\020\002:\204\001\352A\200\001\n/baremetalso"
          + "lution.googleapis.com/VolumeSnapshot\022Mpr"
          + "ojects/{project}/locations/{location}/vo"
          + "lumes/{volume}/snapshots/{snapshot}\"a\n\030G"
          + "etVolumeSnapshotRequest\022E\n\004name\030\001 \001(\tB7\340"
          + "A\002\372A1\n/baremetalsolution.googleapis.com/"
          + "VolumeSnapshot\"\204\001\n\032ListVolumeSnapshotsRe"
          + "quest\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\n\'baremetal"
          + "solution.googleapis.com/Volume\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\230\001\n\033ListVo"
          + "lumeSnapshotsResponse\022K\n\020volume_snapshot"
          + "s\030\001 \003(\01321.google.cloud.baremetalsolution"
          + ".v2.VolumeSnapshot\022\027\n\017next_page_token\030\002 "
          + "\001(\t\022\023\n\013unreachable\030\003 \003(\t\"d\n\033DeleteVolume"
          + "SnapshotRequest\022E\n\004name\030\001 \001(\tB7\340A\002\372A1\n/b"
          + "aremetalsolution.googleapis.com/VolumeSn"
          + "apshot\"\257\001\n\033CreateVolumeSnapshotRequest\022?"
          + "\n\006parent\030\001 \001(\tB/\340A\002\372A)\n\'baremetalsolutio"
          + "n.googleapis.com/Volume\022O\n\017volume_snapsh"
          + "ot\030\002 \001(\01321.google.cloud.baremetalsolutio"
          + "n.v2.VolumeSnapshotB\003\340A\002\"p\n\034RestoreVolum"
          + "eSnapshotRequest\022P\n\017volume_snapshot\030\001 \001("
          + "\tB7\340A\002\372A1\n/baremetalsolution.googleapis."
          + "com/VolumeSnapshotB\202\002\n%com.google.cloud."
          + "baremetalsolution.v2B\023VolumeSnapshotProt"
          + "oP\001ZScloud.google.com/go/baremetalsoluti"
          + "on/apiv2/baremetalsolutionpb;baremetalso"
          + "lutionpb\252\002!Google.Cloud.BareMetalSolutio"
          + "n.V2\312\002!Google\\Cloud\\BareMetalSolution\\V2"
          + "\352\002$Google::Cloud::BareMetalSolution::V2b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_VolumeSnapshot_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_VolumeSnapshot_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_VolumeSnapshot_descriptor,
            new java.lang.String[] {
              "Name", "Id", "Description", "CreateTime", "StorageVolume", "Type",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetVolumeSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetVolumeSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetVolumeSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListVolumeSnapshotsResponse_descriptor,
            new java.lang.String[] {
              "VolumeSnapshots", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_DeleteVolumeSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_DeleteVolumeSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DeleteVolumeSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_CreateVolumeSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_baremetalsolution_v2_CreateVolumeSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_CreateVolumeSnapshotRequest_descriptor,
            new java.lang.String[] {
              "Parent", "VolumeSnapshot",
            });
    internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_RestoreVolumeSnapshotRequest_descriptor,
            new java.lang.String[] {
              "VolumeSnapshot",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
