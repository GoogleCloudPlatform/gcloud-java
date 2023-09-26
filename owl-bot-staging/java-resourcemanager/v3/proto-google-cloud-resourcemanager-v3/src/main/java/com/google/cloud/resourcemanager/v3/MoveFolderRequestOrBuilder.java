// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

public interface MoveFolderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.MoveFolderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Folder to move.
   * Must be of the form folders/{folder_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Folder to move.
   * Must be of the form folders/{folder_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The resource name of the folder or organization which should be
   * the folder's new parent. Must be of the form `folders/{folder_id}` or
   * `organizations/{org_id}`.
   * </pre>
   *
   * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The destinationParent.
   */
  java.lang.String getDestinationParent();
  /**
   * <pre>
   * Required. The resource name of the folder or organization which should be
   * the folder's new parent. Must be of the form `folders/{folder_id}` or
   * `organizations/{org_id}`.
   * </pre>
   *
   * <code>string destination_parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for destinationParent.
   */
  com.google.protobuf.ByteString
      getDestinationParentBytes();
}
