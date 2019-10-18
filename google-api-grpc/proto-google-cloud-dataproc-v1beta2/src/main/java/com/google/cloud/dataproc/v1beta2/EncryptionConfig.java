// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * Encryption settings for the cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.EncryptionConfig}
 */
public final class EncryptionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.EncryptionConfig)
    EncryptionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EncryptionConfig.newBuilder() to construct.
  private EncryptionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptionConfig() {
    gcePdKmsKeyName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EncryptionConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              gcePdKmsKeyName_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.ClustersProto
        .internal_static_google_cloud_dataproc_v1beta2_EncryptionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.ClustersProto
        .internal_static_google_cloud_dataproc_v1beta2_EncryptionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.EncryptionConfig.class,
            com.google.cloud.dataproc.v1beta2.EncryptionConfig.Builder.class);
  }

  public static final int GCE_PD_KMS_KEY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object gcePdKmsKeyName_;
  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key name to use for PD disk encryption for all
   * instances in the cluster.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public java.lang.String getGcePdKmsKeyName() {
    java.lang.Object ref = gcePdKmsKeyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcePdKmsKeyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key name to use for PD disk encryption for all
   * instances in the cluster.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  public com.google.protobuf.ByteString getGcePdKmsKeyNameBytes() {
    java.lang.Object ref = gcePdKmsKeyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcePdKmsKeyName_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getGcePdKmsKeyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcePdKmsKeyName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGcePdKmsKeyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcePdKmsKeyName_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.EncryptionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.EncryptionConfig other =
        (com.google.cloud.dataproc.v1beta2.EncryptionConfig) obj;

    if (!getGcePdKmsKeyName().equals(other.getGcePdKmsKeyName())) return false;
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
    hash = (37 * hash) + GCE_PD_KMS_KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGcePdKmsKeyName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.EncryptionConfig prototype) {
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
   * Encryption settings for the cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.EncryptionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.EncryptionConfig)
      com.google.cloud.dataproc.v1beta2.EncryptionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_EncryptionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.EncryptionConfig.class,
              com.google.cloud.dataproc.v1beta2.EncryptionConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.EncryptionConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      gcePdKmsKeyName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.ClustersProto
          .internal_static_google_cloud_dataproc_v1beta2_EncryptionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.EncryptionConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.EncryptionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.EncryptionConfig build() {
      com.google.cloud.dataproc.v1beta2.EncryptionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.EncryptionConfig buildPartial() {
      com.google.cloud.dataproc.v1beta2.EncryptionConfig result =
          new com.google.cloud.dataproc.v1beta2.EncryptionConfig(this);
      result.gcePdKmsKeyName_ = gcePdKmsKeyName_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.EncryptionConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.EncryptionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.EncryptionConfig other) {
      if (other == com.google.cloud.dataproc.v1beta2.EncryptionConfig.getDefaultInstance())
        return this;
      if (!other.getGcePdKmsKeyName().isEmpty()) {
        gcePdKmsKeyName_ = other.gcePdKmsKeyName_;
        onChanged();
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
      com.google.cloud.dataproc.v1beta2.EncryptionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1beta2.EncryptionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gcePdKmsKeyName_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key name to use for PD disk encryption for all
     * instances in the cluster.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.lang.String getGcePdKmsKeyName() {
      java.lang.Object ref = gcePdKmsKeyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcePdKmsKeyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key name to use for PD disk encryption for all
     * instances in the cluster.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.ByteString getGcePdKmsKeyNameBytes() {
      java.lang.Object ref = gcePdKmsKeyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcePdKmsKeyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key name to use for PD disk encryption for all
     * instances in the cluster.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setGcePdKmsKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gcePdKmsKeyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key name to use for PD disk encryption for all
     * instances in the cluster.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearGcePdKmsKeyName() {

      gcePdKmsKeyName_ = getDefaultInstance().getGcePdKmsKeyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud KMS key name to use for PD disk encryption for all
     * instances in the cluster.
     * </pre>
     *
     * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setGcePdKmsKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gcePdKmsKeyName_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.EncryptionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.EncryptionConfig)
  private static final com.google.cloud.dataproc.v1beta2.EncryptionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.EncryptionConfig();
  }

  public static com.google.cloud.dataproc.v1beta2.EncryptionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionConfig> PARSER =
      new com.google.protobuf.AbstractParser<EncryptionConfig>() {
        @java.lang.Override
        public EncryptionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EncryptionConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EncryptionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.EncryptionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
