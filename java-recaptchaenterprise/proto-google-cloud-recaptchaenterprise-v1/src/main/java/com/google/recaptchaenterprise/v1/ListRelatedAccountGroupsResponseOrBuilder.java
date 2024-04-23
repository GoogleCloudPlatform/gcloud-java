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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.3
package com.google.recaptchaenterprise.v1;

public interface ListRelatedAccountGroupsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;
   * </code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup>
      getRelatedAccountGroupsList();
  /**
   *
   *
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;
   * </code>
   */
  com.google.recaptchaenterprise.v1.RelatedAccountGroup getRelatedAccountGroups(int index);
  /**
   *
   *
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;
   * </code>
   */
  int getRelatedAccountGroupsCount();
  /**
   *
   *
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;
   * </code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder>
      getRelatedAccountGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;
   * </code>
   */
  com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder getRelatedAccountGroupsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
