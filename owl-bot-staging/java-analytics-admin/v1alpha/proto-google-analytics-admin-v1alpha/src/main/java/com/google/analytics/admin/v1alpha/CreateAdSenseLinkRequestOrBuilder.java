// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreateAdSenseLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The property for which to create an AdSense Link.
   * Format: properties/{propertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The property for which to create an AdSense Link.
   * Format: properties/{propertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the adsenseLink field is set.
   */
  boolean hasAdsenseLink();
  /**
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adsenseLink.
   */
  com.google.analytics.admin.v1alpha.AdSenseLink getAdsenseLink();
  /**
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder getAdsenseLinkOrBuilder();
}
