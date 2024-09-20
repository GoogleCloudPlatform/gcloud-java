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

public interface UpdateTensorboardExperimentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateTensorboardExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field is overwritten if it's in the mask. If the
   * user does not provide a mask then all fields are overwritten if new
   * values are specified.
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
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field is overwritten if it's in the mask. If the
   * user does not provide a mask then all fields are overwritten if new
   * values are specified.
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
   * TensorboardExperiment resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field is overwritten if it's in the mask. If the
   * user does not provide a mask then all fields are overwritten if new
   * values are specified.
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
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tensorboardExperiment field is set.
   */
  boolean hasTensorboardExperiment();
  /**
   *
   *
   * <pre>
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tensorboardExperiment.
   */
  com.google.cloud.aiplatform.v1beta1.TensorboardExperiment getTensorboardExperiment();
  /**
   *
   *
   * <pre>
   * Required. The TensorboardExperiment's `name` field is used to identify the
   * TensorboardExperiment to be updated. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.TensorboardExperiment tensorboard_experiment = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.TensorboardExperimentOrBuilder
      getTensorboardExperimentOrBuilder();
}
