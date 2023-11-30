// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface GetAssetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GetAssetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * View of the assets. Defaults to BASIC.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.AssetView view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * View of the assets. Defaults to BASIC.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.AssetView view = 2;</code>
   * @return The view.
   */
  com.google.cloud.migrationcenter.v1.AssetView getView();
}
