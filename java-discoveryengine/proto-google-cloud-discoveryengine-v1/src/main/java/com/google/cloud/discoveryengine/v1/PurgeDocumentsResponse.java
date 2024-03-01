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
// source: google/cloud/discoveryengine/v1/purge_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [DocumentService.PurgeDocuments][google.cloud.discoveryengine.v1.DocumentService.PurgeDocuments]
 * method. If the long running operation is successfully done, then this message
 * is returned by the google.longrunning.Operations.response field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.PurgeDocumentsResponse}
 */
public final class PurgeDocumentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.PurgeDocumentsResponse)
    PurgeDocumentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PurgeDocumentsResponse.newBuilder() to construct.
  private PurgeDocumentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PurgeDocumentsResponse() {
    purgeSample_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PurgeDocumentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.PurgeConfigProto
        .internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.PurgeConfigProto
        .internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.class,
            com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.Builder.class);
  }

  public static final int PURGE_COUNT_FIELD_NUMBER = 1;
  private long purgeCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The total count of documents purged as a result of the operation.
   * </pre>
   *
   * <code>int64 purge_count = 1;</code>
   *
   * @return The purgeCount.
   */
  @java.lang.Override
  public long getPurgeCount() {
    return purgeCount_;
  }

  public static final int PURGE_SAMPLE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList purgeSample_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * A sample of document names that will be deleted. Only populated if `force`
   * is set to false. A max of 100 names will be returned and the names are
   * chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the purgeSample.
   */
  public com.google.protobuf.ProtocolStringList getPurgeSampleList() {
    return purgeSample_;
  }
  /**
   *
   *
   * <pre>
   * A sample of document names that will be deleted. Only populated if `force`
   * is set to false. A max of 100 names will be returned and the names are
   * chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of purgeSample.
   */
  public int getPurgeSampleCount() {
    return purgeSample_.size();
  }
  /**
   *
   *
   * <pre>
   * A sample of document names that will be deleted. Only populated if `force`
   * is set to false. A max of 100 names will be returned and the names are
   * chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The purgeSample at the given index.
   */
  public java.lang.String getPurgeSample(int index) {
    return purgeSample_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A sample of document names that will be deleted. Only populated if `force`
   * is set to false. A max of 100 names will be returned and the names are
   * chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the purgeSample at the given index.
   */
  public com.google.protobuf.ByteString getPurgeSampleBytes(int index) {
    return purgeSample_.getByteString(index);
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
    if (purgeCount_ != 0L) {
      output.writeInt64(1, purgeCount_);
    }
    for (int i = 0; i < purgeSample_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, purgeSample_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (purgeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, purgeCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < purgeSample_.size(); i++) {
        dataSize += computeStringSizeNoTag(purgeSample_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPurgeSampleList().size();
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse other =
        (com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse) obj;

    if (getPurgeCount() != other.getPurgeCount()) return false;
    if (!getPurgeSampleList().equals(other.getPurgeSampleList())) return false;
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
    hash = (37 * hash) + PURGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPurgeCount());
    if (getPurgeSampleCount() > 0) {
      hash = (37 * hash) + PURGE_SAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPurgeSampleList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse prototype) {
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
   * Response message for
   * [DocumentService.PurgeDocuments][google.cloud.discoveryengine.v1.DocumentService.PurgeDocuments]
   * method. If the long running operation is successfully done, then this message
   * is returned by the google.longrunning.Operations.response field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.PurgeDocumentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.PurgeDocumentsResponse)
      com.google.cloud.discoveryengine.v1.PurgeDocumentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.PurgeConfigProto
          .internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.PurgeConfigProto
          .internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.class,
              com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      purgeCount_ = 0L;
      purgeSample_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.PurgeConfigProto
          .internal_static_google_cloud_discoveryengine_v1_PurgeDocumentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse build() {
      com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse buildPartial() {
      com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse result =
          new com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.purgeCount_ = purgeCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        purgeSample_.makeImmutable();
        result.purgeSample_ = purgeSample_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse other) {
      if (other == com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse.getDefaultInstance())
        return this;
      if (other.getPurgeCount() != 0L) {
        setPurgeCount(other.getPurgeCount());
      }
      if (!other.purgeSample_.isEmpty()) {
        if (purgeSample_.isEmpty()) {
          purgeSample_ = other.purgeSample_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePurgeSampleIsMutable();
          purgeSample_.addAll(other.purgeSample_);
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
                purgeCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePurgeSampleIsMutable();
                purgeSample_.add(s);
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

    private long purgeCount_;
    /**
     *
     *
     * <pre>
     * The total count of documents purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     *
     * @return The purgeCount.
     */
    @java.lang.Override
    public long getPurgeCount() {
      return purgeCount_;
    }
    /**
     *
     *
     * <pre>
     * The total count of documents purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     *
     * @param value The purgeCount to set.
     * @return This builder for chaining.
     */
    public Builder setPurgeCount(long value) {

      purgeCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total count of documents purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purge_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPurgeCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      purgeCount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList purgeSample_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePurgeSampleIsMutable() {
      if (!purgeSample_.isModifiable()) {
        purgeSample_ = new com.google.protobuf.LazyStringArrayList(purgeSample_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the purgeSample.
     */
    public com.google.protobuf.ProtocolStringList getPurgeSampleList() {
      purgeSample_.makeImmutable();
      return purgeSample_;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of purgeSample.
     */
    public int getPurgeSampleCount() {
      return purgeSample_.size();
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The purgeSample at the given index.
     */
    public java.lang.String getPurgeSample(int index) {
      return purgeSample_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the purgeSample at the given index.
     */
    public com.google.protobuf.ByteString getPurgeSampleBytes(int index) {
      return purgeSample_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The purgeSample to set.
     * @return This builder for chaining.
     */
    public Builder setPurgeSample(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePurgeSampleIsMutable();
      purgeSample_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addPurgeSample(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePurgeSampleIsMutable();
      purgeSample_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addAllPurgeSample(java.lang.Iterable<java.lang.String> values) {
      ensurePurgeSampleIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, purgeSample_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPurgeSample() {
      purgeSample_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sample of document names that will be deleted. Only populated if `force`
     * is set to false. A max of 100 names will be returned and the names are
     * chosen at random.
     * </pre>
     *
     * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the purgeSample to add.
     * @return This builder for chaining.
     */
    public Builder addPurgeSampleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePurgeSampleIsMutable();
      purgeSample_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.PurgeDocumentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.PurgeDocumentsResponse)
  private static final com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse();
  }

  public static com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurgeDocumentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<PurgeDocumentsResponse>() {
        @java.lang.Override
        public PurgeDocumentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PurgeDocumentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurgeDocumentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
