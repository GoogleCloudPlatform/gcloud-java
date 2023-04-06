/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Configuration options for Cloud Armor Adaptive Protection (CAAP).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig}
 */
public final class SecurityPolicyAdaptiveProtectionConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)
    SecurityPolicyAdaptiveProtectionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecurityPolicyAdaptiveProtectionConfig.newBuilder() to construct.
  private SecurityPolicyAdaptiveProtectionConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityPolicyAdaptiveProtectionConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityPolicyAdaptiveProtectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyAdaptiveProtectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyAdaptiveProtectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig.class,
            com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig.Builder.class);
  }

  private int bitField0_;
  public static final int LAYER7_DDOS_DEFENSE_CONFIG_FIELD_NUMBER = 437316771;
  private com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
      layer7DdosDefenseConfig_;
  /**
   *
   *
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
   * </code>
   *
   * @return Whether the layer7DdosDefenseConfig field is set.
   */
  @java.lang.Override
  public boolean hasLayer7DdosDefenseConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
   * </code>
   *
   * @return The layer7DdosDefenseConfig.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
      getLayer7DdosDefenseConfig() {
    return layer7DdosDefenseConfig_ == null
        ? com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
            .getDefaultInstance()
        : layer7DdosDefenseConfig_;
  }
  /**
   *
   *
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1
          .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder
      getLayer7DdosDefenseConfigOrBuilder() {
    return layer7DdosDefenseConfig_ == null
        ? com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
            .getDefaultInstance()
        : layer7DdosDefenseConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(437316771, getLayer7DdosDefenseConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              437316771, getLayer7DdosDefenseConfig());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig other =
        (com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig) obj;

    if (hasLayer7DdosDefenseConfig() != other.hasLayer7DdosDefenseConfig()) return false;
    if (hasLayer7DdosDefenseConfig()) {
      if (!getLayer7DdosDefenseConfig().equals(other.getLayer7DdosDefenseConfig())) return false;
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
    if (hasLayer7DdosDefenseConfig()) {
      hash = (37 * hash) + LAYER7_DDOS_DEFENSE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getLayer7DdosDefenseConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig prototype) {
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
   * Configuration options for Cloud Armor Adaptive Protection (CAAP).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)
      com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyAdaptiveProtectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyAdaptiveProtectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig.class,
              com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLayer7DdosDefenseConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      layer7DdosDefenseConfig_ = null;
      if (layer7DdosDefenseConfigBuilder_ != null) {
        layer7DdosDefenseConfigBuilder_.dispose();
        layer7DdosDefenseConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyAdaptiveProtectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig build() {
      com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig buildPartial() {
      com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig result =
          new com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.layer7DdosDefenseConfig_ =
            layer7DdosDefenseConfigBuilder_ == null
                ? layer7DdosDefenseConfig_
                : layer7DdosDefenseConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig) {
        return mergeFrom(
            (com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig other) {
      if (other
          == com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
              .getDefaultInstance()) return this;
      if (other.hasLayer7DdosDefenseConfig()) {
        mergeLayer7DdosDefenseConfig(other.getLayer7DdosDefenseConfig());
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
            case -796433126:
              {
                input.readMessage(
                    getLayer7DdosDefenseConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case -796433126
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

    private com.google.cloud.compute.v1
            .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
        layer7DdosDefenseConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig,
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig.Builder,
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder>
        layer7DdosDefenseConfigBuilder_;
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     *
     * @return Whether the layer7DdosDefenseConfig field is set.
     */
    public boolean hasLayer7DdosDefenseConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     *
     * @return The layer7DdosDefenseConfig.
     */
    public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
        getLayer7DdosDefenseConfig() {
      if (layer7DdosDefenseConfigBuilder_ == null) {
        return layer7DdosDefenseConfig_ == null
            ? com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig.getDefaultInstance()
            : layer7DdosDefenseConfig_;
      } else {
        return layer7DdosDefenseConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public Builder setLayer7DdosDefenseConfig(
        com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
            value) {
      if (layer7DdosDefenseConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        layer7DdosDefenseConfig_ = value;
      } else {
        layer7DdosDefenseConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public Builder setLayer7DdosDefenseConfig(
        com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
                .Builder
            builderForValue) {
      if (layer7DdosDefenseConfigBuilder_ == null) {
        layer7DdosDefenseConfig_ = builderForValue.build();
      } else {
        layer7DdosDefenseConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public Builder mergeLayer7DdosDefenseConfig(
        com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
            value) {
      if (layer7DdosDefenseConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && layer7DdosDefenseConfig_ != null
            && layer7DdosDefenseConfig_
                != com.google.cloud.compute.v1
                    .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
                    .getDefaultInstance()) {
          getLayer7DdosDefenseConfigBuilder().mergeFrom(value);
        } else {
          layer7DdosDefenseConfig_ = value;
        }
      } else {
        layer7DdosDefenseConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public Builder clearLayer7DdosDefenseConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      layer7DdosDefenseConfig_ = null;
      if (layer7DdosDefenseConfigBuilder_ != null) {
        layer7DdosDefenseConfigBuilder_.dispose();
        layer7DdosDefenseConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig
            .Builder
        getLayer7DdosDefenseConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLayer7DdosDefenseConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    public com.google.cloud.compute.v1
            .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder
        getLayer7DdosDefenseConfigOrBuilder() {
      if (layer7DdosDefenseConfigBuilder_ != null) {
        return layer7DdosDefenseConfigBuilder_.getMessageOrBuilder();
      } else {
        return layer7DdosDefenseConfig_ == null
            ? com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig.getDefaultInstance()
            : layer7DdosDefenseConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * If set to true, enables Cloud Armor Machine Learning.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig,
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig.Builder,
            com.google.cloud.compute.v1
                .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder>
        getLayer7DdosDefenseConfigFieldBuilder() {
      if (layer7DdosDefenseConfigBuilder_ == null) {
        layer7DdosDefenseConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1
                    .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig,
                com.google.cloud.compute.v1
                    .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig.Builder,
                com.google.cloud.compute.v1
                    .SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder>(
                getLayer7DdosDefenseConfig(), getParentForChildren(), isClean());
        layer7DdosDefenseConfig_ = null;
      }
      return layer7DdosDefenseConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)
  private static final com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig();
  }

  public static com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityPolicyAdaptiveProtectionConfig> PARSER =
      new com.google.protobuf.AbstractParser<SecurityPolicyAdaptiveProtectionConfig>() {
        @java.lang.Override
        public SecurityPolicyAdaptiveProtectionConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityPolicyAdaptiveProtectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityPolicyAdaptiveProtectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
