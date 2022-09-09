// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

public interface DeleteAlertPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DeleteAlertPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The alerting policy to delete. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
   * For more information, see [AlertPolicy][google.monitoring.v3.AlertPolicy].
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The alerting policy to delete. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID]
   * For more information, see [AlertPolicy][google.monitoring.v3.AlertPolicy].
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
