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
// source: google/cloud/gkehub/v1alpha/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.v1alpha;

public interface ListFeaturesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1alpha.ListFeaturesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent (project and location) where the Features will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent (project and location) where the Features will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * When requesting a 'page' of resources, `page_size` specifies number of
   * resources to return. If unspecified or set to 0, all resources will
   * be returned.
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
   * Token returned by previous call to `ListFeatures` which
   * specifies the position in the list from where to continue listing the
   * resources.
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
   * Token returned by previous call to `ListFeatures` which
   * specifies the position in the list from where to continue listing the
   * resources.
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
   * Lists Features that match the filter expression, following the syntax
   * outlined in https://google.aip.dev/160.
   *
   * Examples:
   *
   *   - Feature with the name "servicemesh" in project "foo-proj":
   *
   *       name = "projects/foo-proj/locations/global/features/servicemesh"
   *
   *   - Features that have a label called `foo`:
   *
   *       labels.foo:*
   *
   *   - Features that have a label called `foo` whose value is `bar`:
   *
   *       labels.foo = bar
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Lists Features that match the filter expression, following the syntax
   * outlined in https://google.aip.dev/160.
   *
   * Examples:
   *
   *   - Feature with the name "servicemesh" in project "foo-proj":
   *
   *       name = "projects/foo-proj/locations/global/features/servicemesh"
   *
   *   - Features that have a label called `foo`:
   *
   *       labels.foo:*
   *
   *   - Features that have a label called `foo` whose value is `bar`:
   *
   *       labels.foo = bar
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * One or more fields to compare and use to sort the output.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * One or more fields to compare and use to sort the output.
   * See https://google.aip.dev/132#ordering.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
