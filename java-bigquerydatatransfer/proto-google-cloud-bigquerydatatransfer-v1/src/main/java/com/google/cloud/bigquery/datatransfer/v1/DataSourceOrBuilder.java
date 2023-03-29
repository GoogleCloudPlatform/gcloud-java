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
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DataSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Data source resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Data source resource name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Data source id.
   * </pre>
   *
   * <code>string data_source_id = 2;</code>
   *
   * @return The dataSourceId.
   */
  java.lang.String getDataSourceId();
  /**
   *
   *
   * <pre>
   * Data source id.
   * </pre>
   *
   * <code>string data_source_id = 2;</code>
   *
   * @return The bytes for dataSourceId.
   */
  com.google.protobuf.ByteString getDataSourceIdBytes();

  /**
   *
   *
   * <pre>
   * User friendly data source name.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * User friendly data source name.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * User friendly data source description string.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User friendly data source description string.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Data source client id which should be used to receive refresh token.
   * </pre>
   *
   * <code>string client_id = 5;</code>
   *
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   *
   *
   * <pre>
   * Data source client id which should be used to receive refresh token.
   * </pre>
   *
   * <code>string client_id = 5;</code>
   *
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString getClientIdBytes();

  /**
   *
   *
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. These are
   * scopes needed by a data source to prepare data and ingest them into
   * BigQuery, e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   *
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String> getScopesList();
  /**
   *
   *
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. These are
   * scopes needed by a data source to prepare data and ingest them into
   * BigQuery, e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   *
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   *
   *
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. These are
   * scopes needed by a data source to prepare data and ingest them into
   * BigQuery, e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   *
   *
   * <pre>
   * Api auth scopes for which refresh token needs to be obtained. These are
   * scopes needed by a data source to prepare data and ingest them into
   * BigQuery, e.g., https://www.googleapis.com/auth/bigquery
   * </pre>
   *
   * <code>repeated string scopes = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString getScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferType transfer_type = 7 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.bigquery.datatransfer.v1.DataSource.transfer_type is deprecated. See
   *     google/cloud/bigquery/datatransfer/v1/datatransfer.proto;l=380
   * @return The enum numeric value on the wire for transferType.
   */
  @java.lang.Deprecated
  int getTransferTypeValue();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferType transfer_type = 7 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.bigquery.datatransfer.v1.DataSource.transfer_type is deprecated. See
   *     google/cloud/bigquery/datatransfer/v1/datatransfer.proto;l=380
   * @return The transferType.
   */
  @java.lang.Deprecated
  com.google.cloud.bigquery.datatransfer.v1.TransferType getTransferType();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>bool supports_multiple_transfers = 8 [deprecated = true];</code>
   *
   * @deprecated google.cloud.bigquery.datatransfer.v1.DataSource.supports_multiple_transfers is
   *     deprecated. See google/cloud/bigquery/datatransfer/v1/datatransfer.proto;l=383
   * @return The supportsMultipleTransfers.
   */
  @java.lang.Deprecated
  boolean getSupportsMultipleTransfers();

  /**
   *
   *
   * <pre>
   * The number of seconds to wait for an update from the data source
   * before the Data Transfer Service marks the transfer as FAILED.
   * </pre>
   *
   * <code>int32 update_deadline_seconds = 9;</code>
   *
   * @return The updateDeadlineSeconds.
   */
  int getUpdateDeadlineSeconds();

  /**
   *
   *
   * <pre>
   * Default data transfer schedule.
   * Examples of valid schedules include:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * </pre>
   *
   * <code>string default_schedule = 10;</code>
   *
   * @return The defaultSchedule.
   */
  java.lang.String getDefaultSchedule();
  /**
   *
   *
   * <pre>
   * Default data transfer schedule.
   * Examples of valid schedules include:
   * `1st,3rd monday of month 15:30`,
   * `every wed,fri of jan,jun 13:15`, and
   * `first sunday of quarter 00:00`.
   * </pre>
   *
   * <code>string default_schedule = 10;</code>
   *
   * @return The bytes for defaultSchedule.
   */
  com.google.protobuf.ByteString getDefaultScheduleBytes();

  /**
   *
   *
   * <pre>
   * Specifies whether the data source supports a user defined schedule, or
   * operates on the default schedule.
   * When set to `true`, user can override default schedule.
   * </pre>
   *
   * <code>bool supports_custom_schedule = 11;</code>
   *
   * @return The supportsCustomSchedule.
   */
  boolean getSupportsCustomSchedule();

  /**
   *
   *
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter> getParametersList();
  /**
   *
   *
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;
   * </code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Data source parameters.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.DataSourceParameter parameters = 12;
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceParameterOrBuilder getParametersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Url for the help document for this data source.
   * </pre>
   *
   * <code>string help_url = 13;</code>
   *
   * @return The helpUrl.
   */
  java.lang.String getHelpUrl();
  /**
   *
   *
   * <pre>
   * Url for the help document for this data source.
   * </pre>
   *
   * <code>string help_url = 13;</code>
   *
   * @return The bytes for helpUrl.
   */
  com.google.protobuf.ByteString getHelpUrlBytes();

  /**
   *
   *
   * <pre>
   * Indicates the type of authorization.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType authorization_type = 14;
   * </code>
   *
   * @return The enum numeric value on the wire for authorizationType.
   */
  int getAuthorizationTypeValue();
  /**
   *
   *
   * <pre>
   * Indicates the type of authorization.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType authorization_type = 14;
   * </code>
   *
   * @return The authorizationType.
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource.AuthorizationType getAuthorizationType();

  /**
   *
   *
   * <pre>
   * Specifies whether the data source supports automatic data refresh for the
   * past few days, and how it's supported.
   * For some data sources, data might not be complete until a few days later,
   * so it's useful to refresh data automatically.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType data_refresh_type = 15;
   * </code>
   *
   * @return The enum numeric value on the wire for dataRefreshType.
   */
  int getDataRefreshTypeValue();
  /**
   *
   *
   * <pre>
   * Specifies whether the data source supports automatic data refresh for the
   * past few days, and how it's supported.
   * For some data sources, data might not be complete until a few days later,
   * so it's useful to refresh data automatically.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType data_refresh_type = 15;
   * </code>
   *
   * @return The dataRefreshType.
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSource.DataRefreshType getDataRefreshType();

  /**
   *
   *
   * <pre>
   * Default data refresh window on days.
   * Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`.
   * </pre>
   *
   * <code>int32 default_data_refresh_window_days = 16;</code>
   *
   * @return The defaultDataRefreshWindowDays.
   */
  int getDefaultDataRefreshWindowDays();

  /**
   *
   *
   * <pre>
   * Disables backfilling and manual run scheduling
   * for the data source.
   * </pre>
   *
   * <code>bool manual_runs_disabled = 17;</code>
   *
   * @return The manualRunsDisabled.
   */
  boolean getManualRunsDisabled();

  /**
   *
   *
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   *
   * @return Whether the minimumScheduleInterval field is set.
   */
  boolean hasMinimumScheduleInterval();
  /**
   *
   *
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   *
   * @return The minimumScheduleInterval.
   */
  com.google.protobuf.Duration getMinimumScheduleInterval();
  /**
   *
   *
   * <pre>
   * The minimum interval for scheduler to schedule runs.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_schedule_interval = 18;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinimumScheduleIntervalOrBuilder();
}
