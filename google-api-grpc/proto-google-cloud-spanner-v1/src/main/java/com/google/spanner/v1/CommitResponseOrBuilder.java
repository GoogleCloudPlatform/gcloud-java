// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface CommitResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.CommitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  boolean hasCommitTimestamp();
  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  com.google.protobuf.Timestamp getCommitTimestamp();
  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCommitTimestampOrBuilder();
}
