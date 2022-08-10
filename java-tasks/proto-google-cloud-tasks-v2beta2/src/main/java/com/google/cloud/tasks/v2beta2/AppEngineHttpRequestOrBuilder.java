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
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

public interface AppEngineHttpRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AppEngineHttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * The app's request handler for the task's target URL must be able to handle
   * HTTP requests with this http_method, otherwise the task attempt fails with
   * error code 405 (Method Not Allowed). See [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
   * and the App Engine documentation for your runtime on [How Requests are
   * Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.HttpMethod http_method = 1;</code>
   *
   * @return The enum numeric value on the wire for httpMethod.
   */
  int getHttpMethodValue();
  /**
   *
   *
   * <pre>
   * The HTTP method to use for the request. The default is POST.
   * The app's request handler for the task's target URL must be able to handle
   * HTTP requests with this http_method, otherwise the task attempt fails with
   * error code 405 (Method Not Allowed). See [Writing a push task request
   * handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
   * and the App Engine documentation for your runtime on [How Requests are
   * Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.HttpMethod http_method = 1;</code>
   *
   * @return The httpMethod.
   */
  com.google.cloud.tasks.v2beta2.HttpMethod getHttpMethod();

  /**
   *
   *
   * <pre>
   * Task-level setting for App Engine routing.
   * If set,
   * [app_engine_routing_override][google.cloud.tasks.v2beta2.AppEngineHttpTarget.app_engine_routing_override]
   * is used for all tasks in the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing = 2;</code>
   *
   * @return Whether the appEngineRouting field is set.
   */
  boolean hasAppEngineRouting();
  /**
   *
   *
   * <pre>
   * Task-level setting for App Engine routing.
   * If set,
   * [app_engine_routing_override][google.cloud.tasks.v2beta2.AppEngineHttpTarget.app_engine_routing_override]
   * is used for all tasks in the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing = 2;</code>
   *
   * @return The appEngineRouting.
   */
  com.google.cloud.tasks.v2beta2.AppEngineRouting getAppEngineRouting();
  /**
   *
   *
   * <pre>
   * Task-level setting for App Engine routing.
   * If set,
   * [app_engine_routing_override][google.cloud.tasks.v2beta2.AppEngineHttpTarget.app_engine_routing_override]
   * is used for all tasks in the queue, no matter what the setting is for the
   * [task-level app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing = 2;</code>
   */
  com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder getAppEngineRoutingOrBuilder();

  /**
   *
   *
   * <pre>
   * The relative URL.
   * The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path and query string arguments.
   * If the relative URL is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_url = 3;</code>
   *
   * @return The relativeUrl.
   */
  java.lang.String getRelativeUrl();
  /**
   *
   *
   * <pre>
   * The relative URL.
   * The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path and query string arguments.
   * If the relative URL is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_url = 3;</code>
   *
   * @return The bytes for relativeUrl.
   */
  com.google.protobuf.ByteString getRelativeUrlBytes();

  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [payload][google.cloud.tasks.v2beta2.AppEngineHttpRequest.payload], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2beta2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [payload][google.cloud.tasks.v2beta2.AppEngineHttpRequest.payload], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2beta2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  boolean containsHeaders(java.lang.String key);
  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [payload][google.cloud.tasks.v2beta2.AppEngineHttpRequest.payload], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2beta2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [payload][google.cloud.tasks.v2beta2.AppEngineHttpRequest.payload], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2beta2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */

  /* nullable */
  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values.
   * Headers can be set when the
   * [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   * Repeated headers are not supported but a header value can contain commas.
   * Cloud Tasks sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Tasks will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the task has a [payload][google.cloud.tasks.v2beta2.AppEngineHttpRequest.payload], Cloud
   * Tasks sets the following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explicitly
   *   setting `Content-Type` to a particular media type when the
   *   [task is created][google.cloud.tasks.v2beta2.CloudTasks.CreateTask].
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Tasks. This value is
   *   output only.   It cannot be changed.
   * The headers below cannot be set or overridden:
   * * `Host`
   * * `X-Google-*`
   * * `X-AppEngine-*`
   * In addition, Cloud Tasks sets some headers when the task is dispatched,
   * such as headers containing information about the task; see
   * [request
   * headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * These headers are set only when the task is dispatched, so they are not
   * visible when the task is returned in a Cloud Tasks response.
   * Although there is no specific limit for the maximum number of headers or
   * the size, there is a limit on the maximum size of the [Task][google.cloud.tasks.v2beta2.Task]. For more
   * information, see the [CreateTask][google.cloud.tasks.v2beta2.CloudTasks.CreateTask] documentation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.lang.String getHeadersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Payload.
   * The payload will be sent as the HTTP message body. A message
   * body, and thus a payload, is allowed only if the HTTP method is
   * POST or PUT. It is an error to set a data payload on a task with
   * an incompatible [HttpMethod][google.cloud.tasks.v2beta2.HttpMethod].
   * </pre>
   *
   * <code>bytes payload = 5;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}
