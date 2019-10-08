// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface AutoscalingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.AutoscalingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The autoscaling policy used by the cluster.
   * Only resource names including projectid and location (region) are valid.
   * Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]`
   * * `projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]`
   * Note that the policy must be in the same project and Cloud Dataproc region.
   * </pre>
   *
   * <code>string policy_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getPolicyUri();
  /**
   *
   *
   * <pre>
   * Optional. The autoscaling policy used by the cluster.
   * Only resource names including projectid and location (region) are valid.
   * Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]`
   * * `projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]`
   * Note that the policy must be in the same project and Cloud Dataproc region.
   * </pre>
   *
   * <code>string policy_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getPolicyUriBytes();
}
