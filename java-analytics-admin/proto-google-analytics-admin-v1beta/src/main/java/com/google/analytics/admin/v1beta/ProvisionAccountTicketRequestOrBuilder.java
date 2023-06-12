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
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

public interface ProvisionAccountTicketRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.ProvisionAccountTicketRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   *
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   *
   * @return The account.
   */
  com.google.analytics.admin.v1beta.Account getAccount();
  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.Account account = 1;</code>
   */
  com.google.analytics.admin.v1beta.AccountOrBuilder getAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Cloud Console as a Redirect URI.
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   *
   * @return The redirectUri.
   */
  java.lang.String getRedirectUri();
  /**
   *
   *
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Cloud Console as a Redirect URI.
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   *
   * @return The bytes for redirectUri.
   */
  com.google.protobuf.ByteString getRedirectUriBytes();
}
