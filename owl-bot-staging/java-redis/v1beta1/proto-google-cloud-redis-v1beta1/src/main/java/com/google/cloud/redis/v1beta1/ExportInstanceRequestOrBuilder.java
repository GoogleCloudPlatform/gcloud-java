// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

public interface ExportInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.ExportInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.redis.v1beta1.OutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. Specify data to be exported.
   * </pre>
   *
   * <code>.google.cloud.redis.v1beta1.OutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.redis.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}
