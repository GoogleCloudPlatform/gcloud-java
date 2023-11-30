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
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface SpeechContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the phrases.
   */
  java.util.List<java.lang.String> getPhrasesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of phrases.
   */
  int getPhrasesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The phrases at the given index.
   */
  java.lang.String getPhrases(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech/limits#content).
   * </pre>
   *
   * <code>repeated string phrases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the phrases at the given index.
   */
  com.google.protobuf.ByteString getPhrasesBytes(int index);
}
