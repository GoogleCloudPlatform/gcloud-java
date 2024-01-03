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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

public interface GetNotificationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.GetNotificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A name of the notification to retrieve.
   * Format:
   * organizations/{organization}/locations/{location}/notifications/{notification}
   * or projects/{projects}/locations/{location}/notifications/{notification}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. A name of the notification to retrieve.
   * Format:
   * organizations/{organization}/locations/{location}/notifications/{notification}
   * or projects/{projects}/locations/{location}/notifications/{notification}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * ISO code for requested localization language. If unset, will be
   * interpereted as "en". If the requested language is valid, but not supported
   * for this notification, English will be returned with an "Not applicable"
   * LocalizationState. If the ISO code is invalid (i.e. not a real language),
   * this RPC will throw an error.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * ISO code for requested localization language. If unset, will be
   * interpereted as "en". If the requested language is valid, but not supported
   * for this notification, English will be returned with an "Not applicable"
   * LocalizationState. If the ISO code is invalid (i.e. not a real language),
   * this RPC will throw an error.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
