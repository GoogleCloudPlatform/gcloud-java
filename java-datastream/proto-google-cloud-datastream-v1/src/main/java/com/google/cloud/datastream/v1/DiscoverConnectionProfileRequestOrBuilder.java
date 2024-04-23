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
// source: google/cloud/datastream/v1/datastream.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datastream.v1;

public interface DiscoverConnectionProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.DiscoverConnectionProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the connection profile type. Must be in
   * the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the connection profile type. Must be in
   * the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * An ad-hoc connection profile configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.ConnectionProfile connection_profile = 200;</code>
   *
   * @return Whether the connectionProfile field is set.
   */
  boolean hasConnectionProfile();
  /**
   *
   *
   * <pre>
   * An ad-hoc connection profile configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.ConnectionProfile connection_profile = 200;</code>
   *
   * @return The connectionProfile.
   */
  com.google.cloud.datastream.v1.ConnectionProfile getConnectionProfile();
  /**
   *
   *
   * <pre>
   * An ad-hoc connection profile configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.ConnectionProfile connection_profile = 200;</code>
   */
  com.google.cloud.datastream.v1.ConnectionProfileOrBuilder getConnectionProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * A reference to an existing connection profile.
   * </pre>
   *
   * <code>string connection_profile_name = 201;</code>
   *
   * @return Whether the connectionProfileName field is set.
   */
  boolean hasConnectionProfileName();
  /**
   *
   *
   * <pre>
   * A reference to an existing connection profile.
   * </pre>
   *
   * <code>string connection_profile_name = 201;</code>
   *
   * @return The connectionProfileName.
   */
  java.lang.String getConnectionProfileName();
  /**
   *
   *
   * <pre>
   * A reference to an existing connection profile.
   * </pre>
   *
   * <code>string connection_profile_name = 201;</code>
   *
   * @return The bytes for connectionProfileName.
   */
  com.google.protobuf.ByteString getConnectionProfileNameBytes();

  /**
   *
   *
   * <pre>
   * Whether to retrieve the full hierarchy of data objects (TRUE) or only the
   * current level (FALSE).
   * </pre>
   *
   * <code>bool full_hierarchy = 3;</code>
   *
   * @return Whether the fullHierarchy field is set.
   */
  boolean hasFullHierarchy();
  /**
   *
   *
   * <pre>
   * Whether to retrieve the full hierarchy of data objects (TRUE) or only the
   * current level (FALSE).
   * </pre>
   *
   * <code>bool full_hierarchy = 3;</code>
   *
   * @return The fullHierarchy.
   */
  boolean getFullHierarchy();

  /**
   *
   *
   * <pre>
   * The number of hierarchy levels below the current level to be retrieved.
   * </pre>
   *
   * <code>int32 hierarchy_depth = 4;</code>
   *
   * @return Whether the hierarchyDepth field is set.
   */
  boolean hasHierarchyDepth();
  /**
   *
   *
   * <pre>
   * The number of hierarchy levels below the current level to be retrieved.
   * </pre>
   *
   * <code>int32 hierarchy_depth = 4;</code>
   *
   * @return The hierarchyDepth.
   */
  int getHierarchyDepth();

  /**
   *
   *
   * <pre>
   * Oracle RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return Whether the oracleRdbms field is set.
   */
  boolean hasOracleRdbms();
  /**
   *
   *
   * <pre>
   * Oracle RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return The oracleRdbms.
   */
  com.google.cloud.datastream.v1.OracleRdbms getOracleRdbms();
  /**
   *
   *
   * <pre>
   * Oracle RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getOracleRdbmsOrBuilder();

  /**
   *
   *
   * <pre>
   * MySQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return Whether the mysqlRdbms field is set.
   */
  boolean hasMysqlRdbms();
  /**
   *
   *
   * <pre>
   * MySQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return The mysqlRdbms.
   */
  com.google.cloud.datastream.v1.MysqlRdbms getMysqlRdbms();
  /**
   *
   *
   * <pre>
   * MySQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   */
  com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getMysqlRdbmsOrBuilder();

  /**
   *
   *
   * <pre>
   * PostgreSQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   *
   * @return Whether the postgresqlRdbms field is set.
   */
  boolean hasPostgresqlRdbms();
  /**
   *
   *
   * <pre>
   * PostgreSQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   *
   * @return The postgresqlRdbms.
   */
  com.google.cloud.datastream.v1.PostgresqlRdbms getPostgresqlRdbms();
  /**
   *
   *
   * <pre>
   * PostgreSQL RDBMS to enrich with child data objects and metadata.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.PostgresqlRdbms postgresql_rdbms = 102;</code>
   */
  com.google.cloud.datastream.v1.PostgresqlRdbmsOrBuilder getPostgresqlRdbmsOrBuilder();

  com.google.cloud.datastream.v1.DiscoverConnectionProfileRequest.TargetCase getTargetCase();

  com.google.cloud.datastream.v1.DiscoverConnectionProfileRequest.HierarchyCase getHierarchyCase();

  com.google.cloud.datastream.v1.DiscoverConnectionProfileRequest.DataObjectCase
      getDataObjectCase();
}
