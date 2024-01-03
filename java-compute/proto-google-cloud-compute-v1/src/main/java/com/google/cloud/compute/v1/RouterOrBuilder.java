/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.compute.v1;

public interface RouterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Router)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BGP information specific to this router.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgp bgp = 97483;</code>
   *
   * @return Whether the bgp field is set.
   */
  boolean hasBgp();
  /**
   *
   *
   * <pre>
   * BGP information specific to this router.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgp bgp = 97483;</code>
   *
   * @return The bgp.
   */
  com.google.cloud.compute.v1.RouterBgp getBgp();
  /**
   *
   *
   * <pre>
   * BGP information specific to this router.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.RouterBgp bgp = 97483;</code>
   */
  com.google.cloud.compute.v1.RouterBgpOrBuilder getBgpOrBuilder();

  /**
   *
   *
   * <pre>
   * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterBgpPeer bgp_peers = 452695773;</code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterBgpPeer> getBgpPeersList();
  /**
   *
   *
   * <pre>
   * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterBgpPeer bgp_peers = 452695773;</code>
   */
  com.google.cloud.compute.v1.RouterBgpPeer getBgpPeers(int index);
  /**
   *
   *
   * <pre>
   * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterBgpPeer bgp_peers = 452695773;</code>
   */
  int getBgpPeersCount();
  /**
   *
   *
   * <pre>
   * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterBgpPeer bgp_peers = 452695773;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterBgpPeerOrBuilder>
      getBgpPeersOrBuilderList();
  /**
   *
   *
   * <pre>
   * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterBgpPeer bgp_peers = 452695773;</code>
   */
  com.google.cloud.compute.v1.RouterBgpPeerOrBuilder getBgpPeersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments).
   * </pre>
   *
   * <code>optional bool encrypted_interconnect_router = 297996575;</code>
   *
   * @return Whether the encryptedInterconnectRouter field is set.
   */
  boolean hasEncryptedInterconnectRouter();
  /**
   *
   *
   * <pre>
   * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments).
   * </pre>
   *
   * <code>optional bool encrypted_interconnect_router = 297996575;</code>
   *
   * @return The encryptedInterconnectRouter.
   */
  boolean getEncryptedInterconnectRouter();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * Router interfaces. To create a BGP peer that uses a router interface, the interface must have one of the following fields specified: - linkedVpnTunnel - linkedInterconnectAttachment - subnetwork You can create a router interface without any of these fields specified. However, you cannot create a BGP peer that uses that interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterInterface interfaces = 12073562;</code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterInterface> getInterfacesList();
  /**
   *
   *
   * <pre>
   * Router interfaces. To create a BGP peer that uses a router interface, the interface must have one of the following fields specified: - linkedVpnTunnel - linkedInterconnectAttachment - subnetwork You can create a router interface without any of these fields specified. However, you cannot create a BGP peer that uses that interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterInterface interfaces = 12073562;</code>
   */
  com.google.cloud.compute.v1.RouterInterface getInterfaces(int index);
  /**
   *
   *
   * <pre>
   * Router interfaces. To create a BGP peer that uses a router interface, the interface must have one of the following fields specified: - linkedVpnTunnel - linkedInterconnectAttachment - subnetwork You can create a router interface without any of these fields specified. However, you cannot create a BGP peer that uses that interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterInterface interfaces = 12073562;</code>
   */
  int getInterfacesCount();
  /**
   *
   *
   * <pre>
   * Router interfaces. To create a BGP peer that uses a router interface, the interface must have one of the following fields specified: - linkedVpnTunnel - linkedInterconnectAttachment - subnetwork You can create a router interface without any of these fields specified. However, you cannot create a BGP peer that uses that interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterInterface interfaces = 12073562;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterInterfaceOrBuilder>
      getInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Router interfaces. To create a BGP peer that uses a router interface, the interface must have one of the following fields specified: - linkedVpnTunnel - linkedInterconnectAttachment - subnetwork You can create a router interface without any of these fields specified. However, you cannot create a BGP peer that uses that interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterInterface interfaces = 12073562;</code>
   */
  com.google.cloud.compute.v1.RouterInterfaceOrBuilder getInterfacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#router for routers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#router for routers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#router for routers.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Keys used for MD5 authentication.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterMd5AuthenticationKey md5_authentication_keys = 71063322;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterMd5AuthenticationKey>
      getMd5AuthenticationKeysList();
  /**
   *
   *
   * <pre>
   * Keys used for MD5 authentication.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterMd5AuthenticationKey md5_authentication_keys = 71063322;
   * </code>
   */
  com.google.cloud.compute.v1.RouterMd5AuthenticationKey getMd5AuthenticationKeys(int index);
  /**
   *
   *
   * <pre>
   * Keys used for MD5 authentication.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterMd5AuthenticationKey md5_authentication_keys = 71063322;
   * </code>
   */
  int getMd5AuthenticationKeysCount();
  /**
   *
   *
   * <pre>
   * Keys used for MD5 authentication.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterMd5AuthenticationKey md5_authentication_keys = 71063322;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterMd5AuthenticationKeyOrBuilder>
      getMd5AuthenticationKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Keys used for MD5 authentication.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterMd5AuthenticationKey md5_authentication_keys = 71063322;
   * </code>
   */
  com.google.cloud.compute.v1.RouterMd5AuthenticationKeyOrBuilder getMd5AuthenticationKeysOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of NAT services created in this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNat nats = 3373938;</code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterNat> getNatsList();
  /**
   *
   *
   * <pre>
   * A list of NAT services created in this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNat nats = 3373938;</code>
   */
  com.google.cloud.compute.v1.RouterNat getNats(int index);
  /**
   *
   *
   * <pre>
   * A list of NAT services created in this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNat nats = 3373938;</code>
   */
  int getNatsCount();
  /**
   *
   *
   * <pre>
   * A list of NAT services created in this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNat nats = 3373938;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterNatOrBuilder> getNatsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of NAT services created in this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.RouterNat nats = 3373938;</code>
   */
  com.google.cloud.compute.v1.RouterNatOrBuilder getNatsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();
}
