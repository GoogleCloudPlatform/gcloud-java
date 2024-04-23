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
// source: google/cloud/batch/v1/job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.batch.v1;

public interface ServiceAccountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.ServiceAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Email address of the service account.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * Email address of the service account.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * List of scopes to be enabled for this service account.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   *
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String> getScopesList();
  /**
   *
   *
   * <pre>
   * List of scopes to be enabled for this service account.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   *
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   *
   *
   * <pre>
   * List of scopes to be enabled for this service account.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   *
   *
   * <pre>
   * List of scopes to be enabled for this service account.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString getScopesBytes(int index);
}
