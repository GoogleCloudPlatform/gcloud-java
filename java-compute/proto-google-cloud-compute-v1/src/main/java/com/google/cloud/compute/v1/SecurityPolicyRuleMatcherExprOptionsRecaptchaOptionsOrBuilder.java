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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface SecurityPolicyRuleMatcherExprOptionsRecaptchaOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRuleMatcherExprOptionsRecaptchaOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA action-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string action_token_site_keys = 59929885;</code>
   *
   * @return A list containing the actionTokenSiteKeys.
   */
  java.util.List<java.lang.String> getActionTokenSiteKeysList();
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA action-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string action_token_site_keys = 59929885;</code>
   *
   * @return The count of actionTokenSiteKeys.
   */
  int getActionTokenSiteKeysCount();
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA action-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string action_token_site_keys = 59929885;</code>
   *
   * @param index The index of the element to return.
   * @return The actionTokenSiteKeys at the given index.
   */
  java.lang.String getActionTokenSiteKeys(int index);
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA action-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string action_token_site_keys = 59929885;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the actionTokenSiteKeys at the given index.
   */
  com.google.protobuf.ByteString getActionTokenSiteKeysBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA session-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string session_token_site_keys = 333363581;</code>
   *
   * @return A list containing the sessionTokenSiteKeys.
   */
  java.util.List<java.lang.String> getSessionTokenSiteKeysList();
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA session-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string session_token_site_keys = 333363581;</code>
   *
   * @return The count of sessionTokenSiteKeys.
   */
  int getSessionTokenSiteKeysCount();
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA session-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string session_token_site_keys = 333363581;</code>
   *
   * @param index The index of the element to return.
   * @return The sessionTokenSiteKeys at the given index.
   */
  java.lang.String getSessionTokenSiteKeys(int index);
  /**
   *
   *
   * <pre>
   * A list of site keys to be used during the validation of reCAPTCHA session-tokens. The provided site keys need to be created from reCAPTCHA API under the same project where the security policy is created.
   * </pre>
   *
   * <code>repeated string session_token_site_keys = 333363581;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sessionTokenSiteKeys at the given index.
   */
  com.google.protobuf.ByteString getSessionTokenSiteKeysBytes(int index);
}
