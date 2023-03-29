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
// source: google/devtools/cloudbuild/v2/repositories.proto

package com.google.cloudbuild.v2;

public interface BatchCreateRepositoriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.BatchCreateRepositoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v2.Repository> getRepositoriesList();
  /**
   *
   *
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  com.google.cloudbuild.v2.Repository getRepositories(int index);
  /**
   *
   *
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   *
   *
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v2.RepositoryOrBuilder>
      getRepositoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Repository resources created.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Repository repositories = 1;</code>
   */
  com.google.cloudbuild.v2.RepositoryOrBuilder getRepositoriesOrBuilder(int index);
}
