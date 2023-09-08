// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 * <pre>
 * State for Binauthz
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.BinauthzState}
 */
public final class BinauthzState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)
    BinauthzStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BinauthzState.newBuilder() to construct.
  private BinauthzState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BinauthzState() {
    webhook_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BinauthzState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.class, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.Builder.class);
  }

  public static final int WEBHOOK_FIELD_NUMBER = 1;
  private int webhook_ = 0;
  /**
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
   * @return The enum numeric value on the wire for webhook.
   */
  @java.lang.Override public int getWebhookValue() {
    return webhook_;
  }
  /**
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
   * @return The webhook.
   */
  @java.lang.Override public com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getWebhook() {
    com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState result = com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.forNumber(webhook_);
    return result == null ? com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.UNRECOGNIZED : result;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version_;
  /**
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion getVersion() {
    return version_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance() : version_;
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
    if (webhook_ != com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, webhook_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webhook_ != com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, webhook_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVersion());
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState other = (com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState) obj;

    if (webhook_ != other.webhook_) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
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
    hash = (37 * hash) + WEBHOOK_FIELD_NUMBER;
    hash = (53 * hash) + webhook_;
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState prototype) {
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
   * State for Binauthz
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.BinauthzState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.class, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.newBuilder()
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
      webhook_ = 0;
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState result = new com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webhook_ = webhook_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState.getDefaultInstance()) return this;
      if (other.webhook_ != 0) {
        setWebhookValue(other.getWebhookValue());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
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
            case 8: {
              webhook_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getVersionFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private int webhook_ = 0;
    /**
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
     * @return The enum numeric value on the wire for webhook.
     */
    @java.lang.Override public int getWebhookValue() {
      return webhook_;
    }
    /**
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
     * @param value The enum numeric value on the wire for webhook to set.
     * @return This builder for chaining.
     */
    public Builder setWebhookValue(int value) {
      webhook_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
     * @return The webhook.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getWebhook() {
      com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState result = com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.forNumber(webhook_);
      return result == null ? com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
     * @param value The webhook to set.
     * @return This builder for chaining.
     */
    public Builder setWebhook(com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      webhook_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWebhook() {
      bitField0_ = (bitField0_ & ~0x00000001);
      webhook_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public Builder setVersion(com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public Builder mergeVersion(com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          version_ != null &&
          version_ != com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder getVersionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinauthzState>
      PARSER = new com.google.protobuf.AbstractParser<BinauthzState>() {
    @java.lang.Override
    public BinauthzState parsePartialFrom(
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

  public static com.google.protobuf.Parser<BinauthzState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinauthzState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

