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
// source: google/cloud/redis/cluster/v1beta1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.redis.cluster.v1beta1;

public interface EncryptionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1beta1.EncryptionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.EncryptionInfo.Type encryption_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for encryptionType.
   */
  int getEncryptionTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.EncryptionInfo.Type encryption_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionType.
   */
  com.google.cloud.redis.cluster.v1beta1.EncryptionInfo.Type getEncryptionType();

  /**
   *
   *
   * <pre>
   * Output only. KMS key versions that are being used to protect the data
   * at-rest.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the kmsKeyVersions.
   */
  java.util.List<java.lang.String> getKmsKeyVersionsList();
  /**
   *
   *
   * <pre>
   * Output only. KMS key versions that are being used to protect the data
   * at-rest.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of kmsKeyVersions.
   */
  int getKmsKeyVersionsCount();
  /**
   *
   *
   * <pre>
   * Output only. KMS key versions that are being used to protect the data
   * at-rest.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The kmsKeyVersions at the given index.
   */
  java.lang.String getKmsKeyVersions(int index);
  /**
   *
   *
   * <pre>
   * Output only. KMS key versions that are being used to protect the data
   * at-rest.
   * </pre>
   *
   * <code>
   * repeated string kms_key_versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kmsKeyVersions at the given index.
   */
  com.google.protobuf.ByteString getKmsKeyVersionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The state of the primary version of the KMS key perceived by
   * the system. This field is not populated in backups.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.EncryptionInfo.KmsKeyState kms_key_primary_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for kmsKeyPrimaryState.
   */
  int getKmsKeyPrimaryStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the primary version of the KMS key perceived by
   * the system. This field is not populated in backups.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1beta1.EncryptionInfo.KmsKeyState kms_key_primary_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The kmsKeyPrimaryState.
   */
  com.google.cloud.redis.cluster.v1beta1.EncryptionInfo.KmsKeyState getKmsKeyPrimaryState();

  /**
   *
   *
   * <pre>
   * Output only. The most recent time when the encryption info was updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time when the encryption info was updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastUpdateTime.
   */
  com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time when the encryption info was updated.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();
}
