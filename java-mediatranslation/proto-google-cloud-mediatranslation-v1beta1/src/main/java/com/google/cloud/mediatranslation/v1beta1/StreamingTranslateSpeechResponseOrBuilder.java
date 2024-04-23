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
// source: google/cloud/mediatranslation/v1beta1/media_translation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.mediatranslation.v1beta1;

public interface StreamingTranslateSpeechResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status] message that
   * specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The translation result that is currently being processed (is_final could be
   * true or false).
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResult result = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   *
   *
   * <pre>
   * Output only. The translation result that is currently being processed (is_final could be
   * true or false).
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResult result = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The result.
   */
  com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResult getResult();
  /**
   *
   *
   * <pre>
   * Output only. The translation result that is currently being processed (is_final could be
   * true or false).
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResult result = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResultOrBuilder
      getResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Indicates the type of speech event.
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResponse.SpeechEventType speech_event_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for speechEventType.
   */
  int getSpeechEventTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Indicates the type of speech event.
   * </pre>
   *
   * <code>
   * .google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResponse.SpeechEventType speech_event_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The speechEventType.
   */
  com.google.cloud.mediatranslation.v1beta1.StreamingTranslateSpeechResponse.SpeechEventType
      getSpeechEventType();
}
