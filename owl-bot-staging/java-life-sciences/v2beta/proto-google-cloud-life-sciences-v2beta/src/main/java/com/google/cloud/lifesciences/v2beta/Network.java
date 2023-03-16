// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 * <pre>
 * VM networking options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.Network}
 */
public final class Network extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.Network)
    NetworkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Network.newBuilder() to construct.
  private Network(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Network() {
    network_ = "";
    subnetwork_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Network();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Network_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Network_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.Network.class, com.google.cloud.lifesciences.v2beta.Network.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object network_ = "";
  /**
   * <pre>
   * The network name to attach the VM's network interface to. The value will
   * be prefixed with `global/networks/` unless it contains a `/`, in which
   * case it is assumed to be a fully specified network resource URL.
   * If unspecified, the global default network is used.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The network.
   */
  @java.lang.Override
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The network name to attach the VM's network interface to. The value will
   * be prefixed with `global/networks/` unless it contains a `/`, in which
   * case it is assumed to be a fully specified network resource URL.
   * If unspecified, the global default network is used.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The bytes for network.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_PRIVATE_ADDRESS_FIELD_NUMBER = 2;
  private boolean usePrivateAddress_ = false;
  /**
   * <pre>
   * If set to true, do not attach a public IP address to the VM. Note that
   * without a public IP address, additional configuration is required to
   * allow the VM to access Google services.
   * See https://cloud.google.com/vpc/docs/configure-private-google-access
   * for more information.
   * </pre>
   *
   * <code>bool use_private_address = 2;</code>
   * @return The usePrivateAddress.
   */
  @java.lang.Override
  public boolean getUsePrivateAddress() {
    return usePrivateAddress_;
  }

  public static final int SUBNETWORK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subnetwork_ = "";
  /**
   * <pre>
   * If the specified network is configured for custom subnet creation, the
   * name of the subnetwork to attach the instance to must be specified here.
   * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
   * `/`, in which case it is assumed to be a fully specified subnetwork
   * resource URL.
   * If the `*` character appears in the value, it is replaced with the region
   * that the virtual machine has been allocated in.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   * @return The subnetwork.
   */
  @java.lang.Override
  public java.lang.String getSubnetwork() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetwork_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If the specified network is configured for custom subnet creation, the
   * name of the subnetwork to attach the instance to must be specified here.
   * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
   * `/`, in which case it is assumed to be a fully specified subnetwork
   * resource URL.
   * If the `*` character appears in the value, it is replaced with the region
   * that the virtual machine has been allocated in.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   * @return The bytes for subnetwork.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnetworkBytes() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnetwork_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, network_);
    }
    if (usePrivateAddress_ != false) {
      output.writeBool(2, usePrivateAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subnetwork_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, network_);
    }
    if (usePrivateAddress_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, usePrivateAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subnetwork_);
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.Network)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.Network other = (com.google.cloud.lifesciences.v2beta.Network) obj;

    if (!getNetwork()
        .equals(other.getNetwork())) return false;
    if (getUsePrivateAddress()
        != other.getUsePrivateAddress()) return false;
    if (!getSubnetwork()
        .equals(other.getSubnetwork())) return false;
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
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + USE_PRIVATE_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUsePrivateAddress());
    hash = (37 * hash) + SUBNETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetwork().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.Network parseFrom(
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
  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.Network prototype) {
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
   * VM networking options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.Network}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.Network)
      com.google.cloud.lifesciences.v2beta.NetworkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Network_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Network_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.Network.class, com.google.cloud.lifesciences.v2beta.Network.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.Network.newBuilder()
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
      network_ = "";
      usePrivateAddress_ = false;
      subnetwork_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_Network_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Network getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.Network.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Network build() {
      com.google.cloud.lifesciences.v2beta.Network result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Network buildPartial() {
      com.google.cloud.lifesciences.v2beta.Network result = new com.google.cloud.lifesciences.v2beta.Network(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.Network result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.usePrivateAddress_ = usePrivateAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subnetwork_ = subnetwork_;
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.Network) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.Network)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.Network other) {
      if (other == com.google.cloud.lifesciences.v2beta.Network.getDefaultInstance()) return this;
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUsePrivateAddress() != false) {
        setUsePrivateAddress(other.getUsePrivateAddress());
      }
      if (!other.getSubnetwork().isEmpty()) {
        subnetwork_ = other.subnetwork_;
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
              network_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              usePrivateAddress_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              subnetwork_ = input.readStringRequireUtf8();
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

    private java.lang.Object network_ = "";
    /**
     * <pre>
     * The network name to attach the VM's network interface to. The value will
     * be prefixed with `global/networks/` unless it contains a `/`, in which
     * case it is assumed to be a fully specified network resource URL.
     * If unspecified, the global default network is used.
     * </pre>
     *
     * <code>string network = 1;</code>
     * @return The network.
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The network name to attach the VM's network interface to. The value will
     * be prefixed with `global/networks/` unless it contains a `/`, in which
     * case it is assumed to be a fully specified network resource URL.
     * If unspecified, the global default network is used.
     * </pre>
     *
     * <code>string network = 1;</code>
     * @return The bytes for network.
     */
    public com.google.protobuf.ByteString
        getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The network name to attach the VM's network interface to. The value will
     * be prefixed with `global/networks/` unless it contains a `/`, in which
     * case it is assumed to be a fully specified network resource URL.
     * If unspecified, the global default network is used.
     * </pre>
     *
     * <code>string network = 1;</code>
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The network name to attach the VM's network interface to. The value will
     * be prefixed with `global/networks/` unless it contains a `/`, in which
     * case it is assumed to be a fully specified network resource URL.
     * If unspecified, the global default network is used.
     * </pre>
     *
     * <code>string network = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = getDefaultInstance().getNetwork();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The network name to attach the VM's network interface to. The value will
     * be prefixed with `global/networks/` unless it contains a `/`, in which
     * case it is assumed to be a fully specified network resource URL.
     * If unspecified, the global default network is used.
     * </pre>
     *
     * <code>string network = 1;</code>
     * @param value The bytes for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean usePrivateAddress_ ;
    /**
     * <pre>
     * If set to true, do not attach a public IP address to the VM. Note that
     * without a public IP address, additional configuration is required to
     * allow the VM to access Google services.
     * See https://cloud.google.com/vpc/docs/configure-private-google-access
     * for more information.
     * </pre>
     *
     * <code>bool use_private_address = 2;</code>
     * @return The usePrivateAddress.
     */
    @java.lang.Override
    public boolean getUsePrivateAddress() {
      return usePrivateAddress_;
    }
    /**
     * <pre>
     * If set to true, do not attach a public IP address to the VM. Note that
     * without a public IP address, additional configuration is required to
     * allow the VM to access Google services.
     * See https://cloud.google.com/vpc/docs/configure-private-google-access
     * for more information.
     * </pre>
     *
     * <code>bool use_private_address = 2;</code>
     * @param value The usePrivateAddress to set.
     * @return This builder for chaining.
     */
    public Builder setUsePrivateAddress(boolean value) {
      
      usePrivateAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, do not attach a public IP address to the VM. Note that
     * without a public IP address, additional configuration is required to
     * allow the VM to access Google services.
     * See https://cloud.google.com/vpc/docs/configure-private-google-access
     * for more information.
     * </pre>
     *
     * <code>bool use_private_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsePrivateAddress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      usePrivateAddress_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object subnetwork_ = "";
    /**
     * <pre>
     * If the specified network is configured for custom subnet creation, the
     * name of the subnetwork to attach the instance to must be specified here.
     * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
     * `/`, in which case it is assumed to be a fully specified subnetwork
     * resource URL.
     * If the `*` character appears in the value, it is replaced with the region
     * that the virtual machine has been allocated in.
     * </pre>
     *
     * <code>string subnetwork = 3;</code>
     * @return The subnetwork.
     */
    public java.lang.String getSubnetwork() {
      java.lang.Object ref = subnetwork_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetwork_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If the specified network is configured for custom subnet creation, the
     * name of the subnetwork to attach the instance to must be specified here.
     * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
     * `/`, in which case it is assumed to be a fully specified subnetwork
     * resource URL.
     * If the `*` character appears in the value, it is replaced with the region
     * that the virtual machine has been allocated in.
     * </pre>
     *
     * <code>string subnetwork = 3;</code>
     * @return The bytes for subnetwork.
     */
    public com.google.protobuf.ByteString
        getSubnetworkBytes() {
      java.lang.Object ref = subnetwork_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnetwork_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If the specified network is configured for custom subnet creation, the
     * name of the subnetwork to attach the instance to must be specified here.
     * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
     * `/`, in which case it is assumed to be a fully specified subnetwork
     * resource URL.
     * If the `*` character appears in the value, it is replaced with the region
     * that the virtual machine has been allocated in.
     * </pre>
     *
     * <code>string subnetwork = 3;</code>
     * @param value The subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetwork(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subnetwork_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the specified network is configured for custom subnet creation, the
     * name of the subnetwork to attach the instance to must be specified here.
     * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
     * `/`, in which case it is assumed to be a fully specified subnetwork
     * resource URL.
     * If the `*` character appears in the value, it is replaced with the region
     * that the virtual machine has been allocated in.
     * </pre>
     *
     * <code>string subnetwork = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnetwork() {
      subnetwork_ = getDefaultInstance().getSubnetwork();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the specified network is configured for custom subnet creation, the
     * name of the subnetwork to attach the instance to must be specified here.
     * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
     * `/`, in which case it is assumed to be a fully specified subnetwork
     * resource URL.
     * If the `*` character appears in the value, it is replaced with the region
     * that the virtual machine has been allocated in.
     * </pre>
     *
     * <code>string subnetwork = 3;</code>
     * @param value The bytes for subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subnetwork_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.Network)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.Network)
  private static final com.google.cloud.lifesciences.v2beta.Network DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.Network();
  }

  public static com.google.cloud.lifesciences.v2beta.Network getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Network>
      PARSER = new com.google.protobuf.AbstractParser<Network>() {
    @java.lang.Override
    public Network parsePartialFrom(
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

  public static com.google.protobuf.Parser<Network> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Network> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.Network getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

