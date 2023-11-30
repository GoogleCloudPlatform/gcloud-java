// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface SettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The preference set used by default for a project.
   * </pre>
   *
   * <code>string preference_set = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The preferenceSet.
   */
  java.lang.String getPreferenceSet();
  /**
   * <pre>
   * The preference set used by default for a project.
   * </pre>
   *
   * <code>string preference_set = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for preferenceSet.
   */
  com.google.protobuf.ByteString
      getPreferenceSetBytes();
}
