/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_online_store_admin_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListFeatureViewsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListFeatureViewsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the FeatureOnlineStore to list FeatureViews.
   * Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the FeatureOnlineStore to list FeatureViews.
   * Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Lists the FeatureViews that match the filter expression. The following
   * filters are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&gt;=`, and `&lt;=` comparisons.
   * Values must be in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&gt;=`, and `&lt;=` comparisons.
   * Values must be in RFC 3339 format.
   * * `labels`: Supports key-value equality as well as key presence.
   *
   * Examples:
   *
   * * `create_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;" OR
   *      update_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;"` --&gt; FeatureViews
   *      created or updated after 2020-01-31T15:30:00.000000Z.
   * * `labels.active = yes AND labels.env = prod` --&gt; FeatureViews having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any FeatureView which has a label with 'env' as the
   *   key.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Lists the FeatureViews that match the filter expression. The following
   * filters are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&gt;=`, and `&lt;=` comparisons.
   * Values must be in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&gt;=`, and `&lt;=` comparisons.
   * Values must be in RFC 3339 format.
   * * `labels`: Supports key-value equality as well as key presence.
   *
   * Examples:
   *
   * * `create_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;" OR
   *      update_time &gt; &#92;"2020-01-31T15:30:00.000000Z&#92;"` --&gt; FeatureViews
   *      created or updated after 2020-01-31T15:30:00.000000Z.
   * * `labels.active = yes AND labels.env = prod` --&gt; FeatureViews having both
   *     (active: yes) and (env: prod) labels.
   * * `labels.env: *` --&gt; Any FeatureView which has a label with 'env' as the
   *   key.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of FeatureViews to return. The service may return fewer
   * than this value. If unspecified, at most 1000 FeatureViews will be
   * returned. The maximum value is 1000; any value greater than 1000 will be
   * coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [FeatureOnlineStoreAdminService.ListFeatureViews][google.cloud.aiplatform.v1.FeatureOnlineStoreAdminService.ListFeatureViews]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeatureOnlineStoreAdminService.ListFeatureViews][google.cloud.aiplatform.v1.FeatureOnlineStoreAdminService.ListFeatureViews]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [FeatureOnlineStoreAdminService.ListFeatureViews][google.cloud.aiplatform.v1.FeatureOnlineStoreAdminService.ListFeatureViews]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeatureOnlineStoreAdminService.ListFeatureViews][google.cloud.aiplatform.v1.FeatureOnlineStoreAdminService.ListFeatureViews]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   *
   * Supported fields:
   *
   *   * `feature_view_id`
   *   * `create_time`
   *   * `update_time`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   *
   * Supported fields:
   *
   *   * `feature_view_id`
   *   * `create_time`
   *   * `update_time`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
