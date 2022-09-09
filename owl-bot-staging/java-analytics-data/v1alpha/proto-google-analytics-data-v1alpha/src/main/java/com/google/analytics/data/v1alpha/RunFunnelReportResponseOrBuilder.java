// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public interface RunFunnelReportResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.RunFunnelReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The funnel table is a report with the funnel step, segment, breakdown
   * dimension, active users, completion rate, abandonments, and abandonments
   * rate.
   * The segment dimension is only present in this response if a segment was
   * requested. The breakdown dimension is only present in this response if it
   * was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_table = 1;</code>
   * @return Whether the funnelTable field is set.
   */
  boolean hasFunnelTable();
  /**
   * <pre>
   * The funnel table is a report with the funnel step, segment, breakdown
   * dimension, active users, completion rate, abandonments, and abandonments
   * rate.
   * The segment dimension is only present in this response if a segment was
   * requested. The breakdown dimension is only present in this response if it
   * was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_table = 1;</code>
   * @return The funnelTable.
   */
  com.google.analytics.data.v1alpha.FunnelSubReport getFunnelTable();
  /**
   * <pre>
   * The funnel table is a report with the funnel step, segment, breakdown
   * dimension, active users, completion rate, abandonments, and abandonments
   * rate.
   * The segment dimension is only present in this response if a segment was
   * requested. The breakdown dimension is only present in this response if it
   * was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_table = 1;</code>
   */
  com.google.analytics.data.v1alpha.FunnelSubReportOrBuilder getFunnelTableOrBuilder();

  /**
   * <pre>
   * The funnel visualization is a report with the funnel step, segment, date,
   * next action dimension, and active users.
   * The segment dimension is only present in this response if a segment was
   * requested. The date dimension is only present in this response if it was
   * requested via the `TRENDED_FUNNEL` funnel type. The next action dimension
   * is only present in the response if it was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_visualization = 2;</code>
   * @return Whether the funnelVisualization field is set.
   */
  boolean hasFunnelVisualization();
  /**
   * <pre>
   * The funnel visualization is a report with the funnel step, segment, date,
   * next action dimension, and active users.
   * The segment dimension is only present in this response if a segment was
   * requested. The date dimension is only present in this response if it was
   * requested via the `TRENDED_FUNNEL` funnel type. The next action dimension
   * is only present in the response if it was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_visualization = 2;</code>
   * @return The funnelVisualization.
   */
  com.google.analytics.data.v1alpha.FunnelSubReport getFunnelVisualization();
  /**
   * <pre>
   * The funnel visualization is a report with the funnel step, segment, date,
   * next action dimension, and active users.
   * The segment dimension is only present in this response if a segment was
   * requested. The date dimension is only present in this response if it was
   * requested via the `TRENDED_FUNNEL` funnel type. The next action dimension
   * is only present in the response if it was requested.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelSubReport funnel_visualization = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelSubReportOrBuilder getFunnelVisualizationOrBuilder();

  /**
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 3;</code>
   * @return Whether the propertyQuota field is set.
   */
  boolean hasPropertyQuota();
  /**
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 3;</code>
   * @return The propertyQuota.
   */
  com.google.analytics.data.v1alpha.PropertyQuota getPropertyQuota();
  /**
   * <pre>
   * This Analytics Property's quota state including this request.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.PropertyQuota property_quota = 3;</code>
   */
  com.google.analytics.data.v1alpha.PropertyQuotaOrBuilder getPropertyQuotaOrBuilder();

  /**
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#runFunnelReport". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 4;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#runFunnelReport". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 4;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}
