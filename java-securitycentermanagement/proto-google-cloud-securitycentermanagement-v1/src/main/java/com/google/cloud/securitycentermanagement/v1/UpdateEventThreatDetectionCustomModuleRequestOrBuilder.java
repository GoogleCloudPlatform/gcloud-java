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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycentermanagement.v1;

public interface UpdateEventThreatDetectionCustomModuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.UpdateEventThreatDetectionCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The fields to update. If omitted, then all fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The fields to update. If omitted, then all fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The fields to update. If omitted, then all fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The module being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the eventThreatDetectionCustomModule field is set.
   */
  boolean hasEventThreatDetectionCustomModule();
  /**
   *
   *
   * <pre>
   * Required. The module being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The eventThreatDetectionCustomModule.
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule
      getEventThreatDetectionCustomModule();
  /**
   *
   *
   * <pre>
   * Required. The module being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule event_threat_detection_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModuleOrBuilder
      getEventThreatDetectionCustomModuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. When set to `true`, the request will be validated (including IAM
   * checks), but no module will be updated. An `OK` response indicates that the
   * request is valid, while an error response indicates that the request is
   * invalid.
   *
   * If the request is valid, a subsequent request to update the module could
   * still fail for one of the following reasons:
   *
   * *  The state of your cloud resources changed; for example, you lost a
   *    required IAM permission
   * *  An error occurred during creation of the module
   *
   * Defaults to `false`.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
