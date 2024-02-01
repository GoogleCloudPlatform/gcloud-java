// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/params/video_classification.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.predict.params;

public interface VideoClassificationPredictionParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.params.VideoClassificationPredictionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Model only returns predictions with at least this confidence score.
   * Default value is 0.0
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   * @return The confidenceThreshold.
   */
  float getConfidenceThreshold();

  /**
   * <pre>
   * The Model only returns up to that many top, by confidence score,
   * predictions per instance. If this number is very high, the Model may return
   * fewer predictions. Default value is 10,000.
   * </pre>
   *
   * <code>int32 max_predictions = 2;</code>
   * @return The maxPredictions.
   */
  int getMaxPredictions();

  /**
   * <pre>
   * Set to true to request segment-level classification. Vertex AI returns
   * labels and their confidence scores for the entire time segment of the
   * video that user specified in the input instance.
   * Default value is true
   * </pre>
   *
   * <code>bool segment_classification = 3;</code>
   * @return The segmentClassification.
   */
  boolean getSegmentClassification();

  /**
   * <pre>
   * Set to true to request shot-level classification. Vertex AI determines
   * the boundaries for each camera shot in the entire time segment of the
   * video that user specified in the input instance. Vertex AI then
   * returns labels and their confidence scores for each detected shot, along
   * with the start and end time of the shot.
   * WARNING: Model evaluation is not done for this classification type,
   * the quality of it depends on the training data, but there are no metrics
   * provided to describe that quality.
   * Default value is false
   * </pre>
   *
   * <code>bool shot_classification = 4;</code>
   * @return The shotClassification.
   */
  boolean getShotClassification();

  /**
   * <pre>
   * Set to true to request classification for a video at one-second intervals.
   * Vertex AI returns labels and their confidence scores for each second of
   * the entire time segment of the video that user specified in the input
   * WARNING: Model evaluation is not done for this classification type, the
   * quality of it depends on the training data, but there are no metrics
   * provided to describe that quality. Default value is false
   * </pre>
   *
   * <code>bool one_sec_interval_classification = 5;</code>
   * @return The oneSecIntervalClassification.
   */
  boolean getOneSecIntervalClassification();
}
