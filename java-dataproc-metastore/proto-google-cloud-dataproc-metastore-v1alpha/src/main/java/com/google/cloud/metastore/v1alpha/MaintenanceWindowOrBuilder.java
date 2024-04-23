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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.metastore.v1alpha;

public interface MaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   *
   * @return Whether the hourOfDay field is set.
   */
  boolean hasHourOfDay();
  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   *
   * @return The hourOfDay.
   */
  com.google.protobuf.Int32Value getHourOfDay();
  /**
   *
   *
   * <pre>
   * The hour of day (0-23) when the window starts.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value hour_of_day = 1;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getHourOfDayOrBuilder();

  /**
   *
   *
   * <pre>
   * The day of week, when the window starts.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  int getDayOfWeekValue();
  /**
   *
   *
   * <pre>
   * The day of week, when the window starts.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day_of_week = 2;</code>
   *
   * @return The dayOfWeek.
   */
  com.google.type.DayOfWeek getDayOfWeek();
}
