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
// source: google/cloud/aiplatform/v1/schema/predict/instance/text_extraction.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public interface TextExtractionPredictionInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.predict.instance.TextExtractionPredictionInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The text snippet to make the predictions on.
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
   * The text snippet to make the predictions on.
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
   * The MIME type of the text snippet. The supported MIME types are listed
   * below.
   * - text/plain
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
   * The MIME type of the text snippet. The supported MIME types are listed
   * below.
   * - text/plain
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
   * This field is only used for batch prediction. If a key is provided, the
   * batch prediction result will by mapped to this key. If omitted, then the
   * batch prediction result will contain the entire input instance. Vertex AI
   * will not check if keys in the request are duplicates, so it is up to the
   * caller to ensure the keys are unique.
   * </pre>
   *
   * <code>string key = 3;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * This field is only used for batch prediction. If a key is provided, the
   * batch prediction result will by mapped to this key. If omitted, then the
   * batch prediction result will contain the entire input instance. Vertex AI
   * will not check if keys in the request are duplicates, so it is up to the
   * caller to ensure the keys are unique.
   * </pre>
   *
   * <code>string key = 3;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();
}
