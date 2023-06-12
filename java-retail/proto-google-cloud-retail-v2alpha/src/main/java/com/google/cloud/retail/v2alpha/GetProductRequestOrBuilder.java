/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/retail/v2alpha/product_service.proto

package com.google.cloud.retail.v2alpha;

public interface GetProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.GetProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2alpha.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2alpha.Product], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the requested [Product][google.cloud.retail.v2alpha.Product] does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2alpha.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2alpha.Product], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the requested [Product][google.cloud.retail.v2alpha.Product] does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
