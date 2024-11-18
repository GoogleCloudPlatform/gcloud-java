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

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @return A list containing the machineTypes.
   */
  java.util.List<java.lang.String> getMachineTypesList();
  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @return The count of machineTypes.
   */
  int getMachineTypesCount();
  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @param index The index of the element to return.
   * @return The machineTypes at the given index.
   */
  java.lang.String getMachineTypes(int index);
  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the machineTypes at the given index.
   */
  com.google.protobuf.ByteString getMachineTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
   * </pre>
   *
   * <code>optional int32 rank = 3492908;</code>
   *
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   *
   *
   * <pre>
   * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
   * </pre>
   *
   * <code>optional int32 rank = 3492908;</code>
   *
   * @return The rank.
   */
  int getRank();
}
