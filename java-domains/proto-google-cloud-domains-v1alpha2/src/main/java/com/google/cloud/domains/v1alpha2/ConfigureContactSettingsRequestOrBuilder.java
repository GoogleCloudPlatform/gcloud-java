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
// source: google/cloud/domains/v1alpha2/domains.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.domains.v1alpha2;

public interface ConfigureContactSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1alpha2.ConfigureContactSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the `Registration` whose contact settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>
   * string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The registration.
   */
  java.lang.String getRegistration();
  /**
   *
   *
   * <pre>
   * Required. The name of the `Registration` whose contact settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>
   * string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for registration.
   */
  com.google.protobuf.ByteString getRegistrationBytes();

  /**
   *
   *
   * <pre>
   * Fields of the `ContactSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings contact_settings = 2;</code>
   *
   * @return Whether the contactSettings field is set.
   */
  boolean hasContactSettings();
  /**
   *
   *
   * <pre>
   * Fields of the `ContactSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings contact_settings = 2;</code>
   *
   * @return The contactSettings.
   */
  com.google.cloud.domains.v1alpha2.ContactSettings getContactSettings();
  /**
   *
   *
   * <pre>
   * Fields of the `ContactSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.ContactSettings contact_settings = 2;</code>
   */
  com.google.cloud.domains.v1alpha2.ContactSettingsOrBuilder getContactSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the registrant contact is being updated, the
   * `update_mask` is `"registrant_contact"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the registrant contact is being updated, the
   * `update_mask` is `"registrant_contact"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the registrant contact is being updated, the
   * `update_mask` is `"registrant_contact"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in `contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.ContactNotice contact_notices = 4;</code>
   *
   * @return A list containing the contactNotices.
   */
  java.util.List<com.google.cloud.domains.v1alpha2.ContactNotice> getContactNoticesList();
  /**
   *
   *
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in `contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.ContactNotice contact_notices = 4;</code>
   *
   * @return The count of contactNotices.
   */
  int getContactNoticesCount();
  /**
   *
   *
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in `contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.ContactNotice contact_notices = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The contactNotices at the given index.
   */
  com.google.cloud.domains.v1alpha2.ContactNotice getContactNotices(int index);
  /**
   *
   *
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in `contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.ContactNotice contact_notices = 4;</code>
   *
   * @return A list containing the enum numeric values on the wire for contactNotices.
   */
  java.util.List<java.lang.Integer> getContactNoticesValueList();
  /**
   *
   *
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in `contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1alpha2.ContactNotice contact_notices = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of contactNotices at the given index.
   */
  int getContactNoticesValue(int index);

  /**
   *
   *
   * <pre>
   * Validate the request without actually updating the contact settings.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
