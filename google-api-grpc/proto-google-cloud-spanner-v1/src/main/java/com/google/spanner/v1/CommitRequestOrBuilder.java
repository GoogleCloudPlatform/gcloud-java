// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface CommitRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.CommitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction to be committed is running.
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
   * Required. The session in which the transaction to be committed is running.
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
   * Commit a previously-started transaction.
   * </pre>
   *
   * <code>bytes transaction_id = 2;</code>
   *
   * @return The transactionId.
   */
  com.google.protobuf.ByteString getTransactionId();

  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   *
   * @return Whether the singleUseTransaction field is set.
   */
  boolean hasSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   *
   * @return The singleUseTransaction.
   */
  com.google.spanner.v1.TransactionOptions getSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   */
  com.google.spanner.v1.TransactionOptionsOrBuilder getSingleUseTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  java.util.List<com.google.spanner.v1.Mutation> getMutationsList();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  com.google.spanner.v1.Mutation getMutations(int index);
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  int getMutationsCount();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  java.util.List<? extends com.google.spanner.v1.MutationOrBuilder> getMutationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  com.google.spanner.v1.MutationOrBuilder getMutationsOrBuilder(int index);

  public com.google.spanner.v1.CommitRequest.TransactionCase getTransactionCase();
}
