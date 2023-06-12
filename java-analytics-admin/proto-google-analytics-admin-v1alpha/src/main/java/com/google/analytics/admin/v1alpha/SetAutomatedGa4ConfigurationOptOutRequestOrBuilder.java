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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface SetAutomatedGa4ConfigurationOptOutRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The UA property to set the opt out status. Note this request uses
   * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
   * Format: properties/{internalWebPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * Required. The UA property to set the opt out status. Note this request uses
   * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
   * Format: properties/{internalWebPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * The status to set.
   * </pre>
   *
   * <code>bool opt_out = 2;</code>
   *
   * @return The optOut.
   */
  boolean getOptOut();
}
