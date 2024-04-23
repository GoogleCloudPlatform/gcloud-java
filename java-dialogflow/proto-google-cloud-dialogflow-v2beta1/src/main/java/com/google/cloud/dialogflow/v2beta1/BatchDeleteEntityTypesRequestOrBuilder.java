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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2beta1;

public interface BatchDeleteEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`.
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
   * Required. The name of the agent to delete all entities types for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent`.
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
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the entityTypeNames.
   */
  java.util.List<java.lang.String> getEntityTypeNamesList();
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of entityTypeNames.
   */
  int getEntityTypeNamesCount();
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The entityTypeNames at the given index.
   */
  java.lang.String getEntityTypeNames(int index);
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the entityTypeNames at the given index.
   */
  com.google.protobuf.ByteString getEntityTypeNamesBytes(int index);
}
