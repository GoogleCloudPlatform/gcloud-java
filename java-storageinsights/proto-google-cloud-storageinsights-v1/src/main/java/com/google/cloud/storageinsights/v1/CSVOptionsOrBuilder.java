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
// source: google/cloud/storageinsights/v1/storageinsights.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.storageinsights.v1;

public interface CSVOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.storageinsights.v1.CSVOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Record separator characters in CSV.
   * </pre>
   *
   * <code>string record_separator = 1;</code>
   *
   * @return The recordSeparator.
   */
  java.lang.String getRecordSeparator();
  /**
   *
   *
   * <pre>
   * Record separator characters in CSV.
   * </pre>
   *
   * <code>string record_separator = 1;</code>
   *
   * @return The bytes for recordSeparator.
   */
  com.google.protobuf.ByteString getRecordSeparatorBytes();

  /**
   *
   *
   * <pre>
   * Delimiter characters in CSV.
   * </pre>
   *
   * <code>string delimiter = 2;</code>
   *
   * @return The delimiter.
   */
  java.lang.String getDelimiter();
  /**
   *
   *
   * <pre>
   * Delimiter characters in CSV.
   * </pre>
   *
   * <code>string delimiter = 2;</code>
   *
   * @return The bytes for delimiter.
   */
  com.google.protobuf.ByteString getDelimiterBytes();

  /**
   *
   *
   * <pre>
   * If set, will include a header row in the CSV report.
   * </pre>
   *
   * <code>bool header_required = 3;</code>
   *
   * @return The headerRequired.
   */
  boolean getHeaderRequired();
}
