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
// source: google/cloud/datalabeling/v1beta1/annotation_spec_set.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface AnnotationSpecSetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.AnnotationSpecSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The AnnotationSpecSet resource name in the following format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/annotationSpecSets/&lt;var&gt;{annotation_spec_set_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The AnnotationSpecSet resource name in the following format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/annotationSpecSets/&lt;var&gt;{annotation_spec_set_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name for AnnotationSpecSet that you define when you
   * create it. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name for AnnotationSpecSet that you define when you
   * create it. Maximum of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification set.
   * The description can be up to 10,000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User-provided description of the annotation specification set.
   * The description can be up to 10,000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. The array of AnnotationSpecs that you define when you create the
   * AnnotationSpecSet. These are the possible labels for the labeling task.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_specs = 4;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpec> getAnnotationSpecsList();
  /**
   *
   *
   * <pre>
   * Required. The array of AnnotationSpecs that you define when you create the
   * AnnotationSpecSet. These are the possible labels for the labeling task.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_specs = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpecs(int index);
  /**
   *
   *
   * <pre>
   * Required. The array of AnnotationSpecs that you define when you create the
   * AnnotationSpecSet. These are the possible labels for the labeling task.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_specs = 4;</code>
   */
  int getAnnotationSpecsCount();
  /**
   *
   *
   * <pre>
   * Required. The array of AnnotationSpecs that you define when you create the
   * AnnotationSpecSet. These are the possible labels for the labeling task.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_specs = 4;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>
      getAnnotationSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The array of AnnotationSpecs that you define when you create the
   * AnnotationSpecSet. These are the possible labels for the labeling task.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_specs = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the annotation spec set.
   * </pre>
   *
   * <code>repeated string blocking_resources = 5;</code>
   *
   * @return A list containing the blockingResources.
   */
  java.util.List<java.lang.String> getBlockingResourcesList();
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the annotation spec set.
   * </pre>
   *
   * <code>repeated string blocking_resources = 5;</code>
   *
   * @return The count of blockingResources.
   */
  int getBlockingResourcesCount();
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the annotation spec set.
   * </pre>
   *
   * <code>repeated string blocking_resources = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The blockingResources at the given index.
   */
  java.lang.String getBlockingResources(int index);
  /**
   *
   *
   * <pre>
   * Output only. The names of any related resources that are blocking changes
   * to the annotation spec set.
   * </pre>
   *
   * <code>repeated string blocking_resources = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the blockingResources at the given index.
   */
  com.google.protobuf.ByteString getBlockingResourcesBytes(int index);
}
