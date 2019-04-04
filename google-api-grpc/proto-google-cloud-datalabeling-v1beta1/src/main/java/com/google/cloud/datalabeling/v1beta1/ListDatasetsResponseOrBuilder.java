// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ListDatasetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Dataset datasets = 1;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Dataset> getDatasetsList();
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Dataset datasets = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Dataset getDatasets(int index);
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Dataset datasets = 1;</code>
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Dataset datasets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.DatasetOrBuilder>
      getDatasetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Dataset datasets = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.DatasetOrBuilder getDatasetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
