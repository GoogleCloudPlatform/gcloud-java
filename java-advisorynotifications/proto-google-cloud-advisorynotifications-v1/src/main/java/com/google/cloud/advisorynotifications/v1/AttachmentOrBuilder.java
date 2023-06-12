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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

public interface AttachmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.Attachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A CSV file attachment. Max size is 10 MB.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Csv csv = 2;</code>
   *
   * @return Whether the csv field is set.
   */
  boolean hasCsv();
  /**
   *
   *
   * <pre>
   * A CSV file attachment. Max size is 10 MB.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Csv csv = 2;</code>
   *
   * @return The csv.
   */
  com.google.cloud.advisorynotifications.v1.Csv getCsv();
  /**
   *
   *
   * <pre>
   * A CSV file attachment. Max size is 10 MB.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Csv csv = 2;</code>
   */
  com.google.cloud.advisorynotifications.v1.CsvOrBuilder getCsvOrBuilder();

  /**
   *
   *
   * <pre>
   * The title of the attachment.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The title of the attachment.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  com.google.cloud.advisorynotifications.v1.Attachment.DataCase getDataCase();
}
