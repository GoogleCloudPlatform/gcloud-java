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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

package com.google.cloud.clouddms.v1;

public interface CloudSqlSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.CloudSqlSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The database engine type and version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlDatabaseVersion database_version = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for databaseVersion.
   */
  int getDatabaseVersionValue();
  /**
   *
   *
   * <pre>
   * The database engine type and version.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlDatabaseVersion database_version = 1;
   * </code>
   *
   * @return The databaseVersion.
   */
  com.google.cloud.clouddms.v1.CloudSqlSettings.SqlDatabaseVersion getDatabaseVersion();

  /**
   *
   *
   * <pre>
   * The resource labels for a Cloud SQL instance to use to annotate any related
   * underlying resources such as Compute Engine VMs.
   * An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The resource labels for a Cloud SQL instance to use to annotate any related
   * underlying resources such as Compute Engine VMs.
   * An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The resource labels for a Cloud SQL instance to use to annotate any related
   * underlying resources such as Compute Engine VMs.
   * An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The resource labels for a Cloud SQL instance to use to annotate any related
   * underlying resources such as Compute Engine VMs.
   * An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2;</code>
   */

  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The resource labels for a Cloud SQL instance to use to annotate any related
   * underlying resources such as Compute Engine VMs.
   * An object containing a list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 2;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The tier (or machine type) for this instance, for example:
   * `db-n1-standard-1` (MySQL instances) or
   * `db-custom-1-3840` (PostgreSQL instances).
   * For more information, see
   * [Cloud SQL Instance
   * Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
   * </pre>
   *
   * <code>string tier = 3;</code>
   *
   * @return The tier.
   */
  java.lang.String getTier();
  /**
   *
   *
   * <pre>
   * The tier (or machine type) for this instance, for example:
   * `db-n1-standard-1` (MySQL instances) or
   * `db-custom-1-3840` (PostgreSQL instances).
   * For more information, see
   * [Cloud SQL Instance
   * Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
   * </pre>
   *
   * <code>string tier = 3;</code>
   *
   * @return The bytes for tier.
   */
  com.google.protobuf.ByteString getTierBytes();

  /**
   *
   *
   * <pre>
   * The maximum size to which storage capacity can be automatically increased.
   * The default value is 0, which specifies that there is no limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value storage_auto_resize_limit = 4;</code>
   *
   * @return Whether the storageAutoResizeLimit field is set.
   */
  boolean hasStorageAutoResizeLimit();
  /**
   *
   *
   * <pre>
   * The maximum size to which storage capacity can be automatically increased.
   * The default value is 0, which specifies that there is no limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value storage_auto_resize_limit = 4;</code>
   *
   * @return The storageAutoResizeLimit.
   */
  com.google.protobuf.Int64Value getStorageAutoResizeLimit();
  /**
   *
   *
   * <pre>
   * The maximum size to which storage capacity can be automatically increased.
   * The default value is 0, which specifies that there is no limit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value storage_auto_resize_limit = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getStorageAutoResizeLimitOrBuilder();

  /**
   *
   *
   * <pre>
   * The activation policy specifies when the instance is activated; it is
   * applicable only when the instance state is 'RUNNABLE'. Valid values:
   * 'ALWAYS': The instance is on, and remains so even in
   * the absence of connection requests.
   * `NEVER`: The instance is off; it is not activated, even if a
   * connection request arrives.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlActivationPolicy activation_policy = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for activationPolicy.
   */
  int getActivationPolicyValue();
  /**
   *
   *
   * <pre>
   * The activation policy specifies when the instance is activated; it is
   * applicable only when the instance state is 'RUNNABLE'. Valid values:
   * 'ALWAYS': The instance is on, and remains so even in
   * the absence of connection requests.
   * `NEVER`: The instance is off; it is not activated, even if a
   * connection request arrives.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlActivationPolicy activation_policy = 5;
   * </code>
   *
   * @return The activationPolicy.
   */
  com.google.cloud.clouddms.v1.CloudSqlSettings.SqlActivationPolicy getActivationPolicy();

  /**
   *
   *
   * <pre>
   * The settings for IP Management. This allows to enable or disable the
   * instance IP and manage which external networks can connect to the instance.
   * The IPv4 address cannot be disabled.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SqlIpConfig ip_config = 6;</code>
   *
   * @return Whether the ipConfig field is set.
   */
  boolean hasIpConfig();
  /**
   *
   *
   * <pre>
   * The settings for IP Management. This allows to enable or disable the
   * instance IP and manage which external networks can connect to the instance.
   * The IPv4 address cannot be disabled.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SqlIpConfig ip_config = 6;</code>
   *
   * @return The ipConfig.
   */
  com.google.cloud.clouddms.v1.SqlIpConfig getIpConfig();
  /**
   *
   *
   * <pre>
   * The settings for IP Management. This allows to enable or disable the
   * instance IP and manage which external networks can connect to the instance.
   * The IPv4 address cannot be disabled.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SqlIpConfig ip_config = 6;</code>
   */
  com.google.cloud.clouddms.v1.SqlIpConfigOrBuilder getIpConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [default: ON] If you enable this setting, Cloud SQL checks your available
   * storage every 30 seconds. If the available storage falls below a threshold
   * size, Cloud SQL automatically adds additional storage capacity. If the
   * available storage repeatedly falls below the threshold size, Cloud SQL
   * continues to add storage until it reaches the maximum of 30 TB.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_storage_increase = 7;</code>
   *
   * @return Whether the autoStorageIncrease field is set.
   */
  boolean hasAutoStorageIncrease();
  /**
   *
   *
   * <pre>
   * [default: ON] If you enable this setting, Cloud SQL checks your available
   * storage every 30 seconds. If the available storage falls below a threshold
   * size, Cloud SQL automatically adds additional storage capacity. If the
   * available storage repeatedly falls below the threshold size, Cloud SQL
   * continues to add storage until it reaches the maximum of 30 TB.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_storage_increase = 7;</code>
   *
   * @return The autoStorageIncrease.
   */
  com.google.protobuf.BoolValue getAutoStorageIncrease();
  /**
   *
   *
   * <pre>
   * [default: ON] If you enable this setting, Cloud SQL checks your available
   * storage every 30 seconds. If the available storage falls below a threshold
   * size, Cloud SQL automatically adds additional storage capacity. If the
   * available storage repeatedly falls below the threshold size, Cloud SQL
   * continues to add storage until it reaches the maximum of 30 TB.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue auto_storage_increase = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAutoStorageIncreaseOrBuilder();

  /**
   *
   *
   * <pre>
   * The database flags passed to the Cloud SQL instance at startup.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 8;</code>
   */
  int getDatabaseFlagsCount();
  /**
   *
   *
   * <pre>
   * The database flags passed to the Cloud SQL instance at startup.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 8;</code>
   */
  boolean containsDatabaseFlags(java.lang.String key);
  /** Use {@link #getDatabaseFlagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDatabaseFlags();
  /**
   *
   *
   * <pre>
   * The database flags passed to the Cloud SQL instance at startup.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDatabaseFlagsMap();
  /**
   *
   *
   * <pre>
   * The database flags passed to the Cloud SQL instance at startup.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 8;</code>
   */

  /* nullable */
  java.lang.String getDatabaseFlagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The database flags passed to the Cloud SQL instance at startup.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 8;</code>
   */
  java.lang.String getDatabaseFlagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The type of storage: `PD_SSD` (default) or `PD_HDD`.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlDataDiskType data_disk_type = 9;</code>
   *
   * @return The enum numeric value on the wire for dataDiskType.
   */
  int getDataDiskTypeValue();
  /**
   *
   *
   * <pre>
   * The type of storage: `PD_SSD` (default) or `PD_HDD`.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.CloudSqlSettings.SqlDataDiskType data_disk_type = 9;</code>
   *
   * @return The dataDiskType.
   */
  com.google.cloud.clouddms.v1.CloudSqlSettings.SqlDataDiskType getDataDiskType();

  /**
   *
   *
   * <pre>
   * The storage capacity available to the database, in GB.
   * The minimum (and default) size is 10GB.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_disk_size_gb = 10;</code>
   *
   * @return Whether the dataDiskSizeGb field is set.
   */
  boolean hasDataDiskSizeGb();
  /**
   *
   *
   * <pre>
   * The storage capacity available to the database, in GB.
   * The minimum (and default) size is 10GB.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_disk_size_gb = 10;</code>
   *
   * @return The dataDiskSizeGb.
   */
  com.google.protobuf.Int64Value getDataDiskSizeGb();
  /**
   *
   *
   * <pre>
   * The storage capacity available to the database, in GB.
   * The minimum (and default) size is 10GB.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_disk_size_gb = 10;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDataDiskSizeGbOrBuilder();

  /**
   *
   *
   * <pre>
   * The Google Cloud Platform zone where your Cloud SQL datdabse instance is
   * located.
   * </pre>
   *
   * <code>string zone = 11;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform zone where your Cloud SQL datdabse instance is
   * located.
   * </pre>
   *
   * <code>string zone = 11;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * The Database Migration Service source connection profile ID,
   * in the format:
   * `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
   * </pre>
   *
   * <code>string source_id = 12;</code>
   *
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   *
   *
   * <pre>
   * The Database Migration Service source connection profile ID,
   * in the format:
   * `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
   * </pre>
   *
   * <code>string source_id = 12;</code>
   *
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString getSourceIdBytes();

  /**
   *
   *
   * <pre>
   * Input only. Initial root password.
   * </pre>
   *
   * <code>string root_password = 13 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The rootPassword.
   */
  java.lang.String getRootPassword();
  /**
   *
   *
   * <pre>
   * Input only. Initial root password.
   * </pre>
   *
   * <code>string root_password = 13 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for rootPassword.
   */
  com.google.protobuf.ByteString getRootPasswordBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates If this connection profile root password is stored.
   * </pre>
   *
   * <code>bool root_password_set = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rootPasswordSet.
   */
  boolean getRootPasswordSet();

  /**
   *
   *
   * <pre>
   * The Cloud SQL default instance level collation.
   * </pre>
   *
   * <code>string collation = 15;</code>
   *
   * @return The collation.
   */
  java.lang.String getCollation();
  /**
   *
   *
   * <pre>
   * The Cloud SQL default instance level collation.
   * </pre>
   *
   * <code>string collation = 15;</code>
   *
   * @return The bytes for collation.
   */
  com.google.protobuf.ByteString getCollationBytes();
}
