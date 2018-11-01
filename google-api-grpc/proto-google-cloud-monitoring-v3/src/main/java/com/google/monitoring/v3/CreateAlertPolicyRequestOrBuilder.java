// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

public interface CreateAlertPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateAlertPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The project in which to create the alerting policy. The format is
   * `projects/[PROJECT_ID]`.
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. The alerting
   * policy that is returned will have a name that contains a normalized
   * representation of this name as a prefix but adds a suffix of the form
   * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The project in which to create the alerting policy. The format is
   * `projects/[PROJECT_ID]`.
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. The alerting
   * policy that is returned will have a name that contains a normalized
   * representation of this name as a prefix but adds a suffix of the form
   * `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  boolean hasAlertPolicy();
  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  com.google.monitoring.v3.AlertPolicy getAlertPolicy();
  /**
   * <pre>
   * The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new [ALERT_POLICY_ID] value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2;</code>
   */
  com.google.monitoring.v3.AlertPolicyOrBuilder getAlertPolicyOrBuilder();
}
