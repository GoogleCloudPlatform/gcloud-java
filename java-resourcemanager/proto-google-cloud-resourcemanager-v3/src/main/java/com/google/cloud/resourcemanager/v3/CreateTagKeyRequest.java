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
// source: google/cloud/resourcemanager/v3/tag_keys.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The request message for creating a TagKey.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.CreateTagKeyRequest}
 */
public final class CreateTagKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.CreateTagKeyRequest)
    CreateTagKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTagKeyRequest.newBuilder() to construct.
  private CreateTagKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTagKeyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTagKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagKeysProto
        .internal_static_google_cloud_resourcemanager_v3_CreateTagKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagKeysProto
        .internal_static_google_cloud_resourcemanager_v3_CreateTagKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.class,
            com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TAG_KEY_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.TagKey tagKey_;
  /**
   *
   *
   * <pre>
   * Required. The TagKey to be created. Only fields `short_name`,
   * `description`, and `parent` are considered during the creation request.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagKey field is set.
   */
  @java.lang.Override
  public boolean hasTagKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The TagKey to be created. Only fields `short_name`,
   * `description`, and `parent` are considered during the creation request.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagKey.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagKey getTagKey() {
    return tagKey_ == null
        ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
        : tagKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The TagKey to be created. Only fields `short_name`,
   * `description`, and `parent` are considered during the creation request.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagKeyOrBuilder getTagKeyOrBuilder() {
    return tagKey_ == null
        ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
        : tagKey_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Set to true to perform validations necessary for creating the
   * resource, but not actually perform the action.
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTagKey());
    }
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTagKey());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.CreateTagKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.CreateTagKeyRequest other =
        (com.google.cloud.resourcemanager.v3.CreateTagKeyRequest) obj;

    if (hasTagKey() != other.hasTagKey()) return false;
    if (hasTagKey()) {
      if (!getTagKey().equals(other.getTagKey())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasTagKey()) {
      hash = (37 * hash) + TAG_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getTagKey().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest parseFrom(
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
      com.google.cloud.resourcemanager.v3.CreateTagKeyRequest prototype) {
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
   * The request message for creating a TagKey.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.CreateTagKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.CreateTagKeyRequest)
      com.google.cloud.resourcemanager.v3.CreateTagKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.class,
              com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTagKeyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tagKey_ = null;
      if (tagKeyBuilder_ != null) {
        tagKeyBuilder_.dispose();
        tagKeyBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagKeyRequest build() {
      com.google.cloud.resourcemanager.v3.CreateTagKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagKeyRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.CreateTagKeyRequest result =
          new com.google.cloud.resourcemanager.v3.CreateTagKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.CreateTagKeyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tagKey_ = tagKeyBuilder_ == null ? tagKey_ : tagKeyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.resourcemanager.v3.CreateTagKeyRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.CreateTagKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.CreateTagKeyRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.CreateTagKeyRequest.getDefaultInstance())
        return this;
      if (other.hasTagKey()) {
        mergeTagKey(other.getTagKey());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                input.readMessage(getTagKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.cloud.resourcemanager.v3.TagKey tagKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagKey,
            com.google.cloud.resourcemanager.v3.TagKey.Builder,
            com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>
        tagKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tagKey field is set.
     */
    public boolean hasTagKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tagKey.
     */
    public com.google.cloud.resourcemanager.v3.TagKey getTagKey() {
      if (tagKeyBuilder_ == null) {
        return tagKey_ == null
            ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
            : tagKey_;
      } else {
        return tagKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagKey(com.google.cloud.resourcemanager.v3.TagKey value) {
      if (tagKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagKey_ = value;
      } else {
        tagKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagKey(com.google.cloud.resourcemanager.v3.TagKey.Builder builderForValue) {
      if (tagKeyBuilder_ == null) {
        tagKey_ = builderForValue.build();
      } else {
        tagKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTagKey(com.google.cloud.resourcemanager.v3.TagKey value) {
      if (tagKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && tagKey_ != null
            && tagKey_ != com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()) {
          getTagKeyBuilder().mergeFrom(value);
        } else {
          tagKey_ = value;
        }
      } else {
        tagKeyBuilder_.mergeFrom(value);
      }
      if (tagKey_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTagKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tagKey_ = null;
      if (tagKeyBuilder_ != null) {
        tagKeyBuilder_.dispose();
        tagKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagKey.Builder getTagKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTagKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagKeyOrBuilder getTagKeyOrBuilder() {
      if (tagKeyBuilder_ != null) {
        return tagKeyBuilder_.getMessageOrBuilder();
      } else {
        return tagKey_ == null
            ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
            : tagKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TagKey to be created. Only fields `short_name`,
     * `description`, and `parent` are considered during the creation request.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagKey,
            com.google.cloud.resourcemanager.v3.TagKey.Builder,
            com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>
        getTagKeyFieldBuilder() {
      if (tagKeyBuilder_ == null) {
        tagKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.TagKey,
                com.google.cloud.resourcemanager.v3.TagKey.Builder,
                com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>(
                getTagKey(), getParentForChildren(), isClean());
        tagKey_ = null;
      }
      return tagKeyBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. Set to true to perform validations necessary for creating the
     * resource, but not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Set to true to perform validations necessary for creating the
     * resource, but not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Set to true to perform validations necessary for creating the
     * resource, but not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.CreateTagKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateTagKeyRequest)
  private static final com.google.cloud.resourcemanager.v3.CreateTagKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.CreateTagKeyRequest();
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTagKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTagKeyRequest>() {
        @java.lang.Override
        public CreateTagKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTagKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTagKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.CreateTagKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
