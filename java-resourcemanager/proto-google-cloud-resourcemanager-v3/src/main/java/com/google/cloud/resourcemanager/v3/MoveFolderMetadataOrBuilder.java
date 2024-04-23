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
// source: google/cloud/resourcemanager/v3/folders.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

public interface MoveFolderMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.MoveFolderMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The display name of the folder.
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
   * The display name of the folder.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the folder's parent.
   * </pre>
   *
   * <code>string source_parent = 2;</code>
   *
   * @return The sourceParent.
   */
  java.lang.String getSourceParent();
  /**
   *
   *
   * <pre>
   * The resource name of the folder's parent.
   * </pre>
   *
   * <code>string source_parent = 2;</code>
   *
   * @return The bytes for sourceParent.
   */
  com.google.protobuf.ByteString getSourceParentBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the folder or organization to move the folder to.
   * </pre>
   *
   * <code>string destination_parent = 3;</code>
   *
   * @return The destinationParent.
   */
  java.lang.String getDestinationParent();
  /**
   *
   *
   * <pre>
   * The resource name of the folder or organization to move the folder to.
   * </pre>
   *
   * <code>string destination_parent = 3;</code>
   *
   * @return The bytes for destinationParent.
   */
  com.google.protobuf.ByteString getDestinationParentBytes();
}
