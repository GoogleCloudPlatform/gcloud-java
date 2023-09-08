// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ListEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ListEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to
   * list evaluations for.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to
   * list evaluations for.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The standard list page size.
   * If unspecified, at most `5` evaluations are returned.
   * The maximum value is `100`. Values above `100` are coerced to `100`.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListEvaluations` call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListEvaluations` call.
   * Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
