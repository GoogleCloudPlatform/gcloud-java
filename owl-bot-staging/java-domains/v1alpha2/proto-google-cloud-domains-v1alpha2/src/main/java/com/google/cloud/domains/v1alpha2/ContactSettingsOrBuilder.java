// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1alpha2/domains.proto

package com.google.cloud.domains.v1alpha2;

public interface ContactSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1alpha2.ContactSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Privacy setting for the contacts associated with the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactPrivacy privacy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for privacy.
   */
  int getPrivacyValue();
  /**
   * <pre>
   * Required. Privacy setting for the contacts associated with the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactPrivacy privacy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The privacy.
   */
  com.google.cloud.domains.v1alpha2.ContactPrivacy getPrivacy();

  /**
   * <pre>
   * Required. The registrant contact for the `Registration`.
   *
   * *Caution: Anyone with access to this email address, phone number,
   * and/or postal address can take control of the domain.*
   *
   * *Warning: For new `Registration`s, the registrant receives an email
   * confirmation that they must complete within 15 days to avoid domain
   * suspension.*
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact registrant_contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the registrantContact field is set.
   */
  boolean hasRegistrantContact();
  /**
   * <pre>
   * Required. The registrant contact for the `Registration`.
   *
   * *Caution: Anyone with access to this email address, phone number,
   * and/or postal address can take control of the domain.*
   *
   * *Warning: For new `Registration`s, the registrant receives an email
   * confirmation that they must complete within 15 days to avoid domain
   * suspension.*
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact registrant_contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The registrantContact.
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.Contact getRegistrantContact();
  /**
   * <pre>
   * Required. The registrant contact for the `Registration`.
   *
   * *Caution: Anyone with access to this email address, phone number,
   * and/or postal address can take control of the domain.*
   *
   * *Warning: For new `Registration`s, the registrant receives an email
   * confirmation that they must complete within 15 days to avoid domain
   * suspension.*
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact registrant_contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.ContactOrBuilder getRegistrantContactOrBuilder();

  /**
   * <pre>
   * Required. The administrative contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact admin_contact = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the adminContact field is set.
   */
  boolean hasAdminContact();
  /**
   * <pre>
   * Required. The administrative contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact admin_contact = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adminContact.
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.Contact getAdminContact();
  /**
   * <pre>
   * Required. The administrative contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact admin_contact = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.ContactOrBuilder getAdminContactOrBuilder();

  /**
   * <pre>
   * Required. The technical contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact technical_contact = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the technicalContact field is set.
   */
  boolean hasTechnicalContact();
  /**
   * <pre>
   * Required. The technical contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact technical_contact = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The technicalContact.
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.Contact getTechnicalContact();
  /**
   * <pre>
   * Required. The technical contact for the `Registration`.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings.Contact technical_contact = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.domains.v1alpha2.ContactSettings.ContactOrBuilder getTechnicalContactOrBuilder();
}
