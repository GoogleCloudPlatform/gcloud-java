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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

public interface DatabaseTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.DatabaseType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
   *
   * @return The provider.
   */
  com.google.cloud.clouddms.v1.DatabaseProvider getProvider();

  /**
   *
   *
   * <pre>
   * The database engine.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
   *
   * @return The enum numeric value on the wire for engine.
   */
  int getEngineValue();
  /**
   *
   *
   * <pre>
   * The database engine.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
   *
   * @return The engine.
   */
  com.google.cloud.clouddms.v1.DatabaseEngine getEngine();
}
