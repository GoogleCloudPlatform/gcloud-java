/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/redis/cluster/v1beta1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1beta1;

public interface ListBackupCollectionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1beta1.ListBackupCollectionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the backupCollection location using the
   * form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
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
   * Required. The resource name of the backupCollection location using the
   * form:
   *     `projects/{project_id}/locations/{location_id}`
   * where `location_id` refers to a GCP region.
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
   * Optional. The maximum number of items to return.
   *
   * If not specified, a default value of 1000 will be used by the service.
   * Regardless of the page_size value, the response may include a partial list
   * and a caller should only rely on response's
   * [`next_page_token`][google.cloud.redis.cluster.v1beta1.ListBackupCollectionsResponse.next_page_token]
   * to determine if there are more clusters left to be queried.
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
   * Optional. The `next_page_token` value returned from a previous
   * [ListBackupCollections] request, if any.
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
   * Optional. The `next_page_token` value returned from a previous
   * [ListBackupCollections] request, if any.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
