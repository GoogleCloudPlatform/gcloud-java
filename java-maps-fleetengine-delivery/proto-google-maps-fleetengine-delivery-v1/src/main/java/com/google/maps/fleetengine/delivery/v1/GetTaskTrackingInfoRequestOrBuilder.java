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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.delivery.v1;

public interface GetTaskTrackingInfoRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.GetTaskTrackingInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The header.
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
   * must be the Google Cloud Project ID, and the `tracking_id` must be the
   * tracking ID associated with the task. An example name can be
   * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/taskTrackingInfo/{tracking_id}`. The `provider`
   * must be the Google Cloud Project ID, and the `tracking_id` must be the
   * tracking ID associated with the task. An example name can be
   * `providers/sample-cloud-project/taskTrackingInfo/sample-tracking-id`.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
