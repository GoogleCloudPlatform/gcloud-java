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
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [MetadataService.ListMetadataSchemas][google.cloud.aiplatform.v1.MetadataService.ListMetadataSchemas].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListMetadataSchemasResponse}
 */
public final class ListMetadataSchemasResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListMetadataSchemasResponse)
    ListMetadataSchemasResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListMetadataSchemasResponse.newBuilder() to construct.
  private ListMetadataSchemasResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListMetadataSchemasResponse() {
    metadataSchemas_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListMetadataSchemasResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListMetadataSchemasResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListMetadataSchemasResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.class,
            com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.Builder.class);
  }

  public static final int METADATA_SCHEMAS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1.MetadataSchema> metadataSchemas_;
  /**
   *
   *
   * <pre>
   * The MetadataSchemas found for the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.MetadataSchema> getMetadataSchemasList() {
    return metadataSchemas_;
  }
  /**
   *
   *
   * <pre>
   * The MetadataSchemas found for the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder>
      getMetadataSchemasOrBuilderList() {
    return metadataSchemas_;
  }
  /**
   *
   *
   * <pre>
   * The MetadataSchemas found for the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
   */
  @java.lang.Override
  public int getMetadataSchemasCount() {
    return metadataSchemas_.size();
  }
  /**
   *
   *
   * <pre>
   * The MetadataSchemas found for the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MetadataSchema getMetadataSchemas(int index) {
    return metadataSchemas_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The MetadataSchemas found for the MetadataStore.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder getMetadataSchemasOrBuilder(
      int index) {
    return metadataSchemas_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
   * to retrieve the next page. If this field is not populated, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
   * to retrieve the next page. If this field is not populated, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < metadataSchemas_.size(); i++) {
      output.writeMessage(1, metadataSchemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metadataSchemas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, metadataSchemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse other =
        (com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse) obj;

    if (!getMetadataSchemasList().equals(other.getMetadataSchemasList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getMetadataSchemasCount() > 0) {
      hash = (37 * hash) + METADATA_SCHEMAS_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataSchemasList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse prototype) {
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
   * Response message for
   * [MetadataService.ListMetadataSchemas][google.cloud.aiplatform.v1.MetadataService.ListMetadataSchemas].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListMetadataSchemasResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListMetadataSchemasResponse)
      com.google.cloud.aiplatform.v1.ListMetadataSchemasResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListMetadataSchemasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListMetadataSchemasResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.class,
              com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metadataSchemasBuilder_ == null) {
        metadataSchemas_ = java.util.Collections.emptyList();
      } else {
        metadataSchemas_ = null;
        metadataSchemasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListMetadataSchemasResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse build() {
      com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse result =
          new com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse(this);
      int from_bitField0_ = bitField0_;
      if (metadataSchemasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metadataSchemas_ = java.util.Collections.unmodifiableList(metadataSchemas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metadataSchemas_ = metadataSchemas_;
      } else {
        result.metadataSchemas_ = metadataSchemasBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse.getDefaultInstance())
        return this;
      if (metadataSchemasBuilder_ == null) {
        if (!other.metadataSchemas_.isEmpty()) {
          if (metadataSchemas_.isEmpty()) {
            metadataSchemas_ = other.metadataSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetadataSchemasIsMutable();
            metadataSchemas_.addAll(other.metadataSchemas_);
          }
          onChanged();
        }
      } else {
        if (!other.metadataSchemas_.isEmpty()) {
          if (metadataSchemasBuilder_.isEmpty()) {
            metadataSchemasBuilder_.dispose();
            metadataSchemasBuilder_ = null;
            metadataSchemas_ = other.metadataSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metadataSchemasBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetadataSchemasFieldBuilder()
                    : null;
          } else {
            metadataSchemasBuilder_.addAllMessages(other.metadataSchemas_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.aiplatform.v1.MetadataSchema m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.MetadataSchema.parser(), extensionRegistry);
                if (metadataSchemasBuilder_ == null) {
                  ensureMetadataSchemasIsMutable();
                  metadataSchemas_.add(m);
                } else {
                  metadataSchemasBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.aiplatform.v1.MetadataSchema> metadataSchemas_ =
        java.util.Collections.emptyList();

    private void ensureMetadataSchemasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metadataSchemas_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.MetadataSchema>(
                metadataSchemas_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.MetadataSchema,
            com.google.cloud.aiplatform.v1.MetadataSchema.Builder,
            com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder>
        metadataSchemasBuilder_;

    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.MetadataSchema> getMetadataSchemasList() {
      if (metadataSchemasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metadataSchemas_);
      } else {
        return metadataSchemasBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public int getMetadataSchemasCount() {
      if (metadataSchemasBuilder_ == null) {
        return metadataSchemas_.size();
      } else {
        return metadataSchemasBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.MetadataSchema getMetadataSchemas(int index) {
      if (metadataSchemasBuilder_ == null) {
        return metadataSchemas_.get(index);
      } else {
        return metadataSchemasBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder setMetadataSchemas(
        int index, com.google.cloud.aiplatform.v1.MetadataSchema value) {
      if (metadataSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.set(index, value);
        onChanged();
      } else {
        metadataSchemasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder setMetadataSchemas(
        int index, com.google.cloud.aiplatform.v1.MetadataSchema.Builder builderForValue) {
      if (metadataSchemasBuilder_ == null) {
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.set(index, builderForValue.build());
        onChanged();
      } else {
        metadataSchemasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder addMetadataSchemas(com.google.cloud.aiplatform.v1.MetadataSchema value) {
      if (metadataSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.add(value);
        onChanged();
      } else {
        metadataSchemasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder addMetadataSchemas(
        int index, com.google.cloud.aiplatform.v1.MetadataSchema value) {
      if (metadataSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.add(index, value);
        onChanged();
      } else {
        metadataSchemasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder addMetadataSchemas(
        com.google.cloud.aiplatform.v1.MetadataSchema.Builder builderForValue) {
      if (metadataSchemasBuilder_ == null) {
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.add(builderForValue.build());
        onChanged();
      } else {
        metadataSchemasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder addMetadataSchemas(
        int index, com.google.cloud.aiplatform.v1.MetadataSchema.Builder builderForValue) {
      if (metadataSchemasBuilder_ == null) {
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.add(index, builderForValue.build());
        onChanged();
      } else {
        metadataSchemasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder addAllMetadataSchemas(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.MetadataSchema> values) {
      if (metadataSchemasBuilder_ == null) {
        ensureMetadataSchemasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metadataSchemas_);
        onChanged();
      } else {
        metadataSchemasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder clearMetadataSchemas() {
      if (metadataSchemasBuilder_ == null) {
        metadataSchemas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metadataSchemasBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public Builder removeMetadataSchemas(int index) {
      if (metadataSchemasBuilder_ == null) {
        ensureMetadataSchemasIsMutable();
        metadataSchemas_.remove(index);
        onChanged();
      } else {
        metadataSchemasBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.MetadataSchema.Builder getMetadataSchemasBuilder(
        int index) {
      return getMetadataSchemasFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder getMetadataSchemasOrBuilder(
        int index) {
      if (metadataSchemasBuilder_ == null) {
        return metadataSchemas_.get(index);
      } else {
        return metadataSchemasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder>
        getMetadataSchemasOrBuilderList() {
      if (metadataSchemasBuilder_ != null) {
        return metadataSchemasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metadataSchemas_);
      }
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.MetadataSchema.Builder addMetadataSchemasBuilder() {
      return getMetadataSchemasFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.MetadataSchema.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.MetadataSchema.Builder addMetadataSchemasBuilder(
        int index) {
      return getMetadataSchemasFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.MetadataSchema.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The MetadataSchemas found for the MetadataStore.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.MetadataSchema metadata_schemas = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.MetadataSchema.Builder>
        getMetadataSchemasBuilderList() {
      return getMetadataSchemasFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.MetadataSchema,
            com.google.cloud.aiplatform.v1.MetadataSchema.Builder,
            com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder>
        getMetadataSchemasFieldBuilder() {
      if (metadataSchemasBuilder_ == null) {
        metadataSchemasBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.MetadataSchema,
                com.google.cloud.aiplatform.v1.MetadataSchema.Builder,
                com.google.cloud.aiplatform.v1.MetadataSchemaOrBuilder>(
                metadataSchemas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metadataSchemas_ = null;
      }
      return metadataSchemasBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [ListMetadataSchemasRequest.page_token][google.cloud.aiplatform.v1.ListMetadataSchemasRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListMetadataSchemasResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListMetadataSchemasResponse)
  private static final com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMetadataSchemasResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListMetadataSchemasResponse>() {
        @java.lang.Override
        public ListMetadataSchemasResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMetadataSchemasResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMetadataSchemasResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListMetadataSchemasResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
