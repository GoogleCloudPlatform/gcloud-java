// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface GetDataRedactionSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.GetDataRedactionSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the settings to lookup.
   * Format:
   * properties/{property}/dataStreams/{data_stream}/dataRedactionSettings
   * Example: "properties/1000/dataStreams/2000/dataRedactionSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the settings to lookup.
   * Format:
   * properties/{property}/dataStreams/{data_stream}/dataRedactionSettings
   * Example: "properties/1000/dataStreams/2000/dataRedactionSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
