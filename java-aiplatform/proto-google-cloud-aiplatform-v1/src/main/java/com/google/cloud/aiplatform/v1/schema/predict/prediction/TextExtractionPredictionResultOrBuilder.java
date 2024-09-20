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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/text_extraction.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public interface TextExtractionPredictionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.prediction.TextExtractionPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified,
   * ordered by the confidence score descendingly.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   *
   * @return A list containing the ids.
   */
  java.util.List<java.lang.Long> getIdsList();
  /**
   *
   *
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified,
   * ordered by the confidence score descendingly.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   *
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   *
   *
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified,
   * ordered by the confidence score descendingly.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  long getIds(int index);

  /**
   *
   *
   * <pre>
   * The display names of the AnnotationSpecs that had been identified,
   * order matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   *
   * @return A list containing the displayNames.
   */
  java.util.List<java.lang.String> getDisplayNamesList();
  /**
   *
   *
   * <pre>
   * The display names of the AnnotationSpecs that had been identified,
   * order matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   *
   * @return The count of displayNames.
   */
  int getDisplayNamesCount();
  /**
   *
   *
   * <pre>
   * The display names of the AnnotationSpecs that had been identified,
   * order matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The displayNames at the given index.
   */
  java.lang.String getDisplayNames(int index);
  /**
   *
   *
   * <pre>
   * The display names of the AnnotationSpecs that had been identified,
   * order matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the displayNames at the given index.
   */
  com.google.protobuf.ByteString getDisplayNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * The start offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_start_offsets = 3;</code>
   *
   * @return A list containing the textSegmentStartOffsets.
   */
  java.util.List<java.lang.Long> getTextSegmentStartOffsetsList();
  /**
   *
   *
   * <pre>
   * The start offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_start_offsets = 3;</code>
   *
   * @return The count of textSegmentStartOffsets.
   */
  int getTextSegmentStartOffsetsCount();
  /**
   *
   *
   * <pre>
   * The start offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_start_offsets = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The textSegmentStartOffsets at the given index.
   */
  long getTextSegmentStartOffsets(int index);

  /**
   *
   *
   * <pre>
   * The end offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_end_offsets = 4;</code>
   *
   * @return A list containing the textSegmentEndOffsets.
   */
  java.util.List<java.lang.Long> getTextSegmentEndOffsetsList();
  /**
   *
   *
   * <pre>
   * The end offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_end_offsets = 4;</code>
   *
   * @return The count of textSegmentEndOffsets.
   */
  int getTextSegmentEndOffsetsCount();
  /**
   *
   *
   * <pre>
   * The end offsets, inclusive, of the text segment in which the
   * AnnotationSpec has been identified. Expressed as a zero-based number
   * of characters as measured from the start of the text snippet.
   * </pre>
   *
   * <code>repeated int64 text_segment_end_offsets = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The textSegmentEndOffsets at the given index.
   */
  long getTextSegmentEndOffsets(int index);

  /**
   *
   *
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher
   * value means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 5;</code>
   *
   * @return A list containing the confidences.
   */
  java.util.List<java.lang.Float> getConfidencesList();
  /**
   *
   *
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher
   * value means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 5;</code>
   *
   * @return The count of confidences.
   */
  int getConfidencesCount();
  /**
   *
   *
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher
   * value means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The confidences at the given index.
   */
  float getConfidences(int index);
}
