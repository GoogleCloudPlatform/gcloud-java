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
// source: google/cloud/osconfig/v1/os_policy_assignments.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.osconfig.v1;

public interface ListOSPolicyAssignmentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment> getOsPolicyAssignmentsList();
  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignment getOsPolicyAssignments(int index);
  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  int getOsPolicyAssignmentsCount();
  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
      getOsPolicyAssignmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignments.
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
   * The pagination token to retrieve the next page of OS policy assignments.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
