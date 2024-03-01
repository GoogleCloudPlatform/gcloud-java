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
// source: google/cloud/functions/v1/functions.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.functions.v1;

public interface GenerateUploadUrlRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.GenerateUploadUrlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project and location in which the Google Cloud Storage signed URL
   * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The project and location in which the Google Cloud Storage signed URL
   * should be generated, specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function source code objects in intermediate Cloud Storage
   * buckets. When you generate an upload url and upload your source code, it
   * gets copied to an intermediate Cloud Storage bucket. The source code is
   * then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * The Google Cloud Functions service account
   * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
   * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will
   * delegate access to the Google Storage service account in the internal
   * project.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt function source code objects in intermediate Cloud Storage
   * buckets. When you generate an upload url and upload your source code, it
   * gets copied to an intermediate Cloud Storage bucket. The source code is
   * then copied to a versioned directory in the sources bucket in the consumer
   * project during the function deployment.
   *
   * It must match the pattern
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   *
   * The Google Cloud Functions service account
   * (service-{project_number}&#64;gcf-admin-robot.iam.gserviceaccount.com) must be
   * granted the role 'Cloud KMS CryptoKey Encrypter/Decrypter
   * (roles/cloudkms.cryptoKeyEncrypterDecrypter)' on the
   * Key/KeyRing/Project/Organization (least access preferred). GCF will
   * delegate access to the Google Storage service account in the internal
   * project.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}
