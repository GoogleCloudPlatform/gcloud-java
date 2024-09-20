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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface ImportFeatureValuesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ImportFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.aiplatform.v1.AvroSource avro_source = 2;</code>
   *
   * @return Whether the avroSource field is set.
   */
  boolean hasAvroSource();
  /**
   * <code>.google.cloud.aiplatform.v1.AvroSource avro_source = 2;</code>
   *
   * @return The avroSource.
   */
  com.google.cloud.aiplatform.v1.AvroSource getAvroSource();
  /** <code>.google.cloud.aiplatform.v1.AvroSource avro_source = 2;</code> */
  com.google.cloud.aiplatform.v1.AvroSourceOrBuilder getAvroSourceOrBuilder();

  /**
   * <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_source = 3;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   * <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_source = 3;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.aiplatform.v1.BigQuerySource getBigquerySource();
  /** <code>.google.cloud.aiplatform.v1.BigQuerySource bigquery_source = 3;</code> */
  com.google.cloud.aiplatform.v1.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  /**
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 4;</code>
   *
   * @return Whether the csvSource field is set.
   */
  boolean hasCsvSource();
  /**
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 4;</code>
   *
   * @return The csvSource.
   */
  com.google.cloud.aiplatform.v1.CsvSource getCsvSource();
  /** <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 4;</code> */
  com.google.cloud.aiplatform.v1.CsvSourceOrBuilder getCsvSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Source column that holds the Feature timestamp for all Feature
   * values in each entity.
   * </pre>
   *
   * <code>string feature_time_field = 6;</code>
   *
   * @return Whether the featureTimeField field is set.
   */
  boolean hasFeatureTimeField();
  /**
   *
   *
   * <pre>
   * Source column that holds the Feature timestamp for all Feature
   * values in each entity.
   * </pre>
   *
   * <code>string feature_time_field = 6;</code>
   *
   * @return The featureTimeField.
   */
  java.lang.String getFeatureTimeField();
  /**
   *
   *
   * <pre>
   * Source column that holds the Feature timestamp for all Feature
   * values in each entity.
   * </pre>
   *
   * <code>string feature_time_field = 6;</code>
   *
   * @return The bytes for featureTimeField.
   */
  com.google.protobuf.ByteString getFeatureTimeFieldBytes();

  /**
   *
   *
   * <pre>
   * Single Feature timestamp for all entities being imported. The
   * timestamp must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp feature_time = 7;</code>
   *
   * @return Whether the featureTime field is set.
   */
  boolean hasFeatureTime();
  /**
   *
   *
   * <pre>
   * Single Feature timestamp for all entities being imported. The
   * timestamp must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp feature_time = 7;</code>
   *
   * @return The featureTime.
   */
  com.google.protobuf.Timestamp getFeatureTime();
  /**
   *
   *
   * <pre>
   * Single Feature timestamp for all entities being imported. The
   * timestamp must not have higher than millisecond precision.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp feature_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFeatureTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType grouping the Features for
   * which values are being imported. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType grouping the Features for
   * which values are being imported. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString getEntityTypeBytes();

  /**
   *
   *
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   *
   * @return The entityIdField.
   */
  java.lang.String getEntityIdField();
  /**
   *
   *
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   *
   * @return The bytes for entityIdField.
   */
  com.google.protobuf.ByteString getEntityIdFieldBytes();

  /**
   *
   *
   * <pre>
   * Required. Specifications defining which Feature values to import from the
   * entity. The request fails if no feature_specs are provided, and having
   * multiple feature_specs for one Feature is not allowed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec feature_specs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec>
      getFeatureSpecsList();
  /**
   *
   *
   * <pre>
   * Required. Specifications defining which Feature values to import from the
   * entity. The request fails if no feature_specs are provided, and having
   * multiple feature_specs for one Feature is not allowed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec feature_specs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec getFeatureSpecs(int index);
  /**
   *
   *
   * <pre>
   * Required. Specifications defining which Feature values to import from the
   * entity. The request fails if no feature_specs are provided, and having
   * multiple feature_specs for one Feature is not allowed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec feature_specs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getFeatureSpecsCount();
  /**
   *
   *
   * <pre>
   * Required. Specifications defining which Feature values to import from the
   * entity. The request fails if no feature_specs are provided, and having
   * multiple feature_specs for one Feature is not allowed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec feature_specs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpecOrBuilder>
      getFeatureSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Specifications defining which Feature values to import from the
   * entity. The request fails if no feature_specs are provided, and having
   * multiple feature_specs for one Feature is not allowed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpec feature_specs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureSpecOrBuilder
      getFeatureSpecsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If set, data will not be imported for online serving. This
   * is typically used for backfilling, where Feature generation timestamps are
   * not in the timestamp range needed for online serving.
   * </pre>
   *
   * <code>bool disable_online_serving = 9;</code>
   *
   * @return The disableOnlineServing.
   */
  boolean getDisableOnlineServing();

  /**
   *
   *
   * <pre>
   * Specifies the number of workers that are used to write data to the
   * Featurestore. Consider the online serving capacity that you require to
   * achieve the desired import throughput without interfering with online
   * serving. The value must be positive, and less than or equal to 100.
   * If not set, defaults to using 1 worker. The low count ensures minimal
   * impact on online serving performance.
   * </pre>
   *
   * <code>int32 worker_count = 11;</code>
   *
   * @return The workerCount.
   */
  int getWorkerCount();

  /**
   *
   *
   * <pre>
   * If true, API doesn't start ingestion analysis pipeline.
   * </pre>
   *
   * <code>bool disable_ingestion_analysis = 12;</code>
   *
   * @return The disableIngestionAnalysis.
   */
  boolean getDisableIngestionAnalysis();

  com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.SourceCase getSourceCase();

  com.google.cloud.aiplatform.v1.ImportFeatureValuesRequest.FeatureTimeSourceCase
      getFeatureTimeSourceCase();
}
