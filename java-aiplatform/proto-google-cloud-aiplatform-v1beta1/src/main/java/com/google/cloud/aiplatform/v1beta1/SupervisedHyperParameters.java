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
// source: google/cloud/aiplatform/v1beta1/tuning_job.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Hyperparameters for SFT.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.SupervisedHyperParameters}
 */
public final class SupervisedHyperParameters extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.SupervisedHyperParameters)
    SupervisedHyperParametersOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SupervisedHyperParameters.newBuilder() to construct.
  private SupervisedHyperParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SupervisedHyperParameters() {
    adapterSize_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SupervisedHyperParameters();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TuningJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_SupervisedHyperParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TuningJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_SupervisedHyperParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.class,
            com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Supported adapter sizes for tuning.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize}
   */
  public enum AdapterSize implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Adapter size is unspecified.
     * </pre>
     *
     * <code>ADAPTER_SIZE_UNSPECIFIED = 0;</code>
     */
    ADAPTER_SIZE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Adapter size 1.
     * </pre>
     *
     * <code>ADAPTER_SIZE_ONE = 1;</code>
     */
    ADAPTER_SIZE_ONE(1),
    /**
     *
     *
     * <pre>
     * Adapter size 4.
     * </pre>
     *
     * <code>ADAPTER_SIZE_FOUR = 2;</code>
     */
    ADAPTER_SIZE_FOUR(2),
    /**
     *
     *
     * <pre>
     * Adapter size 8.
     * </pre>
     *
     * <code>ADAPTER_SIZE_EIGHT = 3;</code>
     */
    ADAPTER_SIZE_EIGHT(3),
    /**
     *
     *
     * <pre>
     * Adapter size 16.
     * </pre>
     *
     * <code>ADAPTER_SIZE_SIXTEEN = 4;</code>
     */
    ADAPTER_SIZE_SIXTEEN(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Adapter size is unspecified.
     * </pre>
     *
     * <code>ADAPTER_SIZE_UNSPECIFIED = 0;</code>
     */
    public static final int ADAPTER_SIZE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Adapter size 1.
     * </pre>
     *
     * <code>ADAPTER_SIZE_ONE = 1;</code>
     */
    public static final int ADAPTER_SIZE_ONE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Adapter size 4.
     * </pre>
     *
     * <code>ADAPTER_SIZE_FOUR = 2;</code>
     */
    public static final int ADAPTER_SIZE_FOUR_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Adapter size 8.
     * </pre>
     *
     * <code>ADAPTER_SIZE_EIGHT = 3;</code>
     */
    public static final int ADAPTER_SIZE_EIGHT_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Adapter size 16.
     * </pre>
     *
     * <code>ADAPTER_SIZE_SIXTEEN = 4;</code>
     */
    public static final int ADAPTER_SIZE_SIXTEEN_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AdapterSize valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdapterSize forNumber(int value) {
      switch (value) {
        case 0:
          return ADAPTER_SIZE_UNSPECIFIED;
        case 1:
          return ADAPTER_SIZE_ONE;
        case 2:
          return ADAPTER_SIZE_FOUR;
        case 3:
          return ADAPTER_SIZE_EIGHT;
        case 4:
          return ADAPTER_SIZE_SIXTEEN;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdapterSize> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AdapterSize> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdapterSize>() {
          public AdapterSize findValueByNumber(int number) {
            return AdapterSize.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final AdapterSize[] VALUES = values();

    public static AdapterSize valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AdapterSize(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize)
  }

  public static final int EPOCH_COUNT_FIELD_NUMBER = 1;
  private long epochCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Optional. Number of complete passes the model makes over the entire
   * training dataset during training.
   * </pre>
   *
   * <code>int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The epochCount.
   */
  @java.lang.Override
  public long getEpochCount() {
    return epochCount_;
  }

  public static final int LEARNING_RATE_MULTIPLIER_FIELD_NUMBER = 2;
  private double learningRateMultiplier_ = 0D;
  /**
   *
   *
   * <pre>
   * Optional. Multiplier for adjusting the default learning rate.
   * </pre>
   *
   * <code>double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The learningRateMultiplier.
   */
  @java.lang.Override
  public double getLearningRateMultiplier() {
    return learningRateMultiplier_;
  }

  public static final int ADAPTER_SIZE_FIELD_NUMBER = 3;
  private int adapterSize_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Adapter size for tuning.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for adapterSize.
   */
  @java.lang.Override
  public int getAdapterSizeValue() {
    return adapterSize_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Adapter size for tuning.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The adapterSize.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize
      getAdapterSize() {
    com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize result =
        com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize.forNumber(
            adapterSize_);
    return result == null
        ? com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize.UNRECOGNIZED
        : result;
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
    if (epochCount_ != 0L) {
      output.writeInt64(1, epochCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(learningRateMultiplier_) != 0) {
      output.writeDouble(2, learningRateMultiplier_);
    }
    if (adapterSize_
        != com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize
            .ADAPTER_SIZE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, adapterSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epochCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, epochCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(learningRateMultiplier_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, learningRateMultiplier_);
    }
    if (adapterSize_
        != com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize
            .ADAPTER_SIZE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, adapterSize_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters other =
        (com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters) obj;

    if (getEpochCount() != other.getEpochCount()) return false;
    if (java.lang.Double.doubleToLongBits(getLearningRateMultiplier())
        != java.lang.Double.doubleToLongBits(other.getLearningRateMultiplier())) return false;
    if (adapterSize_ != other.adapterSize_) return false;
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
    hash = (37 * hash) + EPOCH_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getEpochCount());
    hash = (37 * hash) + LEARNING_RATE_MULTIPLIER_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getLearningRateMultiplier()));
    hash = (37 * hash) + ADAPTER_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + adapterSize_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters prototype) {
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
   * Hyperparameters for SFT.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.SupervisedHyperParameters}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.SupervisedHyperParameters)
      com.google.cloud.aiplatform.v1beta1.SupervisedHyperParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TuningJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_SupervisedHyperParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TuningJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_SupervisedHyperParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.class,
              com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      epochCount_ = 0L;
      learningRateMultiplier_ = 0D;
      adapterSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TuningJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_SupervisedHyperParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters build() {
      com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters buildPartial() {
      com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters result =
          new com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.epochCount_ = epochCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.learningRateMultiplier_ = learningRateMultiplier_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.adapterSize_ = adapterSize_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.getDefaultInstance())
        return this;
      if (other.getEpochCount() != 0L) {
        setEpochCount(other.getEpochCount());
      }
      if (other.getLearningRateMultiplier() != 0D) {
        setLearningRateMultiplier(other.getLearningRateMultiplier());
      }
      if (other.adapterSize_ != 0) {
        setAdapterSizeValue(other.getAdapterSizeValue());
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
            case 8:
              {
                epochCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 17:
              {
                learningRateMultiplier_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 24:
              {
                adapterSize_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private long epochCount_;
    /**
     *
     *
     * <pre>
     * Optional. Number of complete passes the model makes over the entire
     * training dataset during training.
     * </pre>
     *
     * <code>int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The epochCount.
     */
    @java.lang.Override
    public long getEpochCount() {
      return epochCount_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Number of complete passes the model makes over the entire
     * training dataset during training.
     * </pre>
     *
     * <code>int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The epochCount to set.
     * @return This builder for chaining.
     */
    public Builder setEpochCount(long value) {

      epochCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Number of complete passes the model makes over the entire
     * training dataset during training.
     * </pre>
     *
     * <code>int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEpochCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      epochCount_ = 0L;
      onChanged();
      return this;
    }

    private double learningRateMultiplier_;
    /**
     *
     *
     * <pre>
     * Optional. Multiplier for adjusting the default learning rate.
     * </pre>
     *
     * <code>double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The learningRateMultiplier.
     */
    @java.lang.Override
    public double getLearningRateMultiplier() {
      return learningRateMultiplier_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Multiplier for adjusting the default learning rate.
     * </pre>
     *
     * <code>double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The learningRateMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setLearningRateMultiplier(double value) {

      learningRateMultiplier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Multiplier for adjusting the default learning rate.
     * </pre>
     *
     * <code>double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLearningRateMultiplier() {
      bitField0_ = (bitField0_ & ~0x00000002);
      learningRateMultiplier_ = 0D;
      onChanged();
      return this;
    }

    private int adapterSize_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Adapter size for tuning.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for adapterSize.
     */
    @java.lang.Override
    public int getAdapterSizeValue() {
      return adapterSize_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Adapter size for tuning.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for adapterSize to set.
     * @return This builder for chaining.
     */
    public Builder setAdapterSizeValue(int value) {
      adapterSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Adapter size for tuning.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The adapterSize.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize
        getAdapterSize() {
      com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize result =
          com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize.forNumber(
              adapterSize_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Adapter size for tuning.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The adapterSize to set.
     * @return This builder for chaining.
     */
    public Builder setAdapterSize(
        com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      adapterSize_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Adapter size for tuning.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdapterSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      adapterSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.SupervisedHyperParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.SupervisedHyperParameters)
  private static final com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters();
  }

  public static com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupervisedHyperParameters> PARSER =
      new com.google.protobuf.AbstractParser<SupervisedHyperParameters>() {
        @java.lang.Override
        public SupervisedHyperParameters parsePartialFrom(
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

  public static com.google.protobuf.Parser<SupervisedHyperParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupervisedHyperParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.SupervisedHyperParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
