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
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

public interface UpdateChannelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.UpdateChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   *
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   *
   * @return The channel.
   */
  com.google.cloud.eventarc.v1.Channel getChannel();
  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   */
  com.google.cloud.eventarc.v1.ChannelOrBuilder getChannelOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
