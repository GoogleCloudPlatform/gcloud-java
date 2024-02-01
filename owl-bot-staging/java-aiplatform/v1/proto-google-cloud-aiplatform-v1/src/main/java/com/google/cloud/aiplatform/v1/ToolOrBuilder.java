// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ToolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Tool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.FunctionDeclaration> 
      getFunctionDeclarationsList();
  /**
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1.FunctionDeclaration getFunctionDeclarations(int index);
  /**
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getFunctionDeclarationsCount();
  /**
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.FunctionDeclarationOrBuilder> 
      getFunctionDeclarationsOrBuilderList();
  /**
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1.FunctionDeclarationOrBuilder getFunctionDeclarationsOrBuilder(
      int index);
}
