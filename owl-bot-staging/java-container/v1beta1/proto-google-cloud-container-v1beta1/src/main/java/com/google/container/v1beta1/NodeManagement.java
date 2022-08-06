// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * NodeManagement defines the set of node management services turned on for the
 * node pool.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NodeManagement}
 */
public final class NodeManagement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NodeManagement)
    NodeManagementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeManagement.newBuilder() to construct.
  private NodeManagement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeManagement() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeManagement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeManagement(
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
          case 8: {

            autoUpgrade_ = input.readBool();
            break;
          }
          case 16: {

            autoRepair_ = input.readBool();
            break;
          }
          case 82: {
            com.google.container.v1beta1.AutoUpgradeOptions.Builder subBuilder = null;
            if (upgradeOptions_ != null) {
              subBuilder = upgradeOptions_.toBuilder();
            }
            upgradeOptions_ = input.readMessage(com.google.container.v1beta1.AutoUpgradeOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(upgradeOptions_);
              upgradeOptions_ = subBuilder.buildPartial();
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
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodeManagement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodeManagement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NodeManagement.class, com.google.container.v1beta1.NodeManagement.Builder.class);
  }

  public static final int AUTO_UPGRADE_FIELD_NUMBER = 1;
  private boolean autoUpgrade_;
  /**
   * <pre>
   * Whether the nodes will be automatically upgraded.
   * </pre>
   *
   * <code>bool auto_upgrade = 1;</code>
   * @return The autoUpgrade.
   */
  @java.lang.Override
  public boolean getAutoUpgrade() {
    return autoUpgrade_;
  }

  public static final int AUTO_REPAIR_FIELD_NUMBER = 2;
  private boolean autoRepair_;
  /**
   * <pre>
   * Whether the nodes will be automatically repaired.
   * </pre>
   *
   * <code>bool auto_repair = 2;</code>
   * @return The autoRepair.
   */
  @java.lang.Override
  public boolean getAutoRepair() {
    return autoRepair_;
  }

  public static final int UPGRADE_OPTIONS_FIELD_NUMBER = 10;
  private com.google.container.v1beta1.AutoUpgradeOptions upgradeOptions_;
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   * @return Whether the upgradeOptions field is set.
   */
  @java.lang.Override
  public boolean hasUpgradeOptions() {
    return upgradeOptions_ != null;
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   * @return The upgradeOptions.
   */
  @java.lang.Override
  public com.google.container.v1beta1.AutoUpgradeOptions getUpgradeOptions() {
    return upgradeOptions_ == null ? com.google.container.v1beta1.AutoUpgradeOptions.getDefaultInstance() : upgradeOptions_;
  }
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder getUpgradeOptionsOrBuilder() {
    return getUpgradeOptions();
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
    if (autoUpgrade_ != false) {
      output.writeBool(1, autoUpgrade_);
    }
    if (autoRepair_ != false) {
      output.writeBool(2, autoRepair_);
    }
    if (upgradeOptions_ != null) {
      output.writeMessage(10, getUpgradeOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoUpgrade_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, autoUpgrade_);
    }
    if (autoRepair_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, autoRepair_);
    }
    if (upgradeOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getUpgradeOptions());
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
    if (!(obj instanceof com.google.container.v1beta1.NodeManagement)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NodeManagement other = (com.google.container.v1beta1.NodeManagement) obj;

    if (getAutoUpgrade()
        != other.getAutoUpgrade()) return false;
    if (getAutoRepair()
        != other.getAutoRepair()) return false;
    if (hasUpgradeOptions() != other.hasUpgradeOptions()) return false;
    if (hasUpgradeOptions()) {
      if (!getUpgradeOptions()
          .equals(other.getUpgradeOptions())) return false;
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
    hash = (37 * hash) + AUTO_UPGRADE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoUpgrade());
    hash = (37 * hash) + AUTO_REPAIR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoRepair());
    if (hasUpgradeOptions()) {
      hash = (37 * hash) + UPGRADE_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getUpgradeOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NodeManagement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodeManagement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodeManagement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodeManagement parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.NodeManagement prototype) {
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
   * NodeManagement defines the set of node management services turned on for the
   * node pool.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NodeManagement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NodeManagement)
      com.google.container.v1beta1.NodeManagementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodeManagement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodeManagement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NodeManagement.class, com.google.container.v1beta1.NodeManagement.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NodeManagement.newBuilder()
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
      autoUpgrade_ = false;

      autoRepair_ = false;

      if (upgradeOptionsBuilder_ == null) {
        upgradeOptions_ = null;
      } else {
        upgradeOptions_ = null;
        upgradeOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodeManagement_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeManagement getDefaultInstanceForType() {
      return com.google.container.v1beta1.NodeManagement.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeManagement build() {
      com.google.container.v1beta1.NodeManagement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeManagement buildPartial() {
      com.google.container.v1beta1.NodeManagement result = new com.google.container.v1beta1.NodeManagement(this);
      result.autoUpgrade_ = autoUpgrade_;
      result.autoRepair_ = autoRepair_;
      if (upgradeOptionsBuilder_ == null) {
        result.upgradeOptions_ = upgradeOptions_;
      } else {
        result.upgradeOptions_ = upgradeOptionsBuilder_.build();
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
      if (other instanceof com.google.container.v1beta1.NodeManagement) {
        return mergeFrom((com.google.container.v1beta1.NodeManagement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NodeManagement other) {
      if (other == com.google.container.v1beta1.NodeManagement.getDefaultInstance()) return this;
      if (other.getAutoUpgrade() != false) {
        setAutoUpgrade(other.getAutoUpgrade());
      }
      if (other.getAutoRepair() != false) {
        setAutoRepair(other.getAutoRepair());
      }
      if (other.hasUpgradeOptions()) {
        mergeUpgradeOptions(other.getUpgradeOptions());
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
      com.google.container.v1beta1.NodeManagement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.NodeManagement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean autoUpgrade_ ;
    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>bool auto_upgrade = 1;</code>
     * @return The autoUpgrade.
     */
    @java.lang.Override
    public boolean getAutoUpgrade() {
      return autoUpgrade_;
    }
    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>bool auto_upgrade = 1;</code>
     * @param value The autoUpgrade to set.
     * @return This builder for chaining.
     */
    public Builder setAutoUpgrade(boolean value) {
      
      autoUpgrade_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the nodes will be automatically upgraded.
     * </pre>
     *
     * <code>bool auto_upgrade = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoUpgrade() {
      
      autoUpgrade_ = false;
      onChanged();
      return this;
    }

    private boolean autoRepair_ ;
    /**
     * <pre>
     * Whether the nodes will be automatically repaired.
     * </pre>
     *
     * <code>bool auto_repair = 2;</code>
     * @return The autoRepair.
     */
    @java.lang.Override
    public boolean getAutoRepair() {
      return autoRepair_;
    }
    /**
     * <pre>
     * Whether the nodes will be automatically repaired.
     * </pre>
     *
     * <code>bool auto_repair = 2;</code>
     * @param value The autoRepair to set.
     * @return This builder for chaining.
     */
    public Builder setAutoRepair(boolean value) {
      
      autoRepair_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the nodes will be automatically repaired.
     * </pre>
     *
     * <code>bool auto_repair = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoRepair() {
      
      autoRepair_ = false;
      onChanged();
      return this;
    }

    private com.google.container.v1beta1.AutoUpgradeOptions upgradeOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.AutoUpgradeOptions, com.google.container.v1beta1.AutoUpgradeOptions.Builder, com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder> upgradeOptionsBuilder_;
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     * @return Whether the upgradeOptions field is set.
     */
    public boolean hasUpgradeOptions() {
      return upgradeOptionsBuilder_ != null || upgradeOptions_ != null;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     * @return The upgradeOptions.
     */
    public com.google.container.v1beta1.AutoUpgradeOptions getUpgradeOptions() {
      if (upgradeOptionsBuilder_ == null) {
        return upgradeOptions_ == null ? com.google.container.v1beta1.AutoUpgradeOptions.getDefaultInstance() : upgradeOptions_;
      } else {
        return upgradeOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder setUpgradeOptions(com.google.container.v1beta1.AutoUpgradeOptions value) {
      if (upgradeOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upgradeOptions_ = value;
        onChanged();
      } else {
        upgradeOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder setUpgradeOptions(
        com.google.container.v1beta1.AutoUpgradeOptions.Builder builderForValue) {
      if (upgradeOptionsBuilder_ == null) {
        upgradeOptions_ = builderForValue.build();
        onChanged();
      } else {
        upgradeOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder mergeUpgradeOptions(com.google.container.v1beta1.AutoUpgradeOptions value) {
      if (upgradeOptionsBuilder_ == null) {
        if (upgradeOptions_ != null) {
          upgradeOptions_ =
            com.google.container.v1beta1.AutoUpgradeOptions.newBuilder(upgradeOptions_).mergeFrom(value).buildPartial();
        } else {
          upgradeOptions_ = value;
        }
        onChanged();
      } else {
        upgradeOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public Builder clearUpgradeOptions() {
      if (upgradeOptionsBuilder_ == null) {
        upgradeOptions_ = null;
        onChanged();
      } else {
        upgradeOptions_ = null;
        upgradeOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public com.google.container.v1beta1.AutoUpgradeOptions.Builder getUpgradeOptionsBuilder() {
      
      onChanged();
      return getUpgradeOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    public com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder getUpgradeOptionsOrBuilder() {
      if (upgradeOptionsBuilder_ != null) {
        return upgradeOptionsBuilder_.getMessageOrBuilder();
      } else {
        return upgradeOptions_ == null ?
            com.google.container.v1beta1.AutoUpgradeOptions.getDefaultInstance() : upgradeOptions_;
      }
    }
    /**
     * <pre>
     * Specifies the Auto Upgrade knobs for the node pool.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.AutoUpgradeOptions, com.google.container.v1beta1.AutoUpgradeOptions.Builder, com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder> 
        getUpgradeOptionsFieldBuilder() {
      if (upgradeOptionsBuilder_ == null) {
        upgradeOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.AutoUpgradeOptions, com.google.container.v1beta1.AutoUpgradeOptions.Builder, com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder>(
                getUpgradeOptions(),
                getParentForChildren(),
                isClean());
        upgradeOptions_ = null;
      }
      return upgradeOptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NodeManagement)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NodeManagement)
  private static final com.google.container.v1beta1.NodeManagement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NodeManagement();
  }

  public static com.google.container.v1beta1.NodeManagement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeManagement>
      PARSER = new com.google.protobuf.AbstractParser<NodeManagement>() {
    @java.lang.Override
    public NodeManagement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeManagement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeManagement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeManagement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NodeManagement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

