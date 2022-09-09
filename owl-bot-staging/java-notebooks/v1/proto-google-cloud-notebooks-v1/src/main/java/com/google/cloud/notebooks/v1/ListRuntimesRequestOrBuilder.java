// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

public interface ListRuntimesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.ListRuntimesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Maximum return size of the list call.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A previous returned page token that can be used to continue listing
   * from the last result.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A previous returned page token that can be used to continue listing
   * from the last result.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
