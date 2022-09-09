// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface ListRepositoriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.ListRepositoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.Repository repositories = 1;</code>
   */
  java.util.List<com.google.cloud.dataform.v1beta1.Repository> 
      getRepositoriesList();
  /**
   * <pre>
   * List of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.Repository repositories = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.Repository getRepositories(int index);
  /**
   * <pre>
   * List of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.Repository repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   * <pre>
   * List of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.Repository repositories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1beta1.RepositoryOrBuilder> 
      getRepositoriesOrBuilderList();
  /**
   * <pre>
   * List of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.Repository repositories = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.RepositoryOrBuilder getRepositoriesOrBuilder(
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

  /**
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations which could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
