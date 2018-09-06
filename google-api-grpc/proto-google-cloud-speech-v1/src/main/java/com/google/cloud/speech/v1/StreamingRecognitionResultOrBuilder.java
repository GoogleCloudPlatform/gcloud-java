// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface StreamingRecognitionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. If `false`, this `StreamingRecognitionResult` represents an
   * interim result that may change. If `true`, this is the final time the
   * speech service will return this particular `StreamingRecognitionResult`,
   * the recognizer will not return any further hypotheses for this portion of
   * the transcript and corresponding audio.
   * </pre>
   *
   * <code>bool is_final = 2;</code>
   */
  boolean getIsFinal();

  /**
   * <pre>
   * Output only. An estimate of the likelihood that the recognizer will not
   * change its guess about this interim result. Values range from 0.0
   * (completely unstable) to 1.0 (completely stable).
   * This field is only provided for interim results (`is_final=false`).
   * The default of 0.0 is a sentinel value indicating `stability` was not set.
   * </pre>
   *
   * <code>float stability = 3;</code>
   */
  float getStability();
}
