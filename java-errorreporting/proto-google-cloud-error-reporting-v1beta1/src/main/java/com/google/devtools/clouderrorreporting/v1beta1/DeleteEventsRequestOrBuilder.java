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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

// Protobuf Java Version: 3.25.2
package com.google.devtools.clouderrorreporting.v1beta1;

public interface DeleteEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectID}`, where `{projectID}` is the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   *
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectID}`, where `{projectID}` is the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   *
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString getProjectNameBytes();
}
