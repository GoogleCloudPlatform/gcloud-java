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
// source: google/cloud/translate/v3/adaptive_mt.proto

package com.google.cloud.translate.v3;

public interface AdaptiveMtTranslateResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.AdaptiveMtTranslateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.translate.v3.AdaptiveMtTranslation> getTranslationsList();
  /**
   *
   *
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.translate.v3.AdaptiveMtTranslation getTranslations(int index);
  /**
   *
   *
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTranslationsCount();
  /**
   *
   *
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder>
      getTranslationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The translation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.translation.v3.AdaptiveMtTranslation translations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.translate.v3.AdaptiveMtTranslationOrBuilder getTranslationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The translation's language code.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Output only. The translation's language code.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
