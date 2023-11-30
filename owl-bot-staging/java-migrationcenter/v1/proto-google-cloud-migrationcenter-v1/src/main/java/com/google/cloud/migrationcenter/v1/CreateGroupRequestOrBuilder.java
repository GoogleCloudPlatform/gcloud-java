// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface CreateGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.CreateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. User specified ID for the group. It will become the last
   * component of the group name. The ID must be unique within the project, must
   * conform with RFC-1034, is restricted to lower-cased letters, and has a
   * maximum length of 63 characters. The ID must match the regular expression:
   * `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * Required. User specified ID for the group. It will become the last
   * component of the group name. The ID must be unique within the project, must
   * conform with RFC-1034, is restricted to lower-cased letters, and has a
   * maximum length of 63 characters. The ID must match the regular expression:
   * `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`.
   * </pre>
   *
   * <code>string group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * Required. The group resource being created.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Group group = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <pre>
   * Required. The group resource being created.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Group group = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The group.
   */
  com.google.cloud.migrationcenter.v1.Group getGroup();
  /**
   * <pre>
   * Required. The group resource being created.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.Group group = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.migrationcenter.v1.GroupOrBuilder getGroupOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
