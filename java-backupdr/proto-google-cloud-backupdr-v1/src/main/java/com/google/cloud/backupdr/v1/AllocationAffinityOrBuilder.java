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
// source: google/cloud/backupdr/v1/backupvault_gce.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.backupdr.v1;

public interface AllocationAffinityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.AllocationAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of reservation from which this instance can
   * consume
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AllocationAffinity.Type consume_allocation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the consumeAllocationType field is set.
   */
  boolean hasConsumeAllocationType();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of reservation from which this instance can
   * consume
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AllocationAffinity.Type consume_allocation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for consumeAllocationType.
   */
  int getConsumeAllocationTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of reservation from which this instance can
   * consume
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AllocationAffinity.Type consume_allocation_type = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The consumeAllocationType.
   */
  com.google.cloud.backupdr.v1.AllocationAffinity.Type getConsumeAllocationType();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of a reservation resource.
   * </pre>
   *
   * <code>optional string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of a reservation resource.
   * </pre>
   *
   * <code>optional string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label key of a reservation resource.
   * </pre>
   *
   * <code>optional string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * Optional. Corresponds to the label values of a reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
