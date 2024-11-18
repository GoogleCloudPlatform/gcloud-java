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
// source: google/cloud/kms/v1/autokey.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.kms.v1;

public interface ListKeyHandlesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListKeyHandlesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the resource project and location from which to list
   * [KeyHandles][google.cloud.kms.v1.KeyHandle], e.g.
   * `projects/{PROJECT_ID}/locations/{LOCATION}`.
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
   * Required. Name of the resource project and location from which to list
   * [KeyHandles][google.cloud.kms.v1.KeyHandle], e.g.
   * `projects/{PROJECT_ID}/locations/{LOCATION}`.
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
   * Optional. Optional limit on the number of
   * [KeyHandles][google.cloud.kms.v1.KeyHandle] to include in the response. The
   * service may return fewer than this value. Further
   * [KeyHandles][google.cloud.kms.v1.KeyHandle] can subsequently be obtained by
   * including the
   * [ListKeyHandlesResponse.next_page_token][google.cloud.kms.v1.ListKeyHandlesResponse.next_page_token]
   * in a subsequent request.  If unspecified, at most 100
   * [KeyHandles][google.cloud.kms.v1.KeyHandle] will be returned.
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
   * Optional. Optional pagination token, returned earlier via
   * [ListKeyHandlesResponse.next_page_token][google.cloud.kms.v1.ListKeyHandlesResponse.next_page_token].
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
   * Optional. Optional pagination token, returned earlier via
   * [ListKeyHandlesResponse.next_page_token][google.cloud.kms.v1.ListKeyHandlesResponse.next_page_token].
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
   * Optional. Filter to apply when listing
   * [KeyHandles][google.cloud.kms.v1.KeyHandle], e.g.
   * `resource_type_selector="{SERVICE}.googleapis.com/{TYPE}"`.
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
   * Optional. Filter to apply when listing
   * [KeyHandles][google.cloud.kms.v1.KeyHandle], e.g.
   * `resource_type_selector="{SERVICE}.googleapis.com/{TYPE}"`.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
