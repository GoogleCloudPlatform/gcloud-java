/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface ListGlossariesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.ListGlossariesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.Glossary glossaries = 1;</code>
   */
  java.util.List<com.google.cloud.translate.v3beta1.Glossary> getGlossariesList();
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.Glossary glossaries = 1;</code>
   */
  com.google.cloud.translate.v3beta1.Glossary getGlossaries(int index);
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.Glossary glossaries = 1;</code>
   */
  int getGlossariesCount();
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.Glossary glossaries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3beta1.GlossaryOrBuilder>
      getGlossariesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of glossaries for a project.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.Glossary glossaries = 1;</code>
   */
  com.google.cloud.translate.v3beta1.GlossaryOrBuilder getGlossariesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
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
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to
   * `ListGlossaries` method to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
