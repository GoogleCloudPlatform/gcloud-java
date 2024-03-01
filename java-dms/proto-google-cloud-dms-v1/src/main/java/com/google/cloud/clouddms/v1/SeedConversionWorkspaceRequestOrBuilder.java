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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

public interface SeedConversionWorkspaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.SeedConversionWorkspaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the conversion workspace resource to seed with new database
   * structure, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the conversion workspace resource to seed with new database
   * structure, in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Should the conversion workspace be committed automatically after the
   * seed operation.
   * </pre>
   *
   * <code>bool auto_commit = 2;</code>
   *
   * @return The autoCommit.
   */
  boolean getAutoCommit();

  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the source connection profile.
   * </pre>
   *
   * <code>string source_connection_profile = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the sourceConnectionProfile field is set.
   */
  boolean hasSourceConnectionProfile();
  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the source connection profile.
   * </pre>
   *
   * <code>string source_connection_profile = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceConnectionProfile.
   */
  java.lang.String getSourceConnectionProfile();
  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the source connection profile.
   * </pre>
   *
   * <code>string source_connection_profile = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sourceConnectionProfile.
   */
  com.google.protobuf.ByteString getSourceConnectionProfileBytes();

  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the destination connection
   * profile.
   * </pre>
   *
   * <code>string destination_connection_profile = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the destinationConnectionProfile field is set.
   */
  boolean hasDestinationConnectionProfile();
  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the destination connection
   * profile.
   * </pre>
   *
   * <code>string destination_connection_profile = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The destinationConnectionProfile.
   */
  java.lang.String getDestinationConnectionProfile();
  /**
   *
   *
   * <pre>
   * Optional. Fully qualified (Uri) name of the destination connection
   * profile.
   * </pre>
   *
   * <code>string destination_connection_profile = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for destinationConnectionProfile.
   */
  com.google.protobuf.ByteString getDestinationConnectionProfileBytes();

  com.google.cloud.clouddms.v1.SeedConversionWorkspaceRequest.SeedFromCase getSeedFromCase();
}
