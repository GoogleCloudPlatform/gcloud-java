// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface DeleteStatefileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.DeleteStatefileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the deployment in the format:
   * 'projects/{project_id}/locations/{location}/deployments/{deployment}'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the deployment in the format:
   * 'projects/{project_id}/locations/{location}/deployments/{deployment}'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Lock ID of the lock file to verify that the user who is deleting
   * the state file previously locked the Deployment.
   * </pre>
   *
   * <code>int64 lock_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The lockId.
   */
  long getLockId();
}
