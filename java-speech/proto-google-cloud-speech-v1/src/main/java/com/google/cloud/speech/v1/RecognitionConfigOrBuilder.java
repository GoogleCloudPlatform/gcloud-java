/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface RecognitionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.RecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Encoding of audio data sent in all `RecognitionAudio` messages.
   * This field is optional for `FLAC` and `WAV` audio files and required
   * for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   *
   * @return The enum numeric value on the wire for encoding.
   */
  int getEncodingValue();
  /**
   *
   *
   * <pre>
   * Encoding of audio data sent in all `RecognitionAudio` messages.
   * This field is optional for `FLAC` and `WAV` audio files and required
   * for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   *
   * @return The encoding.
   */
  com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding getEncoding();

  /**
   *
   *
   * <pre>
   * Sample rate in Hertz of the audio data sent in all
   * `RecognitionAudio` messages. Valid values are: 8000-48000.
   * 16000 is optimal. For best results, set the sampling rate of the audio
   * source to 16000 Hz. If that's not possible, use the native sample rate of
   * the audio source (instead of re-sampling).
   * This field is optional for FLAC and WAV audio files, but is
   * required for all other audio formats. For details, see
   * [AudioEncoding][google.cloud.speech.v1.RecognitionConfig.AudioEncoding].
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * The number of channels in the input audio data.
   * ONLY set this for MULTI-CHANNEL recognition.
   * Valid values for LINEAR16, OGG_OPUS and FLAC are `1`-`8`.
   * Valid value for MULAW, AMR, AMR_WB and SPEEX_WITH_HEADER_BYTE is only `1`.
   * If `0` or omitted, defaults to one channel (mono).
   * Note: We only recognize the first channel by default.
   * To perform independent recognition on each channel set
   * `enable_separate_recognition_per_channel` to 'true'.
   * </pre>
   *
   * <code>int32 audio_channel_count = 7;</code>
   *
   * @return The audioChannelCount.
   */
  int getAudioChannelCount();

  /**
   *
   *
   * <pre>
   * This needs to be set to `true` explicitly and `audio_channel_count` &gt; 1
   * to get each channel recognized separately. The recognition result will
   * contain a `channel_tag` field to state which channel that result belongs
   * to. If this is not true, we will only recognize the first channel. The
   * request is billed cumulatively for all channels recognized:
   * `audio_channel_count` multiplied by the length of the audio.
   * </pre>
   *
   * <code>bool enable_separate_recognition_per_channel = 12;</code>
   *
   * @return The enableSeparateRecognitionPerChannel.
   */
  boolean getEnableSeparateRecognitionPerChannel();

  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes.
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
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes.
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
   * A list of up to 3 additional
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags,
   * listing possible alternative languages of the supplied audio.
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes. If alternative languages are
   * listed, recognition result will contain recognition in the most likely
   * language detected including the main language_code. The recognition result
   * will include the language tag of the language detected in the audio. Note:
   * This feature is only supported for Voice Command and Voice Search use cases
   * and performance may vary for other use cases (e.g., phone call
   * transcription).
   * </pre>
   *
   * <code>repeated string alternative_language_codes = 18;</code>
   *
   * @return A list containing the alternativeLanguageCodes.
   */
  java.util.List<java.lang.String> getAlternativeLanguageCodesList();
  /**
   *
   *
   * <pre>
   * A list of up to 3 additional
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags,
   * listing possible alternative languages of the supplied audio.
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes. If alternative languages are
   * listed, recognition result will contain recognition in the most likely
   * language detected including the main language_code. The recognition result
   * will include the language tag of the language detected in the audio. Note:
   * This feature is only supported for Voice Command and Voice Search use cases
   * and performance may vary for other use cases (e.g., phone call
   * transcription).
   * </pre>
   *
   * <code>repeated string alternative_language_codes = 18;</code>
   *
   * @return The count of alternativeLanguageCodes.
   */
  int getAlternativeLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * A list of up to 3 additional
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags,
   * listing possible alternative languages of the supplied audio.
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes. If alternative languages are
   * listed, recognition result will contain recognition in the most likely
   * language detected including the main language_code. The recognition result
   * will include the language tag of the language detected in the audio. Note:
   * This feature is only supported for Voice Command and Voice Search use cases
   * and performance may vary for other use cases (e.g., phone call
   * transcription).
   * </pre>
   *
   * <code>repeated string alternative_language_codes = 18;</code>
   *
   * @param index The index of the element to return.
   * @return The alternativeLanguageCodes at the given index.
   */
  java.lang.String getAlternativeLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * A list of up to 3 additional
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags,
   * listing possible alternative languages of the supplied audio.
   * See [Language
   * Support](https://cloud.google.com/speech-to-text/docs/languages) for a list
   * of the currently supported language codes. If alternative languages are
   * listed, recognition result will contain recognition in the most likely
   * language detected including the main language_code. The recognition result
   * will include the language tag of the language detected in the audio. Note:
   * This feature is only supported for Voice Command and Voice Search use cases
   * and performance may vary for other use cases (e.g., phone call
   * transcription).
   * </pre>
   *
   * <code>repeated string alternative_language_codes = 18;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the alternativeLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString getAlternativeLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Maximum number of recognition hypotheses to be returned.
   * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
   * within each `SpeechRecognitionResult`.
   * The server may return fewer than `max_alternatives`.
   * Valid values are `0`-`30`. A value of `0` or `1` will return a maximum of
   * one. If omitted, will return a maximum of one.
   * </pre>
   *
   * <code>int32 max_alternatives = 4;</code>
   *
   * @return The maxAlternatives.
   */
  int getMaxAlternatives();

  /**
   *
   *
   * <pre>
   * If set to `true`, the server will attempt to filter out
   * profanities, replacing all but the initial character in each filtered word
   * with asterisks, e.g. "f***". If set to `false` or omitted, profanities
   * won't be filtered out.
   * </pre>
   *
   * <code>bool profanity_filter = 5;</code>
   *
   * @return The profanityFilter.
   */
  boolean getProfanityFilter();

  /**
   *
   *
   * <pre>
   * Speech adaptation configuration improves the accuracy of speech
   * recognition. For more information, see the [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation)
   * documentation.
   * When speech adaptation is set it supersedes the `speech_contexts` field.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation adaptation = 20;</code>
   *
   * @return Whether the adaptation field is set.
   */
  boolean hasAdaptation();
  /**
   *
   *
   * <pre>
   * Speech adaptation configuration improves the accuracy of speech
   * recognition. For more information, see the [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation)
   * documentation.
   * When speech adaptation is set it supersedes the `speech_contexts` field.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation adaptation = 20;</code>
   *
   * @return The adaptation.
   */
  com.google.cloud.speech.v1.SpeechAdaptation getAdaptation();
  /**
   *
   *
   * <pre>
   * Speech adaptation configuration improves the accuracy of speech
   * recognition. For more information, see the [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation)
   * documentation.
   * When speech adaptation is set it supersedes the `speech_contexts` field.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation adaptation = 20;</code>
   */
  com.google.cloud.speech.v1.SpeechAdaptationOrBuilder getAdaptationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.TranscriptNormalization transcript_normalization = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the transcriptNormalization field is set.
   */
  boolean hasTranscriptNormalization();
  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.TranscriptNormalization transcript_normalization = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transcriptNormalization.
   */
  com.google.cloud.speech.v1.TranscriptNormalization getTranscriptNormalization();
  /**
   *
   *
   * <pre>
   * Optional. Use transcription normalization to automatically replace parts of
   * the transcript with phrases of your choosing. For StreamingRecognize, this
   * normalization only applies to stable partial transcripts (stability &gt; 0.8)
   * and final transcripts.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.TranscriptNormalization transcript_normalization = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.speech.v1.TranscriptNormalizationOrBuilder getTranscriptNormalizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see
   * [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<com.google.cloud.speech.v1.SpeechContext> getSpeechContextsList();
  /**
   *
   *
   * <pre>
   * Array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see
   * [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1.SpeechContext getSpeechContexts(int index);
  /**
   *
   *
   * <pre>
   * Array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see
   * [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  int getSpeechContextsCount();
  /**
   *
   *
   * <pre>
   * Array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see
   * [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.SpeechContextOrBuilder>
      getSpeechContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Array of [SpeechContext][google.cloud.speech.v1.SpeechContext].
   * A means to provide context to assist the speech recognition. For more
   * information, see
   * [speech
   * adaptation](https://cloud.google.com/speech-to-text/docs/adaptation).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1.SpeechContextOrBuilder getSpeechContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If `true`, the top result includes a list of words and
   * the start and end time offsets (timestamps) for those words. If
   * `false`, no word-level time offset information is returned. The default is
   * `false`.
   * </pre>
   *
   * <code>bool enable_word_time_offsets = 8;</code>
   *
   * @return The enableWordTimeOffsets.
   */
  boolean getEnableWordTimeOffsets();

  /**
   *
   *
   * <pre>
   * If `true`, the top result includes a list of words and the
   * confidence for those words. If `false`, no word-level confidence
   * information is returned. The default is `false`.
   * </pre>
   *
   * <code>bool enable_word_confidence = 15;</code>
   *
   * @return The enableWordConfidence.
   */
  boolean getEnableWordConfidence();

  /**
   *
   *
   * <pre>
   * If 'true', adds punctuation to recognition result hypotheses.
   * This feature is only available in select languages. Setting this for
   * requests in other languages has no effect at all.
   * The default 'false' value does not add punctuation to result hypotheses.
   * </pre>
   *
   * <code>bool enable_automatic_punctuation = 11;</code>
   *
   * @return The enableAutomaticPunctuation.
   */
  boolean getEnableAutomaticPunctuation();

  /**
   *
   *
   * <pre>
   * The spoken punctuation behavior for the call
   * If not set, uses default behavior based on model of choice
   * e.g. command_and_search will enable spoken punctuation by default
   * If 'true', replaces spoken punctuation with the corresponding symbols in
   * the request. For example, "how are you question mark" becomes "how are
   * you?". See https://cloud.google.com/speech-to-text/docs/spoken-punctuation
   * for support. If 'false', spoken punctuation is not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_punctuation = 22;</code>
   *
   * @return Whether the enableSpokenPunctuation field is set.
   */
  boolean hasEnableSpokenPunctuation();
  /**
   *
   *
   * <pre>
   * The spoken punctuation behavior for the call
   * If not set, uses default behavior based on model of choice
   * e.g. command_and_search will enable spoken punctuation by default
   * If 'true', replaces spoken punctuation with the corresponding symbols in
   * the request. For example, "how are you question mark" becomes "how are
   * you?". See https://cloud.google.com/speech-to-text/docs/spoken-punctuation
   * for support. If 'false', spoken punctuation is not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_punctuation = 22;</code>
   *
   * @return The enableSpokenPunctuation.
   */
  com.google.protobuf.BoolValue getEnableSpokenPunctuation();
  /**
   *
   *
   * <pre>
   * The spoken punctuation behavior for the call
   * If not set, uses default behavior based on model of choice
   * e.g. command_and_search will enable spoken punctuation by default
   * If 'true', replaces spoken punctuation with the corresponding symbols in
   * the request. For example, "how are you question mark" becomes "how are
   * you?". See https://cloud.google.com/speech-to-text/docs/spoken-punctuation
   * for support. If 'false', spoken punctuation is not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_punctuation = 22;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnableSpokenPunctuationOrBuilder();

  /**
   *
   *
   * <pre>
   * The spoken emoji behavior for the call
   * If not set, uses default behavior based on model of choice
   * If 'true', adds spoken emoji formatting for the request. This will replace
   * spoken emojis with the corresponding Unicode symbols in the final
   * transcript. If 'false', spoken emojis are not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_emojis = 23;</code>
   *
   * @return Whether the enableSpokenEmojis field is set.
   */
  boolean hasEnableSpokenEmojis();
  /**
   *
   *
   * <pre>
   * The spoken emoji behavior for the call
   * If not set, uses default behavior based on model of choice
   * If 'true', adds spoken emoji formatting for the request. This will replace
   * spoken emojis with the corresponding Unicode symbols in the final
   * transcript. If 'false', spoken emojis are not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_emojis = 23;</code>
   *
   * @return The enableSpokenEmojis.
   */
  com.google.protobuf.BoolValue getEnableSpokenEmojis();
  /**
   *
   *
   * <pre>
   * The spoken emoji behavior for the call
   * If not set, uses default behavior based on model of choice
   * If 'true', adds spoken emoji formatting for the request. This will replace
   * spoken emojis with the corresponding Unicode symbols in the final
   * transcript. If 'false', spoken emojis are not replaced.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_spoken_emojis = 23;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnableSpokenEmojisOrBuilder();

  /**
   *
   *
   * <pre>
   * Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   *
   * @return Whether the diarizationConfig field is set.
   */
  boolean hasDiarizationConfig();
  /**
   *
   *
   * <pre>
   * Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   *
   * @return The diarizationConfig.
   */
  com.google.cloud.speech.v1.SpeakerDiarizationConfig getDiarizationConfig();
  /**
   *
   *
   * <pre>
   * Config to enable speaker diarization and set additional
   * parameters to make diarization better suited for your application.
   * Note: When this is enabled, we send all the words from the beginning of the
   * audio for the top alternative in every consecutive STREAMING responses.
   * This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * For non-streaming requests, the diarization results will be provided only
   * in the top alternative of the FINAL SpeechRecognitionResult.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeakerDiarizationConfig diarization_config = 19;</code>
   */
  com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.speech.v1.RecognitionMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata regarding this request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.RecognitionMetadata metadata = 9;</code>
   */
  com.google.cloud.speech.v1.RecognitionMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * &lt;table&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
   *     &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;latest_long&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for long form content like media or conversation.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;latest_short&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short form content like commands or single shot directed
   *     speech.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short queries such as voice commands or voice search.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a phone call (typically
   *     recorded at an 8khz sampling rate).&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from video or includes multiple
   *         speakers. Ideally the audio is recorded at a 16khz or greater
   *         sampling rate. This is a premium model that costs more than the
   *         standard rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that is not one of the specific audio models.
   *         For example, long-form audio. Ideally the audio is high-fidelity,
   *         recorded at a 16khz or greater sampling rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;medical_conversation&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a conversation between a
   *         medical provider and patient.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;medical_dictation&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from dictation notes by a medical
   *         provider.&lt;/td&gt;
   *   &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>string model = 13;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * &lt;table&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
   *     &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;latest_long&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for long form content like media or conversation.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;latest_short&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short form content like commands or single shot directed
   *     speech.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for short queries such as voice commands or voice search.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a phone call (typically
   *     recorded at an 8khz sampling rate).&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from video or includes multiple
   *         speakers. Ideally the audio is recorded at a 16khz or greater
   *         sampling rate. This is a premium model that costs more than the
   *         standard rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that is not one of the specific audio models.
   *         For example, long-form audio. Ideally the audio is high-fidelity,
   *         recorded at a 16khz or greater sampling rate.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;medical_conversation&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from a conversation between a
   *         medical provider and patient.&lt;/td&gt;
   *   &lt;/tr&gt;
   *   &lt;tr&gt;
   *     &lt;td&gt;&lt;code&gt;medical_dictation&lt;/code&gt;&lt;/td&gt;
   *     &lt;td&gt;Best for audio that originated from dictation notes by a medical
   *         provider.&lt;/td&gt;
   *   &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>string model = 13;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Set to true to use an enhanced model for speech recognition.
   * If `use_enhanced` is set to true and the `model` field is not set, then
   * an appropriate enhanced model is chosen if an enhanced model exists for
   * the audio.
   *
   * If `use_enhanced` is true and an enhanced version of the specified model
   * does not exist, then the speech is recognized using the standard version
   * of the specified model.
   * </pre>
   *
   * <code>bool use_enhanced = 14;</code>
   *
   * @return The useEnhanced.
   */
  boolean getUseEnhanced();
}
