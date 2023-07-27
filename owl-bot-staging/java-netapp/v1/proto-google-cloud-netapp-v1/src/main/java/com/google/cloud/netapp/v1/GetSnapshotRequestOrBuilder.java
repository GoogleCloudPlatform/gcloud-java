// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/snapshot.proto

package com.google.cloud.netapp.v1;

public interface GetSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.GetSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The snapshot resource name, in the format
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The snapshot resource name, in the format
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
