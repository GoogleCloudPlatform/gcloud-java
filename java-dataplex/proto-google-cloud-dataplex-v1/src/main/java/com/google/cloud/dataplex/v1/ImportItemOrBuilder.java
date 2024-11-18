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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface ImportItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ImportItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Information about an entry and its attached aspects.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1;</code>
   *
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   *
   *
   * <pre>
   * Information about an entry and its attached aspects.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1;</code>
   *
   * @return The entry.
   */
  com.google.cloud.dataplex.v1.Entry getEntry();
  /**
   *
   *
   * <pre>
   * Information about an entry and its attached aspects.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1;</code>
   */
  com.google.cloud.dataplex.v1.EntryOrBuilder getEntryOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to update, in paths that are relative to the `Entry` resource.
   * Separate each field with a comma.
   *
   * In `FULL` entry sync mode, Dataplex includes the paths of all of the fields
   * for an entry that can be modified, including aspects. This means that
   * Dataplex replaces the existing entry with the entry in the metadata import
   * file. All modifiable fields are updated, regardless of the fields that are
   * listed in the update mask, and regardless of whether a field is present
   * in the `entry` object.
   *
   *
   * The `update_mask` field is ignored when an entry is created or re-created.
   *
   * Dataplex also determines which entries and aspects to modify by comparing
   * the values and timestamps that you provide in the metadata import file with
   * the values and timestamps that exist in your project. For more information,
   * see [Comparison
   * logic](https://cloud.google.com/dataplex/docs/import-metadata#data-modification-logic).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update, in paths that are relative to the `Entry` resource.
   * Separate each field with a comma.
   *
   * In `FULL` entry sync mode, Dataplex includes the paths of all of the fields
   * for an entry that can be modified, including aspects. This means that
   * Dataplex replaces the existing entry with the entry in the metadata import
   * file. All modifiable fields are updated, regardless of the fields that are
   * listed in the update mask, and regardless of whether a field is present
   * in the `entry` object.
   *
   *
   * The `update_mask` field is ignored when an entry is created or re-created.
   *
   * Dataplex also determines which entries and aspects to modify by comparing
   * the values and timestamps that you provide in the metadata import file with
   * the values and timestamps that exist in your project. For more information,
   * see [Comparison
   * logic](https://cloud.google.com/dataplex/docs/import-metadata#data-modification-logic).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The fields to update, in paths that are relative to the `Entry` resource.
   * Separate each field with a comma.
   *
   * In `FULL` entry sync mode, Dataplex includes the paths of all of the fields
   * for an entry that can be modified, including aspects. This means that
   * Dataplex replaces the existing entry with the entry in the metadata import
   * file. All modifiable fields are updated, regardless of the fields that are
   * listed in the update mask, and regardless of whether a field is present
   * in the `entry` object.
   *
   *
   * The `update_mask` field is ignored when an entry is created or re-created.
   *
   * Dataplex also determines which entries and aspects to modify by comparing
   * the values and timestamps that you provide in the metadata import file with
   * the values and timestamps that exist in your project. For more information,
   * see [Comparison
   * logic](https://cloud.google.com/dataplex/docs/import-metadata#data-modification-logic).
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The aspects to modify. Supports the following syntaxes:
   *
   * * `{aspect_type_reference}`: matches aspects that belong to the specified
   * aspect type and are attached directly to the entry.
   * * `{aspect_type_reference}&#64;{path}`: matches aspects that belong to the
   * specified aspect type and path.
   * * `{aspect_type_reference}&#64;*`: matches aspects that belong to the specified
   * aspect type for all paths.
   *
   * Replace `{aspect_type_reference}` with a reference to the aspect type, in
   * the format
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`.
   *
   * If you leave this field empty, it is treated as specifying exactly those
   * aspects that are present within the specified entry.
   *
   * In `FULL` entry sync mode, Dataplex implicitly adds the keys for all of the
   * required aspects of an entry.
   * </pre>
   *
   * <code>repeated string aspect_keys = 3;</code>
   *
   * @return A list containing the aspectKeys.
   */
  java.util.List<java.lang.String> getAspectKeysList();
  /**
   *
   *
   * <pre>
   * The aspects to modify. Supports the following syntaxes:
   *
   * * `{aspect_type_reference}`: matches aspects that belong to the specified
   * aspect type and are attached directly to the entry.
   * * `{aspect_type_reference}&#64;{path}`: matches aspects that belong to the
   * specified aspect type and path.
   * * `{aspect_type_reference}&#64;*`: matches aspects that belong to the specified
   * aspect type for all paths.
   *
   * Replace `{aspect_type_reference}` with a reference to the aspect type, in
   * the format
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`.
   *
   * If you leave this field empty, it is treated as specifying exactly those
   * aspects that are present within the specified entry.
   *
   * In `FULL` entry sync mode, Dataplex implicitly adds the keys for all of the
   * required aspects of an entry.
   * </pre>
   *
   * <code>repeated string aspect_keys = 3;</code>
   *
   * @return The count of aspectKeys.
   */
  int getAspectKeysCount();
  /**
   *
   *
   * <pre>
   * The aspects to modify. Supports the following syntaxes:
   *
   * * `{aspect_type_reference}`: matches aspects that belong to the specified
   * aspect type and are attached directly to the entry.
   * * `{aspect_type_reference}&#64;{path}`: matches aspects that belong to the
   * specified aspect type and path.
   * * `{aspect_type_reference}&#64;*`: matches aspects that belong to the specified
   * aspect type for all paths.
   *
   * Replace `{aspect_type_reference}` with a reference to the aspect type, in
   * the format
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`.
   *
   * If you leave this field empty, it is treated as specifying exactly those
   * aspects that are present within the specified entry.
   *
   * In `FULL` entry sync mode, Dataplex implicitly adds the keys for all of the
   * required aspects of an entry.
   * </pre>
   *
   * <code>repeated string aspect_keys = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The aspectKeys at the given index.
   */
  java.lang.String getAspectKeys(int index);
  /**
   *
   *
   * <pre>
   * The aspects to modify. Supports the following syntaxes:
   *
   * * `{aspect_type_reference}`: matches aspects that belong to the specified
   * aspect type and are attached directly to the entry.
   * * `{aspect_type_reference}&#64;{path}`: matches aspects that belong to the
   * specified aspect type and path.
   * * `{aspect_type_reference}&#64;*`: matches aspects that belong to the specified
   * aspect type for all paths.
   *
   * Replace `{aspect_type_reference}` with a reference to the aspect type, in
   * the format
   * `{project_id_or_number}.{location_id}.{aspect_type_id}`.
   *
   * If you leave this field empty, it is treated as specifying exactly those
   * aspects that are present within the specified entry.
   *
   * In `FULL` entry sync mode, Dataplex implicitly adds the keys for all of the
   * required aspects of an entry.
   * </pre>
   *
   * <code>repeated string aspect_keys = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the aspectKeys at the given index.
   */
  com.google.protobuf.ByteString getAspectKeysBytes(int index);
}
