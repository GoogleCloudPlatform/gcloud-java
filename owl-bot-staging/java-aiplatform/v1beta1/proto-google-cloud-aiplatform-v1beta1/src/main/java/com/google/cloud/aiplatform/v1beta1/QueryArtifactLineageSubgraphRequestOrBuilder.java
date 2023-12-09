// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface QueryArtifactLineageSubgraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryArtifactLineageSubgraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Artifact whose Lineage needs to be
   * retrieved as a LineageSubgraph. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The artifact.
   */
  java.lang.String getArtifact();
  /**
   * <pre>
   * Required. The resource name of the Artifact whose Lineage needs to be
   * retrieved as a LineageSubgraph. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>string artifact = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for artifact.
   */
  com.google.protobuf.ByteString
      getArtifactBytes();

  /**
   * <pre>
   * Specifies the size of the lineage graph in terms of number of hops from the
   * specified artifact.
   * Negative Value: INVALID_ARGUMENT error is returned
   * 0: Only input artifact is returned.
   * No value: Transitive closure is performed to return the complete graph.
   * </pre>
   *
   * <code>int32 max_hops = 2;</code>
   * @return The maxHops.
   */
  int getMaxHops();

  /**
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the Lineage Subgraph.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   *
   * *  **Attribute filtering**:
   *    For example: `display_name = "test"`
   *    Supported fields include: `name`, `display_name`, `uri`, `state`,
   *    `schema_title`, `create_time`, and `update_time`.
   *    Time fields, such as `create_time` and `update_time`, require values
   *    specified in RFC-3339 format.
   *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *  **Metadata field**:
   *    To filter on metadata fields use traversal operation as follows:
   *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *    For example: `metadata.field_1.number_value = 10.0`
   *    In case the field name contains special characters (such as colon), one
   *    can embed it inside double quote.
   *    For example: `metadata."field:1".number_value = 10.0`
   *
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
   * is 5.
   *
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the Lineage Subgraph.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   *
   * *  **Attribute filtering**:
   *    For example: `display_name = "test"`
   *    Supported fields include: `name`, `display_name`, `uri`, `state`,
   *    `schema_title`, `create_time`, and `update_time`.
   *    Time fields, such as `create_time` and `update_time`, require values
   *    specified in RFC-3339 format.
   *    For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *  **Metadata field**:
   *    To filter on metadata fields use traversal operation as follows:
   *    `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *    For example: `metadata.field_1.number_value = 10.0`
   *    In case the field name contains special characters (such as colon), one
   *    can embed it inside double quote.
   *    For example: `metadata."field:1".number_value = 10.0`
   *
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`). Maximum nested expression depth allowed
   * is 5.
   *
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 3;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
