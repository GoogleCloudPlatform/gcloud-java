// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/llm_utility_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ComputeTokensResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ComputeTokensResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TokensInfo tokens_info = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TokensInfo> 
      getTokensInfoList();
  /**
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TokensInfo tokens_info = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TokensInfo getTokensInfo(int index);
  /**
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TokensInfo tokens_info = 1;</code>
   */
  int getTokensInfoCount();
  /**
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TokensInfo tokens_info = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TokensInfoOrBuilder> 
      getTokensInfoOrBuilderList();
  /**
   * <pre>
   * Lists of tokens info from the input. A ComputeTokensRequest could have
   * multiple instances with a prompt in each instance. We also need to return
   * lists of tokens info for the request with multiple instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TokensInfo tokens_info = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TokensInfoOrBuilder getTokensInfoOrBuilder(
      int index);
}
