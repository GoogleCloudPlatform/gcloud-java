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
// source: google/cloud/asset/v1/assets.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1;

public interface RelatedResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.RelatedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   *
   *
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString getFullResourceNameBytes();
}
