// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

/**
 * <pre>
 * CreateBackupRequest creates a backup.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1beta1.CreateBackupRequest}
 */
public final class CreateBackupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1beta1.CreateBackupRequest)
    CreateBackupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBackupRequest.newBuilder() to construct.
  private CreateBackupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBackupRequest() {
    parent_ = "";
    backupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBackupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1beta1_CreateBackupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1beta1_CreateBackupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1beta1.CreateBackupRequest.class, com.google.cloud.filestore.v1beta1.CreateBackupRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The backup's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Filestore,
   * backup locations map to Google Cloud regions, for example **us-west1**.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The backup's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Filestore,
   * backup locations map to Google Cloud regions, for example **us-west1**.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BACKUP_FIELD_NUMBER = 2;
  private com.google.cloud.filestore.v1beta1.Backup backup_;
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the backup field is set.
   */
  @java.lang.Override
  public boolean hasBackup() {
    return backup_ != null;
  }
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The backup.
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.Backup getBackup() {
    return backup_ == null ? com.google.cloud.filestore.v1beta1.Backup.getDefaultInstance() : backup_;
  }
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.BackupOrBuilder getBackupOrBuilder() {
    return backup_ == null ? com.google.cloud.filestore.v1beta1.Backup.getDefaultInstance() : backup_;
  }

  public static final int BACKUP_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object backupId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified project and location.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The backupId.
   */
  @java.lang.Override
  public java.lang.String getBackupId() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified project and location.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for backupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBackupIdBytes() {
    java.lang.Object ref = backupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backupId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (backup_ != null) {
      output.writeMessage(2, getBackup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, backupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (backup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBackup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, backupId_);
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
    if (!(obj instanceof com.google.cloud.filestore.v1beta1.CreateBackupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1beta1.CreateBackupRequest other = (com.google.cloud.filestore.v1beta1.CreateBackupRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasBackup() != other.hasBackup()) return false;
    if (hasBackup()) {
      if (!getBackup()
          .equals(other.getBackup())) return false;
    }
    if (!getBackupId()
        .equals(other.getBackupId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasBackup()) {
      hash = (37 * hash) + BACKUP_FIELD_NUMBER;
      hash = (53 * hash) + getBackup().hashCode();
    }
    hash = (37 * hash) + BACKUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBackupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.filestore.v1beta1.CreateBackupRequest prototype) {
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
   * CreateBackupRequest creates a backup.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1beta1.CreateBackupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1beta1.CreateBackupRequest)
      com.google.cloud.filestore.v1beta1.CreateBackupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1beta1_CreateBackupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1beta1_CreateBackupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1beta1.CreateBackupRequest.class, com.google.cloud.filestore.v1beta1.CreateBackupRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1beta1.CreateBackupRequest.newBuilder()
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
      parent_ = "";
      backup_ = null;
      if (backupBuilder_ != null) {
        backupBuilder_.dispose();
        backupBuilder_ = null;
      }
      backupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1beta1_CreateBackupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateBackupRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1beta1.CreateBackupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateBackupRequest build() {
      com.google.cloud.filestore.v1beta1.CreateBackupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateBackupRequest buildPartial() {
      com.google.cloud.filestore.v1beta1.CreateBackupRequest result = new com.google.cloud.filestore.v1beta1.CreateBackupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1beta1.CreateBackupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.backup_ = backupBuilder_ == null
            ? backup_
            : backupBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.backupId_ = backupId_;
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
      if (other instanceof com.google.cloud.filestore.v1beta1.CreateBackupRequest) {
        return mergeFrom((com.google.cloud.filestore.v1beta1.CreateBackupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1beta1.CreateBackupRequest other) {
      if (other == com.google.cloud.filestore.v1beta1.CreateBackupRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBackup()) {
        mergeBackup(other.getBackup());
      }
      if (!other.getBackupId().isEmpty()) {
        backupId_ = other.backupId_;
        bitField0_ |= 0x00000004;
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBackupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              backupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The backup's project and location, in the format
     * `projects/{project_id}/locations/{location}`. In Filestore,
     * backup locations map to Google Cloud regions, for example **us-west1**.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The backup's project and location, in the format
     * `projects/{project_id}/locations/{location}`. In Filestore,
     * backup locations map to Google Cloud regions, for example **us-west1**.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The backup's project and location, in the format
     * `projects/{project_id}/locations/{location}`. In Filestore,
     * backup locations map to Google Cloud regions, for example **us-west1**.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The backup's project and location, in the format
     * `projects/{project_id}/locations/{location}`. In Filestore,
     * backup locations map to Google Cloud regions, for example **us-west1**.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The backup's project and location, in the format
     * `projects/{project_id}/locations/{location}`. In Filestore,
     * backup locations map to Google Cloud regions, for example **us-west1**.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.filestore.v1beta1.Backup backup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1beta1.Backup, com.google.cloud.filestore.v1beta1.Backup.Builder, com.google.cloud.filestore.v1beta1.BackupOrBuilder> backupBuilder_;
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the backup field is set.
     */
    public boolean hasBackup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The backup.
     */
    public com.google.cloud.filestore.v1beta1.Backup getBackup() {
      if (backupBuilder_ == null) {
        return backup_ == null ? com.google.cloud.filestore.v1beta1.Backup.getDefaultInstance() : backup_;
      } else {
        return backupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBackup(com.google.cloud.filestore.v1beta1.Backup value) {
      if (backupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backup_ = value;
      } else {
        backupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBackup(
        com.google.cloud.filestore.v1beta1.Backup.Builder builderForValue) {
      if (backupBuilder_ == null) {
        backup_ = builderForValue.build();
      } else {
        backupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBackup(com.google.cloud.filestore.v1beta1.Backup value) {
      if (backupBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          backup_ != null &&
          backup_ != com.google.cloud.filestore.v1beta1.Backup.getDefaultInstance()) {
          getBackupBuilder().mergeFrom(value);
        } else {
          backup_ = value;
        }
      } else {
        backupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBackup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      backup_ = null;
      if (backupBuilder_ != null) {
        backupBuilder_.dispose();
        backupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1beta1.Backup.Builder getBackupBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBackupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1beta1.BackupOrBuilder getBackupOrBuilder() {
      if (backupBuilder_ != null) {
        return backupBuilder_.getMessageOrBuilder();
      } else {
        return backup_ == null ?
            com.google.cloud.filestore.v1beta1.Backup.getDefaultInstance() : backup_;
      }
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1beta1.Backup, com.google.cloud.filestore.v1beta1.Backup.Builder, com.google.cloud.filestore.v1beta1.BackupOrBuilder> 
        getBackupFieldBuilder() {
      if (backupBuilder_ == null) {
        backupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1beta1.Backup, com.google.cloud.filestore.v1beta1.Backup.Builder, com.google.cloud.filestore.v1beta1.BackupOrBuilder>(
                getBackup(),
                getParentForChildren(),
                isClean());
        backup_ = null;
      }
      return backupBuilder_;
    }

    private java.lang.Object backupId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the backup.
     * The ID must be unique within the specified project and location.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The backupId.
     */
    public java.lang.String getBackupId() {
      java.lang.Object ref = backupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the backup.
     * The ID must be unique within the specified project and location.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for backupId.
     */
    public com.google.protobuf.ByteString
        getBackupIdBytes() {
      java.lang.Object ref = backupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the backup.
     * The ID must be unique within the specified project and location.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The backupId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      backupId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the backup.
     * The ID must be unique within the specified project and location.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBackupId() {
      backupId_ = getDefaultInstance().getBackupId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the backup.
     * The ID must be unique within the specified project and location.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for backupId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      backupId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1beta1.CreateBackupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1beta1.CreateBackupRequest)
  private static final com.google.cloud.filestore.v1beta1.CreateBackupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1beta1.CreateBackupRequest();
  }

  public static com.google.cloud.filestore.v1beta1.CreateBackupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBackupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBackupRequest>() {
    @java.lang.Override
    public CreateBackupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBackupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBackupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.CreateBackupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

