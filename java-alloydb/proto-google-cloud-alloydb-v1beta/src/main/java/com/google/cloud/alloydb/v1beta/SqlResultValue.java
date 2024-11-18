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
// source: google/cloud/alloydb/v1beta/data_model.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1beta;

/**
 *
 *
 * <pre>
 * A single value in a row from a sql result.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1beta.SqlResultValue}
 */
public final class SqlResultValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1beta.SqlResultValue)
    SqlResultValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SqlResultValue.newBuilder() to construct.
  private SqlResultValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SqlResultValue() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SqlResultValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1beta.DataModelProto
        .internal_static_google_cloud_alloydb_v1beta_SqlResultValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1beta.DataModelProto
        .internal_static_google_cloud_alloydb_v1beta_SqlResultValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1beta.SqlResultValue.class,
            com.google.cloud.alloydb.v1beta.SqlResultValue.Builder.class);
  }

  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The cell value represented in string format.
   * Timestamps are converted to string using RFC3339Nano format.
   * </pre>
   *
   * <code>optional string value = 1;</code>
   *
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 2;
  private boolean nullValue_ = false;
  /**
   *
   *
   * <pre>
   * Set to true if cell value is null.
   * </pre>
   *
   * <code>optional bool null_value = 2;</code>
   *
   * @return Whether the nullValue field is set.
   */
  @java.lang.Override
  public boolean hasNullValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Set to true if cell value is null.
   * </pre>
   *
   * <code>optional bool null_value = 2;</code>
   *
   * @return The nullValue.
   */
  @java.lang.Override
  public boolean getNullValue() {
    return nullValue_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, nullValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, nullValue_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1beta.SqlResultValue)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1beta.SqlResultValue other =
        (com.google.cloud.alloydb.v1beta.SqlResultValue) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue().equals(other.getValue())) return false;
    }
    if (hasNullValue() != other.hasNullValue()) return false;
    if (hasNullValue()) {
      if (getNullValue() != other.getNullValue()) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasNullValue()) {
      hash = (37 * hash) + NULL_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNullValue());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue parseFrom(
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

  public static Builder newBuilder(com.google.cloud.alloydb.v1beta.SqlResultValue prototype) {
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
   * A single value in a row from a sql result.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1beta.SqlResultValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1beta.SqlResultValue)
      com.google.cloud.alloydb.v1beta.SqlResultValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1beta.DataModelProto
          .internal_static_google_cloud_alloydb_v1beta_SqlResultValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1beta.DataModelProto
          .internal_static_google_cloud_alloydb_v1beta_SqlResultValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1beta.SqlResultValue.class,
              com.google.cloud.alloydb.v1beta.SqlResultValue.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1beta.SqlResultValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = "";
      nullValue_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1beta.DataModelProto
          .internal_static_google_cloud_alloydb_v1beta_SqlResultValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.SqlResultValue getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1beta.SqlResultValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.SqlResultValue build() {
      com.google.cloud.alloydb.v1beta.SqlResultValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1beta.SqlResultValue buildPartial() {
      com.google.cloud.alloydb.v1beta.SqlResultValue result =
          new com.google.cloud.alloydb.v1beta.SqlResultValue(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1beta.SqlResultValue result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nullValue_ = nullValue_;
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
      if (other instanceof com.google.cloud.alloydb.v1beta.SqlResultValue) {
        return mergeFrom((com.google.cloud.alloydb.v1beta.SqlResultValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1beta.SqlResultValue other) {
      if (other == com.google.cloud.alloydb.v1beta.SqlResultValue.getDefaultInstance()) return this;
      if (other.hasValue()) {
        value_ = other.value_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasNullValue()) {
        setNullValue(other.getNullValue());
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
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                nullValue_ = input.readBool();
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

    private java.lang.Object value_ = "";
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cell value represented in string format.
     * Timestamps are converted to string using RFC3339Nano format.
     * </pre>
     *
     * <code>optional string value = 1;</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean nullValue_;
    /**
     *
     *
     * <pre>
     * Set to true if cell value is null.
     * </pre>
     *
     * <code>optional bool null_value = 2;</code>
     *
     * @return Whether the nullValue field is set.
     */
    @java.lang.Override
    public boolean hasNullValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Set to true if cell value is null.
     * </pre>
     *
     * <code>optional bool null_value = 2;</code>
     *
     * @return The nullValue.
     */
    @java.lang.Override
    public boolean getNullValue() {
      return nullValue_;
    }
    /**
     *
     *
     * <pre>
     * Set to true if cell value is null.
     * </pre>
     *
     * <code>optional bool null_value = 2;</code>
     *
     * @param value The nullValue to set.
     * @return This builder for chaining.
     */
    public Builder setNullValue(boolean value) {

      nullValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to true if cell value is null.
     * </pre>
     *
     * <code>optional bool null_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNullValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      nullValue_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1beta.SqlResultValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1beta.SqlResultValue)
  private static final com.google.cloud.alloydb.v1beta.SqlResultValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1beta.SqlResultValue();
  }

  public static com.google.cloud.alloydb.v1beta.SqlResultValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlResultValue> PARSER =
      new com.google.protobuf.AbstractParser<SqlResultValue>() {
        @java.lang.Override
        public SqlResultValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<SqlResultValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlResultValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1beta.SqlResultValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
