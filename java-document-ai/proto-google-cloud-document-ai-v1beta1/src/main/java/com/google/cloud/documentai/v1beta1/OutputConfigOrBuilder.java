/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.documentai.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output to.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.documentai.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The max number of pages to include into each output Document shard JSON on
   * Google Cloud Storage.
   *
   * The valid range is [1, 100]. If not specified, the default value is 20.
   *
   * For example, for one pdf file with 100 pages, 100 parsed pages will be
   * produced. If `pages_per_shard` = 20, then 5 Document shard JSON files each
   * containing 20 parsed pages will be written under the prefix
   * [OutputConfig.gcs_destination.uri][] and suffix pages-x-to-y.json where
   * x and y are 1-indexed page numbers.
   *
   * Example GCS outputs with 157 pages and pages_per_shard = 50:
   *
   * &lt;prefix&gt;pages-001-to-050.json
   * &lt;prefix&gt;pages-051-to-100.json
   * &lt;prefix&gt;pages-101-to-150.json
   * &lt;prefix&gt;pages-151-to-157.json
   * </pre>
   *
   * <code>int32 pages_per_shard = 2;</code>
   *
   * @return The pagesPerShard.
   */
  int getPagesPerShard();

  com.google.cloud.documentai.v1beta1.OutputConfig.DestinationCase getDestinationCase();
}
