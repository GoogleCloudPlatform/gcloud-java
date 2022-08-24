/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public interface CreateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource [name](https://cloud.google.com/monitoring/api/v3#project_name) of
   * the parent workspace. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource [name](https://cloud.google.com/monitoring/api/v3#project_name) of
   * the parent workspace. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
   * </pre>
   *
   * <code>string service_id = 3;</code>
   *
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
   * </pre>
   *
   * <code>string service_id = 3;</code>
   *
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString getServiceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  com.google.monitoring.v3.Service getService();
  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.ServiceOrBuilder getServiceOrBuilder();
}
