/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

public interface BatchAnnotateImagesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.BatchAnnotateImagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Individual responses to image annotation requests within the batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.AnnotateImageResponse> getResponsesList();
  /**
   *
   *
   * <pre>
   * Individual responses to image annotation requests within the batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.AnnotateImageResponse getResponses(int index);
  /**
   *
   *
   * <pre>
   * Individual responses to image annotation requests within the batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 1;</code>
   */
  int getResponsesCount();
  /**
   *
   *
   * <pre>
   * Individual responses to image annotation requests within the batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder>
      getResponsesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual responses to image annotation requests within the batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AnnotateImageResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.AnnotateImageResponseOrBuilder getResponsesOrBuilder(int index);
}
