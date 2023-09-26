// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface MigrateKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.MigrateKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the key to be migrated, in the format
   * "projects/{project}/keys/{key}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the key to be migrated, in the format
   * "projects/{project}/keys/{key}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. If true, skips the billing check.
   * A reCAPTCHA Enterprise key or migrated key behaves differently than a
   * reCAPTCHA (non-Enterprise version) key when you reach a quota limit (see
   * https://cloud.google.com/recaptcha-enterprise/quotas#quota_limit). To avoid
   * any disruption of your usage, we check that a billing account is present.
   * If your usage of reCAPTCHA is under the free quota, you can safely skip the
   * billing check and proceed with the migration. See
   * https://cloud.google.com/recaptcha-enterprise/docs/billing-information.
   * </pre>
   *
   * <code>bool skip_billing_check = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The skipBillingCheck.
   */
  boolean getSkipBillingCheck();
}
