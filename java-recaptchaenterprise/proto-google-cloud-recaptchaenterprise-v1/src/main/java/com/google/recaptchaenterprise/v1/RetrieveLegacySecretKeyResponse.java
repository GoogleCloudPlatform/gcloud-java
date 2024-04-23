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
 * Secret key is used only in legacy reCAPTCHA. It must be used in a 3rd party
 * integration with legacy reCAPTCHA.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse}
 */
public final class RetrieveLegacySecretKeyResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)
    RetrieveLegacySecretKeyResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrieveLegacySecretKeyResponse.newBuilder() to construct.
  private RetrieveLegacySecretKeyResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrieveLegacySecretKeyResponse() {
    legacySecretKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrieveLegacySecretKeyResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_RetrieveLegacySecretKeyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_RetrieveLegacySecretKeyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.class,
            com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.Builder.class);
  }

  public static final int LEGACY_SECRET_KEY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object legacySecretKey_ = "";
  /**
   *
   *
   * <pre>
   * The secret key (also known as shared secret) authorizes communication
   * between your application backend and the reCAPTCHA Enterprise server to
   * create an assessment.
   * The secret key needs to be kept safe for security purposes.
   * </pre>
   *
   * <code>string legacy_secret_key = 1;</code>
   *
   * @return The legacySecretKey.
   */
  @java.lang.Override
  public java.lang.String getLegacySecretKey() {
    java.lang.Object ref = legacySecretKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      legacySecretKey_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The secret key (also known as shared secret) authorizes communication
   * between your application backend and the reCAPTCHA Enterprise server to
   * create an assessment.
   * The secret key needs to be kept safe for security purposes.
   * </pre>
   *
   * <code>string legacy_secret_key = 1;</code>
   *
   * @return The bytes for legacySecretKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLegacySecretKeyBytes() {
    java.lang.Object ref = legacySecretKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      legacySecretKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(legacySecretKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, legacySecretKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(legacySecretKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, legacySecretKey_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse other =
        (com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse) obj;

    if (!getLegacySecretKey().equals(other.getLegacySecretKey())) return false;
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
    hash = (37 * hash) + LEGACY_SECRET_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getLegacySecretKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse parseFrom(
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
      com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse prototype) {
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
   * Secret key is used only in legacy reCAPTCHA. It must be used in a 3rd party
   * integration with legacy reCAPTCHA.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)
      com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RetrieveLegacySecretKeyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RetrieveLegacySecretKeyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.class,
              com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.Builder.class);
    }

    // Construct using
    // com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      legacySecretKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_RetrieveLegacySecretKeyResponse_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
        getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse build() {
      com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse buildPartial() {
      com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse result =
          new com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.legacySecretKey_ = legacySecretKey_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse) {
        return mergeFrom((com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse other) {
      if (other
          == com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse.getDefaultInstance())
        return this;
      if (!other.getLegacySecretKey().isEmpty()) {
        legacySecretKey_ = other.legacySecretKey_;
        bitField0_ |= 0x00000001;
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
                legacySecretKey_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object legacySecretKey_ = "";
    /**
     *
     *
     * <pre>
     * The secret key (also known as shared secret) authorizes communication
     * between your application backend and the reCAPTCHA Enterprise server to
     * create an assessment.
     * The secret key needs to be kept safe for security purposes.
     * </pre>
     *
     * <code>string legacy_secret_key = 1;</code>
     *
     * @return The legacySecretKey.
     */
    public java.lang.String getLegacySecretKey() {
      java.lang.Object ref = legacySecretKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        legacySecretKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The secret key (also known as shared secret) authorizes communication
     * between your application backend and the reCAPTCHA Enterprise server to
     * create an assessment.
     * The secret key needs to be kept safe for security purposes.
     * </pre>
     *
     * <code>string legacy_secret_key = 1;</code>
     *
     * @return The bytes for legacySecretKey.
     */
    public com.google.protobuf.ByteString getLegacySecretKeyBytes() {
      java.lang.Object ref = legacySecretKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        legacySecretKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The secret key (also known as shared secret) authorizes communication
     * between your application backend and the reCAPTCHA Enterprise server to
     * create an assessment.
     * The secret key needs to be kept safe for security purposes.
     * </pre>
     *
     * <code>string legacy_secret_key = 1;</code>
     *
     * @param value The legacySecretKey to set.
     * @return This builder for chaining.
     */
    public Builder setLegacySecretKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      legacySecretKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The secret key (also known as shared secret) authorizes communication
     * between your application backend and the reCAPTCHA Enterprise server to
     * create an assessment.
     * The secret key needs to be kept safe for security purposes.
     * </pre>
     *
     * <code>string legacy_secret_key = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLegacySecretKey() {
      legacySecretKey_ = getDefaultInstance().getLegacySecretKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The secret key (also known as shared secret) authorizes communication
     * between your application backend and the reCAPTCHA Enterprise server to
     * create an assessment.
     * The secret key needs to be kept safe for security purposes.
     * </pre>
     *
     * <code>string legacy_secret_key = 1;</code>
     *
     * @param value The bytes for legacySecretKey to set.
     * @return This builder for chaining.
     */
    public Builder setLegacySecretKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      legacySecretKey_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse)
  private static final com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse();
  }

  public static com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveLegacySecretKeyResponse> PARSER =
      new com.google.protobuf.AbstractParser<RetrieveLegacySecretKeyResponse>() {
        @java.lang.Override
        public RetrieveLegacySecretKeyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetrieveLegacySecretKeyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveLegacySecretKeyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
