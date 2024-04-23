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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface DeleteConnectedSiteTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.DeleteConnectedSiteTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Universal Analytics property to delete connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * The Universal Analytics property to delete connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Tag ID to forward events to. Also known as the Measurement ID, or the
   * "G-ID"  (For example: G-12345).
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The tagId.
   */
  java.lang.String getTagId();
  /**
   *
   *
   * <pre>
   * Tag ID to forward events to. Also known as the Measurement ID, or the
   * "G-ID"  (For example: G-12345).
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The bytes for tagId.
   */
  com.google.protobuf.ByteString getTagIdBytes();
}
