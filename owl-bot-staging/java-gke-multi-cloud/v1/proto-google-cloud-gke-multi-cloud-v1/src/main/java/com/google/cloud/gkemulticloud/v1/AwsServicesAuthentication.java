// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Authentication configuration for the management of AWS resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsServicesAuthentication}
 */
public final class AwsServicesAuthentication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AwsServicesAuthentication)
    AwsServicesAuthenticationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsServicesAuthentication.newBuilder() to construct.
  private AwsServicesAuthentication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsServicesAuthentication() {
    roleArn_ = "";
    roleSessionName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsServicesAuthentication();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsServicesAuthentication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsServicesAuthentication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.class, com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.Builder.class);
  }

  public static final int ROLE_ARN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object roleArn_ = "";
  /**
   * <pre>
   * Required. The Amazon Resource Name (ARN) of the role that the Anthos
   * Multi-Cloud API will assume when managing AWS resources on your account.
   * </pre>
   *
   * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The roleArn.
   */
  @java.lang.Override
  public java.lang.String getRoleArn() {
    java.lang.Object ref = roleArn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleArn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The Amazon Resource Name (ARN) of the role that the Anthos
   * Multi-Cloud API will assume when managing AWS resources on your account.
   * </pre>
   *
   * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for roleArn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleArnBytes() {
    java.lang.Object ref = roleArn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleArn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_SESSION_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object roleSessionName_ = "";
  /**
   * <pre>
   * Optional. An identifier for the assumed role session.
   *
   * When unspecified, it defaults to `multicloud-service-agent`.
   * </pre>
   *
   * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The roleSessionName.
   */
  @java.lang.Override
  public java.lang.String getRoleSessionName() {
    java.lang.Object ref = roleSessionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleSessionName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. An identifier for the assumed role session.
   *
   * When unspecified, it defaults to `multicloud-service-agent`.
   * </pre>
   *
   * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for roleSessionName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoleSessionNameBytes() {
    java.lang.Object ref = roleSessionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleSessionName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roleArn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, roleArn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roleSessionName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roleSessionName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roleArn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, roleArn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roleSessionName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roleSessionName_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication other = (com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication) obj;

    if (!getRoleArn()
        .equals(other.getRoleArn())) return false;
    if (!getRoleSessionName()
        .equals(other.getRoleSessionName())) return false;
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
    hash = (37 * hash) + ROLE_ARN_FIELD_NUMBER;
    hash = (53 * hash) + getRoleArn().hashCode();
    hash = (37 * hash) + ROLE_SESSION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoleSessionName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication prototype) {
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
   * Authentication configuration for the management of AWS resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsServicesAuthentication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AwsServicesAuthentication)
      com.google.cloud.gkemulticloud.v1.AwsServicesAuthenticationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsServicesAuthentication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsServicesAuthentication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.class, com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.newBuilder()
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
      roleArn_ = "";
      roleSessionName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto.internal_static_google_cloud_gkemulticloud_v1_AwsServicesAuthentication_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication build() {
      com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication buildPartial() {
      com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication result = new com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.roleArn_ = roleArn_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.roleSessionName_ = roleSessionName_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication other) {
      if (other == com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication.getDefaultInstance()) return this;
      if (!other.getRoleArn().isEmpty()) {
        roleArn_ = other.roleArn_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRoleSessionName().isEmpty()) {
        roleSessionName_ = other.roleSessionName_;
        bitField0_ |= 0x00000002;
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
              roleArn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              roleSessionName_ = input.readStringRequireUtf8();
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

    private java.lang.Object roleArn_ = "";
    /**
     * <pre>
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos
     * Multi-Cloud API will assume when managing AWS resources on your account.
     * </pre>
     *
     * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The roleArn.
     */
    public java.lang.String getRoleArn() {
      java.lang.Object ref = roleArn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleArn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos
     * Multi-Cloud API will assume when managing AWS resources on your account.
     * </pre>
     *
     * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for roleArn.
     */
    public com.google.protobuf.ByteString
        getRoleArnBytes() {
      java.lang.Object ref = roleArn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleArn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos
     * Multi-Cloud API will assume when managing AWS resources on your account.
     * </pre>
     *
     * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The roleArn to set.
     * @return This builder for chaining.
     */
    public Builder setRoleArn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      roleArn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos
     * Multi-Cloud API will assume when managing AWS resources on your account.
     * </pre>
     *
     * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleArn() {
      roleArn_ = getDefaultInstance().getRoleArn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Amazon Resource Name (ARN) of the role that the Anthos
     * Multi-Cloud API will assume when managing AWS resources on your account.
     * </pre>
     *
     * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for roleArn to set.
     * @return This builder for chaining.
     */
    public Builder setRoleArnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      roleArn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object roleSessionName_ = "";
    /**
     * <pre>
     * Optional. An identifier for the assumed role session.
     *
     * When unspecified, it defaults to `multicloud-service-agent`.
     * </pre>
     *
     * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The roleSessionName.
     */
    public java.lang.String getRoleSessionName() {
      java.lang.Object ref = roleSessionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleSessionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. An identifier for the assumed role session.
     *
     * When unspecified, it defaults to `multicloud-service-agent`.
     * </pre>
     *
     * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for roleSessionName.
     */
    public com.google.protobuf.ByteString
        getRoleSessionNameBytes() {
      java.lang.Object ref = roleSessionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleSessionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. An identifier for the assumed role session.
     *
     * When unspecified, it defaults to `multicloud-service-agent`.
     * </pre>
     *
     * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The roleSessionName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleSessionName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      roleSessionName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An identifier for the assumed role session.
     *
     * When unspecified, it defaults to `multicloud-service-agent`.
     * </pre>
     *
     * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleSessionName() {
      roleSessionName_ = getDefaultInstance().getRoleSessionName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An identifier for the assumed role session.
     *
     * When unspecified, it defaults to `multicloud-service-agent`.
     * </pre>
     *
     * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for roleSessionName to set.
     * @return This builder for chaining.
     */
    public Builder setRoleSessionNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      roleSessionName_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AwsServicesAuthentication)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AwsServicesAuthentication)
  private static final com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication();
  }

  public static com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsServicesAuthentication>
      PARSER = new com.google.protobuf.AbstractParser<AwsServicesAuthentication>() {
    @java.lang.Override
    public AwsServicesAuthentication parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsServicesAuthentication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsServicesAuthentication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsServicesAuthentication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

