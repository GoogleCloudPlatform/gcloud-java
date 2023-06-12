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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/video_object_tracking.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public interface VideoObjectTrackingPredictionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource ID of the AnnotationSpec that had been identified.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The resource ID of the AnnotationSpec that had been identified.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The display name of the AnnotationSpec that had been identified.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the AnnotationSpec that had been identified.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_start = 3;</code>
   *
   * @return Whether the timeSegmentStart field is set.
   */
  boolean hasTimeSegmentStart();
  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_start = 3;</code>
   *
   * @return The timeSegmentStart.
   */
  com.google.protobuf.Duration getTimeSegmentStart();
  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_start = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeSegmentStartOrBuilder();

  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_end = 4;</code>
   *
   * @return Whether the timeSegmentEnd field is set.
   */
  boolean hasTimeSegmentEnd();
  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_end = 4;</code>
   *
   * @return The timeSegmentEnd.
   */
  com.google.protobuf.Duration getTimeSegmentEnd();
  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the
   * object instance has been detected. Expressed as a number of seconds as
   * measured from the start of the video, with fractions up to a microsecond
   * precision, and with "s" appended at the end.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_segment_end = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeSegmentEndOrBuilder();

  /**
   *
   *
   * <pre>
   * The Model's confidence in correction of this prediction, higher
   * value means higher confidence.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue confidence = 5;</code>
   *
   * @return Whether the confidence field is set.
   */
  boolean hasConfidence();
  /**
   *
   *
   * <pre>
   * The Model's confidence in correction of this prediction, higher
   * value means higher confidence.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue confidence = 5;</code>
   *
   * @return The confidence.
   */
  com.google.protobuf.FloatValue getConfidence();
  /**
   *
   *
   * <pre>
   * The Model's confidence in correction of this prediction, higher
   * value means higher confidence.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue confidence = 5;</code>
   */
  com.google.protobuf.FloatValueOrBuilder getConfidenceOrBuilder();

  /**
   *
   *
   * <pre>
   * All of the frames of the video in which a single object instance has been
   * detected. The bounding boxes in the frames identify the same object.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame frames = 6;
   * </code>
   */
  java.util.List<
          com.google.cloud.aiplatform.v1.schema.predict.prediction
              .VideoObjectTrackingPredictionResult.Frame>
      getFramesList();
  /**
   *
   *
   * <pre>
   * All of the frames of the video in which a single object instance has been
   * detected. The bounding boxes in the frames identify the same object.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame frames = 6;
   * </code>
   */
  com.google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame
      getFrames(int index);
  /**
   *
   *
   * <pre>
   * All of the frames of the video in which a single object instance has been
   * detected. The bounding boxes in the frames identify the same object.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame frames = 6;
   * </code>
   */
  int getFramesCount();
  /**
   *
   *
   * <pre>
   * All of the frames of the video in which a single object instance has been
   * detected. The bounding boxes in the frames identify the same object.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame frames = 6;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1.schema.predict.prediction
                  .VideoObjectTrackingPredictionResult.FrameOrBuilder>
      getFramesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All of the frames of the video in which a single object instance has been
   * detected. The bounding boxes in the frames identify the same object.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult.Frame frames = 6;
   * </code>
   */
  com.google.cloud.aiplatform.v1.schema.predict.prediction.VideoObjectTrackingPredictionResult
          .FrameOrBuilder
      getFramesOrBuilder(int index);
}
