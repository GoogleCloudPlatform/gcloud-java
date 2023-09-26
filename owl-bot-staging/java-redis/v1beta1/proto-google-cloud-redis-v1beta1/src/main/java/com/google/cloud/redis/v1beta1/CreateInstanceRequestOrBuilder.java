// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

public interface CreateInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.CreateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The logical name of the Redis instance in the customer project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project / location
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * Required. The logical name of the Redis instance in the customer project
   * with the following restrictions:
   *
   * * Must contain only lowercase letters, numbers, and hyphens.
   * * Must start with a letter.
   * * Must be between 1-40 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project / location
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  com.google.cloud.redis.v1beta1.Instance getInstance();
  /**
   * <pre>
   * Required. A Redis [Instance] resource
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.redis.v1beta1.InstanceOrBuilder getInstanceOrBuilder();
}
