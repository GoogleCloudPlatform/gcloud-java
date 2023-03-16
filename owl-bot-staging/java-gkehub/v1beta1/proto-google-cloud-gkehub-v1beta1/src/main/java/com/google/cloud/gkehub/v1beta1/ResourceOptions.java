// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

/**
 * <pre>
 * ResourceOptions represent options for Kubernetes resource generation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.ResourceOptions}
 */
public final class ResourceOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.ResourceOptions)
    ResourceOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceOptions.newBuilder() to construct.
  private ResourceOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceOptions() {
    connectVersion_ = "";
    k8SVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.ResourceOptions.class, com.google.cloud.gkehub.v1beta1.ResourceOptions.Builder.class);
  }

  public static final int CONNECT_VERSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectVersion_ = "";
  /**
   * <pre>
   * Optional. The Connect agent version to use for connect_resources. Defaults to the
   * latest GKE Connect version. The version must be a currently supported
   * version, obsolete versions will be rejected.
   * </pre>
   *
   * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The connectVersion.
   */
  @java.lang.Override
  public java.lang.String getConnectVersion() {
    java.lang.Object ref = connectVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The Connect agent version to use for connect_resources. Defaults to the
   * latest GKE Connect version. The version must be a currently supported
   * version, obsolete versions will be rejected.
   * </pre>
   *
   * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for connectVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConnectVersionBytes() {
    java.lang.Object ref = connectVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int V1BETA1_CRD_FIELD_NUMBER = 2;
  private boolean v1Beta1Crd_ = false;
  /**
   * <pre>
   * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
   * CustomResourceDefinition resources.
   * This option should be set for clusters with Kubernetes apiserver versions
   * &lt;1.16.
   * </pre>
   *
   * <code>bool v1beta1_crd = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The v1beta1Crd.
   */
  @java.lang.Override
  public boolean getV1Beta1Crd() {
    return v1Beta1Crd_;
  }

  public static final int K8S_VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object k8SVersion_ = "";
  /**
   * <pre>
   * Optional. Major version of the Kubernetes cluster. This is only used to determine
   * which version to use for the CustomResourceDefinition resources,
   * `apiextensions/v1beta1` or`apiextensions/v1`.
   * </pre>
   *
   * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The k8sVersion.
   */
  @java.lang.Override
  public java.lang.String getK8SVersion() {
    java.lang.Object ref = k8SVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      k8SVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Major version of the Kubernetes cluster. This is only used to determine
   * which version to use for the CustomResourceDefinition resources,
   * `apiextensions/v1beta1` or`apiextensions/v1`.
   * </pre>
   *
   * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for k8sVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getK8SVersionBytes() {
    java.lang.Object ref = k8SVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      k8SVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, connectVersion_);
    }
    if (v1Beta1Crd_ != false) {
      output.writeBool(2, v1Beta1Crd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(k8SVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, k8SVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, connectVersion_);
    }
    if (v1Beta1Crd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, v1Beta1Crd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(k8SVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, k8SVersion_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.ResourceOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.ResourceOptions other = (com.google.cloud.gkehub.v1beta1.ResourceOptions) obj;

    if (!getConnectVersion()
        .equals(other.getConnectVersion())) return false;
    if (getV1Beta1Crd()
        != other.getV1Beta1Crd()) return false;
    if (!getK8SVersion()
        .equals(other.getK8SVersion())) return false;
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
    hash = (37 * hash) + CONNECT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getConnectVersion().hashCode();
    hash = (37 * hash) + V1BETA1_CRD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getV1Beta1Crd());
    hash = (37 * hash) + K8S_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getK8SVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ResourceOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.ResourceOptions prototype) {
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
   * ResourceOptions represent options for Kubernetes resource generation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.ResourceOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.ResourceOptions)
      com.google.cloud.gkehub.v1beta1.ResourceOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.ResourceOptions.class, com.google.cloud.gkehub.v1beta1.ResourceOptions.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.ResourceOptions.newBuilder()
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
      connectVersion_ = "";
      v1Beta1Crd_ = false;
      k8SVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ResourceOptions getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.ResourceOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ResourceOptions build() {
      com.google.cloud.gkehub.v1beta1.ResourceOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ResourceOptions buildPartial() {
      com.google.cloud.gkehub.v1beta1.ResourceOptions result = new com.google.cloud.gkehub.v1beta1.ResourceOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1beta1.ResourceOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectVersion_ = connectVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.v1Beta1Crd_ = v1Beta1Crd_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.k8SVersion_ = k8SVersion_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.ResourceOptions) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.ResourceOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.ResourceOptions other) {
      if (other == com.google.cloud.gkehub.v1beta1.ResourceOptions.getDefaultInstance()) return this;
      if (!other.getConnectVersion().isEmpty()) {
        connectVersion_ = other.connectVersion_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getV1Beta1Crd() != false) {
        setV1Beta1Crd(other.getV1Beta1Crd());
      }
      if (!other.getK8SVersion().isEmpty()) {
        k8SVersion_ = other.k8SVersion_;
        bitField0_ |= 0x00000004;
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
              connectVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              v1Beta1Crd_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              k8SVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object connectVersion_ = "";
    /**
     * <pre>
     * Optional. The Connect agent version to use for connect_resources. Defaults to the
     * latest GKE Connect version. The version must be a currently supported
     * version, obsolete versions will be rejected.
     * </pre>
     *
     * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The connectVersion.
     */
    public java.lang.String getConnectVersion() {
      java.lang.Object ref = connectVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The Connect agent version to use for connect_resources. Defaults to the
     * latest GKE Connect version. The version must be a currently supported
     * version, obsolete versions will be rejected.
     * </pre>
     *
     * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for connectVersion.
     */
    public com.google.protobuf.ByteString
        getConnectVersionBytes() {
      java.lang.Object ref = connectVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The Connect agent version to use for connect_resources. Defaults to the
     * latest GKE Connect version. The version must be a currently supported
     * version, obsolete versions will be rejected.
     * </pre>
     *
     * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The connectVersion to set.
     * @return This builder for chaining.
     */
    public Builder setConnectVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The Connect agent version to use for connect_resources. Defaults to the
     * latest GKE Connect version. The version must be a currently supported
     * version, obsolete versions will be rejected.
     * </pre>
     *
     * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectVersion() {
      connectVersion_ = getDefaultInstance().getConnectVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The Connect agent version to use for connect_resources. Defaults to the
     * latest GKE Connect version. The version must be a currently supported
     * version, obsolete versions will be rejected.
     * </pre>
     *
     * <code>string connect_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for connectVersion to set.
     * @return This builder for chaining.
     */
    public Builder setConnectVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean v1Beta1Crd_ ;
    /**
     * <pre>
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
     * CustomResourceDefinition resources.
     * This option should be set for clusters with Kubernetes apiserver versions
     * &lt;1.16.
     * </pre>
     *
     * <code>bool v1beta1_crd = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The v1beta1Crd.
     */
    @java.lang.Override
    public boolean getV1Beta1Crd() {
      return v1Beta1Crd_;
    }
    /**
     * <pre>
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
     * CustomResourceDefinition resources.
     * This option should be set for clusters with Kubernetes apiserver versions
     * &lt;1.16.
     * </pre>
     *
     * <code>bool v1beta1_crd = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The v1beta1Crd to set.
     * @return This builder for chaining.
     */
    public Builder setV1Beta1Crd(boolean value) {
      
      v1Beta1Crd_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for
     * CustomResourceDefinition resources.
     * This option should be set for clusters with Kubernetes apiserver versions
     * &lt;1.16.
     * </pre>
     *
     * <code>bool v1beta1_crd = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearV1Beta1Crd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      v1Beta1Crd_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object k8SVersion_ = "";
    /**
     * <pre>
     * Optional. Major version of the Kubernetes cluster. This is only used to determine
     * which version to use for the CustomResourceDefinition resources,
     * `apiextensions/v1beta1` or`apiextensions/v1`.
     * </pre>
     *
     * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The k8sVersion.
     */
    public java.lang.String getK8SVersion() {
      java.lang.Object ref = k8SVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        k8SVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Major version of the Kubernetes cluster. This is only used to determine
     * which version to use for the CustomResourceDefinition resources,
     * `apiextensions/v1beta1` or`apiextensions/v1`.
     * </pre>
     *
     * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for k8sVersion.
     */
    public com.google.protobuf.ByteString
        getK8SVersionBytes() {
      java.lang.Object ref = k8SVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        k8SVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Major version of the Kubernetes cluster. This is only used to determine
     * which version to use for the CustomResourceDefinition resources,
     * `apiextensions/v1beta1` or`apiextensions/v1`.
     * </pre>
     *
     * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The k8sVersion to set.
     * @return This builder for chaining.
     */
    public Builder setK8SVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      k8SVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Major version of the Kubernetes cluster. This is only used to determine
     * which version to use for the CustomResourceDefinition resources,
     * `apiextensions/v1beta1` or`apiextensions/v1`.
     * </pre>
     *
     * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearK8SVersion() {
      k8SVersion_ = getDefaultInstance().getK8SVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Major version of the Kubernetes cluster. This is only used to determine
     * which version to use for the CustomResourceDefinition resources,
     * `apiextensions/v1beta1` or`apiextensions/v1`.
     * </pre>
     *
     * <code>string k8s_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for k8sVersion to set.
     * @return This builder for chaining.
     */
    public Builder setK8SVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      k8SVersion_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.ResourceOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.ResourceOptions)
  private static final com.google.cloud.gkehub.v1beta1.ResourceOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.ResourceOptions();
  }

  public static com.google.cloud.gkehub.v1beta1.ResourceOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceOptions>
      PARSER = new com.google.protobuf.AbstractParser<ResourceOptions>() {
    @java.lang.Override
    public ResourceOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ResourceOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

