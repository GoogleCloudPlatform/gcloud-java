// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/user_event.proto

package com.google.cloud.discoveryengine.v1beta;

public interface CompletionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.CompletionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * End user selected [CompleteQueryResponse.CompletionResult.suggestion][].
   * </pre>
   *
   * <code>string selected_suggestion = 1;</code>
   * @return The selectedSuggestion.
   */
  java.lang.String getSelectedSuggestion();
  /**
   * <pre>
   * End user selected [CompleteQueryResponse.CompletionResult.suggestion][].
   * </pre>
   *
   * <code>string selected_suggestion = 1;</code>
   * @return The bytes for selectedSuggestion.
   */
  com.google.protobuf.ByteString
      getSelectedSuggestionBytes();

  /**
   * <pre>
   * End user selected [CompleteQueryResponse.CompletionResult.suggestion][]
   * position, starting from 0.
   * </pre>
   *
   * <code>int32 selected_position = 2;</code>
   * @return The selectedPosition.
   */
  int getSelectedPosition();
}
