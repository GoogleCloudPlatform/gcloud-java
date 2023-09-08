// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

/**
 * <pre>
 * CreateSnapshotRequest creates a snapshot.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1.CreateSnapshotRequest}
 */
public final class CreateSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1.CreateSnapshotRequest)
    CreateSnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSnapshotRequest.newBuilder() to construct.
  private CreateSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSnapshotRequest() {
    parent_ = "";
    snapshotId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSnapshotRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_CreateSnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_CreateSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1.CreateSnapshotRequest.class, com.google.cloud.filestore.v1.CreateSnapshotRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The Filestore Instance to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
   * Required. The Filestore Instance to create the snapshots of, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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

  public static final int SNAPSHOT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object snapshotId_ = "";
  /**
   * <pre>
   * Required. The ID to use for the snapshot.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshotId.
   */
  @java.lang.Override
  public java.lang.String getSnapshotId() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the snapshot.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for snapshotId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapshotIdBytes() {
    java.lang.Object ref = snapshotId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshotId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 3;
  private com.google.cloud.filestore.v1.Snapshot snapshot_;
  /**
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the snapshot field is set.
   */
  @java.lang.Override
  public boolean hasSnapshot() {
    return snapshot_ != null;
  }
  /**
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshot.
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1.Snapshot getSnapshot() {
    return snapshot_ == null ? com.google.cloud.filestore.v1.Snapshot.getDefaultInstance() : snapshot_;
  }
  /**
   * <pre>
   * Required. A snapshot resource.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1.SnapshotOrBuilder getSnapshotOrBuilder() {
    return snapshot_ == null ? com.google.cloud.filestore.v1.Snapshot.getDefaultInstance() : snapshot_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, snapshotId_);
    }
    if (snapshot_ != null) {
      output.writeMessage(3, getSnapshot());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, snapshotId_);
    }
    if (snapshot_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSnapshot());
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
    if (!(obj instanceof com.google.cloud.filestore.v1.CreateSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1.CreateSnapshotRequest other = (com.google.cloud.filestore.v1.CreateSnapshotRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getSnapshotId()
        .equals(other.getSnapshotId())) return false;
    if (hasSnapshot() != other.hasSnapshot()) return false;
    if (hasSnapshot()) {
      if (!getSnapshot()
          .equals(other.getSnapshot())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + SNAPSHOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotId().hashCode();
    if (hasSnapshot()) {
      hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshot().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.filestore.v1.CreateSnapshotRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.filestore.v1.CreateSnapshotRequest prototype) {
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
   * CreateSnapshotRequest creates a snapshot.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1.CreateSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1.CreateSnapshotRequest)
      com.google.cloud.filestore.v1.CreateSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_CreateSnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_CreateSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1.CreateSnapshotRequest.class, com.google.cloud.filestore.v1.CreateSnapshotRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1.CreateSnapshotRequest.newBuilder()
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
      snapshotId_ = "";
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.filestore.v1.CloudFilestoreServiceProto.internal_static_google_cloud_filestore_v1_CreateSnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.CreateSnapshotRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1.CreateSnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.CreateSnapshotRequest build() {
      com.google.cloud.filestore.v1.CreateSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1.CreateSnapshotRequest buildPartial() {
      com.google.cloud.filestore.v1.CreateSnapshotRequest result = new com.google.cloud.filestore.v1.CreateSnapshotRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1.CreateSnapshotRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapshotId_ = snapshotId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.snapshot_ = snapshotBuilder_ == null
            ? snapshot_
            : snapshotBuilder_.build();
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
      if (other instanceof com.google.cloud.filestore.v1.CreateSnapshotRequest) {
        return mergeFrom((com.google.cloud.filestore.v1.CreateSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1.CreateSnapshotRequest other) {
      if (other == com.google.cloud.filestore.v1.CreateSnapshotRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSnapshotId().isEmpty()) {
        snapshotId_ = other.snapshotId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSnapshot()) {
        mergeSnapshot(other.getSnapshot());
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
              snapshotId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSnapshotFieldBuilder().getBuilder(),
                  extensionRegistry);
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
     * Required. The Filestore Instance to create the snapshots of, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the snapshots of, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the snapshots of, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the snapshots of, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the snapshots of, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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

    private java.lang.Object snapshotId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the snapshot.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The snapshotId.
     */
    public java.lang.String getSnapshotId() {
      java.lang.Object ref = snapshotId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the snapshot.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for snapshotId.
     */
    public com.google.protobuf.ByteString
        getSnapshotIdBytes() {
      java.lang.Object ref = snapshotId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshotId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the snapshot.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The snapshotId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      snapshotId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the snapshot.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapshotId() {
      snapshotId_ = getDefaultInstance().getSnapshotId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the snapshot.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string snapshot_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for snapshotId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      snapshotId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.filestore.v1.Snapshot snapshot_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1.Snapshot, com.google.cloud.filestore.v1.Snapshot.Builder, com.google.cloud.filestore.v1.SnapshotOrBuilder> snapshotBuilder_;
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the snapshot field is set.
     */
    public boolean hasSnapshot() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The snapshot.
     */
    public com.google.cloud.filestore.v1.Snapshot getSnapshot() {
      if (snapshotBuilder_ == null) {
        return snapshot_ == null ? com.google.cloud.filestore.v1.Snapshot.getDefaultInstance() : snapshot_;
      } else {
        return snapshotBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSnapshot(com.google.cloud.filestore.v1.Snapshot value) {
      if (snapshotBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshot_ = value;
      } else {
        snapshotBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSnapshot(
        com.google.cloud.filestore.v1.Snapshot.Builder builderForValue) {
      if (snapshotBuilder_ == null) {
        snapshot_ = builderForValue.build();
      } else {
        snapshotBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSnapshot(com.google.cloud.filestore.v1.Snapshot value) {
      if (snapshotBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          snapshot_ != null &&
          snapshot_ != com.google.cloud.filestore.v1.Snapshot.getDefaultInstance()) {
          getSnapshotBuilder().mergeFrom(value);
        } else {
          snapshot_ = value;
        }
      } else {
        snapshotBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000004);
      snapshot_ = null;
      if (snapshotBuilder_ != null) {
        snapshotBuilder_.dispose();
        snapshotBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1.Snapshot.Builder getSnapshotBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSnapshotFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.filestore.v1.SnapshotOrBuilder getSnapshotOrBuilder() {
      if (snapshotBuilder_ != null) {
        return snapshotBuilder_.getMessageOrBuilder();
      } else {
        return snapshot_ == null ?
            com.google.cloud.filestore.v1.Snapshot.getDefaultInstance() : snapshot_;
      }
    }
    /**
     * <pre>
     * Required. A snapshot resource.
     * </pre>
     *
     * <code>.google.cloud.filestore.v1.Snapshot snapshot = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.filestore.v1.Snapshot, com.google.cloud.filestore.v1.Snapshot.Builder, com.google.cloud.filestore.v1.SnapshotOrBuilder> 
        getSnapshotFieldBuilder() {
      if (snapshotBuilder_ == null) {
        snapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1.Snapshot, com.google.cloud.filestore.v1.Snapshot.Builder, com.google.cloud.filestore.v1.SnapshotOrBuilder>(
                getSnapshot(),
                getParentForChildren(),
                isClean());
        snapshot_ = null;
      }
      return snapshotBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1.CreateSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1.CreateSnapshotRequest)
  private static final com.google.cloud.filestore.v1.CreateSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1.CreateSnapshotRequest();
  }

  public static com.google.cloud.filestore.v1.CreateSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSnapshotRequest>() {
    @java.lang.Override
    public CreateSnapshotRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1.CreateSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

