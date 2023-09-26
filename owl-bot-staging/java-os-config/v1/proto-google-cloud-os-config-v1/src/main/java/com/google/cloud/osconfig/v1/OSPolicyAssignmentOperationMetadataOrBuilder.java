// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/os_policy_assignments.proto

package com.google.cloud.osconfig.v1;

public interface OSPolicyAssignmentOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference to the `OSPolicyAssignment` API resource.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id&#64;revision_id}`
   * </pre>
   *
   * <code>string os_policy_assignment = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The osPolicyAssignment.
   */
  java.lang.String getOsPolicyAssignment();
  /**
   * <pre>
   * Reference to the `OSPolicyAssignment` API resource.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id&#64;revision_id}`
   * </pre>
   *
   * <code>string os_policy_assignment = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for osPolicyAssignment.
   */
  com.google.protobuf.ByteString
      getOsPolicyAssignmentBytes();

  /**
   * <pre>
   * The OS policy assignment API method.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.APIMethod api_method = 2;</code>
   * @return The enum numeric value on the wire for apiMethod.
   */
  int getApiMethodValue();
  /**
   * <pre>
   * The OS policy assignment API method.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.APIMethod api_method = 2;</code>
   * @return The apiMethod.
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.APIMethod getApiMethod();

  /**
   * <pre>
   * State of the rollout
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.RolloutState rollout_state = 3;</code>
   * @return The enum numeric value on the wire for rolloutState.
   */
  int getRolloutStateValue();
  /**
   * <pre>
   * State of the rollout
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.RolloutState rollout_state = 3;</code>
   * @return The rolloutState.
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentOperationMetadata.RolloutState getRolloutState();

  /**
   * <pre>
   * Rollout start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_start_time = 4;</code>
   * @return Whether the rolloutStartTime field is set.
   */
  boolean hasRolloutStartTime();
  /**
   * <pre>
   * Rollout start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_start_time = 4;</code>
   * @return The rolloutStartTime.
   */
  com.google.protobuf.Timestamp getRolloutStartTime();
  /**
   * <pre>
   * Rollout start time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRolloutStartTimeOrBuilder();

  /**
   * <pre>
   * Rollout update time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_update_time = 5;</code>
   * @return Whether the rolloutUpdateTime field is set.
   */
  boolean hasRolloutUpdateTime();
  /**
   * <pre>
   * Rollout update time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_update_time = 5;</code>
   * @return The rolloutUpdateTime.
   */
  com.google.protobuf.Timestamp getRolloutUpdateTime();
  /**
   * <pre>
   * Rollout update time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp rollout_update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRolloutUpdateTimeOrBuilder();
}
