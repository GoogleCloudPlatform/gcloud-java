// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListEntityTypesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListEntityTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The EntityTypes matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.EntityType entity_types = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.EntityType> 
      getEntityTypesList();
  /**
   * <pre>
   * The EntityTypes matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.EntityType entity_types = 1;</code>
   */
  com.google.cloud.aiplatform.v1.EntityType getEntityTypes(int index);
  /**
   * <pre>
   * The EntityTypes matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.EntityType entity_types = 1;</code>
   */
  int getEntityTypesCount();
  /**
   * <pre>
   * The EntityTypes matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.EntityType entity_types = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.EntityTypeOrBuilder> 
      getEntityTypesOrBuilderList();
  /**
   * <pre>
   * The EntityTypes matching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.EntityType entity_types = 1;</code>
   */
  com.google.cloud.aiplatform.v1.EntityTypeOrBuilder getEntityTypesOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as [ListEntityTypesRequest.page_token][google.cloud.aiplatform.v1.ListEntityTypesRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as [ListEntityTypesRequest.page_token][google.cloud.aiplatform.v1.ListEntityTypesRequest.page_token] to
   * retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
