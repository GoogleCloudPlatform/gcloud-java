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
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

public interface RemoveDatapointsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RemoveDatapointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString getIndexBytes();

  /**
   *
   *
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   *
   * @return A list containing the datapointIds.
   */
  java.util.List<java.lang.String> getDatapointIdsList();
  /**
   *
   *
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   *
   * @return The count of datapointIds.
   */
  int getDatapointIdsCount();
  /**
   *
   *
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The datapointIds at the given index.
   */
  java.lang.String getDatapointIds(int index);
  /**
   *
   *
   * <pre>
   * A list of datapoint ids to be deleted.
   * </pre>
   *
   * <code>repeated string datapoint_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the datapointIds at the given index.
   */
  com.google.protobuf.ByteString getDatapointIdsBytes(int index);
}
