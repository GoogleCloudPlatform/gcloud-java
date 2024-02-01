// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface CopyModelResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CopyModelResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the copied Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * The name of the copied Model resource.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>string model = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Output only. The version ID of the model that is copied.
   * </pre>
   *
   * <code>string model_version_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The modelVersionId.
   */
  java.lang.String getModelVersionId();
  /**
   * <pre>
   * Output only. The version ID of the model that is copied.
   * </pre>
   *
   * <code>string model_version_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for modelVersionId.
   */
  com.google.protobuf.ByteString
      getModelVersionIdBytes();
}
