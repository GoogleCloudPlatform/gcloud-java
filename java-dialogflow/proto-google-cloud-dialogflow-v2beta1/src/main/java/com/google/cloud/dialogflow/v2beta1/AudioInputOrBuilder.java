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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface AudioInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AudioInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   *
   * @return The config.
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.InputAudioConfig config = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.InputAudioConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The natural language speech audio to be processed.
   * A single request can contain up to 1 minute of speech audio data.
   * The transcribed text cannot contain more than 256 bytes for virtual agent
   * interactions.
   * </pre>
   *
   * <code>bytes audio = 2;</code>
   *
   * @return The audio.
   */
  com.google.protobuf.ByteString getAudio();
}
