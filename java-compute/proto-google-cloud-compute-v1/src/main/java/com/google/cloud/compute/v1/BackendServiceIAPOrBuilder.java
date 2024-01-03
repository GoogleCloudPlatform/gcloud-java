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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface BackendServiceIAPOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceIAP)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether the serving infrastructure will authenticate and authorize all incoming requests.
   * </pre>
   *
   * <code>optional bool enabled = 1018689;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Whether the serving infrastructure will authenticate and authorize all incoming requests.
   * </pre>
   *
   * <code>optional bool enabled = 1018689;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return Whether the oauth2ClientId field is set.
   */
  boolean hasOauth2ClientId();
  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return The oauth2ClientId.
   */
  java.lang.String getOauth2ClientId();
  /**
   *
   *
   * <pre>
   * OAuth2 client ID to use for the authentication flow.
   * </pre>
   *
   * <code>optional string oauth2_client_id = 314017611;</code>
   *
   * @return The bytes for oauth2ClientId.
   */
  com.google.protobuf.ByteString getOauth2ClientIdBytes();

  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return Whether the oauth2ClientSecret field is set.
   */
  boolean hasOauth2ClientSecret();
  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return The oauth2ClientSecret.
   */
  java.lang.String getOauth2ClientSecret();
  /**
   *
   *
   * <pre>
   * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. &#64;InputOnly
   * </pre>
   *
   * <code>optional string oauth2_client_secret = 50999520;</code>
   *
   * @return The bytes for oauth2ClientSecret.
   */
  com.google.protobuf.ByteString getOauth2ClientSecretBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return Whether the oauth2ClientSecretSha256 field is set.
   */
  boolean hasOauth2ClientSecretSha256();
  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return The oauth2ClientSecretSha256.
   */
  java.lang.String getOauth2ClientSecretSha256();
  /**
   *
   *
   * <pre>
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * </pre>
   *
   * <code>optional string oauth2_client_secret_sha256 = 112903782;</code>
   *
   * @return The bytes for oauth2ClientSecretSha256.
   */
  com.google.protobuf.ByteString getOauth2ClientSecretSha256Bytes();
}
