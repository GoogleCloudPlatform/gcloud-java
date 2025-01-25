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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1;

public interface AutomatedBackupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.AutomatedBackupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Trigger automated backups at a fixed frequency.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig.FixedFrequencySchedule fixed_frequency_schedule = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the fixedFrequencySchedule field is set.
   */
  boolean hasFixedFrequencySchedule();
  /**
   *
   *
   * <pre>
   * Optional. Trigger automated backups at a fixed frequency.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig.FixedFrequencySchedule fixed_frequency_schedule = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fixedFrequencySchedule.
   */
  com.google.cloud.redis.cluster.v1.AutomatedBackupConfig.FixedFrequencySchedule
      getFixedFrequencySchedule();
  /**
   *
   *
   * <pre>
   * Optional. Trigger automated backups at a fixed frequency.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig.FixedFrequencySchedule fixed_frequency_schedule = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.AutomatedBackupConfig.FixedFrequencyScheduleOrBuilder
      getFixedFrequencyScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The automated backup mode. If the mode is disabled, the other
   * fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig.AutomatedBackupMode automated_backup_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for automatedBackupMode.
   */
  int getAutomatedBackupModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The automated backup mode. If the mode is disabled, the other
   * fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AutomatedBackupConfig.AutomatedBackupMode automated_backup_mode = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The automatedBackupMode.
   */
  com.google.cloud.redis.cluster.v1.AutomatedBackupConfig.AutomatedBackupMode
      getAutomatedBackupMode();

  /**
   *
   *
   * <pre>
   * Optional. How long to keep automated backups before the backups are
   * deleted. The value should be between 1 day and 365 days. If not specified,
   * the default value is 35 days.
   * </pre>
   *
   * <code>
   * optional .google.protobuf.Duration retention = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the retention field is set.
   */
  boolean hasRetention();
  /**
   *
   *
   * <pre>
   * Optional. How long to keep automated backups before the backups are
   * deleted. The value should be between 1 day and 365 days. If not specified,
   * the default value is 35 days.
   * </pre>
   *
   * <code>
   * optional .google.protobuf.Duration retention = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The retention.
   */
  com.google.protobuf.Duration getRetention();
  /**
   *
   *
   * <pre>
   * Optional. How long to keep automated backups before the backups are
   * deleted. The value should be between 1 day and 365 days. If not specified,
   * the default value is 35 days.
   * </pre>
   *
   * <code>
   * optional .google.protobuf.Duration retention = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getRetentionOrBuilder();

  com.google.cloud.redis.cluster.v1.AutomatedBackupConfig.ScheduleCase getScheduleCase();
}
