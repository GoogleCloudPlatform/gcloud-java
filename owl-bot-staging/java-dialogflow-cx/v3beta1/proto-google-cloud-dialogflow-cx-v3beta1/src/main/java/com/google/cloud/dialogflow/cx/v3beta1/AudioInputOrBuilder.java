// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface AudioInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.AudioInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InputAudioConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InputAudioConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The config.
   */
  com.google.cloud.dialogflow.cx.v3beta1.InputAudioConfig getConfig();
  /**
   * <pre>
   * Required. Instructs the speech recognizer how to process the speech audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.InputAudioConfig config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.InputAudioConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The natural language speech audio to be processed.
   * A single request can contain up to 2 minutes of speech audio data.
   * The [transcribed
   * text][google.cloud.dialogflow.cx.v3beta1.QueryResult.transcript] cannot
   * contain more than 256 bytes.
   * For non-streaming audio detect intent, both `config` and `audio` must be
   * provided.
   * For streaming audio detect intent, `config` must be provided in
   * the first request and `audio` must be provided in all following requests.
   * </pre>
   *
   * <code>bytes audio = 2;</code>
   * @return The audio.
   */
  com.google.protobuf.ByteString getAudio();
}
