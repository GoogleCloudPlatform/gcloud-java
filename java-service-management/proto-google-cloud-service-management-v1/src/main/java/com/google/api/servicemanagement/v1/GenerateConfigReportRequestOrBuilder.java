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
// source: google/api/servicemanagement/v1/servicemanager.proto

// Protobuf Java Version: 3.25.3
package com.google.api.servicemanagement.v1;

public interface GenerateConfigReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.GenerateConfigReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Service configuration for which we want to generate the report.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any new_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the newConfig field is set.
   */
  boolean hasNewConfig();
  /**
   *
   *
   * <pre>
   * Required. Service configuration for which we want to generate the report.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any new_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The newConfig.
   */
  com.google.protobuf.Any getNewConfig();
  /**
   *
   *
   * <pre>
   * Required. Service configuration for which we want to generate the report.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any new_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.AnyOrBuilder getNewConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Service configuration against which the comparison will be done.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any old_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the oldConfig field is set.
   */
  boolean hasOldConfig();
  /**
   *
   *
   * <pre>
   * Optional. Service configuration against which the comparison will be done.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any old_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The oldConfig.
   */
  com.google.protobuf.Any getOldConfig();
  /**
   *
   *
   * <pre>
   * Optional. Service configuration against which the comparison will be done.
   * For this version of API, the supported types are
   * [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
   * [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
   * and [google.api.Service][google.api.Service]
   * </pre>
   *
   * <code>.google.protobuf.Any old_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.AnyOrBuilder getOldConfigOrBuilder();
}
