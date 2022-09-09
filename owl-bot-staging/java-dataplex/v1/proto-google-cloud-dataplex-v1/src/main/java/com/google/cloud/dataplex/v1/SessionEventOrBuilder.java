// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/logs.proto

package com.google.cloud.dataplex.v1;

public interface SessionEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.SessionEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The log message.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The information about the user that created the session.
   * </pre>
   *
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The information about the user that created the session.
   * </pre>
   *
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Unique identifier for the session.
   * </pre>
   *
   * <code>string session_id = 3;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * Unique identifier for the session.
   * </pre>
   *
   * <code>string session_id = 3;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * The type of the event.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SessionEvent.EventType type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the event.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SessionEvent.EventType type = 4;</code>
   * @return The type.
   */
  com.google.cloud.dataplex.v1.SessionEvent.EventType getType();

  /**
   * <pre>
   * The execution details of the query.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SessionEvent.QueryDetail query = 5;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <pre>
   * The execution details of the query.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SessionEvent.QueryDetail query = 5;</code>
   * @return The query.
   */
  com.google.cloud.dataplex.v1.SessionEvent.QueryDetail getQuery();
  /**
   * <pre>
   * The execution details of the query.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.SessionEvent.QueryDetail query = 5;</code>
   */
  com.google.cloud.dataplex.v1.SessionEvent.QueryDetailOrBuilder getQueryOrBuilder();

  public com.google.cloud.dataplex.v1.SessionEvent.DetailCase getDetailCase();
}
