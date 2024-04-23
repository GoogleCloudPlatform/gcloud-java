/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface AudienceFilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AudienceFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * AudienceFilterExpressions with or_group. This must be set for the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * AudienceFilterExpressions with or_group. This must be set for the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionList getAndGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * AudienceFilterExpressions with or_group. This must be set for the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionListOrBuilder getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * AudienceFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * AudienceFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionList getOrGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * AudienceFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionListOrBuilder getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (For example, inverted, complemented).
   * It can only include a dimension_or_metric_filter. This cannot be set on
   * the top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (For example, inverted, complemented).
   * It can only include a dimension_or_metric_filter. This cannot be set on
   * the top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpression getNotExpression();
  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (For example, inverted, complemented).
   * It can only include a dimension_or_metric_filter. This cannot be set on
   * the top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression not_expression = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter on a single dimension or metric. This cannot be set on the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter dimension_or_metric_filter = 4;
   * </code>
   *
   * @return Whether the dimensionOrMetricFilter field is set.
   */
  boolean hasDimensionOrMetricFilter();
  /**
   *
   *
   * <pre>
   * A filter on a single dimension or metric. This cannot be set on the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter dimension_or_metric_filter = 4;
   * </code>
   *
   * @return The dimensionOrMetricFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter getDimensionOrMetricFilter();
  /**
   *
   *
   * <pre>
   * A filter on a single dimension or metric. This cannot be set on the top
   * level AudienceFilterExpression.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter dimension_or_metric_filter = 4;
   * </code>
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilterOrBuilder
      getDimensionOrMetricFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Creates a filter that matches a specific event. This cannot be set on the
   * top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceEventFilter event_filter = 5;</code>
   *
   * @return Whether the eventFilter field is set.
   */
  boolean hasEventFilter();
  /**
   *
   *
   * <pre>
   * Creates a filter that matches a specific event. This cannot be set on the
   * top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceEventFilter event_filter = 5;</code>
   *
   * @return The eventFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceEventFilter getEventFilter();
  /**
   *
   *
   * <pre>
   * Creates a filter that matches a specific event. This cannot be set on the
   * top level AudienceFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceEventFilter event_filter = 5;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceEventFilterOrBuilder getEventFilterOrBuilder();

  com.google.analytics.admin.v1alpha.AudienceFilterExpression.ExprCase getExprCase();
}
