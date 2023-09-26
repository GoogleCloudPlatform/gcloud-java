// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/control_service.proto

package com.google.cloud.retail.v2alpha;

public interface CreateControlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.CreateControlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full resource name of parent catalog. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Full resource name of parent catalog. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Control to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Control control = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the control field is set.
   */
  boolean hasControl();
  /**
   * <pre>
   * Required. The Control to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Control control = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The control.
   */
  com.google.cloud.retail.v2alpha.Control getControl();
  /**
   * <pre>
   * Required. The Control to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2alpha.Control control = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2alpha.ControlOrBuilder getControlOrBuilder();

  /**
   * <pre>
   * Required. The ID to use for the Control, which will become the final
   * component of the Control's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string control_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The controlId.
   */
  java.lang.String getControlId();
  /**
   * <pre>
   * Required. The ID to use for the Control, which will become the final
   * component of the Control's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string control_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for controlId.
   */
  com.google.protobuf.ByteString
      getControlIdBytes();
}
