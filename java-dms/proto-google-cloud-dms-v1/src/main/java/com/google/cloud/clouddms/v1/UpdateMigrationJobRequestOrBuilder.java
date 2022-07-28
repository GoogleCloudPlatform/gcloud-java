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
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

public interface UpdateMigrationJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.UpdateMigrationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * migration job resource by the update.
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * migration job resource by the update.
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
   * Required. Field mask is used to specify the fields to be overwritten in the
   * migration job resource by the update.
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
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the migrationJob field is set.
   */
  boolean hasMigrationJob();
  /**
   *
   *
   * <pre>
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The migrationJob.
   */
  com.google.cloud.clouddms.v1.MigrationJob getMigrationJob();
  /**
   *
   *
   * <pre>
   * Required. The migration job parameters to update.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.MigrationJob migration_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.clouddms.v1.MigrationJobOrBuilder getMigrationJobOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A unique id used to identify the request. If the server receives two
   * requests with the same id, then the second request will be ignored.
   * It is recommended to always set this value to a UUID.
   * The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
