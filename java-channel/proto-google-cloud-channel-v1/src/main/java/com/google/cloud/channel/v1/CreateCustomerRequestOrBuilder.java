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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface CreateCustomerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CreateCustomerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of reseller account in which to create the
   * customer. Parent uses the format: accounts/{account_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of reseller account in which to create the
   * customer. Parent uses the format: accounts/{account_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customer.
   */
  com.google.cloud.channel.v1.Customer getCustomer();
  /**
   *
   *
   * <pre>
   * Required. The customer to create.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Customer customer = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.CustomerOrBuilder getCustomerOrBuilder();
}
