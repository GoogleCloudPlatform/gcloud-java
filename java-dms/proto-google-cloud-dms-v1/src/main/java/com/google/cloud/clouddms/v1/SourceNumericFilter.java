/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Filter for fixed point number data types such as NUMERIC/NUMBER
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SourceNumericFilter}
 */
public final class SourceNumericFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SourceNumericFilter)
    SourceNumericFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceNumericFilter.newBuilder() to construct.
  private SourceNumericFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceNumericFilter() {
    numericFilterOption_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceNumericFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SourceNumericFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SourceNumericFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SourceNumericFilter.class,
            com.google.cloud.clouddms.v1.SourceNumericFilter.Builder.class);
  }

  public static final int SOURCE_MIN_SCALE_FILTER_FIELD_NUMBER = 1;
  private int sourceMinScaleFilter_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with scale greater than or equal to
   * this number.
   * </pre>
   *
   * <code>int32 source_min_scale_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMinScaleFilter.
   */
  @java.lang.Override
  public int getSourceMinScaleFilter() {
    return sourceMinScaleFilter_;
  }

  public static final int SOURCE_MAX_SCALE_FILTER_FIELD_NUMBER = 2;
  private int sourceMaxScaleFilter_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with scale smaller than or equal to
   * this number.
   * </pre>
   *
   * <code>int32 source_max_scale_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMaxScaleFilter.
   */
  @java.lang.Override
  public int getSourceMaxScaleFilter() {
    return sourceMaxScaleFilter_;
  }

  public static final int SOURCE_MIN_PRECISION_FILTER_FIELD_NUMBER = 3;
  private int sourceMinPrecisionFilter_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with precision greater than or
   * equal to this number.
   * </pre>
   *
   * <code>int32 source_min_precision_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMinPrecisionFilter.
   */
  @java.lang.Override
  public int getSourceMinPrecisionFilter() {
    return sourceMinPrecisionFilter_;
  }

  public static final int SOURCE_MAX_PRECISION_FILTER_FIELD_NUMBER = 4;
  private int sourceMaxPrecisionFilter_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with precision smaller than or
   * equal to this number.
   * </pre>
   *
   * <code>int32 source_max_precision_filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMaxPrecisionFilter.
   */
  @java.lang.Override
  public int getSourceMaxPrecisionFilter() {
    return sourceMaxPrecisionFilter_;
  }

  public static final int NUMERIC_FILTER_OPTION_FIELD_NUMBER = 5;
  private int numericFilterOption_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Enum to set the option defining the datatypes numeric filter has
   * to be applied to
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for numericFilterOption.
   */
  @java.lang.Override
  public int getNumericFilterOptionValue() {
    return numericFilterOption_;
  }
  /**
   *
   *
   * <pre>
   * Required. Enum to set the option defining the datatypes numeric filter has
   * to be applied to
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The numericFilterOption.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.NumericFilterOption getNumericFilterOption() {
    com.google.cloud.clouddms.v1.NumericFilterOption result =
        com.google.cloud.clouddms.v1.NumericFilterOption.forNumber(numericFilterOption_);
    return result == null ? com.google.cloud.clouddms.v1.NumericFilterOption.UNRECOGNIZED : result;
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
    if (sourceMinScaleFilter_ != 0) {
      output.writeInt32(1, sourceMinScaleFilter_);
    }
    if (sourceMaxScaleFilter_ != 0) {
      output.writeInt32(2, sourceMaxScaleFilter_);
    }
    if (sourceMinPrecisionFilter_ != 0) {
      output.writeInt32(3, sourceMinPrecisionFilter_);
    }
    if (sourceMaxPrecisionFilter_ != 0) {
      output.writeInt32(4, sourceMaxPrecisionFilter_);
    }
    if (numericFilterOption_
        != com.google.cloud.clouddms.v1.NumericFilterOption.NUMERIC_FILTER_OPTION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(5, numericFilterOption_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceMinScaleFilter_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, sourceMinScaleFilter_);
    }
    if (sourceMaxScaleFilter_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, sourceMaxScaleFilter_);
    }
    if (sourceMinPrecisionFilter_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, sourceMinPrecisionFilter_);
    }
    if (sourceMaxPrecisionFilter_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, sourceMaxPrecisionFilter_);
    }
    if (numericFilterOption_
        != com.google.cloud.clouddms.v1.NumericFilterOption.NUMERIC_FILTER_OPTION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, numericFilterOption_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SourceNumericFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SourceNumericFilter other =
        (com.google.cloud.clouddms.v1.SourceNumericFilter) obj;

    if (getSourceMinScaleFilter() != other.getSourceMinScaleFilter()) return false;
    if (getSourceMaxScaleFilter() != other.getSourceMaxScaleFilter()) return false;
    if (getSourceMinPrecisionFilter() != other.getSourceMinPrecisionFilter()) return false;
    if (getSourceMaxPrecisionFilter() != other.getSourceMaxPrecisionFilter()) return false;
    if (numericFilterOption_ != other.numericFilterOption_) return false;
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
    hash = (37 * hash) + SOURCE_MIN_SCALE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getSourceMinScaleFilter();
    hash = (37 * hash) + SOURCE_MAX_SCALE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getSourceMaxScaleFilter();
    hash = (37 * hash) + SOURCE_MIN_PRECISION_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getSourceMinPrecisionFilter();
    hash = (37 * hash) + SOURCE_MAX_PRECISION_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getSourceMaxPrecisionFilter();
    hash = (37 * hash) + NUMERIC_FILTER_OPTION_FIELD_NUMBER;
    hash = (53 * hash) + numericFilterOption_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.SourceNumericFilter prototype) {
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
   * Filter for fixed point number data types such as NUMERIC/NUMBER
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SourceNumericFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SourceNumericFilter)
      com.google.cloud.clouddms.v1.SourceNumericFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceNumericFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceNumericFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SourceNumericFilter.class,
              com.google.cloud.clouddms.v1.SourceNumericFilter.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SourceNumericFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceMinScaleFilter_ = 0;
      sourceMaxScaleFilter_ = 0;
      sourceMinPrecisionFilter_ = 0;
      sourceMaxPrecisionFilter_ = 0;
      numericFilterOption_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceNumericFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceNumericFilter getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SourceNumericFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceNumericFilter build() {
      com.google.cloud.clouddms.v1.SourceNumericFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceNumericFilter buildPartial() {
      com.google.cloud.clouddms.v1.SourceNumericFilter result =
          new com.google.cloud.clouddms.v1.SourceNumericFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.SourceNumericFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceMinScaleFilter_ = sourceMinScaleFilter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceMaxScaleFilter_ = sourceMaxScaleFilter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sourceMinPrecisionFilter_ = sourceMinPrecisionFilter_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sourceMaxPrecisionFilter_ = sourceMaxPrecisionFilter_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.numericFilterOption_ = numericFilterOption_;
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
      if (other instanceof com.google.cloud.clouddms.v1.SourceNumericFilter) {
        return mergeFrom((com.google.cloud.clouddms.v1.SourceNumericFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SourceNumericFilter other) {
      if (other == com.google.cloud.clouddms.v1.SourceNumericFilter.getDefaultInstance())
        return this;
      if (other.getSourceMinScaleFilter() != 0) {
        setSourceMinScaleFilter(other.getSourceMinScaleFilter());
      }
      if (other.getSourceMaxScaleFilter() != 0) {
        setSourceMaxScaleFilter(other.getSourceMaxScaleFilter());
      }
      if (other.getSourceMinPrecisionFilter() != 0) {
        setSourceMinPrecisionFilter(other.getSourceMinPrecisionFilter());
      }
      if (other.getSourceMaxPrecisionFilter() != 0) {
        setSourceMaxPrecisionFilter(other.getSourceMaxPrecisionFilter());
      }
      if (other.numericFilterOption_ != 0) {
        setNumericFilterOptionValue(other.getNumericFilterOptionValue());
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
                sourceMinScaleFilter_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                sourceMaxScaleFilter_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                sourceMinPrecisionFilter_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                sourceMaxPrecisionFilter_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 40:
              {
                numericFilterOption_ = input.readEnum();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
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

    private int sourceMinScaleFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale greater than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_min_scale_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMinScaleFilter.
     */
    @java.lang.Override
    public int getSourceMinScaleFilter() {
      return sourceMinScaleFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale greater than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_min_scale_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMinScaleFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMinScaleFilter(int value) {

      sourceMinScaleFilter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale greater than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_min_scale_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMinScaleFilter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceMinScaleFilter_ = 0;
      onChanged();
      return this;
    }

    private int sourceMaxScaleFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale smaller than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_max_scale_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMaxScaleFilter.
     */
    @java.lang.Override
    public int getSourceMaxScaleFilter() {
      return sourceMaxScaleFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale smaller than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_max_scale_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMaxScaleFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMaxScaleFilter(int value) {

      sourceMaxScaleFilter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with scale smaller than or equal to
     * this number.
     * </pre>
     *
     * <code>int32 source_max_scale_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMaxScaleFilter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sourceMaxScaleFilter_ = 0;
      onChanged();
      return this;
    }

    private int sourceMinPrecisionFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision greater than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_min_precision_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMinPrecisionFilter.
     */
    @java.lang.Override
    public int getSourceMinPrecisionFilter() {
      return sourceMinPrecisionFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision greater than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_min_precision_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMinPrecisionFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMinPrecisionFilter(int value) {

      sourceMinPrecisionFilter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision greater than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_min_precision_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMinPrecisionFilter() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sourceMinPrecisionFilter_ = 0;
      onChanged();
      return this;
    }

    private int sourceMaxPrecisionFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision smaller than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_max_precision_filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMaxPrecisionFilter.
     */
    @java.lang.Override
    public int getSourceMaxPrecisionFilter() {
      return sourceMaxPrecisionFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision smaller than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_max_precision_filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMaxPrecisionFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMaxPrecisionFilter(int value) {

      sourceMaxPrecisionFilter_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with precision smaller than or
     * equal to this number.
     * </pre>
     *
     * <code>int32 source_max_precision_filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMaxPrecisionFilter() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sourceMaxPrecisionFilter_ = 0;
      onChanged();
      return this;
    }

    private int numericFilterOption_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Enum to set the option defining the datatypes numeric filter has
     * to be applied to
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for numericFilterOption.
     */
    @java.lang.Override
    public int getNumericFilterOptionValue() {
      return numericFilterOption_;
    }
    /**
     *
     *
     * <pre>
     * Required. Enum to set the option defining the datatypes numeric filter has
     * to be applied to
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for numericFilterOption to set.
     * @return This builder for chaining.
     */
    public Builder setNumericFilterOptionValue(int value) {
      numericFilterOption_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Enum to set the option defining the datatypes numeric filter has
     * to be applied to
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The numericFilterOption.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.v1.NumericFilterOption getNumericFilterOption() {
      com.google.cloud.clouddms.v1.NumericFilterOption result =
          com.google.cloud.clouddms.v1.NumericFilterOption.forNumber(numericFilterOption_);
      return result == null
          ? com.google.cloud.clouddms.v1.NumericFilterOption.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Enum to set the option defining the datatypes numeric filter has
     * to be applied to
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The numericFilterOption to set.
     * @return This builder for chaining.
     */
    public Builder setNumericFilterOption(com.google.cloud.clouddms.v1.NumericFilterOption value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      numericFilterOption_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Enum to set the option defining the datatypes numeric filter has
     * to be applied to
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.NumericFilterOption numeric_filter_option = 5 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumericFilterOption() {
      bitField0_ = (bitField0_ & ~0x00000010);
      numericFilterOption_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SourceNumericFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SourceNumericFilter)
  private static final com.google.cloud.clouddms.v1.SourceNumericFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SourceNumericFilter();
  }

  public static com.google.cloud.clouddms.v1.SourceNumericFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceNumericFilter> PARSER =
      new com.google.protobuf.AbstractParser<SourceNumericFilter>() {
        @java.lang.Override
        public SourceNumericFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceNumericFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceNumericFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SourceNumericFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
