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
// source: google/cloud/cloudcontrolspartner/v1beta/partners.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface EkmMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.EkmMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud EKM partner.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for ekmSolution.
   */
  int getEkmSolutionValue();
  /**
   *
   *
   * <pre>
   * The Cloud EKM partner.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution ekm_solution = 1;
   * </code>
   *
   * @return The ekmSolution.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.EkmMetadata.EkmSolution getEkmSolution();

  /**
   *
   *
   * <pre>
   * Endpoint for sending requests to the EKM for key provisioning during
   * Assured Workload creation.
   * </pre>
   *
   * <code>string ekm_endpoint_uri = 2;</code>
   *
   * @return The ekmEndpointUri.
   */
  java.lang.String getEkmEndpointUri();
  /**
   *
   *
   * <pre>
   * Endpoint for sending requests to the EKM for key provisioning during
   * Assured Workload creation.
   * </pre>
   *
   * <code>string ekm_endpoint_uri = 2;</code>
   *
   * @return The bytes for ekmEndpointUri.
   */
  com.google.protobuf.ByteString getEkmEndpointUriBytes();
}
