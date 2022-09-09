// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

public interface ImportConsumerOverridesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ImportConsumerOverridesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the consumer.
   * An example name would be:
   * `projects/123/services/compute.googleapis.com`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The resource name of the consumer.
   * An example name would be:
   * `projects/123/services/compute.googleapis.com`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The import data is specified in the request message itself
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.OverrideInlineSource inline_source = 2;</code>
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   * <pre>
   * The import data is specified in the request message itself
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.OverrideInlineSource inline_source = 2;</code>
   * @return The inlineSource.
   */
  com.google.api.serviceusage.v1beta1.OverrideInlineSource getInlineSource();
  /**
   * <pre>
   * The import data is specified in the request message itself
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.OverrideInlineSource inline_source = 2;</code>
   */
  com.google.api.serviceusage.v1beta1.OverrideInlineSourceOrBuilder getInlineSourceOrBuilder();

  /**
   * <pre>
   * Whether to force the creation of the quota overrides.
   * Setting the force parameter to 'true' ignores all quota safety checks that
   * would fail the request. QuotaSafetyCheck lists all such validations.
   * </pre>
   *
   * <code>bool force = 3;</code>
   * @return The force.
   */
  boolean getForce();

  /**
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 4;</code>
   * @return A list containing the forceOnly.
   */
  java.util.List<com.google.api.serviceusage.v1beta1.QuotaSafetyCheck> getForceOnlyList();
  /**
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 4;</code>
   * @return The count of forceOnly.
   */
  int getForceOnlyCount();
  /**
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 4;</code>
   * @param index The index of the element to return.
   * @return The forceOnly at the given index.
   */
  com.google.api.serviceusage.v1beta1.QuotaSafetyCheck getForceOnly(int index);
  /**
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 4;</code>
   * @return A list containing the enum numeric values on the wire for forceOnly.
   */
  java.util.List<java.lang.Integer>
  getForceOnlyValueList();
  /**
   * <pre>
   * The list of quota safety checks to ignore before the override mutation.
   * Unlike 'force' field that ignores all the quota safety checks, the
   * 'force_only' field ignores only the specified checks; other checks are
   * still enforced. The 'force' and 'force_only' fields cannot both be set.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaSafetyCheck force_only = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of forceOnly at the given index.
   */
  int getForceOnlyValue(int index);

  public com.google.api.serviceusage.v1beta1.ImportConsumerOverridesRequest.SourceCase getSourceCase();
}
