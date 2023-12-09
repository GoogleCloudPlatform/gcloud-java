// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/feature_online_store.proto

package com.google.cloud.aiplatform.v1;

public interface FeatureOnlineStoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FeatureOnlineStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   * @return Whether the bigtable field is set.
   */
  boolean hasBigtable();
  /**
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   * @return The bigtable.
   */
  com.google.cloud.aiplatform.v1.FeatureOnlineStore.Bigtable getBigtable();
  /**
   * <pre>
   * Contains settings for the Cloud Bigtable instance that will be created
   * to serve featureValues for all FeatureViews under this
   * FeatureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureOnlineStore.Bigtable bigtable = 8;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureOnlineStore.BigtableOrBuilder getBigtableOrBuilder();

  /**
   * <pre>
   * Identifier. Name of the FeatureOnlineStore. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Identifier. Name of the FeatureOnlineStore. Format:
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this FeatureOnlineStore was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set,
   * a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
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
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
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
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
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
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
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
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * FeatureOnlineStore.
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
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. State of the featureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureOnlineStore.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the featureOnlineStore.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureOnlineStore.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.FeatureOnlineStore.State getState();

  com.google.cloud.aiplatform.v1.FeatureOnlineStore.StorageTypeCase getStorageTypeCase();
}
