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
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface RegisterParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.RegisterParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The domain name. Unicode domain names are expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1;</code>
   *
   * @return The domainName.
   */
  java.lang.String getDomainName();
  /**
   *
   *
   * <pre>
   * The domain name. Unicode domain names are expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1;</code>
   *
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString getDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether the domain is available for registration. This value is
   * accurate when obtained by calling `RetrieveRegisterParameters`, but is
   * approximate when obtained by calling `SearchDomains`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.RegisterParameters.Availability availability = 2;</code>
   *
   * @return The enum numeric value on the wire for availability.
   */
  int getAvailabilityValue();
  /**
   *
   *
   * <pre>
   * Indicates whether the domain is available for registration. This value is
   * accurate when obtained by calling `RetrieveRegisterParameters`, but is
   * approximate when obtained by calling `SearchDomains`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.RegisterParameters.Availability availability = 2;</code>
   *
   * @return The availability.
   */
  com.google.cloud.domains.v1beta1.RegisterParameters.Availability getAvailability();

  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 3;</code>
   *
   * @return A list containing the supportedPrivacy.
   */
  java.util.List<com.google.cloud.domains.v1beta1.ContactPrivacy> getSupportedPrivacyList();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 3;</code>
   *
   * @return The count of supportedPrivacy.
   */
  int getSupportedPrivacyCount();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedPrivacy at the given index.
   */
  com.google.cloud.domains.v1beta1.ContactPrivacy getSupportedPrivacy(int index);
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 3;</code>
   *
   * @return A list containing the enum numeric values on the wire for supportedPrivacy.
   */
  java.util.List<java.lang.Integer> getSupportedPrivacyValueList();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedPrivacy at the given index.
   */
  int getSupportedPrivacyValue(int index);

  /**
   *
   *
   * <pre>
   * Notices about special properties of the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 4;</code>
   *
   * @return A list containing the domainNotices.
   */
  java.util.List<com.google.cloud.domains.v1beta1.DomainNotice> getDomainNoticesList();
  /**
   *
   *
   * <pre>
   * Notices about special properties of the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 4;</code>
   *
   * @return The count of domainNotices.
   */
  int getDomainNoticesCount();
  /**
   *
   *
   * <pre>
   * Notices about special properties of the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The domainNotices at the given index.
   */
  com.google.cloud.domains.v1beta1.DomainNotice getDomainNotices(int index);
  /**
   *
   *
   * <pre>
   * Notices about special properties of the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 4;</code>
   *
   * @return A list containing the enum numeric values on the wire for domainNotices.
   */
  java.util.List<java.lang.Integer> getDomainNoticesValueList();
  /**
   *
   *
   * <pre>
   * Notices about special properties of the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of domainNotices at the given index.
   */
  int getDomainNoticesValue(int index);

  /**
   *
   *
   * <pre>
   * Price to register or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5;</code>
   *
   * @return Whether the yearlyPrice field is set.
   */
  boolean hasYearlyPrice();
  /**
   *
   *
   * <pre>
   * Price to register or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5;</code>
   *
   * @return The yearlyPrice.
   */
  com.google.type.Money getYearlyPrice();
  /**
   *
   *
   * <pre>
   * Price to register or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5;</code>
   */
  com.google.type.MoneyOrBuilder getYearlyPriceOrBuilder();
}
