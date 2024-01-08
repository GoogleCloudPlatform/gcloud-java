/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Details of a proxy config.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AttachedProxyConfig}
 */
public final class AttachedProxyConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AttachedProxyConfig)
    AttachedProxyConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AttachedProxyConfig.newBuilder() to construct.
  private AttachedProxyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AttachedProxyConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AttachedProxyConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.class,
            com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.Builder.class);
  }

  public static final int KUBERNETES_SECRET_FIELD_NUMBER = 1;
  private com.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetesSecret_;
  /**
   *
   *
   * <pre>
   * The Kubernetes Secret resource that contains the HTTP(S) proxy
   * configuration. The secret must be a JSON encoded proxy configuration
   * as described in
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
   *
   * @return Whether the kubernetesSecret field is set.
   */
  @java.lang.Override
  public boolean hasKubernetesSecret() {
    return kubernetesSecret_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Kubernetes Secret resource that contains the HTTP(S) proxy
   * configuration. The secret must be a JSON encoded proxy configuration
   * as described in
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
   *
   * @return The kubernetesSecret.
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.KubernetesSecret getKubernetesSecret() {
    return kubernetesSecret_ == null
        ? com.google.cloud.gkemulticloud.v1.KubernetesSecret.getDefaultInstance()
        : kubernetesSecret_;
  }
  /**
   *
   *
   * <pre>
   * The Kubernetes Secret resource that contains the HTTP(S) proxy
   * configuration. The secret must be a JSON encoded proxy configuration
   * as described in
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.KubernetesSecretOrBuilder
      getKubernetesSecretOrBuilder() {
    return kubernetesSecret_ == null
        ? com.google.cloud.gkemulticloud.v1.KubernetesSecret.getDefaultInstance()
        : kubernetesSecret_;
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
    if (kubernetesSecret_ != null) {
      output.writeMessage(1, getKubernetesSecret());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kubernetesSecret_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getKubernetesSecret());
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AttachedProxyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AttachedProxyConfig other =
        (com.google.cloud.gkemulticloud.v1.AttachedProxyConfig) obj;

    if (hasKubernetesSecret() != other.hasKubernetesSecret()) return false;
    if (hasKubernetesSecret()) {
      if (!getKubernetesSecret().equals(other.getKubernetesSecret())) return false;
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
    if (hasKubernetesSecret()) {
      hash = (37 * hash) + KUBERNETES_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getKubernetesSecret().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig parseFrom(
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
      com.google.cloud.gkemulticloud.v1.AttachedProxyConfig prototype) {
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
   * Details of a proxy config.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AttachedProxyConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AttachedProxyConfig)
      com.google.cloud.gkemulticloud.v1.AttachedProxyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.class,
              com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kubernetesSecret_ = null;
      if (kubernetesSecretBuilder_ != null) {
        kubernetesSecretBuilder_.dispose();
        kubernetesSecretBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedProxyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedProxyConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedProxyConfig build() {
      com.google.cloud.gkemulticloud.v1.AttachedProxyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedProxyConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AttachedProxyConfig result =
          new com.google.cloud.gkemulticloud.v1.AttachedProxyConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AttachedProxyConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kubernetesSecret_ =
            kubernetesSecretBuilder_ == null ? kubernetesSecret_ : kubernetesSecretBuilder_.build();
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AttachedProxyConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AttachedProxyConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AttachedProxyConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AttachedProxyConfig.getDefaultInstance())
        return this;
      if (other.hasKubernetesSecret()) {
        mergeKubernetesSecret(other.getKubernetesSecret());
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
            case 10:
              {
                input.readMessage(
                    getKubernetesSecretFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetesSecret_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.KubernetesSecret,
            com.google.cloud.gkemulticloud.v1.KubernetesSecret.Builder,
            com.google.cloud.gkemulticloud.v1.KubernetesSecretOrBuilder>
        kubernetesSecretBuilder_;
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     *
     * @return Whether the kubernetesSecret field is set.
     */
    public boolean hasKubernetesSecret() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     *
     * @return The kubernetesSecret.
     */
    public com.google.cloud.gkemulticloud.v1.KubernetesSecret getKubernetesSecret() {
      if (kubernetesSecretBuilder_ == null) {
        return kubernetesSecret_ == null
            ? com.google.cloud.gkemulticloud.v1.KubernetesSecret.getDefaultInstance()
            : kubernetesSecret_;
      } else {
        return kubernetesSecretBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public Builder setKubernetesSecret(com.google.cloud.gkemulticloud.v1.KubernetesSecret value) {
      if (kubernetesSecretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kubernetesSecret_ = value;
      } else {
        kubernetesSecretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public Builder setKubernetesSecret(
        com.google.cloud.gkemulticloud.v1.KubernetesSecret.Builder builderForValue) {
      if (kubernetesSecretBuilder_ == null) {
        kubernetesSecret_ = builderForValue.build();
      } else {
        kubernetesSecretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public Builder mergeKubernetesSecret(com.google.cloud.gkemulticloud.v1.KubernetesSecret value) {
      if (kubernetesSecretBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && kubernetesSecret_ != null
            && kubernetesSecret_
                != com.google.cloud.gkemulticloud.v1.KubernetesSecret.getDefaultInstance()) {
          getKubernetesSecretBuilder().mergeFrom(value);
        } else {
          kubernetesSecret_ = value;
        }
      } else {
        kubernetesSecretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public Builder clearKubernetesSecret() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kubernetesSecret_ = null;
      if (kubernetesSecretBuilder_ != null) {
        kubernetesSecretBuilder_.dispose();
        kubernetesSecretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.KubernetesSecret.Builder getKubernetesSecretBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKubernetesSecretFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.KubernetesSecretOrBuilder
        getKubernetesSecretOrBuilder() {
      if (kubernetesSecretBuilder_ != null) {
        return kubernetesSecretBuilder_.getMessageOrBuilder();
      } else {
        return kubernetesSecret_ == null
            ? com.google.cloud.gkemulticloud.v1.KubernetesSecret.getDefaultInstance()
            : kubernetesSecret_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Kubernetes Secret resource that contains the HTTP(S) proxy
     * configuration. The secret must be a JSON encoded proxy configuration
     * as described in
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.KubernetesSecret kubernetes_secret = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.KubernetesSecret,
            com.google.cloud.gkemulticloud.v1.KubernetesSecret.Builder,
            com.google.cloud.gkemulticloud.v1.KubernetesSecretOrBuilder>
        getKubernetesSecretFieldBuilder() {
      if (kubernetesSecretBuilder_ == null) {
        kubernetesSecretBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkemulticloud.v1.KubernetesSecret,
                com.google.cloud.gkemulticloud.v1.KubernetesSecret.Builder,
                com.google.cloud.gkemulticloud.v1.KubernetesSecretOrBuilder>(
                getKubernetesSecret(), getParentForChildren(), isClean());
        kubernetesSecret_ = null;
      }
      return kubernetesSecretBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AttachedProxyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AttachedProxyConfig)
  private static final com.google.cloud.gkemulticloud.v1.AttachedProxyConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AttachedProxyConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedProxyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachedProxyConfig> PARSER =
      new com.google.protobuf.AbstractParser<AttachedProxyConfig>() {
        @java.lang.Override
        public AttachedProxyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttachedProxyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachedProxyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AttachedProxyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
