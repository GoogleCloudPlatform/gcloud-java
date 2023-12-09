// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DirectPredictRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DirectPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensor inputs = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Tensor> 
      getInputsList();
  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensor inputs = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Tensor getInputs(int index);
  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensor inputs = 2;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensor inputs = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.TensorOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Tensor inputs = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TensorOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Tensor parameters = 3;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Tensor parameters = 3;</code>
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1beta1.Tensor getParameters();
  /**
   * <pre>
   * The parameters that govern the prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Tensor parameters = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TensorOrBuilder getParametersOrBuilder();
}
