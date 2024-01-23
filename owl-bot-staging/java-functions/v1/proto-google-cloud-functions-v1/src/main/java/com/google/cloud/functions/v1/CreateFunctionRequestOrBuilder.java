// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public interface CreateFunctionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.CreateFunctionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location in which the function should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Required. The project and location in which the function should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The function.
   */
  com.google.cloud.functions.v1.CloudFunction getFunction();
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.functions.v1.CloudFunctionOrBuilder getFunctionOrBuilder();
}
