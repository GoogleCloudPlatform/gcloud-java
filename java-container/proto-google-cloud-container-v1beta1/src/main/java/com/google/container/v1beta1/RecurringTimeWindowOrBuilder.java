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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface RecurringTimeWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.RecurringTimeWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  boolean hasWindow();
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   *
   * @return The window.
   */
  com.google.container.v1beta1.TimeWindow getWindow();
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1beta1.TimeWindow window = 1;</code>
   */
  com.google.container.v1beta1.TimeWindowOrBuilder getWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   *
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   *
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   *
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   *
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   *
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   *
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The recurrence.
   */
  java.lang.String getRecurrence();
  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   *
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   *
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   *
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   *
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   *
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   *
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The bytes for recurrence.
   */
  com.google.protobuf.ByteString getRecurrenceBytes();
}
