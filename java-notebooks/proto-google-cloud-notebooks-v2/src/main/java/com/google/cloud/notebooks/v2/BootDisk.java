/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v2/gce_setup.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v2;

/**
 *
 *
 * <pre>
 * The definition of a boot disk.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v2.BootDisk}
 */
public final class BootDisk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v2.BootDisk)
    BootDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BootDisk.newBuilder() to construct.
  private BootDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BootDisk() {
    diskType_ = 0;
    diskEncryption_ = 0;
    kmsKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BootDisk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v2.GceSetupProto
        .internal_static_google_cloud_notebooks_v2_BootDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v2.GceSetupProto
        .internal_static_google_cloud_notebooks_v2_BootDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v2.BootDisk.class,
            com.google.cloud.notebooks.v2.BootDisk.Builder.class);
  }

  public static final int DISK_SIZE_GB_FIELD_NUMBER = 1;
  private long diskSizeGb_ = 0L;
  /**
   *
   *
   * <pre>
   * Optional. The size of the boot disk in GB attached to this instance, up to
   * a maximum of 64000 GB (64 TB). If not specified, this defaults to the
   * recommended value of 150GB.
   * </pre>
   *
   * <code>int64 disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskSizeGb.
   */
  @java.lang.Override
  public long getDiskSizeGb() {
    return diskSizeGb_;
  }

  public static final int DISK_TYPE_FIELD_NUMBER = 2;
  private int diskType_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Indicates the type of the disk.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for diskType.
   */
  @java.lang.Override
  public int getDiskTypeValue() {
    return diskType_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Indicates the type of the disk.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskType.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v2.DiskType getDiskType() {
    com.google.cloud.notebooks.v2.DiskType result =
        com.google.cloud.notebooks.v2.DiskType.forNumber(diskType_);
    return result == null ? com.google.cloud.notebooks.v2.DiskType.UNRECOGNIZED : result;
  }

  public static final int DISK_ENCRYPTION_FIELD_NUMBER = 3;
  private int diskEncryption_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Input only. Disk encryption method used on the boot and data
   * disks, defaults to GMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for diskEncryption.
   */
  @java.lang.Override
  public int getDiskEncryptionValue() {
    return diskEncryption_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Input only. Disk encryption method used on the boot and data
   * disks, defaults to GMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskEncryption.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v2.DiskEncryption getDiskEncryption() {
    com.google.cloud.notebooks.v2.DiskEncryption result =
        com.google.cloud.notebooks.v2.DiskEncryption.forNumber(diskEncryption_);
    return result == null ? com.google.cloud.notebooks.v2.DiskEncryption.UNRECOGNIZED : result;
  }

  public static final int KMS_KEY_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kmsKey_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Input only. The KMS key used to encrypt the disks, only
   * applicable if disk_encryption is CMEK. Format:
   * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   *
   * Learn more about using your own encryption keys.
   * </pre>
   *
   * <code>
   * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The kmsKey.
   */
  @java.lang.Override
  public java.lang.String getKmsKey() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kmsKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Input only. The KMS key used to encrypt the disks, only
   * applicable if disk_encryption is CMEK. Format:
   * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   *
   * Learn more about using your own encryption keys.
   * </pre>
   *
   * <code>
   * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for kmsKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKmsKeyBytes() {
    java.lang.Object ref = kmsKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kmsKey_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (diskSizeGb_ != 0L) {
      output.writeInt64(1, diskSizeGb_);
    }
    if (diskType_ != com.google.cloud.notebooks.v2.DiskType.DISK_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, diskType_);
    }
    if (diskEncryption_
        != com.google.cloud.notebooks.v2.DiskEncryption.DISK_ENCRYPTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, diskEncryption_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, kmsKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (diskSizeGb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, diskSizeGb_);
    }
    if (diskType_ != com.google.cloud.notebooks.v2.DiskType.DISK_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, diskType_);
    }
    if (diskEncryption_
        != com.google.cloud.notebooks.v2.DiskEncryption.DISK_ENCRYPTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, diskEncryption_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kmsKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, kmsKey_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v2.BootDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v2.BootDisk other = (com.google.cloud.notebooks.v2.BootDisk) obj;

    if (getDiskSizeGb() != other.getDiskSizeGb()) return false;
    if (diskType_ != other.diskType_) return false;
    if (diskEncryption_ != other.diskEncryption_) return false;
    if (!getKmsKey().equals(other.getKmsKey())) return false;
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
    hash = (37 * hash) + DISK_SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDiskSizeGb());
    hash = (37 * hash) + DISK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + diskType_;
    hash = (37 * hash) + DISK_ENCRYPTION_FIELD_NUMBER;
    hash = (53 * hash) + diskEncryption_;
    hash = (37 * hash) + KMS_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKmsKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.BootDisk parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v2.BootDisk prototype) {
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
   * The definition of a boot disk.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v2.BootDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v2.BootDisk)
      com.google.cloud.notebooks.v2.BootDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v2.GceSetupProto
          .internal_static_google_cloud_notebooks_v2_BootDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v2.GceSetupProto
          .internal_static_google_cloud_notebooks_v2_BootDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v2.BootDisk.class,
              com.google.cloud.notebooks.v2.BootDisk.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v2.BootDisk.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      diskSizeGb_ = 0L;
      diskType_ = 0;
      diskEncryption_ = 0;
      kmsKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v2.GceSetupProto
          .internal_static_google_cloud_notebooks_v2_BootDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.BootDisk getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v2.BootDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.BootDisk build() {
      com.google.cloud.notebooks.v2.BootDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.BootDisk buildPartial() {
      com.google.cloud.notebooks.v2.BootDisk result =
          new com.google.cloud.notebooks.v2.BootDisk(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v2.BootDisk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diskSizeGb_ = diskSizeGb_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diskType_ = diskType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.diskEncryption_ = diskEncryption_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.kmsKey_ = kmsKey_;
      }
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
      if (other instanceof com.google.cloud.notebooks.v2.BootDisk) {
        return mergeFrom((com.google.cloud.notebooks.v2.BootDisk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v2.BootDisk other) {
      if (other == com.google.cloud.notebooks.v2.BootDisk.getDefaultInstance()) return this;
      if (other.getDiskSizeGb() != 0L) {
        setDiskSizeGb(other.getDiskSizeGb());
      }
      if (other.diskType_ != 0) {
        setDiskTypeValue(other.getDiskTypeValue());
      }
      if (other.diskEncryption_ != 0) {
        setDiskEncryptionValue(other.getDiskEncryptionValue());
      }
      if (!other.getKmsKey().isEmpty()) {
        kmsKey_ = other.kmsKey_;
        bitField0_ |= 0x00000008;
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
            case 8:
              {
                diskSizeGb_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                diskType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                diskEncryption_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                kmsKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
            default:
              {
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

    private long diskSizeGb_;
    /**
     *
     *
     * <pre>
     * Optional. The size of the boot disk in GB attached to this instance, up to
     * a maximum of 64000 GB (64 TB). If not specified, this defaults to the
     * recommended value of 150GB.
     * </pre>
     *
     * <code>int64 disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The diskSizeGb.
     */
    @java.lang.Override
    public long getDiskSizeGb() {
      return diskSizeGb_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The size of the boot disk in GB attached to this instance, up to
     * a maximum of 64000 GB (64 TB). If not specified, this defaults to the
     * recommended value of 150GB.
     * </pre>
     *
     * <code>int64 disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The diskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setDiskSizeGb(long value) {

      diskSizeGb_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The size of the boot disk in GB attached to this instance, up to
     * a maximum of 64000 GB (64 TB). If not specified, this defaults to the
     * recommended value of 150GB.
     * </pre>
     *
     * <code>int64 disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000001);
      diskSizeGb_ = 0L;
      onChanged();
      return this;
    }

    private int diskType_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Indicates the type of the disk.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for diskType.
     */
    @java.lang.Override
    public int getDiskTypeValue() {
      return diskType_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates the type of the disk.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskTypeValue(int value) {
      diskType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates the type of the disk.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The diskType.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v2.DiskType getDiskType() {
      com.google.cloud.notebooks.v2.DiskType result =
          com.google.cloud.notebooks.v2.DiskType.forNumber(diskType_);
      return result == null ? com.google.cloud.notebooks.v2.DiskType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates the type of the disk.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskType(com.google.cloud.notebooks.v2.DiskType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      diskType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates the type of the disk.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskType disk_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      diskType_ = 0;
      onChanged();
      return this;
    }

    private int diskEncryption_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Input only. Disk encryption method used on the boot and data
     * disks, defaults to GMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for diskEncryption.
     */
    @java.lang.Override
    public int getDiskEncryptionValue() {
      return diskEncryption_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. Disk encryption method used on the boot and data
     * disks, defaults to GMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for diskEncryption to set.
     * @return This builder for chaining.
     */
    public Builder setDiskEncryptionValue(int value) {
      diskEncryption_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. Disk encryption method used on the boot and data
     * disks, defaults to GMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The diskEncryption.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v2.DiskEncryption getDiskEncryption() {
      com.google.cloud.notebooks.v2.DiskEncryption result =
          com.google.cloud.notebooks.v2.DiskEncryption.forNumber(diskEncryption_);
      return result == null ? com.google.cloud.notebooks.v2.DiskEncryption.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. Disk encryption method used on the boot and data
     * disks, defaults to GMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The diskEncryption to set.
     * @return This builder for chaining.
     */
    public Builder setDiskEncryption(com.google.cloud.notebooks.v2.DiskEncryption value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      diskEncryption_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. Disk encryption method used on the boot and data
     * disks, defaults to GMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.DiskEncryption disk_encryption = 3 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiskEncryption() {
      bitField0_ = (bitField0_ & ~0x00000004);
      diskEncryption_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object kmsKey_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format:
     * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     *
     * Learn more about using your own encryption keys.
     * </pre>
     *
     * <code>
     * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The kmsKey.
     */
    public java.lang.String getKmsKey() {
      java.lang.Object ref = kmsKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kmsKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format:
     * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     *
     * Learn more about using your own encryption keys.
     * </pre>
     *
     * <code>
     * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The bytes for kmsKey.
     */
    public com.google.protobuf.ByteString getKmsKeyBytes() {
      java.lang.Object ref = kmsKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kmsKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format:
     * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     *
     * Learn more about using your own encryption keys.
     * </pre>
     *
     * <code>
     * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kmsKey_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format:
     * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     *
     * Learn more about using your own encryption keys.
     * </pre>
     *
     * <code>
     * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKey() {
      kmsKey_ = getDefaultInstance().getKmsKey();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format:
     * `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     *
     * Learn more about using your own encryption keys.
     * </pre>
     *
     * <code>
     * string kms_key = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The bytes for kmsKey to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kmsKey_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v2.BootDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v2.BootDisk)
  private static final com.google.cloud.notebooks.v2.BootDisk DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v2.BootDisk();
  }

  public static com.google.cloud.notebooks.v2.BootDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BootDisk> PARSER =
      new com.google.protobuf.AbstractParser<BootDisk>() {
        @java.lang.Override
        public BootDisk parsePartialFrom(
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

  public static com.google.protobuf.Parser<BootDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BootDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v2.BootDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
