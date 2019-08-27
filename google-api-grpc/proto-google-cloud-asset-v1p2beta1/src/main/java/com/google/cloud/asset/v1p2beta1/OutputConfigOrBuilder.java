// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.asset.v1p2beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Destination on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.asset.v1p2beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Destination on Bigquery. The output table stores the fields in asset
   * proto as columns in BigQuery. The resource/iam_policy field is converted
   * to a record with each field to a column, except metadata to a single JSON
   * string.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  boolean hasBigqueryDestination();
  /**
   *
   *
   * <pre>
   * Destination on Bigquery. The output table stores the fields in asset
   * proto as columns in BigQuery. The resource/iam_policy field is converted
   * to a record with each field to a column, except metadata to a single JSON
   * string.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.asset.v1p2beta1.BigQueryDestination getBigqueryDestination();
  /**
   *
   *
   * <pre>
   * Destination on Bigquery. The output table stores the fields in asset
   * proto as columns in BigQuery. The resource/iam_policy field is converted
   * to a record with each field to a column, except metadata to a single JSON
   * string.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.asset.v1p2beta1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  public com.google.cloud.asset.v1p2beta1.OutputConfig.DestinationCase getDestinationCase();
}
