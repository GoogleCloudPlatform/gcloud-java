// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/cloudauditlogging/cloudauditlogging.proto

package com.google.cloud.gkehub.cloudauditlogging.v1alpha;

/**
 * <pre>
 * **Cloud Audit Logging**: Spec for Audit Logging Allowlisting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec}
 */
public final class FeatureSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)
    FeatureSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeatureSpec.newBuilder() to construct.
  private FeatureSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeatureSpec() {
    allowlistedServiceAccounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeatureSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.class, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder.class);
  }

  public static final int ALLOWLISTED_SERVICE_ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList allowlistedServiceAccounts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Service account that should be allowlisted to send the audit logs; eg
   * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
   * already exist, but do not need to have any permissions granted to them.
   * The customer's entitlements will be checked prior to allowlisting (i.e.
   * the customer must be an Anthos customer.)
   * </pre>
   *
   * <code>repeated string allowlisted_service_accounts = 1;</code>
   * @return A list containing the allowlistedServiceAccounts.
   */
  public com.google.protobuf.ProtocolStringList
      getAllowlistedServiceAccountsList() {
    return allowlistedServiceAccounts_;
  }
  /**
   * <pre>
   * Service account that should be allowlisted to send the audit logs; eg
   * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
   * already exist, but do not need to have any permissions granted to them.
   * The customer's entitlements will be checked prior to allowlisting (i.e.
   * the customer must be an Anthos customer.)
   * </pre>
   *
   * <code>repeated string allowlisted_service_accounts = 1;</code>
   * @return The count of allowlistedServiceAccounts.
   */
  public int getAllowlistedServiceAccountsCount() {
    return allowlistedServiceAccounts_.size();
  }
  /**
   * <pre>
   * Service account that should be allowlisted to send the audit logs; eg
   * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
   * already exist, but do not need to have any permissions granted to them.
   * The customer's entitlements will be checked prior to allowlisting (i.e.
   * the customer must be an Anthos customer.)
   * </pre>
   *
   * <code>repeated string allowlisted_service_accounts = 1;</code>
   * @param index The index of the element to return.
   * @return The allowlistedServiceAccounts at the given index.
   */
  public java.lang.String getAllowlistedServiceAccounts(int index) {
    return allowlistedServiceAccounts_.get(index);
  }
  /**
   * <pre>
   * Service account that should be allowlisted to send the audit logs; eg
   * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
   * already exist, but do not need to have any permissions granted to them.
   * The customer's entitlements will be checked prior to allowlisting (i.e.
   * the customer must be an Anthos customer.)
   * </pre>
   *
   * <code>repeated string allowlisted_service_accounts = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowlistedServiceAccounts at the given index.
   */
  public com.google.protobuf.ByteString
      getAllowlistedServiceAccountsBytes(int index) {
    return allowlistedServiceAccounts_.getByteString(index);
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
    for (int i = 0; i < allowlistedServiceAccounts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowlistedServiceAccounts_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowlistedServiceAccounts_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowlistedServiceAccounts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowlistedServiceAccountsList().size();
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
    if (!(obj instanceof com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec other = (com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) obj;

    if (!getAllowlistedServiceAccountsList()
        .equals(other.getAllowlistedServiceAccountsList())) return false;
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
    if (getAllowlistedServiceAccountsCount() > 0) {
      hash = (37 * hash) + ALLOWLISTED_SERVICE_ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowlistedServiceAccountsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec prototype) {
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
   * **Cloud Audit Logging**: Spec for Audit Logging Allowlisting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)
      com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.class, com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.newBuilder()
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
      allowlistedServiceAccounts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.cloudauditlogging.v1alpha.CloudAuditLoggingProto.internal_static_google_cloud_gkehub_cloudauditlogging_v1alpha_FeatureSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getDefaultInstanceForType() {
      return com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec build() {
      com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec buildPartial() {
      com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec result = new com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        allowlistedServiceAccounts_.makeImmutable();
        result.allowlistedServiceAccounts_ = allowlistedServiceAccounts_;
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
      if (other instanceof com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec) {
        return mergeFrom((com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec other) {
      if (other == com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec.getDefaultInstance()) return this;
      if (!other.allowlistedServiceAccounts_.isEmpty()) {
        if (allowlistedServiceAccounts_.isEmpty()) {
          allowlistedServiceAccounts_ = other.allowlistedServiceAccounts_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAllowlistedServiceAccountsIsMutable();
          allowlistedServiceAccounts_.addAll(other.allowlistedServiceAccounts_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAllowlistedServiceAccountsIsMutable();
              allowlistedServiceAccounts_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList allowlistedServiceAccounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAllowlistedServiceAccountsIsMutable() {
      if (!allowlistedServiceAccounts_.isModifiable()) {
        allowlistedServiceAccounts_ = new com.google.protobuf.LazyStringArrayList(allowlistedServiceAccounts_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @return A list containing the allowlistedServiceAccounts.
     */
    public com.google.protobuf.ProtocolStringList
        getAllowlistedServiceAccountsList() {
      allowlistedServiceAccounts_.makeImmutable();
      return allowlistedServiceAccounts_;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @return The count of allowlistedServiceAccounts.
     */
    public int getAllowlistedServiceAccountsCount() {
      return allowlistedServiceAccounts_.size();
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param index The index of the element to return.
     * @return The allowlistedServiceAccounts at the given index.
     */
    public java.lang.String getAllowlistedServiceAccounts(int index) {
      return allowlistedServiceAccounts_.get(index);
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowlistedServiceAccounts at the given index.
     */
    public com.google.protobuf.ByteString
        getAllowlistedServiceAccountsBytes(int index) {
      return allowlistedServiceAccounts_.getByteString(index);
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param index The index to set the value at.
     * @param value The allowlistedServiceAccounts to set.
     * @return This builder for chaining.
     */
    public Builder setAllowlistedServiceAccounts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllowlistedServiceAccountsIsMutable();
      allowlistedServiceAccounts_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param value The allowlistedServiceAccounts to add.
     * @return This builder for chaining.
     */
    public Builder addAllowlistedServiceAccounts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllowlistedServiceAccountsIsMutable();
      allowlistedServiceAccounts_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param values The allowlistedServiceAccounts to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowlistedServiceAccounts(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllowlistedServiceAccountsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allowlistedServiceAccounts_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowlistedServiceAccounts() {
      allowlistedServiceAccounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service account that should be allowlisted to send the audit logs; eg
     * cloudauditlogging&#64;gcp-project.iam.gserviceaccount.com. These accounts must
     * already exist, but do not need to have any permissions granted to them.
     * The customer's entitlements will be checked prior to allowlisting (i.e.
     * the customer must be an Anthos customer.)
     * </pre>
     *
     * <code>repeated string allowlisted_service_accounts = 1;</code>
     * @param value The bytes of the allowlistedServiceAccounts to add.
     * @return This builder for chaining.
     */
    public Builder addAllowlistedServiceAccountsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAllowlistedServiceAccountsIsMutable();
      allowlistedServiceAccounts_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec)
  private static final com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec();
  }

  public static com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureSpec>
      PARSER = new com.google.protobuf.AbstractParser<FeatureSpec>() {
    @java.lang.Override
    public FeatureSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.cloudauditlogging.v1alpha.FeatureSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

