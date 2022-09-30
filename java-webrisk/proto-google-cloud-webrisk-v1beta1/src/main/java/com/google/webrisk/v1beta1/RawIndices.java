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
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

/**
 *
 *
 * <pre>
 * A set of raw indices to remove from a local list.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1beta1.RawIndices}
 */
public final class RawIndices extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1beta1.RawIndices)
    RawIndicesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RawIndices.newBuilder() to construct.
  private RawIndices(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RawIndices() {
    indices_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RawIndices();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RawIndices(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                indices_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              indices_.addInt(input.readInt32());
              break;
            }
          case 10:
            {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                indices_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                indices_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        indices_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.webrisk.v1beta1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1beta1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1beta1_RawIndices_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1beta1.RawIndices.class,
            com.google.webrisk.v1beta1.RawIndices.Builder.class);
  }

  public static final int INDICES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList indices_;
  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @return A list containing the indices.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getIndicesList() {
    return indices_;
  }
  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @return The count of indices.
   */
  public int getIndicesCount() {
    return indices_.size();
  }
  /**
   *
   *
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  public int getIndices(int index) {
    return indices_.getInt(index);
  }

  private int indicesMemoizedSerializedSize = -1;

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
    if (getIndicesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(indicesMemoizedSerializedSize);
    }
    for (int i = 0; i < indices_.size(); i++) {
      output.writeInt32NoTag(indices_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < indices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(indices_.getInt(i));
      }
      size += dataSize;
      if (!getIndicesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      indicesMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.webrisk.v1beta1.RawIndices)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1beta1.RawIndices other = (com.google.webrisk.v1beta1.RawIndices) obj;

    if (!getIndicesList().equals(other.getIndicesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIndicesCount() > 0) {
      hash = (37 * hash) + INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getIndicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1beta1.RawIndices parseFrom(
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

  public static Builder newBuilder(com.google.webrisk.v1beta1.RawIndices prototype) {
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
   * A set of raw indices to remove from a local list.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1beta1.RawIndices}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1beta1.RawIndices)
      com.google.webrisk.v1beta1.RawIndicesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.webrisk.v1beta1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1beta1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1beta1_RawIndices_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1beta1.RawIndices.class,
              com.google.webrisk.v1beta1.RawIndices.Builder.class);
    }

    // Construct using com.google.webrisk.v1beta1.RawIndices.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      indices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.webrisk.v1beta1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.RawIndices getDefaultInstanceForType() {
      return com.google.webrisk.v1beta1.RawIndices.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.RawIndices build() {
      com.google.webrisk.v1beta1.RawIndices result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1beta1.RawIndices buildPartial() {
      com.google.webrisk.v1beta1.RawIndices result =
          new com.google.webrisk.v1beta1.RawIndices(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        indices_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.indices_ = indices_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.webrisk.v1beta1.RawIndices) {
        return mergeFrom((com.google.webrisk.v1beta1.RawIndices) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1beta1.RawIndices other) {
      if (other == com.google.webrisk.v1beta1.RawIndices.getDefaultInstance()) return this;
      if (!other.indices_.isEmpty()) {
        if (indices_.isEmpty()) {
          indices_ = other.indices_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIndicesIsMutable();
          indices_.addAll(other.indices_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.webrisk.v1beta1.RawIndices parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.webrisk.v1beta1.RawIndices) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Internal.IntList indices_ = emptyIntList();

    private void ensureIndicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        indices_ = mutableCopy(indices_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @return A list containing the indices.
     */
    public java.util.List<java.lang.Integer> getIndicesList() {
      return ((bitField0_ & 0x00000001) != 0)
          ? java.util.Collections.unmodifiableList(indices_)
          : indices_;
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @return The count of indices.
     */
    public int getIndicesCount() {
      return indices_.size();
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The indices at the given index.
     */
    public int getIndices(int index) {
      return indices_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The indices to set.
     * @return This builder for chaining.
     */
    public Builder setIndices(int index, int value) {
      ensureIndicesIsMutable();
      indices_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @param value The indices to add.
     * @return This builder for chaining.
     */
    public Builder addIndices(int value) {
      ensureIndicesIsMutable();
      indices_.addInt(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @param values The indices to add.
     * @return This builder for chaining.
     */
    public Builder addAllIndices(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureIndicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, indices_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indices to remove from a lexicographically-sorted local list.
     * </pre>
     *
     * <code>repeated int32 indices = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndices() {
      indices_ = emptyIntList();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1beta1.RawIndices)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1beta1.RawIndices)
  private static final com.google.webrisk.v1beta1.RawIndices DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1beta1.RawIndices();
  }

  public static com.google.webrisk.v1beta1.RawIndices getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RawIndices> PARSER =
      new com.google.protobuf.AbstractParser<RawIndices>() {
        @java.lang.Override
        public RawIndices parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RawIndices(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RawIndices> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RawIndices> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1beta1.RawIndices getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
