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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Contains cluster daemon metrics, such as HDFS and YARN stats.
 * **Beta Feature**: This report is available for testing purposes only. It may
 * be changed before final release.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ClusterMetrics}
 */
public final class ClusterMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ClusterMetrics)
    ClusterMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClusterMetrics.newBuilder() to construct.
  private ClusterMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClusterMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClusterMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ClusterMetrics_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetHdfsMetrics();
      case 2:
        return internalGetYarnMetrics();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ClusterMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ClusterMetrics.class,
            com.google.cloud.dataproc.v1.ClusterMetrics.Builder.class);
  }

  public static final int HDFS_METRICS_FIELD_NUMBER = 1;

  private static final class HdfsMetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.Long>newDefaultInstance(
            com.google.cloud.dataproc.v1.ClustersProto
                .internal_static_google_cloud_dataproc_v1_ClusterMetrics_HdfsMetricsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> hdfsMetrics_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetHdfsMetrics() {
    if (hdfsMetrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(HdfsMetricsDefaultEntryHolder.defaultEntry);
    }
    return hdfsMetrics_;
  }

  public int getHdfsMetricsCount() {
    return internalGetHdfsMetrics().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  @java.lang.Override
  public boolean containsHdfsMetrics(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetHdfsMetrics().getMap().containsKey(key);
  }
  /** Use {@link #getHdfsMetricsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getHdfsMetrics() {
    return getHdfsMetricsMap();
  }
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getHdfsMetricsMap() {
    return internalGetHdfsMetrics().getMap();
  }
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  @java.lang.Override
  public long getHdfsMetricsOrDefault(java.lang.String key, long defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetHdfsMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  @java.lang.Override
  public long getHdfsMetricsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetHdfsMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int YARN_METRICS_FIELD_NUMBER = 2;

  private static final class YarnMetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.Long>newDefaultInstance(
            com.google.cloud.dataproc.v1.ClustersProto
                .internal_static_google_cloud_dataproc_v1_ClusterMetrics_YarnMetricsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> yarnMetrics_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.Long> internalGetYarnMetrics() {
    if (yarnMetrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(YarnMetricsDefaultEntryHolder.defaultEntry);
    }
    return yarnMetrics_;
  }

  public int getYarnMetricsCount() {
    return internalGetYarnMetrics().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  @java.lang.Override
  public boolean containsYarnMetrics(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetYarnMetrics().getMap().containsKey(key);
  }
  /** Use {@link #getYarnMetricsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getYarnMetrics() {
    return getYarnMetricsMap();
  }
  /**
   *
   *
   * <pre>
   * YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getYarnMetricsMap() {
    return internalGetYarnMetrics().getMap();
  }
  /**
   *
   *
   * <pre>
   * YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  @java.lang.Override
  public long getYarnMetricsOrDefault(java.lang.String key, long defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetYarnMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  @java.lang.Override
  public long getYarnMetricsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.Long> map = internalGetYarnMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetHdfsMetrics(), HdfsMetricsDefaultEntryHolder.defaultEntry, 1);
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetYarnMetrics(), YarnMetricsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry :
        internalGetHdfsMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> hdfsMetrics__ =
          HdfsMetricsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, hdfsMetrics__);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry :
        internalGetYarnMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> yarnMetrics__ =
          YarnMetricsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, yarnMetrics__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1.ClusterMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ClusterMetrics other =
        (com.google.cloud.dataproc.v1.ClusterMetrics) obj;

    if (!internalGetHdfsMetrics().equals(other.internalGetHdfsMetrics())) return false;
    if (!internalGetYarnMetrics().equals(other.internalGetYarnMetrics())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetHdfsMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + HDFS_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHdfsMetrics().hashCode();
    }
    if (!internalGetYarnMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + YARN_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetYarnMetrics().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.dataproc.v1.ClusterMetrics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Contains cluster daemon metrics, such as HDFS and YARN stats.
   * **Beta Feature**: This report is available for testing purposes only. It may
   * be changed before final release.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ClusterMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ClusterMetrics)
      com.google.cloud.dataproc.v1.ClusterMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ClusterMetrics_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetHdfsMetrics();
        case 2:
          return internalGetYarnMetrics();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableHdfsMetrics();
        case 2:
          return internalGetMutableYarnMetrics();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ClusterMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ClusterMetrics.class,
              com.google.cloud.dataproc.v1.ClusterMetrics.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ClusterMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableHdfsMetrics().clear();
      internalGetMutableYarnMetrics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ClusterMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterMetrics getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ClusterMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterMetrics build() {
      com.google.cloud.dataproc.v1.ClusterMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterMetrics buildPartial() {
      com.google.cloud.dataproc.v1.ClusterMetrics result =
          new com.google.cloud.dataproc.v1.ClusterMetrics(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.ClusterMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hdfsMetrics_ = internalGetHdfsMetrics();
        result.hdfsMetrics_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.yarnMetrics_ = internalGetYarnMetrics();
        result.yarnMetrics_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.ClusterMetrics) {
        return mergeFrom((com.google.cloud.dataproc.v1.ClusterMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ClusterMetrics other) {
      if (other == com.google.cloud.dataproc.v1.ClusterMetrics.getDefaultInstance()) return this;
      internalGetMutableHdfsMetrics().mergeFrom(other.internalGetHdfsMetrics());
      bitField0_ |= 0x00000001;
      internalGetMutableYarnMetrics().mergeFrom(other.internalGetYarnMetrics());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> hdfsMetrics__ =
                    input.readMessage(
                        HdfsMetricsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableHdfsMetrics()
                    .getMutableMap()
                    .put(hdfsMetrics__.getKey(), hdfsMetrics__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.Long> yarnMetrics__ =
                    input.readMessage(
                        YarnMetricsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableYarnMetrics()
                    .getMutableMap()
                    .put(yarnMetrics__.getKey(), yarnMetrics__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> hdfsMetrics_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetHdfsMetrics() {
      if (hdfsMetrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HdfsMetricsDefaultEntryHolder.defaultEntry);
      }
      return hdfsMetrics_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableHdfsMetrics() {
      if (hdfsMetrics_ == null) {
        hdfsMetrics_ =
            com.google.protobuf.MapField.newMapField(HdfsMetricsDefaultEntryHolder.defaultEntry);
      }
      if (!hdfsMetrics_.isMutable()) {
        hdfsMetrics_ = hdfsMetrics_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return hdfsMetrics_;
    }

    public int getHdfsMetricsCount() {
      return internalGetHdfsMetrics().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    @java.lang.Override
    public boolean containsHdfsMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetHdfsMetrics().getMap().containsKey(key);
    }
    /** Use {@link #getHdfsMetricsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getHdfsMetrics() {
      return getHdfsMetricsMap();
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getHdfsMetricsMap() {
      return internalGetHdfsMetrics().getMap();
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    @java.lang.Override
    public long getHdfsMetricsOrDefault(java.lang.String key, long defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetHdfsMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    @java.lang.Override
    public long getHdfsMetricsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetHdfsMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearHdfsMetrics() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableHdfsMetrics().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    public Builder removeHdfsMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableHdfsMetrics().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMutableHdfsMetrics() {
      bitField0_ |= 0x00000001;
      return internalGetMutableHdfsMetrics().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    public Builder putHdfsMetrics(java.lang.String key, long value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }

      internalGetMutableHdfsMetrics().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The HDFS metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
     */
    public Builder putAllHdfsMetrics(java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableHdfsMetrics().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long> yarnMetrics_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetYarnMetrics() {
      if (yarnMetrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            YarnMetricsDefaultEntryHolder.defaultEntry);
      }
      return yarnMetrics_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableYarnMetrics() {
      if (yarnMetrics_ == null) {
        yarnMetrics_ =
            com.google.protobuf.MapField.newMapField(YarnMetricsDefaultEntryHolder.defaultEntry);
      }
      if (!yarnMetrics_.isMutable()) {
        yarnMetrics_ = yarnMetrics_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return yarnMetrics_;
    }

    public int getYarnMetricsCount() {
      return internalGetYarnMetrics().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    @java.lang.Override
    public boolean containsYarnMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetYarnMetrics().getMap().containsKey(key);
    }
    /** Use {@link #getYarnMetricsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getYarnMetrics() {
      return getYarnMetricsMap();
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getYarnMetricsMap() {
      return internalGetYarnMetrics().getMap();
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    @java.lang.Override
    public long getYarnMetricsOrDefault(java.lang.String key, long defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetYarnMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    @java.lang.Override
    public long getYarnMetricsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.Long> map = internalGetYarnMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearYarnMetrics() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableYarnMetrics().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    public Builder removeYarnMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableYarnMetrics().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getMutableYarnMetrics() {
      bitField0_ |= 0x00000002;
      return internalGetMutableYarnMetrics().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    public Builder putYarnMetrics(java.lang.String key, long value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }

      internalGetMutableYarnMetrics().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * YARN metrics.
     * </pre>
     *
     * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
     */
    public Builder putAllYarnMetrics(java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableYarnMetrics().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ClusterMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ClusterMetrics)
  private static final com.google.cloud.dataproc.v1.ClusterMetrics DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ClusterMetrics();
  }

  public static com.google.cloud.dataproc.v1.ClusterMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterMetrics> PARSER =
      new com.google.protobuf.AbstractParser<ClusterMetrics>() {
        @java.lang.Override
        public ClusterMetrics parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ClusterMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ClusterMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
