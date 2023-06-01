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
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

public interface CreateCustomClassRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.CreateCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this custom class will be created.
   * Format:
   *
   * `projects/{project}/locations/{location}/customClasses`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this custom class will be created.
   * Format:
   *
   * `projects/{project}/locations/{location}/customClasses`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the custom class, which will become the final
   * component of the custom class' resource name.
   *
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The customClassId.
   */
  java.lang.String getCustomClassId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the custom class, which will become the final
   * component of the custom class' resource name.
   *
   * This value should restrict to letters, numbers, and hyphens, with the first
   * character a letter, the last a letter or a number, and be 4-63 characters.
   * </pre>
   *
   * <code>string custom_class_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for customClassId.
   */
  com.google.protobuf.ByteString getCustomClassIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customClass field is set.
   */
  boolean hasCustomClass();
  /**
   *
   *
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customClass.
   */
  com.google.cloud.speech.v1.CustomClass getCustomClass();
  /**
   *
   *
   * <pre>
   * Required. The custom class to create.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.CustomClass custom_class = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.speech.v1.CustomClassOrBuilder getCustomClassOrBuilder();
}
