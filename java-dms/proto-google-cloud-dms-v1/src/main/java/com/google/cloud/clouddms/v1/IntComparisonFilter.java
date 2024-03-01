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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Filter based on relation between source value and compare value of type
 * integer in ConditionalColumnSetValue
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.IntComparisonFilter}
 */
public final class IntComparisonFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.IntComparisonFilter)
    IntComparisonFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IntComparisonFilter.newBuilder() to construct.
  private IntComparisonFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IntComparisonFilter() {
    valueComparison_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IntComparisonFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_IntComparisonFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_IntComparisonFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.IntComparisonFilter.class,
            com.google.cloud.clouddms.v1.IntComparisonFilter.Builder.class);
  }

  public static final int VALUE_COMPARISON_FIELD_NUMBER = 1;
  private int valueComparison_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Relation between source value and compare value
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for valueComparison.
   */
  @java.lang.Override
  public int getValueComparisonValue() {
    return valueComparison_;
  }
  /**
   *
   *
   * <pre>
   * Required. Relation between source value and compare value
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The valueComparison.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.ValueComparison getValueComparison() {
    com.google.cloud.clouddms.v1.ValueComparison result =
        com.google.cloud.clouddms.v1.ValueComparison.forNumber(valueComparison_);
    return result == null ? com.google.cloud.clouddms.v1.ValueComparison.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private long value_ = 0L;
  /**
   *
   *
   * <pre>
   * Required. Integer compare value to be used
   * </pre>
   *
   * <code>int64 value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
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
    if (valueComparison_
        != com.google.cloud.clouddms.v1.ValueComparison.VALUE_COMPARISON_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, valueComparison_);
    }
    if (value_ != 0L) {
      output.writeInt64(2, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueComparison_
        != com.google.cloud.clouddms.v1.ValueComparison.VALUE_COMPARISON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, valueComparison_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, value_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.IntComparisonFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.IntComparisonFilter other =
        (com.google.cloud.clouddms.v1.IntComparisonFilter) obj;

    if (valueComparison_ != other.valueComparison_) return false;
    if (getValue() != other.getValue()) return false;
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
    hash = (37 * hash) + VALUE_COMPARISON_FIELD_NUMBER;
    hash = (53 * hash) + valueComparison_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getValue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.IntComparisonFilter prototype) {
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
   * Filter based on relation between source value and compare value of type
   * integer in ConditionalColumnSetValue
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.IntComparisonFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.IntComparisonFilter)
      com.google.cloud.clouddms.v1.IntComparisonFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_IntComparisonFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_IntComparisonFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.IntComparisonFilter.class,
              com.google.cloud.clouddms.v1.IntComparisonFilter.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.IntComparisonFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valueComparison_ = 0;
      value_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_IntComparisonFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.IntComparisonFilter getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.IntComparisonFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.IntComparisonFilter build() {
      com.google.cloud.clouddms.v1.IntComparisonFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.IntComparisonFilter buildPartial() {
      com.google.cloud.clouddms.v1.IntComparisonFilter result =
          new com.google.cloud.clouddms.v1.IntComparisonFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.IntComparisonFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valueComparison_ = valueComparison_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
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
      if (other instanceof com.google.cloud.clouddms.v1.IntComparisonFilter) {
        return mergeFrom((com.google.cloud.clouddms.v1.IntComparisonFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.IntComparisonFilter other) {
      if (other == com.google.cloud.clouddms.v1.IntComparisonFilter.getDefaultInstance())
        return this;
      if (other.valueComparison_ != 0) {
        setValueComparisonValue(other.getValueComparisonValue());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
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
                valueComparison_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                value_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int valueComparison_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Relation between source value and compare value
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for valueComparison.
     */
    @java.lang.Override
    public int getValueComparisonValue() {
      return valueComparison_;
    }
    /**
     *
     *
     * <pre>
     * Required. Relation between source value and compare value
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for valueComparison to set.
     * @return This builder for chaining.
     */
    public Builder setValueComparisonValue(int value) {
      valueComparison_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Relation between source value and compare value
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The valueComparison.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.v1.ValueComparison getValueComparison() {
      com.google.cloud.clouddms.v1.ValueComparison result =
          com.google.cloud.clouddms.v1.ValueComparison.forNumber(valueComparison_);
      return result == null ? com.google.cloud.clouddms.v1.ValueComparison.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Relation between source value and compare value
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The valueComparison to set.
     * @return This builder for chaining.
     */
    public Builder setValueComparison(com.google.cloud.clouddms.v1.ValueComparison value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      valueComparison_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Relation between source value and compare value
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValueComparison value_comparison = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValueComparison() {
      bitField0_ = (bitField0_ & ~0x00000001);
      valueComparison_ = 0;
      onChanged();
      return this;
    }

    private long value_;
    /**
     *
     *
     * <pre>
     * Required. Integer compare value to be used
     * </pre>
     *
     * <code>int64 value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     *
     *
     * <pre>
     * Required. Integer compare value to be used
     * </pre>
     *
     * <code>int64 value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {

      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Integer compare value to be used
     * </pre>
     *
     * <code>int64 value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.IntComparisonFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.IntComparisonFilter)
  private static final com.google.cloud.clouddms.v1.IntComparisonFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.IntComparisonFilter();
  }

  public static com.google.cloud.clouddms.v1.IntComparisonFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntComparisonFilter> PARSER =
      new com.google.protobuf.AbstractParser<IntComparisonFilter>() {
        @java.lang.Override
        public IntComparisonFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntComparisonFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntComparisonFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.IntComparisonFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
