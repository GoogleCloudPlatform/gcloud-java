// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RoutersScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RoutersScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of routers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Router routers = 311906890;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Router> 
      getRoutersList();
  /**
   * <pre>
   * A list of routers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Router routers = 311906890;</code>
   */
  com.google.cloud.compute.v1.Router getRouters(int index);
  /**
   * <pre>
   * A list of routers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Router routers = 311906890;</code>
   */
  int getRoutersCount();
  /**
   * <pre>
   * A list of routers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Router routers = 311906890;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterOrBuilder> 
      getRoutersOrBuilderList();
  /**
   * <pre>
   * A list of routers contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Router routers = 311906890;</code>
   */
  com.google.cloud.compute.v1.RouterOrBuilder getRoutersOrBuilder(
      int index);

  /**
   * <pre>
   * Informational warning which replaces the list of routers when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of routers when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of routers when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
