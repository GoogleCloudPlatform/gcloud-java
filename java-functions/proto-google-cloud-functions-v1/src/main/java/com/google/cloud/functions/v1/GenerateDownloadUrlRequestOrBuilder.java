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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.functions.v1;

public interface GenerateDownloadUrlRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.GenerateDownloadUrlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of function for which source code Google Cloud Storage signed
   * URL should be generated.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of function for which source code Google Cloud Storage signed
   * URL should be generated.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The optional version of function. If not set, default, current version
   * is used.
   * </pre>
   *
   * <code>uint64 version_id = 2;</code>
   *
   * @return The versionId.
   */
  long getVersionId();
}
