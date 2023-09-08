// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Response message for `AwsClusters.ListAwsNodePools` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse}
 */
public final class ListAwsNodePoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)
    ListAwsNodePoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAwsNodePoolsResponse.newBuilder() to construct.
  private ListAwsNodePoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAwsNodePoolsResponse() {
    awsNodePools_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAwsNodePoolsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsNodePoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsNodePoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.class, com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.Builder.class);
  }

  public static final int AWS_NODE_POOLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool> awsNodePools_;
  /**
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool> getAwsNodePoolsList() {
    return awsNodePools_;
  }
  /**
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder> 
      getAwsNodePoolsOrBuilderList() {
    return awsNodePools_;
  }
  /**
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  @java.lang.Override
  public int getAwsNodePoolsCount() {
    return awsNodePools_.size();
  }
  /**
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsNodePool getAwsNodePools(int index) {
    return awsNodePools_.get(index);
  }
  /**
   * <pre>
   * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
   * resources in the specified `AwsCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder getAwsNodePoolsOrBuilder(
      int index) {
    return awsNodePools_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < awsNodePools_.size(); i++) {
      output.writeMessage(1, awsNodePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < awsNodePools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, awsNodePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse other = (com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse) obj;

    if (!getAwsNodePoolsList()
        .equals(other.getAwsNodePoolsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getAwsNodePoolsCount() > 0) {
      hash = (37 * hash) + AWS_NODE_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getAwsNodePoolsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse prototype) {
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
   * Response message for `AwsClusters.ListAwsNodePools` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)
      com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsNodePoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.class, com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (awsNodePoolsBuilder_ == null) {
        awsNodePools_ = java.util.Collections.emptyList();
      } else {
        awsNodePools_ = null;
        awsNodePoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse build() {
      com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse buildPartial() {
      com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse result = new com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse result) {
      if (awsNodePoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          awsNodePools_ = java.util.Collections.unmodifiableList(awsNodePools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.awsNodePools_ = awsNodePools_;
      } else {
        result.awsNodePools_ = awsNodePoolsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse other) {
      if (other == com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse.getDefaultInstance()) return this;
      if (awsNodePoolsBuilder_ == null) {
        if (!other.awsNodePools_.isEmpty()) {
          if (awsNodePools_.isEmpty()) {
            awsNodePools_ = other.awsNodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAwsNodePoolsIsMutable();
            awsNodePools_.addAll(other.awsNodePools_);
          }
          onChanged();
        }
      } else {
        if (!other.awsNodePools_.isEmpty()) {
          if (awsNodePoolsBuilder_.isEmpty()) {
            awsNodePoolsBuilder_.dispose();
            awsNodePoolsBuilder_ = null;
            awsNodePools_ = other.awsNodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            awsNodePoolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAwsNodePoolsFieldBuilder() : null;
          } else {
            awsNodePoolsBuilder_.addAllMessages(other.awsNodePools_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              com.google.cloud.gkemulticloud.v1.AwsNodePool m =
                  input.readMessage(
                      com.google.cloud.gkemulticloud.v1.AwsNodePool.parser(),
                      extensionRegistry);
              if (awsNodePoolsBuilder_ == null) {
                ensureAwsNodePoolsIsMutable();
                awsNodePools_.add(m);
              } else {
                awsNodePoolsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool> awsNodePools_ =
      java.util.Collections.emptyList();
    private void ensureAwsNodePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        awsNodePools_ = new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AwsNodePool>(awsNodePools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AwsNodePool, com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder, com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder> awsNodePoolsBuilder_;

    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool> getAwsNodePoolsList() {
      if (awsNodePoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(awsNodePools_);
      } else {
        return awsNodePoolsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public int getAwsNodePoolsCount() {
      if (awsNodePoolsBuilder_ == null) {
        return awsNodePools_.size();
      } else {
        return awsNodePoolsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsNodePool getAwsNodePools(int index) {
      if (awsNodePoolsBuilder_ == null) {
        return awsNodePools_.get(index);
      } else {
        return awsNodePoolsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder setAwsNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AwsNodePool value) {
      if (awsNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.set(index, value);
        onChanged();
      } else {
        awsNodePoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder setAwsNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder builderForValue) {
      if (awsNodePoolsBuilder_ == null) {
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.set(index, builderForValue.build());
        onChanged();
      } else {
        awsNodePoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder addAwsNodePools(com.google.cloud.gkemulticloud.v1.AwsNodePool value) {
      if (awsNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.add(value);
        onChanged();
      } else {
        awsNodePoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder addAwsNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AwsNodePool value) {
      if (awsNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.add(index, value);
        onChanged();
      } else {
        awsNodePoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder addAwsNodePools(
        com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder builderForValue) {
      if (awsNodePoolsBuilder_ == null) {
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.add(builderForValue.build());
        onChanged();
      } else {
        awsNodePoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder addAwsNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder builderForValue) {
      if (awsNodePoolsBuilder_ == null) {
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.add(index, builderForValue.build());
        onChanged();
      } else {
        awsNodePoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder addAllAwsNodePools(
        java.lang.Iterable<? extends com.google.cloud.gkemulticloud.v1.AwsNodePool> values) {
      if (awsNodePoolsBuilder_ == null) {
        ensureAwsNodePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, awsNodePools_);
        onChanged();
      } else {
        awsNodePoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder clearAwsNodePools() {
      if (awsNodePoolsBuilder_ == null) {
        awsNodePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        awsNodePoolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public Builder removeAwsNodePools(int index) {
      if (awsNodePoolsBuilder_ == null) {
        ensureAwsNodePoolsIsMutable();
        awsNodePools_.remove(index);
        onChanged();
      } else {
        awsNodePoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder getAwsNodePoolsBuilder(
        int index) {
      return getAwsNodePoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder getAwsNodePoolsOrBuilder(
        int index) {
      if (awsNodePoolsBuilder_ == null) {
        return awsNodePools_.get(index);  } else {
        return awsNodePoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder> 
         getAwsNodePoolsOrBuilderList() {
      if (awsNodePoolsBuilder_ != null) {
        return awsNodePoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(awsNodePools_);
      }
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder addAwsNodePoolsBuilder() {
      return getAwsNodePoolsFieldBuilder().addBuilder(
          com.google.cloud.gkemulticloud.v1.AwsNodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder addAwsNodePoolsBuilder(
        int index) {
      return getAwsNodePoolsFieldBuilder().addBuilder(
          index, com.google.cloud.gkemulticloud.v1.AwsNodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AwsNodePool][google.cloud.gkemulticloud.v1.AwsNodePool]
     * resources in the specified `AwsCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsNodePool aws_node_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder> 
         getAwsNodePoolsBuilderList() {
      return getAwsNodePoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AwsNodePool, com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder, com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder> 
        getAwsNodePoolsFieldBuilder() {
      if (awsNodePoolsBuilder_ == null) {
        awsNodePoolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AwsNodePool, com.google.cloud.gkemulticloud.v1.AwsNodePool.Builder, com.google.cloud.gkemulticloud.v1.AwsNodePoolOrBuilder>(
                awsNodePools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        awsNodePools_ = null;
      }
      return awsNodePoolsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse)
  private static final com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse();
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAwsNodePoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAwsNodePoolsResponse>() {
    @java.lang.Override
    public ListAwsNodePoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAwsNodePoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAwsNodePoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.ListAwsNodePoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

