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
// source: google/cloud/vertexai/v1beta1/content.proto

package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * The base structured datatype containing multi-part content of a message.
 *
 * A `Content` includes a `role` field designating the producer of the `Content`
 * and a `parts` field containing multi-part data that contains the content of
 * the message turn.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1beta1.Content}
 */
public final class Content extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1beta1.Content)
    ContentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Content.newBuilder() to construct.
  private Content(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Content() {
    role_ = "";
    parts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Content();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.ContentProto
        .internal_static_google_cloud_vertexai_v1beta1_Content_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.ContentProto
        .internal_static_google_cloud_vertexai_v1beta1_Content_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.Content.class,
            com.google.cloud.vertexai.api.Content.Builder.class);
  }

  public static final int ROLE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object role_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The producer of the content. Must be either 'user' or 'model'.
   *
   * Useful to set for multi-turn conversations, otherwise can be left blank
   * or unset.
   * </pre>
   *
   * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The producer of the content. Must be either 'user' or 'model'.
   *
   * Useful to set for multi-turn conversations, otherwise can be left blank
   * or unset.
   * </pre>
   *
   * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vertexai.api.Part> parts_;
  /**
   *
   *
   * <pre>
   * Required. Ordered `Parts` that constitute a single message. Parts may have
   * different IANA MIME types.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vertexai.api.Part> getPartsList() {
    return parts_;
  }
  /**
   *
   *
   * <pre>
   * Required. Ordered `Parts` that constitute a single message. Parts may have
   * different IANA MIME types.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vertexai.api.PartOrBuilder>
      getPartsOrBuilderList() {
    return parts_;
  }
  /**
   *
   *
   * <pre>
   * Required. Ordered `Parts` that constitute a single message. Parts may have
   * different IANA MIME types.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getPartsCount() {
    return parts_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Ordered `Parts` that constitute a single message. Parts may have
   * different IANA MIME types.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.Part getParts(int index) {
    return parts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Ordered `Parts` that constitute a single message. Parts may have
   * different IANA MIME types.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.PartOrBuilder getPartsOrBuilder(int index) {
    return parts_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, role_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      output.writeMessage(2, parts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, role_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, parts_.get(i));
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
    if (!(obj instanceof com.google.cloud.vertexai.api.Content)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.Content other = (com.google.cloud.vertexai.api.Content) obj;

    if (!getRole().equals(other.getRole())) return false;
    if (!getPartsList().equals(other.getPartsList())) return false;
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    if (getPartsCount() > 0) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.Content parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.Content parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.Content parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.api.Content prototype) {
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
   * The base structured datatype containing multi-part content of a message.
   *
   * A `Content` includes a `role` field designating the producer of the `Content`
   * and a `parts` field containing multi-part data that contains the content of
   * the message turn.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1beta1.Content}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1beta1.Content)
      com.google.cloud.vertexai.api.ContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.ContentProto
          .internal_static_google_cloud_vertexai_v1beta1_Content_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.ContentProto
          .internal_static_google_cloud_vertexai_v1beta1_Content_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.Content.class,
              com.google.cloud.vertexai.api.Content.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.Content.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      role_ = "";
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
      } else {
        parts_ = null;
        partsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.ContentProto
          .internal_static_google_cloud_vertexai_v1beta1_Content_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.Content getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.Content.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.Content build() {
      com.google.cloud.vertexai.api.Content result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.Content buildPartial() {
      com.google.cloud.vertexai.api.Content result =
          new com.google.cloud.vertexai.api.Content(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.vertexai.api.Content result) {
      if (partsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          parts_ = java.util.Collections.unmodifiableList(parts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vertexai.api.Content result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.role_ = role_;
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
      if (other instanceof com.google.cloud.vertexai.api.Content) {
        return mergeFrom((com.google.cloud.vertexai.api.Content) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.Content other) {
      if (other == com.google.cloud.vertexai.api.Content.getDefaultInstance()) return this;
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (partsBuilder_ == null) {
        if (!other.parts_.isEmpty()) {
          if (parts_.isEmpty()) {
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePartsIsMutable();
            parts_.addAll(other.parts_);
          }
          onChanged();
        }
      } else {
        if (!other.parts_.isEmpty()) {
          if (partsBuilder_.isEmpty()) {
            partsBuilder_.dispose();
            partsBuilder_ = null;
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            partsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPartsFieldBuilder()
                    : null;
          } else {
            partsBuilder_.addAllMessages(other.parts_);
          }
        }
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
                role_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.vertexai.api.Part m =
                    input.readMessage(
                        com.google.cloud.vertexai.api.Part.parser(), extensionRegistry);
                if (partsBuilder_ == null) {
                  ensurePartsIsMutable();
                  parts_.add(m);
                } else {
                  partsBuilder_.addMessage(m);
                }
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

    private java.lang.Object role_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The producer of the content. Must be either 'user' or 'model'.
     *
     * Useful to set for multi-turn conversations, otherwise can be left blank
     * or unset.
     * </pre>
     *
     * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The producer of the content. Must be either 'user' or 'model'.
     *
     * Useful to set for multi-turn conversations, otherwise can be left blank
     * or unset.
     * </pre>
     *
     * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The producer of the content. Must be either 'user' or 'model'.
     *
     * Useful to set for multi-turn conversations, otherwise can be left blank
     * or unset.
     * </pre>
     *
     * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      role_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The producer of the content. Must be either 'user' or 'model'.
     *
     * Useful to set for multi-turn conversations, otherwise can be left blank
     * or unset.
     * </pre>
     *
     * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      role_ = getDefaultInstance().getRole();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The producer of the content. Must be either 'user' or 'model'.
     *
     * Useful to set for multi-turn conversations, otherwise can be left blank
     * or unset.
     * </pre>
     *
     * <code>string role = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      role_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.vertexai.api.Part> parts_ =
        java.util.Collections.emptyList();

    private void ensurePartsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        parts_ = new java.util.ArrayList<com.google.cloud.vertexai.api.Part>(parts_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.Part,
            com.google.cloud.vertexai.api.Part.Builder,
            com.google.cloud.vertexai.api.PartOrBuilder>
        partsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.vertexai.api.Part> getPartsList() {
      if (partsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parts_);
      } else {
        return partsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getPartsCount() {
      if (partsBuilder_ == null) {
        return parts_.size();
      } else {
        return partsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vertexai.api.Part getParts(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setParts(int index, com.google.cloud.vertexai.api.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.set(index, value);
        onChanged();
      } else {
        partsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setParts(int index, com.google.cloud.vertexai.api.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.set(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addParts(com.google.cloud.vertexai.api.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(value);
        onChanged();
      } else {
        partsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addParts(int index, com.google.cloud.vertexai.api.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(index, value);
        onChanged();
      } else {
        partsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addParts(com.google.cloud.vertexai.api.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addParts(int index, com.google.cloud.vertexai.api.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllParts(
        java.lang.Iterable<? extends com.google.cloud.vertexai.api.Part> values) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parts_);
        onChanged();
      } else {
        partsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        partsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeParts(int index) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.remove(index);
        onChanged();
      } else {
        partsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vertexai.api.Part.Builder getPartsBuilder(int index) {
      return getPartsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vertexai.api.PartOrBuilder getPartsOrBuilder(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.vertexai.api.PartOrBuilder>
        getPartsOrBuilderList() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parts_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vertexai.api.Part.Builder addPartsBuilder() {
      return getPartsFieldBuilder()
          .addBuilder(com.google.cloud.vertexai.api.Part.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vertexai.api.Part.Builder addPartsBuilder(int index) {
      return getPartsFieldBuilder()
          .addBuilder(index, com.google.cloud.vertexai.api.Part.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Ordered `Parts` that constitute a single message. Parts may have
     * different IANA MIME types.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.vertexai.v1beta1.Part parts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.vertexai.api.Part.Builder> getPartsBuilderList() {
      return getPartsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.Part,
            com.google.cloud.vertexai.api.Part.Builder,
            com.google.cloud.vertexai.api.PartOrBuilder>
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vertexai.api.Part,
                com.google.cloud.vertexai.api.Part.Builder,
                com.google.cloud.vertexai.api.PartOrBuilder>(
                parts_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        parts_ = null;
      }
      return partsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1beta1.Content)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1beta1.Content)
  private static final com.google.cloud.vertexai.api.Content DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.Content();
  }

  public static com.google.cloud.vertexai.api.Content getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Content> PARSER =
      new com.google.protobuf.AbstractParser<Content>() {
        @java.lang.Override
        public Content parsePartialFrom(
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

  public static com.google.protobuf.Parser<Content> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Content> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.Content getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
