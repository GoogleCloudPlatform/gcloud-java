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
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * OIDC discovery information of the target cluster.
 *
 * Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
 * API server. This fields indicates how Google Cloud Platform services
 * validate KSA tokens in order to allow system workloads (such as GKE Connect
 * and telemetry agents) to authenticate back to Google Cloud Platform.
 *
 * Both clusters with public and private issuer URLs are supported.
 * Clusters with public issuers only need to specify the `issuer_url` field
 * while clusters with private issuers need to provide both
 * `issuer_url` and `oidc_jwks`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AttachedOidcConfig}
 */
public final class AttachedOidcConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AttachedOidcConfig)
    AttachedOidcConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AttachedOidcConfig.newBuilder() to construct.
  private AttachedOidcConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AttachedOidcConfig() {
    issuerUrl_ = "";
    jwks_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AttachedOidcConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.class,
            com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.Builder.class);
  }

  public static final int ISSUER_URL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object issuerUrl_ = "";
  /**
   *
   *
   * <pre>
   * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
   * </pre>
   *
   * <code>string issuer_url = 1;</code>
   *
   * @return The issuerUrl.
   */
  @java.lang.Override
  public java.lang.String getIssuerUrl() {
    java.lang.Object ref = issuerUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issuerUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
   * </pre>
   *
   * <code>string issuer_url = 1;</code>
   *
   * @return The bytes for issuerUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIssuerUrlBytes() {
    java.lang.Object ref = issuerUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      issuerUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JWKS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString jwks_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Optional. OIDC verification keys in JWKS format (RFC 7517).
   * It contains a list of OIDC verification keys that can be used to verify
   * OIDC JWTs.
   *
   * This field is required for cluster that doesn't have a publicly available
   * discovery endpoint. When provided, it will be directly used
   * to verify the OIDC JWT asserted by the IDP.
   * </pre>
   *
   * <code>bytes jwks = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The jwks.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJwks() {
    return jwks_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuerUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issuerUrl_);
    }
    if (!jwks_.isEmpty()) {
      output.writeBytes(2, jwks_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuerUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issuerUrl_);
    }
    if (!jwks_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, jwks_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AttachedOidcConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AttachedOidcConfig other =
        (com.google.cloud.gkemulticloud.v1.AttachedOidcConfig) obj;

    if (!getIssuerUrl().equals(other.getIssuerUrl())) return false;
    if (!getJwks().equals(other.getJwks())) return false;
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
    hash = (37 * hash) + ISSUER_URL_FIELD_NUMBER;
    hash = (53 * hash) + getIssuerUrl().hashCode();
    hash = (37 * hash) + JWKS_FIELD_NUMBER;
    hash = (53 * hash) + getJwks().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AttachedOidcConfig prototype) {
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
   * OIDC discovery information of the target cluster.
   *
   * Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
   * API server. This fields indicates how Google Cloud Platform services
   * validate KSA tokens in order to allow system workloads (such as GKE Connect
   * and telemetry agents) to authenticate back to Google Cloud Platform.
   *
   * Both clusters with public and private issuer URLs are supported.
   * Clusters with public issuers only need to specify the `issuer_url` field
   * while clusters with private issuers need to provide both
   * `issuer_url` and `oidc_jwks`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AttachedOidcConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AttachedOidcConfig)
      com.google.cloud.gkemulticloud.v1.AttachedOidcConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.class,
              com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      issuerUrl_ = "";
      jwks_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AttachedResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AttachedOidcConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedOidcConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedOidcConfig build() {
      com.google.cloud.gkemulticloud.v1.AttachedOidcConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AttachedOidcConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AttachedOidcConfig result =
          new com.google.cloud.gkemulticloud.v1.AttachedOidcConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AttachedOidcConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.issuerUrl_ = issuerUrl_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.jwks_ = jwks_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AttachedOidcConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AttachedOidcConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AttachedOidcConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AttachedOidcConfig.getDefaultInstance())
        return this;
      if (!other.getIssuerUrl().isEmpty()) {
        issuerUrl_ = other.issuerUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getJwks() != com.google.protobuf.ByteString.EMPTY) {
        setJwks(other.getJwks());
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
                issuerUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                jwks_ = input.readBytes();
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

    private java.lang.Object issuerUrl_ = "";
    /**
     *
     *
     * <pre>
     * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
     * </pre>
     *
     * <code>string issuer_url = 1;</code>
     *
     * @return The issuerUrl.
     */
    public java.lang.String getIssuerUrl() {
      java.lang.Object ref = issuerUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issuerUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
     * </pre>
     *
     * <code>string issuer_url = 1;</code>
     *
     * @return The bytes for issuerUrl.
     */
    public com.google.protobuf.ByteString getIssuerUrlBytes() {
      java.lang.Object ref = issuerUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        issuerUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
     * </pre>
     *
     * <code>string issuer_url = 1;</code>
     *
     * @param value The issuerUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIssuerUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      issuerUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
     * </pre>
     *
     * <code>string issuer_url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIssuerUrl() {
      issuerUrl_ = getDefaultInstance().getIssuerUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://`.
     * </pre>
     *
     * <code>string issuer_url = 1;</code>
     *
     * @param value The bytes for issuerUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIssuerUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      issuerUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString jwks_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Optional. OIDC verification keys in JWKS format (RFC 7517).
     * It contains a list of OIDC verification keys that can be used to verify
     * OIDC JWTs.
     *
     * This field is required for cluster that doesn't have a publicly available
     * discovery endpoint. When provided, it will be directly used
     * to verify the OIDC JWT asserted by the IDP.
     * </pre>
     *
     * <code>bytes jwks = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The jwks.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getJwks() {
      return jwks_;
    }
    /**
     *
     *
     * <pre>
     * Optional. OIDC verification keys in JWKS format (RFC 7517).
     * It contains a list of OIDC verification keys that can be used to verify
     * OIDC JWTs.
     *
     * This field is required for cluster that doesn't have a publicly available
     * discovery endpoint. When provided, it will be directly used
     * to verify the OIDC JWT asserted by the IDP.
     * </pre>
     *
     * <code>bytes jwks = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The jwks to set.
     * @return This builder for chaining.
     */
    public Builder setJwks(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      jwks_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. OIDC verification keys in JWKS format (RFC 7517).
     * It contains a list of OIDC verification keys that can be used to verify
     * OIDC JWTs.
     *
     * This field is required for cluster that doesn't have a publicly available
     * discovery endpoint. When provided, it will be directly used
     * to verify the OIDC JWT asserted by the IDP.
     * </pre>
     *
     * <code>bytes jwks = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJwks() {
      bitField0_ = (bitField0_ & ~0x00000002);
      jwks_ = getDefaultInstance().getJwks();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AttachedOidcConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AttachedOidcConfig)
  private static final com.google.cloud.gkemulticloud.v1.AttachedOidcConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AttachedOidcConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AttachedOidcConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachedOidcConfig> PARSER =
      new com.google.protobuf.AbstractParser<AttachedOidcConfig>() {
        @java.lang.Override
        public AttachedOidcConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttachedOidcConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachedOidcConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AttachedOidcConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
