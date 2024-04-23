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
// source: google/cloud/discoveryengine/v1alpha/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Information of an end user.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.UserInfo}
 */
public final class UserInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.UserInfo)
    UserInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserInfo.newBuilder() to construct.
  private UserInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserInfo() {
    userId_ = "";
    userAgent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.CommonProto
        .internal_static_google_cloud_discoveryengine_v1alpha_UserInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.CommonProto
        .internal_static_google_cloud_discoveryengine_v1alpha_UserInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.UserInfo.class,
            com.google.cloud.discoveryengine.v1alpha.UserInfo.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   *
   *
   * <pre>
   * Highly recommended for logged-in users. Unique identifier for logged-in
   * user, such as a user name. Don't set for anonymous users.
   *
   * Always use a hashed value for this ID.
   *
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded
   * model quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string user_id = 1;</code>
   *
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Highly recommended for logged-in users. Unique identifier for logged-in
   * user, such as a user name. Don't set for anonymous users.
   *
   * Always use a hashed value for this ID.
   *
   * Don't set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded
   * model quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string user_id = 1;</code>
   *
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_AGENT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object userAgent_ = "";
  /**
   *
   *
   * <pre>
   * User agent as included in the HTTP header.
   *
   * The field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This should not be set when using the client side event reporting with
   * GTM or JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
   * or if
   * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string user_agent = 2;</code>
   *
   * @return The userAgent.
   */
  @java.lang.Override
  public java.lang.String getUserAgent() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAgent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * User agent as included in the HTTP header.
   *
   * The field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * This should not be set when using the client side event reporting with
   * GTM or JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
   * or if
   * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
   * is set.
   * </pre>
   *
   * <code>string user_agent = 2;</code>
   *
   * @return The bytes for userAgent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserAgentBytes() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userAgent_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userAgent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userAgent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userAgent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userAgent_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.UserInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.UserInfo other =
        (com.google.cloud.discoveryengine.v1alpha.UserInfo) obj;

    if (!getUserId().equals(other.getUserId())) return false;
    if (!getUserAgent().equals(other.getUserAgent())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserAgent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.discoveryengine.v1alpha.UserInfo prototype) {
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
   * Information of an end user.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.UserInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.UserInfo)
      com.google.cloud.discoveryengine.v1alpha.UserInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.CommonProto
          .internal_static_google_cloud_discoveryengine_v1alpha_UserInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.CommonProto
          .internal_static_google_cloud_discoveryengine_v1alpha_UserInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.UserInfo.class,
              com.google.cloud.discoveryengine.v1alpha.UserInfo.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.UserInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = "";
      userAgent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.CommonProto
          .internal_static_google_cloud_discoveryengine_v1alpha_UserInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.UserInfo getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.UserInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.UserInfo build() {
      com.google.cloud.discoveryengine.v1alpha.UserInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.UserInfo buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.UserInfo result =
          new com.google.cloud.discoveryengine.v1alpha.UserInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1alpha.UserInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userAgent_ = userAgent_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.UserInfo) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.UserInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.UserInfo other) {
      if (other == com.google.cloud.discoveryengine.v1alpha.UserInfo.getDefaultInstance())
        return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserAgent().isEmpty()) {
        userAgent_ = other.userAgent_;
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
                userId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                userAgent_ = input.readStringRequireUtf8();
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

    private java.lang.Object userId_ = "";
    /**
     *
     *
     * <pre>
     * Highly recommended for logged-in users. Unique identifier for logged-in
     * user, such as a user name. Don't set for anonymous users.
     *
     * Always use a hashed value for this ID.
     *
     * Don't set the field to the same fixed ID for different users. This mixes
     * the event history of those users together, which results in degraded
     * model quality.
     *
     * The field must be a UTF-8 encoded string with a length limit of 128
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string user_id = 1;</code>
     *
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Highly recommended for logged-in users. Unique identifier for logged-in
     * user, such as a user name. Don't set for anonymous users.
     *
     * Always use a hashed value for this ID.
     *
     * Don't set the field to the same fixed ID for different users. This mixes
     * the event history of those users together, which results in degraded
     * model quality.
     *
     * The field must be a UTF-8 encoded string with a length limit of 128
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string user_id = 1;</code>
     *
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Highly recommended for logged-in users. Unique identifier for logged-in
     * user, such as a user name. Don't set for anonymous users.
     *
     * Always use a hashed value for this ID.
     *
     * Don't set the field to the same fixed ID for different users. This mixes
     * the event history of those users together, which results in degraded
     * model quality.
     *
     * The field must be a UTF-8 encoded string with a length limit of 128
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string user_id = 1;</code>
     *
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Highly recommended for logged-in users. Unique identifier for logged-in
     * user, such as a user name. Don't set for anonymous users.
     *
     * Always use a hashed value for this ID.
     *
     * Don't set the field to the same fixed ID for different users. This mixes
     * the event history of those users together, which results in degraded
     * model quality.
     *
     * The field must be a UTF-8 encoded string with a length limit of 128
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string user_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Highly recommended for logged-in users. Unique identifier for logged-in
     * user, such as a user name. Don't set for anonymous users.
     *
     * Always use a hashed value for this ID.
     *
     * Don't set the field to the same fixed ID for different users. This mixes
     * the event history of those users together, which results in degraded
     * model quality.
     *
     * The field must be a UTF-8 encoded string with a length limit of 128
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>string user_id = 1;</code>
     *
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userAgent_ = "";
    /**
     *
     *
     * <pre>
     * User agent as included in the HTTP header.
     *
     * The field must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This should not be set when using the client side event reporting with
     * GTM or JavaScript tag in
     * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
     * or if
     * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
     * is set.
     * </pre>
     *
     * <code>string user_agent = 2;</code>
     *
     * @return The userAgent.
     */
    public java.lang.String getUserAgent() {
      java.lang.Object ref = userAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * User agent as included in the HTTP header.
     *
     * The field must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This should not be set when using the client side event reporting with
     * GTM or JavaScript tag in
     * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
     * or if
     * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
     * is set.
     * </pre>
     *
     * <code>string user_agent = 2;</code>
     *
     * @return The bytes for userAgent.
     */
    public com.google.protobuf.ByteString getUserAgentBytes() {
      java.lang.Object ref = userAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * User agent as included in the HTTP header.
     *
     * The field must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This should not be set when using the client side event reporting with
     * GTM or JavaScript tag in
     * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
     * or if
     * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
     * is set.
     * </pre>
     *
     * <code>string user_agent = 2;</code>
     *
     * @param value The userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userAgent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * User agent as included in the HTTP header.
     *
     * The field must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This should not be set when using the client side event reporting with
     * GTM or JavaScript tag in
     * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
     * or if
     * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
     * is set.
     * </pre>
     *
     * <code>string user_agent = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserAgent() {
      userAgent_ = getDefaultInstance().getUserAgent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * User agent as included in the HTTP header.
     *
     * The field must be a UTF-8 encoded string with a length limit of 1,000
     * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
     *
     * This should not be set when using the client side event reporting with
     * GTM or JavaScript tag in
     * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1alpha.UserEventService.CollectUserEvent]
     * or if
     * [UserEvent.direct_user_request][google.cloud.discoveryengine.v1alpha.UserEvent.direct_user_request]
     * is set.
     * </pre>
     *
     * <code>string user_agent = 2;</code>
     *
     * @param value The bytes for userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userAgent_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.UserInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.UserInfo)
  private static final com.google.cloud.discoveryengine.v1alpha.UserInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.UserInfo();
  }

  public static com.google.cloud.discoveryengine.v1alpha.UserInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInfo> PARSER =
      new com.google.protobuf.AbstractParser<UserInfo>() {
        @java.lang.Override
        public UserInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.UserInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
