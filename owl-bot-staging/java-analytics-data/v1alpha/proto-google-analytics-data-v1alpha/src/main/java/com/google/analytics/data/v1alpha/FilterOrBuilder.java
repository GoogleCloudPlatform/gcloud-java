// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <pre>
   * The dimension name or metric name. Must be a name defined in dimensions
   * or metrics.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 2;</code>
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();
  /**
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 2;</code>
   * @return The stringFilter.
   */
  com.google.analytics.data.v1alpha.StringFilter getStringFilter();
  /**
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 2;</code>
   */
  com.google.analytics.data.v1alpha.StringFilterOrBuilder getStringFilterOrBuilder();

  /**
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 3;</code>
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();
  /**
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 3;</code>
   * @return The inListFilter.
   */
  com.google.analytics.data.v1alpha.InListFilter getInListFilter();
  /**
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 3;</code>
   */
  com.google.analytics.data.v1alpha.InListFilterOrBuilder getInListFilterOrBuilder();

  /**
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 4;</code>
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();
  /**
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 4;</code>
   * @return The numericFilter.
   */
  com.google.analytics.data.v1alpha.NumericFilter getNumericFilter();
  /**
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.NumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 5;</code>
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();
  /**
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 5;</code>
   * @return The betweenFilter.
   */
  com.google.analytics.data.v1alpha.BetweenFilter getBetweenFilter();
  /**
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 5;</code>
   */
  com.google.analytics.data.v1alpha.BetweenFilterOrBuilder getBetweenFilterOrBuilder();

  public com.google.analytics.data.v1alpha.Filter.OneFilterCase getOneFilterCase();
}
