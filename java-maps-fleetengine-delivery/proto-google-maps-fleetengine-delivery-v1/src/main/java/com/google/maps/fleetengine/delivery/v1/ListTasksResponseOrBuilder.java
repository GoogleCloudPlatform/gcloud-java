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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.delivery.v1;

public interface ListTasksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.ListTasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of Tasks that meet the requested filtering criteria. When no filter
   * is specified, the request returns all tasks. A successful response can also
   * be empty. An empty response indicates that no Tasks were found meeting the
   * requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  java.util.List<com.google.maps.fleetengine.delivery.v1.Task> getTasksList();
  /**
   *
   *
   * <pre>
   * The set of Tasks that meet the requested filtering criteria. When no filter
   * is specified, the request returns all tasks. A successful response can also
   * be empty. An empty response indicates that no Tasks were found meeting the
   * requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  com.google.maps.fleetengine.delivery.v1.Task getTasks(int index);
  /**
   *
   *
   * <pre>
   * The set of Tasks that meet the requested filtering criteria. When no filter
   * is specified, the request returns all tasks. A successful response can also
   * be empty. An empty response indicates that no Tasks were found meeting the
   * requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  int getTasksCount();
  /**
   *
   *
   * <pre>
   * The set of Tasks that meet the requested filtering criteria. When no filter
   * is specified, the request returns all tasks. A successful response can also
   * be empty. An empty response indicates that no Tasks were found meeting the
   * requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  java.util.List<? extends com.google.maps.fleetengine.delivery.v1.TaskOrBuilder>
      getTasksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The set of Tasks that meet the requested filtering criteria. When no filter
   * is specified, the request returns all tasks. A successful response can also
   * be empty. An empty response indicates that no Tasks were found meeting the
   * requested filter criteria.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskOrBuilder getTasksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pass this token in the `ListTasksRequest` to continue to list results.
   * If all results have been returned, then this field is either an empty
   * string, or it doesn't appear in the response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Pass this token in the `ListTasksRequest` to continue to list results.
   * If all results have been returned, then this field is either an empty
   * string, or it doesn't appear in the response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of Tasks that match the request criteria, across all
   * pages.
   * </pre>
   *
   * <code>int64 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  long getTotalSize();
}
