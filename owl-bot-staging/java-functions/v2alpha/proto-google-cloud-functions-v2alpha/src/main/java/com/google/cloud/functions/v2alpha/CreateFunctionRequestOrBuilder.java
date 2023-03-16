// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

public interface CreateFunctionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.CreateFunctionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location in which the function should be created, specified
   * in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location in which the function should be created, specified
   * in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.Function function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.Function function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The function.
   */
  com.google.cloud.functions.v2alpha.Function getFunction();
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.Function function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.functions.v2alpha.FunctionOrBuilder getFunctionOrBuilder();

  /**
   * <pre>
   * The ID to use for the function, which will become the final component of
   * the function's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string function_id = 3;</code>
   * @return The functionId.
   */
  java.lang.String getFunctionId();
  /**
   * <pre>
   * The ID to use for the function, which will become the final component of
   * the function's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string function_id = 3;</code>
   * @return The bytes for functionId.
   */
  com.google.protobuf.ByteString
      getFunctionIdBytes();
}
