// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/common.proto

package com.google.cloud.gaming.v1;

public interface TargetStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.TargetState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1.TargetDetails> 
      getDetailsList();
  /**
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  com.google.cloud.gaming.v1.TargetDetails getDetails(int index);
  /**
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1.TargetDetailsOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <pre>
   * Details about Agones fleets.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1.TargetDetails details = 1;</code>
   */
  com.google.cloud.gaming.v1.TargetDetailsOrBuilder getDetailsOrBuilder(
      int index);
}
