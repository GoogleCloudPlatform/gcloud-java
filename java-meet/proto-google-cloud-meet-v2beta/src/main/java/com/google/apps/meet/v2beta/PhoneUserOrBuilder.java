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
// source: google/apps/meet/v2beta/resource.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.meet.v2beta;

public interface PhoneUserOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.meet.v2beta.PhoneUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Partially redacted user's phone number when they call in.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. Partially redacted user's phone number when they call in.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
