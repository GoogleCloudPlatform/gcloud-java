// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListBatchPredictionJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListBatchPredictionJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.BatchPredictionJob> 
      getBatchPredictionJobsList();
  /**
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJob getBatchPredictionJobs(int index);
  /**
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_jobs = 1;</code>
   */
  int getBatchPredictionJobsCount();
  /**
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.BatchPredictionJobOrBuilder> 
      getBatchPredictionJobsOrBuilderList();
  /**
   * <pre>
   * List of BatchPredictionJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.BatchPredictionJob batch_prediction_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.BatchPredictionJobOrBuilder getBatchPredictionJobsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListBatchPredictionJobsRequest.page_token][google.cloud.aiplatform.v1.ListBatchPredictionJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListBatchPredictionJobsRequest.page_token][google.cloud.aiplatform.v1.ListBatchPredictionJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
