/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface PublicAdvertisedPrefixOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PublicAdvertisedPrefix)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return Whether the byoipApiVersion field is set.
   */
  boolean hasByoipApiVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return The byoipApiVersion.
   */
  java.lang.String getByoipApiVersion();
  /**
   *
   *
   * <pre>
   * [Output Only] The version of BYOIP API.
   * Check the ByoipApiVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string byoip_api_version = 162683283;</code>
   *
   * @return The bytes for byoipApiVersion.
   */
  com.google.protobuf.ByteString getByoipApiVersionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The address to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string dns_verification_ip = 241011381;</code>
   *
   * @return Whether the dnsVerificationIp field is set.
   */
  boolean hasDnsVerificationIp();
  /**
   *
   *
   * <pre>
   * The address to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string dns_verification_ip = 241011381;</code>
   *
   * @return The dnsVerificationIp.
   */
  java.lang.String getDnsVerificationIp();
  /**
   *
   *
   * <pre>
   * The address to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string dns_verification_ip = 241011381;</code>
   *
   * @return The bytes for dnsVerificationIp.
   */
  com.google.protobuf.ByteString getDnsVerificationIpBytes();

  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource type. The server generates this identifier.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * The address range, in CIDR format, represented by this public advertised prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();
  /**
   *
   *
   * <pre>
   * The address range, in CIDR format, represented by this public advertised prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The address range, in CIDR format, represented by this public advertised prefix.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies how child public delegated prefix will be scoped. It could be one of following values: - `REGIONAL`: The public delegated prefix is regional only. The provisioning will take a few minutes. - `GLOBAL`: The public delegated prefix is global only. The provisioning will take ~4 weeks. - `GLOBAL_AND_REGIONAL` [output only]: The public delegated prefixes is BYOIP V1 legacy prefix. This is output only value and no longer supported in BYOIP V2.
   * Check the PdpScope enum for the list of possible values.
   * </pre>
   *
   * <code>optional string pdp_scope = 524264785;</code>
   *
   * @return Whether the pdpScope field is set.
   */
  boolean hasPdpScope();
  /**
   *
   *
   * <pre>
   * Specifies how child public delegated prefix will be scoped. It could be one of following values: - `REGIONAL`: The public delegated prefix is regional only. The provisioning will take a few minutes. - `GLOBAL`: The public delegated prefix is global only. The provisioning will take ~4 weeks. - `GLOBAL_AND_REGIONAL` [output only]: The public delegated prefixes is BYOIP V1 legacy prefix. This is output only value and no longer supported in BYOIP V2.
   * Check the PdpScope enum for the list of possible values.
   * </pre>
   *
   * <code>optional string pdp_scope = 524264785;</code>
   *
   * @return The pdpScope.
   */
  java.lang.String getPdpScope();
  /**
   *
   *
   * <pre>
   * Specifies how child public delegated prefix will be scoped. It could be one of following values: - `REGIONAL`: The public delegated prefix is regional only. The provisioning will take a few minutes. - `GLOBAL`: The public delegated prefix is global only. The provisioning will take ~4 weeks. - `GLOBAL_AND_REGIONAL` [output only]: The public delegated prefixes is BYOIP V1 legacy prefix. This is output only value and no longer supported in BYOIP V2.
   * Check the PdpScope enum for the list of possible values.
   * </pre>
   *
   * <code>optional string pdp_scope = 524264785;</code>
   *
   * @return The bytes for pdpScope.
   */
  com.google.protobuf.ByteString getPdpScopeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The list of public delegated prefixes that exist for this public advertised prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix public_delegated_prefixs = 425811723;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix>
      getPublicDelegatedPrefixsList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of public delegated prefixes that exist for this public advertised prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix public_delegated_prefixs = 425811723;
   * </code>
   */
  com.google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix getPublicDelegatedPrefixs(
      int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The list of public delegated prefixes that exist for this public advertised prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix public_delegated_prefixs = 425811723;
   * </code>
   */
  int getPublicDelegatedPrefixsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of public delegated prefixes that exist for this public advertised prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix public_delegated_prefixs = 425811723;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefixOrBuilder>
      getPublicDelegatedPrefixsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of public delegated prefixes that exist for this public advertised prefix.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefix public_delegated_prefixs = 425811723;
   * </code>
   */
  com.google.cloud.compute.v1.PublicAdvertisedPrefixPublicDelegatedPrefixOrBuilder
      getPublicDelegatedPrefixsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return Whether the sharedSecret field is set.
   */
  boolean hasSharedSecret();
  /**
   *
   *
   * <pre>
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return The sharedSecret.
   */
  java.lang.String getSharedSecret();
  /**
   *
   *
   * <pre>
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * </pre>
   *
   * <code>optional string shared_secret = 381932490;</code>
   *
   * @return The bytes for sharedSecret.
   */
  com.google.protobuf.ByteString getSharedSecretBytes();

  /**
   *
   *
   * <pre>
   * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
