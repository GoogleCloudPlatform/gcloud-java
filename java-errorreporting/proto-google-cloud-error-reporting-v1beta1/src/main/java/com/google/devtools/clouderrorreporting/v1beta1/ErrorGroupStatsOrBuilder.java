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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.clouderrorreporting.v1beta1;

public interface ErrorGroupStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Group data that is independent of the filter criteria.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   *
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   *
   *
   * <pre>
   * Group data that is independent of the filter criteria.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   *
   * @return The group.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup getGroup();
  /**
   *
   *
   * <pre>
   * Group data that is independent of the filter criteria.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder getGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Approximate total number of events in the given group that match
   * the filter criteria.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   *
   * @return The count.
   */
  long getCount();

  /**
   *
   *
   * <pre>
   * Approximate number of affected users in the given group that
   * match the filter criteria.
   * Users are distinguished by data in the `ErrorContext` of the
   * individual error events, such as their login name or their remote
   * IP address in case of HTTP requests.
   * The number of affected users can be zero even if the number of
   * errors is non-zero if no data was provided from which the
   * affected user could be deduced.
   * Users are counted based on data in the request
   * context that was provided in the error report. If more users are
   * implicitly affected, such as due to a crash of the whole service,
   * this is not reflected here.
   * </pre>
   *
   * <code>int64 affected_users_count = 3;</code>
   *
   * @return The affectedUsersCount.
   */
  long getAffectedUsersCount();

  /**
   *
   *
   * <pre>
   * Approximate number of occurrences over time.
   * Timed counts returned by ListGroups are guaranteed to be:
   *
   * - Inside the requested time interval
   * - Non-overlapping, and
   * - Ordered by ascending time.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TimedCount timed_counts = 4;</code>
   */
  java.util.List<com.google.devtools.clouderrorreporting.v1beta1.TimedCount> getTimedCountsList();
  /**
   *
   *
   * <pre>
   * Approximate number of occurrences over time.
   * Timed counts returned by ListGroups are guaranteed to be:
   *
   * - Inside the requested time interval
   * - Non-overlapping, and
   * - Ordered by ascending time.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TimedCount timed_counts = 4;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.TimedCount getTimedCounts(int index);
  /**
   *
   *
   * <pre>
   * Approximate number of occurrences over time.
   * Timed counts returned by ListGroups are guaranteed to be:
   *
   * - Inside the requested time interval
   * - Non-overlapping, and
   * - Ordered by ascending time.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TimedCount timed_counts = 4;</code>
   */
  int getTimedCountsCount();
  /**
   *
   *
   * <pre>
   * Approximate number of occurrences over time.
   * Timed counts returned by ListGroups are guaranteed to be:
   *
   * - Inside the requested time interval
   * - Non-overlapping, and
   * - Ordered by ascending time.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TimedCount timed_counts = 4;</code>
   */
  java.util.List<? extends com.google.devtools.clouderrorreporting.v1beta1.TimedCountOrBuilder>
      getTimedCountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Approximate number of occurrences over time.
   * Timed counts returned by ListGroups are guaranteed to be:
   *
   * - Inside the requested time interval
   * - Non-overlapping, and
   * - Ordered by ascending time.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TimedCount timed_counts = 4;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.TimedCountOrBuilder getTimedCountsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Approximate first occurrence that was ever seen for this group
   * and which matches the given filter criteria, ignoring the
   * time_range that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp first_seen_time = 5;</code>
   *
   * @return Whether the firstSeenTime field is set.
   */
  boolean hasFirstSeenTime();
  /**
   *
   *
   * <pre>
   * Approximate first occurrence that was ever seen for this group
   * and which matches the given filter criteria, ignoring the
   * time_range that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp first_seen_time = 5;</code>
   *
   * @return The firstSeenTime.
   */
  com.google.protobuf.Timestamp getFirstSeenTime();
  /**
   *
   *
   * <pre>
   * Approximate first occurrence that was ever seen for this group
   * and which matches the given filter criteria, ignoring the
   * time_range that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp first_seen_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFirstSeenTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Approximate last occurrence that was ever seen for this group and
   * which matches the given filter criteria, ignoring the time_range
   * that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_seen_time = 6;</code>
   *
   * @return Whether the lastSeenTime field is set.
   */
  boolean hasLastSeenTime();
  /**
   *
   *
   * <pre>
   * Approximate last occurrence that was ever seen for this group and
   * which matches the given filter criteria, ignoring the time_range
   * that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_seen_time = 6;</code>
   *
   * @return The lastSeenTime.
   */
  com.google.protobuf.Timestamp getLastSeenTime();
  /**
   *
   *
   * <pre>
   * Approximate last occurrence that was ever seen for this group and
   * which matches the given filter criteria, ignoring the time_range
   * that was specified in the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_seen_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastSeenTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Service contexts with a non-zero error count for the given filter
   * criteria. This list can be truncated if multiple services are affected.
   * Refer to `num_affected_services` for the total count.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ServiceContext affected_services = 7;
   * </code>
   */
  java.util.List<com.google.devtools.clouderrorreporting.v1beta1.ServiceContext>
      getAffectedServicesList();
  /**
   *
   *
   * <pre>
   * Service contexts with a non-zero error count for the given filter
   * criteria. This list can be truncated if multiple services are affected.
   * Refer to `num_affected_services` for the total count.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ServiceContext affected_services = 7;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContext getAffectedServices(int index);
  /**
   *
   *
   * <pre>
   * Service contexts with a non-zero error count for the given filter
   * criteria. This list can be truncated if multiple services are affected.
   * Refer to `num_affected_services` for the total count.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ServiceContext affected_services = 7;
   * </code>
   */
  int getAffectedServicesCount();
  /**
   *
   *
   * <pre>
   * Service contexts with a non-zero error count for the given filter
   * criteria. This list can be truncated if multiple services are affected.
   * Refer to `num_affected_services` for the total count.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ServiceContext affected_services = 7;
   * </code>
   */
  java.util.List<? extends com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder>
      getAffectedServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Service contexts with a non-zero error count for the given filter
   * criteria. This list can be truncated if multiple services are affected.
   * Refer to `num_affected_services` for the total count.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ServiceContext affected_services = 7;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder
      getAffectedServicesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The total number of services with a non-zero error count for the given
   * filter criteria.
   * </pre>
   *
   * <code>int32 num_affected_services = 8;</code>
   *
   * @return The numAffectedServices.
   */
  int getNumAffectedServices();

  /**
   *
   *
   * <pre>
   * An arbitrary event that is chosen as representative for the whole group.
   * The representative event is intended to be used as a quick preview for
   * the whole group. Events in the group are usually sufficiently similar
   * to each other such that showing an arbitrary representative provides
   * insight into the characteristics of the group as a whole.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorEvent representative = 9;</code>
   *
   * @return Whether the representative field is set.
   */
  boolean hasRepresentative();
  /**
   *
   *
   * <pre>
   * An arbitrary event that is chosen as representative for the whole group.
   * The representative event is intended to be used as a quick preview for
   * the whole group. Events in the group are usually sufficiently similar
   * to each other such that showing an arbitrary representative provides
   * insight into the characteristics of the group as a whole.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorEvent representative = 9;</code>
   *
   * @return The representative.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorEvent getRepresentative();
  /**
   *
   *
   * <pre>
   * An arbitrary event that is chosen as representative for the whole group.
   * The representative event is intended to be used as a quick preview for
   * the whole group. Events in the group are usually sufficiently similar
   * to each other such that showing an arbitrary representative provides
   * insight into the characteristics of the group as a whole.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorEvent representative = 9;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorEventOrBuilder getRepresentativeOrBuilder();
}
