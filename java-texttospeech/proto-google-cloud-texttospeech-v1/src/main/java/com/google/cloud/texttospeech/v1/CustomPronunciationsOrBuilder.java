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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.texttospeech.v1;

public interface CustomPronunciationsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.CustomPronunciations)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The pronunciation customizations to be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.CustomPronunciationParams pronunciations = 1;
   * </code>
   */
  java.util.List<com.google.cloud.texttospeech.v1.CustomPronunciationParams>
      getPronunciationsList();
  /**
   *
   *
   * <pre>
   * The pronunciation customizations to be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.CustomPronunciationParams pronunciations = 1;
   * </code>
   */
  com.google.cloud.texttospeech.v1.CustomPronunciationParams getPronunciations(int index);
  /**
   *
   *
   * <pre>
   * The pronunciation customizations to be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.CustomPronunciationParams pronunciations = 1;
   * </code>
   */
  int getPronunciationsCount();
  /**
   *
   *
   * <pre>
   * The pronunciation customizations to be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.CustomPronunciationParams pronunciations = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.texttospeech.v1.CustomPronunciationParamsOrBuilder>
      getPronunciationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The pronunciation customizations to be applied.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.CustomPronunciationParams pronunciations = 1;
   * </code>
   */
  com.google.cloud.texttospeech.v1.CustomPronunciationParamsOrBuilder getPronunciationsOrBuilder(
      int index);
}
