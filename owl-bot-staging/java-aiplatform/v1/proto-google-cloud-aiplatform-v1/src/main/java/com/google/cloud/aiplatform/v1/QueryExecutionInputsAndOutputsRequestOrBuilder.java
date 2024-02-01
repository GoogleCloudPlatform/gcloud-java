// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/metadata_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface QueryExecutionInputsAndOutputsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.QueryExecutionInputsAndOutputsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Execution whose input and output
   * Artifacts should be retrieved as a LineageSubgraph. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The execution.
   */
  java.lang.String getExecution();
  /**
   * <pre>
   * Required. The resource name of the Execution whose input and output
   * Artifacts should be retrieved as a LineageSubgraph. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>string execution = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for execution.
   */
  com.google.protobuf.ByteString
      getExecutionBytes();
}
