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
// source: google/cloud/discoveryengine/v1beta/search_tuning_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface TrainCustomModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.TrainCustomModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Storage training input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.GcsTrainingInput gcs_training_input = 2;
   * </code>
   *
   * @return Whether the gcsTrainingInput field is set.
   */
  boolean hasGcsTrainingInput();
  /**
   *
   *
   * <pre>
   * Cloud Storage training input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.GcsTrainingInput gcs_training_input = 2;
   * </code>
   *
   * @return The gcsTrainingInput.
   */
  com.google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.GcsTrainingInput
      getGcsTrainingInput();
  /**
   *
   *
   * <pre>
   * Cloud Storage training input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.GcsTrainingInput gcs_training_input = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.GcsTrainingInputOrBuilder
      getGcsTrainingInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Data Store, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store`.
   * This field is used to identify the data store where to train the models.
   * </pre>
   *
   * <code>
   * string data_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The dataStore.
   */
  java.lang.String getDataStore();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Data Store, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store`.
   * This field is used to identify the data store where to train the models.
   * </pre>
   *
   * <code>
   * string data_store = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for dataStore.
   */
  com.google.protobuf.ByteString getDataStoreBytes();

  /**
   *
   *
   * <pre>
   * Model to be trained. Supported values are:
   *
   *  * **search-tuning**: Fine tuning the search system based on data provided.
   * </pre>
   *
   * <code>string model_type = 3;</code>
   *
   * @return The modelType.
   */
  java.lang.String getModelType();
  /**
   *
   *
   * <pre>
   * Model to be trained. Supported values are:
   *
   *  * **search-tuning**: Fine tuning the search system based on data provided.
   * </pre>
   *
   * <code>string model_type = 3;</code>
   *
   * @return The bytes for modelType.
   */
  com.google.protobuf.ByteString getModelTypeBytes();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the data ingestion and
   * training.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 4;</code>
   *
   * @return Whether the errorConfig field is set.
   */
  boolean hasErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the data ingestion and
   * training.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 4;</code>
   *
   * @return The errorConfig.
   */
  com.google.cloud.discoveryengine.v1beta.ImportErrorConfig getErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the data ingestion and
   * training.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 4;</code>
   */
  com.google.cloud.discoveryengine.v1beta.ImportErrorConfigOrBuilder getErrorConfigOrBuilder();

  com.google.cloud.discoveryengine.v1beta.TrainCustomModelRequest.TrainingInputCase
      getTrainingInputCase();
}
