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
// source: google/analytics/data/v1beta/analytics_data_api.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1beta;

public interface BatchRunReportsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.BatchRunReportsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * This property must be specified for the batch. The property within
   * RunReportRequest may either be unspecified or consistent with this
   * property.
   *
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * This property must be specified for the batch. The property within
   * RunReportRequest may either be unspecified or consistent with this
   * property.
   *
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate report response. Each
   * batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportRequest requests = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.RunReportRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate report response. Each
   * batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportRequest requests = 2;</code>
   */
  com.google.analytics.data.v1beta.RunReportRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate report response. Each
   * batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate report response. Each
   * batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportRequest requests = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.RunReportRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual requests. Each request has a separate report response. Each
   * batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportRequest requests = 2;</code>
   */
  com.google.analytics.data.v1beta.RunReportRequestOrBuilder getRequestsOrBuilder(int index);
}
