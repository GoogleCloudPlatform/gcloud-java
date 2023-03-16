// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * Execution using the default Cloud Build pool.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.DefaultPool}
 */
public final class DefaultPool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.DefaultPool)
    DefaultPoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DefaultPool.newBuilder() to construct.
  private DefaultPool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DefaultPool() {
    serviceAccount_ = "";
    artifactStorage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DefaultPool();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DefaultPool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DefaultPool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.DefaultPool.class, com.google.cloud.deploy.v1.DefaultPool.Builder.class);
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceAccount_ = "";
  /**
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
   * </pre>
   *
   * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The serviceAccount.
   */
  @java.lang.Override
  public java.lang.String getServiceAccount() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Google service account to use for execution. If unspecified,
   * the project execution service account
   * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
   * </pre>
   *
   * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for serviceAccount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceAccountBytes() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceAccount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARTIFACT_STORAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object artifactStorage_ = "";
  /**
   * <pre>
   * Optional. Cloud Storage location where execution outputs should be stored. This can
   * either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The artifactStorage.
   */
  @java.lang.Override
  public java.lang.String getArtifactStorage() {
    java.lang.Object ref = artifactStorage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artifactStorage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Cloud Storage location where execution outputs should be stored. This can
   * either be a bucket ("gs://my-bucket") or a path within a bucket
   * ("gs://my-bucket/my-dir").
   * If unspecified, a default bucket located in the same region will be used.
   * </pre>
   *
   * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for artifactStorage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArtifactStorageBytes() {
    java.lang.Object ref = artifactStorage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      artifactStorage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactStorage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, artifactStorage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAccount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactStorage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, artifactStorage_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.DefaultPool)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.DefaultPool other = (com.google.cloud.deploy.v1.DefaultPool) obj;

    if (!getServiceAccount()
        .equals(other.getServiceAccount())) return false;
    if (!getArtifactStorage()
        .equals(other.getArtifactStorage())) return false;
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
    hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccount().hashCode();
    hash = (37 * hash) + ARTIFACT_STORAGE_FIELD_NUMBER;
    hash = (53 * hash) + getArtifactStorage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.DefaultPool parseFrom(
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
  public static Builder newBuilder(com.google.cloud.deploy.v1.DefaultPool prototype) {
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
   * Execution using the default Cloud Build pool.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.DefaultPool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.DefaultPool)
      com.google.cloud.deploy.v1.DefaultPoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DefaultPool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DefaultPool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.DefaultPool.class, com.google.cloud.deploy.v1.DefaultPool.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.DefaultPool.newBuilder()
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
      serviceAccount_ = "";
      artifactStorage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_DefaultPool_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DefaultPool getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.DefaultPool.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DefaultPool build() {
      com.google.cloud.deploy.v1.DefaultPool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.DefaultPool buildPartial() {
      com.google.cloud.deploy.v1.DefaultPool result = new com.google.cloud.deploy.v1.DefaultPool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.DefaultPool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAccount_ = serviceAccount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.artifactStorage_ = artifactStorage_;
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
      if (other instanceof com.google.cloud.deploy.v1.DefaultPool) {
        return mergeFrom((com.google.cloud.deploy.v1.DefaultPool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.DefaultPool other) {
      if (other == com.google.cloud.deploy.v1.DefaultPool.getDefaultInstance()) return this;
      if (!other.getServiceAccount().isEmpty()) {
        serviceAccount_ = other.serviceAccount_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getArtifactStorage().isEmpty()) {
        artifactStorage_ = other.artifactStorage_;
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
              serviceAccount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              artifactStorage_ = input.readStringRequireUtf8();
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

    private java.lang.Object serviceAccount_ = "";
    /**
     * <pre>
     * Optional. Google service account to use for execution. If unspecified,
     * the project execution service account
     * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
     * </pre>
     *
     * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The serviceAccount.
     */
    public java.lang.String getServiceAccount() {
      java.lang.Object ref = serviceAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Google service account to use for execution. If unspecified,
     * the project execution service account
     * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
     * </pre>
     *
     * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for serviceAccount.
     */
    public com.google.protobuf.ByteString
        getServiceAccountBytes() {
      java.lang.Object ref = serviceAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Google service account to use for execution. If unspecified,
     * the project execution service account
     * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
     * </pre>
     *
     * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceAccount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Google service account to use for execution. If unspecified,
     * the project execution service account
     * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
     * </pre>
     *
     * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceAccount() {
      serviceAccount_ = getDefaultInstance().getServiceAccount();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Google service account to use for execution. If unspecified,
     * the project execution service account
     * (&lt;PROJECT_NUMBER&gt;-compute&#64;developer.gserviceaccount.com) will be used.
     * </pre>
     *
     * <code>string service_account = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for serviceAccount to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceAccount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object artifactStorage_ = "";
    /**
     * <pre>
     * Optional. Cloud Storage location where execution outputs should be stored. This can
     * either be a bucket ("gs://my-bucket") or a path within a bucket
     * ("gs://my-bucket/my-dir").
     * If unspecified, a default bucket located in the same region will be used.
     * </pre>
     *
     * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The artifactStorage.
     */
    public java.lang.String getArtifactStorage() {
      java.lang.Object ref = artifactStorage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifactStorage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Cloud Storage location where execution outputs should be stored. This can
     * either be a bucket ("gs://my-bucket") or a path within a bucket
     * ("gs://my-bucket/my-dir").
     * If unspecified, a default bucket located in the same region will be used.
     * </pre>
     *
     * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for artifactStorage.
     */
    public com.google.protobuf.ByteString
        getArtifactStorageBytes() {
      java.lang.Object ref = artifactStorage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        artifactStorage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Cloud Storage location where execution outputs should be stored. This can
     * either be a bucket ("gs://my-bucket") or a path within a bucket
     * ("gs://my-bucket/my-dir").
     * If unspecified, a default bucket located in the same region will be used.
     * </pre>
     *
     * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The artifactStorage to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactStorage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      artifactStorage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Cloud Storage location where execution outputs should be stored. This can
     * either be a bucket ("gs://my-bucket") or a path within a bucket
     * ("gs://my-bucket/my-dir").
     * If unspecified, a default bucket located in the same region will be used.
     * </pre>
     *
     * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearArtifactStorage() {
      artifactStorage_ = getDefaultInstance().getArtifactStorage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Cloud Storage location where execution outputs should be stored. This can
     * either be a bucket ("gs://my-bucket") or a path within a bucket
     * ("gs://my-bucket/my-dir").
     * If unspecified, a default bucket located in the same region will be used.
     * </pre>
     *
     * <code>string artifact_storage = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for artifactStorage to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactStorageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      artifactStorage_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.DefaultPool)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.DefaultPool)
  private static final com.google.cloud.deploy.v1.DefaultPool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.DefaultPool();
  }

  public static com.google.cloud.deploy.v1.DefaultPool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DefaultPool>
      PARSER = new com.google.protobuf.AbstractParser<DefaultPool>() {
    @java.lang.Override
    public DefaultPool parsePartialFrom(
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

  public static com.google.protobuf.Parser<DefaultPool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefaultPool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.DefaultPool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

