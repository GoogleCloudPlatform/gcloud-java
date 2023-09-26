// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/rapidmigrationassessment/v1/rapidmigrationassessment.proto

package com.google.cloud.rapidmigrationassessment.v1;

public interface CreateCollectorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.rapidmigrationassessment.v1.CreateCollectorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the parent (project+location).
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of the parent (project+location).
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Id of the requesting object.
   * </pre>
   *
   * <code>string collector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The collectorId.
   */
  java.lang.String getCollectorId();
  /**
   * <pre>
   * Required. Id of the requesting object.
   * </pre>
   *
   * <code>string collector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for collectorId.
   */
  com.google.protobuf.ByteString
      getCollectorIdBytes();

  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.rapidmigrationassessment.v1.Collector collector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the collector field is set.
   */
  boolean hasCollector();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.rapidmigrationassessment.v1.Collector collector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The collector.
   */
  com.google.cloud.rapidmigrationassessment.v1.Collector getCollector();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.rapidmigrationassessment.v1.Collector collector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.rapidmigrationassessment.v1.CollectorOrBuilder getCollectorOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
