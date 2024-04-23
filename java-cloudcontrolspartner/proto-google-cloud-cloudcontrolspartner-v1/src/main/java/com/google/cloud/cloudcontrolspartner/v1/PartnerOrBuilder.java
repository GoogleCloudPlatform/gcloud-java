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
// source: google/cloud/cloudcontrolspartner/v1/partners.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1;

public interface PartnerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1.Partner)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the partner.
   * Format: `organizations/{organization}/locations/{location}/partner`
   * Example: "organizations/123456/locations/us-central1/partner"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the partner.
   * Format: `organizations/{organization}/locations/{location}/partner`
   * Example: "organizations/123456/locations/us-central1/partner"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * List of SKUs the partner is offering
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.Sku skus = 3;</code>
   */
  java.util.List<com.google.cloud.cloudcontrolspartner.v1.Sku> getSkusList();
  /**
   *
   *
   * <pre>
   * List of SKUs the partner is offering
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.Sku skus = 3;</code>
   */
  com.google.cloud.cloudcontrolspartner.v1.Sku getSkus(int index);
  /**
   *
   *
   * <pre>
   * List of SKUs the partner is offering
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.Sku skus = 3;</code>
   */
  int getSkusCount();
  /**
   *
   *
   * <pre>
   * List of SKUs the partner is offering
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.Sku skus = 3;</code>
   */
  java.util.List<? extends com.google.cloud.cloudcontrolspartner.v1.SkuOrBuilder>
      getSkusOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of SKUs the partner is offering
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.Sku skus = 3;</code>
   */
  com.google.cloud.cloudcontrolspartner.v1.SkuOrBuilder getSkusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of Google Cloud supported EKM partners supported by the partner
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.EkmMetadata ekm_solutions = 4;</code>
   */
  java.util.List<com.google.cloud.cloudcontrolspartner.v1.EkmMetadata> getEkmSolutionsList();
  /**
   *
   *
   * <pre>
   * List of Google Cloud supported EKM partners supported by the partner
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.EkmMetadata ekm_solutions = 4;</code>
   */
  com.google.cloud.cloudcontrolspartner.v1.EkmMetadata getEkmSolutions(int index);
  /**
   *
   *
   * <pre>
   * List of Google Cloud supported EKM partners supported by the partner
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.EkmMetadata ekm_solutions = 4;</code>
   */
  int getEkmSolutionsCount();
  /**
   *
   *
   * <pre>
   * List of Google Cloud supported EKM partners supported by the partner
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.EkmMetadata ekm_solutions = 4;</code>
   */
  java.util.List<? extends com.google.cloud.cloudcontrolspartner.v1.EkmMetadataOrBuilder>
      getEkmSolutionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Google Cloud supported EKM partners supported by the partner
   * </pre>
   *
   * <code>repeated .google.cloud.cloudcontrolspartner.v1.EkmMetadata ekm_solutions = 4;</code>
   */
  com.google.cloud.cloudcontrolspartner.v1.EkmMetadataOrBuilder getEkmSolutionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of Google Cloud regions that the partner sells services to customers.
   * Valid Google Cloud regions found here:
   * https://cloud.google.com/compute/docs/regions-zones
   * </pre>
   *
   * <code>repeated string operated_cloud_regions = 5;</code>
   *
   * @return A list containing the operatedCloudRegions.
   */
  java.util.List<java.lang.String> getOperatedCloudRegionsList();
  /**
   *
   *
   * <pre>
   * List of Google Cloud regions that the partner sells services to customers.
   * Valid Google Cloud regions found here:
   * https://cloud.google.com/compute/docs/regions-zones
   * </pre>
   *
   * <code>repeated string operated_cloud_regions = 5;</code>
   *
   * @return The count of operatedCloudRegions.
   */
  int getOperatedCloudRegionsCount();
  /**
   *
   *
   * <pre>
   * List of Google Cloud regions that the partner sells services to customers.
   * Valid Google Cloud regions found here:
   * https://cloud.google.com/compute/docs/regions-zones
   * </pre>
   *
   * <code>repeated string operated_cloud_regions = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The operatedCloudRegions at the given index.
   */
  java.lang.String getOperatedCloudRegions(int index);
  /**
   *
   *
   * <pre>
   * List of Google Cloud regions that the partner sells services to customers.
   * Valid Google Cloud regions found here:
   * https://cloud.google.com/compute/docs/regions-zones
   * </pre>
   *
   * <code>repeated string operated_cloud_regions = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the operatedCloudRegions at the given index.
   */
  com.google.protobuf.ByteString getOperatedCloudRegionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Google Cloud project ID in the partner's Google Cloud organization for
   * receiving enhanced Logs for Partners.
   * </pre>
   *
   * <code>string partner_project_id = 7;</code>
   *
   * @return The partnerProjectId.
   */
  java.lang.String getPartnerProjectId();
  /**
   *
   *
   * <pre>
   * Google Cloud project ID in the partner's Google Cloud organization for
   * receiving enhanced Logs for Partners.
   * </pre>
   *
   * <code>string partner_project_id = 7;</code>
   *
   * @return The bytes for partnerProjectId.
   */
  com.google.protobuf.ByteString getPartnerProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last time the resource was updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the resource was updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time the resource was updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
