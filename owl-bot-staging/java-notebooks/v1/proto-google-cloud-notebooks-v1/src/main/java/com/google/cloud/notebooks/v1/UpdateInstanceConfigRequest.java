// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Request for updating instance configurations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.UpdateInstanceConfigRequest}
 */
public final class UpdateInstanceConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.UpdateInstanceConfigRequest)
    UpdateInstanceConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateInstanceConfigRequest.newBuilder() to construct.
  private UpdateInstanceConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateInstanceConfigRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateInstanceConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_UpdateInstanceConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_UpdateInstanceConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.class, com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.notebooks.v1.InstanceConfig config_;
  /**
   * <pre>
   * The instance configurations to be updated.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * The instance configurations to be updated.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.InstanceConfig getConfig() {
    return config_ == null ? com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * The instance configurations to be updated.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.InstanceConfigOrBuilder getConfigOrBuilder() {
    return config_ == null ? com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance() : config_;
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
    if (config_ != null) {
      output.writeMessage(2, getConfig());
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
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest other = (com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest prototype) {
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
   * Request for updating instance configurations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.UpdateInstanceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.UpdateInstanceConfigRequest)
      com.google.cloud.notebooks.v1.UpdateInstanceConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_UpdateInstanceConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_UpdateInstanceConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.class, com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.newBuilder()
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
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_UpdateInstanceConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest build() {
      com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest buildPartial() {
      com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest result = new com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.config_ = configBuilder_ == null
            ? config_
            : configBuilder_.build();
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
      if (other instanceof com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest other) {
      if (other == com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.notebooks.v1.InstanceConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.notebooks.v1.InstanceConfig, com.google.cloud.notebooks.v1.InstanceConfig.Builder, com.google.cloud.notebooks.v1.InstanceConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     * @return The config.
     */
    public com.google.cloud.notebooks.v1.InstanceConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public Builder setConfig(com.google.cloud.notebooks.v1.InstanceConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public Builder setConfig(
        com.google.cloud.notebooks.v1.InstanceConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public Builder mergeConfig(com.google.cloud.notebooks.v1.InstanceConfig value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          config_ != null &&
          config_ != com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public com.google.cloud.notebooks.v1.InstanceConfig.Builder getConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    public com.google.cloud.notebooks.v1.InstanceConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * The instance configurations to be updated.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.InstanceConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.notebooks.v1.InstanceConfig, com.google.cloud.notebooks.v1.InstanceConfig.Builder, com.google.cloud.notebooks.v1.InstanceConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.InstanceConfig, com.google.cloud.notebooks.v1.InstanceConfig.Builder, com.google.cloud.notebooks.v1.InstanceConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.UpdateInstanceConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.UpdateInstanceConfigRequest)
  private static final com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest();
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInstanceConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateInstanceConfigRequest>() {
    @java.lang.Override
    public UpdateInstanceConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateInstanceConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInstanceConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.UpdateInstanceConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

