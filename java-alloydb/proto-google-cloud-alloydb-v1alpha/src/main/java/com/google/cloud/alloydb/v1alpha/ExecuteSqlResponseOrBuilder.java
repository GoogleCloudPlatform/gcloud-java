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
// source: google/cloud/alloydb/v1alpha/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1alpha;

public interface ExecuteSqlResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.ExecuteSqlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * SqlResult represents the results for the execution of sql statements.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.SqlResult sql_results = 1;</code>
   */
  java.util.List<com.google.cloud.alloydb.v1alpha.SqlResult> getSqlResultsList();
  /**
   *
   *
   * <pre>
   * SqlResult represents the results for the execution of sql statements.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.SqlResult sql_results = 1;</code>
   */
  com.google.cloud.alloydb.v1alpha.SqlResult getSqlResults(int index);
  /**
   *
   *
   * <pre>
   * SqlResult represents the results for the execution of sql statements.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.SqlResult sql_results = 1;</code>
   */
  int getSqlResultsCount();
  /**
   *
   *
   * <pre>
   * SqlResult represents the results for the execution of sql statements.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.SqlResult sql_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.alloydb.v1alpha.SqlResultOrBuilder>
      getSqlResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * SqlResult represents the results for the execution of sql statements.
   * </pre>
   *
   * <code>repeated .google.cloud.alloydb.v1alpha.SqlResult sql_results = 1;</code>
   */
  com.google.cloud.alloydb.v1alpha.SqlResultOrBuilder getSqlResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Any additional metadata information regarding the execution of the sql
   * statement.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.ExecuteSqlMetadata metadata = 3;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Any additional metadata information regarding the execution of the sql
   * statement.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.ExecuteSqlMetadata metadata = 3;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.alloydb.v1alpha.ExecuteSqlMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Any additional metadata information regarding the execution of the sql
   * statement.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1alpha.ExecuteSqlMetadata metadata = 3;</code>
   */
  com.google.cloud.alloydb.v1alpha.ExecuteSqlMetadataOrBuilder getMetadataOrBuilder();
}
