// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 * <pre>
 * Carries information about a disk that can be attached to a VM.
 *
 * See https://cloud.google.com/compute/docs/disks/performance for more
 * information about disk type, size, and performance considerations.
 *
 * Specify either [`Volume`][google.cloud.lifesciences.v2beta.Volume] or
 * [`Disk`][google.cloud.lifesciences.v2beta.Disk], but not both.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.Disk}
 */
public final class Disk extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.Disk)
    DiskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Disk.newBuilder() to construct.
  private Disk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Disk() {
    name_ = "";
    type_ = "";
    sourceImage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Disk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Disk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Disk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.Disk.class, com.google.cloud.lifesciences.v2beta.Disk.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * A user-supplied name for the disk. Used when mounting the disk into
   * actions. The name must contain only upper and lowercase alphanumeric
   * characters and hyphens and cannot start with a hyphen.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * A user-supplied name for the disk. Used when mounting the disk into
   * actions. The name must contain only upper and lowercase alphanumeric
   * characters and hyphens and cannot start with a hyphen.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int SIZE_GB_FIELD_NUMBER = 2;
  private int sizeGb_ = 0;
  /**
   * <pre>
   * The size, in GB, of the disk to attach. If the size is not
   * specified, a default is chosen to ensure reasonable I/O performance.
   *
   * If the disk type is specified as `local-ssd`, multiple local drives are
   * automatically combined to provide the requested size. Note, however, that
   * each physical SSD is 375GB in size, and no more than 8 drives can be
   * attached to a single instance.
   * </pre>
   *
   * <code>int32 size_gb = 2;</code>
   * @return The sizeGb.
   */
  @java.lang.Override
  public int getSizeGb() {
    return sizeGb_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * The Compute Engine disk type. If unspecified, `pd-standard` is used.
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Compute Engine disk type. If unspecified, `pd-standard` is used.
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_IMAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceImage_ = "";
  /**
   * <pre>
   * An optional image to put on the disk before attaching it to the VM.
   * </pre>
   *
   * <code>string source_image = 4;</code>
   * @return The sourceImage.
   */
  @java.lang.Override
  public java.lang.String getSourceImage() {
    java.lang.Object ref = sourceImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceImage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional image to put on the disk before attaching it to the VM.
   * </pre>
   *
   * <code>string source_image = 4;</code>
   * @return The bytes for sourceImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceImageBytes() {
    java.lang.Object ref = sourceImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceImage_ = b;
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
    if (sizeGb_ != 0) {
      output.writeInt32(2, sizeGb_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sourceImage_);
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
    if (sizeGb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sizeGb_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sourceImage_);
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.Disk)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.Disk other = (com.google.cloud.lifesciences.v2beta.Disk) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getSizeGb()
        != other.getSizeGb()) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getSourceImage()
        .equals(other.getSourceImage())) return false;
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
    hash = (37 * hash) + SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + getSizeGb();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + SOURCE_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceImage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Disk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Disk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.Disk parseFrom(
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
  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.Disk prototype) {
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
   * Carries information about a disk that can be attached to a VM.
   *
   * See https://cloud.google.com/compute/docs/disks/performance for more
   * information about disk type, size, and performance considerations.
   *
   * Specify either [`Volume`][google.cloud.lifesciences.v2beta.Volume] or
   * [`Disk`][google.cloud.lifesciences.v2beta.Disk], but not both.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.Disk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.Disk)
      com.google.cloud.lifesciences.v2beta.DiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Disk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Disk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.Disk.class, com.google.cloud.lifesciences.v2beta.Disk.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.Disk.newBuilder()
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
      sizeGb_ = 0;
      type_ = "";
      sourceImage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Disk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Disk getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.Disk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Disk build() {
      com.google.cloud.lifesciences.v2beta.Disk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Disk buildPartial() {
      com.google.cloud.lifesciences.v2beta.Disk result = new com.google.cloud.lifesciences.v2beta.Disk(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.Disk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sizeGb_ = sizeGb_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sourceImage_ = sourceImage_;
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.Disk) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.Disk)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.Disk other) {
      if (other == com.google.cloud.lifesciences.v2beta.Disk.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSizeGb() != 0) {
        setSizeGb(other.getSizeGb());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getSourceImage().isEmpty()) {
        sourceImage_ = other.sourceImage_;
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
            case 10: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              sizeGb_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              sourceImage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * A user-supplied name for the disk. Used when mounting the disk into
     * actions. The name must contain only upper and lowercase alphanumeric
     * characters and hyphens and cannot start with a hyphen.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * A user-supplied name for the disk. Used when mounting the disk into
     * actions. The name must contain only upper and lowercase alphanumeric
     * characters and hyphens and cannot start with a hyphen.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * A user-supplied name for the disk. Used when mounting the disk into
     * actions. The name must contain only upper and lowercase alphanumeric
     * characters and hyphens and cannot start with a hyphen.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * A user-supplied name for the disk. Used when mounting the disk into
     * actions. The name must contain only upper and lowercase alphanumeric
     * characters and hyphens and cannot start with a hyphen.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * A user-supplied name for the disk. Used when mounting the disk into
     * actions. The name must contain only upper and lowercase alphanumeric
     * characters and hyphens and cannot start with a hyphen.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private int sizeGb_ ;
    /**
     * <pre>
     * The size, in GB, of the disk to attach. If the size is not
     * specified, a default is chosen to ensure reasonable I/O performance.
     *
     * If the disk type is specified as `local-ssd`, multiple local drives are
     * automatically combined to provide the requested size. Note, however, that
     * each physical SSD is 375GB in size, and no more than 8 drives can be
     * attached to a single instance.
     * </pre>
     *
     * <code>int32 size_gb = 2;</code>
     * @return The sizeGb.
     */
    @java.lang.Override
    public int getSizeGb() {
      return sizeGb_;
    }
    /**
     * <pre>
     * The size, in GB, of the disk to attach. If the size is not
     * specified, a default is chosen to ensure reasonable I/O performance.
     *
     * If the disk type is specified as `local-ssd`, multiple local drives are
     * automatically combined to provide the requested size. Note, however, that
     * each physical SSD is 375GB in size, and no more than 8 drives can be
     * attached to a single instance.
     * </pre>
     *
     * <code>int32 size_gb = 2;</code>
     * @param value The sizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setSizeGb(int value) {

      sizeGb_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The size, in GB, of the disk to attach. If the size is not
     * specified, a default is chosen to ensure reasonable I/O performance.
     *
     * If the disk type is specified as `local-ssd`, multiple local drives are
     * automatically combined to provide the requested size. Note, however, that
     * each physical SSD is 375GB in size, and no more than 8 drives can be
     * attached to a single instance.
     * </pre>
     *
     * <code>int32 size_gb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sizeGb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * The Compute Engine disk type. If unspecified, `pd-standard` is used.
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Compute Engine disk type. If unspecified, `pd-standard` is used.
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Compute Engine disk type. If unspecified, `pd-standard` is used.
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Compute Engine disk type. If unspecified, `pd-standard` is used.
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Compute Engine disk type. If unspecified, `pd-standard` is used.
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object sourceImage_ = "";
    /**
     * <pre>
     * An optional image to put on the disk before attaching it to the VM.
     * </pre>
     *
     * <code>string source_image = 4;</code>
     * @return The sourceImage.
     */
    public java.lang.String getSourceImage() {
      java.lang.Object ref = sourceImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional image to put on the disk before attaching it to the VM.
     * </pre>
     *
     * <code>string source_image = 4;</code>
     * @return The bytes for sourceImage.
     */
    public com.google.protobuf.ByteString
        getSourceImageBytes() {
      java.lang.Object ref = sourceImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional image to put on the disk before attaching it to the VM.
     * </pre>
     *
     * <code>string source_image = 4;</code>
     * @param value The sourceImage to set.
     * @return This builder for chaining.
     */
    public Builder setSourceImage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sourceImage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional image to put on the disk before attaching it to the VM.
     * </pre>
     *
     * <code>string source_image = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceImage() {
      sourceImage_ = getDefaultInstance().getSourceImage();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional image to put on the disk before attaching it to the VM.
     * </pre>
     *
     * <code>string source_image = 4;</code>
     * @param value The bytes for sourceImage to set.
     * @return This builder for chaining.
     */
    public Builder setSourceImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sourceImage_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.Disk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.Disk)
  private static final com.google.cloud.lifesciences.v2beta.Disk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.Disk();
  }

  public static com.google.cloud.lifesciences.v2beta.Disk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Disk>
      PARSER = new com.google.protobuf.AbstractParser<Disk>() {
    @java.lang.Override
    public Disk parsePartialFrom(
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

  public static com.google.protobuf.Parser<Disk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Disk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.Disk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

