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
// source: google/cloud/baremetalsolution/v2/provisioning.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.baremetalsolution.v2;

public interface VolumeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.VolumeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the volume config.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the volume config.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A transient unique identifier to identify a volume within an
   * ProvisioningConfig request.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A transient unique identifier to identify a volume within an
   * ProvisioningConfig request.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Whether snapshots should be enabled.
   * </pre>
   *
   * <code>bool snapshots_enabled = 3;</code>
   *
   * @return The snapshotsEnabled.
   */
  boolean getSnapshotsEnabled();

  /**
   *
   *
   * <pre>
   * The type of this Volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumeConfig.Type type = 4;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of this Volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumeConfig.Type type = 4;</code>
   *
   * @return The type.
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.Type getType();

  /**
   *
   *
   * <pre>
   * Volume protocol.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumeConfig.Protocol protocol = 5;</code>
   *
   * @return The enum numeric value on the wire for protocol.
   */
  int getProtocolValue();
  /**
   *
   *
   * <pre>
   * Volume protocol.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumeConfig.Protocol protocol = 5;</code>
   *
   * @return The protocol.
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.Protocol getProtocol();

  /**
   *
   *
   * <pre>
   * The requested size of this volume, in GB.
   * </pre>
   *
   * <code>int32 size_gb = 6;</code>
   *
   * @return The sizeGb.
   */
  int getSizeGb();

  /**
   *
   *
   * <pre>
   * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.LunRange lun_ranges = 7;</code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.VolumeConfig.LunRange> getLunRangesList();
  /**
   *
   *
   * <pre>
   * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.LunRange lun_ranges = 7;</code>
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.LunRange getLunRanges(int index);
  /**
   *
   *
   * <pre>
   * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.LunRange lun_ranges = 7;</code>
   */
  int getLunRangesCount();
  /**
   *
   *
   * <pre>
   * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.LunRange lun_ranges = 7;</code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.VolumeConfig.LunRangeOrBuilder>
      getLunRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * LUN ranges to be configured. Set only when protocol is PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.LunRange lun_ranges = 7;</code>
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.LunRangeOrBuilder getLunRangesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Machine ids connected to this volume. Set only when protocol is
   * PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated string machine_ids = 8;</code>
   *
   * @return A list containing the machineIds.
   */
  java.util.List<java.lang.String> getMachineIdsList();
  /**
   *
   *
   * <pre>
   * Machine ids connected to this volume. Set only when protocol is
   * PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated string machine_ids = 8;</code>
   *
   * @return The count of machineIds.
   */
  int getMachineIdsCount();
  /**
   *
   *
   * <pre>
   * Machine ids connected to this volume. Set only when protocol is
   * PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated string machine_ids = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The machineIds at the given index.
   */
  java.lang.String getMachineIds(int index);
  /**
   *
   *
   * <pre>
   * Machine ids connected to this volume. Set only when protocol is
   * PROTOCOL_FC.
   * </pre>
   *
   * <code>repeated string machine_ids = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the machineIds at the given index.
   */
  com.google.protobuf.ByteString getMachineIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * NFS exports. Set only when protocol is PROTOCOL_NFS.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport nfs_exports = 9;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport> getNfsExportsList();
  /**
   *
   *
   * <pre>
   * NFS exports. Set only when protocol is PROTOCOL_NFS.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport nfs_exports = 9;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport getNfsExports(int index);
  /**
   *
   *
   * <pre>
   * NFS exports. Set only when protocol is PROTOCOL_NFS.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport nfs_exports = 9;
   * </code>
   */
  int getNfsExportsCount();
  /**
   *
   *
   * <pre>
   * NFS exports. Set only when protocol is PROTOCOL_NFS.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport nfs_exports = 9;
   * </code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.VolumeConfig.NfsExportOrBuilder>
      getNfsExportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * NFS exports. Set only when protocol is PROTOCOL_NFS.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.VolumeConfig.NfsExport nfs_exports = 9;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.VolumeConfig.NfsExportOrBuilder getNfsExportsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * User note field, it can be used by customers to add additional information
   * for the BMS Ops team .
   * </pre>
   *
   * <code>string user_note = 10;</code>
   *
   * @return The userNote.
   */
  java.lang.String getUserNote();
  /**
   *
   *
   * <pre>
   * User note field, it can be used by customers to add additional information
   * for the BMS Ops team .
   * </pre>
   *
   * <code>string user_note = 10;</code>
   *
   * @return The bytes for userNote.
   */
  com.google.protobuf.ByteString getUserNoteBytes();

  /**
   *
   *
   * <pre>
   * The GCP service of the storage volume. Available gcp_service are in
   * https://cloud.google.com/bare-metal/docs/bms-planning.
   * </pre>
   *
   * <code>string gcp_service = 11;</code>
   *
   * @return The gcpService.
   */
  java.lang.String getGcpService();
  /**
   *
   *
   * <pre>
   * The GCP service of the storage volume. Available gcp_service are in
   * https://cloud.google.com/bare-metal/docs/bms-planning.
   * </pre>
   *
   * <code>string gcp_service = 11;</code>
   *
   * @return The bytes for gcpService.
   */
  com.google.protobuf.ByteString getGcpServiceBytes();

  /**
   *
   *
   * <pre>
   * Performance tier of the Volume.
   * Default is SHARED.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumePerformanceTier performance_tier = 12;</code>
   *
   * @return The enum numeric value on the wire for performanceTier.
   */
  int getPerformanceTierValue();
  /**
   *
   *
   * <pre>
   * Performance tier of the Volume.
   * Default is SHARED.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.VolumePerformanceTier performance_tier = 12;</code>
   *
   * @return The performanceTier.
   */
  com.google.cloud.baremetalsolution.v2.VolumePerformanceTier getPerformanceTier();
}
