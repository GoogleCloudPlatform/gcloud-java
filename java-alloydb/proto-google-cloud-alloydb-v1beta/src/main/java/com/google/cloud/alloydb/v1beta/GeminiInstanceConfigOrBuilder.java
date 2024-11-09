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
// source: google/cloud/alloydb/v1beta/gemini.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1beta;

public interface GeminiInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.GeminiInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Whether the Gemini in Databases add-on is enabled for the
   * instance. It will be true only if the add-on has been enabled for the
   * billing account corresponding to the instance. Its status is toggled from
   * the Admin Control Center (ACC) and cannot be toggled using AlloyDB's APIs.
   * </pre>
   *
   * <code>bool entitled = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The entitled.
   */
  boolean getEntitled();
}
