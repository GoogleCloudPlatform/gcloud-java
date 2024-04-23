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
// source: google/cloud/dataproc/v1/jobs.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface HiveJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.HiveJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HCFS URI of the script that contains Hive queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   *
   * @return Whether the queryFileUri field is set.
   */
  boolean hasQueryFileUri();
  /**
   *
   *
   * <pre>
   * The HCFS URI of the script that contains Hive queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   *
   * @return The queryFileUri.
   */
  java.lang.String getQueryFileUri();
  /**
   *
   *
   * <pre>
   * The HCFS URI of the script that contains Hive queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   *
   * @return The bytes for queryFileUri.
   */
  com.google.protobuf.ByteString getQueryFileUriBytes();

  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   *
   * @return Whether the queryList field is set.
   */
  boolean hasQueryList();
  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   *
   * @return The queryList.
   */
  com.google.cloud.dataproc.v1.QueryList getQueryList();
  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   */
  com.google.cloud.dataproc.v1.QueryListOrBuilder getQueryListOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether to continue executing queries if a query fails.
   * The default value is `false`. Setting to `true` can be useful when
   * executing independent parallel queries.
   * </pre>
   *
   * <code>bool continue_on_failure = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The continueOnFailure.
   */
  boolean getContinueOnFailure();

  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Hive command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getScriptVariablesCount();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Hive command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsScriptVariables(java.lang.String key);
  /** Use {@link #getScriptVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getScriptVariables();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Hive command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getScriptVariablesMap();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Hive command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getScriptVariablesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the
   * Hive command: `SET name="value";`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getScriptVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names and values, used to configure Hive.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in `/etc/hadoop/conf/&#42;-site.xml`,
   * /etc/hive/conf/hive-site.xml, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names and values, used to configure Hive.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in `/etc/hadoop/conf/&#42;-site.xml`,
   * /etc/hive/conf/hive-site.xml, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names and values, used to configure Hive.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in `/etc/hadoop/conf/&#42;-site.xml`,
   * /etc/hive/conf/hive-site.xml, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names and values, used to configure Hive.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in `/etc/hadoop/conf/&#42;-site.xml`,
   * /etc/hive/conf/hive-site.xml, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names and values, used to configure Hive.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in `/etc/hadoop/conf/&#42;-site.xml`,
   * /etc/hive/conf/hive-site.xml, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the
   * Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes
   * and UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the jarFileUris.
   */
  java.util.List<java.lang.String> getJarFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the
   * Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes
   * and UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of jarFileUris.
   */
  int getJarFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the
   * Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes
   * and UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The jarFileUris at the given index.
   */
  java.lang.String getJarFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the
   * Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes
   * and UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the jarFileUris at the given index.
   */
  com.google.protobuf.ByteString getJarFileUrisBytes(int index);

  com.google.cloud.dataproc.v1.HiveJob.QueriesCase getQueriesCase();
}
