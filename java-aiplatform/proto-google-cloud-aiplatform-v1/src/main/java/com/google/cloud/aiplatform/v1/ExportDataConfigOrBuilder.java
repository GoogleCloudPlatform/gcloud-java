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
// source: google/cloud/aiplatform/v1/dataset.proto

package com.google.cloud.aiplatform.v1;

public interface ExportDataConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportDataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.aiplatform.v1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location where the output is to be written to.
   * In the given directory a new directory will be created with name:
   * `export-data-&lt;dataset-display-name&gt;-&lt;timestamp-of-export-call&gt;` where
   * timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format. All export
   * output will be written into that directory. Inside that directory,
   * annotations with the same schema will be grouped into sub directories
   * which are named with the corresponding annotations' schema title. Inside
   * these sub directories, a schema.yaml will be created to describe the
   * output format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   *
   * @return Whether the fractionSplit field is set.
   */
  boolean hasFractionSplit();
  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   *
   * @return The fractionSplit.
   */
  com.google.cloud.aiplatform.v1.ExportFractionSplit getFractionSplit();
  /**
   *
   *
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFractionSplit fraction_split = 5;</code>
   */
  com.google.cloud.aiplatform.v1.ExportFractionSplitOrBuilder getFractionSplitOrBuilder();

  /**
   *
   *
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFilterSplit filter_split = 7;</code>
   *
   * @return Whether the filterSplit field is set.
   */
  boolean hasFilterSplit();
  /**
   *
   *
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFilterSplit filter_split = 7;</code>
   *
   * @return The filterSplit.
   */
  com.google.cloud.aiplatform.v1.ExportFilterSplit getFilterSplit();
  /**
   *
   *
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFilterSplit filter_split = 7;</code>
   */
  com.google.cloud.aiplatform.v1.ExportFilterSplitOrBuilder getFilterSplitOrBuilder();

  /**
   *
   *
   * <pre>
   * An expression for filtering what part of the Dataset is to be exported.
   * Only Annotations that match this filter will be exported. The filter syntax
   * is the same as in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations].
   * </pre>
   *
   * <code>string annotations_filter = 2;</code>
   *
   * @return The annotationsFilter.
   */
  java.lang.String getAnnotationsFilter();
  /**
   *
   *
   * <pre>
   * An expression for filtering what part of the Dataset is to be exported.
   * Only Annotations that match this filter will be exported. The filter syntax
   * is the same as in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations].
   * </pre>
   *
   * <code>string annotations_filter = 2;</code>
   *
   * @return The bytes for annotationsFilter.
   */
  com.google.protobuf.ByteString getAnnotationsFilterBytes();

  /**
   *
   *
   * <pre>
   * The ID of a SavedQuery (annotation set) under the Dataset specified by
   * [dataset_id][] used for filtering Annotations for training.
   *
   * Only used for custom training data export use cases.
   * Only applicable to Datasets that have SavedQueries.
   *
   * Only Annotations that are associated with this SavedQuery are used in
   * respectively training. When used in conjunction with
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter],
   * the Annotations used for training are filtered by both
   * [saved_query_id][google.cloud.aiplatform.v1.ExportDataConfig.saved_query_id]
   * and
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter].
   *
   * Only one of
   * [saved_query_id][google.cloud.aiplatform.v1.ExportDataConfig.saved_query_id]
   * and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.ExportDataConfig.annotation_schema_uri]
   * should be specified as both of them represent the same thing: problem type.
   * </pre>
   *
   * <code>string saved_query_id = 11;</code>
   *
   * @return The savedQueryId.
   */
  java.lang.String getSavedQueryId();
  /**
   *
   *
   * <pre>
   * The ID of a SavedQuery (annotation set) under the Dataset specified by
   * [dataset_id][] used for filtering Annotations for training.
   *
   * Only used for custom training data export use cases.
   * Only applicable to Datasets that have SavedQueries.
   *
   * Only Annotations that are associated with this SavedQuery are used in
   * respectively training. When used in conjunction with
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter],
   * the Annotations used for training are filtered by both
   * [saved_query_id][google.cloud.aiplatform.v1.ExportDataConfig.saved_query_id]
   * and
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter].
   *
   * Only one of
   * [saved_query_id][google.cloud.aiplatform.v1.ExportDataConfig.saved_query_id]
   * and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.ExportDataConfig.annotation_schema_uri]
   * should be specified as both of them represent the same thing: problem type.
   * </pre>
   *
   * <code>string saved_query_id = 11;</code>
   *
   * @return The bytes for savedQueryId.
   */
  com.google.protobuf.ByteString getSavedQueryIdBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Storage URI that points to a YAML file describing the annotation
   * schema. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/, note that the
   * chosen schema must be consistent with
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri] of the
   * Dataset specified by [dataset_id][].
   *
   * Only used for custom training data export use cases.
   * Only applicable to Datasets that have DataItems and Annotations.
   *
   * Only Annotations that both match this schema and belong to DataItems not
   * ignored by the split method are used in respectively training, validation
   * or test role, depending on the role of the DataItem they are on.
   *
   * When used in conjunction with
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter],
   * the Annotations used for training are filtered by both
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter]
   * and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.ExportDataConfig.annotation_schema_uri].
   * </pre>
   *
   * <code>string annotation_schema_uri = 12;</code>
   *
   * @return The annotationSchemaUri.
   */
  java.lang.String getAnnotationSchemaUri();
  /**
   *
   *
   * <pre>
   * The Cloud Storage URI that points to a YAML file describing the annotation
   * schema. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/, note that the
   * chosen schema must be consistent with
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri] of the
   * Dataset specified by [dataset_id][].
   *
   * Only used for custom training data export use cases.
   * Only applicable to Datasets that have DataItems and Annotations.
   *
   * Only Annotations that both match this schema and belong to DataItems not
   * ignored by the split method are used in respectively training, validation
   * or test role, depending on the role of the DataItem they are on.
   *
   * When used in conjunction with
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter],
   * the Annotations used for training are filtered by both
   * [annotations_filter][google.cloud.aiplatform.v1.ExportDataConfig.annotations_filter]
   * and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.ExportDataConfig.annotation_schema_uri].
   * </pre>
   *
   * <code>string annotation_schema_uri = 12;</code>
   *
   * @return The bytes for annotationSchemaUri.
   */
  com.google.protobuf.ByteString getAnnotationSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * Indicates the usage of the exported files.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportDataConfig.ExportUse export_use = 4;</code>
   *
   * @return The enum numeric value on the wire for exportUse.
   */
  int getExportUseValue();
  /**
   *
   *
   * <pre>
   * Indicates the usage of the exported files.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportDataConfig.ExportUse export_use = 4;</code>
   *
   * @return The exportUse.
   */
  com.google.cloud.aiplatform.v1.ExportDataConfig.ExportUse getExportUse();

  com.google.cloud.aiplatform.v1.ExportDataConfig.DestinationCase getDestinationCase();

  com.google.cloud.aiplatform.v1.ExportDataConfig.SplitCase getSplitCase();
}
