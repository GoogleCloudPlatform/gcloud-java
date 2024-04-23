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
// source: google/cloud/iot/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iot.v1;

public interface X509CertificateDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.X509CertificateDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The entity that signed the certificate.
   * </pre>
   *
   * <code>string issuer = 1;</code>
   *
   * @return The issuer.
   */
  java.lang.String getIssuer();
  /**
   *
   *
   * <pre>
   * The entity that signed the certificate.
   * </pre>
   *
   * <code>string issuer = 1;</code>
   *
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString getIssuerBytes();

  /**
   *
   *
   * <pre>
   * The entity the certificate and public key belong to.
   * </pre>
   *
   * <code>string subject = 2;</code>
   *
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   *
   *
   * <pre>
   * The entity the certificate and public key belong to.
   * </pre>
   *
   * <code>string subject = 2;</code>
   *
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString getSubjectBytes();

  /**
   *
   *
   * <pre>
   * The time the certificate becomes valid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time the certificate becomes valid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time the certificate becomes valid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the certificate becomes invalid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 4;</code>
   *
   * @return Whether the expiryTime field is set.
   */
  boolean hasExpiryTime();
  /**
   *
   *
   * <pre>
   * The time the certificate becomes invalid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 4;</code>
   *
   * @return The expiryTime.
   */
  com.google.protobuf.Timestamp getExpiryTime();
  /**
   *
   *
   * <pre>
   * The time the certificate becomes invalid.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiry_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiryTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The algorithm used to sign the certificate.
   * </pre>
   *
   * <code>string signature_algorithm = 5;</code>
   *
   * @return The signatureAlgorithm.
   */
  java.lang.String getSignatureAlgorithm();
  /**
   *
   *
   * <pre>
   * The algorithm used to sign the certificate.
   * </pre>
   *
   * <code>string signature_algorithm = 5;</code>
   *
   * @return The bytes for signatureAlgorithm.
   */
  com.google.protobuf.ByteString getSignatureAlgorithmBytes();

  /**
   *
   *
   * <pre>
   * The type of public key in the certificate.
   * </pre>
   *
   * <code>string public_key_type = 6;</code>
   *
   * @return The publicKeyType.
   */
  java.lang.String getPublicKeyType();
  /**
   *
   *
   * <pre>
   * The type of public key in the certificate.
   * </pre>
   *
   * <code>string public_key_type = 6;</code>
   *
   * @return The bytes for publicKeyType.
   */
  com.google.protobuf.ByteString getPublicKeyTypeBytes();
}
