// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface ListEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ListEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to list all entity types from.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to list all entity types from.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language to list entity synonyms for. If not specified,
   * the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language to list entity synonyms for. If not specified,
   * the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported. Note: languages must be enabled in the agent before they can
   * be used.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of items to return in a single page. By
   * default 100 and at most 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The next_page_token value returned from a previous list request.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
