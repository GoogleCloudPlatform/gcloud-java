// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface ListEntitiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListEntitiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Entity> 
      getEntitiesList();
  /**
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  com.google.cloud.dataplex.v1.Entity getEntities(int index);
  /**
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.EntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  com.google.cloud.dataplex.v1.EntityOrBuilder getEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
