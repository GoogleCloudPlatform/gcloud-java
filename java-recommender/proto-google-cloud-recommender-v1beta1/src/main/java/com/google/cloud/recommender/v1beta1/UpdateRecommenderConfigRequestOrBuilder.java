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
// source: google/cloud/recommender/v1beta1/recommender_service.proto

package com.google.cloud.recommender.v1beta1;

public interface UpdateRecommenderConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.UpdateRecommenderConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the recommenderConfig field is set.
   */
  boolean hasRecommenderConfig();
  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The recommenderConfig.
   */
  com.google.cloud.recommender.v1beta1.RecommenderConfig getRecommenderConfig();
  /**
   *
   *
   * <pre>
   * Required. The RecommenderConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.RecommenderConfig recommender_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.recommender.v1beta1.RecommenderConfigOrBuilder getRecommenderConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, validate the request and preview the change, but do not actually
   * update it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
