/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/security/privateca/v1beta1/resources.proto

package com.google.cloud.security.privateca.v1beta1;

public interface CertificateAuthorityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1beta1.CertificateAuthority)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] in the
   * format `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] in the
   * format `projects/&#42;&#47;locations/&#42;&#47;certificateAuthorities/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The [Type][google.cloud.security.privateca.v1beta1.CertificateAuthority.Type] of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.Type type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The [Type][google.cloud.security.privateca.v1beta1.CertificateAuthority.Type] of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.Type type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.Type getType();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The [Tier][google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier] of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier tier = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The [Tier][google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier] of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier tier = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The tier.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.Tier getTier();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The config used to create a self-signed X.509 certificate or CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The config used to create a self-signed X.509 certificate or CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The config used to create a self-signed X.509 certificate or CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateConfig config = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The desired lifetime of the CA certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the lifetime field is set.
   */
  boolean hasLifetime();
  /**
   *
   *
   * <pre>
   * Required. The desired lifetime of the CA certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The lifetime.
   */
  com.google.protobuf.Duration getLifetime();
  /**
   *
   *
   * <pre>
   * Required. The desired lifetime of the CA certificate. Used to create the
   * "not_before_time" and "not_after_time" fields inside an X.509
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.DurationOrBuilder getLifetimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Used when issuing certificates for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]. If this
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] is a self-signed CertificateAuthority, this key
   * is also used to sign the self-signed CA certificate. Otherwise, it
   * is used to sign a CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.KeyVersionSpec key_spec = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the keySpec field is set.
   */
  boolean hasKeySpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Used when issuing certificates for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]. If this
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] is a self-signed CertificateAuthority, this key
   * is also used to sign the self-signed CA certificate. Otherwise, it
   * is used to sign a CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.KeyVersionSpec key_spec = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The keySpec.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.KeyVersionSpec getKeySpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Used when issuing certificates for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]. If this
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] is a self-signed CertificateAuthority, this key
   * is also used to sign the self-signed CA certificate. Otherwise, it
   * is used to sign a CSR.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.KeyVersionSpec key_spec = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.KeyVersionSpecOrBuilder
      getKeySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The [CertificateAuthorityPolicy][google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy] to enforce when issuing
   * [Certificates][google.cloud.security.privateca.v1beta1.Certificate] from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy certificate_policy = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the certificatePolicy field is set.
   */
  boolean hasCertificatePolicy();
  /**
   *
   *
   * <pre>
   * Optional. The [CertificateAuthorityPolicy][google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy] to enforce when issuing
   * [Certificates][google.cloud.security.privateca.v1beta1.Certificate] from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy certificate_policy = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The certificatePolicy.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy
      getCertificatePolicy();
  /**
   *
   *
   * <pre>
   * Optional. The [CertificateAuthorityPolicy][google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy] to enforce when issuing
   * [Certificates][google.cloud.security.privateca.v1beta1.Certificate] from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.CertificateAuthorityPolicy certificate_policy = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority
          .CertificateAuthorityPolicyOrBuilder
      getCertificatePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The [IssuingOptions][google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions] to follow when issuing [Certificates][google.cloud.security.privateca.v1beta1.Certificate]
   * from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions issuing_options = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the issuingOptions field is set.
   */
  boolean hasIssuingOptions();
  /**
   *
   *
   * <pre>
   * Optional. The [IssuingOptions][google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions] to follow when issuing [Certificates][google.cloud.security.privateca.v1beta1.Certificate]
   * from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions issuing_options = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The issuingOptions.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions
      getIssuingOptions();
  /**
   *
   *
   * <pre>
   * Optional. The [IssuingOptions][google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions] to follow when issuing [Certificates][google.cloud.security.privateca.v1beta1.Certificate]
   * from this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptions issuing_options = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.IssuingOptionsOrBuilder
      getIssuingOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If this is a subordinate [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority], this field will be set
   * with the subordinate configuration, which describes its issuers. This may
   * be updated, but this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] must continue to validate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.SubordinateConfig subordinate_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the subordinateConfig field is set.
   */
  boolean hasSubordinateConfig();
  /**
   *
   *
   * <pre>
   * Optional. If this is a subordinate [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority], this field will be set
   * with the subordinate configuration, which describes its issuers. This may
   * be updated, but this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] must continue to validate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.SubordinateConfig subordinate_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The subordinateConfig.
   */
  com.google.cloud.security.privateca.v1beta1.SubordinateConfig getSubordinateConfig();
  /**
   *
   *
   * <pre>
   * Optional. If this is a subordinate [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority], this field will be set
   * with the subordinate configuration, which describes its issuers. This may
   * be updated, but this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] must continue to validate.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.SubordinateConfig subordinate_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.SubordinateConfigOrBuilder
      getSubordinateConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The [State][google.cloud.security.privateca.v1beta1.CertificateAuthority.State] for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The [State][google.cloud.security.privateca.v1beta1.CertificateAuthority.State] for this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority].
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.State getState();

  /**
   *
   *
   * <pre>
   * Output only. This [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate chain, including the current
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate. Ordered such that the root issuer
   * is the final element (consistent with RFC 5246). For a self-signed CA, this
   * will only list the current [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate.
   * </pre>
   *
   * <code>repeated string pem_ca_certificates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the pemCaCertificates.
   */
  java.util.List<java.lang.String> getPemCaCertificatesList();
  /**
   *
   *
   * <pre>
   * Output only. This [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate chain, including the current
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate. Ordered such that the root issuer
   * is the final element (consistent with RFC 5246). For a self-signed CA, this
   * will only list the current [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate.
   * </pre>
   *
   * <code>repeated string pem_ca_certificates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of pemCaCertificates.
   */
  int getPemCaCertificatesCount();
  /**
   *
   *
   * <pre>
   * Output only. This [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate chain, including the current
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate. Ordered such that the root issuer
   * is the final element (consistent with RFC 5246). For a self-signed CA, this
   * will only list the current [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate.
   * </pre>
   *
   * <code>repeated string pem_ca_certificates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The pemCaCertificates at the given index.
   */
  java.lang.String getPemCaCertificates(int index);
  /**
   *
   *
   * <pre>
   * Output only. This [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate chain, including the current
   * [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate. Ordered such that the root issuer
   * is the final element (consistent with RFC 5246). For a self-signed CA, this
   * will only list the current [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s certificate.
   * </pre>
   *
   * <code>repeated string pem_ca_certificates = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pemCaCertificates at the given index.
   */
  com.google.protobuf.ByteString getPemCaCertificatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. A structured description of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s CA certificate
   * and its issuers. Ordered as self-to-root.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateDescription ca_certificate_descriptions = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.security.privateca.v1beta1.CertificateDescription>
      getCaCertificateDescriptionsList();
  /**
   *
   *
   * <pre>
   * Output only. A structured description of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s CA certificate
   * and its issuers. Ordered as self-to-root.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateDescription ca_certificate_descriptions = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateDescription getCaCertificateDescriptions(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. A structured description of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s CA certificate
   * and its issuers. Ordered as self-to-root.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateDescription ca_certificate_descriptions = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCaCertificateDescriptionsCount();
  /**
   *
   *
   * <pre>
   * Output only. A structured description of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s CA certificate
   * and its issuers. Ordered as self-to-root.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateDescription ca_certificate_descriptions = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.security.privateca.v1beta1.CertificateDescriptionOrBuilder>
      getCaCertificateDescriptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A structured description of this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority]'s CA certificate
   * and its issuers. Ordered as self-to-root.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.security.privateca.v1beta1.CertificateDescription ca_certificate_descriptions = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateDescriptionOrBuilder
      getCaCertificateDescriptionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Immutable. The name of a Cloud Storage bucket where this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] will
   * publish content, such as the CA certificate and CRLs. This must be a bucket
   * name, without any prefixes (such as `gs://`) or suffixes (such as
   * `.googleapis.com`). For example, to use a bucket named `my-bucket`, you
   * would simply specify `my-bucket`. If not specified, a managed bucket will
   * be created.
   * </pre>
   *
   * <code>string gcs_bucket = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The gcsBucket.
   */
  java.lang.String getGcsBucket();
  /**
   *
   *
   * <pre>
   * Immutable. The name of a Cloud Storage bucket where this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] will
   * publish content, such as the CA certificate and CRLs. This must be a bucket
   * name, without any prefixes (such as `gs://`) or suffixes (such as
   * `.googleapis.com`). For example, to use a bucket named `my-bucket`, you
   * would simply specify `my-bucket`. If not specified, a managed bucket will
   * be created.
   * </pre>
   *
   * <code>string gcs_bucket = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for gcsBucket.
   */
  com.google.protobuf.ByteString getGcsBucketBytes();

  /**
   *
   *
   * <pre>
   * Output only. URLs for accessing content published by this CA, such as the CA certificate
   * and CRLs.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.AccessUrls access_urls = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the accessUrls field is set.
   */
  boolean hasAccessUrls();
  /**
   *
   *
   * <pre>
   * Output only. URLs for accessing content published by this CA, such as the CA certificate
   * and CRLs.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.AccessUrls access_urls = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The accessUrls.
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.AccessUrls getAccessUrls();
  /**
   *
   *
   * <pre>
   * Output only. URLs for accessing content published by this CA, such as the CA certificate
   * and CRLs.
   * </pre>
   *
   * <code>
   * .google.cloud.security.privateca.v1beta1.CertificateAuthority.AccessUrls access_urls = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.security.privateca.v1beta1.CertificateAuthority.AccessUrlsOrBuilder
      getAccessUrlsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] will be deleted, if
   * scheduled for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] will be deleted, if
   * scheduled for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [CertificateAuthority][google.cloud.security.privateca.v1beta1.CertificateAuthority] will be deleted, if
   * scheduled for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Labels with user-defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
