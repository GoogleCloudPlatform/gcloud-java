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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface UsableSubnetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.UsableSubnetwork)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Subnetwork Name.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 1;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Subnetwork Name.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 1;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Network Name.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Network Name.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The range of internal addresses that are owned by this subnetwork.
   * </pre>
   *
   * <code>string ip_cidr_range = 3;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The range of internal addresses that are owned by this subnetwork.
   * </pre>
   *
   * <code>string ip_cidr_range = 3;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 4;
   * </code>
   */
  java.util.List<com.google.container.v1beta1.UsableSubnetworkSecondaryRange>
      getSecondaryIpRangesList();
  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 4;
   * </code>
   */
  com.google.container.v1beta1.UsableSubnetworkSecondaryRange getSecondaryIpRanges(int index);
  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 4;
   * </code>
   */
  int getSecondaryIpRangesCount();
  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 4;
   * </code>
   */
  java.util.List<? extends com.google.container.v1beta1.UsableSubnetworkSecondaryRangeOrBuilder>
      getSecondaryIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 4;
   * </code>
   */
  com.google.container.v1beta1.UsableSubnetworkSecondaryRangeOrBuilder
      getSecondaryIpRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A human readable status message representing the reasons for cases where
   * the caller cannot use the secondary ranges under the subnet. For example if
   * the secondary_ip_ranges is empty due to a permission issue, an insufficient
   * permission message will be given by status_message.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * A human readable status message representing the reasons for cases where
   * the caller cannot use the secondary ranges under the subnet. For example if
   * the secondary_ip_ranges is empty due to a permission issue, an insufficient
   * permission message will be given by status_message.
   * </pre>
   *
   * <code>string status_message = 5;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();
}
