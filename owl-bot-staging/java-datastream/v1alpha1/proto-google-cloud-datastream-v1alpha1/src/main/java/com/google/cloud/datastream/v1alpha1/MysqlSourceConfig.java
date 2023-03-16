// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 * <pre>
 * MySQL source configuration
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlSourceConfig}
 */
public final class MysqlSourceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.MysqlSourceConfig)
    MysqlSourceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MysqlSourceConfig.newBuilder() to construct.
  private MysqlSourceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MysqlSourceConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MysqlSourceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_MysqlSourceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_MysqlSourceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.class, com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.Builder.class);
  }

  public static final int ALLOWLIST_FIELD_NUMBER = 1;
  private com.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist_;
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   * @return Whether the allowlist field is set.
   */
  @java.lang.Override
  public boolean hasAllowlist() {
    return allowlist_ != null;
  }
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   * @return The allowlist.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlRdbms getAllowlist() {
    return allowlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : allowlist_;
  }
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getAllowlistOrBuilder() {
    return allowlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : allowlist_;
  }

  public static final int REJECTLIST_FIELD_NUMBER = 2;
  private com.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist_;
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   * @return Whether the rejectlist field is set.
   */
  @java.lang.Override
  public boolean hasRejectlist() {
    return rejectlist_ != null;
  }
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   * @return The rejectlist.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlRdbms getRejectlist() {
    return rejectlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : rejectlist_;
  }
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getRejectlistOrBuilder() {
    return rejectlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : rejectlist_;
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
    if (allowlist_ != null) {
      output.writeMessage(1, getAllowlist());
    }
    if (rejectlist_ != null) {
      output.writeMessage(2, getRejectlist());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (allowlist_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAllowlist());
    }
    if (rejectlist_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRejectlist());
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.MysqlSourceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.MysqlSourceConfig other = (com.google.cloud.datastream.v1alpha1.MysqlSourceConfig) obj;

    if (hasAllowlist() != other.hasAllowlist()) return false;
    if (hasAllowlist()) {
      if (!getAllowlist()
          .equals(other.getAllowlist())) return false;
    }
    if (hasRejectlist() != other.hasRejectlist()) return false;
    if (hasRejectlist()) {
      if (!getRejectlist()
          .equals(other.getRejectlist())) return false;
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
    if (hasAllowlist()) {
      hash = (37 * hash) + ALLOWLIST_FIELD_NUMBER;
      hash = (53 * hash) + getAllowlist().hashCode();
    }
    if (hasRejectlist()) {
      hash = (37 * hash) + REJECTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getRejectlist().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.MysqlSourceConfig prototype) {
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
   * MySQL source configuration
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlSourceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.MysqlSourceConfig)
      com.google.cloud.datastream.v1alpha1.MysqlSourceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_MysqlSourceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_MysqlSourceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.class, com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.newBuilder()
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
      allowlist_ = null;
      if (allowlistBuilder_ != null) {
        allowlistBuilder_.dispose();
        allowlistBuilder_ = null;
      }
      rejectlist_ = null;
      if (rejectlistBuilder_ != null) {
        rejectlistBuilder_.dispose();
        rejectlistBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_MysqlSourceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlSourceConfig getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlSourceConfig build() {
      com.google.cloud.datastream.v1alpha1.MysqlSourceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlSourceConfig buildPartial() {
      com.google.cloud.datastream.v1alpha1.MysqlSourceConfig result = new com.google.cloud.datastream.v1alpha1.MysqlSourceConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1alpha1.MysqlSourceConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.allowlist_ = allowlistBuilder_ == null
            ? allowlist_
            : allowlistBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rejectlist_ = rejectlistBuilder_ == null
            ? rejectlist_
            : rejectlistBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.MysqlSourceConfig) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.MysqlSourceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.MysqlSourceConfig other) {
      if (other == com.google.cloud.datastream.v1alpha1.MysqlSourceConfig.getDefaultInstance()) return this;
      if (other.hasAllowlist()) {
        mergeAllowlist(other.getAllowlist());
      }
      if (other.hasRejectlist()) {
        mergeRejectlist(other.getRejectlist());
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
                  getAllowlistFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRejectlistFieldBuilder().getBuilder(),
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

    private com.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder> allowlistBuilder_;
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     * @return Whether the allowlist field is set.
     */
    public boolean hasAllowlist() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     * @return The allowlist.
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms getAllowlist() {
      if (allowlistBuilder_ == null) {
        return allowlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : allowlist_;
      } else {
        return allowlistBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public Builder setAllowlist(com.google.cloud.datastream.v1alpha1.MysqlRdbms value) {
      if (allowlistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allowlist_ = value;
      } else {
        allowlistBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public Builder setAllowlist(
        com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder builderForValue) {
      if (allowlistBuilder_ == null) {
        allowlist_ = builderForValue.build();
      } else {
        allowlistBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public Builder mergeAllowlist(com.google.cloud.datastream.v1alpha1.MysqlRdbms value) {
      if (allowlistBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          allowlist_ != null &&
          allowlist_ != com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance()) {
          getAllowlistBuilder().mergeFrom(value);
        } else {
          allowlist_ = value;
        }
      } else {
        allowlistBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public Builder clearAllowlist() {
      bitField0_ = (bitField0_ & ~0x00000001);
      allowlist_ = null;
      if (allowlistBuilder_ != null) {
        allowlistBuilder_.dispose();
        allowlistBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder getAllowlistBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAllowlistFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getAllowlistOrBuilder() {
      if (allowlistBuilder_ != null) {
        return allowlistBuilder_.getMessageOrBuilder();
      } else {
        return allowlist_ == null ?
            com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : allowlist_;
      }
    }
    /**
     * <pre>
     * MySQL objects to retrieve from the source.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder> 
        getAllowlistFieldBuilder() {
      if (allowlistBuilder_ == null) {
        allowlistBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder>(
                getAllowlist(),
                getParentForChildren(),
                isClean());
        allowlist_ = null;
      }
      return allowlistBuilder_;
    }

    private com.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder> rejectlistBuilder_;
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     * @return Whether the rejectlist field is set.
     */
    public boolean hasRejectlist() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     * @return The rejectlist.
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms getRejectlist() {
      if (rejectlistBuilder_ == null) {
        return rejectlist_ == null ? com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : rejectlist_;
      } else {
        return rejectlistBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public Builder setRejectlist(com.google.cloud.datastream.v1alpha1.MysqlRdbms value) {
      if (rejectlistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rejectlist_ = value;
      } else {
        rejectlistBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public Builder setRejectlist(
        com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder builderForValue) {
      if (rejectlistBuilder_ == null) {
        rejectlist_ = builderForValue.build();
      } else {
        rejectlistBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public Builder mergeRejectlist(com.google.cloud.datastream.v1alpha1.MysqlRdbms value) {
      if (rejectlistBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rejectlist_ != null &&
          rejectlist_ != com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance()) {
          getRejectlistBuilder().mergeFrom(value);
        } else {
          rejectlist_ = value;
        }
      } else {
        rejectlistBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public Builder clearRejectlist() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rejectlist_ = null;
      if (rejectlistBuilder_ != null) {
        rejectlistBuilder_.dispose();
        rejectlistBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder getRejectlistBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRejectlistFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getRejectlistOrBuilder() {
      if (rejectlistBuilder_ != null) {
        return rejectlistBuilder_.getMessageOrBuilder();
      } else {
        return rejectlist_ == null ?
            com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance() : rejectlist_;
      }
    }
    /**
     * <pre>
     * MySQL objects to exclude from the stream.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder> 
        getRejectlistFieldBuilder() {
      if (rejectlistBuilder_ == null) {
        rejectlistBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlRdbms, com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder, com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder>(
                getRejectlist(),
                getParentForChildren(),
                isClean());
        rejectlist_ = null;
      }
      return rejectlistBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.MysqlSourceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.MysqlSourceConfig)
  private static final com.google.cloud.datastream.v1alpha1.MysqlSourceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.MysqlSourceConfig();
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlSourceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlSourceConfig>
      PARSER = new com.google.protobuf.AbstractParser<MysqlSourceConfig>() {
    @java.lang.Override
    public MysqlSourceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MysqlSourceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlSourceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlSourceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

