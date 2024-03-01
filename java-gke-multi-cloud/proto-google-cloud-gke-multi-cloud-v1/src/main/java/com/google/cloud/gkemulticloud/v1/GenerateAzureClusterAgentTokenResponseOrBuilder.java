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
// source: google/cloud/gkemulticloud/v1/azure_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

public interface GenerateAzureClusterAgentTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GenerateAzureClusterAgentTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string access_token = 1;</code>
   *
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 1;</code>
   *
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString getAccessTokenBytes();

  /**
   * <code>int32 expires_in = 2;</code>
   *
   * @return The expiresIn.
   */
  int getExpiresIn();

  /**
   * <code>string token_type = 3;</code>
   *
   * @return The tokenType.
   */
  java.lang.String getTokenType();
  /**
   * <code>string token_type = 3;</code>
   *
   * @return The bytes for tokenType.
   */
  com.google.protobuf.ByteString getTokenTypeBytes();
}
