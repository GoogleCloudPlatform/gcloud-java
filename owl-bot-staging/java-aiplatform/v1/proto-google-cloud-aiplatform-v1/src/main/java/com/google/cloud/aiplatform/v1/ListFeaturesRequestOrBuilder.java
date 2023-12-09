// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListFeaturesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListFeaturesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to list Features.
   * Format for entity_type as parent:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * Format for feature_group as parent:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to list Features.
   * Format for entity_type as parent:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * Format for feature_group as parent:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Lists the Features that match the filter expression. The following
   * filters are supported:
   *
   * * `value_type`: Supports = and != comparisons.
   * * `create_time`: Supports =, !=, &lt;, &gt;, &gt;=, and &lt;= comparisons. Values must
   * be in RFC 3339 format.
   * * `update_time`: Supports =, !=, &lt;, &gt;, &gt;=, and &lt;= comparisons. Values must
   * be in RFC 3339 format.
   * * `labels`: Supports key-value equality as well as key presence.
   *
   * Examples:
   *
   * * `value_type = DOUBLE` --&gt; Features whose type is DOUBLE.
   * * `create_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;" OR
   *      update_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;"` --&gt; EntityTypes created
   *      or updated after 2020-01-31T15:30:00.000000Z.
   * * `labels.active = yes AND labels.env = prod` --&gt; Features having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any Feature which has a label with 'env' as the
   *   key.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Lists the Features that match the filter expression. The following
   * filters are supported:
   *
   * * `value_type`: Supports = and != comparisons.
   * * `create_time`: Supports =, !=, &lt;, &gt;, &gt;=, and &lt;= comparisons. Values must
   * be in RFC 3339 format.
   * * `update_time`: Supports =, !=, &lt;, &gt;, &gt;=, and &lt;= comparisons. Values must
   * be in RFC 3339 format.
   * * `labels`: Supports key-value equality as well as key presence.
   *
   * Examples:
   *
   * * `value_type = DOUBLE` --&gt; Features whose type is DOUBLE.
   * * `create_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;" OR
   *      update_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;"` --&gt; EntityTypes created
   *      or updated after 2020-01-31T15:30:00.000000Z.
   * * `labels.active = yes AND labels.env = prod` --&gt; Features having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any Feature which has a label with 'env' as the
   *   key.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The maximum number of Features to return. The service may return fewer
   * than this value. If unspecified, at most 1000 Features will be returned.
   * The maximum value is 1000; any value greater than 1000 will be coerced to
   * 1000.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous
   * [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1.FeaturestoreService.ListFeatures]
   * call or
   * [FeatureRegistryService.ListFeatures][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatures]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1.FeaturestoreService.ListFeatures]
   * or
   * [FeatureRegistryService.ListFeatures][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatures]
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
   * [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1.FeaturestoreService.ListFeatures]
   * call or
   * [FeatureRegistryService.ListFeatures][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatures]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeaturestoreService.ListFeatures][google.cloud.aiplatform.v1.FeaturestoreService.ListFeatures]
   * or
   * [FeatureRegistryService.ListFeatures][google.cloud.aiplatform.v1.FeatureRegistryService.ListFeatures]
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
   * Supported fields:
   *
   *   * `feature_id`
   *   * `value_type` (Not supported for FeatureRegistry Feature)
   *   * `create_time`
   *   * `update_time`
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
   * Supported fields:
   *
   *   * `feature_id`
   *   * `value_type` (Not supported for FeatureRegistry Feature)
   *   * `create_time`
   *   * `update_time`
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

  /**
   * <pre>
   * Only applicable for Vertex AI Feature Store (Legacy).
   * If set, return the most recent
   * [ListFeaturesRequest.latest_stats_count][google.cloud.aiplatform.v1.ListFeaturesRequest.latest_stats_count]
   * of stats for each Feature in response. Valid value is [0, 10]. If number of
   * stats exists &lt;
   * [ListFeaturesRequest.latest_stats_count][google.cloud.aiplatform.v1.ListFeaturesRequest.latest_stats_count],
   * return all existing stats.
   * </pre>
   *
   * <code>int32 latest_stats_count = 7;</code>
   * @return The latestStatsCount.
   */
  int getLatestStatsCount();
}
