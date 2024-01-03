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
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

public interface ListBillingAccountsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.ListBillingAccountsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Requested page size. The maximum page size is 100; this is also the
   * default.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results to return. This should be a
   * `next_page_token` value returned from a previous `ListBillingAccounts`
   * call. If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results to return. This should be a
   * `next_page_token` value returned from a previous `ListBillingAccounts`
   * call. If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Options for how to filter the returned billing accounts.
   * This only supports filtering for
   * [subaccounts](https://cloud.google.com/billing/docs/concepts) under a
   * single provided parent billing account.
   * (for example,
   * `master_billing_account=billingAccounts/012345-678901-ABCDEF`).
   * Boolean algebra and other fields are not currently supported.
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
   * Options for how to filter the returned billing accounts.
   * This only supports filtering for
   * [subaccounts](https://cloud.google.com/billing/docs/concepts) under a
   * single provided parent billing account.
   * (for example,
   * `master_billing_account=billingAccounts/012345-678901-ABCDEF`).
   * Boolean algebra and other fields are not currently supported.
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
   * Optional. The parent resource to list billing accounts from.
   * Format:
   *   - `organizations/{organization_id}`, for example,
   *     `organizations/12345678`
   *   - `billingAccounts/{billing_account_id}`, for example,
   *     `billingAccounts/012345-567890-ABCDEF`
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. The parent resource to list billing accounts from.
   * Format:
   *   - `organizations/{organization_id}`, for example,
   *     `organizations/12345678`
   *   - `billingAccounts/{billing_account_id}`, for example,
   *     `billingAccounts/012345-567890-ABCDEF`
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
