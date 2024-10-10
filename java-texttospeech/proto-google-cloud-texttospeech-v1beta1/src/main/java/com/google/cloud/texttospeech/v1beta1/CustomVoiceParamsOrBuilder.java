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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.texttospeech.v1beta1;

public interface CustomVoiceParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.CustomVoiceParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the AutoML model that synthesizes the custom voice.
   * </pre>
   *
   * <code>
   * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Required. The name of the AutoML model that synthesizes the custom voice.
   * </pre>
   *
   * <code>
   * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated. The usage of the synthesized audio to be reported.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.texttospeech.v1beta1.CustomVoiceParams.reported_usage is deprecated.
   *     See google/cloud/texttospeech/v1beta1/cloud_tts.proto;l=373
   * @return The enum numeric value on the wire for reportedUsage.
   */
  @java.lang.Deprecated
  int getReportedUsageValue();
  /**
   *
   *
   * <pre>
   * Optional. Deprecated. The usage of the synthesized audio to be reported.
   * </pre>
   *
   * <code>
   * .google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.texttospeech.v1beta1.CustomVoiceParams.reported_usage is deprecated.
   *     See google/cloud/texttospeech/v1beta1/cloud_tts.proto;l=373
   * @return The reportedUsage.
   */
  @java.lang.Deprecated
  com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage getReportedUsage();
}
