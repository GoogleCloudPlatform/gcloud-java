// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Response message for `AwsClusters.ListAwsClusters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAwsClustersResponse}
 */
public final class ListAwsClustersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.ListAwsClustersResponse)
    ListAwsClustersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAwsClustersResponse.newBuilder() to construct.
  private ListAwsClustersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAwsClustersResponse() {
    awsClusters_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAwsClustersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsClustersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsClustersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.class, com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.Builder.class);
  }

  public static final int AWS_CLUSTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster> awsClusters_;
  /**
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
   * in the specified Google Cloud Platform project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster> getAwsClustersList() {
    return awsClusters_;
  }
  /**
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
   * in the specified Google Cloud Platform project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder> 
      getAwsClustersOrBuilderList() {
    return awsClusters_;
  }
  /**
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
   * in the specified Google Cloud Platform project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  @java.lang.Override
  public int getAwsClustersCount() {
    return awsClusters_.size();
  }
  /**
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
   * in the specified Google Cloud Platform project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsCluster getAwsClusters(int index) {
    return awsClusters_.get(index);
  }
  /**
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
   * in the specified Google Cloud Platform project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder getAwsClustersOrBuilder(
      int index) {
    return awsClusters_.get(index);
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
    for (int i = 0; i < awsClusters_.size(); i++) {
      output.writeMessage(1, awsClusters_.get(i));
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
    for (int i = 0; i < awsClusters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, awsClusters_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse other = (com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse) obj;

    if (!getAwsClustersList()
        .equals(other.getAwsClustersList())) return false;
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
    if (getAwsClustersCount() > 0) {
      hash = (37 * hash) + AWS_CLUSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getAwsClustersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse prototype) {
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
   * Response message for `AwsClusters.ListAwsClusters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAwsClustersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.ListAwsClustersResponse)
      com.google.cloud.gkemulticloud.v1.ListAwsClustersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsClustersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsClustersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.class, com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.newBuilder()
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
      if (awsClustersBuilder_ == null) {
        awsClusters_ = java.util.Collections.emptyList();
      } else {
        awsClusters_ = null;
        awsClustersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAwsClustersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse build() {
      com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse buildPartial() {
      com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse result = new com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse result) {
      if (awsClustersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          awsClusters_ = java.util.Collections.unmodifiableList(awsClusters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.awsClusters_ = awsClusters_;
      } else {
        result.awsClusters_ = awsClustersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse result) {
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse other) {
      if (other == com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse.getDefaultInstance()) return this;
      if (awsClustersBuilder_ == null) {
        if (!other.awsClusters_.isEmpty()) {
          if (awsClusters_.isEmpty()) {
            awsClusters_ = other.awsClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAwsClustersIsMutable();
            awsClusters_.addAll(other.awsClusters_);
          }
          onChanged();
        }
      } else {
        if (!other.awsClusters_.isEmpty()) {
          if (awsClustersBuilder_.isEmpty()) {
            awsClustersBuilder_.dispose();
            awsClustersBuilder_ = null;
            awsClusters_ = other.awsClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            awsClustersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAwsClustersFieldBuilder() : null;
          } else {
            awsClustersBuilder_.addAllMessages(other.awsClusters_);
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
              com.google.cloud.gkemulticloud.v1.AwsCluster m =
                  input.readMessage(
                      com.google.cloud.gkemulticloud.v1.AwsCluster.parser(),
                      extensionRegistry);
              if (awsClustersBuilder_ == null) {
                ensureAwsClustersIsMutable();
                awsClusters_.add(m);
              } else {
                awsClustersBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster> awsClusters_ =
      java.util.Collections.emptyList();
    private void ensureAwsClustersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        awsClusters_ = new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AwsCluster>(awsClusters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AwsCluster, com.google.cloud.gkemulticloud.v1.AwsCluster.Builder, com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder> awsClustersBuilder_;

    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster> getAwsClustersList() {
      if (awsClustersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(awsClusters_);
      } else {
        return awsClustersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public int getAwsClustersCount() {
      if (awsClustersBuilder_ == null) {
        return awsClusters_.size();
      } else {
        return awsClustersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsCluster getAwsClusters(int index) {
      if (awsClustersBuilder_ == null) {
        return awsClusters_.get(index);
      } else {
        return awsClustersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder setAwsClusters(
        int index, com.google.cloud.gkemulticloud.v1.AwsCluster value) {
      if (awsClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsClustersIsMutable();
        awsClusters_.set(index, value);
        onChanged();
      } else {
        awsClustersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder setAwsClusters(
        int index, com.google.cloud.gkemulticloud.v1.AwsCluster.Builder builderForValue) {
      if (awsClustersBuilder_ == null) {
        ensureAwsClustersIsMutable();
        awsClusters_.set(index, builderForValue.build());
        onChanged();
      } else {
        awsClustersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder addAwsClusters(com.google.cloud.gkemulticloud.v1.AwsCluster value) {
      if (awsClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsClustersIsMutable();
        awsClusters_.add(value);
        onChanged();
      } else {
        awsClustersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder addAwsClusters(
        int index, com.google.cloud.gkemulticloud.v1.AwsCluster value) {
      if (awsClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAwsClustersIsMutable();
        awsClusters_.add(index, value);
        onChanged();
      } else {
        awsClustersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder addAwsClusters(
        com.google.cloud.gkemulticloud.v1.AwsCluster.Builder builderForValue) {
      if (awsClustersBuilder_ == null) {
        ensureAwsClustersIsMutable();
        awsClusters_.add(builderForValue.build());
        onChanged();
      } else {
        awsClustersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder addAwsClusters(
        int index, com.google.cloud.gkemulticloud.v1.AwsCluster.Builder builderForValue) {
      if (awsClustersBuilder_ == null) {
        ensureAwsClustersIsMutable();
        awsClusters_.add(index, builderForValue.build());
        onChanged();
      } else {
        awsClustersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder addAllAwsClusters(
        java.lang.Iterable<? extends com.google.cloud.gkemulticloud.v1.AwsCluster> values) {
      if (awsClustersBuilder_ == null) {
        ensureAwsClustersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, awsClusters_);
        onChanged();
      } else {
        awsClustersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder clearAwsClusters() {
      if (awsClustersBuilder_ == null) {
        awsClusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        awsClustersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public Builder removeAwsClusters(int index) {
      if (awsClustersBuilder_ == null) {
        ensureAwsClustersIsMutable();
        awsClusters_.remove(index);
        onChanged();
      } else {
        awsClustersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsCluster.Builder getAwsClustersBuilder(
        int index) {
      return getAwsClustersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder getAwsClustersOrBuilder(
        int index) {
      if (awsClustersBuilder_ == null) {
        return awsClusters_.get(index);  } else {
        return awsClustersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder> 
         getAwsClustersOrBuilderList() {
      if (awsClustersBuilder_ != null) {
        return awsClustersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(awsClusters_);
      }
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsCluster.Builder addAwsClustersBuilder() {
      return getAwsClustersFieldBuilder().addBuilder(
          com.google.cloud.gkemulticloud.v1.AwsCluster.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AwsCluster.Builder addAwsClustersBuilder(
        int index) {
      return getAwsClustersFieldBuilder().addBuilder(
          index, com.google.cloud.gkemulticloud.v1.AwsCluster.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources
     * in the specified Google Cloud Platform project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster.Builder> 
         getAwsClustersBuilderList() {
      return getAwsClustersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AwsCluster, com.google.cloud.gkemulticloud.v1.AwsCluster.Builder, com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder> 
        getAwsClustersFieldBuilder() {
      if (awsClustersBuilder_ == null) {
        awsClustersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AwsCluster, com.google.cloud.gkemulticloud.v1.AwsCluster.Builder, com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder>(
                awsClusters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        awsClusters_ = null;
      }
      return awsClustersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.ListAwsClustersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.ListAwsClustersResponse)
  private static final com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse();
  }

  public static com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAwsClustersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAwsClustersResponse>() {
    @java.lang.Override
    public ListAwsClustersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAwsClustersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAwsClustersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.ListAwsClustersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

