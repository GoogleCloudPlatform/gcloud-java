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
// source: google/cloud/networkmanagement/v1/connectivity_test.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkmanagement.v1;

public interface LatencyPercentileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.LatencyPercentile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Percentage of samples this data point applies to.
   * </pre>
   *
   * <code>int32 percent = 1;</code>
   *
   * @return The percent.
   */
  int getPercent();

  /**
   *
   *
   * <pre>
   * percent-th percentile of latency observed, in microseconds.
   * Fraction of percent/100 of samples have latency lower or
   * equal to the value of this field.
   * </pre>
   *
   * <code>int64 latency_micros = 2;</code>
   *
   * @return The latencyMicros.
   */
  long getLatencyMicros();
}
