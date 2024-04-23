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
// source: google/cloud/dataproc/v1/operations.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface ClusterOperationStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterOperationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A message containing the operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperationStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. A message containing the operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterOperationStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1.ClusterOperationStatus.State getState();

  /**
   *
   *
   * <pre>
   * Output only. A message containing the detailed operation state.
   * </pre>
   *
   * <code>string inner_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The innerState.
   */
  java.lang.String getInnerState();
  /**
   *
   *
   * <pre>
   * Output only. A message containing the detailed operation state.
   * </pre>
   *
   * <code>string inner_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for innerState.
   */
  com.google.protobuf.ByteString getInnerStateBytes();

  /**
   *
   *
   * <pre>
   * Output only. A message containing any operation metadata details.
   * </pre>
   *
   * <code>string details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   *
   *
   * <pre>
   * Output only. A message containing any operation metadata details.
   * </pre>
   *
   * <code>string details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString getDetailsBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateStartTime field is set.
   */
  boolean hasStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateStartTime.
   */
  com.google.protobuf.Timestamp getStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder();
}
