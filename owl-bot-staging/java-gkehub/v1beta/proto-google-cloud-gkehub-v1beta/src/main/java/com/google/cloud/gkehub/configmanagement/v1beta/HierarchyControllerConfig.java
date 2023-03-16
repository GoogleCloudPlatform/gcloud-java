// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

/**
 * <pre>
 * Configuration for Hierarchy Controller
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig}
 */
public final class HierarchyControllerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)
    HierarchyControllerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HierarchyControllerConfig.newBuilder() to construct.
  private HierarchyControllerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HierarchyControllerConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HierarchyControllerConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_HierarchyControllerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_HierarchyControllerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.class, com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <pre>
   * Whether Hierarchy Controller is enabled in this cluster.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int ENABLE_POD_TREE_LABELS_FIELD_NUMBER = 2;
  private boolean enablePodTreeLabels_ = false;
  /**
   * <pre>
   * Whether pod tree labels are enabled in this cluster.
   * </pre>
   *
   * <code>bool enable_pod_tree_labels = 2;</code>
   * @return The enablePodTreeLabels.
   */
  @java.lang.Override
  public boolean getEnablePodTreeLabels() {
    return enablePodTreeLabels_;
  }

  public static final int ENABLE_HIERARCHICAL_RESOURCE_QUOTA_FIELD_NUMBER = 3;
  private boolean enableHierarchicalResourceQuota_ = false;
  /**
   * <pre>
   * Whether hierarchical resource quota is enabled in this cluster.
   * </pre>
   *
   * <code>bool enable_hierarchical_resource_quota = 3;</code>
   * @return The enableHierarchicalResourceQuota.
   */
  @java.lang.Override
  public boolean getEnableHierarchicalResourceQuota() {
    return enableHierarchicalResourceQuota_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (enablePodTreeLabels_ != false) {
      output.writeBool(2, enablePodTreeLabels_);
    }
    if (enableHierarchicalResourceQuota_ != false) {
      output.writeBool(3, enableHierarchicalResourceQuota_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (enablePodTreeLabels_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enablePodTreeLabels_);
    }
    if (enableHierarchicalResourceQuota_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableHierarchicalResourceQuota_);
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig other = (com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (getEnablePodTreeLabels()
        != other.getEnablePodTreeLabels()) return false;
    if (getEnableHierarchicalResourceQuota()
        != other.getEnableHierarchicalResourceQuota()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + ENABLE_POD_TREE_LABELS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnablePodTreeLabels());
    hash = (37 * hash) + ENABLE_HIERARCHICAL_RESOURCE_QUOTA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableHierarchicalResourceQuota());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig prototype) {
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
   * Configuration for Hierarchy Controller
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)
      com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_HierarchyControllerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_HierarchyControllerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.class, com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.newBuilder()
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
      enabled_ = false;
      enablePodTreeLabels_ = false;
      enableHierarchicalResourceQuota_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_HierarchyControllerConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig build() {
      com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig result = new com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enablePodTreeLabels_ = enablePodTreeLabels_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enableHierarchicalResourceQuota_ = enableHierarchicalResourceQuota_;
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getEnablePodTreeLabels() != false) {
        setEnablePodTreeLabels(other.getEnablePodTreeLabels());
      }
      if (other.getEnableHierarchicalResourceQuota() != false) {
        setEnableHierarchicalResourceQuota(other.getEnableHierarchicalResourceQuota());
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
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              enablePodTreeLabels_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              enableHierarchicalResourceQuota_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private boolean enabled_ ;
    /**
     * <pre>
     * Whether Hierarchy Controller is enabled in this cluster.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Whether Hierarchy Controller is enabled in this cluster.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether Hierarchy Controller is enabled in this cluster.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private boolean enablePodTreeLabels_ ;
    /**
     * <pre>
     * Whether pod tree labels are enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_pod_tree_labels = 2;</code>
     * @return The enablePodTreeLabels.
     */
    @java.lang.Override
    public boolean getEnablePodTreeLabels() {
      return enablePodTreeLabels_;
    }
    /**
     * <pre>
     * Whether pod tree labels are enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_pod_tree_labels = 2;</code>
     * @param value The enablePodTreeLabels to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePodTreeLabels(boolean value) {
      
      enablePodTreeLabels_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether pod tree labels are enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_pod_tree_labels = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnablePodTreeLabels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enablePodTreeLabels_ = false;
      onChanged();
      return this;
    }

    private boolean enableHierarchicalResourceQuota_ ;
    /**
     * <pre>
     * Whether hierarchical resource quota is enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_hierarchical_resource_quota = 3;</code>
     * @return The enableHierarchicalResourceQuota.
     */
    @java.lang.Override
    public boolean getEnableHierarchicalResourceQuota() {
      return enableHierarchicalResourceQuota_;
    }
    /**
     * <pre>
     * Whether hierarchical resource quota is enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_hierarchical_resource_quota = 3;</code>
     * @param value The enableHierarchicalResourceQuota to set.
     * @return This builder for chaining.
     */
    public Builder setEnableHierarchicalResourceQuota(boolean value) {
      
      enableHierarchicalResourceQuota_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether hierarchical resource quota is enabled in this cluster.
     * </pre>
     *
     * <code>bool enable_hierarchical_resource_quota = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableHierarchicalResourceQuota() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enableHierarchicalResourceQuota_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig)
  private static final com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig();
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HierarchyControllerConfig>
      PARSER = new com.google.protobuf.AbstractParser<HierarchyControllerConfig>() {
    @java.lang.Override
    public HierarchyControllerConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<HierarchyControllerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HierarchyControllerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

