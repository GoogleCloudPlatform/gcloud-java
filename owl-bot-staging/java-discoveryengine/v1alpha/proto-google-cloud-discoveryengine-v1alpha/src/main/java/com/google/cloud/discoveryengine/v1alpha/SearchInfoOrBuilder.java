// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/user_event.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface SearchInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.SearchInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user's search query.
   *
   * See
   * [SearchRequest.query][google.cloud.discoveryengine.v1alpha.SearchRequest.query]
   * for definition.
   *
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * At least one of
   * [search_query][google.cloud.discoveryengine.v1alpha.SearchInfo.search_query]
   * or
   * [PageInfo.page_category][google.cloud.discoveryengine.v1alpha.PageInfo.page_category]
   * is required for `search` events. Other event types should not set this
   * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   * @return The searchQuery.
   */
  java.lang.String getSearchQuery();
  /**
   * <pre>
   * The user's search query.
   *
   * See
   * [SearchRequest.query][google.cloud.discoveryengine.v1alpha.SearchRequest.query]
   * for definition.
   *
   * The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * At least one of
   * [search_query][google.cloud.discoveryengine.v1alpha.SearchInfo.search_query]
   * or
   * [PageInfo.page_category][google.cloud.discoveryengine.v1alpha.PageInfo.page_category]
   * is required for `search` events. Other event types should not set this
   * field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string search_query = 1;</code>
   * @return The bytes for searchQuery.
   */
  com.google.protobuf.ByteString
      getSearchQueryBytes();

  /**
   * <pre>
   * The order in which products are returned, if applicable.
   *
   * See
   * [SearchRequest.order_by][google.cloud.discoveryengine.v1alpha.SearchRequest.order_by]
   * for definition and syntax.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string order_by = 2;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * The order in which products are returned, if applicable.
   *
   * See
   * [SearchRequest.order_by][google.cloud.discoveryengine.v1alpha.SearchRequest.order_by]
   * for definition and syntax.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string order_by = 2;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * An integer that specifies the current offset for pagination (the 0-indexed
   * starting location, amongst the products deemed by the API as relevant).
   *
   * See
   * [SearchRequest.offset][google.cloud.discoveryengine.v1alpha.SearchRequest.offset]
   * for definition.
   *
   * If this field is negative, an `INVALID_ARGUMENT` is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>optional int32 offset = 3;</code>
   * @return Whether the offset field is set.
   */
  boolean hasOffset();
  /**
   * <pre>
   * An integer that specifies the current offset for pagination (the 0-indexed
   * starting location, amongst the products deemed by the API as relevant).
   *
   * See
   * [SearchRequest.offset][google.cloud.discoveryengine.v1alpha.SearchRequest.offset]
   * for definition.
   *
   * If this field is negative, an `INVALID_ARGUMENT` is returned.
   *
   * This can only be set for `search` events. Other event types should not set
   * this field. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>optional int32 offset = 3;</code>
   * @return The offset.
   */
  int getOffset();
}
