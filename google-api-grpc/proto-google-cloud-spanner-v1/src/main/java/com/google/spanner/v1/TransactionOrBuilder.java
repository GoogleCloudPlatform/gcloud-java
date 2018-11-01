// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.Transaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `id` may be used to identify the transaction in subsequent
   * [Read][google.spanner.v1.Spanner.Read],
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
   * [Commit][google.spanner.v1.Spanner.Commit], or
   * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
   * Single-use read-only transactions do not have IDs, because
   * single-use transactions do not support multiple requests.
   * </pre>
   *
   * <code>bytes id = 1;</code>
   */
  com.google.protobuf.ByteString getId();

  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  boolean hasReadTimestamp();
  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  com.google.protobuf.Timestamp getReadTimestamp();
  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * A timestamp in RFC3339 UTC &#92;"Zulu&#92;" format, accurate to nanoseconds.
   * Example: `"2014-10-02T15:01:23.045123456Z"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimestampOrBuilder();
}
