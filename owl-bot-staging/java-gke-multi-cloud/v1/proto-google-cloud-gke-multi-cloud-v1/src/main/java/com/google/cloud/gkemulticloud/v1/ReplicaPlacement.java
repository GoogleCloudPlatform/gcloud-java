// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Configuration for the placement of a control plane replica.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.ReplicaPlacement}
 */
public final class ReplicaPlacement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.ReplicaPlacement)
    ReplicaPlacementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplicaPlacement.newBuilder() to construct.
  private ReplicaPlacement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplicaPlacement() {
    subnetId_ = "";
    azureAvailabilityZone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplicaPlacement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto.internal_static_google_cloud_gkemulticloud_v1_ReplicaPlacement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto.internal_static_google_cloud_gkemulticloud_v1_ReplicaPlacement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.ReplicaPlacement.class, com.google.cloud.gkemulticloud.v1.ReplicaPlacement.Builder.class);
  }

  public static final int SUBNET_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subnetId_ = "";
  /**
   * <pre>
   * Required. For a given replica, the ARM ID of the subnet where the control
   * plane VM is deployed. Make sure it's a subnet under the virtual network in
   * the cluster configuration.
   * </pre>
   *
   * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnetId.
   */
  @java.lang.Override
  public java.lang.String getSubnetId() {
    java.lang.Object ref = subnetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. For a given replica, the ARM ID of the subnet where the control
   * plane VM is deployed. Make sure it's a subnet under the virtual network in
   * the cluster configuration.
   * </pre>
   *
   * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subnetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnetIdBytes() {
    java.lang.Object ref = subnetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AZURE_AVAILABILITY_ZONE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object azureAvailabilityZone_ = "";
  /**
   * <pre>
   * Required. For a given replica, the Azure availability zone where to
   * provision the control plane VM and the ETCD disk.
   * </pre>
   *
   * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The azureAvailabilityZone.
   */
  @java.lang.Override
  public java.lang.String getAzureAvailabilityZone() {
    java.lang.Object ref = azureAvailabilityZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      azureAvailabilityZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. For a given replica, the Azure availability zone where to
   * provision the control plane VM and the ETCD disk.
   * </pre>
   *
   * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for azureAvailabilityZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAzureAvailabilityZoneBytes() {
    java.lang.Object ref = azureAvailabilityZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      azureAvailabilityZone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subnetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(azureAvailabilityZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, azureAvailabilityZone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subnetId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(azureAvailabilityZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, azureAvailabilityZone_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.ReplicaPlacement)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.ReplicaPlacement other = (com.google.cloud.gkemulticloud.v1.ReplicaPlacement) obj;

    if (!getSubnetId()
        .equals(other.getSubnetId())) return false;
    if (!getAzureAvailabilityZone()
        .equals(other.getAzureAvailabilityZone())) return false;
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
    hash = (37 * hash) + SUBNET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetId().hashCode();
    hash = (37 * hash) + AZURE_AVAILABILITY_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getAzureAvailabilityZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.ReplicaPlacement prototype) {
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
   * Configuration for the placement of a control plane replica.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.ReplicaPlacement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.ReplicaPlacement)
      com.google.cloud.gkemulticloud.v1.ReplicaPlacementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto.internal_static_google_cloud_gkemulticloud_v1_ReplicaPlacement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto.internal_static_google_cloud_gkemulticloud_v1_ReplicaPlacement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.ReplicaPlacement.class, com.google.cloud.gkemulticloud.v1.ReplicaPlacement.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.ReplicaPlacement.newBuilder()
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
      subnetId_ = "";
      azureAvailabilityZone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto.internal_static_google_cloud_gkemulticloud_v1_ReplicaPlacement_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ReplicaPlacement getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.ReplicaPlacement.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ReplicaPlacement build() {
      com.google.cloud.gkemulticloud.v1.ReplicaPlacement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ReplicaPlacement buildPartial() {
      com.google.cloud.gkemulticloud.v1.ReplicaPlacement result = new com.google.cloud.gkemulticloud.v1.ReplicaPlacement(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.ReplicaPlacement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subnetId_ = subnetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.azureAvailabilityZone_ = azureAvailabilityZone_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.ReplicaPlacement) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.ReplicaPlacement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.ReplicaPlacement other) {
      if (other == com.google.cloud.gkemulticloud.v1.ReplicaPlacement.getDefaultInstance()) return this;
      if (!other.getSubnetId().isEmpty()) {
        subnetId_ = other.subnetId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAzureAvailabilityZone().isEmpty()) {
        azureAvailabilityZone_ = other.azureAvailabilityZone_;
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
              subnetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              azureAvailabilityZone_ = input.readStringRequireUtf8();
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

    private java.lang.Object subnetId_ = "";
    /**
     * <pre>
     * Required. For a given replica, the ARM ID of the subnet where the control
     * plane VM is deployed. Make sure it's a subnet under the virtual network in
     * the cluster configuration.
     * </pre>
     *
     * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subnetId.
     */
    public java.lang.String getSubnetId() {
      java.lang.Object ref = subnetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. For a given replica, the ARM ID of the subnet where the control
     * plane VM is deployed. Make sure it's a subnet under the virtual network in
     * the cluster configuration.
     * </pre>
     *
     * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for subnetId.
     */
    public com.google.protobuf.ByteString
        getSubnetIdBytes() {
      java.lang.Object ref = subnetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. For a given replica, the ARM ID of the subnet where the control
     * plane VM is deployed. Make sure it's a subnet under the virtual network in
     * the cluster configuration.
     * </pre>
     *
     * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The subnetId to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subnetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. For a given replica, the ARM ID of the subnet where the control
     * plane VM is deployed. Make sure it's a subnet under the virtual network in
     * the cluster configuration.
     * </pre>
     *
     * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnetId() {
      subnetId_ = getDefaultInstance().getSubnetId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. For a given replica, the ARM ID of the subnet where the control
     * plane VM is deployed. Make sure it's a subnet under the virtual network in
     * the cluster configuration.
     * </pre>
     *
     * <code>string subnet_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for subnetId to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subnetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object azureAvailabilityZone_ = "";
    /**
     * <pre>
     * Required. For a given replica, the Azure availability zone where to
     * provision the control plane VM and the ETCD disk.
     * </pre>
     *
     * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The azureAvailabilityZone.
     */
    public java.lang.String getAzureAvailabilityZone() {
      java.lang.Object ref = azureAvailabilityZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        azureAvailabilityZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. For a given replica, the Azure availability zone where to
     * provision the control plane VM and the ETCD disk.
     * </pre>
     *
     * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for azureAvailabilityZone.
     */
    public com.google.protobuf.ByteString
        getAzureAvailabilityZoneBytes() {
      java.lang.Object ref = azureAvailabilityZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        azureAvailabilityZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. For a given replica, the Azure availability zone where to
     * provision the control plane VM and the ETCD disk.
     * </pre>
     *
     * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The azureAvailabilityZone to set.
     * @return This builder for chaining.
     */
    public Builder setAzureAvailabilityZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      azureAvailabilityZone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. For a given replica, the Azure availability zone where to
     * provision the control plane VM and the ETCD disk.
     * </pre>
     *
     * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAzureAvailabilityZone() {
      azureAvailabilityZone_ = getDefaultInstance().getAzureAvailabilityZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. For a given replica, the Azure availability zone where to
     * provision the control plane VM and the ETCD disk.
     * </pre>
     *
     * <code>string azure_availability_zone = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for azureAvailabilityZone to set.
     * @return This builder for chaining.
     */
    public Builder setAzureAvailabilityZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      azureAvailabilityZone_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.ReplicaPlacement)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.ReplicaPlacement)
  private static final com.google.cloud.gkemulticloud.v1.ReplicaPlacement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.ReplicaPlacement();
  }

  public static com.google.cloud.gkemulticloud.v1.ReplicaPlacement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplicaPlacement>
      PARSER = new com.google.protobuf.AbstractParser<ReplicaPlacement>() {
    @java.lang.Override
    public ReplicaPlacement parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplicaPlacement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplicaPlacement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.ReplicaPlacement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

