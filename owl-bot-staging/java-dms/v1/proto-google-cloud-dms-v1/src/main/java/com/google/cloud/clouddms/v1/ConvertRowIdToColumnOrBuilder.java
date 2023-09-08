// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface ConvertRowIdToColumnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ConvertRowIdToColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Only work on tables without primary key defined
   * </pre>
   *
   * <code>bool only_if_no_primary_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The onlyIfNoPrimaryKey.
   */
  boolean getOnlyIfNoPrimaryKey();
}
