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
// source: google/shopping/merchant/accounts/v1beta/businessinfo.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.accounts.v1beta;

public interface UpdateBusinessInfoRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.UpdateBusinessInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new version of the business info.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.BusinessInfo business_info = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the businessInfo field is set.
   */
  boolean hasBusinessInfo();
  /**
   *
   *
   * <pre>
   * Required. The new version of the business info.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.BusinessInfo business_info = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The businessInfo.
   */
  com.google.shopping.merchant.accounts.v1beta.BusinessInfo getBusinessInfo();
  /**
   *
   *
   * <pre>
   * Required. The new version of the business info.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.BusinessInfo business_info = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.BusinessInfoOrBuilder getBusinessInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
