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
// source: google/cloud/bigquery/migration/v2/translation_config.proto

package com.google.cloud.bigquery.migration.v2;

public interface DialectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.Dialect)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The BigQuery dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.BigQueryDialect bigquery_dialect = 1;</code>
   *
   * @return Whether the bigqueryDialect field is set.
   */
  boolean hasBigqueryDialect();
  /**
   *
   *
   * <pre>
   * The BigQuery dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.BigQueryDialect bigquery_dialect = 1;</code>
   *
   * @return The bigqueryDialect.
   */
  com.google.cloud.bigquery.migration.v2.BigQueryDialect getBigqueryDialect();
  /**
   *
   *
   * <pre>
   * The BigQuery dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.BigQueryDialect bigquery_dialect = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2.BigQueryDialectOrBuilder getBigqueryDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The HiveQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.HiveQLDialect hiveql_dialect = 2;</code>
   *
   * @return Whether the hiveqlDialect field is set.
   */
  boolean hasHiveqlDialect();
  /**
   *
   *
   * <pre>
   * The HiveQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.HiveQLDialect hiveql_dialect = 2;</code>
   *
   * @return The hiveqlDialect.
   */
  com.google.cloud.bigquery.migration.v2.HiveQLDialect getHiveqlDialect();
  /**
   *
   *
   * <pre>
   * The HiveQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.HiveQLDialect hiveql_dialect = 2;</code>
   */
  com.google.cloud.bigquery.migration.v2.HiveQLDialectOrBuilder getHiveqlDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Redshift dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.RedshiftDialect redshift_dialect = 3;</code>
   *
   * @return Whether the redshiftDialect field is set.
   */
  boolean hasRedshiftDialect();
  /**
   *
   *
   * <pre>
   * The Redshift dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.RedshiftDialect redshift_dialect = 3;</code>
   *
   * @return The redshiftDialect.
   */
  com.google.cloud.bigquery.migration.v2.RedshiftDialect getRedshiftDialect();
  /**
   *
   *
   * <pre>
   * The Redshift dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.RedshiftDialect redshift_dialect = 3;</code>
   */
  com.google.cloud.bigquery.migration.v2.RedshiftDialectOrBuilder getRedshiftDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Teradata dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TeradataDialect teradata_dialect = 4;</code>
   *
   * @return Whether the teradataDialect field is set.
   */
  boolean hasTeradataDialect();
  /**
   *
   *
   * <pre>
   * The Teradata dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TeradataDialect teradata_dialect = 4;</code>
   *
   * @return The teradataDialect.
   */
  com.google.cloud.bigquery.migration.v2.TeradataDialect getTeradataDialect();
  /**
   *
   *
   * <pre>
   * The Teradata dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TeradataDialect teradata_dialect = 4;</code>
   */
  com.google.cloud.bigquery.migration.v2.TeradataDialectOrBuilder getTeradataDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Oracle dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.OracleDialect oracle_dialect = 5;</code>
   *
   * @return Whether the oracleDialect field is set.
   */
  boolean hasOracleDialect();
  /**
   *
   *
   * <pre>
   * The Oracle dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.OracleDialect oracle_dialect = 5;</code>
   *
   * @return The oracleDialect.
   */
  com.google.cloud.bigquery.migration.v2.OracleDialect getOracleDialect();
  /**
   *
   *
   * <pre>
   * The Oracle dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.OracleDialect oracle_dialect = 5;</code>
   */
  com.google.cloud.bigquery.migration.v2.OracleDialectOrBuilder getOracleDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The SparkSQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SparkSQLDialect sparksql_dialect = 6;</code>
   *
   * @return Whether the sparksqlDialect field is set.
   */
  boolean hasSparksqlDialect();
  /**
   *
   *
   * <pre>
   * The SparkSQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SparkSQLDialect sparksql_dialect = 6;</code>
   *
   * @return The sparksqlDialect.
   */
  com.google.cloud.bigquery.migration.v2.SparkSQLDialect getSparksqlDialect();
  /**
   *
   *
   * <pre>
   * The SparkSQL dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SparkSQLDialect sparksql_dialect = 6;</code>
   */
  com.google.cloud.bigquery.migration.v2.SparkSQLDialectOrBuilder getSparksqlDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Snowflake dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SnowflakeDialect snowflake_dialect = 7;</code>
   *
   * @return Whether the snowflakeDialect field is set.
   */
  boolean hasSnowflakeDialect();
  /**
   *
   *
   * <pre>
   * The Snowflake dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SnowflakeDialect snowflake_dialect = 7;</code>
   *
   * @return The snowflakeDialect.
   */
  com.google.cloud.bigquery.migration.v2.SnowflakeDialect getSnowflakeDialect();
  /**
   *
   *
   * <pre>
   * The Snowflake dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SnowflakeDialect snowflake_dialect = 7;</code>
   */
  com.google.cloud.bigquery.migration.v2.SnowflakeDialectOrBuilder getSnowflakeDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Netezza dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NetezzaDialect netezza_dialect = 8;</code>
   *
   * @return Whether the netezzaDialect field is set.
   */
  boolean hasNetezzaDialect();
  /**
   *
   *
   * <pre>
   * The Netezza dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NetezzaDialect netezza_dialect = 8;</code>
   *
   * @return The netezzaDialect.
   */
  com.google.cloud.bigquery.migration.v2.NetezzaDialect getNetezzaDialect();
  /**
   *
   *
   * <pre>
   * The Netezza dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.NetezzaDialect netezza_dialect = 8;</code>
   */
  com.google.cloud.bigquery.migration.v2.NetezzaDialectOrBuilder getNetezzaDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Azure Synapse dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.AzureSynapseDialect azure_synapse_dialect = 9;</code>
   *
   * @return Whether the azureSynapseDialect field is set.
   */
  boolean hasAzureSynapseDialect();
  /**
   *
   *
   * <pre>
   * The Azure Synapse dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.AzureSynapseDialect azure_synapse_dialect = 9;</code>
   *
   * @return The azureSynapseDialect.
   */
  com.google.cloud.bigquery.migration.v2.AzureSynapseDialect getAzureSynapseDialect();
  /**
   *
   *
   * <pre>
   * The Azure Synapse dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.AzureSynapseDialect azure_synapse_dialect = 9;</code>
   */
  com.google.cloud.bigquery.migration.v2.AzureSynapseDialectOrBuilder
      getAzureSynapseDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The Vertica dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.VerticaDialect vertica_dialect = 10;</code>
   *
   * @return Whether the verticaDialect field is set.
   */
  boolean hasVerticaDialect();
  /**
   *
   *
   * <pre>
   * The Vertica dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.VerticaDialect vertica_dialect = 10;</code>
   *
   * @return The verticaDialect.
   */
  com.google.cloud.bigquery.migration.v2.VerticaDialect getVerticaDialect();
  /**
   *
   *
   * <pre>
   * The Vertica dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.VerticaDialect vertica_dialect = 10;</code>
   */
  com.google.cloud.bigquery.migration.v2.VerticaDialectOrBuilder getVerticaDialectOrBuilder();

  /**
   *
   *
   * <pre>
   * The SQL Server dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SQLServerDialect sql_server_dialect = 11;</code>
   *
   * @return Whether the sqlServerDialect field is set.
   */
  boolean hasSqlServerDialect();
  /**
   *
   *
   * <pre>
   * The SQL Server dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SQLServerDialect sql_server_dialect = 11;</code>
   *
   * @return The sqlServerDialect.
   */
  com.google.cloud.bigquery.migration.v2.SQLServerDialect getSqlServerDialect();
  /**
   *
   *
   * <pre>
   * The SQL Server dialect
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.SQLServerDialect sql_server_dialect = 11;</code>
   */
  com.google.cloud.bigquery.migration.v2.SQLServerDialectOrBuilder getSqlServerDialectOrBuilder();

  public com.google.cloud.bigquery.migration.v2.Dialect.DialectValueCase getDialectValueCase();
}
