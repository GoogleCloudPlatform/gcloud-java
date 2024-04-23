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
// source: google/monitoring/v3/group_service.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface ListGroupMembersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListGroupMembersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The group whose members are listed. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * </pre>
   *
   * <code>
   * string name = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The group whose members are listed. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * </pre>
   *
   * <code>
   * string name = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A positive number that is the maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `next_page_token` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `next_page_token` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * An optional [list
   * filter](https://cloud.google.com/monitoring/api/learn_more#filtering)
   * describing the members to be returned.  The filter may reference the type,
   * labels, and metadata of monitored resources that comprise the group. For
   * example, to return only resources representing Compute Engine VM instances,
   * use this filter:
   *
   *     `resource.type = "gce_instance"`
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * An optional [list
   * filter](https://cloud.google.com/monitoring/api/learn_more#filtering)
   * describing the members to be returned.  The filter may reference the type,
   * labels, and metadata of monitored resources that comprise the group. For
   * example, to return only resources representing Compute Engine VM instances,
   * use this filter:
   *
   *     `resource.type = "gce_instance"`
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * An optional time interval for which results should be returned. Only
   * members that were part of the group during the specified interval are
   * included in the response.  If no interval is provided then the group
   * membership over the last minute is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 6;</code>
   *
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   *
   *
   * <pre>
   * An optional time interval for which results should be returned. Only
   * members that were part of the group during the specified interval are
   * included in the response.  If no interval is provided then the group
   * membership over the last minute is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 6;</code>
   *
   * @return The interval.
   */
  com.google.monitoring.v3.TimeInterval getInterval();
  /**
   *
   *
   * <pre>
   * An optional time interval for which results should be returned. Only
   * members that were part of the group during the specified interval are
   * included in the response.  If no interval is provided then the group
   * membership over the last minute is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 6;</code>
   */
  com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder();
}
