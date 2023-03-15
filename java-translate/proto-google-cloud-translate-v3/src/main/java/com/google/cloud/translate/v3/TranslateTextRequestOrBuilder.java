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

public interface TranslateTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.TranslateTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * We recommend the total content be less than 30,000 codepoints. The max
   * length of this field is 1024. Use BatchTranslateText for larger text.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the contents.
   */
  java.util.List<java.lang.String> getContentsList();
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * We recommend the total content be less than 30,000 codepoints. The max
   * length of this field is 1024. Use BatchTranslateText for larger text.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of contents.
   */
  int getContentsCount();
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * We recommend the total content be less than 30,000 codepoints. The max
   * length of this field is 1024. Use BatchTranslateText for larger text.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The contents at the given index.
   */
  java.lang.String getContents(int index);
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * We recommend the total content be less than 30,000 codepoints. The max
   * length of this field is 1024. Use BatchTranslateText for larger text.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the contents at the given index.
   */
  com.google.protobuf.ByteString getContentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The format of the source text, for example, "text/html",
   *  "text/plain". If left blank, the MIME type defaults to "text/html".
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Optional. The format of the source text, for example, "text/html",
   *  "text/plain". If left blank, the MIME type defaults to "text/html".
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input text if
   * known, for example, "en-US" or "sr-Latn". Supported language codes are
   * listed in Language Support. If the source language isn't specified, the API
   * attempts to identify the source language automatically and returns the
   * source language within the response.
   * </pre>
   *
   * <code>string source_language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input text if
   * known, for example, "en-US" or "sr-Latn". Supported language codes are
   * listed in Language Support. If the source language isn't specified, the API
   * attempts to identify the source language automatically and returns the
   * source language within the response.
   * </pre>
   *
   * <code>string source_language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * text, set to one of the language codes listed in Language Support.
   * </pre>
   *
   * <code>string target_language_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetLanguageCode.
   */
  java.lang.String getTargetLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The ISO-639 language code to use for translation of the input
   * text, set to one of the language codes listed in Language Support.
   * </pre>
   *
   * <code>string target_language_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetLanguageCode.
   */
  com.google.protobuf.ByteString getTargetLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * Non-global location is required for requests using AutoML models or
   * custom glossaries.
   * Models and glossaries must be within the same region (have same
   * location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * Non-global location is required for requests using AutoML models or
   * custom glossaries.
   * Models and glossaries must be within the same region (have same
   * location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The `model` type requested for this translation.
   * The format depends on model type:
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   * For global (non-regionalized) requests, use `location-id` `global`.
   * For example,
   * `projects/{project-number-or-id}/locations/global/models/general/nmt`.
   * If not provided, the default Google model (NMT) will be used.
   * </pre>
   *
   * <code>string model = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. The `model` type requested for this translation.
   * The format depends on model type:
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   * For global (non-regionalized) requests, use `location-id` `global`.
   * For example,
   * `projects/{project-number-or-id}/locations/global/models/general/nmt`.
   * If not provided, the default Google model (NMT) will be used.
   * </pre>
   *
   * <code>string model = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be
   * within the same region (have the same location-id) as the model, otherwise
   * an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the glossaryConfig field is set.
   */
  boolean hasGlossaryConfig();
  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be
   * within the same region (have the same location-id) as the model, otherwise
   * an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The glossaryConfig.
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfig getGlossaryConfig();
  /**
   *
   *
   * <pre>
   * Optional. Glossary to be applied. The glossary must be
   * within the same region (have the same location-id) as the model, otherwise
   * an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.translation.v3.TranslateTextGlossaryConfig glossary_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.translate.v3.TranslateTextGlossaryConfigOrBuilder getGlossaryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://cloud.google.com/translate/docs/advanced/labels for more
   * information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
