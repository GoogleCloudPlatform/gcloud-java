// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * Configuration for direct-path (via ALTS) with workload identity.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.WorkloadALTSConfig}
 */
public final class WorkloadALTSConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.WorkloadALTSConfig)
    WorkloadALTSConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkloadALTSConfig.newBuilder() to construct.
  private WorkloadALTSConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkloadALTSConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkloadALTSConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkloadALTSConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (enableAlts_ != null) {
              subBuilder = enableAlts_.toBuilder();
            }
            enableAlts_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(enableAlts_);
              enableAlts_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadALTSConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadALTSConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.WorkloadALTSConfig.class, com.google.container.v1beta1.WorkloadALTSConfig.Builder.class);
  }

  public static final int ENABLE_ALTS_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue enableAlts_;
  /**
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   * @return Whether the enableAlts field is set.
   */
  @java.lang.Override
  public boolean hasEnableAlts() {
    return enableAlts_ != null;
  }
  /**
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   * @return The enableAlts.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getEnableAlts() {
    return enableAlts_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enableAlts_;
  }
  /**
   * <pre>
   * enable_alts controls whether the alts handshaker should be enabled or not
   * for direct-path.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getEnableAltsOrBuilder() {
    return getEnableAlts();
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
    if (enableAlts_ != null) {
      output.writeMessage(1, getEnableAlts());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableAlts_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnableAlts());
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
    if (!(obj instanceof com.google.container.v1beta1.WorkloadALTSConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.WorkloadALTSConfig other = (com.google.container.v1beta1.WorkloadALTSConfig) obj;

    if (hasEnableAlts() != other.hasEnableAlts()) return false;
    if (hasEnableAlts()) {
      if (!getEnableAlts()
          .equals(other.getEnableAlts())) return false;
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
    if (hasEnableAlts()) {
      hash = (37 * hash) + ENABLE_ALTS_FIELD_NUMBER;
      hash = (53 * hash) + getEnableAlts().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.WorkloadALTSConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.WorkloadALTSConfig prototype) {
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
   * Configuration for direct-path (via ALTS) with workload identity.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.WorkloadALTSConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.WorkloadALTSConfig)
      com.google.container.v1beta1.WorkloadALTSConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadALTSConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadALTSConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.WorkloadALTSConfig.class, com.google.container.v1beta1.WorkloadALTSConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.WorkloadALTSConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (enableAltsBuilder_ == null) {
        enableAlts_ = null;
      } else {
        enableAlts_ = null;
        enableAltsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadALTSConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadALTSConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.WorkloadALTSConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadALTSConfig build() {
      com.google.container.v1beta1.WorkloadALTSConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadALTSConfig buildPartial() {
      com.google.container.v1beta1.WorkloadALTSConfig result = new com.google.container.v1beta1.WorkloadALTSConfig(this);
      if (enableAltsBuilder_ == null) {
        result.enableAlts_ = enableAlts_;
      } else {
        result.enableAlts_ = enableAltsBuilder_.build();
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
      if (other instanceof com.google.container.v1beta1.WorkloadALTSConfig) {
        return mergeFrom((com.google.container.v1beta1.WorkloadALTSConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.WorkloadALTSConfig other) {
      if (other == com.google.container.v1beta1.WorkloadALTSConfig.getDefaultInstance()) return this;
      if (other.hasEnableAlts()) {
        mergeEnableAlts(other.getEnableAlts());
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
      com.google.container.v1beta1.WorkloadALTSConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.WorkloadALTSConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BoolValue enableAlts_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> enableAltsBuilder_;
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     * @return Whether the enableAlts field is set.
     */
    public boolean hasEnableAlts() {
      return enableAltsBuilder_ != null || enableAlts_ != null;
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     * @return The enableAlts.
     */
    public com.google.protobuf.BoolValue getEnableAlts() {
      if (enableAltsBuilder_ == null) {
        return enableAlts_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enableAlts_;
      } else {
        return enableAltsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public Builder setEnableAlts(com.google.protobuf.BoolValue value) {
      if (enableAltsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enableAlts_ = value;
        onChanged();
      } else {
        enableAltsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public Builder setEnableAlts(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (enableAltsBuilder_ == null) {
        enableAlts_ = builderForValue.build();
        onChanged();
      } else {
        enableAltsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public Builder mergeEnableAlts(com.google.protobuf.BoolValue value) {
      if (enableAltsBuilder_ == null) {
        if (enableAlts_ != null) {
          enableAlts_ =
            com.google.protobuf.BoolValue.newBuilder(enableAlts_).mergeFrom(value).buildPartial();
        } else {
          enableAlts_ = value;
        }
        onChanged();
      } else {
        enableAltsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public Builder clearEnableAlts() {
      if (enableAltsBuilder_ == null) {
        enableAlts_ = null;
        onChanged();
      } else {
        enableAlts_ = null;
        enableAltsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getEnableAltsBuilder() {
      
      onChanged();
      return getEnableAltsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getEnableAltsOrBuilder() {
      if (enableAltsBuilder_ != null) {
        return enableAltsBuilder_.getMessageOrBuilder();
      } else {
        return enableAlts_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : enableAlts_;
      }
    }
    /**
     * <pre>
     * enable_alts controls whether the alts handshaker should be enabled or not
     * for direct-path.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_alts = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getEnableAltsFieldBuilder() {
      if (enableAltsBuilder_ == null) {
        enableAltsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getEnableAlts(),
                getParentForChildren(),
                isClean());
        enableAlts_ = null;
      }
      return enableAltsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.WorkloadALTSConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.WorkloadALTSConfig)
  private static final com.google.container.v1beta1.WorkloadALTSConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.WorkloadALTSConfig();
  }

  public static com.google.container.v1beta1.WorkloadALTSConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadALTSConfig>
      PARSER = new com.google.protobuf.AbstractParser<WorkloadALTSConfig>() {
    @java.lang.Override
    public WorkloadALTSConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkloadALTSConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkloadALTSConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadALTSConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.WorkloadALTSConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

