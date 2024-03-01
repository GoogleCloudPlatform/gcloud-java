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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface InputAudioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.InputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for audioEncoding.
   */
  int getAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AudioEncoding audio_encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audioEncoding.
   */
  com.google.cloud.dialogflow.v2beta1.AudioEncoding getAudioEncoding();

  /**
   *
   *
   * <pre>
   * Required. Sample rate (in Hertz) of the audio content sent in the query.
   * Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
   * more details.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * If `true`, Dialogflow returns
   * [SpeechWordInfo][google.cloud.dialogflow.v2beta1.SpeechWordInfo] in
   * [StreamingRecognitionResult][google.cloud.dialogflow.v2beta1.StreamingRecognitionResult]
   * with information about the recognized speech words, e.g. start and end time
   * offsets. If false or unspecified, Speech doesn't return any word-level
   * information.
   * </pre>
   *
   * <code>bool enable_word_info = 13;</code>
   *
   * @return The enableWordInfo.
   */
  boolean getEnableWordInfo();

  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   *
   * This field is deprecated. Please use [`speech_contexts`]() instead. If you
   * specify both [`phrase_hints`]() and [`speech_contexts`](), Dialogflow will
   * treat the [`phrase_hints`]() as a single additional [`SpeechContext`]().
   * </pre>
   *
   * <code>repeated string phrase_hints = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.v2beta1.InputAudioConfig.phrase_hints is deprecated. See
   *     google/cloud/dialogflow/v2beta1/audio_config.proto;l=174
   * @return A list containing the phraseHints.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getPhraseHintsList();
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   *
   * This field is deprecated. Please use [`speech_contexts`]() instead. If you
   * specify both [`phrase_hints`]() and [`speech_contexts`](), Dialogflow will
   * treat the [`phrase_hints`]() as a single additional [`SpeechContext`]().
   * </pre>
   *
   * <code>repeated string phrase_hints = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.v2beta1.InputAudioConfig.phrase_hints is deprecated. See
   *     google/cloud/dialogflow/v2beta1/audio_config.proto;l=174
   * @return The count of phraseHints.
   */
  @java.lang.Deprecated
  int getPhraseHintsCount();
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   *
   * This field is deprecated. Please use [`speech_contexts`]() instead. If you
   * specify both [`phrase_hints`]() and [`speech_contexts`](), Dialogflow will
   * treat the [`phrase_hints`]() as a single additional [`SpeechContext`]().
   * </pre>
   *
   * <code>repeated string phrase_hints = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.v2beta1.InputAudioConfig.phrase_hints is deprecated. See
   *     google/cloud/dialogflow/v2beta1/audio_config.proto;l=174
   * @param index The index of the element to return.
   * @return The phraseHints at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getPhraseHints(int index);
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   *
   * This field is deprecated. Please use [`speech_contexts`]() instead. If you
   * specify both [`phrase_hints`]() and [`speech_contexts`](), Dialogflow will
   * treat the [`phrase_hints`]() as a single additional [`SpeechContext`]().
   * </pre>
   *
   * <code>repeated string phrase_hints = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.v2beta1.InputAudioConfig.phrase_hints is deprecated. See
   *     google/cloud/dialogflow/v2beta1/audio_config.proto;l=174
   * @param index The index of the value to return.
   * @return The bytes of the phraseHints at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getPhraseHintsBytes(int index);

  /**
   *
   *
   * <pre>
   * Context information to assist speech recognition.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SpeechContext speech_contexts = 11;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SpeechContext> getSpeechContextsList();
  /**
   *
   *
   * <pre>
   * Context information to assist speech recognition.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SpeechContext speech_contexts = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SpeechContext getSpeechContexts(int index);
  /**
   *
   *
   * <pre>
   * Context information to assist speech recognition.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SpeechContext speech_contexts = 11;</code>
   */
  int getSpeechContextsCount();
  /**
   *
   *
   * <pre>
   * Context information to assist speech recognition.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SpeechContext speech_contexts = 11;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SpeechContextOrBuilder>
      getSpeechContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Context information to assist speech recognition.
   *
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SpeechContext speech_contexts = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.SpeechContextOrBuilder getSpeechContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Which Speech model to select for the given request.
   * For more information, see
   * [Speech models](https://cloud.google.com/dialogflow/es/docs/speech-models).
   * </pre>
   *
   * <code>string model = 7;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Optional. Which Speech model to select for the given request.
   * For more information, see
   * [Speech models](https://cloud.google.com/dialogflow/es/docs/speech-models).
   * </pre>
   *
   * <code>string model = 7;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Which variant of the [Speech
   * model][google.cloud.dialogflow.v2beta1.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant model_variant = 10;</code>
   *
   * @return The enum numeric value on the wire for modelVariant.
   */
  int getModelVariantValue();
  /**
   *
   *
   * <pre>
   * Which variant of the [Speech
   * model][google.cloud.dialogflow.v2beta1.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant model_variant = 10;</code>
   *
   * @return The modelVariant.
   */
  com.google.cloud.dialogflow.v2beta1.SpeechModelVariant getModelVariant();

  /**
   *
   *
   * <pre>
   * If `false` (default), recognition does not cease until the
   * client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input
   * audio. Recognition ceases when it detects the audio's voice has
   * stopped or paused. In this case, once a detected intent is received, the
   * client should close the stream and start a new request with a new stream as
   * needed.
   * Note: This setting is relevant only for streaming methods.
   * Note: When specified, InputAudioConfig.single_utterance takes precedence
   * over StreamingDetectIntentRequest.single_utterance.
   * </pre>
   *
   * <code>bool single_utterance = 8;</code>
   *
   * @return The singleUtterance.
   */
  boolean getSingleUtterance();

  /**
   *
   *
   * <pre>
   * Only used in
   * [Participants.AnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.AnalyzeContent]
   * and
   * [Participants.StreamingAnalyzeContent][google.cloud.dialogflow.v2beta1.Participants.StreamingAnalyzeContent].
   * If `false` and recognition doesn't return any result, trigger
   * `NO_SPEECH_RECOGNIZED` event to Dialogflow agent.
   * </pre>
   *
   * <code>bool disable_no_speech_recognized_event = 14;</code>
   *
   * @return The disableNoSpeechRecognizedEvent.
   */
  boolean getDisableNoSpeechRecognizedEvent();

  /**
   *
   *
   * <pre>
   * Configuration of barge-in behavior during the streaming of input audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.BargeInConfig barge_in_config = 15;</code>
   *
   * @return Whether the bargeInConfig field is set.
   */
  boolean hasBargeInConfig();
  /**
   *
   *
   * <pre>
   * Configuration of barge-in behavior during the streaming of input audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.BargeInConfig barge_in_config = 15;</code>
   *
   * @return The bargeInConfig.
   */
  com.google.cloud.dialogflow.v2beta1.BargeInConfig getBargeInConfig();
  /**
   *
   *
   * <pre>
   * Configuration of barge-in behavior during the streaming of input audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.BargeInConfig barge_in_config = 15;</code>
   */
  com.google.cloud.dialogflow.v2beta1.BargeInConfigOrBuilder getBargeInConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Enable automatic punctuation option at the speech backend.
   * </pre>
   *
   * <code>bool enable_automatic_punctuation = 17;</code>
   *
   * @return The enableAutomaticPunctuation.
   */
  boolean getEnableAutomaticPunctuation();
}
