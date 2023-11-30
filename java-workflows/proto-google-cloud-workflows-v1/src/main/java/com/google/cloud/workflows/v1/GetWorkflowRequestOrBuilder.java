/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/workflows/v1/workflows.proto

package com.google.cloud.workflows.v1;

public interface GetWorkflowRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.v1.GetWorkflowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the workflow for which information should be retrieved.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
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
   * Required. Name of the workflow for which information should be retrieved.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
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
   * Optional. The revision of the workflow to retrieve. If the revision_id is
   * empty, the latest revision is retrieved.
   * The format is "000001-a4d", where the first six characters define
   * the zero-padded decimal revision number. They are followed by a hyphen and
   * three hexadecimal characters.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * Optional. The revision of the workflow to retrieve. If the revision_id is
   * empty, the latest revision is retrieved.
   * The format is "000001-a4d", where the first six characters define
   * the zero-padded decimal revision number. They are followed by a hyphen and
   * three hexadecimal characters.
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();
}
