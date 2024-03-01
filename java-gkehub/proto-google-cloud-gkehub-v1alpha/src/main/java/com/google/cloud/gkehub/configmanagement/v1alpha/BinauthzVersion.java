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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 *
 *
 * <pre>
 * The version of binauthz.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion}
 */
public final class BinauthzVersion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion)
    BinauthzVersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BinauthzVersion.newBuilder() to construct.
  private BinauthzVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BinauthzVersion() {
    webhookVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BinauthzVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.class,
            com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder.class);
  }

  public static final int WEBHOOK_VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object webhookVersion_ = "";
  /**
   *
   *
   * <pre>
   * The version of the binauthz webhook.
   * </pre>
   *
   * <code>string webhook_version = 1;</code>
   *
   * @return The webhookVersion.
   */
  @java.lang.Override
  public java.lang.String getWebhookVersion() {
    java.lang.Object ref = webhookVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      webhookVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version of the binauthz webhook.
   * </pre>
   *
   * <code>string webhook_version = 1;</code>
   *
   * @return The bytes for webhookVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWebhookVersionBytes() {
    java.lang.Object ref = webhookVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      webhookVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(webhookVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, webhookVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(webhookVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, webhookVersion_);
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion other =
        (com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion) obj;

    if (!getWebhookVersion().equals(other.getWebhookVersion())) return false;
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
    hash = (37 * hash) + WEBHOOK_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getWebhookVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion parseFrom(
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
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion prototype) {
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
   * The version of binauthz.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion)
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.class,
              com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      webhookVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_BinauthzVersion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion result =
          new com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webhookVersion_ = webhookVersion_;
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion.getDefaultInstance())
        return this;
      if (!other.getWebhookVersion().isEmpty()) {
        webhookVersion_ = other.webhookVersion_;
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
                webhookVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object webhookVersion_ = "";
    /**
     *
     *
     * <pre>
     * The version of the binauthz webhook.
     * </pre>
     *
     * <code>string webhook_version = 1;</code>
     *
     * @return The webhookVersion.
     */
    public java.lang.String getWebhookVersion() {
      java.lang.Object ref = webhookVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        webhookVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the binauthz webhook.
     * </pre>
     *
     * <code>string webhook_version = 1;</code>
     *
     * @return The bytes for webhookVersion.
     */
    public com.google.protobuf.ByteString getWebhookVersionBytes() {
      java.lang.Object ref = webhookVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        webhookVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the binauthz webhook.
     * </pre>
     *
     * <code>string webhook_version = 1;</code>
     *
     * @param value The webhookVersion to set.
     * @return This builder for chaining.
     */
    public Builder setWebhookVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      webhookVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the binauthz webhook.
     * </pre>
     *
     * <code>string webhook_version = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWebhookVersion() {
      webhookVersion_ = getDefaultInstance().getWebhookVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the binauthz webhook.
     * </pre>
     *
     * <code>string webhook_version = 1;</code>
     *
     * @param value The bytes for webhookVersion to set.
     * @return This builder for chaining.
     */
    public Builder setWebhookVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      webhookVersion_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinauthzVersion> PARSER =
      new com.google.protobuf.AbstractParser<BinauthzVersion>() {
        @java.lang.Override
        public BinauthzVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<BinauthzVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinauthzVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
