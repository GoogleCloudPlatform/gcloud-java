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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkconnectivity.v1;

public interface ListGroupsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.ListGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The requested groups.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.Group groups = 1;</code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.Group> getGroupsList();
  /**
   *
   *
   * <pre>
   * The requested groups.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.Group groups = 1;</code>
   */
  com.google.cloud.networkconnectivity.v1.Group getGroups(int index);
  /**
   *
   *
   * <pre>
   * The requested groups.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.Group groups = 1;</code>
   */
  int getGroupsCount();
  /**
   *
   *
   * <pre>
   * The requested groups.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.Group groups = 1;</code>
   */
  java.util.List<? extends com.google.cloud.networkconnectivity.v1.GroupOrBuilder>
      getGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requested groups.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.Group groups = 1;</code>
   */
  com.google.cloud.networkconnectivity.v1.GroupOrBuilder getGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token for the next page of the response. To see more results,
   * use this value as the page_token for your next request. If this value
   * is empty, there are no more results.
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
   * The token for the next page of the response. To see more results,
   * use this value as the page_token for your next request. If this value
   * is empty, there are no more results.
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
   * Hubs that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Hubs that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Hubs that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Hubs that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
