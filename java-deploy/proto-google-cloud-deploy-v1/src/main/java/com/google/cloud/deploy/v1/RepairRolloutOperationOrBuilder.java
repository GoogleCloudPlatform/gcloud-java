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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public interface RepairRolloutOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.RepairRolloutOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rollout.
   */
  java.lang.String getRollout();
  /**
   *
   *
   * <pre>
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * </pre>
   *
   * <code>string rollout = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for rollout.
   */
  com.google.protobuf.ByteString getRolloutBytes();

  /**
   *
   *
   * <pre>
   * Output only. The index of the current repair action in the repair sequence.
   * </pre>
   *
   * <code>int64 current_repair_mode_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The currentRepairModeIndex.
   */
  long getCurrentRepairModeIndex();

  /**
   *
   *
   * <pre>
   * Output only. Records of the repair attempts. Each repair phase may have
   * multiple retry attempts or single rollback attempt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RepairPhase repair_phases = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.deploy.v1.RepairPhase> getRepairPhasesList();
  /**
   *
   *
   * <pre>
   * Output only. Records of the repair attempts. Each repair phase may have
   * multiple retry attempts or single rollback attempt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RepairPhase repair_phases = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.RepairPhase getRepairPhases(int index);
  /**
   *
   *
   * <pre>
   * Output only. Records of the repair attempts. Each repair phase may have
   * multiple retry attempts or single rollback attempt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RepairPhase repair_phases = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRepairPhasesCount();
  /**
   *
   *
   * <pre>
   * Output only. Records of the repair attempts. Each repair phase may have
   * multiple retry attempts or single rollback attempt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RepairPhase repair_phases = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.deploy.v1.RepairPhaseOrBuilder>
      getRepairPhasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Records of the repair attempts. Each repair phase may have
   * multiple retry attempts or single rollback attempt.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.deploy.v1.RepairPhase repair_phases = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.deploy.v1.RepairPhaseOrBuilder getRepairPhasesOrBuilder(int index);
}
