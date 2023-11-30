// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

/**
 * <pre>
 * Request message for
 * [ReconfigureTrust][google.cloud.managedidentities.v1.ReconfigureTrust]
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedidentities.v1.ReconfigureTrustRequest}
 */
public final class ReconfigureTrustRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedidentities.v1.ReconfigureTrustRequest)
    ReconfigureTrustRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReconfigureTrustRequest.newBuilder() to construct.
  private ReconfigureTrustRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReconfigureTrustRequest() {
    name_ = "";
    targetDomainName_ = "";
    targetDnsIpAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReconfigureTrustRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.class, com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The resource domain name, project name and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource domain name, project name and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_DOMAIN_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object targetDomainName_ = "";
  /**
   * <pre>
   * Required. The fully-qualified target domain name which will be in trust with current
   * domain.
   * </pre>
   *
   * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetDomainName.
   */
  @java.lang.Override
  public java.lang.String getTargetDomainName() {
    java.lang.Object ref = targetDomainName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetDomainName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The fully-qualified target domain name which will be in trust with current
   * domain.
   * </pre>
   *
   * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetDomainName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetDomainNameBytes() {
    java.lang.Object ref = targetDomainName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetDomainName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_DNS_IP_ADDRESSES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList targetDnsIpAddresses_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the targetDnsIpAddresses.
   */
  public com.google.protobuf.ProtocolStringList
      getTargetDnsIpAddressesList() {
    return targetDnsIpAddresses_;
  }
  /**
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of targetDnsIpAddresses.
   */
  public int getTargetDnsIpAddressesCount() {
    return targetDnsIpAddresses_.size();
  }
  /**
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The targetDnsIpAddresses at the given index.
   */
  public java.lang.String getTargetDnsIpAddresses(int index) {
    return targetDnsIpAddresses_.get(index);
  }
  /**
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the targetDnsIpAddresses at the given index.
   */
  public com.google.protobuf.ByteString
      getTargetDnsIpAddressesBytes(int index) {
    return targetDnsIpAddresses_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetDomainName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetDomainName_);
    }
    for (int i = 0; i < targetDnsIpAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, targetDnsIpAddresses_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetDomainName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetDomainName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < targetDnsIpAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(targetDnsIpAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTargetDnsIpAddressesList().size();
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
    if (!(obj instanceof com.google.cloud.managedidentities.v1.ReconfigureTrustRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.managedidentities.v1.ReconfigureTrustRequest other = (com.google.cloud.managedidentities.v1.ReconfigureTrustRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getTargetDomainName()
        .equals(other.getTargetDomainName())) return false;
    if (!getTargetDnsIpAddressesList()
        .equals(other.getTargetDnsIpAddressesList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TARGET_DOMAIN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTargetDomainName().hashCode();
    if (getTargetDnsIpAddressesCount() > 0) {
      hash = (37 * hash) + TARGET_DNS_IP_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getTargetDnsIpAddressesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.managedidentities.v1.ReconfigureTrustRequest prototype) {
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
   * Request message for
   * [ReconfigureTrust][google.cloud.managedidentities.v1.ReconfigureTrust]
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedidentities.v1.ReconfigureTrustRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedidentities.v1.ReconfigureTrustRequest)
      com.google.cloud.managedidentities.v1.ReconfigureTrustRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.class, com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.Builder.class);
    }

    // Construct using com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.newBuilder()
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
      name_ = "";
      targetDomainName_ = "";
      targetDnsIpAddresses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto.internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ReconfigureTrustRequest getDefaultInstanceForType() {
      return com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ReconfigureTrustRequest build() {
      com.google.cloud.managedidentities.v1.ReconfigureTrustRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ReconfigureTrustRequest buildPartial() {
      com.google.cloud.managedidentities.v1.ReconfigureTrustRequest result = new com.google.cloud.managedidentities.v1.ReconfigureTrustRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.managedidentities.v1.ReconfigureTrustRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetDomainName_ = targetDomainName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        targetDnsIpAddresses_.makeImmutable();
        result.targetDnsIpAddresses_ = targetDnsIpAddresses_;
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
      if (other instanceof com.google.cloud.managedidentities.v1.ReconfigureTrustRequest) {
        return mergeFrom((com.google.cloud.managedidentities.v1.ReconfigureTrustRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedidentities.v1.ReconfigureTrustRequest other) {
      if (other == com.google.cloud.managedidentities.v1.ReconfigureTrustRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTargetDomainName().isEmpty()) {
        targetDomainName_ = other.targetDomainName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.targetDnsIpAddresses_.isEmpty()) {
        if (targetDnsIpAddresses_.isEmpty()) {
          targetDnsIpAddresses_ = other.targetDnsIpAddresses_;
          bitField0_ |= 0x00000004;
        } else {
          ensureTargetDnsIpAddressesIsMutable();
          targetDnsIpAddresses_.addAll(other.targetDnsIpAddresses_);
        }
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              targetDomainName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTargetDnsIpAddressesIsMutable();
              targetDnsIpAddresses_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource domain name, project name and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource domain name, project name and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource domain name, project name and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource domain name, project name and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource domain name, project name and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object targetDomainName_ = "";
    /**
     * <pre>
     * Required. The fully-qualified target domain name which will be in trust with current
     * domain.
     * </pre>
     *
     * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The targetDomainName.
     */
    public java.lang.String getTargetDomainName() {
      java.lang.Object ref = targetDomainName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetDomainName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The fully-qualified target domain name which will be in trust with current
     * domain.
     * </pre>
     *
     * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for targetDomainName.
     */
    public com.google.protobuf.ByteString
        getTargetDomainNameBytes() {
      java.lang.Object ref = targetDomainName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetDomainName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The fully-qualified target domain name which will be in trust with current
     * domain.
     * </pre>
     *
     * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The targetDomainName to set.
     * @return This builder for chaining.
     */
    public Builder setTargetDomainName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      targetDomainName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fully-qualified target domain name which will be in trust with current
     * domain.
     * </pre>
     *
     * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetDomainName() {
      targetDomainName_ = getDefaultInstance().getTargetDomainName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fully-qualified target domain name which will be in trust with current
     * domain.
     * </pre>
     *
     * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for targetDomainName to set.
     * @return This builder for chaining.
     */
    public Builder setTargetDomainNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      targetDomainName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList targetDnsIpAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTargetDnsIpAddressesIsMutable() {
      if (!targetDnsIpAddresses_.isModifiable()) {
        targetDnsIpAddresses_ = new com.google.protobuf.LazyStringArrayList(targetDnsIpAddresses_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the targetDnsIpAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getTargetDnsIpAddressesList() {
      targetDnsIpAddresses_.makeImmutable();
      return targetDnsIpAddresses_;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of targetDnsIpAddresses.
     */
    public int getTargetDnsIpAddressesCount() {
      return targetDnsIpAddresses_.size();
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The targetDnsIpAddresses at the given index.
     */
    public java.lang.String getTargetDnsIpAddresses(int index) {
      return targetDnsIpAddresses_.get(index);
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the targetDnsIpAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getTargetDnsIpAddressesBytes(int index) {
      return targetDnsIpAddresses_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The targetDnsIpAddresses to set.
     * @return This builder for chaining.
     */
    public Builder setTargetDnsIpAddresses(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTargetDnsIpAddressesIsMutable();
      targetDnsIpAddresses_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The targetDnsIpAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addTargetDnsIpAddresses(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTargetDnsIpAddressesIsMutable();
      targetDnsIpAddresses_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The targetDnsIpAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllTargetDnsIpAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureTargetDnsIpAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, targetDnsIpAddresses_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetDnsIpAddresses() {
      targetDnsIpAddresses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The target DNS server IP addresses to resolve the remote domain involved
     * in the trust.
     * </pre>
     *
     * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the targetDnsIpAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addTargetDnsIpAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTargetDnsIpAddressesIsMutable();
      targetDnsIpAddresses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.managedidentities.v1.ReconfigureTrustRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.ReconfigureTrustRequest)
  private static final com.google.cloud.managedidentities.v1.ReconfigureTrustRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedidentities.v1.ReconfigureTrustRequest();
  }

  public static com.google.cloud.managedidentities.v1.ReconfigureTrustRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReconfigureTrustRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReconfigureTrustRequest>() {
    @java.lang.Override
    public ReconfigureTrustRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReconfigureTrustRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReconfigureTrustRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedidentities.v1.ReconfigureTrustRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

