// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface FunctionCallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FunctionCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the function to call.
   * Matches [FunctionDeclaration.name].
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the args field is set.
   */
  boolean hasArgs();
  /**
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The args.
   */
  com.google.protobuf.Struct getArgs();
  /**
   * <pre>
   * Optional. Required. The function parameters and values in JSON object
   * format. See [FunctionDeclaration.parameters] for parameter details.
   * </pre>
   *
   * <code>.google.protobuf.Struct args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getArgsOrBuilder();
}
