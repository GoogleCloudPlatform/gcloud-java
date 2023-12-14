// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/subproperty_event_filter.proto

package com.google.analytics.admin.v1alpha;

public interface SubpropertyEventFilterExpressionListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.SubpropertyEventFilterExpressionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Unordered list. A list of Subproperty event filter expressions
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.SubpropertyEventFilterExpression filter_expressions = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = UNORDERED_LIST];</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.SubpropertyEventFilterExpression> 
      getFilterExpressionsList();
  /**
   * <pre>
   * Required. Unordered list. A list of Subproperty event filter expressions
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.SubpropertyEventFilterExpression filter_expressions = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = UNORDERED_LIST];</code>
   */
  com.google.analytics.admin.v1alpha.SubpropertyEventFilterExpression getFilterExpressions(int index);
  /**
   * <pre>
   * Required. Unordered list. A list of Subproperty event filter expressions
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.SubpropertyEventFilterExpression filter_expressions = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = UNORDERED_LIST];</code>
   */
  int getFilterExpressionsCount();
  /**
   * <pre>
   * Required. Unordered list. A list of Subproperty event filter expressions
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.SubpropertyEventFilterExpression filter_expressions = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = UNORDERED_LIST];</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.SubpropertyEventFilterExpressionOrBuilder> 
      getFilterExpressionsOrBuilderList();
  /**
   * <pre>
   * Required. Unordered list. A list of Subproperty event filter expressions
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.SubpropertyEventFilterExpression filter_expressions = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = UNORDERED_LIST];</code>
   */
  com.google.analytics.admin.v1alpha.SubpropertyEventFilterExpressionOrBuilder getFilterExpressionsOrBuilder(
      int index);
}
