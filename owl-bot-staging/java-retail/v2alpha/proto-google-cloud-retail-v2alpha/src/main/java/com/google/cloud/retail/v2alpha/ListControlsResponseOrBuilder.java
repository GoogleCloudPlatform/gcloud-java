// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/control_service.proto

package com.google.cloud.retail.v2alpha;

public interface ListControlsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ListControlsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Control controls = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Control> 
      getControlsList();
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Control controls = 1;</code>
   */
  com.google.cloud.retail.v2alpha.Control getControls(int index);
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Control controls = 1;</code>
   */
  int getControlsCount();
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Control controls = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.ControlOrBuilder> 
      getControlsOrBuilderList();
  /**
   * <pre>
   * All the Controls for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Control controls = 1;</code>
   */
  com.google.cloud.retail.v2alpha.ControlOrBuilder getControlsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token, if not returned indicates the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token, if not returned indicates the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
