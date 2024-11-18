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
// source: google/cloud/aiplatform/v1beta1/feature_view.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface FeatureViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.FeatureView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bigQuerySource.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.BigQuerySource getBigQuerySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures how data is supposed to be extracted from a BigQuery
   * source to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.BigQuerySource big_query_source = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.BigQuerySourceOrBuilder
      getBigQuerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the featureRegistrySource field is set.
   */
  boolean hasFeatureRegistrySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The featureRegistrySource.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.FeatureRegistrySource getFeatureRegistrySource();
  /**
   *
   *
   * <pre>
   * Optional. Configures the features from a Feature Registry source that
   * need to be loaded onto the FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.FeatureRegistrySource feature_registry_source = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.FeatureRegistrySourceOrBuilder
      getFeatureRegistrySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Vertex RAG Source that the FeatureView is linked to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VertexRagSource vertex_rag_source = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the vertexRagSource field is set.
   */
  boolean hasVertexRagSource();
  /**
   *
   *
   * <pre>
   * Optional. The Vertex RAG Source that the FeatureView is linked to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VertexRagSource vertex_rag_source = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The vertexRagSource.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.VertexRagSource getVertexRagSource();
  /**
   *
   *
   * <pre>
   * Optional. The Vertex RAG Source that the FeatureView is linked to.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VertexRagSource vertex_rag_source = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.VertexRagSourceOrBuilder
      getVertexRagSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureView. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of the FeatureView. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{feature_online_store}/featureViews/{feature_view}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this FeatureView was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureViews.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one
   * FeatureOnlineStore(System labels are excluded)." System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureView.SyncConfig sync_config = 7;</code>
   *
   * @return Whether the syncConfig field is set.
   */
  boolean hasSyncConfig();
  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureView.SyncConfig sync_config = 7;</code>
   *
   * @return The syncConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.SyncConfig getSyncConfig();
  /**
   *
   *
   * <pre>
   * Configures when data is to be synced/updated for this FeatureView. At the
   * end of the sync the latest featureValues for each entityId of this
   * FeatureView are made ready for online serving.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureView.SyncConfig sync_config = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.SyncConfigOrBuilder getSyncConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated: please use
   * [FeatureView.index_config][google.cloud.aiplatform.v1beta1.FeatureView.index_config]
   * instead.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VectorSearchConfig vector_search_config = 8 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.FeatureView.vector_search_config is deprecated. See
   *     google/cloud/aiplatform/v1beta1/feature_view.proto;l=339
   * @return Whether the vectorSearchConfig field is set.
   */
  @java.lang.Deprecated
  boolean hasVectorSearchConfig();
  /**
   *
   *
   * <pre>
   * Optional. Deprecated: please use
   * [FeatureView.index_config][google.cloud.aiplatform.v1beta1.FeatureView.index_config]
   * instead.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VectorSearchConfig vector_search_config = 8 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.FeatureView.vector_search_config is deprecated. See
   *     google/cloud/aiplatform/v1beta1/feature_view.proto;l=339
   * @return The vectorSearchConfig.
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.FeatureView.VectorSearchConfig getVectorSearchConfig();
  /**
   *
   *
   * <pre>
   * Optional. Deprecated: please use
   * [FeatureView.index_config][google.cloud.aiplatform.v1beta1.FeatureView.index_config]
   * instead.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.VectorSearchConfig vector_search_config = 8 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.FeatureView.VectorSearchConfigOrBuilder
      getVectorSearchConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for index preparation for vector search. It
   * contains the required configurations to create an index from source data,
   * so that approximate nearest neighbor (a.k.a ANN) algorithms search can be
   * performed during online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.IndexConfig index_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the indexConfig field is set.
   */
  boolean hasIndexConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for index preparation for vector search. It
   * contains the required configurations to create an index from source data,
   * so that approximate nearest neighbor (a.k.a ANN) algorithms search can be
   * performed during online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.IndexConfig index_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The indexConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.IndexConfig getIndexConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for index preparation for vector search. It
   * contains the required configurations to create an index from source data,
   * so that approximate nearest neighbor (a.k.a ANN) algorithms search can be
   * performed during online serving.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.IndexConfig index_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.IndexConfigOrBuilder getIndexConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for FeatureView created under Optimized
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.OptimizedConfig optimized_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the optimizedConfig field is set.
   */
  boolean hasOptimizedConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for FeatureView created under Optimized
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.OptimizedConfig optimized_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The optimizedConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.OptimizedConfig getOptimizedConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for FeatureView created under Optimized
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.OptimizedConfig optimized_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.OptimizedConfigOrBuilder
      getOptimizedConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Service agent type used during data sync. By default, the Vertex
   * AI Service Agent is used. When using an IAM Policy to isolate this
   * FeatureView within a project, a separate service account should be
   * provisioned by setting this field to `SERVICE_AGENT_TYPE_FEATURE_VIEW`.
   * This will generate a separate service account to access the BigQuery source
   * table.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.ServiceAgentType service_agent_type = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for serviceAgentType.
   */
  int getServiceAgentTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Service agent type used during data sync. By default, the Vertex
   * AI Service Agent is used. When using an IAM Policy to isolate this
   * FeatureView within a project, a separate service account should be
   * provisioned by setting this field to `SERVICE_AGENT_TYPE_FEATURE_VIEW`.
   * This will generate a separate service account to access the BigQuery source
   * table.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureView.ServiceAgentType service_agent_type = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceAgentType.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureView.ServiceAgentType getServiceAgentType();

  /**
   *
   *
   * <pre>
   * Output only. A Service Account unique to this FeatureView. The role
   * bigquery.dataViewer should be granted to this service account to allow
   * Vertex AI Feature Store to sync data to the online store.
   * </pre>
   *
   * <code>string service_account_email = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * Output only. A Service Account unique to this FeatureView. The role
   * bigquery.dataViewer should be granted to this service account to allow
   * Vertex AI Feature Store to sync data to the online store.
   * </pre>
   *
   * <code>string service_account_email = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzi = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();

  com.google.cloud.aiplatform.v1beta1.FeatureView.SourceCase getSourceCase();
}
