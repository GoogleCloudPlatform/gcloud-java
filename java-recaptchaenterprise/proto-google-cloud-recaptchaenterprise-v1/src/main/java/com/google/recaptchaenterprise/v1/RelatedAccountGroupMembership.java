/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.3
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * A membership in a group of related accounts.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership}
 */
public final class RelatedAccountGroupMembership extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership)
    RelatedAccountGroupMembershipOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RelatedAccountGroupMembership.newBuilder() to construct.
  private RelatedAccountGroupMembership(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RelatedAccountGroupMembership() {
    name_ = "";
    accountId_ = "";
    hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RelatedAccountGroupMembership();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_RelatedAccountGroupMembership_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_RelatedAccountGroupMembership_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.class,
            com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Identifier. The resource name for this membership in the format
   * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Identifier. The resource name for this membership in the format
   * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object accountId_ = "";
  /**
   *
   *
   * <pre>
   * The unique stable account identifier of the member. The identifier
   * corresponds to an `account_id` provided in a previous `CreateAssessment` or
   * `AnnotateAssessment` call.
   * </pre>
   *
   * <code>string account_id = 4;</code>
   *
   * @return The accountId.
   */
  @java.lang.Override
  public java.lang.String getAccountId() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unique stable account identifier of the member. The identifier
   * corresponds to an `account_id` provided in a previous `CreateAssessment` or
   * `AnnotateAssessment` call.
   * </pre>
   *
   * <code>string account_id = 4;</code>
   *
   * @return The bytes for accountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccountIdBytes() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASHED_ACCOUNT_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Deprecated: use `account_id` instead.
   * The unique stable hashed account identifier of the member. The identifier
   * corresponds to a `hashed_account_id` provided in a previous
   * `CreateAssessment` or `AnnotateAssessment` call.
   * </pre>
   *
   * <code>bytes hashed_account_id = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership.hashed_account_id
   *     is deprecated. See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=1891
   * @return The hashedAccountId.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getHashedAccountId() {
    return hashedAccountId_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!hashedAccountId_.isEmpty()) {
      output.writeBytes(2, hashedAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, accountId_);
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
    if (!hashedAccountId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, hashedAccountId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, accountId_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership other =
        (com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAccountId().equals(other.getAccountId())) return false;
    if (!getHashedAccountId().equals(other.getHashedAccountId())) return false;
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
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId().hashCode();
    hash = (37 * hash) + HASHED_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHashedAccountId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership parseFrom(
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

  public static Builder newBuilder(
      com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership prototype) {
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
   * A membership in a group of related accounts.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership)
      com.google.recaptchaenterprise.v1.RelatedAccountGroupMembershipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RelatedAccountGroupMembership_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RelatedAccountGroupMembership_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.class,
              com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      accountId_ = "";
      hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RelatedAccountGroupMembership_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership
        getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership build() {
      com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership buildPartial() {
      com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership result =
          new com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accountId_ = accountId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hashedAccountId_ = hashedAccountId_;
      }
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
      if (other instanceof com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership) {
        return mergeFrom((com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership other) {
      if (other
          == com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccountId().isEmpty()) {
        accountId_ = other.accountId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getHashedAccountId() != com.google.protobuf.ByteString.EMPTY) {
        setHashedAccountId(other.getHashedAccountId());
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                hashedAccountId_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 34:
              {
                accountId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 34
            default:
              {
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
     *
     *
     * <pre>
     * Required. Identifier. The resource name for this membership in the format
     * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Identifier. The resource name for this membership in the format
     * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Identifier. The resource name for this membership in the format
     * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Identifier. The resource name for this membership in the format
     * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Identifier. The resource name for this membership in the format
     * `projects/{project}/relatedaccountgroups/{relatedaccountgroup}/memberships/{membership}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object accountId_ = "";
    /**
     *
     *
     * <pre>
     * The unique stable account identifier of the member. The identifier
     * corresponds to an `account_id` provided in a previous `CreateAssessment` or
     * `AnnotateAssessment` call.
     * </pre>
     *
     * <code>string account_id = 4;</code>
     *
     * @return The accountId.
     */
    public java.lang.String getAccountId() {
      java.lang.Object ref = accountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique stable account identifier of the member. The identifier
     * corresponds to an `account_id` provided in a previous `CreateAssessment` or
     * `AnnotateAssessment` call.
     * </pre>
     *
     * <code>string account_id = 4;</code>
     *
     * @return The bytes for accountId.
     */
    public com.google.protobuf.ByteString getAccountIdBytes() {
      java.lang.Object ref = accountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique stable account identifier of the member. The identifier
     * corresponds to an `account_id` provided in a previous `CreateAssessment` or
     * `AnnotateAssessment` call.
     * </pre>
     *
     * <code>string account_id = 4;</code>
     *
     * @param value The accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique stable account identifier of the member. The identifier
     * corresponds to an `account_id` provided in a previous `CreateAssessment` or
     * `AnnotateAssessment` call.
     * </pre>
     *
     * <code>string account_id = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccountId() {
      accountId_ = getDefaultInstance().getAccountId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique stable account identifier of the member. The identifier
     * corresponds to an `account_id` provided in a previous `CreateAssessment` or
     * `AnnotateAssessment` call.
     * </pre>
     *
     * <code>string account_id = 4;</code>
     *
     * @param value The bytes for accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hashedAccountId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Deprecated: use `account_id` instead.
     * The unique stable hashed account identifier of the member. The identifier
     * corresponds to a `hashed_account_id` provided in a previous
     * `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [deprecated = true];</code>
     *
     * @deprecated
     *     google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership.hashed_account_id is
     *     deprecated. See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=1891
     * @return The hashedAccountId.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getHashedAccountId() {
      return hashedAccountId_;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `account_id` instead.
     * The unique stable hashed account identifier of the member. The identifier
     * corresponds to a `hashed_account_id` provided in a previous
     * `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [deprecated = true];</code>
     *
     * @deprecated
     *     google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership.hashed_account_id is
     *     deprecated. See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=1891
     * @param value The hashedAccountId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setHashedAccountId(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hashedAccountId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated: use `account_id` instead.
     * The unique stable hashed account identifier of the member. The identifier
     * corresponds to a `hashed_account_id` provided in a previous
     * `CreateAssessment` or `AnnotateAssessment` call.
     * </pre>
     *
     * <code>bytes hashed_account_id = 2 [deprecated = true];</code>
     *
     * @deprecated
     *     google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership.hashed_account_id is
     *     deprecated. See google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=1891
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearHashedAccountId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hashedAccountId_ = getDefaultInstance().getHashedAccountId();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.RelatedAccountGroupMembership)
  private static final com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership();
  }

  public static com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelatedAccountGroupMembership> PARSER =
      new com.google.protobuf.AbstractParser<RelatedAccountGroupMembership>() {
        @java.lang.Override
        public RelatedAccountGroupMembership parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelatedAccountGroupMembership> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelatedAccountGroupMembership> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
