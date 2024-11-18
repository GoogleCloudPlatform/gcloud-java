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

// Protobuf Java Version: 3.25.5
package com.google.recaptchaenterprise.v1;

public interface IOSKeySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.IOSKeySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. If set to true, allowed_bundle_ids are not enforced.
   * </pre>
   *
   * <code>bool allow_all_bundle_ids = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowAllBundleIds.
   */
  boolean getAllowAllBundleIds();

  /**
   *
   *
   * <pre>
   * Optional. iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the allowedBundleIds.
   */
  java.util.List<java.lang.String> getAllowedBundleIdsList();
  /**
   *
   *
   * <pre>
   * Optional. iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of allowedBundleIds.
   */
  int getAllowedBundleIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The allowedBundleIds at the given index.
   */
  java.lang.String getAllowedBundleIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. iOS bundle ids of apps allowed to use the key.
   * Example: 'com.companyname.productname.appname'
   * </pre>
   *
   * <code>repeated string allowed_bundle_ids = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedBundleIds at the given index.
   */
  com.google.protobuf.ByteString getAllowedBundleIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Apple Developer account details for the app that is protected by
   * the reCAPTCHA Key. reCAPTCHA leverages platform-specific checks like Apple
   * App Attest and Apple DeviceCheck to protect your app from abuse. Providing
   * these fields allows reCAPTCHA to get a better assessment of the integrity
   * of your app.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AppleDeveloperId apple_developer_id = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the appleDeveloperId field is set.
   */
  boolean hasAppleDeveloperId();
  /**
   *
   *
   * <pre>
   * Optional. Apple Developer account details for the app that is protected by
   * the reCAPTCHA Key. reCAPTCHA leverages platform-specific checks like Apple
   * App Attest and Apple DeviceCheck to protect your app from abuse. Providing
   * these fields allows reCAPTCHA to get a better assessment of the integrity
   * of your app.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AppleDeveloperId apple_developer_id = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The appleDeveloperId.
   */
  com.google.recaptchaenterprise.v1.AppleDeveloperId getAppleDeveloperId();
  /**
   *
   *
   * <pre>
   * Optional. Apple Developer account details for the app that is protected by
   * the reCAPTCHA Key. reCAPTCHA leverages platform-specific checks like Apple
   * App Attest and Apple DeviceCheck to protect your app from abuse. Providing
   * these fields allows reCAPTCHA to get a better assessment of the integrity
   * of your app.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AppleDeveloperId apple_developer_id = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.AppleDeveloperIdOrBuilder getAppleDeveloperIdOrBuilder();
}
