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
// source: google/cloud/discoveryengine/v1alpha/search_tuning_service.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface TrainCustomModelResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.TrainCustomModelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the data.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<com.google.rpc.Status> getErrorSamplesList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the data.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.Status getErrorSamples(int index);
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the data.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  int getErrorSamplesCount();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the data.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the data.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.ImportErrorConfig error_config = 2;</code>
   *
   * @return Whether the errorConfig field is set.
   */
  boolean hasErrorConfig();
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.ImportErrorConfig error_config = 2;</code>
   *
   * @return The errorConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.ImportErrorConfig getErrorConfig();
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.ImportErrorConfig error_config = 2;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.ImportErrorConfigOrBuilder getErrorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The trained model status. Possible values are:
   *
   *  * **bad-data**: The training data quality is bad.
   *  * **no-improvement**: Tuning didn't improve performance. Won't deploy.
   *  * **in-progress**: Model training is in progress.
   *  * **ready**: The model is ready for serving.
   * </pre>
   *
   * <code>string model_status = 3;</code>
   *
   * @return The modelStatus.
   */
  java.lang.String getModelStatus();
  /**
   *
   *
   * <pre>
   * The trained model status. Possible values are:
   *
   *  * **bad-data**: The training data quality is bad.
   *  * **no-improvement**: Tuning didn't improve performance. Won't deploy.
   *  * **in-progress**: Model training is in progress.
   *  * **ready**: The model is ready for serving.
   * </pre>
   *
   * <code>string model_status = 3;</code>
   *
   * @return The bytes for modelStatus.
   */
  com.google.protobuf.ByteString getModelStatusBytes();
}
