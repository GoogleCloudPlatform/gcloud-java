/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface TranslateTextGlossaryConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.TranslateTextGlossaryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `glossary` to be applied for this translation.
   * The format depends on glossary:
   * - User provided custom glossary:
   *   `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The glossary.
   */
  java.lang.String getGlossary();
  /**
   *
   *
   * <pre>
   * Required. The `glossary` to be applied for this translation.
   * The format depends on glossary:
   * - User provided custom glossary:
   *   `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`
   * </pre>
   *
   * <code>string glossary = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for glossary.
   */
  com.google.protobuf.ByteString getGlossaryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates match is case-insensitive.
   * Default value is false if missing.
   * </pre>
   *
   * <code>bool ignore_case = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ignoreCase.
   */
  boolean getIgnoreCase();
}
