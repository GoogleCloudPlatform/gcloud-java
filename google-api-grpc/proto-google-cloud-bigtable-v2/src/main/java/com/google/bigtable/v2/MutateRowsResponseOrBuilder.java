// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface MutateRowsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.MutateRowsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * One or more results for Entries from the batch request.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.MutateRowsResponse.Entry entries = 1;</code>
   */
  java.util.List<com.google.bigtable.v2.MutateRowsResponse.Entry> getEntriesList();
  /**
   *
   *
   * <pre>
   * One or more results for Entries from the batch request.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.MutateRowsResponse.Entry entries = 1;</code>
   */
  com.google.bigtable.v2.MutateRowsResponse.Entry getEntries(int index);
  /**
   *
   *
   * <pre>
   * One or more results for Entries from the batch request.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.MutateRowsResponse.Entry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   *
   *
   * <pre>
   * One or more results for Entries from the batch request.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.MutateRowsResponse.Entry entries = 1;</code>
   */
  java.util.List<? extends com.google.bigtable.v2.MutateRowsResponse.EntryOrBuilder>
      getEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * One or more results for Entries from the batch request.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.MutateRowsResponse.Entry entries = 1;</code>
   */
  com.google.bigtable.v2.MutateRowsResponse.EntryOrBuilder getEntriesOrBuilder(int index);
}
