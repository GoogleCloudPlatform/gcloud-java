/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1;

public interface ListOSPolicyAssignmentReportsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/reports`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance}`, either `instance-name`, `instance-id`, or `-` can be
   * provided. If '-' is provided, the response will include
   * OSPolicyAssignmentReports for all instances in the project/location.
   * For `{assignment}`, either `assignment-id` or `-` can be provided. If '-'
   * is provided, the response will include OSPolicyAssignmentReports for all
   * OSPolicyAssignments in the project/location.
   * Either {instance} or {assignment} must be `-`.
   * For example:
   * `projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/-/reports`
   *  returns all reports for the instance
   * `projects/{project}/locations/{location}/instances/-/osPolicyAssignments/{assignment-id}/reports`
   *  returns all the reports for the given assignment across all instances.
   * `projects/{project}/locations/{location}/instances/-/osPolicyAssignments/-/reports`
   *  returns all the reports for all assignments across all instances.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/reports`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance}`, either `instance-name`, `instance-id`, or `-` can be
   * provided. If '-' is provided, the response will include
   * OSPolicyAssignmentReports for all instances in the project/location.
   * For `{assignment}`, either `assignment-id` or `-` can be provided. If '-'
   * is provided, the response will include OSPolicyAssignmentReports for all
   * OSPolicyAssignments in the project/location.
   * Either {instance} or {assignment} must be `-`.
   * For example:
   * `projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/-/reports`
   *  returns all reports for the instance
   * `projects/{project}/locations/{location}/instances/-/osPolicyAssignments/{assignment-id}/reports`
   *  returns all the reports for the given assignment across all instances.
   * `projects/{project}/locations/{location}/instances/-/osPolicyAssignments/-/reports`
   *  returns all the reports for all assignments across all instances.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If provided, this field specifies the criteria that must be met by the
   * `OSPolicyAssignmentReport` API resource that is included in the response.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * If provided, this field specifies the criteria that must be met by the
   * `OSPolicyAssignmentReport` API resource that is included in the response.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to the
   * `ListOSPolicyAssignmentReports` method that indicates where this listing
   * should continue from.
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
   * A pagination token returned from a previous call to the
   * `ListOSPolicyAssignmentReports` method that indicates where this listing
   * should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
