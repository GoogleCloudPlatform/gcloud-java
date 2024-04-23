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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.config.v1;

public interface LockInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.LockInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique ID for the lock to be overridden with generation ID in the backend.
   * </pre>
   *
   * <code>int64 lock_id = 1;</code>
   *
   * @return The lockId.
   */
  long getLockId();

  /**
   *
   *
   * <pre>
   * Terraform operation, provided by the caller.
   * </pre>
   *
   * <code>string operation = 2;</code>
   *
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   *
   *
   * <pre>
   * Terraform operation, provided by the caller.
   * </pre>
   *
   * <code>string operation = 2;</code>
   *
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString getOperationBytes();

  /**
   *
   *
   * <pre>
   * Extra information to store with the lock, provided by the caller.
   * </pre>
   *
   * <code>string info = 3;</code>
   *
   * @return The info.
   */
  java.lang.String getInfo();
  /**
   *
   *
   * <pre>
   * Extra information to store with the lock, provided by the caller.
   * </pre>
   *
   * <code>string info = 3;</code>
   *
   * @return The bytes for info.
   */
  com.google.protobuf.ByteString getInfoBytes();

  /**
   *
   *
   * <pre>
   * user&#64;hostname when available
   * </pre>
   *
   * <code>string who = 4;</code>
   *
   * @return The who.
   */
  java.lang.String getWho();
  /**
   *
   *
   * <pre>
   * user&#64;hostname when available
   * </pre>
   *
   * <code>string who = 4;</code>
   *
   * @return The bytes for who.
   */
  com.google.protobuf.ByteString getWhoBytes();

  /**
   *
   *
   * <pre>
   * Terraform version
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Terraform version
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Time that the lock was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Time that the lock was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Time that the lock was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
