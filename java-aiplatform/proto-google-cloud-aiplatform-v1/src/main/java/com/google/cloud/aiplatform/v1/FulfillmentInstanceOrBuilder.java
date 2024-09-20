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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

package com.google.cloud.aiplatform.v1;

public interface FulfillmentInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FulfillmentInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the prediction field is set.
   */
  boolean hasPrediction();
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The prediction.
   */
  java.lang.String getPrediction();
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for prediction.
   */
  com.google.protobuf.ByteString getPredictionBytes();

  /**
   *
   *
   * <pre>
   * Required. Inference instruction prompt to compare prediction with.
   * </pre>
   *
   * <code>optional string instruction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the instruction field is set.
   */
  boolean hasInstruction();
  /**
   *
   *
   * <pre>
   * Required. Inference instruction prompt to compare prediction with.
   * </pre>
   *
   * <code>optional string instruction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instruction.
   */
  java.lang.String getInstruction();
  /**
   *
   *
   * <pre>
   * Required. Inference instruction prompt to compare prediction with.
   * </pre>
   *
   * <code>optional string instruction = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instruction.
   */
  com.google.protobuf.ByteString getInstructionBytes();
}
