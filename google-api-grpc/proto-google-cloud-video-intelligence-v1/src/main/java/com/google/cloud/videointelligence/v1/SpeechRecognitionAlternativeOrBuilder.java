// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface SpeechRecognitionAlternativeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.SpeechRecognitionAlternative)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is typically provided only for the top hypothesis, and
   * only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate or consistent.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();

  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.WordInfo words = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.WordInfo> 
      getWordsList();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.WordInfo words = 3;</code>
   */
  com.google.cloud.videointelligence.v1.WordInfo getWords(int index);
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.WordInfo words = 3;</code>
   */
  int getWordsCount();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.WordInfo words = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.WordInfoOrBuilder> 
      getWordsOrBuilderList();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.WordInfo words = 3;</code>
   */
  com.google.cloud.videointelligence.v1.WordInfoOrBuilder getWordsOrBuilder(
      int index);
}
