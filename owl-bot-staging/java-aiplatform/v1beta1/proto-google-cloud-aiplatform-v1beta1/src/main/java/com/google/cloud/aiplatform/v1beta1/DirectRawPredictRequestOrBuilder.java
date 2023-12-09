// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DirectRawPredictRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DirectRawPredictRequest)
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
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   * @return The methodName.
   */
  java.lang.String getMethodName();
  /**
   * <pre>
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   * @return The bytes for methodName.
   */
  com.google.protobuf.ByteString
      getMethodNameBytes();

  /**
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>bytes input = 3;</code>
   * @return The input.
   */
  com.google.protobuf.ByteString getInput();
}
