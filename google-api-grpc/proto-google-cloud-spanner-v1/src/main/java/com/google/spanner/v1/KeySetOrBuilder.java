// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/keys.proto

package com.google.spanner.v1;

public interface KeySetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.KeySet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of specific keys. Entries in `keys` should have exactly as
   * many elements as there are columns in the primary or index key
   * with which this `KeySet` is used.  Individual key values are
   * encoded as described [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue keys = 1;</code>
   */
  java.util.List<com.google.protobuf.ListValue> getKeysList();
  /**
   *
   *
   * <pre>
   * A list of specific keys. Entries in `keys` should have exactly as
   * many elements as there are columns in the primary or index key
   * with which this `KeySet` is used.  Individual key values are
   * encoded as described [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue keys = 1;</code>
   */
  com.google.protobuf.ListValue getKeys(int index);
  /**
   *
   *
   * <pre>
   * A list of specific keys. Entries in `keys` should have exactly as
   * many elements as there are columns in the primary or index key
   * with which this `KeySet` is used.  Individual key values are
   * encoded as described [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue keys = 1;</code>
   */
  int getKeysCount();
  /**
   *
   *
   * <pre>
   * A list of specific keys. Entries in `keys` should have exactly as
   * many elements as there are columns in the primary or index key
   * with which this `KeySet` is used.  Individual key values are
   * encoded as described [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue keys = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.ListValueOrBuilder> getKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of specific keys. Entries in `keys` should have exactly as
   * many elements as there are columns in the primary or index key
   * with which this `KeySet` is used.  Individual key values are
   * encoded as described [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue keys = 1;</code>
   */
  com.google.protobuf.ListValueOrBuilder getKeysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of key ranges. See [KeyRange][google.spanner.v1.KeyRange] for more information about
   * key range specifications.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.KeyRange ranges = 2;</code>
   */
  java.util.List<com.google.spanner.v1.KeyRange> getRangesList();
  /**
   *
   *
   * <pre>
   * A list of key ranges. See [KeyRange][google.spanner.v1.KeyRange] for more information about
   * key range specifications.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.KeyRange ranges = 2;</code>
   */
  com.google.spanner.v1.KeyRange getRanges(int index);
  /**
   *
   *
   * <pre>
   * A list of key ranges. See [KeyRange][google.spanner.v1.KeyRange] for more information about
   * key range specifications.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.KeyRange ranges = 2;</code>
   */
  int getRangesCount();
  /**
   *
   *
   * <pre>
   * A list of key ranges. See [KeyRange][google.spanner.v1.KeyRange] for more information about
   * key range specifications.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.KeyRange ranges = 2;</code>
   */
  java.util.List<? extends com.google.spanner.v1.KeyRangeOrBuilder> getRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of key ranges. See [KeyRange][google.spanner.v1.KeyRange] for more information about
   * key range specifications.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.KeyRange ranges = 2;</code>
   */
  com.google.spanner.v1.KeyRangeOrBuilder getRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For convenience `all` can be set to `true` to indicate that this
   * `KeySet` matches all keys in the table or index. Note that any keys
   * specified in `keys` or `ranges` are only yielded once.
   * </pre>
   *
   * <code>bool all = 3;</code>
   *
   * @return The all.
   */
  boolean getAll();
}
