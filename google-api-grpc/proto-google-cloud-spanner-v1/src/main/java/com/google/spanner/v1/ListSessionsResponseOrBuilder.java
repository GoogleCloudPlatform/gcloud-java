// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface ListSessionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ListSessionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of requested sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session sessions = 1;</code>
   */
  java.util.List<com.google.spanner.v1.Session> getSessionsList();
  /**
   *
   *
   * <pre>
   * The list of requested sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session sessions = 1;</code>
   */
  com.google.spanner.v1.Session getSessions(int index);
  /**
   *
   *
   * <pre>
   * The list of requested sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session sessions = 1;</code>
   */
  int getSessionsCount();
  /**
   *
   *
   * <pre>
   * The list of requested sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session sessions = 1;</code>
   */
  java.util.List<? extends com.google.spanner.v1.SessionOrBuilder> getSessionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of requested sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session sessions = 1;</code>
   */
  com.google.spanner.v1.SessionOrBuilder getSessionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListSessions][google.spanner.v1.Spanner.ListSessions] call to fetch more
   * of the matching sessions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListSessions][google.spanner.v1.Spanner.ListSessions] call to fetch more
   * of the matching sessions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
