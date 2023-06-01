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
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

/**
 *
 *
 * <pre>
 * Information regarding any resource causing the vulnerability such
 * as JavaScript sources, image, audio files, etc.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ViolatingResource}
 */
public final class ViolatingResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1beta.ViolatingResource)
    ViolatingResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ViolatingResource.newBuilder() to construct.
  private ViolatingResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ViolatingResource() {
    contentType_ = "";
    resourceUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ViolatingResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1beta.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ViolatingResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1beta.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1beta_ViolatingResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1beta.ViolatingResource.class,
            com.google.cloud.websecurityscanner.v1beta.ViolatingResource.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object contentType_ = "";
  /**
   *
   *
   * <pre>
   * The MIME type of this resource.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The MIME type of this resource.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_URL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceUrl_ = "";
  /**
   *
   *
   * <pre>
   * URL of this violating resource.
   * </pre>
   *
   * <code>string resource_url = 2;</code>
   *
   * @return The resourceUrl.
   */
  @java.lang.Override
  public java.lang.String getResourceUrl() {
    java.lang.Object ref = resourceUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL of this violating resource.
   * </pre>
   *
   * <code>string resource_url = 2;</code>
   *
   * @return The bytes for resourceUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceUrlBytes() {
    java.lang.Object ref = resourceUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceUrl_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1beta.ViolatingResource)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1beta.ViolatingResource other =
        (com.google.cloud.websecurityscanner.v1beta.ViolatingResource) obj;

    if (!getContentType().equals(other.getContentType())) return false;
    if (!getResourceUrl().equals(other.getResourceUrl())) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + RESOURCE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource parseFrom(
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
      com.google.cloud.websecurityscanner.v1beta.ViolatingResource prototype) {
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
   * Information regarding any resource causing the vulnerability such
   * as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1beta.ViolatingResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1beta.ViolatingResource)
      com.google.cloud.websecurityscanner.v1beta.ViolatingResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ViolatingResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1beta.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ViolatingResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1beta.ViolatingResource.class,
              com.google.cloud.websecurityscanner.v1beta.ViolatingResource.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1beta.ViolatingResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contentType_ = "";
      resourceUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1beta.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1beta_ViolatingResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ViolatingResource
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1beta.ViolatingResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ViolatingResource build() {
      com.google.cloud.websecurityscanner.v1beta.ViolatingResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1beta.ViolatingResource buildPartial() {
      com.google.cloud.websecurityscanner.v1beta.ViolatingResource result =
          new com.google.cloud.websecurityscanner.v1beta.ViolatingResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.websecurityscanner.v1beta.ViolatingResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceUrl_ = resourceUrl_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1beta.ViolatingResource) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1beta.ViolatingResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1beta.ViolatingResource other) {
      if (other
          == com.google.cloud.websecurityscanner.v1beta.ViolatingResource.getDefaultInstance())
        return this;
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResourceUrl().isEmpty()) {
        resourceUrl_ = other.resourceUrl_;
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
                contentType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                resourceUrl_ = input.readStringRequireUtf8();
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

    private java.lang.Object contentType_ = "";
    /**
     *
     *
     * <pre>
     * The MIME type of this resource.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of this resource.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The MIME type of this resource.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of this resource.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      contentType_ = getDefaultInstance().getContentType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MIME type of this resource.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object resourceUrl_ = "";
    /**
     *
     *
     * <pre>
     * URL of this violating resource.
     * </pre>
     *
     * <code>string resource_url = 2;</code>
     *
     * @return The resourceUrl.
     */
    public java.lang.String getResourceUrl() {
      java.lang.Object ref = resourceUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of this violating resource.
     * </pre>
     *
     * <code>string resource_url = 2;</code>
     *
     * @return The bytes for resourceUrl.
     */
    public com.google.protobuf.ByteString getResourceUrlBytes() {
      java.lang.Object ref = resourceUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of this violating resource.
     * </pre>
     *
     * <code>string resource_url = 2;</code>
     *
     * @param value The resourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of this violating resource.
     * </pre>
     *
     * <code>string resource_url = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceUrl() {
      resourceUrl_ = getDefaultInstance().getResourceUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of this violating resource.
     * </pre>
     *
     * <code>string resource_url = 2;</code>
     *
     * @param value The bytes for resourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceUrl_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1beta.ViolatingResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1beta.ViolatingResource)
  private static final com.google.cloud.websecurityscanner.v1beta.ViolatingResource
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1beta.ViolatingResource();
  }

  public static com.google.cloud.websecurityscanner.v1beta.ViolatingResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ViolatingResource> PARSER =
      new com.google.protobuf.AbstractParser<ViolatingResource>() {
        @java.lang.Override
        public ViolatingResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ViolatingResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ViolatingResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1beta.ViolatingResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
