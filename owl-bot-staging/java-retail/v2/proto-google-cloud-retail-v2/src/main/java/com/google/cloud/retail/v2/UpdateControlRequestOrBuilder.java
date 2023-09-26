// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/control_service.proto

package com.google.cloud.retail.v2;

public interface UpdateControlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.UpdateControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Control control = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the control field is set.
   */
  boolean hasControl();
  /**
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Control control = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The control.
   */
  com.google.cloud.retail.v2.Control getControl();
  /**
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Control control = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.ControlOrBuilder getControlOrBuilder();

  /**
   * <pre>
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2.Control] to update. The following are NOT
   * supported:
   *
   * * [Control.name][google.cloud.retail.v2.Control.name]
   *
   * If not set or empty, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2.Control] to update. The following are NOT
   * supported:
   *
   * * [Control.name][google.cloud.retail.v2.Control.name]
   *
   * If not set or empty, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields in the provided
   * [Control][google.cloud.retail.v2.Control] to update. The following are NOT
   * supported:
   *
   * * [Control.name][google.cloud.retail.v2.Control.name]
   *
   * If not set or empty, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
