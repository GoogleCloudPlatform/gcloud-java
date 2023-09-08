// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

public interface ConnectAgentResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha2.ConnectAgentResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   * @return The type.
   */
  com.google.cloud.gkehub.v1alpha2.TypeMeta getType();
  /**
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   */
  com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   * @return The manifest.
   */
  java.lang.String getManifest();
  /**
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   * @return The bytes for manifest.
   */
  com.google.protobuf.ByteString
      getManifestBytes();
}
