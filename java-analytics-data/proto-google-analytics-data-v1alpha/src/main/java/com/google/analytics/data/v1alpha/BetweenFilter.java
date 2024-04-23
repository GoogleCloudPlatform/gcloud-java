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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * To express that the result needs to be between two numbers (inclusive).
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.BetweenFilter}
 */
public final class BetweenFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.BetweenFilter)
    BetweenFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BetweenFilter.newBuilder() to construct.
  private BetweenFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BetweenFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BetweenFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_BetweenFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_BetweenFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.BetweenFilter.class,
            com.google.analytics.data.v1alpha.BetweenFilter.Builder.class);
  }

  private int bitField0_;
  public static final int FROM_VALUE_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.NumericValue fromValue_;
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
   *
   * @return Whether the fromValue field is set.
   */
  @java.lang.Override
  public boolean hasFromValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
   *
   * @return The fromValue.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.NumericValue getFromValue() {
    return fromValue_ == null
        ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
        : fromValue_;
  }
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
    return fromValue_ == null
        ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
        : fromValue_;
  }

  public static final int TO_VALUE_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.NumericValue toValue_;
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
   *
   * @return Whether the toValue field is set.
   */
  @java.lang.Override
  public boolean hasToValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
   *
   * @return The toValue.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.NumericValue getToValue() {
    return toValue_ == null
        ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
        : toValue_;
  }
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
    return toValue_ == null
        ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
        : toValue_;
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
      output.writeMessage(1, getFromValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getToValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFromValue());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getToValue());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.BetweenFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.BetweenFilter other =
        (com.google.analytics.data.v1alpha.BetweenFilter) obj;

    if (hasFromValue() != other.hasFromValue()) return false;
    if (hasFromValue()) {
      if (!getFromValue().equals(other.getFromValue())) return false;
    }
    if (hasToValue() != other.hasToValue()) return false;
    if (hasToValue()) {
      if (!getToValue().equals(other.getToValue())) return false;
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
    if (hasFromValue()) {
      hash = (37 * hash) + FROM_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFromValue().hashCode();
    }
    if (hasToValue()) {
      hash = (37 * hash) + TO_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getToValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.BetweenFilter prototype) {
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
   * To express that the result needs to be between two numbers (inclusive).
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.BetweenFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.BetweenFilter)
      com.google.analytics.data.v1alpha.BetweenFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_BetweenFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_BetweenFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.BetweenFilter.class,
              com.google.analytics.data.v1alpha.BetweenFilter.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.BetweenFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFromValueFieldBuilder();
        getToValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fromValue_ = null;
      if (fromValueBuilder_ != null) {
        fromValueBuilder_.dispose();
        fromValueBuilder_ = null;
      }
      toValue_ = null;
      if (toValueBuilder_ != null) {
        toValueBuilder_.dispose();
        toValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_BetweenFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BetweenFilter getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.BetweenFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BetweenFilter build() {
      com.google.analytics.data.v1alpha.BetweenFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.BetweenFilter buildPartial() {
      com.google.analytics.data.v1alpha.BetweenFilter result =
          new com.google.analytics.data.v1alpha.BetweenFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.BetweenFilter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fromValue_ = fromValueBuilder_ == null ? fromValue_ : fromValueBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.toValue_ = toValueBuilder_ == null ? toValue_ : toValueBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.analytics.data.v1alpha.BetweenFilter) {
        return mergeFrom((com.google.analytics.data.v1alpha.BetweenFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.BetweenFilter other) {
      if (other == com.google.analytics.data.v1alpha.BetweenFilter.getDefaultInstance())
        return this;
      if (other.hasFromValue()) {
        mergeFromValue(other.getFromValue());
      }
      if (other.hasToValue()) {
        mergeToValue(other.getToValue());
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
                input.readMessage(getFromValueFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getToValueFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.analytics.data.v1alpha.NumericValue fromValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.NumericValue,
            com.google.analytics.data.v1alpha.NumericValue.Builder,
            com.google.analytics.data.v1alpha.NumericValueOrBuilder>
        fromValueBuilder_;
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return Whether the fromValue field is set.
     */
    public boolean hasFromValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return The fromValue.
     */
    public com.google.analytics.data.v1alpha.NumericValue getFromValue() {
      if (fromValueBuilder_ == null) {
        return fromValue_ == null
            ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
            : fromValue_;
      } else {
        return fromValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder setFromValue(com.google.analytics.data.v1alpha.NumericValue value) {
      if (fromValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fromValue_ = value;
      } else {
        fromValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder setFromValue(
        com.google.analytics.data.v1alpha.NumericValue.Builder builderForValue) {
      if (fromValueBuilder_ == null) {
        fromValue_ = builderForValue.build();
      } else {
        fromValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder mergeFromValue(com.google.analytics.data.v1alpha.NumericValue value) {
      if (fromValueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && fromValue_ != null
            && fromValue_ != com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()) {
          getFromValueBuilder().mergeFrom(value);
        } else {
          fromValue_ = value;
        }
      } else {
        fromValueBuilder_.mergeFrom(value);
      }
      if (fromValue_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder clearFromValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fromValue_ = null;
      if (fromValueBuilder_ != null) {
        fromValueBuilder_.dispose();
        fromValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public com.google.analytics.data.v1alpha.NumericValue.Builder getFromValueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFromValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    public com.google.analytics.data.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
      if (fromValueBuilder_ != null) {
        return fromValueBuilder_.getMessageOrBuilder();
      } else {
        return fromValue_ == null
            ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
            : fromValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue from_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.NumericValue,
            com.google.analytics.data.v1alpha.NumericValue.Builder,
            com.google.analytics.data.v1alpha.NumericValueOrBuilder>
        getFromValueFieldBuilder() {
      if (fromValueBuilder_ == null) {
        fromValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.NumericValue,
                com.google.analytics.data.v1alpha.NumericValue.Builder,
                com.google.analytics.data.v1alpha.NumericValueOrBuilder>(
                getFromValue(), getParentForChildren(), isClean());
        fromValue_ = null;
      }
      return fromValueBuilder_;
    }

    private com.google.analytics.data.v1alpha.NumericValue toValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.NumericValue,
            com.google.analytics.data.v1alpha.NumericValue.Builder,
            com.google.analytics.data.v1alpha.NumericValueOrBuilder>
        toValueBuilder_;
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return Whether the toValue field is set.
     */
    public boolean hasToValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return The toValue.
     */
    public com.google.analytics.data.v1alpha.NumericValue getToValue() {
      if (toValueBuilder_ == null) {
        return toValue_ == null
            ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
            : toValue_;
      } else {
        return toValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder setToValue(com.google.analytics.data.v1alpha.NumericValue value) {
      if (toValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toValue_ = value;
      } else {
        toValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder setToValue(
        com.google.analytics.data.v1alpha.NumericValue.Builder builderForValue) {
      if (toValueBuilder_ == null) {
        toValue_ = builderForValue.build();
      } else {
        toValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder mergeToValue(com.google.analytics.data.v1alpha.NumericValue value) {
      if (toValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && toValue_ != null
            && toValue_ != com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()) {
          getToValueBuilder().mergeFrom(value);
        } else {
          toValue_ = value;
        }
      } else {
        toValueBuilder_.mergeFrom(value);
      }
      if (toValue_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder clearToValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      toValue_ = null;
      if (toValueBuilder_ != null) {
        toValueBuilder_.dispose();
        toValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public com.google.analytics.data.v1alpha.NumericValue.Builder getToValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getToValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    public com.google.analytics.data.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
      if (toValueBuilder_ != null) {
        return toValueBuilder_.getMessageOrBuilder();
      } else {
        return toValue_ == null
            ? com.google.analytics.data.v1alpha.NumericValue.getDefaultInstance()
            : toValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.NumericValue to_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.NumericValue,
            com.google.analytics.data.v1alpha.NumericValue.Builder,
            com.google.analytics.data.v1alpha.NumericValueOrBuilder>
        getToValueFieldBuilder() {
      if (toValueBuilder_ == null) {
        toValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.NumericValue,
                com.google.analytics.data.v1alpha.NumericValue.Builder,
                com.google.analytics.data.v1alpha.NumericValueOrBuilder>(
                getToValue(), getParentForChildren(), isClean());
        toValue_ = null;
      }
      return toValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.BetweenFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.BetweenFilter)
  private static final com.google.analytics.data.v1alpha.BetweenFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.BetweenFilter();
  }

  public static com.google.analytics.data.v1alpha.BetweenFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BetweenFilter> PARSER =
      new com.google.protobuf.AbstractParser<BetweenFilter>() {
        @java.lang.Override
        public BetweenFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<BetweenFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BetweenFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.BetweenFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
