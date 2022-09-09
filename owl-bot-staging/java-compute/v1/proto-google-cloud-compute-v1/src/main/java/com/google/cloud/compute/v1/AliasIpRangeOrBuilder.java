// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AliasIpRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AliasIpRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();
  /**
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   * <pre>
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString
      getIpCidrRangeBytes();

  /**
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   * @return Whether the subnetworkRangeName field is set.
   */
  boolean hasSubnetworkRangeName();
  /**
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   * @return The subnetworkRangeName.
   */
  java.lang.String getSubnetworkRangeName();
  /**
   * <pre>
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
   * </pre>
   *
   * <code>optional string subnetwork_range_name = 387995966;</code>
   * @return The bytes for subnetworkRangeName.
   */
  com.google.protobuf.ByteString
      getSubnetworkRangeNameBytes();
}
