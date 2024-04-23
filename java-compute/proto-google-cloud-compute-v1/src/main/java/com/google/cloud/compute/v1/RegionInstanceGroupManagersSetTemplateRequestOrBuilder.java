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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface RegionInstanceGroupManagersSetTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL of the InstanceTemplate resource from which all new instances will be created.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return Whether the instanceTemplate field is set.
   */
  boolean hasInstanceTemplate();
  /**
   *
   *
   * <pre>
   * URL of the InstanceTemplate resource from which all new instances will be created.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return The instanceTemplate.
   */
  java.lang.String getInstanceTemplate();
  /**
   *
   *
   * <pre>
   * URL of the InstanceTemplate resource from which all new instances will be created.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   *
   * @return The bytes for instanceTemplate.
   */
  com.google.protobuf.ByteString getInstanceTemplateBytes();
}
