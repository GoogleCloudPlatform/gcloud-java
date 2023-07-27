// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/snapshot.proto

package com.google.cloud.netapp.v1;

public interface CreateSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.CreateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The NetApp volume to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The NetApp volume to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshot.
   */
  com.google.cloud.netapp.v1.Snapshot getSnapshot();
  /**
   * <pre>
   * Required. A snapshot resource
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Snapshot snapshot = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.netapp.v1.SnapshotOrBuilder getSnapshotOrBuilder();

  /**
   * <pre>
   * Required. ID of the snapshot to create.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   * <pre>
   * Required. ID of the snapshot to create.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString
      getSnapshotIdBytes();
}
