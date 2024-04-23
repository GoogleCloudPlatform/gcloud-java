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
// source: google/cloud/retail/v2/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2;

public interface ImportUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ImportUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. `projects/1234/locations/global/catalogs/default_catalog`
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
   * Required. `projects/1234/locations/global/catalogs/default_catalog`
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
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.retail.v2.UserEventInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEventInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.UserEventInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   *
   * @return The errorsConfig.
   */
  com.google.cloud.retail.v2.ImportErrorsConfig getErrorsConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import. Cannot be set
   * for inline user event imports.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ImportErrorsConfig errors_config = 3;</code>
   */
  com.google.cloud.retail.v2.ImportErrorsConfigOrBuilder getErrorsConfigOrBuilder();
}
