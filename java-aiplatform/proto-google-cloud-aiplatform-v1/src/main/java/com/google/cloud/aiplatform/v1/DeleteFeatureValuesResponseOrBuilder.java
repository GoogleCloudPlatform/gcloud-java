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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface DeleteFeatureValuesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeleteFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Response for request specifying the entities to delete
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectEntity select_entity = 1;
   * </code>
   *
   * @return Whether the selectEntity field is set.
   */
  boolean hasSelectEntity();
  /**
   *
   *
   * <pre>
   * Response for request specifying the entities to delete
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectEntity select_entity = 1;
   * </code>
   *
   * @return The selectEntity.
   */
  com.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectEntity getSelectEntity();
  /**
   *
   *
   * <pre>
   * Response for request specifying the entities to delete
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectEntity select_entity = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectEntityOrBuilder
      getSelectEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * Response for request specifying time range and feature
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectTimeRangeAndFeature select_time_range_and_feature = 2;
   * </code>
   *
   * @return Whether the selectTimeRangeAndFeature field is set.
   */
  boolean hasSelectTimeRangeAndFeature();
  /**
   *
   *
   * <pre>
   * Response for request specifying time range and feature
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectTimeRangeAndFeature select_time_range_and_feature = 2;
   * </code>
   *
   * @return The selectTimeRangeAndFeature.
   */
  com.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectTimeRangeAndFeature
      getSelectTimeRangeAndFeature();
  /**
   *
   *
   * <pre>
   * Response for request specifying time range and feature
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectTimeRangeAndFeature select_time_range_and_feature = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.SelectTimeRangeAndFeatureOrBuilder
      getSelectTimeRangeAndFeatureOrBuilder();

  com.google.cloud.aiplatform.v1.DeleteFeatureValuesResponse.ResponseCase getResponseCase();
}
