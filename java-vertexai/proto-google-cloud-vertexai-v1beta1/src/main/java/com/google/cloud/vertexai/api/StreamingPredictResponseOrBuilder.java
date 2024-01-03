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
// source: google/cloud/vertexai/v1beta1/prediction_service.proto

package com.google.cloud.vertexai.api;

public interface StreamingPredictResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.StreamingPredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1beta1.Tensor outputs = 1;</code>
   */
  java.util.List<com.google.cloud.vertexai.api.Tensor> getOutputsList();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1beta1.Tensor outputs = 1;</code>
   */
  com.google.cloud.vertexai.api.Tensor getOutputs(int index);
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1beta1.Tensor outputs = 1;</code>
   */
  int getOutputsCount();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1beta1.Tensor outputs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vertexai.api.TensorOrBuilder> getOutputsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The prediction output.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1beta1.Tensor outputs = 1;</code>
   */
  com.google.cloud.vertexai.api.TensorOrBuilder getOutputsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.Tensor parameters = 2;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.Tensor parameters = 2;</code>
   *
   * @return The parameters.
   */
  com.google.cloud.vertexai.api.Tensor getParameters();
  /**
   *
   *
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.vertexai.v1beta1.Tensor parameters = 2;</code>
   */
  com.google.cloud.vertexai.api.TensorOrBuilder getParametersOrBuilder();
}
