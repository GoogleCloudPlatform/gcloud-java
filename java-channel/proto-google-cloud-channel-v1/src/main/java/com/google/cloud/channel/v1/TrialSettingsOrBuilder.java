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
// source: google/cloud/channel/v1/entitlements.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

public interface TrialSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.TrialSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Determines if the entitlement is in a trial or not:
   *
   * * `true` - The entitlement is in trial.
   * * `false` - The entitlement is not in trial.
   * </pre>
   *
   * <code>bool trial = 1;</code>
   *
   * @return The trial.
   */
  boolean getTrial();

  /**
   *
   *
   * <pre>
   * Date when the trial ends. The value is in milliseconds
   * using the UNIX Epoch format. See an example [Epoch
   * converter](https://www.epochconverter.com).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Date when the trial ends. The value is in milliseconds
   * using the UNIX Epoch format. See an example [Epoch
   * converter](https://www.epochconverter.com).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Date when the trial ends. The value is in milliseconds
   * using the UNIX Epoch format. See an example [Epoch
   * converter](https://www.epochconverter.com).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
