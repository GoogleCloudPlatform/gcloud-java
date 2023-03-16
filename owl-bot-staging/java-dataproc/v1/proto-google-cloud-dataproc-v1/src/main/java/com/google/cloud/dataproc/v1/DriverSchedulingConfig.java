// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Driver scheduling configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.DriverSchedulingConfig}
 */
public final class DriverSchedulingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.DriverSchedulingConfig)
    DriverSchedulingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DriverSchedulingConfig.newBuilder() to construct.
  private DriverSchedulingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DriverSchedulingConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DriverSchedulingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_DriverSchedulingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_DriverSchedulingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.DriverSchedulingConfig.class, com.google.cloud.dataproc.v1.DriverSchedulingConfig.Builder.class);
  }

  public static final int MEMORY_MB_FIELD_NUMBER = 1;
  private int memoryMb_ = 0;
  /**
   * <pre>
   * Required. The amount of memory in MB the driver is requesting.
   * </pre>
   *
   * <code>int32 memory_mb = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The memoryMb.
   */
  @java.lang.Override
  public int getMemoryMb() {
    return memoryMb_;
  }

  public static final int VCORES_FIELD_NUMBER = 2;
  private int vcores_ = 0;
  /**
   * <pre>
   * Required. The number of vCPUs the driver is requesting.
   * </pre>
   *
   * <code>int32 vcores = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vcores.
   */
  @java.lang.Override
  public int getVcores() {
    return vcores_;
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
    if (memoryMb_ != 0) {
      output.writeInt32(1, memoryMb_);
    }
    if (vcores_ != 0) {
      output.writeInt32(2, vcores_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (memoryMb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, memoryMb_);
    }
    if (vcores_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, vcores_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.DriverSchedulingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.DriverSchedulingConfig other = (com.google.cloud.dataproc.v1.DriverSchedulingConfig) obj;

    if (getMemoryMb()
        != other.getMemoryMb()) return false;
    if (getVcores()
        != other.getVcores()) return false;
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
    hash = (37 * hash) + MEMORY_MB_FIELD_NUMBER;
    hash = (53 * hash) + getMemoryMb();
    hash = (37 * hash) + VCORES_FIELD_NUMBER;
    hash = (53 * hash) + getVcores();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.DriverSchedulingConfig prototype) {
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
   * Driver scheduling configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.DriverSchedulingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.DriverSchedulingConfig)
      com.google.cloud.dataproc.v1.DriverSchedulingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_DriverSchedulingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_DriverSchedulingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.DriverSchedulingConfig.class, com.google.cloud.dataproc.v1.DriverSchedulingConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.DriverSchedulingConfig.newBuilder()
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
      memoryMb_ = 0;
      vcores_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_DriverSchedulingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DriverSchedulingConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.DriverSchedulingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DriverSchedulingConfig build() {
      com.google.cloud.dataproc.v1.DriverSchedulingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DriverSchedulingConfig buildPartial() {
      com.google.cloud.dataproc.v1.DriverSchedulingConfig result = new com.google.cloud.dataproc.v1.DriverSchedulingConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.DriverSchedulingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.memoryMb_ = memoryMb_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vcores_ = vcores_;
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
      if (other instanceof com.google.cloud.dataproc.v1.DriverSchedulingConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.DriverSchedulingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.DriverSchedulingConfig other) {
      if (other == com.google.cloud.dataproc.v1.DriverSchedulingConfig.getDefaultInstance()) return this;
      if (other.getMemoryMb() != 0) {
        setMemoryMb(other.getMemoryMb());
      }
      if (other.getVcores() != 0) {
        setVcores(other.getVcores());
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
              memoryMb_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              vcores_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int memoryMb_ ;
    /**
     * <pre>
     * Required. The amount of memory in MB the driver is requesting.
     * </pre>
     *
     * <code>int32 memory_mb = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The memoryMb.
     */
    @java.lang.Override
    public int getMemoryMb() {
      return memoryMb_;
    }
    /**
     * <pre>
     * Required. The amount of memory in MB the driver is requesting.
     * </pre>
     *
     * <code>int32 memory_mb = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The memoryMb to set.
     * @return This builder for chaining.
     */
    public Builder setMemoryMb(int value) {
      
      memoryMb_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The amount of memory in MB the driver is requesting.
     * </pre>
     *
     * <code>int32 memory_mb = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMemoryMb() {
      bitField0_ = (bitField0_ & ~0x00000001);
      memoryMb_ = 0;
      onChanged();
      return this;
    }

    private int vcores_ ;
    /**
     * <pre>
     * Required. The number of vCPUs the driver is requesting.
     * </pre>
     *
     * <code>int32 vcores = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vcores.
     */
    @java.lang.Override
    public int getVcores() {
      return vcores_;
    }
    /**
     * <pre>
     * Required. The number of vCPUs the driver is requesting.
     * </pre>
     *
     * <code>int32 vcores = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The vcores to set.
     * @return This builder for chaining.
     */
    public Builder setVcores(int value) {
      
      vcores_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The number of vCPUs the driver is requesting.
     * </pre>
     *
     * <code>int32 vcores = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVcores() {
      bitField0_ = (bitField0_ & ~0x00000002);
      vcores_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.DriverSchedulingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.DriverSchedulingConfig)
  private static final com.google.cloud.dataproc.v1.DriverSchedulingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.DriverSchedulingConfig();
  }

  public static com.google.cloud.dataproc.v1.DriverSchedulingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DriverSchedulingConfig>
      PARSER = new com.google.protobuf.AbstractParser<DriverSchedulingConfig>() {
    @java.lang.Override
    public DriverSchedulingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DriverSchedulingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DriverSchedulingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.DriverSchedulingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

