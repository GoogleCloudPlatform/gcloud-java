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
// source: google/cloud/gkemulticloud/v1/aws_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

public interface GenerateAwsAccessTokenResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString getAccessTokenBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();
}
