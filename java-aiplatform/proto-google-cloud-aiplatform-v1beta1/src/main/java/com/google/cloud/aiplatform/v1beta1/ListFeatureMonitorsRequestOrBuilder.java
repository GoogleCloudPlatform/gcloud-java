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
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ListFeatureMonitorsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListFeatureMonitorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the FeatureGroup to list FeatureMonitors.
   * Format:
   * `projects/{project}/locations/{location}/featureGroups/{featureGroup}`
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
   * Required. The resource name of the FeatureGroup to list FeatureMonitors.
   * Format:
   * `projects/{project}/locations/{location}/featureGroups/{featureGroup}`
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
   * Optional. Lists the FeatureMonitors that match the filter expression. The
   * following fields are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `labels`: Supports key-value equality and key presence.
   *
   * Examples:
   *
   * * `create_time &gt; "2020-01-01" OR update_time &gt; "2020-01-01"`
   *    FeatureMonitors created or updated after 2020-01-01.
   * * `labels.env = "prod"`
   *    FeatureGroups with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Lists the FeatureMonitors that match the filter expression. The
   * following fields are supported:
   *
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `update_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   * Values must be
   *   in RFC 3339 format.
   * * `labels`: Supports key-value equality and key presence.
   *
   * Examples:
   *
   * * `create_time &gt; "2020-01-01" OR update_time &gt; "2020-01-01"`
   *    FeatureMonitors created or updated after 2020-01-01.
   * * `labels.env = "prod"`
   *    FeatureGroups with label "env" set to "prod".
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of FeatureGroups to return. The service may
   * return fewer than this value. If unspecified, at most 100 FeatureMonitors
   * will be returned. The maximum value is 100; any value greater than 100 will
   * be coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous
   * [FeatureRegistryService.ListFeatureMonitors][google.cloud.aiplatform.v1beta1.FeatureRegistryService.ListFeatureMonitors]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeatureRegistryService.ListFeatureMonitors][google.cloud.aiplatform.v1beta1.FeatureRegistryService.ListFeatureMonitors]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous
   * [FeatureRegistryService.ListFeatureMonitors][google.cloud.aiplatform.v1beta1.FeatureRegistryService.ListFeatureMonitors]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [FeatureRegistryService.ListFeatureMonitors][google.cloud.aiplatform.v1beta1.FeatureRegistryService.ListFeatureMonitors]
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported Fields:
   *
   *   * `create_time`
   *   * `update_time`
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported Fields:
   *
   *   * `create_time`
   *   * `update_time`
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
