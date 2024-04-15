// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/inventories/v1beta/regionalinventory.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.inventories.v1beta;

public interface ListRegionalInventoriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.inventories.v1beta.ListRegionalInventoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The `name` of the parent product to list `RegionalInventory`
   * resources for. Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The `name` of the parent product to list `RegionalInventory`
   * resources for. Format: `accounts/{account}/products/{product}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of `RegionalInventory` resources for the given product
   * to return. The service returns fewer than this value if the number of
   * inventories for the given product is less that than the `pageSize`. The
   * default value is 25000. The maximum value is 100000; If a value higher than
   * the maximum is specified, then the `pageSize` will default to the maximum.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListRegionalInventories` call.
   * Provide the page token to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRegionalInventories`
   * must match the call that provided the page token. The token returned as
   * [nextPageToken][google.shopping.merchant.inventories.v1beta.ListRegionalInventoriesResponse.next_page_token]
   * in the response to the previous request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListRegionalInventories` call.
   * Provide the page token to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListRegionalInventories`
   * must match the call that provided the page token. The token returned as
   * [nextPageToken][google.shopping.merchant.inventories.v1beta.ListRegionalInventoriesResponse.next_page_token]
   * in the response to the previous request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
