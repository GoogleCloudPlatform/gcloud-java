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
// source: google/cloud/dialogflow/v2/conversation.proto

package com.google.cloud.dialogflow.v2;

public interface SearchKnowledgeAnswerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SearchKnowledgeAnswer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The piece of text from the knowledge base documents that answers
   * the search query
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The answer.
   */
  java.lang.String getAnswer();
  /**
   *
   *
   * <pre>
   * The piece of text from the knowledge base documents that answers
   * the search query
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The bytes for answer.
   */
  com.google.protobuf.ByteString getAnswerBytes();

  /**
   *
   *
   * <pre>
   * The type of the answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerType answer_type = 2;</code>
   *
   * @return The enum numeric value on the wire for answerType.
   */
  int getAnswerTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerType answer_type = 2;</code>
   *
   * @return The answerType.
   */
  com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerType getAnswerType();

  /**
   *
   *
   * <pre>
   * All sources used to generate the answer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource answer_sources = 3;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource>
      getAnswerSourcesList();
  /**
   *
   *
   * <pre>
   * All sources used to generate the answer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource answer_sources = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource getAnswerSources(int index);
  /**
   *
   *
   * <pre>
   * All sources used to generate the answer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource answer_sources = 3;
   * </code>
   */
  int getAnswerSourcesCount();
  /**
   *
   *
   * <pre>
   * All sources used to generate the answer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource answer_sources = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSourceOrBuilder>
      getAnswerSourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All sources used to generate the answer.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSource answer_sources = 3;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.AnswerSourceOrBuilder
      getAnswerSourcesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;location ID&gt;/answer
   * Records/&lt;Answer Record ID&gt;`
   * </pre>
   *
   * <code>string answer_record = 5;</code>
   *
   * @return The answerRecord.
   */
  java.lang.String getAnswerRecord();
  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;location ID&gt;/answer
   * Records/&lt;Answer Record ID&gt;`
   * </pre>
   *
   * <code>string answer_record = 5;</code>
   *
   * @return The bytes for answerRecord.
   */
  com.google.protobuf.ByteString getAnswerRecordBytes();
}
