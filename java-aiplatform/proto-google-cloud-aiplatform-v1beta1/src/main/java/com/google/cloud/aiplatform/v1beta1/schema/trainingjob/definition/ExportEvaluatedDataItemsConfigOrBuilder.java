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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/export_evaluated_data_items_config.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface ExportEvaluatedDataItemsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URI of desired destination BigQuery table. Expected format:
   * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
   *
   * If not specified, then results are exported to the following auto-created
   * BigQuery table:
   * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
   * </pre>
   *
   * <code>string destination_bigquery_uri = 1;</code>
   *
   * @return The destinationBigqueryUri.
   */
  java.lang.String getDestinationBigqueryUri();
  /**
   *
   *
   * <pre>
   * URI of desired destination BigQuery table. Expected format:
   * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
   *
   * If not specified, then results are exported to the following auto-created
   * BigQuery table:
   * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
   * </pre>
   *
   * <code>string destination_bigquery_uri = 1;</code>
   *
   * @return The bytes for destinationBigqueryUri.
   */
  com.google.protobuf.ByteString getDestinationBigqueryUriBytes();

  /**
   *
   *
   * <pre>
   * If true and an export destination is specified, then the contents of the
   * destination are overwritten. Otherwise, if the export destination already
   * exists, then the export operation fails.
   * </pre>
   *
   * <code>bool override_existing_table = 2;</code>
   *
   * @return The overrideExistingTable.
   */
  boolean getOverrideExistingTable();
}
