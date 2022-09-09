// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface UpdateBuildTriggerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.UpdateBuildTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the project that owns the trigger.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. ID of the project that owns the trigger.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. ID of the `BuildTrigger` to update.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   * <pre>
   * Required. ID of the `BuildTrigger` to update.
   * </pre>
   *
   * <code>string trigger_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString
      getTriggerIdBytes();

  /**
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the trigger field is set.
   */
  boolean hasTrigger();
  /**
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trigger.
   */
  com.google.cloudbuild.v1.BuildTrigger getTrigger();
  /**
   * <pre>
   * Required. `BuildTrigger` to update.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildTrigger trigger = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloudbuild.v1.BuildTriggerOrBuilder getTriggerOrBuilder();
}
