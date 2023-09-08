// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface LoggingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.LoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   * @return Whether the componentConfig field is set.
   */
  boolean hasComponentConfig();
  /**
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   * @return The componentConfig.
   */
  com.google.cloud.gkemulticloud.v1.LoggingComponentConfig getComponentConfig();
  /**
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder getComponentConfigOrBuilder();
}
