/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/scheduler/v1/target.proto

package com.google.cloud.scheduler.v1;

/**
 *
 *
 * <pre>
 * Contains information needed for generating an
 * [OAuth token](https://developers.google.com/identity/protocols/OAuth2).
 * This type of authorization should generally only be used when calling Google
 * APIs hosted on *.googleapis.com.
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1.OAuthToken}
 */
public final class OAuthToken extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1.OAuthToken)
    OAuthTokenOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OAuthToken.newBuilder() to construct.
  private OAuthToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OAuthToken() {
    serviceAccountEmail_ = "";
    scope_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OAuthToken();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.scheduler.v1.TargetProto
        .internal_static_google_cloud_scheduler_v1_OAuthToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1.TargetProto
        .internal_static_google_cloud_scheduler_v1_OAuthToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1.OAuthToken.class,
            com.google.cloud.scheduler.v1.OAuthToken.Builder.class);
  }

  public static final int SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceAccountEmail_ = "";
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The serviceAccountEmail.
   */
  @java.lang.Override
  public java.lang.String getServiceAccountEmail() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccountEmail_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAccountEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object scope_ = "";
  /**
   *
   *
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The scope.
   */
  @java.lang.Override
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scope_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   *
   * @return The bytes for scope.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      scope_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scope_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scope_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scope_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scope_);
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
    if (!(obj instanceof com.google.cloud.scheduler.v1.OAuthToken)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1.OAuthToken other = (com.google.cloud.scheduler.v1.OAuthToken) obj;

    if (!getServiceAccountEmail().equals(other.getServiceAccountEmail())) return false;
    if (!getScope().equals(other.getScope())) return false;
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
    hash = (37 * hash) + SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccountEmail().hashCode();
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + getScope().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1.OAuthToken parseFrom(
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

  public static Builder newBuilder(com.google.cloud.scheduler.v1.OAuthToken prototype) {
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
   * Contains information needed for generating an
   * [OAuth token](https://developers.google.com/identity/protocols/OAuth2).
   * This type of authorization should generally only be used when calling Google
   * APIs hosted on *.googleapis.com.
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1.OAuthToken}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1.OAuthToken)
      com.google.cloud.scheduler.v1.OAuthTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.scheduler.v1.TargetProto
          .internal_static_google_cloud_scheduler_v1_OAuthToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1.TargetProto
          .internal_static_google_cloud_scheduler_v1_OAuthToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1.OAuthToken.class,
              com.google.cloud.scheduler.v1.OAuthToken.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1.OAuthToken.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceAccountEmail_ = "";
      scope_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.scheduler.v1.TargetProto
          .internal_static_google_cloud_scheduler_v1_OAuthToken_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.OAuthToken getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1.OAuthToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.OAuthToken build() {
      com.google.cloud.scheduler.v1.OAuthToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1.OAuthToken buildPartial() {
      com.google.cloud.scheduler.v1.OAuthToken result =
          new com.google.cloud.scheduler.v1.OAuthToken(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.scheduler.v1.OAuthToken result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAccountEmail_ = serviceAccountEmail_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scope_ = scope_;
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
      if (other instanceof com.google.cloud.scheduler.v1.OAuthToken) {
        return mergeFrom((com.google.cloud.scheduler.v1.OAuthToken) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1.OAuthToken other) {
      if (other == com.google.cloud.scheduler.v1.OAuthToken.getDefaultInstance()) return this;
      if (!other.getServiceAccountEmail().isEmpty()) {
        serviceAccountEmail_ = other.serviceAccountEmail_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getScope().isEmpty()) {
        scope_ = other.scope_;
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
            case 10:
              {
                serviceAccountEmail_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                scope_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object serviceAccountEmail_ = "";
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OAuth token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return The serviceAccountEmail.
     */
    public java.lang.String getServiceAccountEmail() {
      java.lang.Object ref = serviceAccountEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccountEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OAuth token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return The bytes for serviceAccountEmail.
     */
    public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
      java.lang.Object ref = serviceAccountEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAccountEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OAuth token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @param value The serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceAccountEmail_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OAuth token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAccountEmail() {
      serviceAccountEmail_ = getDefaultInstance().getServiceAccountEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OAuth token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @param value The bytes for serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceAccountEmail_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object scope_ = "";
    /**
     *
     *
     * <pre>
     * OAuth scope to be used for generating OAuth access token.
     * If not specified, "https://www.googleapis.com/auth/cloud-platform"
     * will be used.
     * </pre>
     *
     * <code>string scope = 2;</code>
     *
     * @return The scope.
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * OAuth scope to be used for generating OAuth access token.
     * If not specified, "https://www.googleapis.com/auth/cloud-platform"
     * will be used.
     * </pre>
     *
     * <code>string scope = 2;</code>
     *
     * @return The bytes for scope.
     */
    public com.google.protobuf.ByteString getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * OAuth scope to be used for generating OAuth access token.
     * If not specified, "https://www.googleapis.com/auth/cloud-platform"
     * will be used.
     * </pre>
     *
     * <code>string scope = 2;</code>
     *
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scope_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * OAuth scope to be used for generating OAuth access token.
     * If not specified, "https://www.googleapis.com/auth/cloud-platform"
     * will be used.
     * </pre>
     *
     * <code>string scope = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      scope_ = getDefaultInstance().getScope();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * OAuth scope to be used for generating OAuth access token.
     * If not specified, "https://www.googleapis.com/auth/cloud-platform"
     * will be used.
     * </pre>
     *
     * <code>string scope = 2;</code>
     *
     * @param value The bytes for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      scope_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1.OAuthToken)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1.OAuthToken)
  private static final com.google.cloud.scheduler.v1.OAuthToken DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1.OAuthToken();
  }

  public static com.google.cloud.scheduler.v1.OAuthToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAuthToken> PARSER =
      new com.google.protobuf.AbstractParser<OAuthToken>() {
        @java.lang.Override
        public OAuthToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<OAuthToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAuthToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1.OAuthToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
