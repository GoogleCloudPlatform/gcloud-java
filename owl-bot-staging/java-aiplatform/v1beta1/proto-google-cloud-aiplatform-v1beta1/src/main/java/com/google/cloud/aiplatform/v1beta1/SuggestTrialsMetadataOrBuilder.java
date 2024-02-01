// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SuggestTrialsMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SuggestTrialsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The identifier of the client that is requesting the suggestion.
   *
   * If multiple SuggestTrialsRequests have the same `client_id`,
   * the service will return the identical suggested Trial if the Trial is
   * pending, and provide a new Trial if the last suggested Trial was completed.
   * </pre>
   *
   * <code>string client_id = 2;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
