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
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.lifesciences.v2beta;

public interface ResourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Resources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return A list containing the regions.
   */
  java.util.List<java.lang.String> getRegionsList();
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return The count of regions.
   */
  int getRegionsCount();
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The regions at the given index.
   */
  java.lang.String getRegions(int index);
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regions at the given index.
   */
  com.google.protobuf.ByteString getRegionsBytes(int index);

  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @return A list containing the zones.
   */
  java.util.List<java.lang.String> getZonesList();
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @return The count of zones.
   */
  int getZonesCount();
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The zones at the given index.
   */
  java.lang.String getZones(int index);
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the zones at the given index.
   */
  com.google.protobuf.ByteString getZonesBytes(int index);

  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   *
   * @return Whether the virtualMachine field is set.
   */
  boolean hasVirtualMachine();
  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   *
   * @return The virtualMachine.
   */
  com.google.cloud.lifesciences.v2beta.VirtualMachine getVirtualMachine();
  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   */
  com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder getVirtualMachineOrBuilder();
}
