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
// source: google/area120/tables/v1alpha1/tables.proto

// Protobuf Java Version: 3.25.3
package com.google.area120.tables.v1alpha1;

public interface ListRowsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.ListRowsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent table.
   * Format: tables/{table}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent table.
   * Format: tables/{table}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of rows to return. The service may return fewer than
   * this value.
   *
   * If unspecified, at most 50 rows are returned. The maximum value is 1,000;
   * values above 1,000 are coerced to 1,000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListRows` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRows` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `ListRows` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRows` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.area120.tables.v1alpha1.View getView();

  /**
   *
   *
   * <pre>
   * Optional. Raw text query to search for in rows of the table.
   * Special characters must be escaped. Logical operators and field specific
   * filtering not supported.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Raw text query to search for in rows of the table.
   * Special characters must be escaped. Logical operators and field specific
   * filtering not supported.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
