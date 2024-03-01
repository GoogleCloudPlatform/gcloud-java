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
// source: google/cloud/discoveryengine/v1beta/purge_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public interface PurgeDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.PurgeDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
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
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
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
   * Required. Filter matching documents to purge. Only currently supported
   * value is
   * `*` (all items).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. Filter matching documents to purge. Only currently supported
   * value is
   * `*` (all items).
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Actually performs the purge. If `force` is set to false, return the
   * expected purge count without deleting any documents.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
