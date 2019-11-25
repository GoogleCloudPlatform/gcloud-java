// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface ExecuteSqlRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ExecuteSqlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the SQL query should be performed.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session in which the SQL query should be performed.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * The transaction to use.
   * For queries, if none is provided, the default is a temporary read-only
   * transaction with strong concurrency.
   * Standard DML statements require a read-write transaction. To protect
   * against replays, single-use transactions are not supported.  The caller
   * must either supply an existing transaction ID or begin a new transaction.
   * Partitioned DML requires an existing Partitioned DML transaction ID.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * The transaction to use.
   * For queries, if none is provided, the default is a temporary read-only
   * transaction with strong concurrency.
   * Standard DML statements require a read-write transaction. To protect
   * against replays, single-use transactions are not supported.  The caller
   * must either supply an existing transaction ID or begin a new transaction.
   * Partitioned DML requires an existing Partitioned DML transaction ID.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionSelector getTransaction();
  /**
   *
   *
   * <pre>
   * The transaction to use.
   * For queries, if none is provided, the default is a temporary read-only
   * transaction with strong concurrency.
   * Standard DML statements require a read-write transaction. To protect
   * against replays, single-use transactions are not supported.  The caller
   * must either supply an existing transaction ID or begin a new transaction.
   * Partitioned DML requires an existing Partitioned DML transaction ID.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionSelectorOrBuilder getTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The SQL string.
   * </pre>
   *
   * <code>string sql = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getSql();
  /**
   *
   *
   * <pre>
   * Required. The SQL string.
   * </pre>
   *
   * <code>string sql = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getSqlBytes();

  /**
   *
   *
   * <pre>
   * Parameter names and values that bind to placeholders in the SQL string.
   * A parameter placeholder consists of the `&#64;` character followed by the
   * parameter name (for example, `&#64;firstName`). Parameter names can contain
   * letters, numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   * `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute a SQL statement with unbound parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  boolean hasParams();
  /**
   *
   *
   * <pre>
   * Parameter names and values that bind to placeholders in the SQL string.
   * A parameter placeholder consists of the `&#64;` character followed by the
   * parameter name (for example, `&#64;firstName`). Parameter names can contain
   * letters, numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   * `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute a SQL statement with unbound parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  com.google.protobuf.Struct getParams();
  /**
   *
   *
   * <pre>
   * Parameter names and values that bind to placeholders in the SQL string.
   * A parameter placeholder consists of the `&#64;` character followed by the
   * parameter name (for example, `&#64;firstName`). Parameter names can contain
   * letters, numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   * `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute a SQL statement with unbound parameters.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.ExecuteSqlRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL statement parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  int getParamTypesCount();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.ExecuteSqlRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL statement parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  boolean containsParamTypes(java.lang.String key);
  /** Use {@link #getParamTypesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.spanner.v1.Type> getParamTypes();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.ExecuteSqlRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL statement parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  java.util.Map<java.lang.String, com.google.spanner.v1.Type> getParamTypesMap();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.ExecuteSqlRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL statement parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  com.google.spanner.v1.Type getParamTypesOrDefault(
      java.lang.String key, com.google.spanner.v1.Type defaultValue);
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.ExecuteSqlRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL statement parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  com.google.spanner.v1.Type getParamTypesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * If this request is resuming a previously interrupted SQL statement
   * execution, `resume_token` should be copied from the last
   * [PartialResultSet][google.spanner.v1.PartialResultSet] yielded before the
   * interruption. Doing this enables the new SQL statement execution to resume
   * where the last one left off. The rest of the request parameters must
   * exactly match the request that yielded this token.
   * </pre>
   *
   * <code>bytes resume_token = 6;</code>
   */
  com.google.protobuf.ByteString getResumeToken();

  /**
   *
   *
   * <pre>
   * Used to control the amount of debugging information returned in
   * [ResultSetStats][google.spanner.v1.ResultSetStats]. If
   * [partition_token][google.spanner.v1.ExecuteSqlRequest.partition_token] is
   * set, [query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode] can only
   * be set to
   * [QueryMode.NORMAL][google.spanner.v1.ExecuteSqlRequest.QueryMode.NORMAL].
   * </pre>
   *
   * <code>.google.spanner.v1.ExecuteSqlRequest.QueryMode query_mode = 7;</code>
   */
  int getQueryModeValue();
  /**
   *
   *
   * <pre>
   * Used to control the amount of debugging information returned in
   * [ResultSetStats][google.spanner.v1.ResultSetStats]. If
   * [partition_token][google.spanner.v1.ExecuteSqlRequest.partition_token] is
   * set, [query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode] can only
   * be set to
   * [QueryMode.NORMAL][google.spanner.v1.ExecuteSqlRequest.QueryMode.NORMAL].
   * </pre>
   *
   * <code>.google.spanner.v1.ExecuteSqlRequest.QueryMode query_mode = 7;</code>
   */
  com.google.spanner.v1.ExecuteSqlRequest.QueryMode getQueryMode();

  /**
   *
   *
   * <pre>
   * If present, results will be restricted to the specified partition
   * previously created using PartitionQuery().  There must be an exact
   * match for the values of fields common to this message and the
   * PartitionQueryRequest message used to create this partition_token.
   * </pre>
   *
   * <code>bytes partition_token = 8;</code>
   */
  com.google.protobuf.ByteString getPartitionToken();

  /**
   *
   *
   * <pre>
   * A per-transaction sequence number used to identify this request. This field
   * makes each request idempotent such that if the request is received multiple
   * times, at most one will succeed.
   * The sequence number must be monotonically increasing within the
   * transaction. If a request arrives for the first time with an out-of-order
   * sequence number, the transaction may be aborted. Replays of previously
   * handled requests will yield the same response as the first execution.
   * Required for DML statements. Ignored for queries.
   * </pre>
   *
   * <code>int64 seqno = 9;</code>
   */
  long getSeqno();
}
