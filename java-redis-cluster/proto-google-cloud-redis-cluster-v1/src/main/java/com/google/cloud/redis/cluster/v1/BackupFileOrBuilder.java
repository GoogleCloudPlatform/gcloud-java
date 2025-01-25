/*
 * Copyright 2025 Google LLC
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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1;

public interface BackupFileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.BackupFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. e.g: &lt;shard-id&gt;.rdb
   * </pre>
   *
   * <code>string file_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   *
   *
   * <pre>
   * Output only. e.g: &lt;shard-id&gt;.rdb
   * </pre>
   *
   * <code>string file_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Size of the backup file in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup file was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup file was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup file was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
