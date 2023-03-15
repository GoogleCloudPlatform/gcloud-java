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
// source: google/api/serviceusage/v1/serviceusage.proto

package com.google.api.serviceusage.v1;

public interface DisableServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1.DisableServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the consumer and service to disable the service on.
   * The enable and disable methods currently only support projects.
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com` where `123` is the
   * project number.
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
   * Name of the consumer and service to disable the service on.
   * The enable and disable methods currently only support projects.
   * An example name would be:
   * `projects/123/services/serviceusage.googleapis.com` where `123` is the
   * project number.
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
   * Indicates if services that are enabled and which depend on this service
   * should also be disabled. If not set, an error will be generated if any
   * enabled services depend on the service to be disabled. When set, the
   * service, and any enabled services that depend on it, will be disabled
   * together.
   * </pre>
   *
   * <code>bool disable_dependent_services = 2;</code>
   *
   * @return The disableDependentServices.
   */
  boolean getDisableDependentServices();

  /**
   *
   *
   * <pre>
   * Defines the behavior for checking service usage when disabling a service.
   * </pre>
   *
   * <code>
   * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for checkIfServiceHasUsage.
   */
  int getCheckIfServiceHasUsageValue();
  /**
   *
   *
   * <pre>
   * Defines the behavior for checking service usage when disabling a service.
   * </pre>
   *
   * <code>
   * .google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage check_if_service_has_usage = 3;
   * </code>
   *
   * @return The checkIfServiceHasUsage.
   */
  com.google.api.serviceusage.v1.DisableServiceRequest.CheckIfServiceHasUsage
      getCheckIfServiceHasUsage();
}
