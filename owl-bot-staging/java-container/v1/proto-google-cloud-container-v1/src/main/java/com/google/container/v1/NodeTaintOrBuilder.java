// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodeTaintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeTaint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Key for taint.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value for taint.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1.NodeTaint.Effect effect = 3;</code>
   * @return The enum numeric value on the wire for effect.
   */
  int getEffectValue();
  /**
   * <pre>
   * Effect for taint.
   * </pre>
   *
   * <code>.google.container.v1.NodeTaint.Effect effect = 3;</code>
   * @return The effect.
   */
  com.google.container.v1.NodeTaint.Effect getEffect();
}
