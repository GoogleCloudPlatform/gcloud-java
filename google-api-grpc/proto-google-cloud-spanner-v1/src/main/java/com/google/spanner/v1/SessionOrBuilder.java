// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface SessionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the session. This is always system-assigned; values provided
   * when creating a session are ignored.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the session. This is always system-assigned; values provided
   * when creating a session are ignored.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The labels for the session.
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *  * No more than 64 labels can be associated with a given session.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels for the session.
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *  * No more than 64 labels can be associated with a given session.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels for the session.
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *  * No more than 64 labels can be associated with a given session.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels for the session.
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *  * No more than 64 labels can be associated with a given session.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels for the session.
   *  * Label keys must be between 1 and 63 characters long and must conform to
   *    the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *  * Label values must be between 0 and 63 characters long and must conform
   *    to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *  * No more than 64 labels can be associated with a given session.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the session is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the session is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the session is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The approximate timestamp when the session is last used. It is
   * typically earlier than the actual last use time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approximate_last_use_time = 4;</code>
   *
   * @return Whether the approximateLastUseTime field is set.
   */
  boolean hasApproximateLastUseTime();
  /**
   *
   *
   * <pre>
   * Output only. The approximate timestamp when the session is last used. It is
   * typically earlier than the actual last use time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approximate_last_use_time = 4;</code>
   *
   * @return The approximateLastUseTime.
   */
  com.google.protobuf.Timestamp getApproximateLastUseTime();
  /**
   *
   *
   * <pre>
   * Output only. The approximate timestamp when the session is last used. It is
   * typically earlier than the actual last use time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp approximate_last_use_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getApproximateLastUseTimeOrBuilder();
}
