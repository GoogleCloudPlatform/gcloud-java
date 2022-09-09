// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

package com.google.cloud.networksecurity.v1beta1;

/**
 * <pre>
 * Request used by the CreateAuthorizationPolicy method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest}
 */
public final class CreateAuthorizationPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)
    CreateAuthorizationPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAuthorizationPolicyRequest.newBuilder() to construct.
  private CreateAuthorizationPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAuthorizationPolicyRequest() {
    parent_ = "";
    authorizationPolicyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAuthorizationPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAuthorizationPolicyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            authorizationPolicyId_ = s;
            break;
          }
          case 26: {
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder subBuilder = null;
            if (authorizationPolicy_ != null) {
              subBuilder = authorizationPolicy_.toBuilder();
            }
            authorizationPolicy_ = input.readMessage(com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(authorizationPolicy_);
              authorizationPolicy_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent resource of the AuthorizationPolicy. Must be in the
   * format `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource of the AuthorizationPolicy. Must be in the
   * format `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORIZATION_POLICY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object authorizationPolicyId_;
  /**
   * <pre>
   * Required. Short name of the AuthorizationPolicy resource to be created.
   * This value should be 1-63 characters long, containing only
   * letters, numbers, hyphens, and underscores, and should not start
   * with a number. E.g. "authz_policy".
   * </pre>
   *
   * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The authorizationPolicyId.
   */
  @java.lang.Override
  public java.lang.String getAuthorizationPolicyId() {
    java.lang.Object ref = authorizationPolicyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authorizationPolicyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Short name of the AuthorizationPolicy resource to be created.
   * This value should be 1-63 characters long, containing only
   * letters, numbers, hyphens, and underscores, and should not start
   * with a number. E.g. "authz_policy".
   * </pre>
   *
   * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for authorizationPolicyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorizationPolicyIdBytes() {
    java.lang.Object ref = authorizationPolicyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authorizationPolicyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORIZATION_POLICY_FIELD_NUMBER = 3;
  private com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorizationPolicy_;
  /**
   * <pre>
   * Required. AuthorizationPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the authorizationPolicy field is set.
   */
  @java.lang.Override
  public boolean hasAuthorizationPolicy() {
    return authorizationPolicy_ != null;
  }
  /**
   * <pre>
   * Required. AuthorizationPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The authorizationPolicy.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy getAuthorizationPolicy() {
    return authorizationPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
  }
  /**
   * <pre>
   * Required. AuthorizationPolicy resource to be created.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder getAuthorizationPolicyOrBuilder() {
    return getAuthorizationPolicy();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authorizationPolicyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authorizationPolicyId_);
    }
    if (authorizationPolicy_ != null) {
      output.writeMessage(3, getAuthorizationPolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authorizationPolicyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authorizationPolicyId_);
    }
    if (authorizationPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAuthorizationPolicy());
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest other = (com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getAuthorizationPolicyId()
        .equals(other.getAuthorizationPolicyId())) return false;
    if (hasAuthorizationPolicy() != other.hasAuthorizationPolicy()) return false;
    if (hasAuthorizationPolicy()) {
      if (!getAuthorizationPolicy()
          .equals(other.getAuthorizationPolicy())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + AUTHORIZATION_POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthorizationPolicyId().hashCode();
    if (hasAuthorizationPolicy()) {
      hash = (37 * hash) + AUTHORIZATION_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorizationPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest prototype) {
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
   * Request used by the CreateAuthorizationPolicy method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)
      com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      authorizationPolicyId_ = "";

      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = null;
      } else {
        authorizationPolicy_ = null;
        authorizationPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest build() {
      com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest buildPartial() {
      com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest result = new com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest(this);
      result.parent_ = parent_;
      result.authorizationPolicyId_ = authorizationPolicyId_;
      if (authorizationPolicyBuilder_ == null) {
        result.authorizationPolicy_ = authorizationPolicy_;
      } else {
        result.authorizationPolicy_ = authorizationPolicyBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest) {
        return mergeFrom((com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest other) {
      if (other == com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getAuthorizationPolicyId().isEmpty()) {
        authorizationPolicyId_ = other.authorizationPolicyId_;
        onChanged();
      }
      if (other.hasAuthorizationPolicy()) {
        mergeAuthorizationPolicy(other.getAuthorizationPolicy());
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
      com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource of the AuthorizationPolicy. Must be in the
     * format `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the AuthorizationPolicy. Must be in the
     * format `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the AuthorizationPolicy. Must be in the
     * format `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the AuthorizationPolicy. Must be in the
     * format `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the AuthorizationPolicy. Must be in the
     * format `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object authorizationPolicyId_ = "";
    /**
     * <pre>
     * Required. Short name of the AuthorizationPolicy resource to be created.
     * This value should be 1-63 characters long, containing only
     * letters, numbers, hyphens, and underscores, and should not start
     * with a number. E.g. "authz_policy".
     * </pre>
     *
     * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The authorizationPolicyId.
     */
    public java.lang.String getAuthorizationPolicyId() {
      java.lang.Object ref = authorizationPolicyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authorizationPolicyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the AuthorizationPolicy resource to be created.
     * This value should be 1-63 characters long, containing only
     * letters, numbers, hyphens, and underscores, and should not start
     * with a number. E.g. "authz_policy".
     * </pre>
     *
     * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for authorizationPolicyId.
     */
    public com.google.protobuf.ByteString
        getAuthorizationPolicyIdBytes() {
      java.lang.Object ref = authorizationPolicyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authorizationPolicyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Short name of the AuthorizationPolicy resource to be created.
     * This value should be 1-63 characters long, containing only
     * letters, numbers, hyphens, and underscores, and should not start
     * with a number. E.g. "authz_policy".
     * </pre>
     *
     * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The authorizationPolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationPolicyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authorizationPolicyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the AuthorizationPolicy resource to be created.
     * This value should be 1-63 characters long, containing only
     * letters, numbers, hyphens, and underscores, and should not start
     * with a number. E.g. "authz_policy".
     * </pre>
     *
     * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorizationPolicyId() {
      
      authorizationPolicyId_ = getDefaultInstance().getAuthorizationPolicyId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Short name of the AuthorizationPolicy resource to be created.
     * This value should be 1-63 characters long, containing only
     * letters, numbers, hyphens, and underscores, and should not start
     * with a number. E.g. "authz_policy".
     * </pre>
     *
     * <code>string authorization_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for authorizationPolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorizationPolicyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authorizationPolicyId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorizationPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder> authorizationPolicyBuilder_;
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the authorizationPolicy field is set.
     */
    public boolean hasAuthorizationPolicy() {
      return authorizationPolicyBuilder_ != null || authorizationPolicy_ != null;
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The authorizationPolicy.
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy getAuthorizationPolicy() {
      if (authorizationPolicyBuilder_ == null) {
        return authorizationPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
      } else {
        return authorizationPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAuthorizationPolicy(com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy value) {
      if (authorizationPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorizationPolicy_ = value;
        onChanged();
      } else {
        authorizationPolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAuthorizationPolicy(
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder builderForValue) {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = builderForValue.build();
        onChanged();
      } else {
        authorizationPolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAuthorizationPolicy(com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy value) {
      if (authorizationPolicyBuilder_ == null) {
        if (authorizationPolicy_ != null) {
          authorizationPolicy_ =
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.newBuilder(authorizationPolicy_).mergeFrom(value).buildPartial();
        } else {
          authorizationPolicy_ = value;
        }
        onChanged();
      } else {
        authorizationPolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAuthorizationPolicy() {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = null;
        onChanged();
      } else {
        authorizationPolicy_ = null;
        authorizationPolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder getAuthorizationPolicyBuilder() {
      
      onChanged();
      return getAuthorizationPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder getAuthorizationPolicyOrBuilder() {
      if (authorizationPolicyBuilder_ != null) {
        return authorizationPolicyBuilder_.getMessageOrBuilder();
      } else {
        return authorizationPolicy_ == null ?
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
      }
    }
    /**
     * <pre>
     * Required. AuthorizationPolicy resource to be created.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder> 
        getAuthorizationPolicyFieldBuilder() {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder>(
                getAuthorizationPolicy(),
                getParentForChildren(),
                isClean());
        authorizationPolicy_ = null;
      }
      return authorizationPolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest)
  private static final com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest();
  }

  public static com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAuthorizationPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAuthorizationPolicyRequest>() {
    @java.lang.Override
    public CreateAuthorizationPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAuthorizationPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAuthorizationPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAuthorizationPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.CreateAuthorizationPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

