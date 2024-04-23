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
// source: google/analytics/admin/v1beta/access_report.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1beta;

public interface AccessNumericFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.AccessNumericFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The operation type for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessNumericFilter.Operation operation = 1;</code>
   *
   * @return The enum numeric value on the wire for operation.
   */
  int getOperationValue();
  /**
   *
   *
   * <pre>
   * The operation type for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.AccessNumericFilter.Operation operation = 1;</code>
   *
   * @return The operation.
   */
  com.google.analytics.admin.v1beta.AccessNumericFilter.Operation getOperation();

  /**
   *
   *
   * <pre>
   * A numeric value or a date value.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * A numeric value or a date value.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue value = 2;</code>
   *
   * @return The value.
   */
  com.google.analytics.admin.v1beta.NumericValue getValue();
  /**
   *
   *
   * <pre>
   * A numeric value or a date value.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.NumericValue value = 2;</code>
   */
  com.google.analytics.admin.v1beta.NumericValueOrBuilder getValueOrBuilder();
}
