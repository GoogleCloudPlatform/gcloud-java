/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Response message for `AwsClusters.GenerateAwsAccessToken` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse}
 */
public final class GenerateAwsAccessTokenResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
    GenerateAwsAccessTokenResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateAwsAccessTokenResponse.newBuilder() to construct.
  private GenerateAwsAccessTokenResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateAwsAccessTokenResponse() {
    accessToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateAwsAccessTokenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GenerateAwsAccessTokenResponse(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              accessToken_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (expirationTime_ != null) {
                subBuilder = expirationTime_.toBuilder();
              }
              expirationTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(expirationTime_);
                expirationTime_ = subBuilder.buildPartial();
              }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto
        .internal_static_google_cloud_gkemulticloud_v1_GenerateAwsAccessTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsServiceProto
        .internal_static_google_cloud_gkemulticloud_v1_GenerateAwsAccessTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.class,
            com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.Builder.class);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object accessToken_;
  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Access token to authenticate to k8s api-server.
   * </pre>
   *
   * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expirationTime_;
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expirationTime field is set.
   */
  @java.lang.Override
  public boolean hasExpirationTime() {
    return expirationTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expirationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpirationTime() {
    return expirationTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : expirationTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamp at which the token will expire.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder() {
    return getExpirationTime();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (expirationTime_ != null) {
      output.writeMessage(2, getExpirationTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (expirationTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpirationTime());
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse other =
        (com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse) obj;

    if (!getAccessToken().equals(other.getAccessToken())) return false;
    if (hasExpirationTime() != other.hasExpirationTime()) return false;
    if (hasExpirationTime()) {
      if (!getExpirationTime().equals(other.getExpirationTime())) return false;
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
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (hasExpirationTime()) {
      hash = (37 * hash) + EXPIRATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpirationTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parseFrom(
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
      com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse prototype) {
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
   * Response message for `AwsClusters.GenerateAwsAccessToken` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
      com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_GenerateAwsAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_GenerateAwsAccessTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.class,
              com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.newBuilder()
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
      accessToken_ = "";

      if (expirationTimeBuilder_ == null) {
        expirationTime_ = null;
      } else {
        expirationTime_ = null;
        expirationTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_GenerateAwsAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse build() {
      com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse buildPartial() {
      com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse result =
          new com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse(this);
      result.accessToken_ = accessToken_;
      if (expirationTimeBuilder_ == null) {
        result.expirationTime_ = expirationTime_;
      } else {
        result.expirationTime_ = expirationTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse other) {
      if (other
          == com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse.getDefaultInstance())
        return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.hasExpirationTime()) {
        mergeExpirationTime(other.getExpirationTime());
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
      com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {

      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Access token to authenticate to k8s api-server.
     * </pre>
     *
     * <code>string access_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      accessToken_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expirationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        expirationTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the expirationTime field is set.
     */
    public boolean hasExpirationTime() {
      return expirationTimeBuilder_ != null || expirationTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The expirationTime.
     */
    public com.google.protobuf.Timestamp getExpirationTime() {
      if (expirationTimeBuilder_ == null) {
        return expirationTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expirationTime_;
      } else {
        return expirationTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setExpirationTime(com.google.protobuf.Timestamp value) {
      if (expirationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expirationTime_ = value;
        onChanged();
      } else {
        expirationTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setExpirationTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expirationTimeBuilder_ == null) {
        expirationTime_ = builderForValue.build();
        onChanged();
      } else {
        expirationTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeExpirationTime(com.google.protobuf.Timestamp value) {
      if (expirationTimeBuilder_ == null) {
        if (expirationTime_ != null) {
          expirationTime_ =
              com.google.protobuf.Timestamp.newBuilder(expirationTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          expirationTime_ = value;
        }
        onChanged();
      } else {
        expirationTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearExpirationTime() {
      if (expirationTimeBuilder_ == null) {
        expirationTime_ = null;
        onChanged();
      } else {
        expirationTime_ = null;
        expirationTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getExpirationTimeBuilder() {

      onChanged();
      return getExpirationTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder() {
      if (expirationTimeBuilder_ != null) {
        return expirationTimeBuilder_.getMessageOrBuilder();
      } else {
        return expirationTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expirationTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamp at which the token will expire.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp expiration_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getExpirationTimeFieldBuilder() {
      if (expirationTimeBuilder_ == null) {
        expirationTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getExpirationTime(), getParentForChildren(), isClean());
        expirationTime_ = null;
      }
      return expirationTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse)
  private static final com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse();
  }

  public static com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAwsAccessTokenResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateAwsAccessTokenResponse>() {
        @java.lang.Override
        public GenerateAwsAccessTokenResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GenerateAwsAccessTokenResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GenerateAwsAccessTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAwsAccessTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.GenerateAwsAccessTokenResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
