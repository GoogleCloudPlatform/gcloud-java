// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/inventory/v1/key_tracking_service.proto

package com.google.cloud.kms.inventory.v1;

/**
 * <pre>
 * Response message for
 * [KeyTrackingService.SearchProtectedResources][google.cloud.kms.inventory.v1.KeyTrackingService.SearchProtectedResources].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse}
 */
public final class SearchProtectedResourcesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)
    SearchProtectedResourcesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchProtectedResourcesResponse.newBuilder() to construct.
  private SearchProtectedResourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchProtectedResourcesResponse() {
    protectedResources_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchProtectedResourcesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.inventory.v1.KeyTrackingServiceProto.internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.inventory.v1.KeyTrackingServiceProto.internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.class, com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.Builder.class);
  }

  public static final int PROTECTED_RESOURCES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.kms.inventory.v1.ProtectedResource> protectedResources_;
  /**
   * <pre>
   * Protected resources for this page.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.kms.inventory.v1.ProtectedResource> getProtectedResourcesList() {
    return protectedResources_;
  }
  /**
   * <pre>
   * Protected resources for this page.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder> 
      getProtectedResourcesOrBuilderList() {
    return protectedResources_;
  }
  /**
   * <pre>
   * Protected resources for this page.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
   */
  @java.lang.Override
  public int getProtectedResourcesCount() {
    return protectedResources_.size();
  }
  /**
   * <pre>
   * Protected resources for this page.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.inventory.v1.ProtectedResource getProtectedResources(int index) {
    return protectedResources_.get(index);
  }
  /**
   * <pre>
   * Protected resources for this page.
   * </pre>
   *
   * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder getProtectedResourcesOrBuilder(
      int index) {
    return protectedResources_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < protectedResources_.size(); i++) {
      output.writeMessage(1, protectedResources_.get(i));
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
    for (int i = 0; i < protectedResources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, protectedResources_.get(i));
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
    if (!(obj instanceof com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse other = (com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse) obj;

    if (!getProtectedResourcesList()
        .equals(other.getProtectedResourcesList())) return false;
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
    if (getProtectedResourcesCount() > 0) {
      hash = (37 * hash) + PROTECTED_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getProtectedResourcesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse prototype) {
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
   * Response message for
   * [KeyTrackingService.SearchProtectedResources][google.cloud.kms.inventory.v1.KeyTrackingService.SearchProtectedResources].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)
      com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.inventory.v1.KeyTrackingServiceProto.internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.inventory.v1.KeyTrackingServiceProto.internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.class, com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.newBuilder()
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
      if (protectedResourcesBuilder_ == null) {
        protectedResources_ = java.util.Collections.emptyList();
      } else {
        protectedResources_ = null;
        protectedResourcesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.inventory.v1.KeyTrackingServiceProto.internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse build() {
      com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse buildPartial() {
      com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse result = new com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse result) {
      if (protectedResourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          protectedResources_ = java.util.Collections.unmodifiableList(protectedResources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.protectedResources_ = protectedResources_;
      } else {
        result.protectedResources_ = protectedResourcesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse result) {
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
      if (other instanceof com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse) {
        return mergeFrom((com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse other) {
      if (other == com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse.getDefaultInstance()) return this;
      if (protectedResourcesBuilder_ == null) {
        if (!other.protectedResources_.isEmpty()) {
          if (protectedResources_.isEmpty()) {
            protectedResources_ = other.protectedResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProtectedResourcesIsMutable();
            protectedResources_.addAll(other.protectedResources_);
          }
          onChanged();
        }
      } else {
        if (!other.protectedResources_.isEmpty()) {
          if (protectedResourcesBuilder_.isEmpty()) {
            protectedResourcesBuilder_.dispose();
            protectedResourcesBuilder_ = null;
            protectedResources_ = other.protectedResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            protectedResourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProtectedResourcesFieldBuilder() : null;
          } else {
            protectedResourcesBuilder_.addAllMessages(other.protectedResources_);
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
              com.google.cloud.kms.inventory.v1.ProtectedResource m =
                  input.readMessage(
                      com.google.cloud.kms.inventory.v1.ProtectedResource.parser(),
                      extensionRegistry);
              if (protectedResourcesBuilder_ == null) {
                ensureProtectedResourcesIsMutable();
                protectedResources_.add(m);
              } else {
                protectedResourcesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.kms.inventory.v1.ProtectedResource> protectedResources_ =
      java.util.Collections.emptyList();
    private void ensureProtectedResourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        protectedResources_ = new java.util.ArrayList<com.google.cloud.kms.inventory.v1.ProtectedResource>(protectedResources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.inventory.v1.ProtectedResource, com.google.cloud.kms.inventory.v1.ProtectedResource.Builder, com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder> protectedResourcesBuilder_;

    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.inventory.v1.ProtectedResource> getProtectedResourcesList() {
      if (protectedResourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(protectedResources_);
      } else {
        return protectedResourcesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public int getProtectedResourcesCount() {
      if (protectedResourcesBuilder_ == null) {
        return protectedResources_.size();
      } else {
        return protectedResourcesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public com.google.cloud.kms.inventory.v1.ProtectedResource getProtectedResources(int index) {
      if (protectedResourcesBuilder_ == null) {
        return protectedResources_.get(index);
      } else {
        return protectedResourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder setProtectedResources(
        int index, com.google.cloud.kms.inventory.v1.ProtectedResource value) {
      if (protectedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProtectedResourcesIsMutable();
        protectedResources_.set(index, value);
        onChanged();
      } else {
        protectedResourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder setProtectedResources(
        int index, com.google.cloud.kms.inventory.v1.ProtectedResource.Builder builderForValue) {
      if (protectedResourcesBuilder_ == null) {
        ensureProtectedResourcesIsMutable();
        protectedResources_.set(index, builderForValue.build());
        onChanged();
      } else {
        protectedResourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder addProtectedResources(com.google.cloud.kms.inventory.v1.ProtectedResource value) {
      if (protectedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProtectedResourcesIsMutable();
        protectedResources_.add(value);
        onChanged();
      } else {
        protectedResourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder addProtectedResources(
        int index, com.google.cloud.kms.inventory.v1.ProtectedResource value) {
      if (protectedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProtectedResourcesIsMutable();
        protectedResources_.add(index, value);
        onChanged();
      } else {
        protectedResourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder addProtectedResources(
        com.google.cloud.kms.inventory.v1.ProtectedResource.Builder builderForValue) {
      if (protectedResourcesBuilder_ == null) {
        ensureProtectedResourcesIsMutable();
        protectedResources_.add(builderForValue.build());
        onChanged();
      } else {
        protectedResourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder addProtectedResources(
        int index, com.google.cloud.kms.inventory.v1.ProtectedResource.Builder builderForValue) {
      if (protectedResourcesBuilder_ == null) {
        ensureProtectedResourcesIsMutable();
        protectedResources_.add(index, builderForValue.build());
        onChanged();
      } else {
        protectedResourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder addAllProtectedResources(
        java.lang.Iterable<? extends com.google.cloud.kms.inventory.v1.ProtectedResource> values) {
      if (protectedResourcesBuilder_ == null) {
        ensureProtectedResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, protectedResources_);
        onChanged();
      } else {
        protectedResourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder clearProtectedResources() {
      if (protectedResourcesBuilder_ == null) {
        protectedResources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        protectedResourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public Builder removeProtectedResources(int index) {
      if (protectedResourcesBuilder_ == null) {
        ensureProtectedResourcesIsMutable();
        protectedResources_.remove(index);
        onChanged();
      } else {
        protectedResourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public com.google.cloud.kms.inventory.v1.ProtectedResource.Builder getProtectedResourcesBuilder(
        int index) {
      return getProtectedResourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder getProtectedResourcesOrBuilder(
        int index) {
      if (protectedResourcesBuilder_ == null) {
        return protectedResources_.get(index);  } else {
        return protectedResourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder> 
         getProtectedResourcesOrBuilderList() {
      if (protectedResourcesBuilder_ != null) {
        return protectedResourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(protectedResources_);
      }
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public com.google.cloud.kms.inventory.v1.ProtectedResource.Builder addProtectedResourcesBuilder() {
      return getProtectedResourcesFieldBuilder().addBuilder(
          com.google.cloud.kms.inventory.v1.ProtectedResource.getDefaultInstance());
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public com.google.cloud.kms.inventory.v1.ProtectedResource.Builder addProtectedResourcesBuilder(
        int index) {
      return getProtectedResourcesFieldBuilder().addBuilder(
          index, com.google.cloud.kms.inventory.v1.ProtectedResource.getDefaultInstance());
    }
    /**
     * <pre>
     * Protected resources for this page.
     * </pre>
     *
     * <code>repeated .google.cloud.kms.inventory.v1.ProtectedResource protected_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.kms.inventory.v1.ProtectedResource.Builder> 
         getProtectedResourcesBuilderList() {
      return getProtectedResourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.kms.inventory.v1.ProtectedResource, com.google.cloud.kms.inventory.v1.ProtectedResource.Builder, com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder> 
        getProtectedResourcesFieldBuilder() {
      if (protectedResourcesBuilder_ == null) {
        protectedResourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.kms.inventory.v1.ProtectedResource, com.google.cloud.kms.inventory.v1.ProtectedResource.Builder, com.google.cloud.kms.inventory.v1.ProtectedResourceOrBuilder>(
                protectedResources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        protectedResources_ = null;
      }
      return protectedResourcesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse)
  private static final com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse();
  }

  public static com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchProtectedResourcesResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchProtectedResourcesResponse>() {
    @java.lang.Override
    public SearchProtectedResourcesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchProtectedResourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchProtectedResourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.inventory.v1.SearchProtectedResourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

