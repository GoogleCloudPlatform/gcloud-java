// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Response message for
 * [CloudChannelService.CheckCloudIdentityAccountsExist][google.cloud.channel.v1.CloudChannelService.CheckCloudIdentityAccountsExist].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse}
 */
public final class CheckCloudIdentityAccountsExistResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)
    CheckCloudIdentityAccountsExistResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckCloudIdentityAccountsExistResponse.newBuilder() to construct.
  private CheckCloudIdentityAccountsExistResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckCloudIdentityAccountsExistResponse() {
    cloudIdentityAccounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckCloudIdentityAccountsExistResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckCloudIdentityAccountsExistResponse(
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
              cloudIdentityAccounts_ = new java.util.ArrayList<com.google.cloud.channel.v1.CloudIdentityCustomerAccount>();
              mutable_bitField0_ |= 0x00000001;
            }
            cloudIdentityAccounts_.add(
                input.readMessage(com.google.cloud.channel.v1.CloudIdentityCustomerAccount.parser(), extensionRegistry));
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
        cloudIdentityAccounts_ = java.util.Collections.unmodifiableList(cloudIdentityAccounts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_CheckCloudIdentityAccountsExistResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_CheckCloudIdentityAccountsExistResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.class, com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.Builder.class);
  }

  public static final int CLOUD_IDENTITY_ACCOUNTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.channel.v1.CloudIdentityCustomerAccount> cloudIdentityAccounts_;
  /**
   * <pre>
   * The Cloud Identity accounts associated with the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.CloudIdentityCustomerAccount> getCloudIdentityAccountsList() {
    return cloudIdentityAccounts_;
  }
  /**
   * <pre>
   * The Cloud Identity accounts associated with the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder> 
      getCloudIdentityAccountsOrBuilderList() {
    return cloudIdentityAccounts_;
  }
  /**
   * <pre>
   * The Cloud Identity accounts associated with the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
   */
  @java.lang.Override
  public int getCloudIdentityAccountsCount() {
    return cloudIdentityAccounts_.size();
  }
  /**
   * <pre>
   * The Cloud Identity accounts associated with the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CloudIdentityCustomerAccount getCloudIdentityAccounts(int index) {
    return cloudIdentityAccounts_.get(index);
  }
  /**
   * <pre>
   * The Cloud Identity accounts associated with the domain.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder getCloudIdentityAccountsOrBuilder(
      int index) {
    return cloudIdentityAccounts_.get(index);
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
    for (int i = 0; i < cloudIdentityAccounts_.size(); i++) {
      output.writeMessage(1, cloudIdentityAccounts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cloudIdentityAccounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cloudIdentityAccounts_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse other = (com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse) obj;

    if (!getCloudIdentityAccountsList()
        .equals(other.getCloudIdentityAccountsList())) return false;
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
    if (getCloudIdentityAccountsCount() > 0) {
      hash = (37 * hash) + CLOUD_IDENTITY_ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getCloudIdentityAccountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse prototype) {
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
   * [CloudChannelService.CheckCloudIdentityAccountsExist][google.cloud.channel.v1.CloudChannelService.CheckCloudIdentityAccountsExist].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)
      com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_CheckCloudIdentityAccountsExistResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_CheckCloudIdentityAccountsExistResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.class, com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.newBuilder()
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
        getCloudIdentityAccountsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cloudIdentityAccountsBuilder_ == null) {
        cloudIdentityAccounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cloudIdentityAccountsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_CheckCloudIdentityAccountsExistResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse build() {
      com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse buildPartial() {
      com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse result = new com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse(this);
      int from_bitField0_ = bitField0_;
      if (cloudIdentityAccountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cloudIdentityAccounts_ = java.util.Collections.unmodifiableList(cloudIdentityAccounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cloudIdentityAccounts_ = cloudIdentityAccounts_;
      } else {
        result.cloudIdentityAccounts_ = cloudIdentityAccountsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse) {
        return mergeFrom((com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse other) {
      if (other == com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse.getDefaultInstance()) return this;
      if (cloudIdentityAccountsBuilder_ == null) {
        if (!other.cloudIdentityAccounts_.isEmpty()) {
          if (cloudIdentityAccounts_.isEmpty()) {
            cloudIdentityAccounts_ = other.cloudIdentityAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCloudIdentityAccountsIsMutable();
            cloudIdentityAccounts_.addAll(other.cloudIdentityAccounts_);
          }
          onChanged();
        }
      } else {
        if (!other.cloudIdentityAccounts_.isEmpty()) {
          if (cloudIdentityAccountsBuilder_.isEmpty()) {
            cloudIdentityAccountsBuilder_.dispose();
            cloudIdentityAccountsBuilder_ = null;
            cloudIdentityAccounts_ = other.cloudIdentityAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cloudIdentityAccountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCloudIdentityAccountsFieldBuilder() : null;
          } else {
            cloudIdentityAccountsBuilder_.addAllMessages(other.cloudIdentityAccounts_);
          }
        }
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
      com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.channel.v1.CloudIdentityCustomerAccount> cloudIdentityAccounts_ =
      java.util.Collections.emptyList();
    private void ensureCloudIdentityAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cloudIdentityAccounts_ = new java.util.ArrayList<com.google.cloud.channel.v1.CloudIdentityCustomerAccount>(cloudIdentityAccounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.CloudIdentityCustomerAccount, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder, com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder> cloudIdentityAccountsBuilder_;

    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.CloudIdentityCustomerAccount> getCloudIdentityAccountsList() {
      if (cloudIdentityAccountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cloudIdentityAccounts_);
      } else {
        return cloudIdentityAccountsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public int getCloudIdentityAccountsCount() {
      if (cloudIdentityAccountsBuilder_ == null) {
        return cloudIdentityAccounts_.size();
      } else {
        return cloudIdentityAccountsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount getCloudIdentityAccounts(int index) {
      if (cloudIdentityAccountsBuilder_ == null) {
        return cloudIdentityAccounts_.get(index);
      } else {
        return cloudIdentityAccountsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder setCloudIdentityAccounts(
        int index, com.google.cloud.channel.v1.CloudIdentityCustomerAccount value) {
      if (cloudIdentityAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.set(index, value);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder setCloudIdentityAccounts(
        int index, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder builderForValue) {
      if (cloudIdentityAccountsBuilder_ == null) {
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder addCloudIdentityAccounts(com.google.cloud.channel.v1.CloudIdentityCustomerAccount value) {
      if (cloudIdentityAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.add(value);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder addCloudIdentityAccounts(
        int index, com.google.cloud.channel.v1.CloudIdentityCustomerAccount value) {
      if (cloudIdentityAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.add(index, value);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder addCloudIdentityAccounts(
        com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder builderForValue) {
      if (cloudIdentityAccountsBuilder_ == null) {
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.add(builderForValue.build());
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder addCloudIdentityAccounts(
        int index, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder builderForValue) {
      if (cloudIdentityAccountsBuilder_ == null) {
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder addAllCloudIdentityAccounts(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.CloudIdentityCustomerAccount> values) {
      if (cloudIdentityAccountsBuilder_ == null) {
        ensureCloudIdentityAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cloudIdentityAccounts_);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder clearCloudIdentityAccounts() {
      if (cloudIdentityAccountsBuilder_ == null) {
        cloudIdentityAccounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public Builder removeCloudIdentityAccounts(int index) {
      if (cloudIdentityAccountsBuilder_ == null) {
        ensureCloudIdentityAccountsIsMutable();
        cloudIdentityAccounts_.remove(index);
        onChanged();
      } else {
        cloudIdentityAccountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder getCloudIdentityAccountsBuilder(
        int index) {
      return getCloudIdentityAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder getCloudIdentityAccountsOrBuilder(
        int index) {
      if (cloudIdentityAccountsBuilder_ == null) {
        return cloudIdentityAccounts_.get(index);  } else {
        return cloudIdentityAccountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder> 
         getCloudIdentityAccountsOrBuilderList() {
      if (cloudIdentityAccountsBuilder_ != null) {
        return cloudIdentityAccountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cloudIdentityAccounts_);
      }
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder addCloudIdentityAccountsBuilder() {
      return getCloudIdentityAccountsFieldBuilder().addBuilder(
          com.google.cloud.channel.v1.CloudIdentityCustomerAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder addCloudIdentityAccountsBuilder(
        int index) {
      return getCloudIdentityAccountsFieldBuilder().addBuilder(
          index, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * The Cloud Identity accounts associated with the domain.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.CloudIdentityCustomerAccount cloud_identity_accounts = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder> 
         getCloudIdentityAccountsBuilderList() {
      return getCloudIdentityAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.channel.v1.CloudIdentityCustomerAccount, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder, com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder> 
        getCloudIdentityAccountsFieldBuilder() {
      if (cloudIdentityAccountsBuilder_ == null) {
        cloudIdentityAccountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.CloudIdentityCustomerAccount, com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder, com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder>(
                cloudIdentityAccounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cloudIdentityAccounts_ = null;
      }
      return cloudIdentityAccountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse)
  private static final com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse();
  }

  public static com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckCloudIdentityAccountsExistResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckCloudIdentityAccountsExistResponse>() {
    @java.lang.Override
    public CheckCloudIdentityAccountsExistResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckCloudIdentityAccountsExistResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckCloudIdentityAccountsExistResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckCloudIdentityAccountsExistResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CheckCloudIdentityAccountsExistResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

