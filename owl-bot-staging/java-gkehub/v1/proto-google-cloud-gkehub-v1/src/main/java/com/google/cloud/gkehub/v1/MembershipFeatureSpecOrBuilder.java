// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/feature.proto

package com.google.cloud.gkehub.v1;

public interface MembershipFeatureSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.MembershipFeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   * @return Whether the configmanagement field is set.
   */
  boolean hasConfigmanagement();
  /**
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   * @return The configmanagement.
   */
  com.google.cloud.gkehub.configmanagement.v1.MembershipSpec getConfigmanagement();
  /**
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipSpec configmanagement = 106;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.MembershipSpecOrBuilder getConfigmanagementOrBuilder();

  com.google.cloud.gkehub.v1.MembershipFeatureSpec.FeatureSpecCase getFeatureSpecCase();
}
