// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface GcsSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 1;</code>
   * @return The audioUri.
   */
  java.lang.String getAudioUri();
  /**
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 1;</code>
   * @return The bytes for audioUri.
   */
  com.google.protobuf.ByteString
      getAudioUriBytes();

  /**
   * <pre>
   * Immutable. Cloud Storage URI that points to a file that contains the conversation
   * transcript.
   * </pre>
   *
   * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The transcriptUri.
   */
  java.lang.String getTranscriptUri();
  /**
   * <pre>
   * Immutable. Cloud Storage URI that points to a file that contains the conversation
   * transcript.
   * </pre>
   *
   * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for transcriptUri.
   */
  com.google.protobuf.ByteString
      getTranscriptUriBytes();
}
