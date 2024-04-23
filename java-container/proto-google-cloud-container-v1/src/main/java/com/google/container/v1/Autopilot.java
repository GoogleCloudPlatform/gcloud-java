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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Autopilot is the configuration for Autopilot settings on the cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.Autopilot}
 */
public final class Autopilot extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.Autopilot)
    AutopilotOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Autopilot.newBuilder() to construct.
  private Autopilot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Autopilot() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Autopilot();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_Autopilot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_Autopilot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.Autopilot.class,
            com.google.container.v1.Autopilot.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   *
   *
   * <pre>
   * Enable Autopilot
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int WORKLOAD_POLICY_CONFIG_FIELD_NUMBER = 2;
  private com.google.container.v1.WorkloadPolicyConfig workloadPolicyConfig_;
  /**
   *
   *
   * <pre>
   * Workload policy configuration for Autopilot.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
   *
   * @return Whether the workloadPolicyConfig field is set.
   */
  @java.lang.Override
  public boolean hasWorkloadPolicyConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Workload policy configuration for Autopilot.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
   *
   * @return The workloadPolicyConfig.
   */
  @java.lang.Override
  public com.google.container.v1.WorkloadPolicyConfig getWorkloadPolicyConfig() {
    return workloadPolicyConfig_ == null
        ? com.google.container.v1.WorkloadPolicyConfig.getDefaultInstance()
        : workloadPolicyConfig_;
  }
  /**
   *
   *
   * <pre>
   * Workload policy configuration for Autopilot.
   * </pre>
   *
   * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
   */
  @java.lang.Override
  public com.google.container.v1.WorkloadPolicyConfigOrBuilder getWorkloadPolicyConfigOrBuilder() {
    return workloadPolicyConfig_ == null
        ? com.google.container.v1.WorkloadPolicyConfig.getDefaultInstance()
        : workloadPolicyConfig_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getWorkloadPolicyConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWorkloadPolicyConfig());
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
    if (!(obj instanceof com.google.container.v1.Autopilot)) {
      return super.equals(obj);
    }
    com.google.container.v1.Autopilot other = (com.google.container.v1.Autopilot) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (hasWorkloadPolicyConfig() != other.hasWorkloadPolicyConfig()) return false;
    if (hasWorkloadPolicyConfig()) {
      if (!getWorkloadPolicyConfig().equals(other.getWorkloadPolicyConfig())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    if (hasWorkloadPolicyConfig()) {
      hash = (37 * hash) + WORKLOAD_POLICY_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getWorkloadPolicyConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.Autopilot parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.Autopilot parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.Autopilot parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.Autopilot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.Autopilot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.Autopilot parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.Autopilot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.Autopilot parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.Autopilot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.Autopilot parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.Autopilot parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.Autopilot parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.Autopilot prototype) {
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
   * Autopilot is the configuration for Autopilot settings on the cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.Autopilot}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.Autopilot)
      com.google.container.v1.AutopilotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_Autopilot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_Autopilot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.Autopilot.class,
              com.google.container.v1.Autopilot.Builder.class);
    }

    // Construct using com.google.container.v1.Autopilot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWorkloadPolicyConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      workloadPolicyConfig_ = null;
      if (workloadPolicyConfigBuilder_ != null) {
        workloadPolicyConfigBuilder_.dispose();
        workloadPolicyConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_Autopilot_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.Autopilot getDefaultInstanceForType() {
      return com.google.container.v1.Autopilot.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.Autopilot build() {
      com.google.container.v1.Autopilot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.Autopilot buildPartial() {
      com.google.container.v1.Autopilot result = new com.google.container.v1.Autopilot(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.Autopilot result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workloadPolicyConfig_ =
            workloadPolicyConfigBuilder_ == null
                ? workloadPolicyConfig_
                : workloadPolicyConfigBuilder_.build();
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
      if (other instanceof com.google.container.v1.Autopilot) {
        return mergeFrom((com.google.container.v1.Autopilot) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.Autopilot other) {
      if (other == com.google.container.v1.Autopilot.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.hasWorkloadPolicyConfig()) {
        mergeWorkloadPolicyConfig(other.getWorkloadPolicyConfig());
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
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getWorkloadPolicyConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Enable Autopilot
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Enable Autopilot
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
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
     *
     *
     * <pre>
     * Enable Autopilot
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.container.v1.WorkloadPolicyConfig workloadPolicyConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.WorkloadPolicyConfig,
            com.google.container.v1.WorkloadPolicyConfig.Builder,
            com.google.container.v1.WorkloadPolicyConfigOrBuilder>
        workloadPolicyConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     *
     * @return Whether the workloadPolicyConfig field is set.
     */
    public boolean hasWorkloadPolicyConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     *
     * @return The workloadPolicyConfig.
     */
    public com.google.container.v1.WorkloadPolicyConfig getWorkloadPolicyConfig() {
      if (workloadPolicyConfigBuilder_ == null) {
        return workloadPolicyConfig_ == null
            ? com.google.container.v1.WorkloadPolicyConfig.getDefaultInstance()
            : workloadPolicyConfig_;
      } else {
        return workloadPolicyConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public Builder setWorkloadPolicyConfig(com.google.container.v1.WorkloadPolicyConfig value) {
      if (workloadPolicyConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workloadPolicyConfig_ = value;
      } else {
        workloadPolicyConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public Builder setWorkloadPolicyConfig(
        com.google.container.v1.WorkloadPolicyConfig.Builder builderForValue) {
      if (workloadPolicyConfigBuilder_ == null) {
        workloadPolicyConfig_ = builderForValue.build();
      } else {
        workloadPolicyConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public Builder mergeWorkloadPolicyConfig(com.google.container.v1.WorkloadPolicyConfig value) {
      if (workloadPolicyConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && workloadPolicyConfig_ != null
            && workloadPolicyConfig_
                != com.google.container.v1.WorkloadPolicyConfig.getDefaultInstance()) {
          getWorkloadPolicyConfigBuilder().mergeFrom(value);
        } else {
          workloadPolicyConfig_ = value;
        }
      } else {
        workloadPolicyConfigBuilder_.mergeFrom(value);
      }
      if (workloadPolicyConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public Builder clearWorkloadPolicyConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      workloadPolicyConfig_ = null;
      if (workloadPolicyConfigBuilder_ != null) {
        workloadPolicyConfigBuilder_.dispose();
        workloadPolicyConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public com.google.container.v1.WorkloadPolicyConfig.Builder getWorkloadPolicyConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWorkloadPolicyConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    public com.google.container.v1.WorkloadPolicyConfigOrBuilder
        getWorkloadPolicyConfigOrBuilder() {
      if (workloadPolicyConfigBuilder_ != null) {
        return workloadPolicyConfigBuilder_.getMessageOrBuilder();
      } else {
        return workloadPolicyConfig_ == null
            ? com.google.container.v1.WorkloadPolicyConfig.getDefaultInstance()
            : workloadPolicyConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Workload policy configuration for Autopilot.
     * </pre>
     *
     * <code>.google.container.v1.WorkloadPolicyConfig workload_policy_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.WorkloadPolicyConfig,
            com.google.container.v1.WorkloadPolicyConfig.Builder,
            com.google.container.v1.WorkloadPolicyConfigOrBuilder>
        getWorkloadPolicyConfigFieldBuilder() {
      if (workloadPolicyConfigBuilder_ == null) {
        workloadPolicyConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.WorkloadPolicyConfig,
                com.google.container.v1.WorkloadPolicyConfig.Builder,
                com.google.container.v1.WorkloadPolicyConfigOrBuilder>(
                getWorkloadPolicyConfig(), getParentForChildren(), isClean());
        workloadPolicyConfig_ = null;
      }
      return workloadPolicyConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.Autopilot)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.Autopilot)
  private static final com.google.container.v1.Autopilot DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.Autopilot();
  }

  public static com.google.container.v1.Autopilot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Autopilot> PARSER =
      new com.google.protobuf.AbstractParser<Autopilot>() {
        @java.lang.Override
        public Autopilot parsePartialFrom(
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

  public static com.google.protobuf.Parser<Autopilot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Autopilot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.Autopilot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
