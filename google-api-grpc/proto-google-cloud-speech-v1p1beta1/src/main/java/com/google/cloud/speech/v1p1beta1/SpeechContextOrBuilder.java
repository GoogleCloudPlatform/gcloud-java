// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface SpeechContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.util.List<java.lang.String> getPhrasesList();
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  int getPhrasesCount();
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.lang.String getPhrases(int index);
  /**
   *
   *
   * <pre>
   * *Optional* A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  com.google.protobuf.ByteString getPhrasesBytes(int index);

  /**
   *
   *
   * <pre>
   * Hint Boost. Positive value will increase the probability that a specific
   * phrase will be recognized over other similar sounding phrases. The higher
   * the boost, the higher the chance of false positive recognition as well.
   * Negative boost values would correspond to anti-biasing. Anti-biasing is not
   * enabled, so negative boost will simply be ignored. Though `boost` can
   * accept a wide range of positive values, most use cases are best served with
   * values between 0 and 20. We recommend using a binary search approach to
   * finding the optimal value for your use case.
   * </pre>
   *
   * <code>float boost = 4;</code>
   */
  float getBoost();
}
