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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datafusion.v1beta1;

public interface ListNamespacesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.ListNamespacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The instance to list its namespaces.
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
   * Required. The instance to list its namespaces.
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
   * The maximum number of items to return.
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
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * By default, only basic information about a namespace is returned
   * (e.g. name). When `NAMESPACE_VIEW_FULL` is specified, additional
   * information associated with a namespace gets returned
   * (e.g. IAM policy set on the namespace)
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.NamespaceView view = 4;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * By default, only basic information about a namespace is returned
   * (e.g. name). When `NAMESPACE_VIEW_FULL` is specified, additional
   * information associated with a namespace gets returned
   * (e.g. IAM policy set on the namespace)
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.NamespaceView view = 4;</code>
   *
   * @return The view.
   */
  com.google.cloud.datafusion.v1beta1.NamespaceView getView();
}
