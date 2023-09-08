// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

public interface DescribeDatabaseEntitiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity> 
      getDatabaseEntitiesList();
  /**
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  com.google.cloud.clouddms.v1.DatabaseEntity getDatabaseEntities(int index);
  /**
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  int getDatabaseEntitiesCount();
  /**
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder> 
      getDatabaseEntitiesOrBuilderList();
  /**
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder getDatabaseEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * A token which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
