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
// source: google/appengine/v1/appengine.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface ListServicesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ListServicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The services belonging to the requested application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Service services = 1;</code>
   */
  java.util.List<com.google.appengine.v1.Service> getServicesList();
  /**
   *
   *
   * <pre>
   * The services belonging to the requested application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Service services = 1;</code>
   */
  com.google.appengine.v1.Service getServices(int index);
  /**
   *
   *
   * <pre>
   * The services belonging to the requested application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Service services = 1;</code>
   */
  int getServicesCount();
  /**
   *
   *
   * <pre>
   * The services belonging to the requested application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Service services = 1;</code>
   */
  java.util.List<? extends com.google.appengine.v1.ServiceOrBuilder> getServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The services belonging to the requested application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Service services = 1;</code>
   */
  com.google.appengine.v1.ServiceOrBuilder getServicesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Continuation token for fetching the next page of results.
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
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
