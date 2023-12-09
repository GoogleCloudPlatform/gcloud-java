// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/llm_utility_service.proto

package com.google.cloud.aiplatform.v1;

public interface TokensInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TokensInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of tokens from the input.
   * </pre>
   *
   * <code>repeated bytes tokens = 1;</code>
   * @return A list containing the tokens.
   */
  java.util.List<com.google.protobuf.ByteString> getTokensList();
  /**
   * <pre>
   * A list of tokens from the input.
   * </pre>
   *
   * <code>repeated bytes tokens = 1;</code>
   * @return The count of tokens.
   */
  int getTokensCount();
  /**
   * <pre>
   * A list of tokens from the input.
   * </pre>
   *
   * <code>repeated bytes tokens = 1;</code>
   * @param index The index of the element to return.
   * @return The tokens at the given index.
   */
  com.google.protobuf.ByteString getTokens(int index);

  /**
   * <pre>
   * A list of token ids from the input.
   * </pre>
   *
   * <code>repeated int64 token_ids = 2;</code>
   * @return A list containing the tokenIds.
   */
  java.util.List<java.lang.Long> getTokenIdsList();
  /**
   * <pre>
   * A list of token ids from the input.
   * </pre>
   *
   * <code>repeated int64 token_ids = 2;</code>
   * @return The count of tokenIds.
   */
  int getTokenIdsCount();
  /**
   * <pre>
   * A list of token ids from the input.
   * </pre>
   *
   * <code>repeated int64 token_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The tokenIds at the given index.
   */
  long getTokenIds(int index);
}
