// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

public interface ListActionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListActionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Actions under the given parent lake/zone/asset.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Action actions = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Action> 
      getActionsList();
  /**
   * <pre>
   * Actions under the given parent lake/zone/asset.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Action actions = 1;</code>
   */
  com.google.cloud.dataplex.v1.Action getActions(int index);
  /**
   * <pre>
   * Actions under the given parent lake/zone/asset.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Action actions = 1;</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * Actions under the given parent lake/zone/asset.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Action actions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.ActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * Actions under the given parent lake/zone/asset.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Action actions = 1;</code>
   */
  com.google.cloud.dataplex.v1.ActionOrBuilder getActionsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
