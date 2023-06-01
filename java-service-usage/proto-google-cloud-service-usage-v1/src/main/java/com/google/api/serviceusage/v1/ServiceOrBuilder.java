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
// source: google/api/serviceusage/v1/resources.proto

package com.google.api.serviceusage.v1;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the consumer and service.
   *
   * A valid name would be:
   * - projects/123/services/serviceusage.googleapis.com
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the consumer and service.
   *
   * A valid name would be:
   * - projects/123/services/serviceusage.googleapis.com
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the consumer.
   *
   * A valid name would be:
   * - projects/123
   * </pre>
   *
   * <code>string parent = 5;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The resource name of the consumer.
   *
   * A valid name would be:
   * - projects/123
   * </pre>
   *
   * <code>string parent = 5;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   *
   * @return The config.
   */
  com.google.api.serviceusage.v1.ServiceConfig getConfig();
  /**
   *
   *
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   */
  com.google.api.serviceusage.v1.ServiceConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether or not the service has been enabled for use by the consumer.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.State state = 4;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Whether or not the service has been enabled for use by the consumer.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.State state = 4;</code>
   *
   * @return The state.
   */
  com.google.api.serviceusage.v1.State getState();
}
