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
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/image_object_detection.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public interface ImageObjectDetectionPredictionInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.predict.instance.ImageObjectDetectionPredictionInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The image bytes or Cloud Storage URI to make the prediction on.
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
   * The image bytes or Cloud Storage URI to make the prediction on.
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
   * The MIME type of the content of the image. Only the images in below listed
   * MIME types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
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
   * The MIME type of the content of the image. Only the images in below listed
   * MIME types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();
}
