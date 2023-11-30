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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface CreateRecognizerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.CreateRecognizerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the recognizer field is set.
   */
  boolean hasRecognizer();
  /**
   *
   *
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The recognizer.
   */
  com.google.cloud.speech.v2.Recognizer getRecognizer();
  /**
   *
   *
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizerOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the Recognizer, but do not
   * actually create it.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * The ID to use for the Recognizer, which will become the final component of
   * the Recognizer's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string recognizer_id = 3;</code>
   *
   * @return The recognizerId.
   */
  java.lang.String getRecognizerId();
  /**
   *
   *
   * <pre>
   * The ID to use for the Recognizer, which will become the final component of
   * the Recognizer's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string recognizer_id = 3;</code>
   *
   * @return The bytes for recognizerId.
   */
  com.google.protobuf.ByteString getRecognizerIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The project and location where this Recognizer will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and location where this Recognizer will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
