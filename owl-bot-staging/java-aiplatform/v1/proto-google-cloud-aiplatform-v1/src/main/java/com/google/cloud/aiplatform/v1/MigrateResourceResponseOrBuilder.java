// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

public interface MigrateResourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MigrateResourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString
      getDatasetBytes();

  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   * @return Whether the migratableResource field is set.
   */
  boolean hasMigratableResource();
  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   * @return The migratableResource.
   */
  com.google.cloud.aiplatform.v1.MigratableResource getMigratableResource();
  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   */
  com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder getMigratableResourceOrBuilder();

  public com.google.cloud.aiplatform.v1.MigrateResourceResponse.MigratedResourceCase getMigratedResourceCase();
}
