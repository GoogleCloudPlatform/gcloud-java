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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

public interface DeleteMigrationJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.DeleteMigrationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the migration job resource to delete.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the migration job resource to delete.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A unique ID used to identify the request. If the server receives two
   * requests with the same ID, then the second request is ignored.
   *
   * It is recommended to always set this value to a UUID.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 2;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A unique ID used to identify the request. If the server receives two
   * requests with the same ID, then the second request is ignored.
   *
   * It is recommended to always set this value to a UUID.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 2;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * The destination CloudSQL connection profile is always deleted with the
   * migration job. In case of force delete, the destination CloudSQL replica
   * database is also deleted.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
