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
// source: google/cloud/securitycenter/v2/log_entry.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public interface CloudLoggingEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.CloudLoggingEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique identifier for the log entry.
   * </pre>
   *
   * <code>string insert_id = 1;</code>
   *
   * @return The insertId.
   */
  java.lang.String getInsertId();
  /**
   *
   *
   * <pre>
   * A unique identifier for the log entry.
   * </pre>
   *
   * <code>string insert_id = 1;</code>
   *
   * @return The bytes for insertId.
   */
  com.google.protobuf.ByteString getInsertIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the log (part of `log_name`. `log_name` is the resource name of
   * the log to which this log entry belongs). For example:
   * `cloudresourcemanager.googleapis.com/activity` Note that this field is not
   * URL-encoded, unlike in `LogEntry`.
   * </pre>
   *
   * <code>string log_id = 2;</code>
   *
   * @return The logId.
   */
  java.lang.String getLogId();
  /**
   *
   *
   * <pre>
   * The type of the log (part of `log_name`. `log_name` is the resource name of
   * the log to which this log entry belongs). For example:
   * `cloudresourcemanager.googleapis.com/activity` Note that this field is not
   * URL-encoded, unlike in `LogEntry`.
   * </pre>
   *
   * <code>string log_id = 2;</code>
   *
   * @return The bytes for logId.
   */
  com.google.protobuf.ByteString getLogIdBytes();

  /**
   *
   *
   * <pre>
   * The organization, folder, or project of the monitored resource that
   * produced this log entry.
   * </pre>
   *
   * <code>string resource_container = 3;</code>
   *
   * @return The resourceContainer.
   */
  java.lang.String getResourceContainer();
  /**
   *
   *
   * <pre>
   * The organization, folder, or project of the monitored resource that
   * produced this log entry.
   * </pre>
   *
   * <code>string resource_container = 3;</code>
   *
   * @return The bytes for resourceContainer.
   */
  com.google.protobuf.ByteString getResourceContainerBytes();

  /**
   *
   *
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 4;</code>
   *
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   *
   *
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 4;</code>
   *
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   *
   *
   * <pre>
   * The time the event described by the log entry occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}
