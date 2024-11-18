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
// source: google/cloud/alloydb/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public interface DatabaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.Database)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the resource in the form of
   * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of the resource in the form of
   * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Charset for the database.
   * This field can contain any PostgreSQL supported charset name.
   * Example values include "UTF8", "SQL_ASCII", etc.
   * </pre>
   *
   * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The charset.
   */
  java.lang.String getCharset();
  /**
   *
   *
   * <pre>
   * Optional. Charset for the database.
   * This field can contain any PostgreSQL supported charset name.
   * Example values include "UTF8", "SQL_ASCII", etc.
   * </pre>
   *
   * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for charset.
   */
  com.google.protobuf.ByteString getCharsetBytes();

  /**
   *
   *
   * <pre>
   * Optional. Collation for the database.
   * Name of the custom or native collation for postgres.
   * Example values include "C", "POSIX", etc
   * </pre>
   *
   * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The collation.
   */
  java.lang.String getCollation();
  /**
   *
   *
   * <pre>
   * Optional. Collation for the database.
   * Name of the custom or native collation for postgres.
   * Example values include "C", "POSIX", etc
   * </pre>
   *
   * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for collation.
   */
  com.google.protobuf.ByteString getCollationBytes();
}
