// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1/schema_service.proto

package com.google.cloud.discoveryengine.v1;

public interface GetSchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.GetSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
