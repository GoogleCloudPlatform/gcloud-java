// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface FeatureValueDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureValueDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output in BigQuery format.
   * [BigQueryDestination.output_uri][google.cloud.aiplatform.v1beta1.BigQueryDestination.output_uri]
   * in
   * [FeatureValueDestination.bigquery_destination][google.cloud.aiplatform.v1beta1.FeatureValueDestination.bigquery_destination]
   * must refer to a table.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 1;</code>
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   * <pre>
   * Output in BigQuery format.
   * [BigQueryDestination.output_uri][google.cloud.aiplatform.v1beta1.BigQueryDestination.output_uri]
   * in
   * [FeatureValueDestination.bigquery_destination][google.cloud.aiplatform.v1beta1.FeatureValueDestination.bigquery_destination]
   * must refer to a table.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 1;</code>
   * @return The bigqueryDestination.
   */
  com.google.cloud.aiplatform.v1beta1.BigQueryDestination getBigqueryDestination();
  /**
   * <pre>
   * Output in BigQuery format.
   * [BigQueryDestination.output_uri][google.cloud.aiplatform.v1beta1.BigQueryDestination.output_uri]
   * in
   * [FeatureValueDestination.bigquery_destination][google.cloud.aiplatform.v1beta1.FeatureValueDestination.bigquery_destination]
   * must refer to a table.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  /**
   * <pre>
   * Output in TFRecord format.
   *
   * Below are the mapping from Feature value type
   * in Featurestore to Feature value type in TFRecord:
   *
   *     Value type in Featurestore                 | Value type in TFRecord
   *     DOUBLE, DOUBLE_ARRAY                       | FLOAT_LIST
   *     INT64, INT64_ARRAY                         | INT64_LIST
   *     STRING, STRING_ARRAY, BYTES                | BYTES_LIST
   *     true -&gt; byte_string("true"), false -&gt; byte_string("false")
   *     BOOL, BOOL_ARRAY (true, false)             | BYTES_LIST
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TFRecordDestination tfrecord_destination = 2;</code>
   * @return Whether the tfrecordDestination field is set.
   */
  boolean hasTfrecordDestination();
  /**
   * <pre>
   * Output in TFRecord format.
   *
   * Below are the mapping from Feature value type
   * in Featurestore to Feature value type in TFRecord:
   *
   *     Value type in Featurestore                 | Value type in TFRecord
   *     DOUBLE, DOUBLE_ARRAY                       | FLOAT_LIST
   *     INT64, INT64_ARRAY                         | INT64_LIST
   *     STRING, STRING_ARRAY, BYTES                | BYTES_LIST
   *     true -&gt; byte_string("true"), false -&gt; byte_string("false")
   *     BOOL, BOOL_ARRAY (true, false)             | BYTES_LIST
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TFRecordDestination tfrecord_destination = 2;</code>
   * @return The tfrecordDestination.
   */
  com.google.cloud.aiplatform.v1beta1.TFRecordDestination getTfrecordDestination();
  /**
   * <pre>
   * Output in TFRecord format.
   *
   * Below are the mapping from Feature value type
   * in Featurestore to Feature value type in TFRecord:
   *
   *     Value type in Featurestore                 | Value type in TFRecord
   *     DOUBLE, DOUBLE_ARRAY                       | FLOAT_LIST
   *     INT64, INT64_ARRAY                         | INT64_LIST
   *     STRING, STRING_ARRAY, BYTES                | BYTES_LIST
   *     true -&gt; byte_string("true"), false -&gt; byte_string("false")
   *     BOOL, BOOL_ARRAY (true, false)             | BYTES_LIST
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TFRecordDestination tfrecord_destination = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TFRecordDestinationOrBuilder getTfrecordDestinationOrBuilder();

  /**
   * <pre>
   * Output in CSV format. Array Feature value types are not allowed in CSV
   * format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CsvDestination csv_destination = 3;</code>
   * @return Whether the csvDestination field is set.
   */
  boolean hasCsvDestination();
  /**
   * <pre>
   * Output in CSV format. Array Feature value types are not allowed in CSV
   * format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CsvDestination csv_destination = 3;</code>
   * @return The csvDestination.
   */
  com.google.cloud.aiplatform.v1beta1.CsvDestination getCsvDestination();
  /**
   * <pre>
   * Output in CSV format. Array Feature value types are not allowed in CSV
   * format.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.CsvDestination csv_destination = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.CsvDestinationOrBuilder getCsvDestinationOrBuilder();

  com.google.cloud.aiplatform.v1beta1.FeatureValueDestination.DestinationCase getDestinationCase();
}
