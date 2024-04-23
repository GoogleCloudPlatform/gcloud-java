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
// source: google/monitoring/dashboard/v1/widget.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.dashboard.v1;

public interface WidgetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.Widget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The title of the widget.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Optional. The title of the widget.
   * </pre>
   *
   * <code>string title = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * A chart of time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart xy_chart = 2;</code>
   *
   * @return Whether the xyChart field is set.
   */
  boolean hasXyChart();
  /**
   *
   *
   * <pre>
   * A chart of time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart xy_chart = 2;</code>
   *
   * @return The xyChart.
   */
  com.google.monitoring.dashboard.v1.XyChart getXyChart();
  /**
   *
   *
   * <pre>
   * A chart of time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart xy_chart = 2;</code>
   */
  com.google.monitoring.dashboard.v1.XyChartOrBuilder getXyChartOrBuilder();

  /**
   *
   *
   * <pre>
   * A scorecard summarizing time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Scorecard scorecard = 3;</code>
   *
   * @return Whether the scorecard field is set.
   */
  boolean hasScorecard();
  /**
   *
   *
   * <pre>
   * A scorecard summarizing time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Scorecard scorecard = 3;</code>
   *
   * @return The scorecard.
   */
  com.google.monitoring.dashboard.v1.Scorecard getScorecard();
  /**
   *
   *
   * <pre>
   * A scorecard summarizing time series data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Scorecard scorecard = 3;</code>
   */
  com.google.monitoring.dashboard.v1.ScorecardOrBuilder getScorecardOrBuilder();

  /**
   *
   *
   * <pre>
   * A raw string or markdown displaying textual content.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text text = 4;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * A raw string or markdown displaying textual content.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text text = 4;</code>
   *
   * @return The text.
   */
  com.google.monitoring.dashboard.v1.Text getText();
  /**
   *
   *
   * <pre>
   * A raw string or markdown displaying textual content.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text text = 4;</code>
   */
  com.google.monitoring.dashboard.v1.TextOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * A blank space.
   * </pre>
   *
   * <code>.google.protobuf.Empty blank = 5;</code>
   *
   * @return Whether the blank field is set.
   */
  boolean hasBlank();
  /**
   *
   *
   * <pre>
   * A blank space.
   * </pre>
   *
   * <code>.google.protobuf.Empty blank = 5;</code>
   *
   * @return The blank.
   */
  com.google.protobuf.Empty getBlank();
  /**
   *
   *
   * <pre>
   * A blank space.
   * </pre>
   *
   * <code>.google.protobuf.Empty blank = 5;</code>
   */
  com.google.protobuf.EmptyOrBuilder getBlankOrBuilder();

  /**
   *
   *
   * <pre>
   * A chart of alert policy data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.AlertChart alert_chart = 7;</code>
   *
   * @return Whether the alertChart field is set.
   */
  boolean hasAlertChart();
  /**
   *
   *
   * <pre>
   * A chart of alert policy data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.AlertChart alert_chart = 7;</code>
   *
   * @return The alertChart.
   */
  com.google.monitoring.dashboard.v1.AlertChart getAlertChart();
  /**
   *
   *
   * <pre>
   * A chart of alert policy data.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.AlertChart alert_chart = 7;</code>
   */
  com.google.monitoring.dashboard.v1.AlertChartOrBuilder getAlertChartOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that displays time series data in a tabular format.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesTable time_series_table = 8;</code>
   *
   * @return Whether the timeSeriesTable field is set.
   */
  boolean hasTimeSeriesTable();
  /**
   *
   *
   * <pre>
   * A widget that displays time series data in a tabular format.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesTable time_series_table = 8;</code>
   *
   * @return The timeSeriesTable.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable getTimeSeriesTable();
  /**
   *
   *
   * <pre>
   * A widget that displays time series data in a tabular format.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesTable time_series_table = 8;</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTableOrBuilder getTimeSeriesTableOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets. All widgets that are within
   * the area spanned by the grouping widget are considered member widgets.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.CollapsibleGroup collapsible_group = 9;</code>
   *
   * @return Whether the collapsibleGroup field is set.
   */
  boolean hasCollapsibleGroup();
  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets. All widgets that are within
   * the area spanned by the grouping widget are considered member widgets.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.CollapsibleGroup collapsible_group = 9;</code>
   *
   * @return The collapsibleGroup.
   */
  com.google.monitoring.dashboard.v1.CollapsibleGroup getCollapsibleGroup();
  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets. All widgets that are within
   * the area spanned by the grouping widget are considered member widgets.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.CollapsibleGroup collapsible_group = 9;</code>
   */
  com.google.monitoring.dashboard.v1.CollapsibleGroupOrBuilder getCollapsibleGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that shows a stream of logs.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.LogsPanel logs_panel = 10;</code>
   *
   * @return Whether the logsPanel field is set.
   */
  boolean hasLogsPanel();
  /**
   *
   *
   * <pre>
   * A widget that shows a stream of logs.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.LogsPanel logs_panel = 10;</code>
   *
   * @return The logsPanel.
   */
  com.google.monitoring.dashboard.v1.LogsPanel getLogsPanel();
  /**
   *
   *
   * <pre>
   * A widget that shows a stream of logs.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.LogsPanel logs_panel = 10;</code>
   */
  com.google.monitoring.dashboard.v1.LogsPanelOrBuilder getLogsPanelOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that shows list of incidents.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.IncidentList incident_list = 12;</code>
   *
   * @return Whether the incidentList field is set.
   */
  boolean hasIncidentList();
  /**
   *
   *
   * <pre>
   * A widget that shows list of incidents.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.IncidentList incident_list = 12;</code>
   *
   * @return The incidentList.
   */
  com.google.monitoring.dashboard.v1.IncidentList getIncidentList();
  /**
   *
   *
   * <pre>
   * A widget that shows list of incidents.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.IncidentList incident_list = 12;</code>
   */
  com.google.monitoring.dashboard.v1.IncidentListOrBuilder getIncidentListOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that displays timeseries data as a pie chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PieChart pie_chart = 14;</code>
   *
   * @return Whether the pieChart field is set.
   */
  boolean hasPieChart();
  /**
   *
   *
   * <pre>
   * A widget that displays timeseries data as a pie chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PieChart pie_chart = 14;</code>
   *
   * @return The pieChart.
   */
  com.google.monitoring.dashboard.v1.PieChart getPieChart();
  /**
   *
   *
   * <pre>
   * A widget that displays timeseries data as a pie chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PieChart pie_chart = 14;</code>
   */
  com.google.monitoring.dashboard.v1.PieChartOrBuilder getPieChartOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that displays a list of error groups.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ErrorReportingPanel error_reporting_panel = 19;</code>
   *
   * @return Whether the errorReportingPanel field is set.
   */
  boolean hasErrorReportingPanel();
  /**
   *
   *
   * <pre>
   * A widget that displays a list of error groups.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ErrorReportingPanel error_reporting_panel = 19;</code>
   *
   * @return The errorReportingPanel.
   */
  com.google.monitoring.dashboard.v1.ErrorReportingPanel getErrorReportingPanel();
  /**
   *
   *
   * <pre>
   * A widget that displays a list of error groups.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ErrorReportingPanel error_reporting_panel = 19;</code>
   */
  com.google.monitoring.dashboard.v1.ErrorReportingPanelOrBuilder getErrorReportingPanelOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that defines a section header for easier navigation of the
   * dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SectionHeader section_header = 21;</code>
   *
   * @return Whether the sectionHeader field is set.
   */
  boolean hasSectionHeader();
  /**
   *
   *
   * <pre>
   * A widget that defines a section header for easier navigation of the
   * dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SectionHeader section_header = 21;</code>
   *
   * @return The sectionHeader.
   */
  com.google.monitoring.dashboard.v1.SectionHeader getSectionHeader();
  /**
   *
   *
   * <pre>
   * A widget that defines a section header for easier navigation of the
   * dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SectionHeader section_header = 21;</code>
   */
  com.google.monitoring.dashboard.v1.SectionHeaderOrBuilder getSectionHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets by using a dropdown menu.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SingleViewGroup single_view_group = 22;</code>
   *
   * @return Whether the singleViewGroup field is set.
   */
  boolean hasSingleViewGroup();
  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets by using a dropdown menu.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SingleViewGroup single_view_group = 22;</code>
   *
   * @return The singleViewGroup.
   */
  com.google.monitoring.dashboard.v1.SingleViewGroup getSingleViewGroup();
  /**
   *
   *
   * <pre>
   * A widget that groups the other widgets by using a dropdown menu.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.SingleViewGroup single_view_group = 22;</code>
   */
  com.google.monitoring.dashboard.v1.SingleViewGroupOrBuilder getSingleViewGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The widget id. Ids may be made up of alphanumerics, dashes and
   * underscores. Widget ids are optional.
   * </pre>
   *
   * <code>string id = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Optional. The widget id. Ids may be made up of alphanumerics, dashes and
   * underscores. Widget ids are optional.
   * </pre>
   *
   * <code>string id = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  com.google.monitoring.dashboard.v1.Widget.ContentCase getContentCase();
}
