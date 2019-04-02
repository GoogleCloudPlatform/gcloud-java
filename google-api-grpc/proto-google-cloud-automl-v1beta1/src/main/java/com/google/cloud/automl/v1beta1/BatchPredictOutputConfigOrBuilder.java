// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface BatchPredictOutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BatchPredictOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the directory where the output is to
   * be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the directory where the output is to
   * be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the directory where the output is to
   * be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  boolean hasBigqueryDestination();
  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.automl.v1beta1.BigQueryDestination getBigqueryDestination();
  /**
   *
   *
   * <pre>
   * The BigQuery location where the output is to be written to.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQueryDestination bigquery_destination = 2;</code>
   */
  com.google.cloud.automl.v1beta1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  public com.google.cloud.automl.v1beta1.BatchPredictOutputConfig.DestinationCase
      getDestinationCase();
}
