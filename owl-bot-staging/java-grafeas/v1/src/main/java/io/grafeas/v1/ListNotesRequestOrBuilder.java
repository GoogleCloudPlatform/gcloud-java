// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface ListNotesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ListNotesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the project to list notes for in the form of
   * `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The name of the project to list notes for in the form of
   * `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Number of notes to return in the list. Must be positive. Max allowed page
   * size is 1000. If not specified, page size defaults to 20.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
