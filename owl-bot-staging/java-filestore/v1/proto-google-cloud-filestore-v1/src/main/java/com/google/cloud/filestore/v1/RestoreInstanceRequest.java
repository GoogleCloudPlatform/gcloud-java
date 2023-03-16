// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

/**
 * <pre>
 * RestoreInstanceRequest restores an existing instances's file share from a
 * backup.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1.RestoreInstanceRequest}
 */
public final class RestoreInstanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1.RestoreInstanceRequest)
    RestoreInstanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestoreInstanceRequest.newBuilder() to construct.
  private RestoreInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestoreInstanceRequest() {
    name_ = "";
    fileShare_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestoreInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_RestoreInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_RestoreInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1.RestoreInstanceRequest.class, com.google.cloud.filestore.v1.RestoreInstanceRequest.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SOURCE_BACKUP(3),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 3: return SOURCE_BACKUP;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_SHARE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fileShare_ = "";
  /**
   * <pre>
   * Required. Name of the file share in the Cloud Filestore instance that the
   * backup is being restored to.
   * </pre>
   *
   * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fileShare.
   */
  @java.lang.Override
  public java.lang.String getFileShare() {
    java.lang.Object ref = fileShare_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileShare_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of the file share in the Cloud Filestore instance that the
   * backup is being restored to.
   * </pre>
   *
   * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for fileShare.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileShareBytes() {
    java.lang.Object ref = fileShare_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileShare_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_BACKUP_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the sourceBackup field is set.
   */
  public boolean hasSourceBackup() {
    return sourceCase_ == 3;
  }
  /**
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The sourceBackup.
   */
  public java.lang.String getSourceBackup() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 3) {
        source_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for sourceBackup.
   */
  public com.google.protobuf.ByteString
      getSourceBackupBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (sourceCase_ == 3) {
        source_ = b;
      }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileShare_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileShare_);
    }
    if (sourceCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileShare_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileShare_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, source_);
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
    if (!(obj instanceof com.google.cloud.filestore.v1.RestoreInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1.RestoreInstanceRequest other = (com.google.cloud.filestore.v1.RestoreInstanceRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getFileShare()
        .equals(other.getFileShare())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 3:
        if (!getSourceBackup()
            .equals(other.getSourceBackup())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FILE_SHARE_FIELD_NUMBER;
    hash = (53 * hash) + getFileShare().hashCode();
    switch (sourceCase_) {
      case 3:
        hash = (37 * hash) + SOURCE_BACKUP_FIELD_NUMBER;
        hash = (53 * hash) + getSourceBackup().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.RestoreInstanceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.filestore.v1.RestoreInstanceRequest prototype) {
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
   * RestoreInstanceRequest restores an existing instances's file share from a
   * backup.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1.RestoreInstanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1.RestoreInstanceRequest)
      com.google.cloud.filestore.v1.RestoreInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_RestoreInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_RestoreInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1.RestoreInstanceRequest.class, com.google.cloud.filestore.v1.RestoreInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1.RestoreInstanceRequest.newBuilder()
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
      name_ = "";
      fileShare_ = "";
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_RestoreInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.RestoreInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1.RestoreInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.RestoreInstanceRequest build() {
      com.google.cloud.filestore.v1.RestoreInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.RestoreInstanceRequest buildPartial() {
      com.google.cloud.filestore.v1.RestoreInstanceRequest result = new com.google.cloud.filestore.v1.RestoreInstanceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1.RestoreInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileShare_ = fileShare_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.filestore.v1.RestoreInstanceRequest result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
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
      if (other instanceof com.google.cloud.filestore.v1.RestoreInstanceRequest) {
        return mergeFrom((com.google.cloud.filestore.v1.RestoreInstanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1.RestoreInstanceRequest other) {
      if (other == com.google.cloud.filestore.v1.RestoreInstanceRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFileShare().isEmpty()) {
        fileShare_ = other.fileShare_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case SOURCE_BACKUP: {
          sourceCase_ = 3;
          source_ = other.source_;
          onChanged();
          break;
        }
        case SOURCE_NOT_SET: {
          break;
        }
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fileShare_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              sourceCase_ = 3;
              source_ = s;
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
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name of the instance, in the format
     * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the instance, in the format
     * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the instance, in the format
     * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the instance, in the format
     * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the instance, in the format
     * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fileShare_ = "";
    /**
     * <pre>
     * Required. Name of the file share in the Cloud Filestore instance that the
     * backup is being restored to.
     * </pre>
     *
     * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The fileShare.
     */
    public java.lang.String getFileShare() {
      java.lang.Object ref = fileShare_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileShare_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the file share in the Cloud Filestore instance that the
     * backup is being restored to.
     * </pre>
     *
     * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for fileShare.
     */
    public com.google.protobuf.ByteString
        getFileShareBytes() {
      java.lang.Object ref = fileShare_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileShare_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the file share in the Cloud Filestore instance that the
     * backup is being restored to.
     * </pre>
     *
     * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The fileShare to set.
     * @return This builder for chaining.
     */
    public Builder setFileShare(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fileShare_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the file share in the Cloud Filestore instance that the
     * backup is being restored to.
     * </pre>
     *
     * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileShare() {
      fileShare_ = getDefaultInstance().getFileShare();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the file share in the Cloud Filestore instance that the
     * backup is being restored to.
     * </pre>
     *
     * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for fileShare to set.
     * @return This builder for chaining.
     */
    public Builder setFileShareBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fileShare_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return Whether the sourceBackup field is set.
     */
    @java.lang.Override
    public boolean hasSourceBackup() {
      return sourceCase_ == 3;
    }
    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The sourceBackup.
     */
    @java.lang.Override
    public java.lang.String getSourceBackup() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 3) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for sourceBackup.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSourceBackupBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (sourceCase_ == 3) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The sourceBackup to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBackup(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceBackup() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The resource name of the backup, in the format
     * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
     * </pre>
     *
     * <code>string source_backup = 3 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for sourceBackup to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBackupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sourceCase_ = 3;
      source_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1.RestoreInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1.RestoreInstanceRequest)
  private static final com.google.cloud.filestore.v1.RestoreInstanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1.RestoreInstanceRequest();
  }

  public static com.google.cloud.filestore.v1.RestoreInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreInstanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<RestoreInstanceRequest>() {
    @java.lang.Override
    public RestoreInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RestoreInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1.RestoreInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

