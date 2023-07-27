// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/kms.proto

package com.google.cloud.netapp.v1;

/**
 * <pre>
 * VerifyKmsConfigResponse contains the information if the config is correctly
 * and error message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.VerifyKmsConfigResponse}
 */
public final class VerifyKmsConfigResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.VerifyKmsConfigResponse)
    VerifyKmsConfigResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerifyKmsConfigResponse.newBuilder() to construct.
  private VerifyKmsConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerifyKmsConfigResponse() {
    healthError_ = "";
    instructions_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VerifyKmsConfigResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.netapp.v1.KmsProto.internal_static_google_cloud_netapp_v1_VerifyKmsConfigResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.KmsProto.internal_static_google_cloud_netapp_v1_VerifyKmsConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.VerifyKmsConfigResponse.class, com.google.cloud.netapp.v1.VerifyKmsConfigResponse.Builder.class);
  }

  public static final int HEALTHY_FIELD_NUMBER = 1;
  private boolean healthy_ = false;
  /**
   * <pre>
   * Output only. If the customer key configured correctly to the encrypt
   * volume.
   * </pre>
   *
   * <code>bool healthy = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthy.
   */
  @java.lang.Override
  public boolean getHealthy() {
    return healthy_;
  }

  public static final int HEALTH_ERROR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object healthError_ = "";
  /**
   * <pre>
   * Output only. Error message if config is not healthy.
   * </pre>
   *
   * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthError.
   */
  @java.lang.Override
  public java.lang.String getHealthError() {
    java.lang.Object ref = healthError_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthError_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Error message if config is not healthy.
   * </pre>
   *
   * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for healthError.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHealthErrorBytes() {
    java.lang.Object ref = healthError_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthError_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTRUCTIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object instructions_ = "";
  /**
   * <pre>
   * Output only. Instructions for the customers to provide the access to the
   * encryption key.
   * </pre>
   *
   * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The instructions.
   */
  @java.lang.Override
  public java.lang.String getInstructions() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instructions_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Instructions for the customers to provide the access to the
   * encryption key.
   * </pre>
   *
   * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for instructions.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstructionsBytes() {
    java.lang.Object ref = instructions_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instructions_ = b;
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
    if (healthy_ != false) {
      output.writeBool(1, healthy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healthError_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, healthError_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, instructions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (healthy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, healthy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(healthError_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, healthError_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructions_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, instructions_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.VerifyKmsConfigResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.VerifyKmsConfigResponse other = (com.google.cloud.netapp.v1.VerifyKmsConfigResponse) obj;

    if (getHealthy()
        != other.getHealthy()) return false;
    if (!getHealthError()
        .equals(other.getHealthError())) return false;
    if (!getInstructions()
        .equals(other.getInstructions())) return false;
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
    hash = (37 * hash) + HEALTHY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHealthy());
    hash = (37 * hash) + HEALTH_ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getHealthError().hashCode();
    hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getInstructions().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.netapp.v1.VerifyKmsConfigResponse prototype) {
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
   * VerifyKmsConfigResponse contains the information if the config is correctly
   * and error message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.VerifyKmsConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.VerifyKmsConfigResponse)
      com.google.cloud.netapp.v1.VerifyKmsConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.netapp.v1.KmsProto.internal_static_google_cloud_netapp_v1_VerifyKmsConfigResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.KmsProto.internal_static_google_cloud_netapp_v1_VerifyKmsConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.VerifyKmsConfigResponse.class, com.google.cloud.netapp.v1.VerifyKmsConfigResponse.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.VerifyKmsConfigResponse.newBuilder()
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
      healthy_ = false;
      healthError_ = "";
      instructions_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.netapp.v1.KmsProto.internal_static_google_cloud_netapp_v1_VerifyKmsConfigResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.VerifyKmsConfigResponse getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.VerifyKmsConfigResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.VerifyKmsConfigResponse build() {
      com.google.cloud.netapp.v1.VerifyKmsConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.VerifyKmsConfigResponse buildPartial() {
      com.google.cloud.netapp.v1.VerifyKmsConfigResponse result = new com.google.cloud.netapp.v1.VerifyKmsConfigResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.VerifyKmsConfigResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.healthy_ = healthy_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.healthError_ = healthError_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.instructions_ = instructions_;
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
      if (other instanceof com.google.cloud.netapp.v1.VerifyKmsConfigResponse) {
        return mergeFrom((com.google.cloud.netapp.v1.VerifyKmsConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.VerifyKmsConfigResponse other) {
      if (other == com.google.cloud.netapp.v1.VerifyKmsConfigResponse.getDefaultInstance()) return this;
      if (other.getHealthy() != false) {
        setHealthy(other.getHealthy());
      }
      if (!other.getHealthError().isEmpty()) {
        healthError_ = other.healthError_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getInstructions().isEmpty()) {
        instructions_ = other.instructions_;
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
            case 8: {
              healthy_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              healthError_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              instructions_ = input.readStringRequireUtf8();
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

    private boolean healthy_ ;
    /**
     * <pre>
     * Output only. If the customer key configured correctly to the encrypt
     * volume.
     * </pre>
     *
     * <code>bool healthy = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The healthy.
     */
    @java.lang.Override
    public boolean getHealthy() {
      return healthy_;
    }
    /**
     * <pre>
     * Output only. If the customer key configured correctly to the encrypt
     * volume.
     * </pre>
     *
     * <code>bool healthy = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The healthy to set.
     * @return This builder for chaining.
     */
    public Builder setHealthy(boolean value) {

      healthy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. If the customer key configured correctly to the encrypt
     * volume.
     * </pre>
     *
     * <code>bool healthy = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      healthy_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object healthError_ = "";
    /**
     * <pre>
     * Output only. Error message if config is not healthy.
     * </pre>
     *
     * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The healthError.
     */
    public java.lang.String getHealthError() {
      java.lang.Object ref = healthError_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthError_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Error message if config is not healthy.
     * </pre>
     *
     * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for healthError.
     */
    public com.google.protobuf.ByteString
        getHealthErrorBytes() {
      java.lang.Object ref = healthError_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthError_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Error message if config is not healthy.
     * </pre>
     *
     * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The healthError to set.
     * @return This builder for chaining.
     */
    public Builder setHealthError(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      healthError_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error message if config is not healthy.
     * </pre>
     *
     * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthError() {
      healthError_ = getDefaultInstance().getHealthError();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error message if config is not healthy.
     * </pre>
     *
     * <code>string health_error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for healthError to set.
     * @return This builder for chaining.
     */
    public Builder setHealthErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      healthError_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object instructions_ = "";
    /**
     * <pre>
     * Output only. Instructions for the customers to provide the access to the
     * encryption key.
     * </pre>
     *
     * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The instructions.
     */
    public java.lang.String getInstructions() {
      java.lang.Object ref = instructions_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instructions_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Instructions for the customers to provide the access to the
     * encryption key.
     * </pre>
     *
     * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for instructions.
     */
    public com.google.protobuf.ByteString
        getInstructionsBytes() {
      java.lang.Object ref = instructions_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instructions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Instructions for the customers to provide the access to the
     * encryption key.
     * </pre>
     *
     * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      instructions_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Instructions for the customers to provide the access to the
     * encryption key.
     * </pre>
     *
     * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstructions() {
      instructions_ = getDefaultInstance().getInstructions();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Instructions for the customers to provide the access to the
     * encryption key.
     * </pre>
     *
     * <code>string instructions = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for instructions to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      instructions_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.VerifyKmsConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.VerifyKmsConfigResponse)
  private static final com.google.cloud.netapp.v1.VerifyKmsConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.VerifyKmsConfigResponse();
  }

  public static com.google.cloud.netapp.v1.VerifyKmsConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyKmsConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<VerifyKmsConfigResponse>() {
    @java.lang.Override
    public VerifyKmsConfigResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<VerifyKmsConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyKmsConfigResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.VerifyKmsConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

