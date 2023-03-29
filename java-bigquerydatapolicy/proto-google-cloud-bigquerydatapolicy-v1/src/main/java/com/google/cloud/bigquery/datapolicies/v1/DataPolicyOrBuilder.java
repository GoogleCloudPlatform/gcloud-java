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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1;

public interface DataPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.DataPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Policy tag resource name, in the format of
   * `projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{policyTag_id}`.
   * </pre>
   *
   * <code>string policy_tag = 4;</code>
   *
   * @return Whether the policyTag field is set.
   */
  boolean hasPolicyTag();
  /**
   *
   *
   * <pre>
   * Policy tag resource name, in the format of
   * `projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{policyTag_id}`.
   * </pre>
   *
   * <code>string policy_tag = 4;</code>
   *
   * @return The policyTag.
   */
  java.lang.String getPolicyTag();
  /**
   *
   *
   * <pre>
   * Policy tag resource name, in the format of
   * `projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{policyTag_id}`.
   * </pre>
   *
   * <code>string policy_tag = 4;</code>
   *
   * @return The bytes for policyTag.
   */
  com.google.protobuf.ByteString getPolicyTagBytes();

  /**
   *
   *
   * <pre>
   * The data masking policy that specifies the data masking rule to use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy data_masking_policy = 5;</code>
   *
   * @return Whether the dataMaskingPolicy field is set.
   */
  boolean hasDataMaskingPolicy();
  /**
   *
   *
   * <pre>
   * The data masking policy that specifies the data masking rule to use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy data_masking_policy = 5;</code>
   *
   * @return The dataMaskingPolicy.
   */
  com.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy getDataMaskingPolicy();
  /**
   *
   *
   * <pre>
   * The data masking policy that specifies the data masking rule to use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicy data_masking_policy = 5;</code>
   */
  com.google.cloud.bigquery.datapolicies.v1.DataMaskingPolicyOrBuilder
      getDataMaskingPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this data policy, in the format of
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this data policy, in the format of
   * `projects/{project_number}/locations/{location_id}/dataPolicies/{data_policy_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Type of data policy.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataPolicy.DataPolicyType data_policy_type = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for dataPolicyType.
   */
  int getDataPolicyTypeValue();
  /**
   *
   *
   * <pre>
   * Type of data policy.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataPolicy.DataPolicyType data_policy_type = 2;
   * </code>
   *
   * @return The dataPolicyType.
   */
  com.google.cloud.bigquery.datapolicies.v1.DataPolicy.DataPolicyType getDataPolicyType();

  /**
   *
   *
   * <pre>
   * User-assigned (human readable) ID of the data policy that needs to be
   * unique within a project. Used as {data_policy_id} in part of the resource
   * name.
   * </pre>
   *
   * <code>string data_policy_id = 3;</code>
   *
   * @return The dataPolicyId.
   */
  java.lang.String getDataPolicyId();
  /**
   *
   *
   * <pre>
   * User-assigned (human readable) ID of the data policy that needs to be
   * unique within a project. Used as {data_policy_id} in part of the resource
   * name.
   * </pre>
   *
   * <code>string data_policy_id = 3;</code>
   *
   * @return The bytes for dataPolicyId.
   */
  com.google.protobuf.ByteString getDataPolicyIdBytes();

  public com.google.cloud.bigquery.datapolicies.v1.DataPolicy.MatchingLabelCase
      getMatchingLabelCase();

  public com.google.cloud.bigquery.datapolicies.v1.DataPolicy.PolicyCase getPolicyCase();
}
