// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

/**
 * <pre>
 * UpdateBackupRequest updates description and/or labels for a backup.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1.UpdateBackupRequest}
 */
public final class UpdateBackupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1.UpdateBackupRequest)
    UpdateBackupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBackupRequest.newBuilder() to construct.
  private UpdateBackupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBackupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBackupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_UpdateBackupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_UpdateBackupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1.UpdateBackupRequest.class, com.google.cloud.filestore.v1.UpdateBackupRequest.Builder.class);
  }

  public static final int BACKUP_FIELD_NUMBER = 1;
  private com.google.cloud.filestore.v1.Backup backup_;
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the backup field is set.
   */
  @java.lang.Override
  public boolean hasBackup() {
    return backup_ != null;
  }
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The backup.
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1.Backup getBackup() {
    return backup_ == null ? com.google.cloud.filestore.v1.Backup.getDefaultInstance() : backup_;
  }
  /**
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1.Backup]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1.BackupOrBuilder getBackupOrBuilder() {
    return backup_ == null ? com.google.cloud.filestore.v1.Backup.getDefaultInstance() : backup_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (backup_ != null) {
      output.writeMessage(1, getBackup());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (backup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBackup());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.filestore.v1.UpdateBackupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1.UpdateBackupRequest other = (com.google.cloud.filestore.v1.UpdateBackupRequest) obj;

    if (hasBackup() != other.hasBackup()) return false;
    if (hasBackup()) {
      if (!getBackup()
          .equals(other.getBackup())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasBackup()) {
      hash = (37 * hash) + BACKUP_FIELD_NUMBER;
      hash = (53 * hash) + getBackup().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.UpdateBackupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.filestore.v1.UpdateBackupRequest prototype) {
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
   * UpdateBackupRequest updates description and/or labels for a backup.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1.UpdateBackupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1.UpdateBackupRequest)
      com.google.cloud.filestore.v1.UpdateBackupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_UpdateBackupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_UpdateBackupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1.UpdateBackupRequest.class, com.google.cloud.filestore.v1.UpdateBackupRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1.UpdateBackupRequest.newBuilder()
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
      backup_ = null;
      if (backupBuilder_ != null) {
        backupBuilder_.dispose();
        backupBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_UpdateBackupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.UpdateBackupRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1.UpdateBackupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.UpdateBackupRequest build() {
      com.google.cloud.filestore.v1.UpdateBackupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.UpdateBackupRequest buildPartial() {
      com.google.cloud.filestore.v1.UpdateBackupRequest result = new com.google.cloud.filestore.v1.UpdateBackupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1.UpdateBackupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backup_ = backupBuilder_ == null
            ? backup_
            : backupBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.filestore.v1.UpdateBackupRequest) {
        return mergeFrom((com.google.cloud.filestore.v1.UpdateBackupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1.UpdateBackupRequest other) {
      if (other == com.google.cloud.filestore.v1.UpdateBackupRequest.getDefaultInstance()) return this;
      if (other.hasBackup()) {
        mergeBackup(other.getBackup());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getBackupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.filestore.v1.Backup backup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1.Backup, com.google.cloud.filestore.v1.Backup.Builder, com.google.cloud.filestore.v1.BackupOrBuilder> backupBuilder_;
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the backup field is set.
     */
    public boolean hasBackup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The backup.
     */
    public com.google.cloud.filestore.v1.Backup getBackup() {
      if (backupBuilder_ == null) {
        return backup_ == null ? com.google.cloud.filestore.v1.Backup.getDefaultInstance() : backup_;
      } else {
        return backupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBackup(com.google.cloud.filestore.v1.Backup value) {
      if (backupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backup_ = value;
      } else {
        backupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBackup(
        com.google.cloud.filestore.v1.Backup.Builder builderForValue) {
      if (backupBuilder_ == null) {
        backup_ = builderForValue.build();
      } else {
        backupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBackup(com.google.cloud.filestore.v1.Backup value) {
      if (backupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          backup_ != null &&
          backup_ != com.google.cloud.filestore.v1.Backup.getDefaultInstance()) {
          getBackupBuilder().mergeFrom(value);
        } else {
          backup_ = value;
        }
      } else {
        backupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBackup() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1.Backup.Builder getBackupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBackupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1.BackupOrBuilder getBackupOrBuilder() {
      if (backupBuilder_ != null) {
        return backupBuilder_.getMessageOrBuilder();
      } else {
        return backup_ == null ?
            com.google.cloud.filestore.v1.Backup.getDefaultInstance() : backup_;
      }
    }
    /**
     * <pre>
     * Required. A [backup resource][google.cloud.filestore.v1.Backup]
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Backup backup = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1.Backup, com.google.cloud.filestore.v1.Backup.Builder, com.google.cloud.filestore.v1.BackupOrBuilder> 
        getBackupFieldBuilder() {
      if (backupBuilder_ == null) {
        backupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1.Backup, com.google.cloud.filestore.v1.Backup.Builder, com.google.cloud.filestore.v1.BackupOrBuilder>(
                getBackup(),
                getParentForChildren(),
                isClean());
        backup_ = null;
      }
      return backupBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1.UpdateBackupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1.UpdateBackupRequest)
  private static final com.google.cloud.filestore.v1.UpdateBackupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1.UpdateBackupRequest();
  }

  public static com.google.cloud.filestore.v1.UpdateBackupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBackupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBackupRequest>() {
    @java.lang.Override
    public UpdateBackupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBackupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBackupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1.UpdateBackupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

