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
// source: google/cloud/dialogflow/v2/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

public interface SummarizationSectionListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SummarizationSectionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Summarization sections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SummarizationSection summarization_sections = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SummarizationSection>
      getSummarizationSectionsList();
  /**
   *
   *
   * <pre>
   * Optional. Summarization sections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SummarizationSection summarization_sections = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.SummarizationSection getSummarizationSections(int index);
  /**
   *
   *
   * <pre>
   * Optional. Summarization sections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SummarizationSection summarization_sections = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSummarizationSectionsCount();
  /**
   *
   *
   * <pre>
   * Optional. Summarization sections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SummarizationSection summarization_sections = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SummarizationSectionOrBuilder>
      getSummarizationSectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Summarization sections.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SummarizationSection summarization_sections = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.SummarizationSectionOrBuilder getSummarizationSectionsOrBuilder(
      int index);
}
