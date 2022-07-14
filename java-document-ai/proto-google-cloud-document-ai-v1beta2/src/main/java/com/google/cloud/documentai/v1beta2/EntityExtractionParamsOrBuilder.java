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

public interface EntityExtractionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.EntityExtractionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to enable entity extraction.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Model version of the entity extraction. Default is
   * "builtin/stable". Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 2;</code>
   *
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   *
   *
   * <pre>
   * Model version of the entity extraction. Default is
   * "builtin/stable". Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 2;</code>
   *
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString getModelVersionBytes();
}
