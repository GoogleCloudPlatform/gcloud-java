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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface GoogleAdsLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.GoogleAdsLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Format:
   * properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
   * Note: googleAdsLinkId is not the Google Ads customer ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Format:
   * properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
   * Note: googleAdsLinkId is not the Google Ads customer ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Google Ads customer ID.
   * </pre>
   *
   * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   *
   *
   * <pre>
   * Immutable. Google Ads customer ID.
   * </pre>
   *
   * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString getCustomerIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. If true, this link is for a Google Ads manager account.
   * </pre>
   *
   * <code>bool can_manage_clients = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The canManageClients.
   */
  boolean getCanManageClients();

  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   *
   * @return Whether the adsPersonalizationEnabled field is set.
   */
  boolean hasAdsPersonalizationEnabled();
  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   *
   * @return The adsPersonalizationEnabled.
   */
  com.google.protobuf.BoolValue getAdsPersonalizationEnabled();
  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAdsPersonalizationEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Email address of the user that created the link.
   * An empty string will be returned if the email address can't be retrieved.
   * </pre>
   *
   * <code>string creator_email_address = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creatorEmailAddress.
   */
  java.lang.String getCreatorEmailAddress();
  /**
   *
   *
   * <pre>
   * Output only. Email address of the user that created the link.
   * An empty string will be returned if the email address can't be retrieved.
   * </pre>
   *
   * <code>string creator_email_address = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for creatorEmailAddress.
   */
  com.google.protobuf.ByteString getCreatorEmailAddressBytes();
}
