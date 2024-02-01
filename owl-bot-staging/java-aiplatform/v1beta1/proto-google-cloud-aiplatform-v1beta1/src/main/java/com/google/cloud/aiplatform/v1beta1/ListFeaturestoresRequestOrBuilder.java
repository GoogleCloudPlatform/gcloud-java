// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListFeaturestoresRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListFeaturestoresRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to list Featurestores.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to list Featurestores.
   * Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Lists the featurestores that match the filter expression. The following
   * fields are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `online_serving_config.fixed_node_count`: Supports `=`, `!=`, `&lt;`, `&gt;`,
   * `&lt;=`, and `&gt;=` comparisons.
   * * `labels`: Supports key-value equality and key presence.
   *
   * Examples:
   *
   * * `create_time &gt; "2020-01-01" OR update_time &gt; "2020-01-01"`
   *    Featurestores created or updated after 2020-01-01.
   * * `labels.env = "prod"`
   *    Featurestores with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Lists the featurestores that match the filter expression. The following
   * fields are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `online_serving_config.fixed_node_count`: Supports `=`, `!=`, `&lt;`, `&gt;`,
   * `&lt;=`, and `&gt;=` comparisons.
   * * `labels`: Supports key-value equality and key presence.
   *
   * Examples:
   *
   * * `create_time &gt; "2020-01-01" OR update_time &gt; "2020-01-01"`
   *    Featurestores created or updated after 2020-01-01.
   * * `labels.env = "prod"`
   *    Featurestores with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The maximum number of Featurestores to return. The service may return fewer
   * than this value. If unspecified, at most 100 Featurestores will be
   * returned. The maximum value is 100; any value greater than 100 will be
   * coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous
   * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeaturestores]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeaturestores]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous
   * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeaturestores]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeaturestoreService.ListFeaturestores][google.cloud.aiplatform.v1beta1.FeaturestoreService.ListFeaturestores]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported Fields:
   *
   *   * `create_time`
   *   * `update_time`
   *   * `online_serving_config.fixed_node_count`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported Fields:
   *
   *   * `create_time`
   *   * `update_time`
   *   * `online_serving_config.fixed_node_count`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 6;</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 6;</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 6;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
