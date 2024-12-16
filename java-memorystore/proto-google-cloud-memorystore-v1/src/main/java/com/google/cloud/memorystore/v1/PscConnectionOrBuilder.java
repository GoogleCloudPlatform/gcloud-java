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
// source: google/cloud/memorystore/v1/memorystore.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.memorystore.v1;

public interface PscConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memorystore.v1.PscConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The PSC connection id of the forwarding rule connected to the
   * service attachment.
   * </pre>
   *
   * <code>string psc_connection_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pscConnectionId.
   */
  java.lang.String getPscConnectionId();
  /**
   *
   *
   * <pre>
   * Output only. The PSC connection id of the forwarding rule connected to the
   * service attachment.
   * </pre>
   *
   * <code>string psc_connection_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pscConnectionId.
   */
  com.google.protobuf.ByteString getPscConnectionIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The IP allocated on the consumer network for the PSC forwarding
   * rule.
   * </pre>
   *
   * <code>
   * string ip_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Required. The IP allocated on the consumer network for the PSC forwarding
   * rule.
   * </pre>
   *
   * <code>
   * string ip_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Required. The URI of the consumer side forwarding rule.
   * Format:
   * projects/{project}/regions/{region}/forwardingRules/{forwarding_rule}
   * </pre>
   *
   * <code>
   * string forwarding_rule = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The forwardingRule.
   */
  java.lang.String getForwardingRule();
  /**
   *
   *
   * <pre>
   * Required. The URI of the consumer side forwarding rule.
   * Format:
   * projects/{project}/regions/{region}/forwardingRules/{forwarding_rule}
   * </pre>
   *
   * <code>
   * string forwarding_rule = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for forwardingRule.
   */
  com.google.protobuf.ByteString getForwardingRuleBytes();

  /**
   *
   *
   * <pre>
   * Output only. The consumer project_id where the forwarding rule is created
   * from.
   * </pre>
   *
   * <code>string project_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. The consumer project_id where the forwarding rule is created
   * from.
   * </pre>
   *
   * <code>string project_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * </pre>
   *
   * <code>
   * string network = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Required. The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * </pre>
   *
   * <code>
   * string network = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Required. The service attachment which is the target of the PSC connection,
   * in the form of
   * projects/{project-id}/regions/{region}/serviceAttachments/{service-attachment-id}.
   * </pre>
   *
   * <code>
   * string service_attachment = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceAttachment.
   */
  java.lang.String getServiceAttachment();
  /**
   *
   *
   * <pre>
   * Required. The service attachment which is the target of the PSC connection,
   * in the form of
   * projects/{project-id}/regions/{region}/serviceAttachments/{service-attachment-id}.
   * </pre>
   *
   * <code>
   * string service_attachment = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceAttachment.
   */
  com.google.protobuf.ByteString getServiceAttachmentBytes();

  /**
   *
   *
   * <pre>
   * Output only. The status of the PSC connection: whether a connection exists
   * and ACTIVE or it no longer exists. Please note that this value is updated
   * periodically. Please use Private Service Connect APIs for the latest
   * status.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.PscConnectionStatus psc_connection_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for pscConnectionStatus.
   */
  int getPscConnectionStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. The status of the PSC connection: whether a connection exists
   * and ACTIVE or it no longer exists. Please note that this value is updated
   * periodically. Please use Private Service Connect APIs for the latest
   * status.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.PscConnectionStatus psc_connection_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pscConnectionStatus.
   */
  com.google.cloud.memorystore.v1.PscConnectionStatus getPscConnectionStatus();

  /**
   *
   *
   * <pre>
   * Output only. Type of the PSC connection.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.ConnectionType connection_type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for connectionType.
   */
  int getConnectionTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of the PSC connection.
   * </pre>
   *
   * <code>
   * .google.cloud.memorystore.v1.ConnectionType connection_type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The connectionType.
   */
  com.google.cloud.memorystore.v1.ConnectionType getConnectionType();
}
