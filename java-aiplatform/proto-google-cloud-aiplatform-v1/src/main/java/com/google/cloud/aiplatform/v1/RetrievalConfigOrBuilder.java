/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface RetrievalConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RetrievalConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The location of the user.
   * </pre>
   *
   * <code>optional .google.type.LatLng lat_lng = 1;</code>
   *
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();
  /**
   *
   *
   * <pre>
   * The location of the user.
   * </pre>
   *
   * <code>optional .google.type.LatLng lat_lng = 1;</code>
   *
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();
  /**
   *
   *
   * <pre>
   * The location of the user.
   * </pre>
   *
   * <code>optional .google.type.LatLng lat_lng = 1;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * The language code of the user.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   *
   *
   * <pre>
   * The language code of the user.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language code of the user.
   * </pre>
   *
   * <code>optional string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
