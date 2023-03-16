// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface SentimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Sentiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
   * sentiment).
   * </pre>
   *
   * <code>float score = 1;</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * A non-negative number in the [0, +inf) range, which represents the absolute
   * magnitude of sentiment, regardless of score (positive or negative).
   * </pre>
   *
   * <code>float magnitude = 2;</code>
   * @return The magnitude.
   */
  float getMagnitude();
}
