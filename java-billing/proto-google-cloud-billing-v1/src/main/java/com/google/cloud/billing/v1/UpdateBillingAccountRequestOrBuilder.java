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
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

public interface UpdateBillingAccountRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.UpdateBillingAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the billing account resource to be updated.
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
   * Required. The name of the billing account resource to be updated.
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
   * Required. The billing account resource to replace the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to replace the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The account.
   */
  com.google.cloud.billing.v1.BillingAccount getAccount();
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to replace the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.billing.v1.BillingAccountOrBuilder getAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
