// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface ConfigureManagementSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.ConfigureManagementSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `Registration` whose management settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The registration.
   */
  java.lang.String getRegistration();
  /**
   * <pre>
   * Required. The name of the `Registration` whose management settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for registration.
   */
  com.google.protobuf.ByteString
      getRegistrationBytes();

  /**
   * <pre>
   * Fields of the `ManagementSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.ManagementSettings management_settings = 2;</code>
   * @return Whether the managementSettings field is set.
   */
  boolean hasManagementSettings();
  /**
   * <pre>
   * Fields of the `ManagementSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.ManagementSettings management_settings = 2;</code>
   * @return The managementSettings.
   */
  com.google.cloud.domains.v1beta1.ManagementSettings getManagementSettings();
  /**
   * <pre>
   * Fields of the `ManagementSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.ManagementSettings management_settings = 2;</code>
   */
  com.google.cloud.domains.v1beta1.ManagementSettingsOrBuilder getManagementSettingsOrBuilder();

  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the transfer lock is being updated, the `update_mask`
   * is `"transfer_lock_state"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the transfer lock is being updated, the `update_mask`
   * is `"transfer_lock_state"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the transfer lock is being updated, the `update_mask`
   * is `"transfer_lock_state"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
