// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * Configures Merchant Center linking.
 * Links contained in the config will be used to sync data from a Merchant
 * Center account to a Cloud Retail branch.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.MerchantCenterLinkingConfig}
 */
public final class MerchantCenterLinkingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.MerchantCenterLinkingConfig)
    MerchantCenterLinkingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MerchantCenterLinkingConfig.newBuilder() to construct.
  private MerchantCenterLinkingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MerchantCenterLinkingConfig() {
    links_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MerchantCenterLinkingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MerchantCenterLinkingConfig(
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
              links_ = new java.util.ArrayList<com.google.cloud.retail.v2beta.MerchantCenterLink>();
              mutable_bitField0_ |= 0x00000001;
            }
            links_.add(
                input.readMessage(com.google.cloud.retail.v2beta.MerchantCenterLink.parser(), extensionRegistry));
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
        links_ = java.util.Collections.unmodifiableList(links_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2beta.CatalogProto.internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.CatalogProto.internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.class, com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.Builder.class);
  }

  public static final int LINKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink> links_;
  /**
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink> getLinksList() {
    return links_;
  }
  /**
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder> 
      getLinksOrBuilderList() {
    return links_;
  }
  /**
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  @java.lang.Override
  public int getLinksCount() {
    return links_.size();
  }
  /**
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.MerchantCenterLink getLinks(int index) {
    return links_.get(index);
  }
  /**
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder getLinksOrBuilder(
      int index) {
    return links_.get(index);
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
    for (int i = 0; i < links_.size(); i++) {
      output.writeMessage(1, links_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < links_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, links_.get(i));
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig other = (com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig) obj;

    if (!getLinksList()
        .equals(other.getLinksList())) return false;
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
    if (getLinksCount() > 0) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig prototype) {
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
   * Configures Merchant Center linking.
   * Links contained in the config will be used to sync data from a Merchant
   * Center account to a Cloud Retail branch.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.MerchantCenterLinkingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.MerchantCenterLinkingConfig)
      com.google.cloud.retail.v2beta.MerchantCenterLinkingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.CatalogProto.internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.CatalogProto.internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.class, com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.newBuilder()
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
        getLinksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        linksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.CatalogProto.internal_static_google_cloud_retail_v2beta_MerchantCenterLinkingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig build() {
      com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig buildPartial() {
      com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig result = new com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig(this);
      int from_bitField0_ = bitField0_;
      if (linksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          links_ = java.util.Collections.unmodifiableList(links_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
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
      if (other instanceof com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig) {
        return mergeFrom((com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig other) {
      if (other == com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig.getDefaultInstance()) return this;
      if (linksBuilder_ == null) {
        if (!other.links_.isEmpty()) {
          if (links_.isEmpty()) {
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinksIsMutable();
            links_.addAll(other.links_);
          }
          onChanged();
        }
      } else {
        if (!other.links_.isEmpty()) {
          if (linksBuilder_.isEmpty()) {
            linksBuilder_.dispose();
            linksBuilder_ = null;
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLinksFieldBuilder() : null;
          } else {
            linksBuilder_.addAllMessages(other.links_);
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
      com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink> links_ =
      java.util.Collections.emptyList();
    private void ensureLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        links_ = new java.util.ArrayList<com.google.cloud.retail.v2beta.MerchantCenterLink>(links_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2beta.MerchantCenterLink, com.google.cloud.retail.v2beta.MerchantCenterLink.Builder, com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder> linksBuilder_;

    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink> getLinksList() {
      if (linksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(links_);
      } else {
        return linksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public int getLinksCount() {
      if (linksBuilder_ == null) {
        return links_.size();
      } else {
        return linksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public com.google.cloud.retail.v2beta.MerchantCenterLink getLinks(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder setLinks(
        int index, com.google.cloud.retail.v2beta.MerchantCenterLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.set(index, value);
        onChanged();
      } else {
        linksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder setLinks(
        int index, com.google.cloud.retail.v2beta.MerchantCenterLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.set(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder addLinks(com.google.cloud.retail.v2beta.MerchantCenterLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(value);
        onChanged();
      } else {
        linksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder addLinks(
        int index, com.google.cloud.retail.v2beta.MerchantCenterLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(index, value);
        onChanged();
      } else {
        linksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder addLinks(
        com.google.cloud.retail.v2beta.MerchantCenterLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder addLinks(
        int index, com.google.cloud.retail.v2beta.MerchantCenterLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder addAllLinks(
        java.lang.Iterable<? extends com.google.cloud.retail.v2beta.MerchantCenterLink> values) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, links_);
        onChanged();
      } else {
        linksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public Builder removeLinks(int index) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.remove(index);
        onChanged();
      } else {
        linksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public com.google.cloud.retail.v2beta.MerchantCenterLink.Builder getLinksBuilder(
        int index) {
      return getLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder getLinksOrBuilder(
        int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);  } else {
        return linksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder> 
         getLinksOrBuilderList() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(links_);
      }
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public com.google.cloud.retail.v2beta.MerchantCenterLink.Builder addLinksBuilder() {
      return getLinksFieldBuilder().addBuilder(
          com.google.cloud.retail.v2beta.MerchantCenterLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public com.google.cloud.retail.v2beta.MerchantCenterLink.Builder addLinksBuilder(
        int index) {
      return getLinksFieldBuilder().addBuilder(
          index, com.google.cloud.retail.v2beta.MerchantCenterLink.getDefaultInstance());
    }
    /**
     * <pre>
     * Links between Merchant Center accounts and branches.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink.Builder> 
         getLinksBuilderList() {
      return getLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.retail.v2beta.MerchantCenterLink, com.google.cloud.retail.v2beta.MerchantCenterLink.Builder, com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder> 
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2beta.MerchantCenterLink, com.google.cloud.retail.v2beta.MerchantCenterLink.Builder, com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder>(
                links_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        links_ = null;
      }
      return linksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.MerchantCenterLinkingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.MerchantCenterLinkingConfig)
  private static final com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig();
  }

  public static com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MerchantCenterLinkingConfig>
      PARSER = new com.google.protobuf.AbstractParser<MerchantCenterLinkingConfig>() {
    @java.lang.Override
    public MerchantCenterLinkingConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MerchantCenterLinkingConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MerchantCenterLinkingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MerchantCenterLinkingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.MerchantCenterLinkingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

