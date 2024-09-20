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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_time_series_forecasting.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlForecastingInputsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the column that the model is to predict.
   * </pre>
   *
   * <code>string target_column = 1;</code>
   *
   * @return The targetColumn.
   */
  java.lang.String getTargetColumn();
  /**
   *
   *
   * <pre>
   * The name of the column that the model is to predict.
   * </pre>
   *
   * <code>string target_column = 1;</code>
   *
   * @return The bytes for targetColumn.
   */
  com.google.protobuf.ByteString getTargetColumnBytes();

  /**
   *
   *
   * <pre>
   * The name of the column that identifies the time series.
   * </pre>
   *
   * <code>string time_series_identifier_column = 2;</code>
   *
   * @return The timeSeriesIdentifierColumn.
   */
  java.lang.String getTimeSeriesIdentifierColumn();
  /**
   *
   *
   * <pre>
   * The name of the column that identifies the time series.
   * </pre>
   *
   * <code>string time_series_identifier_column = 2;</code>
   *
   * @return The bytes for timeSeriesIdentifierColumn.
   */
  com.google.protobuf.ByteString getTimeSeriesIdentifierColumnBytes();

  /**
   *
   *
   * <pre>
   * The name of the column that identifies time order in the time series.
   * </pre>
   *
   * <code>string time_column = 3;</code>
   *
   * @return The timeColumn.
   */
  java.lang.String getTimeColumn();
  /**
   *
   *
   * <pre>
   * The name of the column that identifies time order in the time series.
   * </pre>
   *
   * <code>string time_column = 3;</code>
   *
   * @return The bytes for timeColumn.
   */
  com.google.protobuf.ByteString getTimeColumnBytes();

  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Transformation transformations = 4;
   * </code>
   */
  java.util.List<
          com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs
              .Transformation>
      getTransformationsList();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Transformation transformations = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs
          .Transformation
      getTransformations(int index);
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Transformation transformations = 4;
   * </code>
   */
  int getTransformationsCount();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Transformation transformations = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlForecastingInputs.TransformationOrBuilder>
      getTransformationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Each transformation will apply transform function to given input column.
   * And the result will be used for training.
   * When creating transformation for BigQuery Struct column, the column should
   * be flattened using "." as the delimiter.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Transformation transformations = 4;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs
          .TransformationOrBuilder
      getTransformationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that optimizes the value of the objective
   * function over the validation set.
   *
   * The supported optimization objectives:
   *
   *   * "minimize-rmse" (default) - Minimize root-mean-squared error (RMSE).
   *
   *   * "minimize-mae" - Minimize mean-absolute error (MAE).
   *
   *   * "minimize-rmsle" - Minimize root-mean-squared log error (RMSLE).
   *
   *   * "minimize-rmspe" - Minimize root-mean-squared percentage error (RMSPE).
   *
   *   * "minimize-wape-mae" - Minimize the combination of weighted absolute
   *     percentage error (WAPE) and mean-absolute-error (MAE).
   *
   *   * "minimize-quantile-loss" - Minimize the quantile loss at the quantiles
   *     defined in `quantiles`.
   * </pre>
   *
   * <code>string optimization_objective = 5;</code>
   *
   * @return The optimizationObjective.
   */
  java.lang.String getOptimizationObjective();
  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that optimizes the value of the objective
   * function over the validation set.
   *
   * The supported optimization objectives:
   *
   *   * "minimize-rmse" (default) - Minimize root-mean-squared error (RMSE).
   *
   *   * "minimize-mae" - Minimize mean-absolute error (MAE).
   *
   *   * "minimize-rmsle" - Minimize root-mean-squared log error (RMSLE).
   *
   *   * "minimize-rmspe" - Minimize root-mean-squared percentage error (RMSPE).
   *
   *   * "minimize-wape-mae" - Minimize the combination of weighted absolute
   *     percentage error (WAPE) and mean-absolute-error (MAE).
   *
   *   * "minimize-quantile-loss" - Minimize the quantile loss at the quantiles
   *     defined in `quantiles`.
   * </pre>
   *
   * <code>string optimization_objective = 5;</code>
   *
   * @return The bytes for optimizationObjective.
   */
  com.google.protobuf.ByteString getOptimizationObjectiveBytes();

  /**
   *
   *
   * <pre>
   * Required. The train budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour.
   *
   * The training cost of the model will not exceed this budget. The final cost
   * will be attempted to be close to the budget, though may end up being (even)
   * noticeably smaller - at the backend's discretion. This especially may
   * happen when further model training ceases to provide any improvements.
   *
   * If the budget is set to a value known to be insufficient to train a
   * model for the given dataset, the training won't be attempted and
   * will error.
   *
   * The train budget must be between 1,000 and 72,000 milli node hours,
   * inclusive.
   * </pre>
   *
   * <code>int64 train_budget_milli_node_hours = 6;</code>
   *
   * @return The trainBudgetMilliNodeHours.
   */
  long getTrainBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Column name that should be used as the weight column.
   * Higher values in this column give more importance to the row
   * during model training. The column must have numeric values between 0 and
   * 10000 inclusively; 0 means the row is ignored for training. If weight
   * column field is not set, then all rows are assumed to have equal weight
   * of 1.
   * </pre>
   *
   * <code>string weight_column = 7;</code>
   *
   * @return The weightColumn.
   */
  java.lang.String getWeightColumn();
  /**
   *
   *
   * <pre>
   * Column name that should be used as the weight column.
   * Higher values in this column give more importance to the row
   * during model training. The column must have numeric values between 0 and
   * 10000 inclusively; 0 means the row is ignored for training. If weight
   * column field is not set, then all rows are assumed to have equal weight
   * of 1.
   * </pre>
   *
   * <code>string weight_column = 7;</code>
   *
   * @return The bytes for weightColumn.
   */
  com.google.protobuf.ByteString getWeightColumnBytes();

  /**
   *
   *
   * <pre>
   * Column names that should be used as attribute columns.
   * The value of these columns does not vary as a function of time.
   * For example, store ID or item color.
   * </pre>
   *
   * <code>repeated string time_series_attribute_columns = 19;</code>
   *
   * @return A list containing the timeSeriesAttributeColumns.
   */
  java.util.List<java.lang.String> getTimeSeriesAttributeColumnsList();
  /**
   *
   *
   * <pre>
   * Column names that should be used as attribute columns.
   * The value of these columns does not vary as a function of time.
   * For example, store ID or item color.
   * </pre>
   *
   * <code>repeated string time_series_attribute_columns = 19;</code>
   *
   * @return The count of timeSeriesAttributeColumns.
   */
  int getTimeSeriesAttributeColumnsCount();
  /**
   *
   *
   * <pre>
   * Column names that should be used as attribute columns.
   * The value of these columns does not vary as a function of time.
   * For example, store ID or item color.
   * </pre>
   *
   * <code>repeated string time_series_attribute_columns = 19;</code>
   *
   * @param index The index of the element to return.
   * @return The timeSeriesAttributeColumns at the given index.
   */
  java.lang.String getTimeSeriesAttributeColumns(int index);
  /**
   *
   *
   * <pre>
   * Column names that should be used as attribute columns.
   * The value of these columns does not vary as a function of time.
   * For example, store ID or item color.
   * </pre>
   *
   * <code>repeated string time_series_attribute_columns = 19;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the timeSeriesAttributeColumns at the given index.
   */
  com.google.protobuf.ByteString getTimeSeriesAttributeColumnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Names of columns that are unavailable when a forecast is requested.
   * This column contains information for the given entity (identified
   * by the time_series_identifier_column) that is unknown before the forecast
   * For example, actual weather on a given day.
   * </pre>
   *
   * <code>repeated string unavailable_at_forecast_columns = 20;</code>
   *
   * @return A list containing the unavailableAtForecastColumns.
   */
  java.util.List<java.lang.String> getUnavailableAtForecastColumnsList();
  /**
   *
   *
   * <pre>
   * Names of columns that are unavailable when a forecast is requested.
   * This column contains information for the given entity (identified
   * by the time_series_identifier_column) that is unknown before the forecast
   * For example, actual weather on a given day.
   * </pre>
   *
   * <code>repeated string unavailable_at_forecast_columns = 20;</code>
   *
   * @return The count of unavailableAtForecastColumns.
   */
  int getUnavailableAtForecastColumnsCount();
  /**
   *
   *
   * <pre>
   * Names of columns that are unavailable when a forecast is requested.
   * This column contains information for the given entity (identified
   * by the time_series_identifier_column) that is unknown before the forecast
   * For example, actual weather on a given day.
   * </pre>
   *
   * <code>repeated string unavailable_at_forecast_columns = 20;</code>
   *
   * @param index The index of the element to return.
   * @return The unavailableAtForecastColumns at the given index.
   */
  java.lang.String getUnavailableAtForecastColumns(int index);
  /**
   *
   *
   * <pre>
   * Names of columns that are unavailable when a forecast is requested.
   * This column contains information for the given entity (identified
   * by the time_series_identifier_column) that is unknown before the forecast
   * For example, actual weather on a given day.
   * </pre>
   *
   * <code>repeated string unavailable_at_forecast_columns = 20;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unavailableAtForecastColumns at the given index.
   */
  com.google.protobuf.ByteString getUnavailableAtForecastColumnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Names of columns that are available and provided when a forecast
   * is requested. These columns
   * contain information for the given entity (identified by the
   * time_series_identifier_column column) that is known at forecast.
   * For example, predicted weather for a specific day.
   * </pre>
   *
   * <code>repeated string available_at_forecast_columns = 21;</code>
   *
   * @return A list containing the availableAtForecastColumns.
   */
  java.util.List<java.lang.String> getAvailableAtForecastColumnsList();
  /**
   *
   *
   * <pre>
   * Names of columns that are available and provided when a forecast
   * is requested. These columns
   * contain information for the given entity (identified by the
   * time_series_identifier_column column) that is known at forecast.
   * For example, predicted weather for a specific day.
   * </pre>
   *
   * <code>repeated string available_at_forecast_columns = 21;</code>
   *
   * @return The count of availableAtForecastColumns.
   */
  int getAvailableAtForecastColumnsCount();
  /**
   *
   *
   * <pre>
   * Names of columns that are available and provided when a forecast
   * is requested. These columns
   * contain information for the given entity (identified by the
   * time_series_identifier_column column) that is known at forecast.
   * For example, predicted weather for a specific day.
   * </pre>
   *
   * <code>repeated string available_at_forecast_columns = 21;</code>
   *
   * @param index The index of the element to return.
   * @return The availableAtForecastColumns at the given index.
   */
  java.lang.String getAvailableAtForecastColumns(int index);
  /**
   *
   *
   * <pre>
   * Names of columns that are available and provided when a forecast
   * is requested. These columns
   * contain information for the given entity (identified by the
   * time_series_identifier_column column) that is known at forecast.
   * For example, predicted weather for a specific day.
   * </pre>
   *
   * <code>repeated string available_at_forecast_columns = 21;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the availableAtForecastColumns at the given index.
   */
  com.google.protobuf.ByteString getAvailableAtForecastColumnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Expected difference in time granularity between rows in the data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Granularity data_granularity = 22;
   * </code>
   *
   * @return Whether the dataGranularity field is set.
   */
  boolean hasDataGranularity();
  /**
   *
   *
   * <pre>
   * Expected difference in time granularity between rows in the data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Granularity data_granularity = 22;
   * </code>
   *
   * @return The dataGranularity.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs
          .Granularity
      getDataGranularity();
  /**
   *
   *
   * <pre>
   * Expected difference in time granularity between rows in the data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs.Granularity data_granularity = 22;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingInputs
          .GranularityOrBuilder
      getDataGranularityOrBuilder();

  /**
   *
   *
   * <pre>
   * The amount of time into the future for which forecasted values for the
   * target are returned. Expressed in number of units defined by the
   * `data_granularity` field.
   * </pre>
   *
   * <code>int64 forecast_horizon = 23;</code>
   *
   * @return The forecastHorizon.
   */
  long getForecastHorizon();

  /**
   *
   *
   * <pre>
   * The amount of time into the past training and prediction data is used
   * for model training and prediction respectively. Expressed in number of
   * units defined by the `data_granularity` field.
   * </pre>
   *
   * <code>int64 context_window = 24;</code>
   *
   * @return The contextWindow.
   */
  long getContextWindow();

  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 15;
   * </code>
   *
   * @return Whether the exportEvaluatedDataItemsConfig field is set.
   */
  boolean hasExportEvaluatedDataItemsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 15;
   * </code>
   *
   * @return The exportEvaluatedDataItemsConfig.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig
      getExportEvaluatedDataItemsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for exporting test set predictions to a BigQuery table. If
   * this configuration is absent, then the export is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig export_evaluated_data_items_config = 15;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .ExportEvaluatedDataItemsConfigOrBuilder
      getExportEvaluatedDataItemsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Quantiles to use for minimize-quantile-loss `optimization_objective`. Up to
   * 5 quantiles are allowed of values between 0 and 1, exclusive. Required if
   * the value of optimization_objective is minimize-quantile-loss. Represents
   * the percent quantiles to use for that objective. Quantiles must be unique.
   * </pre>
   *
   * <code>repeated double quantiles = 16;</code>
   *
   * @return A list containing the quantiles.
   */
  java.util.List<java.lang.Double> getQuantilesList();
  /**
   *
   *
   * <pre>
   * Quantiles to use for minimize-quantile-loss `optimization_objective`. Up to
   * 5 quantiles are allowed of values between 0 and 1, exclusive. Required if
   * the value of optimization_objective is minimize-quantile-loss. Represents
   * the percent quantiles to use for that objective. Quantiles must be unique.
   * </pre>
   *
   * <code>repeated double quantiles = 16;</code>
   *
   * @return The count of quantiles.
   */
  int getQuantilesCount();
  /**
   *
   *
   * <pre>
   * Quantiles to use for minimize-quantile-loss `optimization_objective`. Up to
   * 5 quantiles are allowed of values between 0 and 1, exclusive. Required if
   * the value of optimization_objective is minimize-quantile-loss. Represents
   * the percent quantiles to use for that objective. Quantiles must be unique.
   * </pre>
   *
   * <code>repeated double quantiles = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The quantiles at the given index.
   */
  double getQuantiles(int index);

  /**
   *
   *
   * <pre>
   * Validation options for the data validation component. The available options
   * are:
   *
   *   * "fail-pipeline" - default, will validate against the validation and
   *      fail the pipeline if it fails.
   *
   *   * "ignore-validation" - ignore the results of the validation and continue
   * </pre>
   *
   * <code>string validation_options = 17;</code>
   *
   * @return The validationOptions.
   */
  java.lang.String getValidationOptions();
  /**
   *
   *
   * <pre>
   * Validation options for the data validation component. The available options
   * are:
   *
   *   * "fail-pipeline" - default, will validate against the validation and
   *      fail the pipeline if it fails.
   *
   *   * "ignore-validation" - ignore the results of the validation and continue
   * </pre>
   *
   * <code>string validation_options = 17;</code>
   *
   * @return The bytes for validationOptions.
   */
  com.google.protobuf.ByteString getValidationOptionsBytes();

  /**
   *
   *
   * <pre>
   * Additional experiment flags for the time series forcasting training.
   * </pre>
   *
   * <code>repeated string additional_experiments = 25;</code>
   *
   * @return A list containing the additionalExperiments.
   */
  java.util.List<java.lang.String> getAdditionalExperimentsList();
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the time series forcasting training.
   * </pre>
   *
   * <code>repeated string additional_experiments = 25;</code>
   *
   * @return The count of additionalExperiments.
   */
  int getAdditionalExperimentsCount();
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the time series forcasting training.
   * </pre>
   *
   * <code>repeated string additional_experiments = 25;</code>
   *
   * @param index The index of the element to return.
   * @return The additionalExperiments at the given index.
   */
  java.lang.String getAdditionalExperiments(int index);
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the time series forcasting training.
   * </pre>
   *
   * <code>repeated string additional_experiments = 25;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalExperiments at the given index.
   */
  com.google.protobuf.ByteString getAdditionalExperimentsBytes(int index);
}
