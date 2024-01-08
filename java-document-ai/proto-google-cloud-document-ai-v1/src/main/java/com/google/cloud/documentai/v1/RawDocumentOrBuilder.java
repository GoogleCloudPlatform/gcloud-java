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
// source: google/cloud/documentai/v1/document_io.proto

package com.google.cloud.documentai.v1;

public interface RawDocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.RawDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Inline document content.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * An IANA MIME type (RFC6838) indicating the nature and format of the
   * [content][google.cloud.documentai.v1.RawDocument.content].
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
   * An IANA MIME type (RFC6838) indicating the nature and format of the
   * [content][google.cloud.documentai.v1.RawDocument.content].
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
   * The display name of the document, it supports all Unicode characters except
   * the following:
   * `*`, `?`, `[`, `]`, `%`, `{`, `}`,`'`, `&#92;"`, `,`
   * `~`, `=` and `:` are reserved.
   * If not specified, a default ID is generated.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the document, it supports all Unicode characters except
   * the following:
   * `*`, `?`, `[`, `]`, `%`, `{`, `}`,`'`, `&#92;"`, `,`
   * `~`, `=` and `:` are reserved.
   * If not specified, a default ID is generated.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
