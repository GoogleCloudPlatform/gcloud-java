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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Spec for MetricX instance - The fields used for evaluation are dependent on
 * the MetricX version.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.MetricxInstance}
 */
public final class MetricxInstance extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.MetricxInstance)
    MetricxInstanceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetricxInstance.newBuilder() to construct.
  private MetricxInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetricxInstance() {
    prediction_ = "";
    reference_ = "";
    source_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetricxInstance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_MetricxInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1_MetricxInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.MetricxInstance.class,
            com.google.cloud.aiplatform.v1.MetricxInstance.Builder.class);
  }

  private int bitField0_;
  public static final int PREDICTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object prediction_ = "";
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the prediction field is set.
   */
  @java.lang.Override
  public boolean hasPrediction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The prediction.
   */
  @java.lang.Override
  public java.lang.String getPrediction() {
    java.lang.Object ref = prediction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prediction_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for prediction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPredictionBytes() {
    java.lang.Object ref = prediction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      prediction_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object reference_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reference.
   */
  @java.lang.Override
  public java.lang.String getReference() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reference_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReferenceBytes() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object source_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Source text in original language.
   * </pre>
   *
   * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Source text in original language.
   * </pre>
   *
   * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Source text in original language.
   * </pre>
   *
   * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, prediction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reference_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, prediction_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reference_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, source_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.MetricxInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.MetricxInstance other =
        (com.google.cloud.aiplatform.v1.MetricxInstance) obj;

    if (hasPrediction() != other.hasPrediction()) return false;
    if (hasPrediction()) {
      if (!getPrediction().equals(other.getPrediction())) return false;
    }
    if (hasReference() != other.hasReference()) return false;
    if (hasReference()) {
      if (!getReference().equals(other.getReference())) return false;
    }
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
    }
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
    if (hasPrediction()) {
      hash = (37 * hash) + PREDICTION_FIELD_NUMBER;
      hash = (53 * hash) + getPrediction().hashCode();
    }
    if (hasReference()) {
      hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getReference().hashCode();
    }
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.MetricxInstance prototype) {
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
   * Spec for MetricX instance - The fields used for evaluation are dependent on
   * the MetricX version.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.MetricxInstance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.MetricxInstance)
      com.google.cloud.aiplatform.v1.MetricxInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_MetricxInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_MetricxInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.MetricxInstance.class,
              com.google.cloud.aiplatform.v1.MetricxInstance.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.MetricxInstance.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      prediction_ = "";
      reference_ = "";
      source_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1_MetricxInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MetricxInstance getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.MetricxInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MetricxInstance build() {
      com.google.cloud.aiplatform.v1.MetricxInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MetricxInstance buildPartial() {
      com.google.cloud.aiplatform.v1.MetricxInstance result =
          new com.google.cloud.aiplatform.v1.MetricxInstance(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.MetricxInstance result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.prediction_ = prediction_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reference_ = reference_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.source_ = source_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.MetricxInstance) {
        return mergeFrom((com.google.cloud.aiplatform.v1.MetricxInstance) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.MetricxInstance other) {
      if (other == com.google.cloud.aiplatform.v1.MetricxInstance.getDefaultInstance()) return this;
      if (other.hasPrediction()) {
        prediction_ = other.prediction_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReference()) {
        reference_ = other.reference_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSource()) {
        source_ = other.source_;
        bitField0_ |= 0x00000004;
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
                prediction_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                reference_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                source_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object prediction_ = "";
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the prediction field is set.
     */
    public boolean hasPrediction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The prediction.
     */
    public java.lang.String getPrediction() {
      java.lang.Object ref = prediction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prediction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for prediction.
     */
    public com.google.protobuf.ByteString getPredictionBytes() {
      java.lang.Object ref = prediction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        prediction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The prediction to set.
     * @return This builder for chaining.
     */
    public Builder setPrediction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      prediction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrediction() {
      prediction_ = getDefaultInstance().getPrediction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Output of the evaluated model.
     * </pre>
     *
     * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for prediction to set.
     * @return This builder for chaining.
     */
    public Builder setPredictionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      prediction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object reference_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the reference field is set.
     */
    public boolean hasReference() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The reference.
     */
    public java.lang.String getReference() {
      java.lang.Object ref = reference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for reference.
     */
    public com.google.protobuf.ByteString getReferenceBytes() {
      java.lang.Object ref = reference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The reference to set.
     * @return This builder for chaining.
     */
    public Builder setReference(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      reference_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReference() {
      reference_ = getDefaultInstance().getReference();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Ground truth used to compare against the prediction.
     * </pre>
     *
     * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for reference to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      reference_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      source_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      source_ = getDefaultInstance().getSource();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Source text in original language.
     * </pre>
     *
     * <code>optional string source = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      source_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.MetricxInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.MetricxInstance)
  private static final com.google.cloud.aiplatform.v1.MetricxInstance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.MetricxInstance();
  }

  public static com.google.cloud.aiplatform.v1.MetricxInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricxInstance> PARSER =
      new com.google.protobuf.AbstractParser<MetricxInstance>() {
        @java.lang.Override
        public MetricxInstance parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricxInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricxInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MetricxInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
