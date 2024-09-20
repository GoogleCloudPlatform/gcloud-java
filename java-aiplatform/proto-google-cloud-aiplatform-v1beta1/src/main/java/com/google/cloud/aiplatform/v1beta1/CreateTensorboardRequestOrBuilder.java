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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CreateTensorboardRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateTensorboardRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the Tensorboard in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create the Tensorboard in.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The Tensorboard to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Tensorboard tensorboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tensorboard field is set.
   */
  boolean hasTensorboard();
  /**
   *
   *
   * <pre>
   * Required. The Tensorboard to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Tensorboard tensorboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tensorboard.
   */
  com.google.cloud.aiplatform.v1beta1.Tensorboard getTensorboard();
  /**
   *
   *
   * <pre>
   * Required. The Tensorboard to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Tensorboard tensorboard = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TensorboardOrBuilder getTensorboardOrBuilder();
}
