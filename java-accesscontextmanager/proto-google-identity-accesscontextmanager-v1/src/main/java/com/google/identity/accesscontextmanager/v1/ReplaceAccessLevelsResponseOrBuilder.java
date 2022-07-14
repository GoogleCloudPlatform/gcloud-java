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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface ReplaceAccessLevelsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ReplaceAccessLevelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.AccessLevel> getAccessLevelsList();
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevels(int index);
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  int getAccessLevelsCount();
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  java.util.List<? extends com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
      getAccessLevelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] instances.
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.AccessLevel access_levels = 1;</code>
   */
  com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelsOrBuilder(
      int index);
}
