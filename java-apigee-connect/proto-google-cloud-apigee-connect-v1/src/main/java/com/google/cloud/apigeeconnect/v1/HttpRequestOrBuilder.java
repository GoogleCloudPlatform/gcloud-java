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
// source: google/cloud/apigeeconnect/v1/tether.proto

package com.google.cloud.apigeeconnect.v1;

public interface HttpRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeconnect.v1.HttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique identifier for the request.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A unique identifier for the request.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The HTTP request method.
   * Valid methods: "GET", "HEAD", "POST", "PUT", "PATCH","DELETE".
   * </pre>
   *
   * <code>string method = 2;</code>
   *
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   *
   *
   * <pre>
   * The HTTP request method.
   * Valid methods: "GET", "HEAD", "POST", "PUT", "PATCH","DELETE".
   * </pre>
   *
   * <code>string method = 2;</code>
   *
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString getMethodBytes();

  /**
   *
   *
   * <pre>
   * The HTTP request URL.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Url url = 3;</code>
   *
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   *
   *
   * <pre>
   * The HTTP request URL.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Url url = 3;</code>
   *
   * @return The url.
   */
  com.google.cloud.apigeeconnect.v1.Url getUrl();
  /**
   *
   *
   * <pre>
   * The HTTP request URL.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Url url = 3;</code>
   */
  com.google.cloud.apigeeconnect.v1.UrlOrBuilder getUrlOrBuilder();

  /**
   *
   *
   * <pre>
   * The HTTP request headers.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeconnect.v1.Header headers = 4;</code>
   */
  java.util.List<com.google.cloud.apigeeconnect.v1.Header> getHeadersList();
  /**
   *
   *
   * <pre>
   * The HTTP request headers.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeconnect.v1.Header headers = 4;</code>
   */
  com.google.cloud.apigeeconnect.v1.Header getHeaders(int index);
  /**
   *
   *
   * <pre>
   * The HTTP request headers.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeconnect.v1.Header headers = 4;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * The HTTP request headers.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeconnect.v1.Header headers = 4;</code>
   */
  java.util.List<? extends com.google.cloud.apigeeconnect.v1.HeaderOrBuilder>
      getHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The HTTP request headers.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeconnect.v1.Header headers = 4;</code>
   */
  com.google.cloud.apigeeconnect.v1.HeaderOrBuilder getHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * HTTP request body.
   * </pre>
   *
   * <code>bytes body = 5;</code>
   *
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();
}
