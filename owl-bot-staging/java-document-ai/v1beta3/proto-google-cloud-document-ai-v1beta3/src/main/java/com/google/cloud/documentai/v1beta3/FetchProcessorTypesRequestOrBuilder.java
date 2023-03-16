// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface FetchProcessorTypesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.FetchProcessorTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project of processor type to list.
   * The available processor types may depend on the allow-listing on projects.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project of processor type to list.
   * The available processor types may depend on the allow-listing on projects.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
