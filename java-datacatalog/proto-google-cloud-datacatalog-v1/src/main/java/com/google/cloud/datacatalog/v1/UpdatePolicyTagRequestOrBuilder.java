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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

public interface UpdatePolicyTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdatePolicyTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   *
   * @return Whether the policyTag field is set.
   */
  boolean hasPolicyTag();
  /**
   *
   *
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   *
   * @return The policyTag.
   */
  com.google.cloud.datacatalog.v1.PolicyTag getPolicyTag();
  /**
   *
   *
   * <pre>
   * The policy tag to update. You can update only its description, display
   * name, and parent policy tag fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PolicyTag policy_tag = 1;</code>
   */
  com.google.cloud.datacatalog.v1.PolicyTagOrBuilder getPolicyTagOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
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
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
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
   * Specifies the fields to update.
   * You can update only display name, description, and parent policy tag.
   * If not set, defaults to all updatable fields.
   * For more information, see [FieldMask]
   * (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
