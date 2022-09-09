// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Response message for [CloudChannelService.ListTransferableSkus][google.cloud.channel.v1.CloudChannelService.ListTransferableSkus].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListTransferableSkusResponse}
 */
public final class ListTransferableSkusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListTransferableSkusResponse)
    ListTransferableSkusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferableSkusResponse.newBuilder() to construct.
  private ListTransferableSkusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferableSkusResponse() {
    transferableSkus_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTransferableSkusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTransferableSkusResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              transferableSkus_ = new java.util.ArrayList<com.google.cloud.channel.v1.TransferableSku>();
              mutable_bitField0_ |= 0x00000001;
            }
            transferableSkus_.add(
                input.readMessage(com.google.cloud.channel.v1.TransferableSku.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        transferableSkus_ = java.util.Collections.unmodifiableList(transferableSkus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableSkusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableSkusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListTransferableSkusResponse.class, com.google.cloud.channel.v1.ListTransferableSkusResponse.Builder.class);
  }

  public static final int TRANSFERABLE_SKUS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.channel.v1.TransferableSku> transferableSkus_;
  /**
   * <pre>
   * Information about existing SKUs for a customer that needs a transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.TransferableSku> getTransferableSkusList() {
    return transferableSkus_;
  }
  /**
   * <pre>
   * Information about existing SKUs for a customer that needs a transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.TransferableSkuOrBuilder> 
      getTransferableSkusOrBuilderList() {
    return transferableSkus_;
  }
  /**
   * <pre>
   * Information about existing SKUs for a customer that needs a transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  @java.lang.Override
  public int getTransferableSkusCount() {
    return transferableSkus_.size();
  }
  /**
   * <pre>
   * Information about existing SKUs for a customer that needs a transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.TransferableSku getTransferableSkus(int index) {
    return transferableSkus_.get(index);
  }
  /**
   * <pre>
   * Information about existing SKUs for a customer that needs a transfer.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.TransferableSkuOrBuilder getTransferableSkusOrBuilder(
      int index) {
    return transferableSkus_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < transferableSkus_.size(); i++) {
      output.writeMessage(1, transferableSkus_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transferableSkus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transferableSkus_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListTransferableSkusResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListTransferableSkusResponse other = (com.google.cloud.channel.v1.ListTransferableSkusResponse) obj;

    if (!getTransferableSkusList()
        .equals(other.getTransferableSkusList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getTransferableSkusCount() > 0) {
      hash = (37 * hash) + TRANSFERABLE_SKUS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferableSkusList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.ListTransferableSkusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.channel.v1.ListTransferableSkusResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for [CloudChannelService.ListTransferableSkus][google.cloud.channel.v1.CloudChannelService.ListTransferableSkus].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListTransferableSkusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListTransferableSkusResponse)
      com.google.cloud.channel.v1.ListTransferableSkusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableSkusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableSkusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListTransferableSkusResponse.class, com.google.cloud.channel.v1.ListTransferableSkusResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListTransferableSkusResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTransferableSkusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transferableSkusBuilder_ == null) {
        transferableSkus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transferableSkusBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_ListTransferableSkusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableSkusResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListTransferableSkusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableSkusResponse build() {
      com.google.cloud.channel.v1.ListTransferableSkusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListTransferableSkusResponse buildPartial() {
      com.google.cloud.channel.v1.ListTransferableSkusResponse result = new com.google.cloud.channel.v1.ListTransferableSkusResponse(this);
      int from_bitField0_ = bitField0_;
      if (transferableSkusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transferableSkus_ = java.util.Collections.unmodifiableList(transferableSkus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transferableSkus_ = transferableSkus_;
      } else {
        result.transferableSkus_ = transferableSkusBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.channel.v1.ListTransferableSkusResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListTransferableSkusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListTransferableSkusResponse other) {
      if (other == com.google.cloud.channel.v1.ListTransferableSkusResponse.getDefaultInstance()) return this;
      if (transferableSkusBuilder_ == null) {
        if (!other.transferableSkus_.isEmpty()) {
          if (transferableSkus_.isEmpty()) {
            transferableSkus_ = other.transferableSkus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransferableSkusIsMutable();
            transferableSkus_.addAll(other.transferableSkus_);
          }
          onChanged();
        }
      } else {
        if (!other.transferableSkus_.isEmpty()) {
          if (transferableSkusBuilder_.isEmpty()) {
            transferableSkusBuilder_.dispose();
            transferableSkusBuilder_ = null;
            transferableSkus_ = other.transferableSkus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transferableSkusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransferableSkusFieldBuilder() : null;
          } else {
            transferableSkusBuilder_.addAllMessages(other.transferableSkus_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.channel.v1.ListTransferableSkusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.ListTransferableSkusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.channel.v1.TransferableSku> transferableSkus_ =
      java.util.Collections.emptyList();
    private void ensureTransferableSkusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transferableSkus_ = new java.util.ArrayList<com.google.cloud.channel.v1.TransferableSku>(transferableSkus_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.TransferableSku, com.google.cloud.channel.v1.TransferableSku.Builder, com.google.cloud.channel.v1.TransferableSkuOrBuilder> transferableSkusBuilder_;

    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.TransferableSku> getTransferableSkusList() {
      if (transferableSkusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transferableSkus_);
      } else {
        return transferableSkusBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public int getTransferableSkusCount() {
      if (transferableSkusBuilder_ == null) {
        return transferableSkus_.size();
      } else {
        return transferableSkusBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableSku getTransferableSkus(int index) {
      if (transferableSkusBuilder_ == null) {
        return transferableSkus_.get(index);
      } else {
        return transferableSkusBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder setTransferableSkus(
        int index, com.google.cloud.channel.v1.TransferableSku value) {
      if (transferableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableSkusIsMutable();
        transferableSkus_.set(index, value);
        onChanged();
      } else {
        transferableSkusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder setTransferableSkus(
        int index, com.google.cloud.channel.v1.TransferableSku.Builder builderForValue) {
      if (transferableSkusBuilder_ == null) {
        ensureTransferableSkusIsMutable();
        transferableSkus_.set(index, builderForValue.build());
        onChanged();
      } else {
        transferableSkusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder addTransferableSkus(com.google.cloud.channel.v1.TransferableSku value) {
      if (transferableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableSkusIsMutable();
        transferableSkus_.add(value);
        onChanged();
      } else {
        transferableSkusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder addTransferableSkus(
        int index, com.google.cloud.channel.v1.TransferableSku value) {
      if (transferableSkusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferableSkusIsMutable();
        transferableSkus_.add(index, value);
        onChanged();
      } else {
        transferableSkusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder addTransferableSkus(
        com.google.cloud.channel.v1.TransferableSku.Builder builderForValue) {
      if (transferableSkusBuilder_ == null) {
        ensureTransferableSkusIsMutable();
        transferableSkus_.add(builderForValue.build());
        onChanged();
      } else {
        transferableSkusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder addTransferableSkus(
        int index, com.google.cloud.channel.v1.TransferableSku.Builder builderForValue) {
      if (transferableSkusBuilder_ == null) {
        ensureTransferableSkusIsMutable();
        transferableSkus_.add(index, builderForValue.build());
        onChanged();
      } else {
        transferableSkusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder addAllTransferableSkus(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.TransferableSku> values) {
      if (transferableSkusBuilder_ == null) {
        ensureTransferableSkusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transferableSkus_);
        onChanged();
      } else {
        transferableSkusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder clearTransferableSkus() {
      if (transferableSkusBuilder_ == null) {
        transferableSkus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transferableSkusBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public Builder removeTransferableSkus(int index) {
      if (transferableSkusBuilder_ == null) {
        ensureTransferableSkusIsMutable();
        transferableSkus_.remove(index);
        onChanged();
      } else {
        transferableSkusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableSku.Builder getTransferableSkusBuilder(
        int index) {
      return getTransferableSkusFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableSkuOrBuilder getTransferableSkusOrBuilder(
        int index) {
      if (transferableSkusBuilder_ == null) {
        return transferableSkus_.get(index);  } else {
        return transferableSkusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.TransferableSkuOrBuilder> 
         getTransferableSkusOrBuilderList() {
      if (transferableSkusBuilder_ != null) {
        return transferableSkusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transferableSkus_);
      }
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableSku.Builder addTransferableSkusBuilder() {
      return getTransferableSkusFieldBuilder().addBuilder(
          com.google.cloud.channel.v1.TransferableSku.getDefaultInstance());
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public com.google.cloud.channel.v1.TransferableSku.Builder addTransferableSkusBuilder(
        int index) {
      return getTransferableSkusFieldBuilder().addBuilder(
          index, com.google.cloud.channel.v1.TransferableSku.getDefaultInstance());
    }
    /**
     * <pre>
     * Information about existing SKUs for a customer that needs a transfer.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.TransferableSku.Builder> 
         getTransferableSkusBuilderList() {
      return getTransferableSkusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.TransferableSku, com.google.cloud.channel.v1.TransferableSku.Builder, com.google.cloud.channel.v1.TransferableSkuOrBuilder> 
        getTransferableSkusFieldBuilder() {
      if (transferableSkusBuilder_ == null) {
        transferableSkusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.TransferableSku, com.google.cloud.channel.v1.TransferableSku.Builder, com.google.cloud.channel.v1.TransferableSkuOrBuilder>(
                transferableSkus_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transferableSkus_ = null;
      }
      return transferableSkusBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
     * that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListTransferableSkusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListTransferableSkusResponse)
  private static final com.google.cloud.channel.v1.ListTransferableSkusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListTransferableSkusResponse();
  }

  public static com.google.cloud.channel.v1.ListTransferableSkusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferableSkusResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferableSkusResponse>() {
    @java.lang.Override
    public ListTransferableSkusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTransferableSkusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTransferableSkusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferableSkusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListTransferableSkusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

