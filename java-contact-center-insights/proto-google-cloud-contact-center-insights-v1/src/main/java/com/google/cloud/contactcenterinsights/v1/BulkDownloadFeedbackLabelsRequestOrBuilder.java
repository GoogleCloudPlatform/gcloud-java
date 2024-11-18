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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

public interface BulkDownloadFeedbackLabelsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A cloud storage bucket destination.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.GcsDestination gcs_destination = 3;
   * </code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * A cloud storage bucket destination.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.GcsDestination gcs_destination = 3;
   * </code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.GcsDestination
      getGcsDestination();
  /**
   *
   *
   * <pre>
   * A cloud storage bucket destination.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.GcsDestination gcs_destination = 3;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest
          .GcsDestinationOrBuilder
      getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent resource for new feedback labels.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource for new feedback labels.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. A filter to reduce results to a specific subset. Supports
   * disjunctions (OR) and conjunctions (AND).
   *
   * Supported fields:
   *
   * * `issue_model_id`
   * * `qa_question_id`
   * * `qa_scorecard_id`
   * * `min_create_time`
   * * `max_create_time`
   * * `min_update_time`
   * * `max_update_time`
   * * `feedback_label_type`: QUALITY_AI, TOPIC_MODELING
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter to reduce results to a specific subset. Supports
   * disjunctions (OR) and conjunctions (AND).
   *
   * Supported fields:
   *
   * * `issue_model_id`
   * * `qa_question_id`
   * * `qa_scorecard_id`
   * * `min_create_time`
   * * `max_create_time`
   * * `min_update_time`
   * * `max_update_time`
   * * `feedback_label_type`: QUALITY_AI, TOPIC_MODELING
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Limits the maximum number of feedback labels that will be
   * downloaded. The first `N` feedback labels will be downloaded.
   * </pre>
   *
   * <code>int32 max_download_count = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxDownloadCount.
   */
  int getMaxDownloadCount();

  /**
   *
   *
   * <pre>
   * Optional. The type of feedback labels that will be downloaded.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.FeedbackLabelType feedback_label_type = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for feedbackLabelType.
   */
  int getFeedbackLabelTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of feedback labels that will be downloaded.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.FeedbackLabelType feedback_label_type = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The feedbackLabelType.
   */
  com.google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.FeedbackLabelType
      getFeedbackLabelType();

  /**
   *
   *
   * <pre>
   * Optional. Filter parent conversations to download feedback labels for.
   * When specified, the feedback labels will be downloaded for the
   * conversations that match the filter.
   * If `template_qa_scorecard_id` is set, all the conversations that match the
   * filter will be paired with the questions under the scorecard for labeling.
   * </pre>
   *
   * <code>string conversation_filter = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The conversationFilter.
   */
  java.lang.String getConversationFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter parent conversations to download feedback labels for.
   * When specified, the feedback labels will be downloaded for the
   * conversations that match the filter.
   * If `template_qa_scorecard_id` is set, all the conversations that match the
   * filter will be paired with the questions under the scorecard for labeling.
   * </pre>
   *
   * <code>string conversation_filter = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for conversationFilter.
   */
  com.google.protobuf.ByteString getConversationFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, a template for labeling conversations and scorecard
   * questions will be created from the conversation_filter and the questions
   * under the scorecard(s). The feedback label `filter` will be ignored.
   * </pre>
   *
   * <code>repeated string template_qa_scorecard_id = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the templateQaScorecardId.
   */
  java.util.List<java.lang.String> getTemplateQaScorecardIdList();
  /**
   *
   *
   * <pre>
   * Optional. If set, a template for labeling conversations and scorecard
   * questions will be created from the conversation_filter and the questions
   * under the scorecard(s). The feedback label `filter` will be ignored.
   * </pre>
   *
   * <code>repeated string template_qa_scorecard_id = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of templateQaScorecardId.
   */
  int getTemplateQaScorecardIdCount();
  /**
   *
   *
   * <pre>
   * Optional. If set, a template for labeling conversations and scorecard
   * questions will be created from the conversation_filter and the questions
   * under the scorecard(s). The feedback label `filter` will be ignored.
   * </pre>
   *
   * <code>repeated string template_qa_scorecard_id = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The templateQaScorecardId at the given index.
   */
  java.lang.String getTemplateQaScorecardId(int index);
  /**
   *
   *
   * <pre>
   * Optional. If set, a template for labeling conversations and scorecard
   * questions will be created from the conversation_filter and the questions
   * under the scorecard(s). The feedback label `filter` will be ignored.
   * </pre>
   *
   * <code>repeated string template_qa_scorecard_id = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the templateQaScorecardId at the given index.
   */
  com.google.protobuf.ByteString getTemplateQaScorecardIdBytes(int index);

  com.google.cloud.contactcenterinsights.v1.BulkDownloadFeedbackLabelsRequest.DestinationCase
      getDestinationCase();
}
