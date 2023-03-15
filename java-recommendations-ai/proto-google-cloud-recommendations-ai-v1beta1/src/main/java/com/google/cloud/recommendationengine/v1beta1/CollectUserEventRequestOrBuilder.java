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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface CollectUserEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent eventStore name, such as
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
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
   * Required. The parent eventStore name, such as
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
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
   * Required. URL encoded UserEvent proto.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userEvent.
   */
  java.lang.String getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. URL encoded UserEvent proto.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for userEvent.
   */
  com.google.protobuf.ByteString getUserEventBytes();

  /**
   *
   *
   * <pre>
   * Optional. The url including cgi-parameters but excluding the hash fragment.
   * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
   * bytes. This is often more useful than the referer url, because many
   * browsers only send the domain for 3rd party requests.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Optional. The url including cgi-parameters but excluding the hash fragment.
   * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
   * bytes. This is often more useful than the referer url, because many
   * browsers only send the domain for 3rd party requests.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The event timestamp in milliseconds. This prevents browser
   * caching of otherwise identical get requests. The name is abbreviated to
   * reduce the payload bytes.
   * </pre>
   *
   * <code>int64 ets = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ets.
   */
  long getEts();
}
