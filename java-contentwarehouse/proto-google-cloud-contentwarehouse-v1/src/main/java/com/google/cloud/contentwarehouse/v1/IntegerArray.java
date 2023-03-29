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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Integer values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.IntegerArray}
 */
public final class IntegerArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.IntegerArray)
    IntegerArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IntegerArray.newBuilder() to construct.
  private IntegerArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IntegerArray() {
    values_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IntegerArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_IntegerArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.IntegerArray.class,
            com.google.cloud.contentwarehouse.v1.IntegerArray.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList values_;
  /**
   *
   *
   * <pre>
   * List of integer values.
   * </pre>
   *
   * <code>repeated int32 values = 1;</code>
   *
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * List of integer values.
   * </pre>
   *
   * <code>repeated int32 values = 1;</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * List of integer values.
   * </pre>
   *
   * <code>repeated int32 values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public int getValues(int index) {
    return values_.getInt(index);
  }

  private int valuesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeInt32NoTag(values_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(values_.getInt(i));
      }
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.IntegerArray)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.IntegerArray other =
        (com.google.cloud.contentwarehouse.v1.IntegerArray) obj;

    if (!getValuesList().equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.IntegerArray prototype) {
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
   * Integer values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.IntegerArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.IntegerArray)
      com.google.cloud.contentwarehouse.v1.IntegerArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_IntegerArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.IntegerArray.class,
              com.google.cloud.contentwarehouse.v1.IntegerArray.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.IntegerArray.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      values_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_IntegerArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.IntegerArray getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.IntegerArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.IntegerArray build() {
      com.google.cloud.contentwarehouse.v1.IntegerArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.IntegerArray buildPartial() {
      com.google.cloud.contentwarehouse.v1.IntegerArray result =
          new com.google.cloud.contentwarehouse.v1.IntegerArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contentwarehouse.v1.IntegerArray result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.IntegerArray result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.IntegerArray) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.IntegerArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.IntegerArray other) {
      if (other == com.google.cloud.contentwarehouse.v1.IntegerArray.getDefaultInstance())
        return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
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
            case 8:
              {
                int v = input.readInt32();
                ensureValuesIsMutable();
                values_.addInt(v);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureValuesIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  values_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
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

    private com.google.protobuf.Internal.IntList values_ = emptyIntList();

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = mutableCopy(values_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @return A list containing the values.
     */
    public java.util.List<java.lang.Integer> getValuesList() {
      return ((bitField0_ & 0x00000001) != 0)
          ? java.util.Collections.unmodifiableList(values_)
          : values_;
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public int getValues(int index) {
      return values_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, int value) {

      ensureValuesIsMutable();
      values_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(int value) {

      ensureValuesIsMutable();
      values_.addInt(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of integer values.
     * </pre>
     *
     * <code>repeated int32 values = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.IntegerArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.IntegerArray)
  private static final com.google.cloud.contentwarehouse.v1.IntegerArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.IntegerArray();
  }

  public static com.google.cloud.contentwarehouse.v1.IntegerArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntegerArray> PARSER =
      new com.google.protobuf.AbstractParser<IntegerArray>() {
        @java.lang.Override
        public IntegerArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntegerArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntegerArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.IntegerArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
