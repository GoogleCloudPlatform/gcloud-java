// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/schema_service.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface UpdateSchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.UpdateSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The schema.
   */
  com.google.cloud.discoveryengine.v1alpha.Schema getSchema();
  /**
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1alpha.Schema] to
   * update.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.discoveryengine.v1alpha.SchemaOrBuilder getSchemaOrBuilder();

  /**
   * <pre>
   * If set to true, and the
   * [Schema][google.cloud.discoveryengine.v1alpha.Schema] is not found, a new
   * [Schema][google.cloud.discoveryengine.v1alpha.Schema] will be created. In
   * this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
