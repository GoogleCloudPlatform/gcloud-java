// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/inventory.proto

package com.google.cloud.osconfig.v1alpha;

public interface ListInventoriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.ListInventoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  java.util.List<com.google.cloud.osconfig.v1alpha.Inventory> 
      getInventoriesList();
  /**
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  com.google.cloud.osconfig.v1alpha.Inventory getInventories(int index);
  /**
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  int getInventoriesCount();
  /**
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1alpha.InventoryOrBuilder> 
      getInventoriesOrBuilderList();
  /**
   * <pre>
   * List of inventory objects.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.Inventory inventories = 1;</code>
   */
  com.google.cloud.osconfig.v1alpha.InventoryOrBuilder getInventoriesOrBuilder(
      int index);

  /**
   * <pre>
   * The pagination token to retrieve the next page of inventory objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The pagination token to retrieve the next page of inventory objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
