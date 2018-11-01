// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * The returned list of pipelines in the project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse}
 */
public  final class ListTransferConfigsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)
    ListTransferConfigsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferConfigsResponse.newBuilder() to construct.
  private ListTransferConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferConfigsResponse() {
    transferConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTransferConfigsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              transferConfigs_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferConfig>();
              mutable_bitField0_ |= 0x00000001;
            }
            transferConfigs_.add(
                input.readMessage(com.google.cloud.bigquery.datatransfer.v1.TransferConfig.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        transferConfigs_ = java.util.Collections.unmodifiableList(transferConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSFER_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> transferConfigs_;
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
   */
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> getTransferConfigsList() {
    return transferConfigs_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder> 
      getTransferConfigsOrBuilderList() {
    return transferConfigs_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
   */
  public int getTransferConfigsCount() {
    return transferConfigs_.size();
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfigs(int index) {
    return transferConfigs_.get(index);
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
   */
  public com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigsOrBuilder(
      int index) {
    return transferConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferConfigsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
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
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferConfigsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
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
    for (int i = 0; i < transferConfigs_.size(); i++) {
      output.writeMessage(1, transferConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < transferConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transferConfigs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse other = (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse) obj;

    boolean result = true;
    result = result && getTransferConfigsList()
        .equals(other.getTransferConfigsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTransferConfigsCount() > 0) {
      hash = (37 * hash) + TRANSFER_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse prototype) {
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
   * The returned list of pipelines in the project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.newBuilder()
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
        getTransferConfigsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transferConfigsBuilder_ == null) {
        transferConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        transferConfigsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse result = new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (transferConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          transferConfigs_ = java.util.Collections.unmodifiableList(transferConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transferConfigs_ = transferConfigs_;
      } else {
        result.transferConfigs_ = transferConfigsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.getDefaultInstance()) return this;
      if (transferConfigsBuilder_ == null) {
        if (!other.transferConfigs_.isEmpty()) {
          if (transferConfigs_.isEmpty()) {
            transferConfigs_ = other.transferConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransferConfigsIsMutable();
            transferConfigs_.addAll(other.transferConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.transferConfigs_.isEmpty()) {
          if (transferConfigsBuilder_.isEmpty()) {
            transferConfigsBuilder_.dispose();
            transferConfigsBuilder_ = null;
            transferConfigs_ = other.transferConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transferConfigsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransferConfigsFieldBuilder() : null;
          } else {
            transferConfigsBuilder_.addAllMessages(other.transferConfigs_);
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
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> transferConfigs_ =
      java.util.Collections.emptyList();
    private void ensureTransferConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        transferConfigs_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferConfig>(transferConfigs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferConfig, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder> transferConfigsBuilder_;

    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> getTransferConfigsList() {
      if (transferConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transferConfigs_);
      } else {
        return transferConfigsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public int getTransferConfigsCount() {
      if (transferConfigsBuilder_ == null) {
        return transferConfigs_.size();
      } else {
        return transferConfigsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfigs(int index) {
      if (transferConfigsBuilder_ == null) {
        return transferConfigs_.get(index);
      } else {
        return transferConfigsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder setTransferConfigs(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferConfig value) {
      if (transferConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferConfigsIsMutable();
        transferConfigs_.set(index, value);
        onChanged();
      } else {
        transferConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder setTransferConfigs(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder builderForValue) {
      if (transferConfigsBuilder_ == null) {
        ensureTransferConfigsIsMutable();
        transferConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        transferConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder addTransferConfigs(com.google.cloud.bigquery.datatransfer.v1.TransferConfig value) {
      if (transferConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferConfigsIsMutable();
        transferConfigs_.add(value);
        onChanged();
      } else {
        transferConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder addTransferConfigs(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferConfig value) {
      if (transferConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferConfigsIsMutable();
        transferConfigs_.add(index, value);
        onChanged();
      } else {
        transferConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder addTransferConfigs(
        com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder builderForValue) {
      if (transferConfigsBuilder_ == null) {
        ensureTransferConfigsIsMutable();
        transferConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        transferConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder addTransferConfigs(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder builderForValue) {
      if (transferConfigsBuilder_ == null) {
        ensureTransferConfigsIsMutable();
        transferConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        transferConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder addAllTransferConfigs(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.TransferConfig> values) {
      if (transferConfigsBuilder_ == null) {
        ensureTransferConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transferConfigs_);
        onChanged();
      } else {
        transferConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder clearTransferConfigs() {
      if (transferConfigsBuilder_ == null) {
        transferConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transferConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public Builder removeTransferConfigs(int index) {
      if (transferConfigsBuilder_ == null) {
        ensureTransferConfigsIsMutable();
        transferConfigs_.remove(index);
        onChanged();
      } else {
        transferConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder getTransferConfigsBuilder(
        int index) {
      return getTransferConfigsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigsOrBuilder(
        int index) {
      if (transferConfigsBuilder_ == null) {
        return transferConfigs_.get(index);  } else {
        return transferConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder> 
         getTransferConfigsOrBuilderList() {
      if (transferConfigsBuilder_ != null) {
        return transferConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transferConfigs_);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder addTransferConfigsBuilder() {
      return getTransferConfigsFieldBuilder().addBuilder(
          com.google.cloud.bigquery.datatransfer.v1.TransferConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder addTransferConfigsBuilder(
        int index) {
      return getTransferConfigsFieldBuilder().addBuilder(
          index, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer configurations.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder> 
         getTransferConfigsBuilderList() {
      return getTransferConfigsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferConfig, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder> 
        getTransferConfigsFieldBuilder() {
      if (transferConfigsBuilder_ == null) {
        transferConfigsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.TransferConfig, com.google.cloud.bigquery.datatransfer.v1.TransferConfig.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder>(
                transferConfigs_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        transferConfigs_ = null;
      }
      return transferConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferConfigsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferConfigsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferConfigsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferConfigsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `ListTransferConfigsRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
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
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferConfigsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferConfigsResponse>() {
    @java.lang.Override
    public ListTransferConfigsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTransferConfigsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTransferConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

