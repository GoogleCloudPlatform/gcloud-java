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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

public interface CreateInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.CreateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The instance's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Cloud Filestore,
   * locations map to GCP zones, for example **us-west1-b**.
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
   * Required. The instance's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Cloud Filestore,
   * locations map to GCP zones, for example **us-west1-b**.
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
   * Required. The name of the instance to create.
   * The name must be unique for the specified project and location.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Required. The name of the instance to create.
   * The name must be unique for the specified project and location.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1.Instance]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1.Instance]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instance.
   */
  com.google.cloud.filestore.v1.Instance getInstance();
  /**
   *
   *
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1.Instance]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.filestore.v1.InstanceOrBuilder getInstanceOrBuilder();
}
