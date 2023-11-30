// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

public interface ExportDeploymentStatefileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.ExportDeploymentStatefileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent in whose context the statefile is listed. The parent
   * value is in the format:
   * 'projects/{project_id}/locations/{location}/deployments/{deployment}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent in whose context the statefile is listed. The parent
   * value is in the format:
   * 'projects/{project_id}/locations/{location}/deployments/{deployment}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. If this flag is set to true, the exported deployment state file
   * will be the draft state. This will enable the draft file to be validated
   * before copying it over to the working state on unlock.
   * </pre>
   *
   * <code>bool draft = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The draft.
   */
  boolean getDraft();
}
