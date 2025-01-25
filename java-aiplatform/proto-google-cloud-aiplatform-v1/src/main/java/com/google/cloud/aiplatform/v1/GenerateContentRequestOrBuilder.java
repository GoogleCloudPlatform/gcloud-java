/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/aiplatform/v1/prediction_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface GenerateContentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.GenerateContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The fully qualified name of the publisher model or tuned model
   * endpoint to use.
   *
   * Publisher model format:
   * `projects/{project}/locations/{location}/publishers/&#42;&#47;models/&#42;`
   *
   * Tuned model endpoint format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Required. The fully qualified name of the publisher model or tuned model
   * endpoint to use.
   *
   * Publisher model format:
   * `projects/{project}/locations/{location}/publishers/&#42;&#47;models/&#42;`
   *
   * Tuned model endpoint format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Content> getContentsList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.Content getContents(int index);
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getContentsCount();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ContentOrBuilder>
      getContentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ContentOrBuilder getContentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The user provided system instructions for the model.
   * Note: only text should be used in parts and content in each part will be in
   * a separate paragraph.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.Content system_instruction = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the systemInstruction field is set.
   */
  boolean hasSystemInstruction();
  /**
   *
   *
   * <pre>
   * Optional. The user provided system instructions for the model.
   * Note: only text should be used in parts and content in each part will be in
   * a separate paragraph.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.Content system_instruction = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The systemInstruction.
   */
  com.google.cloud.aiplatform.v1.Content getSystemInstruction();
  /**
   *
   *
   * <pre>
   * Optional. The user provided system instructions for the model.
   * Note: only text should be used in parts and content in each part will be in
   * a separate paragraph.
   * </pre>
   *
   * <code>
   * optional .google.cloud.aiplatform.v1.Content system_instruction = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ContentOrBuilder getSystemInstructionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The name of the cached content used as context to serve the
   * prediction. Note: only used in explicit caching, where users can have
   * control over caching (e.g. what content to cache) and enjoy guaranteed cost
   * savings. Format:
   * `projects/{project}/locations/{location}/cachedContents/{cachedContent}`
   * </pre>
   *
   * <code>
   * string cached_content = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cachedContent.
   */
  java.lang.String getCachedContent();
  /**
   *
   *
   * <pre>
   * Optional. The name of the cached content used as context to serve the
   * prediction. Note: only used in explicit caching, where users can have
   * control over caching (e.g. what content to cache) and enjoy guaranteed cost
   * savings. Format:
   * `projects/{project}/locations/{location}/cachedContents/{cachedContent}`
   * </pre>
   *
   * <code>
   * string cached_content = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cachedContent.
   */
  com.google.protobuf.ByteString getCachedContentBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Tool> getToolsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.Tool getTools(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getToolsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ToolOrBuilder> getToolsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ToolOrBuilder getToolsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Tool config. This config is shared for all tools provided in the
   * request.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ToolConfig tool_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the toolConfig field is set.
   */
  boolean hasToolConfig();
  /**
   *
   *
   * <pre>
   * Optional. Tool config. This config is shared for all tools provided in the
   * request.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ToolConfig tool_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The toolConfig.
   */
  com.google.cloud.aiplatform.v1.ToolConfig getToolConfig();
  /**
   *
   *
   * <pre>
   * Optional. Tool config. This config is shared for all tools provided in the
   * request.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ToolConfig tool_config = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ToolConfigOrBuilder getToolConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request. It is used
   * for billing and reporting only.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request. It is used
   * for billing and reporting only.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
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
   * Optional. The labels with user-defined metadata for the request. It is used
   * for billing and reporting only.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request. It is used
   * for billing and reporting only.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
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
   * Optional. The labels with user-defined metadata for the request. It is used
   * for billing and reporting only.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints) and can only contain lowercase letters, numeric
   * characters, underscores, and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.SafetySetting> getSafetySettingsList();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SafetySetting getSafetySettings(int index);
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSafetySettingsCount();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.SafetySettingOrBuilder>
      getSafetySettingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.SafetySettingOrBuilder getSafetySettingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the generationConfig field is set.
   */
  boolean hasGenerationConfig();
  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The generationConfig.
   */
  com.google.cloud.aiplatform.v1.GenerationConfig getGenerationConfig();
  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.GenerationConfigOrBuilder getGenerationConfigOrBuilder();
}
