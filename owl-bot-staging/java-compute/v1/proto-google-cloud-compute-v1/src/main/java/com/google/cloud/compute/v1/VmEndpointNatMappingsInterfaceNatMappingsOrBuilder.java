// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface VmEndpointNatMappingsInterfaceNatMappingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string drain_nat_ip_port_ranges = 395440577;</code>
   * @return A list containing the drainNatIpPortRanges.
   */
  java.util.List<java.lang.String>
      getDrainNatIpPortRangesList();
  /**
   * <pre>
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string drain_nat_ip_port_ranges = 395440577;</code>
   * @return The count of drainNatIpPortRanges.
   */
  int getDrainNatIpPortRangesCount();
  /**
   * <pre>
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string drain_nat_ip_port_ranges = 395440577;</code>
   * @param index The index of the element to return.
   * @return The drainNatIpPortRanges at the given index.
   */
  java.lang.String getDrainNatIpPortRanges(int index);
  /**
   * <pre>
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string drain_nat_ip_port_ranges = 395440577;</code>
   * @param index The index of the value to return.
   * @return The bytes of the drainNatIpPortRanges at the given index.
   */
  com.google.protobuf.ByteString
      getDrainNatIpPortRangesBytes(int index);

  /**
   * <pre>
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string nat_ip_port_ranges = 531830810;</code>
   * @return A list containing the natIpPortRanges.
   */
  java.util.List<java.lang.String>
      getNatIpPortRangesList();
  /**
   * <pre>
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string nat_ip_port_ranges = 531830810;</code>
   * @return The count of natIpPortRanges.
   */
  int getNatIpPortRangesCount();
  /**
   * <pre>
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string nat_ip_port_ranges = 531830810;</code>
   * @param index The index of the element to return.
   * @return The natIpPortRanges at the given index.
   */
  java.lang.String getNatIpPortRanges(int index);
  /**
   * <pre>
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example: ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * </pre>
   *
   * <code>repeated string nat_ip_port_ranges = 531830810;</code>
   * @param index The index of the value to return.
   * @return The bytes of the natIpPortRanges at the given index.
   */
  com.google.protobuf.ByteString
      getNatIpPortRangesBytes(int index);

  /**
   * <pre>
   * Total number of drain ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field drain_nat_ip_port_ranges.
   * </pre>
   *
   * <code>optional int32 num_total_drain_nat_ports = 335532793;</code>
   * @return Whether the numTotalDrainNatPorts field is set.
   */
  boolean hasNumTotalDrainNatPorts();
  /**
   * <pre>
   * Total number of drain ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field drain_nat_ip_port_ranges.
   * </pre>
   *
   * <code>optional int32 num_total_drain_nat_ports = 335532793;</code>
   * @return The numTotalDrainNatPorts.
   */
  int getNumTotalDrainNatPorts();

  /**
   * <pre>
   * Total number of ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field nat_ip_port_ranges.
   * </pre>
   *
   * <code>optional int32 num_total_nat_ports = 299904384;</code>
   * @return Whether the numTotalNatPorts field is set.
   */
  boolean hasNumTotalNatPorts();
  /**
   * <pre>
   * Total number of ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field nat_ip_port_ranges.
   * </pre>
   *
   * <code>optional int32 num_total_nat_ports = 299904384;</code>
   * @return The numTotalNatPorts.
   */
  int getNumTotalNatPorts();

  /**
   * <pre>
   * Information about mappings provided by rules in this NAT.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings rule_mappings = 486192968;</code>
   */
  java.util.List<com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings> 
      getRuleMappingsList();
  /**
   * <pre>
   * Information about mappings provided by rules in this NAT.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings rule_mappings = 486192968;</code>
   */
  com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings getRuleMappings(int index);
  /**
   * <pre>
   * Information about mappings provided by rules in this NAT.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings rule_mappings = 486192968;</code>
   */
  int getRuleMappingsCount();
  /**
   * <pre>
   * Information about mappings provided by rules in this NAT.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings rule_mappings = 486192968;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappingsOrBuilder> 
      getRuleMappingsOrBuilderList();
  /**
   * <pre>
   * Information about mappings provided by rules in this NAT.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappings rule_mappings = 486192968;</code>
   */
  com.google.cloud.compute.v1.VmEndpointNatMappingsInterfaceNatMappingsNatRuleMappingsOrBuilder getRuleMappingsOrBuilder(
      int index);

  /**
   * <pre>
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples: "10.33.4.55/32", or "192.168.5.0/24".
   * </pre>
   *
   * <code>optional string source_alias_ip_range = 440340952;</code>
   * @return Whether the sourceAliasIpRange field is set.
   */
  boolean hasSourceAliasIpRange();
  /**
   * <pre>
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples: "10.33.4.55/32", or "192.168.5.0/24".
   * </pre>
   *
   * <code>optional string source_alias_ip_range = 440340952;</code>
   * @return The sourceAliasIpRange.
   */
  java.lang.String getSourceAliasIpRange();
  /**
   * <pre>
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples: "10.33.4.55/32", or "192.168.5.0/24".
   * </pre>
   *
   * <code>optional string source_alias_ip_range = 440340952;</code>
   * @return The bytes for sourceAliasIpRange.
   */
  com.google.protobuf.ByteString
      getSourceAliasIpRangeBytes();

  /**
   * <pre>
   * Primary IP of the VM for this NIC.
   * </pre>
   *
   * <code>optional string source_virtual_ip = 149836159;</code>
   * @return Whether the sourceVirtualIp field is set.
   */
  boolean hasSourceVirtualIp();
  /**
   * <pre>
   * Primary IP of the VM for this NIC.
   * </pre>
   *
   * <code>optional string source_virtual_ip = 149836159;</code>
   * @return The sourceVirtualIp.
   */
  java.lang.String getSourceVirtualIp();
  /**
   * <pre>
   * Primary IP of the VM for this NIC.
   * </pre>
   *
   * <code>optional string source_virtual_ip = 149836159;</code>
   * @return The bytes for sourceVirtualIp.
   */
  com.google.protobuf.ByteString
      getSourceVirtualIpBytes();
}
