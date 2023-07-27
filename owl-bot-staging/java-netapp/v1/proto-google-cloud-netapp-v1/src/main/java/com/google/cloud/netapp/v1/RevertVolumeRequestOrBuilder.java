// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/volume.proto

package com.google.cloud.netapp.v1;

public interface RevertVolumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.RevertVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the volume, in the format of
   * projects/{project_id}/locations/{location}/volumes/{volume_id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the volume, in the format of
   * projects/{project_id}/locations/{location}/volumes/{volume_id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The snapshot resource ID, in the format 'my-snapshot', where the
   * specified ID is the {snapshot_id} of the fully qualified name like
   * projects/{project_id}/locations/{location_id}/volumes/{volume_id}/snapshots/{snapshot_id}
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   * <pre>
   * Required. The snapshot resource ID, in the format 'my-snapshot', where the
   * specified ID is the {snapshot_id} of the fully qualified name like
   * projects/{project_id}/locations/{location_id}/volumes/{volume_id}/snapshots/{snapshot_id}
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString
      getSnapshotIdBytes();
}
