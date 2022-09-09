// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface ListTagsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ListTagsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Data Catalog resource to list the tags of.
   * The resource can be an [Entry][google.cloud.datacatalog.v1.Entry]
   * or an [EntryGroup][google.cloud.datacatalog.v1.EntryGroup]
   * (without `/entries/{entries}` at the end).
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the Data Catalog resource to list the tags of.
   * The resource can be an [Entry][google.cloud.datacatalog.v1.Entry]
   * or an [EntryGroup][google.cloud.datacatalog.v1.EntryGroup]
   * (without `/entries/{entries}` at the end).
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of tags to return. Default is 10. Maximum limit is 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Pagination token that specifies the next page to return. If empty, the
   * first page is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Pagination token that specifies the next page to return. If empty, the
   * first page is returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
