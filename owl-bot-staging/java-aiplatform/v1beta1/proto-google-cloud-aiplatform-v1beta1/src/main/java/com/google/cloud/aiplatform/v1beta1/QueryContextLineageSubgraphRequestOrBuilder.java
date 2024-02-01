// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface QueryContextLineageSubgraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryContextLineageSubgraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Context whose Artifacts and Executions
   * should be retrieved as a LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <pre>
   * Required. The resource name of the Context whose Artifacts and Executions
   * should be retrieved as a LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();
}
