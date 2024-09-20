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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface RemoveContextChildrenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent Context.
   *
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The context.
   */
  java.lang.String getContext();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent Context.
   *
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString getContextBytes();

  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the childContexts.
   */
  java.util.List<java.lang.String> getChildContextsList();
  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of childContexts.
   */
  int getChildContextsCount();
  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The childContexts at the given index.
   */
  java.lang.String getChildContexts(int index);
  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the childContexts at the given index.
   */
  com.google.protobuf.ByteString getChildContextsBytes(int index);
}
