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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.accessapproval.v1;

public interface ListApprovalRequestsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.ListApprovalRequestsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  java.util.List<com.google.cloud.accessapproval.v1.ApprovalRequest> getApprovalRequestsList();
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  com.google.cloud.accessapproval.v1.ApprovalRequest getApprovalRequests(int index);
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  int getApprovalRequestsCount();
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder>
      getApprovalRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Approval request details.
   * </pre>
   *
   * <code>repeated .google.cloud.accessapproval.v1.ApprovalRequest approval_requests = 1;</code>
   */
  com.google.cloud.accessapproval.v1.ApprovalRequestOrBuilder getApprovalRequestsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more.
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
   * Token to retrieve the next page of results, or empty if there are no more.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
