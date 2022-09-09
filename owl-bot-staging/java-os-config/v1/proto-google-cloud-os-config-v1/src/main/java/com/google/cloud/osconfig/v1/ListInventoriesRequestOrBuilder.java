// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/inventory.proto

package com.google.cloud.osconfig.v1;

public interface ListInventoriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.ListInventoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name.
   * Format: `projects/{project}/locations/{location}/instances/-`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name.
   * Format: `projects/{project}/locations/{location}/instances/-`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   * @return The view.
   */
  com.google.cloud.osconfig.v1.InventoryView getView();

  /**
   * <pre>
   * The maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListInventories` that indicates where this listing
   * should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListInventories` that indicates where this listing
   * should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by a
   * `Inventory` API resource to be included in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by a
   * `Inventory` API resource to be included in the response.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
