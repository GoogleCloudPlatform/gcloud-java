// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface ReadRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ReadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the read should be performed.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session in which the read should be performed.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * The transaction to use. If none is provided, the default is a
   * temporary read-only transaction with strong concurrency.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * The transaction to use. If none is provided, the default is a
   * temporary read-only transaction with strong concurrency.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   *
   * @return The transaction.
   */
  com.google.spanner.v1.TransactionSelector getTransaction();
  /**
   *
   *
   * <pre>
   * The transaction to use. If none is provided, the default is a
   * temporary read-only transaction with strong concurrency.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionSelectorOrBuilder getTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The name of the table in the database to be read.
   * </pre>
   *
   * <code>string table = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The table.
   */
  java.lang.String getTable();
  /**
   *
   *
   * <pre>
   * Required. The name of the table in the database to be read.
   * </pre>
   *
   * <code>string table = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString getTableBytes();

  /**
   *
   *
   * <pre>
   * If non-empty, the name of an index on
   * [table][google.spanner.v1.ReadRequest.table]. This index is used instead of
   * the table primary key when interpreting
   * [key_set][google.spanner.v1.ReadRequest.key_set] and sorting result rows.
   * See [key_set][google.spanner.v1.ReadRequest.key_set] for further
   * information.
   * </pre>
   *
   * <code>string index = 4;</code>
   *
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   *
   *
   * <pre>
   * If non-empty, the name of an index on
   * [table][google.spanner.v1.ReadRequest.table]. This index is used instead of
   * the table primary key when interpreting
   * [key_set][google.spanner.v1.ReadRequest.key_set] and sorting result rows.
   * See [key_set][google.spanner.v1.ReadRequest.key_set] for further
   * information.
   * </pre>
   *
   * <code>string index = 4;</code>
   *
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString getIndexBytes();

  /**
   *
   *
   * <pre>
   * Required. The columns of [table][google.spanner.v1.ReadRequest.table] to be
   * returned for each row matching this request.
   * </pre>
   *
   * <code>repeated string columns = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the columns.
   */
  java.util.List<java.lang.String> getColumnsList();
  /**
   *
   *
   * <pre>
   * Required. The columns of [table][google.spanner.v1.ReadRequest.table] to be
   * returned for each row matching this request.
   * </pre>
   *
   * <code>repeated string columns = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of columns.
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * Required. The columns of [table][google.spanner.v1.ReadRequest.table] to be
   * returned for each row matching this request.
   * </pre>
   *
   * <code>repeated string columns = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The columns at the given index.
   */
  java.lang.String getColumns(int index);
  /**
   *
   *
   * <pre>
   * Required. The columns of [table][google.spanner.v1.ReadRequest.table] to be
   * returned for each row matching this request.
   * </pre>
   *
   * <code>repeated string columns = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the columns at the given index.
   */
  com.google.protobuf.ByteString getColumnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the
   * primary keys of the rows in [table][google.spanner.v1.ReadRequest.table] to
   * be yielded, unless [index][google.spanner.v1.ReadRequest.index] is present.
   * If [index][google.spanner.v1.ReadRequest.index] is present, then
   * [key_set][google.spanner.v1.ReadRequest.key_set] instead names index keys
   * in [index][google.spanner.v1.ReadRequest.index].
   * If the [partition_token][google.spanner.v1.ReadRequest.partition_token]
   * field is empty, rows are yielded in table primary key order (if
   * [index][google.spanner.v1.ReadRequest.index] is empty) or index key order
   * (if [index][google.spanner.v1.ReadRequest.index] is non-empty).  If the
   * [partition_token][google.spanner.v1.ReadRequest.partition_token] field is
   * not empty, rows will be yielded in an unspecified order.
   * It is not an error for the `key_set` to name rows that do not
   * exist in the database. Read yields nothing for nonexistent rows.
   * </pre>
   *
   * <code>.google.spanner.v1.KeySet key_set = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the keySet field is set.
   */
  boolean hasKeySet();
  /**
   *
   *
   * <pre>
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the
   * primary keys of the rows in [table][google.spanner.v1.ReadRequest.table] to
   * be yielded, unless [index][google.spanner.v1.ReadRequest.index] is present.
   * If [index][google.spanner.v1.ReadRequest.index] is present, then
   * [key_set][google.spanner.v1.ReadRequest.key_set] instead names index keys
   * in [index][google.spanner.v1.ReadRequest.index].
   * If the [partition_token][google.spanner.v1.ReadRequest.partition_token]
   * field is empty, rows are yielded in table primary key order (if
   * [index][google.spanner.v1.ReadRequest.index] is empty) or index key order
   * (if [index][google.spanner.v1.ReadRequest.index] is non-empty).  If the
   * [partition_token][google.spanner.v1.ReadRequest.partition_token] field is
   * not empty, rows will be yielded in an unspecified order.
   * It is not an error for the `key_set` to name rows that do not
   * exist in the database. Read yields nothing for nonexistent rows.
   * </pre>
   *
   * <code>.google.spanner.v1.KeySet key_set = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The keySet.
   */
  com.google.spanner.v1.KeySet getKeySet();
  /**
   *
   *
   * <pre>
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the
   * primary keys of the rows in [table][google.spanner.v1.ReadRequest.table] to
   * be yielded, unless [index][google.spanner.v1.ReadRequest.index] is present.
   * If [index][google.spanner.v1.ReadRequest.index] is present, then
   * [key_set][google.spanner.v1.ReadRequest.key_set] instead names index keys
   * in [index][google.spanner.v1.ReadRequest.index].
   * If the [partition_token][google.spanner.v1.ReadRequest.partition_token]
   * field is empty, rows are yielded in table primary key order (if
   * [index][google.spanner.v1.ReadRequest.index] is empty) or index key order
   * (if [index][google.spanner.v1.ReadRequest.index] is non-empty).  If the
   * [partition_token][google.spanner.v1.ReadRequest.partition_token] field is
   * not empty, rows will be yielded in an unspecified order.
   * It is not an error for the `key_set` to name rows that do not
   * exist in the database. Read yields nothing for nonexistent rows.
   * </pre>
   *
   * <code>.google.spanner.v1.KeySet key_set = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.spanner.v1.KeySetOrBuilder getKeySetOrBuilder();

  /**
   *
   *
   * <pre>
   * If greater than zero, only the first `limit` rows are yielded. If `limit`
   * is zero, the default is no limit. A limit cannot be specified if
   * `partition_token` is set.
   * </pre>
   *
   * <code>int64 limit = 8;</code>
   *
   * @return The limit.
   */
  long getLimit();

  /**
   *
   *
   * <pre>
   * If this request is resuming a previously interrupted read,
   * `resume_token` should be copied from the last
   * [PartialResultSet][google.spanner.v1.PartialResultSet] yielded before the
   * interruption. Doing this enables the new read to resume where the last read
   * left off. The rest of the request parameters must exactly match the request
   * that yielded this token.
   * </pre>
   *
   * <code>bytes resume_token = 9;</code>
   *
   * @return The resumeToken.
   */
  com.google.protobuf.ByteString getResumeToken();

  /**
   *
   *
   * <pre>
   * If present, results will be restricted to the specified partition
   * previously created using PartitionRead().    There must be an exact
   * match for the values of fields common to this message and the
   * PartitionReadRequest message used to create this partition_token.
   * </pre>
   *
   * <code>bytes partition_token = 10;</code>
   *
   * @return The partitionToken.
   */
  com.google.protobuf.ByteString getPartitionToken();
}
