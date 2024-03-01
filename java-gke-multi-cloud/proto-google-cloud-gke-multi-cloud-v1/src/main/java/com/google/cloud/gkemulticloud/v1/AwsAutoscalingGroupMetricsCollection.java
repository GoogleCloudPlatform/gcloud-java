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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Configuration related to CloudWatch metrics collection in an AWS
 * Auto Scaling group.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection}
 */
public final class AwsAutoscalingGroupMetricsCollection
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection)
    AwsAutoscalingGroupMetricsCollectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AwsAutoscalingGroupMetricsCollection.newBuilder() to construct.
  private AwsAutoscalingGroupMetricsCollection(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AwsAutoscalingGroupMetricsCollection() {
    granularity_ = "";
    metrics_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AwsAutoscalingGroupMetricsCollection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsAutoscalingGroupMetricsCollection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsAutoscalingGroupMetricsCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection.class,
            com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection.Builder.class);
  }

  public static final int GRANULARITY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object granularity_ = "";
  /**
   *
   *
   * <pre>
   * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
   * AWS CloudWatch. The only valid value is "1Minute".
   * </pre>
   *
   * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The granularity.
   */
  @java.lang.Override
  public java.lang.String getGranularity() {
    java.lang.Object ref = granularity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      granularity_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
   * AWS CloudWatch. The only valid value is "1Minute".
   * </pre>
   *
   * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for granularity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGranularityBytes() {
    java.lang.Object ref = granularity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      granularity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRICS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList metrics_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. The metrics to enable. For a list of valid metrics, see
   * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
   * If you specify Granularity and don't specify any metrics, all metrics are
   * enabled.
   * </pre>
   *
   * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the metrics.
   */
  public com.google.protobuf.ProtocolStringList getMetricsList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The metrics to enable. For a list of valid metrics, see
   * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
   * If you specify Granularity and don't specify any metrics, all metrics are
   * enabled.
   * </pre>
   *
   * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of metrics.
   */
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. The metrics to enable. For a list of valid metrics, see
   * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
   * If you specify Granularity and don't specify any metrics, all metrics are
   * enabled.
   * </pre>
   *
   * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The metrics at the given index.
   */
  public java.lang.String getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. The metrics to enable. For a list of valid metrics, see
   * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
   * If you specify Granularity and don't specify any metrics, all metrics are
   * enabled.
   * </pre>
   *
   * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the metrics at the given index.
   */
  public com.google.protobuf.ByteString getMetricsBytes(int index) {
    return metrics_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granularity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, granularity_);
    }
    for (int i = 0; i < metrics_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, metrics_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granularity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, granularity_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < metrics_.size(); i++) {
        dataSize += computeStringSizeNoTag(metrics_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMetricsList().size();
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection other =
        (com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection) obj;

    if (!getGranularity().equals(other.getGranularity())) return false;
    if (!getMetricsList().equals(other.getMetricsList())) return false;
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
    hash = (37 * hash) + GRANULARITY_FIELD_NUMBER;
    hash = (53 * hash) + getGranularity().hashCode();
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection prototype) {
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
   * Configuration related to CloudWatch metrics collection in an AWS
   * Auto Scaling group.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection)
      com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsAutoscalingGroupMetricsCollection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsAutoscalingGroupMetricsCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection.class,
              com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection.Builder.class);
    }

    // Construct using
    // com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      granularity_ = "";
      metrics_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsAutoscalingGroupMetricsCollection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
        getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection build() {
      com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection buildPartial() {
      com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection result =
          new com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granularity_ = granularity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        metrics_.makeImmutable();
        result.metrics_ = metrics_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection) {
        return mergeFrom(
            (com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection other) {
      if (other
          == com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
              .getDefaultInstance()) return this;
      if (!other.getGranularity().isEmpty()) {
        granularity_ = other.granularity_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.metrics_.isEmpty()) {
        if (metrics_.isEmpty()) {
          metrics_ = other.metrics_;
          bitField0_ |= 0x00000002;
        } else {
          ensureMetricsIsMutable();
          metrics_.addAll(other.metrics_);
        }
        onChanged();
      }
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
                granularity_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureMetricsIsMutable();
                metrics_.add(s);
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

    private java.lang.Object granularity_ = "";
    /**
     *
     *
     * <pre>
     * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
     * AWS CloudWatch. The only valid value is "1Minute".
     * </pre>
     *
     * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The granularity.
     */
    public java.lang.String getGranularity() {
      java.lang.Object ref = granularity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        granularity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
     * AWS CloudWatch. The only valid value is "1Minute".
     * </pre>
     *
     * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for granularity.
     */
    public com.google.protobuf.ByteString getGranularityBytes() {
      java.lang.Object ref = granularity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        granularity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
     * AWS CloudWatch. The only valid value is "1Minute".
     * </pre>
     *
     * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The granularity to set.
     * @return This builder for chaining.
     */
    public Builder setGranularity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      granularity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
     * AWS CloudWatch. The only valid value is "1Minute".
     * </pre>
     *
     * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGranularity() {
      granularity_ = getDefaultInstance().getGranularity();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The frequency at which EC2 Auto Scaling sends aggregated data to
     * AWS CloudWatch. The only valid value is "1Minute".
     * </pre>
     *
     * <code>string granularity = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for granularity to set.
     * @return This builder for chaining.
     */
    public Builder setGranularityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      granularity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList metrics_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureMetricsIsMutable() {
      if (!metrics_.isModifiable()) {
        metrics_ = new com.google.protobuf.LazyStringArrayList(metrics_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the metrics.
     */
    public com.google.protobuf.ProtocolStringList getMetricsList() {
      metrics_.makeImmutable();
      return metrics_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of metrics.
     */
    public int getMetricsCount() {
      return metrics_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The metrics at the given index.
     */
    public java.lang.String getMetrics(int index) {
      return metrics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the metrics at the given index.
     */
    public com.google.protobuf.ByteString getMetricsBytes(int index) {
      return metrics_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The metrics to set.
     * @return This builder for chaining.
     */
    public Builder setMetrics(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMetricsIsMutable();
      metrics_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The metrics to add.
     * @return This builder for chaining.
     */
    public Builder addMetrics(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMetricsIsMutable();
      metrics_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The metrics to add.
     * @return This builder for chaining.
     */
    public Builder addAllMetrics(java.lang.Iterable<java.lang.String> values) {
      ensureMetricsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetrics() {
      metrics_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The metrics to enable. For a list of valid metrics, see
     * https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html.
     * If you specify Granularity and don't specify any metrics, all metrics are
     * enabled.
     * </pre>
     *
     * <code>repeated string metrics = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the metrics to add.
     * @return This builder for chaining.
     */
    public Builder addMetricsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMetricsIsMutable();
      metrics_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection)
  private static final com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection();
  }

  public static com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsAutoscalingGroupMetricsCollection> PARSER =
      new com.google.protobuf.AbstractParser<AwsAutoscalingGroupMetricsCollection>() {
        @java.lang.Override
        public AwsAutoscalingGroupMetricsCollection parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsAutoscalingGroupMetricsCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsAutoscalingGroupMetricsCollection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsAutoscalingGroupMetricsCollection
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
