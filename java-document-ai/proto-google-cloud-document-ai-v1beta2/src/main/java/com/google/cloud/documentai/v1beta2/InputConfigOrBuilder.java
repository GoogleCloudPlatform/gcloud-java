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
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.documentai.v1beta2.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Content in bytes, represented as a stream of bytes.
   * Note: As with all `bytes` fields, proto buffer messages use a pure binary
   * representation, whereas JSON representations use base64.
   * This field only works for synchronous ProcessDocument method.
   * </pre>
   *
   * <code>bytes contents = 3;</code>
   *
   * @return Whether the contents field is set.
   */
  boolean hasContents();
  /**
   *
   *
   * <pre>
   * Content in bytes, represented as a stream of bytes.
   * Note: As with all `bytes` fields, proto buffer messages use a pure binary
   * representation, whereas JSON representations use base64.
   * This field only works for synchronous ProcessDocument method.
   * </pre>
   *
   * <code>bytes contents = 3;</code>
   *
   * @return The contents.
   */
  com.google.protobuf.ByteString getContents();

  /**
   *
   *
   * <pre>
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
   * image/tiff, and image/gif.
   * In addition, application/json type is supported for requests with
   * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
   * be in [Document][google.cloud.documentai.v1beta2.Document] format.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
   * image/tiff, and image/gif.
   * In addition, application/json type is supported for requests with
   * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
   * be in [Document][google.cloud.documentai.v1beta2.Document] format.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  public com.google.cloud.documentai.v1beta2.InputConfig.SourceCase getSourceCase();
}
