// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/product_service.proto

package com.google.cloud.retail.v2beta;

public interface AddLocalInventoriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.AddLocalInventoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The product.
   */
  java.lang.String getProduct();
  /**
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2beta.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2beta.Product], regardless of whether or not
   * it exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for product.
   */
  com.google.protobuf.ByteString
      getProductBytes();

  /**
   * <pre>
   * Required. A list of inventory information at difference places. Each place
   * is identified by its place ID. At most 3000 inventories are allowed per
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.LocalInventory local_inventories = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.retail.v2beta.LocalInventory> 
      getLocalInventoriesList();
  /**
   * <pre>
   * Required. A list of inventory information at difference places. Each place
   * is identified by its place ID. At most 3000 inventories are allowed per
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.LocalInventory local_inventories = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2beta.LocalInventory getLocalInventories(int index);
  /**
   * <pre>
   * Required. A list of inventory information at difference places. Each place
   * is identified by its place ID. At most 3000 inventories are allowed per
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.LocalInventory local_inventories = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getLocalInventoriesCount();
  /**
   * <pre>
   * Required. A list of inventory information at difference places. Each place
   * is identified by its place ID. At most 3000 inventories are allowed per
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.LocalInventory local_inventories = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.LocalInventoryOrBuilder> 
      getLocalInventoriesOrBuilderList();
  /**
   * <pre>
   * Required. A list of inventory information at difference places. Each place
   * is identified by its place ID. At most 3000 inventories are allowed per
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.LocalInventory local_inventories = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2beta.LocalInventoryOrBuilder getLocalInventoriesOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates which inventory fields in the provided list of
   * [LocalInventory][google.cloud.retail.v2beta.LocalInventory] to update. The
   * field is updated to the provided value.
   *
   * If a field is set while the place does not have a previous local inventory,
   * the local inventory at that store is created.
   *
   * If a field is set while the value of that field is not provided, the
   * original field value, if it exists, is deleted.
   *
   * If the mask is not set or set with empty paths, all inventory fields will
   * be updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned and the entire update will be ignored.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask add_mask = 4;</code>
   * @return Whether the addMask field is set.
   */
  boolean hasAddMask();
  /**
   * <pre>
   * Indicates which inventory fields in the provided list of
   * [LocalInventory][google.cloud.retail.v2beta.LocalInventory] to update. The
   * field is updated to the provided value.
   *
   * If a field is set while the place does not have a previous local inventory,
   * the local inventory at that store is created.
   *
   * If a field is set while the value of that field is not provided, the
   * original field value, if it exists, is deleted.
   *
   * If the mask is not set or set with empty paths, all inventory fields will
   * be updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned and the entire update will be ignored.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask add_mask = 4;</code>
   * @return The addMask.
   */
  com.google.protobuf.FieldMask getAddMask();
  /**
   * <pre>
   * Indicates which inventory fields in the provided list of
   * [LocalInventory][google.cloud.retail.v2beta.LocalInventory] to update. The
   * field is updated to the provided value.
   *
   * If a field is set while the place does not have a previous local inventory,
   * the local inventory at that store is created.
   *
   * If a field is set while the value of that field is not provided, the
   * original field value, if it exists, is deleted.
   *
   * If the mask is not set or set with empty paths, all inventory fields will
   * be updated.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned and the entire update will be ignored.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask add_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getAddMaskOrBuilder();

  /**
   * <pre>
   * The time when the inventory updates are issued. Used to prevent
   * out-of-order updates on local inventory fields. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 5;</code>
   * @return Whether the addTime field is set.
   */
  boolean hasAddTime();
  /**
   * <pre>
   * The time when the inventory updates are issued. Used to prevent
   * out-of-order updates on local inventory fields. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 5;</code>
   * @return The addTime.
   */
  com.google.protobuf.Timestamp getAddTime();
  /**
   * <pre>
   * The time when the inventory updates are issued. Used to prevent
   * out-of-order updates on local inventory fields. If not provided, the
   * internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp add_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getAddTimeOrBuilder();

  /**
   * <pre>
   * If set to true, and the [Product][google.cloud.retail.v2beta.Product] is
   * not found, the local inventory will still be processed and retained for at
   * most 1 day and processed once the
   * [Product][google.cloud.retail.v2beta.Product] is created. If set to false,
   * a NOT_FOUND error is returned if the
   * [Product][google.cloud.retail.v2beta.Product] is not found.
   * </pre>
   *
   * <code>bool allow_missing = 6;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
