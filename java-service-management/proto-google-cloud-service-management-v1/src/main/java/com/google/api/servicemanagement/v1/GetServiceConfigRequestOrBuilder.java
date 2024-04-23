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

public interface GetServiceConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.GetServiceConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-management/overview) for naming
   * requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the
   * [overview](https://cloud.google.com/service-management/overview) for naming
   * requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the service configuration resource.
   *
   * This field must be specified for the server to return all fields, including
   * `SourceInfo`.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The configId.
   */
  java.lang.String getConfigId();
  /**
   *
   *
   * <pre>
   * Required. The id of the service configuration resource.
   *
   * This field must be specified for the server to return all fields, including
   * `SourceInfo`.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for configId.
   */
  com.google.protobuf.ByteString getConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Specifies which parts of the Service Config should be returned in the
   * response.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Specifies which parts of the Service Config should be returned in the
   * response.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
   *
   * @return The view.
   */
  com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView getView();
}
