// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/target.proto

package com.google.cloud.tasks.v2beta3;

/**
 *
 *
 * <pre>
 * Contains information needed for generating an
 * [OpenID Connect
 * token](https://developers.google.com/identity/protocols/OpenIDConnect). This
 * type of authorization should be used when sending requests to third party
 * endpoints.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.OidcToken}
 */
public final class OidcToken extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.OidcToken)
    OidcTokenOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OidcToken.newBuilder() to construct.
  private OidcToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OidcToken() {
    serviceAccountEmail_ = "";
    audience_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OidcToken(
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

              serviceAccountEmail_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              audience_ = s;
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
    return com.google.cloud.tasks.v2beta3.TargetProto
        .internal_static_google_cloud_tasks_v2beta3_OidcToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.TargetProto
        .internal_static_google_cloud_tasks_v2beta3_OidcToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.OidcToken.class,
            com.google.cloud.tasks.v2beta3.OidcToken.Builder.class);
  }

  public static final int SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceAccountEmail_;
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OIDC token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   */
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
   * to be used for generating OIDC token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   */
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

  public static final int AUDIENCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object audience_;
  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   */
  public java.lang.String getAudience() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audience_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   */
  public com.google.protobuf.ByteString getAudienceBytes() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      audience_ = b;
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
    if (!getServiceAccountEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAccountEmail_);
    }
    if (!getAudienceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audience_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceAccountEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAccountEmail_);
    }
    if (!getAudienceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audience_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.OidcToken)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.OidcToken other = (com.google.cloud.tasks.v2beta3.OidcToken) obj;

    if (!getServiceAccountEmail().equals(other.getServiceAccountEmail())) return false;
    if (!getAudience().equals(other.getAudience())) return false;
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
    hash = (37 * hash) + SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccountEmail().hashCode();
    hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getAudience().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.OidcToken prototype) {
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
   * [OpenID Connect
   * token](https://developers.google.com/identity/protocols/OpenIDConnect). This
   * type of authorization should be used when sending requests to third party
   * endpoints.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.OidcToken}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.OidcToken)
      com.google.cloud.tasks.v2beta3.OidcTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta3.TargetProto
          .internal_static_google_cloud_tasks_v2beta3_OidcToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.TargetProto
          .internal_static_google_cloud_tasks_v2beta3_OidcToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.OidcToken.class,
              com.google.cloud.tasks.v2beta3.OidcToken.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.OidcToken.newBuilder()
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
      serviceAccountEmail_ = "";

      audience_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.TargetProto
          .internal_static_google_cloud_tasks_v2beta3_OidcToken_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.OidcToken getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.OidcToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.OidcToken build() {
      com.google.cloud.tasks.v2beta3.OidcToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.OidcToken buildPartial() {
      com.google.cloud.tasks.v2beta3.OidcToken result =
          new com.google.cloud.tasks.v2beta3.OidcToken(this);
      result.serviceAccountEmail_ = serviceAccountEmail_;
      result.audience_ = audience_;
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
      if (other instanceof com.google.cloud.tasks.v2beta3.OidcToken) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.OidcToken) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.OidcToken other) {
      if (other == com.google.cloud.tasks.v2beta3.OidcToken.getDefaultInstance()) return this;
      if (!other.getServiceAccountEmail().isEmpty()) {
        serviceAccountEmail_ = other.serviceAccountEmail_;
        onChanged();
      }
      if (!other.getAudience().isEmpty()) {
        audience_ = other.audience_;
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
      com.google.cloud.tasks.v2beta3.OidcToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta3.OidcToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceAccountEmail_ = "";
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the queue. The
     * caller must have iam.serviceAccounts.actAs permission for the service
     * account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
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
     * to be used for generating OIDC token.
     * The service account must be within the same project as the queue. The
     * caller must have iam.serviceAccounts.actAs permission for the service
     * account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
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
     * to be used for generating OIDC token.
     * The service account must be within the same project as the queue. The
     * caller must have iam.serviceAccounts.actAs permission for the service
     * account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     */
    public Builder setServiceAccountEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceAccountEmail_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the queue. The
     * caller must have iam.serviceAccounts.actAs permission for the service
     * account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     */
    public Builder clearServiceAccountEmail() {

      serviceAccountEmail_ = getDefaultInstance().getServiceAccountEmail();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the queue. The
     * caller must have iam.serviceAccounts.actAs permission for the service
     * account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     */
    public Builder setServiceAccountEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceAccountEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object audience_ = "";
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     */
    public java.lang.String getAudience() {
      java.lang.Object ref = audience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     */
    public com.google.protobuf.ByteString getAudienceBytes() {
      java.lang.Object ref = audience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     */
    public Builder setAudience(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      audience_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     */
    public Builder clearAudience() {

      audience_ = getDefaultInstance().getAudience();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     */
    public Builder setAudienceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      audience_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.OidcToken)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.OidcToken)
  private static final com.google.cloud.tasks.v2beta3.OidcToken DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.OidcToken();
  }

  public static com.google.cloud.tasks.v2beta3.OidcToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OidcToken> PARSER =
      new com.google.protobuf.AbstractParser<OidcToken>() {
        @java.lang.Override
        public OidcToken parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OidcToken(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OidcToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OidcToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.OidcToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
