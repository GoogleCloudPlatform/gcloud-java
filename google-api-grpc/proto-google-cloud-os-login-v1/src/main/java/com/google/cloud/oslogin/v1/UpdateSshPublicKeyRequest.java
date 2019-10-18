// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

/**
 *
 *
 * <pre>
 * A request message for updating an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1.UpdateSshPublicKeyRequest}
 */
public final class UpdateSshPublicKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
    UpdateSshPublicKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSshPublicKeyRequest.newBuilder() to construct.
  private UpdateSshPublicKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSshPublicKeyRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateSshPublicKeyRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder subBuilder = null;
              if (sshPublicKey_ != null) {
                subBuilder = sshPublicKey_.toBuilder();
              }
              sshPublicKey_ =
                  input.readMessage(
                      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sshPublicKey_);
                sshPublicKey_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.class,
            com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are identified by
   * their SHA-256 fingerprint. The fingerprint of the public key is in format
   * `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are identified by
   * their SHA-256 fingerprint. The fingerprint of the public key is in format
   * `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSH_PUBLIC_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasSshPublicKey() {
    return sshPublicKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
    return sshPublicKey_ == null
        ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
        : sshPublicKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder
      getSshPublicKeyOrBuilder() {
    return getSshPublicKey();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (sshPublicKey_ != null) {
      output.writeMessage(2, getSshPublicKey());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (sshPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSshPublicKey());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest other =
        (com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasSshPublicKey() != other.hasSshPublicKey()) return false;
    if (hasSshPublicKey()) {
      if (!getSshPublicKey().equals(other.getSshPublicKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSshPublicKey()) {
      hash = (37 * hash) + SSH_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getSshPublicKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
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
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest prototype) {
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
   * A request message for updating an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1.UpdateSshPublicKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.class,
              com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.newBuilder()
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
      name_ = "";

      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = null;
      } else {
        sshPublicKey_ = null;
        sshPublicKeyBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest build() {
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest buildPartial() {
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest result =
          new com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest(this);
      result.name_ = name_;
      if (sshPublicKeyBuilder_ == null) {
        result.sshPublicKey_ = sshPublicKey_;
      } else {
        result.sshPublicKey_ = sshPublicKeyBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) {
        return mergeFrom((com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest other) {
      if (other == com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasSshPublicKey()) {
        mergeSshPublicKey(other.getSshPublicKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are identified by
     * their SHA-256 fingerprint. The fingerprint of the public key is in format
     * `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>
        sshPublicKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasSshPublicKey() {
      return sshPublicKeyBuilder_ != null || sshPublicKey_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        return sshPublicKey_ == null
            ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
            : sshPublicKey_;
      } else {
        return sshPublicKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sshPublicKey_ = value;
        onChanged();
      } else {
        sshPublicKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder builderForValue) {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = builderForValue.build();
        onChanged();
      } else {
        sshPublicKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (sshPublicKey_ != null) {
          sshPublicKey_ =
              com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.newBuilder(sshPublicKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sshPublicKey_ = value;
        }
        onChanged();
      } else {
        sshPublicKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = null;
        onChanged();
      } else {
        sshPublicKey_ = null;
        sshPublicKeyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder
        getSshPublicKeyBuilder() {

      onChanged();
      return getSshPublicKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder
        getSshPublicKeyOrBuilder() {
      if (sshPublicKeyBuilder_ != null) {
        return sshPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return sshPublicKey_ == null
            ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
            : sshPublicKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>
        getSshPublicKeyFieldBuilder() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>(
                getSshPublicKey(), getParentForChildren(), isClean());
        sshPublicKey_ = null;
      }
      return sshPublicKeyBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
  private static final com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest();
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSshPublicKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSshPublicKeyRequest>() {
        @java.lang.Override
        public UpdateSshPublicKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateSshPublicKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateSshPublicKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSshPublicKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
