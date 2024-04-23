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
// source: google/cloud/talent/v4/job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4;

public interface CreateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.CreateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
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
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenants/bar".
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
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The job.
   */
  com.google.cloud.talent.v4.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The Job to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4.JobOrBuilder getJobOrBuilder();
}
