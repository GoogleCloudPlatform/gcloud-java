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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface PacketIntervalsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PacketIntervals)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Average observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 avg_ms = 204811827;</code>
   *
   * @return Whether the avgMs field is set.
   */
  boolean hasAvgMs();
  /**
   *
   *
   * <pre>
   * Average observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 avg_ms = 204811827;</code>
   *
   * @return The avgMs.
   */
  long getAvgMs();

  /**
   *
   *
   * <pre>
   * From how long ago in the past these intervals were observed.
   * Check the Duration enum for the list of possible values.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * From how long ago in the past these intervals were observed.
   * Check the Duration enum for the list of possible values.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   *
   *
   * <pre>
   * From how long ago in the past these intervals were observed.
   * Check the Duration enum for the list of possible values.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   *
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString getDurationBytes();

  /**
   *
   *
   * <pre>
   * Maximum observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 max_ms = 529474145;</code>
   *
   * @return Whether the maxMs field is set.
   */
  boolean hasMaxMs();
  /**
   *
   *
   * <pre>
   * Maximum observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 max_ms = 529474145;</code>
   *
   * @return The maxMs.
   */
  long getMaxMs();

  /**
   *
   *
   * <pre>
   * Minimum observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 min_ms = 536564403;</code>
   *
   * @return Whether the minMs field is set.
   */
  boolean hasMinMs();
  /**
   *
   *
   * <pre>
   * Minimum observed inter-packet interval in milliseconds.
   * </pre>
   *
   * <code>optional int64 min_ms = 536564403;</code>
   *
   * @return The minMs.
   */
  long getMinMs();

  /**
   *
   *
   * <pre>
   * Number of inter-packet intervals from which these statistics were derived.
   * </pre>
   *
   * <code>optional int64 num_intervals = 186329813;</code>
   *
   * @return Whether the numIntervals field is set.
   */
  boolean hasNumIntervals();
  /**
   *
   *
   * <pre>
   * Number of inter-packet intervals from which these statistics were derived.
   * </pre>
   *
   * <code>optional int64 num_intervals = 186329813;</code>
   *
   * @return The numIntervals.
   */
  long getNumIntervals();

  /**
   *
   *
   * <pre>
   * The type of packets for which inter-packet intervals were computed.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * The type of packets for which inter-packet intervals were computed.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of packets for which inter-packet intervals were computed.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
