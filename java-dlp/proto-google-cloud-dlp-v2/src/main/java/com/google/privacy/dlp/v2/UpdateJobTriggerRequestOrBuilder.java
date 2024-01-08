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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface UpdateJobTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.UpdateJobTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the project and the triggeredJob, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
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
   * Required. Resource name of the project and the triggeredJob, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
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
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   *
   * @return Whether the jobTrigger field is set.
   */
  boolean hasJobTrigger();
  /**
   *
   *
   * <pre>
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   *
   * @return The jobTrigger.
   */
  com.google.privacy.dlp.v2.JobTrigger getJobTrigger();
  /**
   *
   *
   * <pre>
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   */
  com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
