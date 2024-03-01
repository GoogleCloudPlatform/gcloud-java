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
// source: google/cloud/edgenetwork/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.edgenetwork.v1;

public interface InterconnectAttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.InterconnectAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The canonical resource name of the interconnect attachment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The canonical resource name of the interconnect attachment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the interconnect attachment was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. The canonical name of underlying Interconnect object that this
   * attachment's traffic will traverse through. The name is in the form of
   * `projects/{project}/locations/{location}/zones/{zone}/interconnects/{interconnect}`.
   * </pre>
   *
   * <code>
   * string interconnect = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The interconnect.
   */
  java.lang.String getInterconnect();
  /**
   *
   *
   * <pre>
   * Required. The canonical name of underlying Interconnect object that this
   * attachment's traffic will traverse through. The name is in the form of
   * `projects/{project}/locations/{location}/zones/{zone}/interconnects/{interconnect}`.
   * </pre>
   *
   * <code>
   * string interconnect = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for interconnect.
   */
  com.google.protobuf.ByteString getInterconnectBytes();

  /**
   *
   *
   * <pre>
   * Optional. The canonical Network name in the form of
   * `projects/{project}/locations/{location}/zones/{zone}/networks/{network}`.
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The canonical Network name in the form of
   * `projects/{project}/locations/{location}/zones/{zone}/networks/{network}`.
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Required. VLAN id provided by user. Must be site-wise unique.
   * </pre>
   *
   * <code>int32 vlan_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vlanId.
   */
  int getVlanId();

  /**
   *
   *
   * <pre>
   * IP (L3) MTU value of the virtual edge cloud.
   * Valid values are: 1500 and 9000.
   * Default to 1500 if not set.
   * </pre>
   *
   * <code>int32 mtu = 9;</code>
   *
   * @return The mtu.
   */
  int getMtu();

  /**
   *
   *
   * <pre>
   * Output only. Current stage of the resource to the device by config push.
   * </pre>
   *
   * <code>
   * .google.cloud.edgenetwork.v1.ResourceState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current stage of the resource to the device by config push.
   * </pre>
   *
   * <code>
   * .google.cloud.edgenetwork.v1.ResourceState state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.edgenetwork.v1.ResourceState getState();
}
