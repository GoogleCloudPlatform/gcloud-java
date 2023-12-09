// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/job_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListBatchPredictionJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListBatchPredictionJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to list the BatchPredictionJobs
   * from. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to list the BatchPredictionJobs
   * from. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The standard list filter.
   *
   * Supported fields:
   *
   *   * `display_name` supports `=`, `!=` comparisons, and `:` wildcard.
   *   * `model_display_name` supports `=`, `!=` comparisons.
   *   * `state` supports `=`, `!=` comparisons.
   *   * `create_time` supports `=`, `!=`,`&lt;`, `&lt;=`,`&gt;`, `&gt;=` comparisons.
   *     `create_time` must be in RFC 3339 format.
   *   * `labels` supports general map functions that is:
   *     `labels.key=value` - key:value equality
   *     `labels.key:* - key existence
   *
   * Some examples of using the filter are:
   *
   *   * `state="JOB_STATE_SUCCEEDED" AND display_name:"my_job_*"`
   *   * `state!="JOB_STATE_FAILED" OR display_name="my_job"`
   *   * `NOT display_name="my_job"`
   *   * `create_time&gt;"2021-05-18T00:00:00Z"`
   *   * `labels.keyA=valueA`
   *   * `labels.keyB:*`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The standard list filter.
   *
   * Supported fields:
   *
   *   * `display_name` supports `=`, `!=` comparisons, and `:` wildcard.
   *   * `model_display_name` supports `=`, `!=` comparisons.
   *   * `state` supports `=`, `!=` comparisons.
   *   * `create_time` supports `=`, `!=`,`&lt;`, `&lt;=`,`&gt;`, `&gt;=` comparisons.
   *     `create_time` must be in RFC 3339 format.
   *   * `labels` supports general map functions that is:
   *     `labels.key=value` - key:value equality
   *     `labels.key:* - key existence
   *
   * Some examples of using the filter are:
   *
   *   * `state="JOB_STATE_SUCCEEDED" AND display_name:"my_job_*"`
   *   * `state!="JOB_STATE_FAILED" OR display_name="my_job"`
   *   * `NOT display_name="my_job"`
   *   * `create_time&gt;"2021-05-18T00:00:00Z"`
   *   * `labels.keyA=valueA`
   *   * `labels.keyB:*`
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListBatchPredictionJobsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListBatchPredictionJobsResponse.next_page_token]
   * of the previous
   * [JobService.ListBatchPredictionJobs][google.cloud.aiplatform.v1beta1.JobService.ListBatchPredictionJobs]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListBatchPredictionJobsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListBatchPredictionJobsResponse.next_page_token]
   * of the previous
   * [JobService.ListBatchPredictionJobs][google.cloud.aiplatform.v1beta1.JobService.ListBatchPredictionJobs]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
