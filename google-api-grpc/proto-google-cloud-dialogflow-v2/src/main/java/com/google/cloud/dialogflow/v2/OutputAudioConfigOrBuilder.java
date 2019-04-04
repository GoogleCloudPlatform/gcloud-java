// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface OutputAudioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.OutputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
   */
  int getAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioEncoding getAudioEncoding();

  /**
   *
   *
   * <pre>
   * Optional. The synthesis sample rate (in hertz) for this audio. If not
   * provided, then the synthesizer will use the default sample rate based on
   * the audio encoding. If this is different from the voice's natural sample
   * rate, then the synthesizer will honor this request by converting to the
   * desired sample rate (which might result in worse audio quality).
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   */
  boolean hasSynthesizeSpeechConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getSynthesizeSpeechConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder
      getSynthesizeSpeechConfigOrBuilder();
}
