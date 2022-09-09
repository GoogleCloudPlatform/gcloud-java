// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface MoveFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.MoveFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The workspace.
   */
  java.lang.String getWorkspace();
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workspace.
   */
  com.google.protobuf.ByteString
      getWorkspaceBytes();

  /**
   * <pre>
   * Required. The file's full path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Required. The file's full path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Required. The file's new path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The newPath.
   */
  java.lang.String getNewPath();
  /**
   * <pre>
   * Required. The file's new path including filename, relative to the workspace root.
   * </pre>
   *
   * <code>string new_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for newPath.
   */
  com.google.protobuf.ByteString
      getNewPathBytes();
}
