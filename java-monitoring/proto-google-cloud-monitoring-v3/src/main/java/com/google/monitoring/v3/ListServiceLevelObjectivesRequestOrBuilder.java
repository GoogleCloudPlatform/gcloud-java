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
// source: google/monitoring/v3/service_service.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface ListServiceLevelObjectivesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListServiceLevelObjectivesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent containing the listed SLOs, either a
   * project or a Monitoring Metrics Scope. The formats are:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   *     workspaces/[HOST_PROJECT_ID_OR_NUMBER]/services/-
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
   * Required. Resource name of the parent containing the listed SLOs, either a
   * project or a Monitoring Metrics Scope. The formats are:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   *     workspaces/[HOST_PROJECT_ID_OR_NUMBER]/services/-
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
   * A filter specifying what `ServiceLevelObjective`s to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filter specifying what `ServiceLevelObjective`s to return.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * A non-negative number that is the maximum number of results to return.
   * When 0, use default page size.
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
   * If this field is not empty then it must contain the `nextPageToken` value
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
   * If this field is not empty then it must contain the `nextPageToken` value
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
   * View of the `ServiceLevelObjective`s to return. If `DEFAULT`, return each
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 5;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * View of the `ServiceLevelObjective`s to return. If `DEFAULT`, return each
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 5;</code>
   *
   * @return The view.
   */
  com.google.monitoring.v3.ServiceLevelObjective.View getView();
}
