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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface ListTestCaseResultsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ListTestCaseResultsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The test case to list results for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/
   * testCases/&lt;TestCase ID&gt;`. Specify a `-` as a wildcard for TestCase ID to
   * list results across multiple test cases.
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
   * Required. The test case to list results for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/
   * testCases/&lt;TestCase ID&gt;`. Specify a `-` as a wildcard for TestCase ID to
   * list results across multiple test cases.
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
   * The maximum number of items to return in a single page. By default 100 and
   * at most 1000.
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
   * The next_page_token value returned from a previous list request.
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
   * The next_page_token value returned from a previous list request.
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
   * The filter expression used to filter test case results. See
   * [API Filtering](https://aip.dev/160).
   *
   * The expression is case insensitive. Only 'AND' is supported for logical
   * operators. The supported syntax is listed below in detail:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *   [AND latest]
   *
   * The supported fields and operators are:
   * field                 operator
   * `environment`         `=`, `IN`  (Use value `draft` for draft environment)
   * `test_time`           `&gt;`, `&lt;`
   *
   * `latest` only returns the latest test result in all results for each test
   * case.
   *
   * Examples:
   * *   "environment=draft AND latest" matches the latest test result for each
   *     test case in the draft environment.
   * *   "environment IN (e1,e2)" matches any test case results with an
   *     environment resource name of either "e1" or "e2".
   * *   "test_time &gt; 1602540713" matches any test case results with test time
   *     later than a unix timestamp in seconds 1602540713.
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
   * The filter expression used to filter test case results. See
   * [API Filtering](https://aip.dev/160).
   *
   * The expression is case insensitive. Only 'AND' is supported for logical
   * operators. The supported syntax is listed below in detail:
   *
   *   &lt;field&gt; &lt;operator&gt; &lt;value&gt; [AND &lt;field&gt; &lt;operator&gt; &lt;value&gt;] ...
   *   [AND latest]
   *
   * The supported fields and operators are:
   * field                 operator
   * `environment`         `=`, `IN`  (Use value `draft` for draft environment)
   * `test_time`           `&gt;`, `&lt;`
   *
   * `latest` only returns the latest test result in all results for each test
   * case.
   *
   * Examples:
   * *   "environment=draft AND latest" matches the latest test result for each
   *     test case in the draft environment.
   * *   "environment IN (e1,e2)" matches any test case results with an
   *     environment resource name of either "e1" or "e2".
   * *   "test_time &gt; 1602540713" matches any test case results with test time
   *     later than a unix timestamp in seconds 1602540713.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
