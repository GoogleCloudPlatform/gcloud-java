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
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public interface VideoActionRecognitionPredictionInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the video on which to perform the
   * prediction.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the video on which to perform the
   * prediction.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The MIME type of the content of the video. Only the following are
   * supported: video/mp4 video/avi video/quicktime
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * The MIME type of the content of the video. Only the following are
   * supported: video/mp4 video/avi video/quicktime
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment on which to perform
   * the prediction. Expressed as a number of seconds as measured from the
   * start of the video, with "s" appended at the end. Fractions are allowed,
   * up to a microsecond precision.
   * </pre>
   *
   * <code>string time_segment_start = 3;</code>
   *
   * @return The timeSegmentStart.
   */
  java.lang.String getTimeSegmentStart();
  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment on which to perform
   * the prediction. Expressed as a number of seconds as measured from the
   * start of the video, with "s" appended at the end. Fractions are allowed,
   * up to a microsecond precision.
   * </pre>
   *
   * <code>string time_segment_start = 3;</code>
   *
   * @return The bytes for timeSegmentStart.
   */
  com.google.protobuf.ByteString getTimeSegmentStartBytes();

  /**
   *
   *
   * <pre>
   * The end, exclusive, of the video's time segment on which to perform
   * the prediction. Expressed as a number of seconds as measured from the
   * start of the video, with "s" appended at the end. Fractions are allowed,
   * up to a microsecond precision, and "inf" or "Infinity" is allowed, which
   * means the end of the video.
   * </pre>
   *
   * <code>string time_segment_end = 4;</code>
   *
   * @return The timeSegmentEnd.
   */
  java.lang.String getTimeSegmentEnd();
  /**
   *
   *
   * <pre>
   * The end, exclusive, of the video's time segment on which to perform
   * the prediction. Expressed as a number of seconds as measured from the
   * start of the video, with "s" appended at the end. Fractions are allowed,
   * up to a microsecond precision, and "inf" or "Infinity" is allowed, which
   * means the end of the video.
   * </pre>
   *
   * <code>string time_segment_end = 4;</code>
   *
   * @return The bytes for timeSegmentEnd.
   */
  com.google.protobuf.ByteString getTimeSegmentEndBytes();
}
