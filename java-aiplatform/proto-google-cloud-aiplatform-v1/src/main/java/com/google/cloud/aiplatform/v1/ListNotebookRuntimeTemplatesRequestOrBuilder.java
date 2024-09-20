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
// source: google/cloud/aiplatform/v1/notebook_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListNotebookRuntimeTemplatesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location from which to list the
   * NotebookRuntimeTemplates.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location from which to list the
   * NotebookRuntimeTemplates.
   * Format: `projects/{project}/locations/{location}`
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
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `notebookRuntimeTemplate` supports = and !=. `notebookRuntimeTemplate`
   *     represents the NotebookRuntimeTemplate ID,
   *     i.e. the last segment of the NotebookRuntimeTemplate's [resource name]
   *     [google.cloud.aiplatform.v1.NotebookRuntimeTemplate.name].
   *   * `display_name` supports = and !=
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `notebookRuntimeType` supports = and !=. notebookRuntimeType enum:
   *   [USER_DEFINED, ONE_CLICK].
   *
   * Some examples:
   *
   *   * `notebookRuntimeTemplate=notebookRuntimeTemplate123`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `notebookRuntimeType=USER_DEFINED`
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
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `notebookRuntimeTemplate` supports = and !=. `notebookRuntimeTemplate`
   *     represents the NotebookRuntimeTemplate ID,
   *     i.e. the last segment of the NotebookRuntimeTemplate's [resource name]
   *     [google.cloud.aiplatform.v1.NotebookRuntimeTemplate.name].
   *   * `display_name` supports = and !=
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:* or labels:key - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `notebookRuntimeType` supports = and !=. notebookRuntimeType enum:
   *   [USER_DEFINED, ONE_CLICK].
   *
   * Some examples:
   *
   *   * `notebookRuntimeTemplate=notebookRuntimeTemplate123`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `notebookRuntimeType=USER_DEFINED`
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
   * Optional. The standard list page size.
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
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListNotebookRuntimeTemplatesResponse.next_page_token][google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesResponse.next_page_token]
   * of the previous
   * [NotebookService.ListNotebookRuntimeTemplates][google.cloud.aiplatform.v1.NotebookService.ListNotebookRuntimeTemplates]
   * call.
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
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListNotebookRuntimeTemplatesResponse.next_page_token][google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesResponse.next_page_token]
   * of the previous
   * [NotebookService.ListNotebookRuntimeTemplates][google.cloud.aiplatform.v1.NotebookService.ListNotebookRuntimeTemplates]
   * call.
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
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
