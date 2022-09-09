// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface CreateMetricDescriptorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateMetricDescriptorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   * 4
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   * 4
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metricDescriptor field is set.
   */
  boolean hasMetricDescriptor();
  /**
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metricDescriptor.
   */
  com.google.api.MetricDescriptor getMetricDescriptor();
  /**
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.api.MetricDescriptorOrBuilder getMetricDescriptorOrBuilder();
}
