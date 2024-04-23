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
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The request message to create a TagBinding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.CreateTagBindingRequest}
 */
public final class CreateTagBindingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
    CreateTagBindingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTagBindingRequest.newBuilder() to construct.
  private CreateTagBindingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTagBindingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTagBindingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagBindingsProto
        .internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagBindingsProto
        .internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.class,
            com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TAG_BINDING_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.TagBinding tagBinding_;
  /**
   *
   *
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagBinding field is set.
   */
  @java.lang.Override
  public boolean hasTagBinding() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagBinding.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagBinding getTagBinding() {
    return tagBinding_ == null
        ? com.google.cloud.resourcemanager.v3.TagBinding.getDefaultInstance()
        : tagBinding_;
  }
  /**
   *
   *
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagBindingOrBuilder getTagBindingOrBuilder() {
    return tagBinding_ == null
        ? com.google.cloud.resourcemanager.v3.TagBinding.getDefaultInstance()
        : tagBinding_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Set to true to perform the validations necessary for creating the
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
      output.writeMessage(1, getTagBinding());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTagBinding());
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.CreateTagBindingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.CreateTagBindingRequest other =
        (com.google.cloud.resourcemanager.v3.CreateTagBindingRequest) obj;

    if (hasTagBinding() != other.hasTagBinding()) return false;
    if (hasTagBinding()) {
      if (!getTagBinding().equals(other.getTagBinding())) return false;
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
    if (hasTagBinding()) {
      hash = (37 * hash) + TAG_BINDING_FIELD_NUMBER;
      hash = (53 * hash) + getTagBinding().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest parseFrom(
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
      com.google.cloud.resourcemanager.v3.CreateTagBindingRequest prototype) {
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
   * The request message to create a TagBinding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.CreateTagBindingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
      com.google.cloud.resourcemanager.v3.CreateTagBindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagBindingsProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagBindingsProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.class,
              com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTagBindingFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tagBinding_ = null;
      if (tagBindingBuilder_ != null) {
        tagBindingBuilder_.dispose();
        tagBindingBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagBindingsProto
          .internal_static_google_cloud_resourcemanager_v3_CreateTagBindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagBindingRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagBindingRequest build() {
      com.google.cloud.resourcemanager.v3.CreateTagBindingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateTagBindingRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.CreateTagBindingRequest result =
          new com.google.cloud.resourcemanager.v3.CreateTagBindingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.CreateTagBindingRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tagBinding_ = tagBindingBuilder_ == null ? tagBinding_ : tagBindingBuilder_.build();
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
      if (other instanceof com.google.cloud.resourcemanager.v3.CreateTagBindingRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.CreateTagBindingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.CreateTagBindingRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.CreateTagBindingRequest.getDefaultInstance())
        return this;
      if (other.hasTagBinding()) {
        mergeTagBinding(other.getTagBinding());
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
                input.readMessage(getTagBindingFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.resourcemanager.v3.TagBinding tagBinding_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagBinding,
            com.google.cloud.resourcemanager.v3.TagBinding.Builder,
            com.google.cloud.resourcemanager.v3.TagBindingOrBuilder>
        tagBindingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tagBinding field is set.
     */
    public boolean hasTagBinding() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tagBinding.
     */
    public com.google.cloud.resourcemanager.v3.TagBinding getTagBinding() {
      if (tagBindingBuilder_ == null) {
        return tagBinding_ == null
            ? com.google.cloud.resourcemanager.v3.TagBinding.getDefaultInstance()
            : tagBinding_;
      } else {
        return tagBindingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagBinding(com.google.cloud.resourcemanager.v3.TagBinding value) {
      if (tagBindingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagBinding_ = value;
      } else {
        tagBindingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagBinding(
        com.google.cloud.resourcemanager.v3.TagBinding.Builder builderForValue) {
      if (tagBindingBuilder_ == null) {
        tagBinding_ = builderForValue.build();
      } else {
        tagBindingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTagBinding(com.google.cloud.resourcemanager.v3.TagBinding value) {
      if (tagBindingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && tagBinding_ != null
            && tagBinding_ != com.google.cloud.resourcemanager.v3.TagBinding.getDefaultInstance()) {
          getTagBindingBuilder().mergeFrom(value);
        } else {
          tagBinding_ = value;
        }
      } else {
        tagBindingBuilder_.mergeFrom(value);
      }
      if (tagBinding_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTagBinding() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tagBinding_ = null;
      if (tagBindingBuilder_ != null) {
        tagBindingBuilder_.dispose();
        tagBindingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagBinding.Builder getTagBindingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTagBindingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagBindingOrBuilder getTagBindingOrBuilder() {
      if (tagBindingBuilder_ != null) {
        return tagBindingBuilder_.getMessageOrBuilder();
      } else {
        return tagBinding_ == null
            ? com.google.cloud.resourcemanager.v3.TagBinding.getDefaultInstance()
            : tagBinding_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The TagBinding to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagBinding,
            com.google.cloud.resourcemanager.v3.TagBinding.Builder,
            com.google.cloud.resourcemanager.v3.TagBindingOrBuilder>
        getTagBindingFieldBuilder() {
      if (tagBindingBuilder_ == null) {
        tagBindingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.TagBinding,
                com.google.cloud.resourcemanager.v3.TagBinding.Builder,
                com.google.cloud.resourcemanager.v3.TagBindingOrBuilder>(
                getTagBinding(), getParentForChildren(), isClean());
        tagBinding_ = null;
      }
      return tagBindingBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. Set to true to perform the validations necessary for creating the
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
     * Optional. Set to true to perform the validations necessary for creating the
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
     * Optional. Set to true to perform the validations necessary for creating the
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
  private static final com.google.cloud.resourcemanager.v3.CreateTagBindingRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.CreateTagBindingRequest();
  }

  public static com.google.cloud.resourcemanager.v3.CreateTagBindingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTagBindingRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTagBindingRequest>() {
        @java.lang.Override
        public CreateTagBindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTagBindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTagBindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.CreateTagBindingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
