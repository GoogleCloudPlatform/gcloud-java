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

public interface RegisterSubscriberRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.RegisterSubscriberRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString getAccountBytes();

  /**
   *
   *
   * <pre>
   * Required. Service account that provides subscriber access to the registered
   * topic.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Required. Service account that provides subscriber access to the registered
   * topic.
   * </pre>
   *
   * <code>string service_account = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();
}
