/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/environment.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface TextToSpeechSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.TextToSpeechSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether text to speech is enabled. Even when this field
   * is false, other settings in this proto are still retained.
   * </pre>
   *
   * <code>bool enable_text_to_speech = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableTextToSpeech.
   */
  boolean getEnableTextToSpeech();

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.OutputAudioEncoding output_audio_encoding = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for outputAudioEncoding.
   */
  int getOutputAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.OutputAudioEncoding output_audio_encoding = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputAudioEncoding.
   */
  com.google.cloud.dialogflow.v2.OutputAudioEncoding getOutputAudioEncoding();

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
   * <code>int32 sample_rate_hertz = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized, mapping from
   * language (https://cloud.google.com/dialogflow/docs/reference/language) to
   * SynthesizeSpeechConfig.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSynthesizeSpeechConfigsCount();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized, mapping from
   * language (https://cloud.google.com/dialogflow/docs/reference/language) to
   * SynthesizeSpeechConfig.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsSynthesizeSpeechConfigs(java.lang.String key);
  /** Use {@link #getSynthesizeSpeechConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig>
      getSynthesizeSpeechConfigs();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized, mapping from
   * language (https://cloud.google.com/dialogflow/docs/reference/language) to
   * SynthesizeSpeechConfig.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig>
      getSynthesizeSpeechConfigsMap();
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized, mapping from
   * language (https://cloud.google.com/dialogflow/docs/reference/language) to
   * SynthesizeSpeechConfig.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getSynthesizeSpeechConfigsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized, mapping from
   * language (https://cloud.google.com/dialogflow/docs/reference/language) to
   * SynthesizeSpeechConfig.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.dialogflow.v2.SynthesizeSpeechConfig&gt; synthesize_speech_configs = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getSynthesizeSpeechConfigsOrThrow(
      java.lang.String key);
}
