// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface CreateDeliveryPipelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CreateDeliveryPipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent collection in which the `DeliveryPipeline` should be created.
   * Format should be projects/{project_id}/locations/{location_name}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent collection in which the `DeliveryPipeline` should be created.
   * Format should be projects/{project_id}/locations/{location_name}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. ID of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string delivery_pipeline_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deliveryPipelineId.
   */
  java.lang.String getDeliveryPipelineId();
  /**
   * <pre>
   * Required. ID of the `DeliveryPipeline`.
   * </pre>
   *
   * <code>string delivery_pipeline_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for deliveryPipelineId.
   */
  com.google.protobuf.ByteString
      getDeliveryPipelineIdBytes();

  /**
   * <pre>
   * Required. The `DeliveryPipeline` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deliveryPipeline field is set.
   */
  boolean hasDeliveryPipeline();
  /**
   * <pre>
   * Required. The `DeliveryPipeline` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deliveryPipeline.
   */
  com.google.cloud.deploy.v1.DeliveryPipeline getDeliveryPipeline();
  /**
   * <pre>
   * Required. The `DeliveryPipeline` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.DeliveryPipeline delivery_pipeline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.deploy.v1.DeliveryPipelineOrBuilder getDeliveryPipelineOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. If set to true, the request is validated and the user is provided with
   * an expected result, but no actual change is made.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
