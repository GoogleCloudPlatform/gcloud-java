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
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

public interface SearchBlueprintRevisionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.SearchBlueprintRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Blueprint blueprints = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.Blueprint> getBlueprintsList();
  /**
   *
   *
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Blueprint blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.Blueprint getBlueprints(int index);
  /**
   *
   *
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Blueprint blueprints = 1;</code>
   */
  int getBlueprintsCount();
  /**
   *
   *
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Blueprint blueprints = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.BlueprintOrBuilder>
      getBlueprintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of requested blueprint revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Blueprint blueprints = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.BlueprintOrBuilder getBlueprintsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
