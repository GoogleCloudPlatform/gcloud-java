// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 * <pre>
 * The VPC Peering configuration is used to create VPC peering between
 * Datastream and the consumer's VPC.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.VpcPeeringConfig}
 */
public final class VpcPeeringConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.VpcPeeringConfig)
    VpcPeeringConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VpcPeeringConfig.newBuilder() to construct.
  private VpcPeeringConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VpcPeeringConfig() {
    vpcName_ = "";
    subnet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VpcPeeringConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_VpcPeeringConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_VpcPeeringConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.class, com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.Builder.class);
  }

  public static final int VPC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object vpcName_ = "";
  /**
   * <pre>
   * Required. fully qualified name of the VPC Datastream will peer to.
   * </pre>
   *
   * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vpcName.
   */
  @java.lang.Override
  public java.lang.String getVpcName() {
    java.lang.Object ref = vpcName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vpcName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. fully qualified name of the VPC Datastream will peer to.
   * </pre>
   *
   * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for vpcName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVpcNameBytes() {
    java.lang.Object ref = vpcName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vpcName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subnet_ = "";
  /**
   * <pre>
   * Required. A free subnet for peering. (CIDR of /29)
   * </pre>
   *
   * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnet.
   */
  @java.lang.Override
  public java.lang.String getSubnet() {
    java.lang.Object ref = subnet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. A free subnet for peering. (CIDR of /29)
   * </pre>
   *
   * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subnet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnetBytes() {
    java.lang.Object ref = subnet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnet_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vpcName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vpcName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subnet_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vpcName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vpcName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subnet_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.VpcPeeringConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.VpcPeeringConfig other = (com.google.cloud.datastream.v1alpha1.VpcPeeringConfig) obj;

    if (!getVpcName()
        .equals(other.getVpcName())) return false;
    if (!getSubnet()
        .equals(other.getSubnet())) return false;
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
    hash = (37 * hash) + VPC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVpcName().hashCode();
    hash = (37 * hash) + SUBNET_FIELD_NUMBER;
    hash = (53 * hash) + getSubnet().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.VpcPeeringConfig prototype) {
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
   * The VPC Peering configuration is used to create VPC peering between
   * Datastream and the consumer's VPC.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.VpcPeeringConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.VpcPeeringConfig)
      com.google.cloud.datastream.v1alpha1.VpcPeeringConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_VpcPeeringConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_VpcPeeringConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.class, com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.newBuilder()
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
      vpcName_ = "";
      subnet_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_VpcPeeringConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.VpcPeeringConfig getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.VpcPeeringConfig build() {
      com.google.cloud.datastream.v1alpha1.VpcPeeringConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.VpcPeeringConfig buildPartial() {
      com.google.cloud.datastream.v1alpha1.VpcPeeringConfig result = new com.google.cloud.datastream.v1alpha1.VpcPeeringConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1alpha1.VpcPeeringConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vpcName_ = vpcName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subnet_ = subnet_;
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.VpcPeeringConfig) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.VpcPeeringConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.VpcPeeringConfig other) {
      if (other == com.google.cloud.datastream.v1alpha1.VpcPeeringConfig.getDefaultInstance()) return this;
      if (!other.getVpcName().isEmpty()) {
        vpcName_ = other.vpcName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSubnet().isEmpty()) {
        subnet_ = other.subnet_;
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
              vpcName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              subnet_ = input.readStringRequireUtf8();
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

    private java.lang.Object vpcName_ = "";
    /**
     * <pre>
     * Required. fully qualified name of the VPC Datastream will peer to.
     * </pre>
     *
     * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vpcName.
     */
    public java.lang.String getVpcName() {
      java.lang.Object ref = vpcName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vpcName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. fully qualified name of the VPC Datastream will peer to.
     * </pre>
     *
     * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for vpcName.
     */
    public com.google.protobuf.ByteString
        getVpcNameBytes() {
      java.lang.Object ref = vpcName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vpcName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. fully qualified name of the VPC Datastream will peer to.
     * </pre>
     *
     * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The vpcName to set.
     * @return This builder for chaining.
     */
    public Builder setVpcName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      vpcName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. fully qualified name of the VPC Datastream will peer to.
     * </pre>
     *
     * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVpcName() {
      vpcName_ = getDefaultInstance().getVpcName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. fully qualified name of the VPC Datastream will peer to.
     * </pre>
     *
     * <code>string vpc_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for vpcName to set.
     * @return This builder for chaining.
     */
    public Builder setVpcNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      vpcName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subnet_ = "";
    /**
     * <pre>
     * Required. A free subnet for peering. (CIDR of /29)
     * </pre>
     *
     * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subnet.
     */
    public java.lang.String getSubnet() {
      java.lang.Object ref = subnet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. A free subnet for peering. (CIDR of /29)
     * </pre>
     *
     * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for subnet.
     */
    public com.google.protobuf.ByteString
        getSubnetBytes() {
      java.lang.Object ref = subnet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. A free subnet for peering. (CIDR of /29)
     * </pre>
     *
     * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The subnet to set.
     * @return This builder for chaining.
     */
    public Builder setSubnet(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subnet_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A free subnet for peering. (CIDR of /29)
     * </pre>
     *
     * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnet() {
      subnet_ = getDefaultInstance().getSubnet();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A free subnet for peering. (CIDR of /29)
     * </pre>
     *
     * <code>string subnet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for subnet to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subnet_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.VpcPeeringConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.VpcPeeringConfig)
  private static final com.google.cloud.datastream.v1alpha1.VpcPeeringConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.VpcPeeringConfig();
  }

  public static com.google.cloud.datastream.v1alpha1.VpcPeeringConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpcPeeringConfig>
      PARSER = new com.google.protobuf.AbstractParser<VpcPeeringConfig>() {
    @java.lang.Override
    public VpcPeeringConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<VpcPeeringConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpcPeeringConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.VpcPeeringConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

