// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

public interface CreateConnectionProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.CreateConnectionProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent, which owns this collection of connection profiles.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent, which owns this collection of connection profiles.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The connection profile identifier.
   * </pre>
   *
   * <code>string connection_profile_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connectionProfileId.
   */
  java.lang.String getConnectionProfileId();
  /**
   * <pre>
   * Required. The connection profile identifier.
   * </pre>
   *
   * <code>string connection_profile_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for connectionProfileId.
   */
  com.google.protobuf.ByteString
      getConnectionProfileIdBytes();

  /**
   * <pre>
   * Required. The create request body including the connection profile data
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ConnectionProfile connection_profile = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the connectionProfile field is set.
   */
  boolean hasConnectionProfile();
  /**
   * <pre>
   * Required. The create request body including the connection profile data
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ConnectionProfile connection_profile = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connectionProfile.
   */
  com.google.cloud.clouddms.v1.ConnectionProfile getConnectionProfile();
  /**
   * <pre>
   * Required. The create request body including the connection profile data
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.ConnectionProfile connection_profile = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.clouddms.v1.ConnectionProfileOrBuilder getConnectionProfileOrBuilder();

  /**
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
