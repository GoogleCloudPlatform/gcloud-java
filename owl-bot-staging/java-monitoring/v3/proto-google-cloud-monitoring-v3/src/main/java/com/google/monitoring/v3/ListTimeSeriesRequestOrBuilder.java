// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface ListTimeSeriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   * organization or folder on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   *     organizations/[ORGANIZATION_ID]
   *     folders/[FOLDER_ID]
   * </pre>
   *
   * <code>string name = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   * organization or folder on which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   *     organizations/[ORGANIZATION_ID]
   *     folders/[FOLDER_ID]
   * </pre>
   *
   * <code>string name = 10 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * that specifies which time series should be returned.  The filter must
   * specify a single metric type, and can additionally specify metric labels
   * and other information. For example:
   *     metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *         metric.labels.instance_name = "my-instance-name"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Required. A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * that specifies which time series should be returned.  The filter must
   * specify a single metric type, and can additionally specify metric labels
   * and other information. For example:
   *     metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *         metric.labels.instance_name = "my-instance-name"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Required. The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * Required. The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The interval.
   */
  com.google.monitoring.v3.TimeInterval getInterval();
  /**
   * <pre>
   * Required. The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * Specifies the alignment of data points in individual time series as
   * well as how to combine the retrieved time series across specified labels.
   * By default (if no `aggregation` is explicitly specified), the raw time
   * series data is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   * @return Whether the aggregation field is set.
   */
  boolean hasAggregation();
  /**
   * <pre>
   * Specifies the alignment of data points in individual time series as
   * well as how to combine the retrieved time series across specified labels.
   * By default (if no `aggregation` is explicitly specified), the raw time
   * series data is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   * @return The aggregation.
   */
  com.google.monitoring.v3.Aggregation getAggregation();
  /**
   * <pre>
   * Specifies the alignment of data points in individual time series as
   * well as how to combine the retrieved time series across specified labels.
   * By default (if no `aggregation` is explicitly specified), the raw time
   * series data is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   */
  com.google.monitoring.v3.AggregationOrBuilder getAggregationOrBuilder();

  /**
   * <pre>
   * Apply a second aggregation after `aggregation` is applied. May only be
   * specified if `aggregation` is specified.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation secondary_aggregation = 11;</code>
   * @return Whether the secondaryAggregation field is set.
   */
  boolean hasSecondaryAggregation();
  /**
   * <pre>
   * Apply a second aggregation after `aggregation` is applied. May only be
   * specified if `aggregation` is specified.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation secondary_aggregation = 11;</code>
   * @return The secondaryAggregation.
   */
  com.google.monitoring.v3.Aggregation getSecondaryAggregation();
  /**
   * <pre>
   * Apply a second aggregation after `aggregation` is applied. May only be
   * specified if `aggregation` is specified.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation secondary_aggregation = 11;</code>
   */
  com.google.monitoring.v3.AggregationOrBuilder getSecondaryAggregationOrBuilder();

  /**
   * <pre>
   * Unsupported: must be left blank. The points in each time series are
   * currently returned in reverse time order (most recent to oldest).
   * </pre>
   *
   * <code>string order_by = 6;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Unsupported: must be left blank. The points in each time series are
   * currently returned in reverse time order (most recent to oldest).
   * </pre>
   *
   * <code>string order_by = 6;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Required. Specifies which information is returned about the time series.
   * </pre>
   *
   * <code>.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView view = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Required. Specifies which information is returned about the time series.
   * </pre>
   *
   * <code>.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView view = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The view.
   */
  com.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView getView();

  /**
   * <pre>
   * A positive number that is the maximum number of results to return. If
   * `page_size` is empty or more than 100,000 results, the effective
   * `page_size` is 100,000 results. If `view` is set to `FULL`, this is the
   * maximum number of `Points` returned. If `view` is set to `HEADERS`, this is
   * the maximum number of `TimeSeries` returned.
   * </pre>
   *
   * <code>int32 page_size = 8;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 9;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 9;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
