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

public interface UpdateEntryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.UpdateEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Entry resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entry field is set.
   */
  boolean hasEntry();
  /**
   *
   *
   * <pre>
   * Required. Entry resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entry.
   */
  com.google.cloud.dataplex.v1.Entry getEntry();
  /**
   *
   *
   * <pre>
   * Required. Entry resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entry entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.EntryOrBuilder getEntryOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. To update Aspects, the update_mask must
   * contain the value "aspects".
   *
   * If the update_mask is empty, the service will update all modifiable fields
   * present in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. To update Aspects, the update_mask must
   * contain the value "aspects".
   *
   * If the update_mask is empty, the service will update all modifiable fields
   * present in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask of fields to update. To update Aspects, the update_mask must
   * contain the value "aspects".
   *
   * If the update_mask is empty, the service will update all modifiable fields
   * present in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set to true and the entry doesn't exist, the service will
   * create it.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * Optional. If set to true and the aspect_keys specify aspect ranges, the
   * service deletes any existing aspects from that range that weren't provided
   * in the request.
   * </pre>
   *
   * <code>bool delete_missing_aspects = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deleteMissingAspects.
   */
  boolean getDeleteMissingAspects();

  /**
   *
   *
   * <pre>
   * Optional. The map keys of the Aspects which the service should modify. It
   * supports the following syntaxes:
   *
   * * `&lt;aspect_type_reference&gt;` - matches an aspect of the given type and empty
   * path.
   * * `&lt;aspect_type_reference&gt;&#64;path` - matches an aspect of the given type and
   * specified path. For example, to attach an aspect to a field that is
   * specified by the `schema` aspect, the path should have the format
   * `Schema.&lt;field_name&gt;`.
   * * `&lt;aspect_type_reference&gt;*` - matches aspects of the given type for all
   * paths.
   * * `*&#64;path` - matches aspects of all types on the given path.
   *
   * The service will not remove existing aspects matching the syntax unless
   * `delete_missing_aspects` is set to true.
   *
   * If this field is left empty, the service treats it as specifying
   * exactly those Aspects present in the request.
   * </pre>
   *
   * <code>repeated string aspect_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the aspectKeys.
   */
  java.util.List<java.lang.String> getAspectKeysList();
  /**
   *
   *
   * <pre>
   * Optional. The map keys of the Aspects which the service should modify. It
   * supports the following syntaxes:
   *
   * * `&lt;aspect_type_reference&gt;` - matches an aspect of the given type and empty
   * path.
   * * `&lt;aspect_type_reference&gt;&#64;path` - matches an aspect of the given type and
   * specified path. For example, to attach an aspect to a field that is
   * specified by the `schema` aspect, the path should have the format
   * `Schema.&lt;field_name&gt;`.
   * * `&lt;aspect_type_reference&gt;*` - matches aspects of the given type for all
   * paths.
   * * `*&#64;path` - matches aspects of all types on the given path.
   *
   * The service will not remove existing aspects matching the syntax unless
   * `delete_missing_aspects` is set to true.
   *
   * If this field is left empty, the service treats it as specifying
   * exactly those Aspects present in the request.
   * </pre>
   *
   * <code>repeated string aspect_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of aspectKeys.
   */
  int getAspectKeysCount();
  /**
   *
   *
   * <pre>
   * Optional. The map keys of the Aspects which the service should modify. It
   * supports the following syntaxes:
   *
   * * `&lt;aspect_type_reference&gt;` - matches an aspect of the given type and empty
   * path.
   * * `&lt;aspect_type_reference&gt;&#64;path` - matches an aspect of the given type and
   * specified path. For example, to attach an aspect to a field that is
   * specified by the `schema` aspect, the path should have the format
   * `Schema.&lt;field_name&gt;`.
   * * `&lt;aspect_type_reference&gt;*` - matches aspects of the given type for all
   * paths.
   * * `*&#64;path` - matches aspects of all types on the given path.
   *
   * The service will not remove existing aspects matching the syntax unless
   * `delete_missing_aspects` is set to true.
   *
   * If this field is left empty, the service treats it as specifying
   * exactly those Aspects present in the request.
   * </pre>
   *
   * <code>repeated string aspect_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The aspectKeys at the given index.
   */
  java.lang.String getAspectKeys(int index);
  /**
   *
   *
   * <pre>
   * Optional. The map keys of the Aspects which the service should modify. It
   * supports the following syntaxes:
   *
   * * `&lt;aspect_type_reference&gt;` - matches an aspect of the given type and empty
   * path.
   * * `&lt;aspect_type_reference&gt;&#64;path` - matches an aspect of the given type and
   * specified path. For example, to attach an aspect to a field that is
   * specified by the `schema` aspect, the path should have the format
   * `Schema.&lt;field_name&gt;`.
   * * `&lt;aspect_type_reference&gt;*` - matches aspects of the given type for all
   * paths.
   * * `*&#64;path` - matches aspects of all types on the given path.
   *
   * The service will not remove existing aspects matching the syntax unless
   * `delete_missing_aspects` is set to true.
   *
   * If this field is left empty, the service treats it as specifying
   * exactly those Aspects present in the request.
   * </pre>
   *
   * <code>repeated string aspect_keys = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the aspectKeys at the given index.
   */
  com.google.protobuf.ByteString getAspectKeysBytes(int index);
}
