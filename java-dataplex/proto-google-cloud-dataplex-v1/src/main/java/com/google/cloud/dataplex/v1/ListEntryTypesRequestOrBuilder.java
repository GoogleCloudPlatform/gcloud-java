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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface ListEntryTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListEntryTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntryType location, of the form:
   * `projects/{project_number}/locations/{location_id}`
   * where `location_id` refers to a Google Cloud region.
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
   * Required. The resource name of the EntryType location, of the form:
   * `projects/{project_number}/locations/{location_id}`
   * where `location_id` refers to a Google Cloud region.
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
   * Optional. Maximum number of EntryTypes to return. The service may return
   * fewer than this value. If unspecified, the service returns at most 10
   * EntryTypes. The maximum value is 1000; values above 1000 will be coerced to
   * 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous `ListEntryTypes` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters you provided to `ListEntryTypes` must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous `ListEntryTypes` call.
   * Provide this to retrieve the subsequent page. When paginating, all other
   * parameters you provided to `ListEntryTypes` must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filter request. Filters are case-sensitive.
   * The service supports the following formats:
   *
   * * labels.key1 = "value1"
   * * labels:key1
   * * name = "value"
   *
   * These restrictions can be conjoined with AND, OR, and NOT conjunctions.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter request. Filters are case-sensitive.
   * The service supports the following formats:
   *
   * * labels.key1 = "value1"
   * * labels:key1
   * * name = "value"
   *
   * These restrictions can be conjoined with AND, OR, and NOT conjunctions.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Orders the result by `name` or `create_time` fields.
   * If not specified, the ordering is undefined.
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
   * Optional. Orders the result by `name` or `create_time` fields.
   * If not specified, the ordering is undefined.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
