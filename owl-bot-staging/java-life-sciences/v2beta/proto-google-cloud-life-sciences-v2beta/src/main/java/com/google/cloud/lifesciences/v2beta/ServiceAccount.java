// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 * <pre>
 * Carries information about a Google Cloud service account.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.ServiceAccount}
 */
public final class ServiceAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.ServiceAccount)
    ServiceAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceAccount.newBuilder() to construct.
  private ServiceAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAccount() {
    email_ = "";
    scopes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ServiceAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ServiceAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.ServiceAccount.class, com.google.cloud.lifesciences.v2beta.ServiceAccount.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList scopes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return A list containing the scopes.
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return The count of scopes.
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
    }
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scopes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.ServiceAccount)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.ServiceAccount other = (com.google.cloud.lifesciences.v2beta.ServiceAccount) obj;

    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getScopesList()
        .equals(other.getScopesList())) return false;
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
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.lifesciences.v2beta.ServiceAccount parseFrom(
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
  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.ServiceAccount prototype) {
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
   * Carries information about a Google Cloud service account.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.ServiceAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.ServiceAccount)
      com.google.cloud.lifesciences.v2beta.ServiceAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ServiceAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ServiceAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.ServiceAccount.class, com.google.cloud.lifesciences.v2beta.ServiceAccount.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.ServiceAccount.newBuilder()
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
      email_ = "";
      scopes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto.internal_static_google_cloud_lifesciences_v2beta_ServiceAccount_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ServiceAccount getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.ServiceAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ServiceAccount build() {
      com.google.cloud.lifesciences.v2beta.ServiceAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ServiceAccount buildPartial() {
      com.google.cloud.lifesciences.v2beta.ServiceAccount result = new com.google.cloud.lifesciences.v2beta.ServiceAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.ServiceAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        scopes_.makeImmutable();
        result.scopes_ = scopes_;
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.ServiceAccount) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.ServiceAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.ServiceAccount other) {
      if (other == com.google.cloud.lifesciences.v2beta.ServiceAccount.getDefaultInstance()) return this;
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ |= 0x00000002;
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
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
              email_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureScopesIsMutable();
              scopes_.add(s);
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

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * Email address of the service account. If not specified, the default
     * Compute Engine service account for the project will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Email address of the service account. If not specified, the default
     * Compute Engine service account for the project will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Email address of the service account. If not specified, the default
     * Compute Engine service account for the project will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email address of the service account. If not specified, the default
     * Compute Engine service account for the project will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email address of the service account. If not specified, the default
     * Compute Engine service account for the project will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList scopes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureScopesIsMutable() {
      if (!scopes_.isModifiable()) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return A list containing the scopes.
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      scopes_.makeImmutable();
      return scopes_;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return The count of scopes.
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the element to return.
     * @return The scopes at the given index.
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scopes at the given index.
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param index The index to set the value at.
     * @param value The scopes to set.
     * @return This builder for chaining.
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param values The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopes() {
      scopes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of scopes to be enabled for this service account on the VM, in
     * addition to the cloud-platform API scope that will be added by default.
     * </pre>
     *
     * <code>repeated string scopes = 2;</code>
     * @param value The bytes of the scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.ServiceAccount)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.ServiceAccount)
  private static final com.google.cloud.lifesciences.v2beta.ServiceAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.ServiceAccount();
  }

  public static com.google.cloud.lifesciences.v2beta.ServiceAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAccount>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAccount>() {
    @java.lang.Override
    public ServiceAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.ServiceAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

