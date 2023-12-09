// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListExecutionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListExecutionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Execution> 
      getExecutionsList();
  /**
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Execution getExecutions(int index);
  /**
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  int getExecutionsCount();
  /**
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ExecutionOrBuilder> 
      getExecutionsOrBuilderList();
  /**
   * <pre>
   * The Executions retrieved from the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Execution executions = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as
   * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as
   * [ListExecutionsRequest.page_token][google.cloud.aiplatform.v1.ListExecutionsRequest.page_token]
   * to retrieve the next page.
   * If this field is not populated, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
