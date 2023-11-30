// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/mapsplatformdatasets/v1/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1;

public interface ListDatasetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1.ListDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All the datasets for the project.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1.Dataset datasets = 1;</code>
   */
  java.util.List<com.google.maps.mapsplatformdatasets.v1.Dataset> 
      getDatasetsList();
  /**
   * <pre>
   * All the datasets for the project.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1.Dataset datasets = 1;</code>
   */
  com.google.maps.mapsplatformdatasets.v1.Dataset getDatasets(int index);
  /**
   * <pre>
   * All the datasets for the project.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1.Dataset datasets = 1;</code>
   */
  int getDatasetsCount();
  /**
   * <pre>
   * All the datasets for the project.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1.Dataset datasets = 1;</code>
   */
  java.util.List<? extends com.google.maps.mapsplatformdatasets.v1.DatasetOrBuilder> 
      getDatasetsOrBuilderList();
  /**
   * <pre>
   * All the datasets for the project.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1.Dataset datasets = 1;</code>
   */
  com.google.maps.mapsplatformdatasets.v1.DatasetOrBuilder getDatasetsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
