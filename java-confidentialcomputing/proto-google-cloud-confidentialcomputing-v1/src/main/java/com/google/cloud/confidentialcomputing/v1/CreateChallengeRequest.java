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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * Message for creating a Challenge
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1.CreateChallengeRequest}
 */
public final class CreateChallengeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1.CreateChallengeRequest)
    CreateChallengeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateChallengeRequest.newBuilder() to construct.
  private CreateChallengeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateChallengeRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateChallengeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.class,
            com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the location where the Challenge will be
   * used, in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the location where the Challenge will be
   * used, in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHALLENGE_FIELD_NUMBER = 2;
  private com.google.cloud.confidentialcomputing.v1.Challenge challenge_;
  /**
   *
   *
   * <pre>
   * Required. The Challenge to be created. Currently this field can be empty as
   * all the Challenge fields are set by the server.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the challenge field is set.
   */
  @java.lang.Override
  public boolean hasChallenge() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The Challenge to be created. Currently this field can be empty as
   * all the Challenge fields are set by the server.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The challenge.
   */
  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.Challenge getChallenge() {
    return challenge_ == null
        ? com.google.cloud.confidentialcomputing.v1.Challenge.getDefaultInstance()
        : challenge_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Challenge to be created. Currently this field can be empty as
   * all the Challenge fields are set by the server.
   * </pre>
   *
   * <code>
   * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.ChallengeOrBuilder getChallengeOrBuilder() {
    return challenge_ == null
        ? com.google.cloud.confidentialcomputing.v1.Challenge.getDefaultInstance()
        : challenge_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getChallenge());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getChallenge());
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
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest other =
        (com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasChallenge() != other.hasChallenge()) return false;
    if (hasChallenge()) {
      if (!getChallenge().equals(other.getChallenge())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasChallenge()) {
      hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
      hash = (53 * hash) + getChallenge().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest parseFrom(
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
      com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest prototype) {
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
   * Message for creating a Challenge
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1.CreateChallengeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1.CreateChallengeRequest)
      com.google.cloud.confidentialcomputing.v1.CreateChallengeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.class,
              com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.Builder.class);
    }

    // Construct using com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getChallengeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      challenge_ = null;
      if (challengeBuilder_ != null) {
        challengeBuilder_.dispose();
        challengeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest
        getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest build() {
      com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest buildPartial() {
      com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest result =
          new com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.challenge_ = challengeBuilder_ == null ? challenge_ : challengeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest) {
        return mergeFrom((com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest other) {
      if (other
          == com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasChallenge()) {
        mergeChallenge(other.getChallenge());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getChallengeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location where the Challenge will be
     * used, in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location where the Challenge will be
     * used, in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location where the Challenge will be
     * used, in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location where the Challenge will be
     * used, in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location where the Challenge will be
     * used, in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.confidentialcomputing.v1.Challenge challenge_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.confidentialcomputing.v1.Challenge,
            com.google.cloud.confidentialcomputing.v1.Challenge.Builder,
            com.google.cloud.confidentialcomputing.v1.ChallengeOrBuilder>
        challengeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the challenge field is set.
     */
    public boolean hasChallenge() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The challenge.
     */
    public com.google.cloud.confidentialcomputing.v1.Challenge getChallenge() {
      if (challengeBuilder_ == null) {
        return challenge_ == null
            ? com.google.cloud.confidentialcomputing.v1.Challenge.getDefaultInstance()
            : challenge_;
      } else {
        return challengeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChallenge(com.google.cloud.confidentialcomputing.v1.Challenge value) {
      if (challengeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        challenge_ = value;
      } else {
        challengeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setChallenge(
        com.google.cloud.confidentialcomputing.v1.Challenge.Builder builderForValue) {
      if (challengeBuilder_ == null) {
        challenge_ = builderForValue.build();
      } else {
        challengeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeChallenge(com.google.cloud.confidentialcomputing.v1.Challenge value) {
      if (challengeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && challenge_ != null
            && challenge_
                != com.google.cloud.confidentialcomputing.v1.Challenge.getDefaultInstance()) {
          getChallengeBuilder().mergeFrom(value);
        } else {
          challenge_ = value;
        }
      } else {
        challengeBuilder_.mergeFrom(value);
      }
      if (challenge_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearChallenge() {
      bitField0_ = (bitField0_ & ~0x00000002);
      challenge_ = null;
      if (challengeBuilder_ != null) {
        challengeBuilder_.dispose();
        challengeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.Challenge.Builder getChallengeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getChallengeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.confidentialcomputing.v1.ChallengeOrBuilder getChallengeOrBuilder() {
      if (challengeBuilder_ != null) {
        return challengeBuilder_.getMessageOrBuilder();
      } else {
        return challenge_ == null
            ? com.google.cloud.confidentialcomputing.v1.Challenge.getDefaultInstance()
            : challenge_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Challenge to be created. Currently this field can be empty as
     * all the Challenge fields are set by the server.
     * </pre>
     *
     * <code>
     * .google.cloud.confidentialcomputing.v1.Challenge challenge = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.confidentialcomputing.v1.Challenge,
            com.google.cloud.confidentialcomputing.v1.Challenge.Builder,
            com.google.cloud.confidentialcomputing.v1.ChallengeOrBuilder>
        getChallengeFieldBuilder() {
      if (challengeBuilder_ == null) {
        challengeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.confidentialcomputing.v1.Challenge,
                com.google.cloud.confidentialcomputing.v1.Challenge.Builder,
                com.google.cloud.confidentialcomputing.v1.ChallengeOrBuilder>(
                getChallenge(), getParentForChildren(), isClean());
        challenge_ = null;
      }
      return challengeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1.CreateChallengeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1.CreateChallengeRequest)
  private static final com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest();
  }

  public static com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateChallengeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateChallengeRequest>() {
        @java.lang.Override
        public CreateChallengeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateChallengeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateChallengeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.CreateChallengeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
