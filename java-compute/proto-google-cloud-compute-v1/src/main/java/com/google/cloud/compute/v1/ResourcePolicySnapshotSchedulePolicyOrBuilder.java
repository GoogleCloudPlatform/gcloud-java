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

public interface ResourcePolicySnapshotSchedulePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Retention policy applied to snapshots created by this resource policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy retention_policy = 68625779;
   * </code>
   *
   * @return Whether the retentionPolicy field is set.
   */
  boolean hasRetentionPolicy();
  /**
   *
   *
   * <pre>
   * Retention policy applied to snapshots created by this resource policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy retention_policy = 68625779;
   * </code>
   *
   * @return The retentionPolicy.
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      getRetentionPolicy();
  /**
   *
   *
   * <pre>
   * Retention policy applied to snapshots created by this resource policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy retention_policy = 68625779;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOrBuilder
      getRetentionPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule schedule = 375820951;
   * </code>
   *
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   *
   *
   * <pre>
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule schedule = 375820951;
   * </code>
   *
   * @return The schedule.
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule getSchedule();
  /**
   *
   *
   * <pre>
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule schedule = 375820951;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyScheduleOrBuilder
      getScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Properties with which snapshots are created such as labels, encryption keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotProperties snapshot_properties = 185371278;
   * </code>
   *
   * @return Whether the snapshotProperties field is set.
   */
  boolean hasSnapshotProperties();
  /**
   *
   *
   * <pre>
   * Properties with which snapshots are created such as labels, encryption keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotProperties snapshot_properties = 185371278;
   * </code>
   *
   * @return The snapshotProperties.
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotProperties
      getSnapshotProperties();
  /**
   *
   *
   * <pre>
   * Properties with which snapshots are created such as labels, encryption keys.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotProperties snapshot_properties = 185371278;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesOrBuilder
      getSnapshotPropertiesOrBuilder();
}
