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
// source: google/cloud/contentwarehouse/v1/document_link_service.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Request message for DocumentLinkService.ListLinkedTargets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest}
 */
public final class ListLinkedTargetsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest)
    ListLinkedTargetsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListLinkedTargetsRequest.newBuilder() to construct.
  private ListLinkedTargetsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListLinkedTargetsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListLinkedTargetsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.class,
            com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the document, for which all target links are returned.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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
   * Required. The name of the document, for which all target links are returned.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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

  public static final int REQUEST_METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.contentwarehouse.v1.RequestMetadata requestMetadata_;
  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  @java.lang.Override
  public boolean hasRequestMetadata() {
    return requestMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return The requestMetadata.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata() {
    return requestMetadata_ == null
        ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
        : requestMetadata_;
  }
  /**
   *
   *
   * <pre>
   * The meta information collected about the document creator, used to enforce
   * access control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder
      getRequestMetadataOrBuilder() {
    return requestMetadata_ == null
        ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
        : requestMetadata_;
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
    if (requestMetadata_ != null) {
      output.writeMessage(2, getRequestMetadata());
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
    if (requestMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRequestMetadata());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest other =
        (com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasRequestMetadata() != other.hasRequestMetadata()) return false;
    if (hasRequestMetadata()) {
      if (!getRequestMetadata().equals(other.getRequestMetadata())) return false;
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
    if (hasRequestMetadata()) {
      hash = (37 * hash) + REQUEST_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getRequestMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest parseFrom(
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
      com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest prototype) {
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
   * Request message for DocumentLinkService.ListLinkedTargets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest)
      com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.class,
              com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      requestMetadata_ = null;
      if (requestMetadataBuilder_ != null) {
        requestMetadataBuilder_.dispose();
        requestMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentLinkServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListLinkedTargetsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest build() {
      com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest buildPartial() {
      com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest result =
          new com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestMetadata_ =
            requestMetadataBuilder_ == null ? requestMetadata_ : requestMetadataBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest other) {
      if (other
          == com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRequestMetadata()) {
        mergeRequestMetadata(other.getRequestMetadata());
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
                input.readMessage(getRequestMetadataFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The name of the document, for which all target links are returned.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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
     * Required. The name of the document, for which all target links are returned.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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
     * Required. The name of the document, for which all target links are returned.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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
     * Required. The name of the document, for which all target links are returned.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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
     * Required. The name of the document, for which all target links are returned.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{target_document_id}.
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

    private com.google.cloud.contentwarehouse.v1.RequestMetadata requestMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RequestMetadata,
            com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>
        requestMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return Whether the requestMetadata field is set.
     */
    public boolean hasRequestMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return The requestMetadata.
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata() {
      if (requestMetadataBuilder_ == null) {
        return requestMetadata_ == null
            ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      } else {
        return requestMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(com.google.cloud.contentwarehouse.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestMetadata_ = value;
      } else {
        requestMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(
        com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder builderForValue) {
      if (requestMetadataBuilder_ == null) {
        requestMetadata_ = builderForValue.build();
      } else {
        requestMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder mergeRequestMetadata(
        com.google.cloud.contentwarehouse.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && requestMetadata_ != null
            && requestMetadata_
                != com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()) {
          getRequestMetadataBuilder().mergeFrom(value);
        } else {
          requestMetadata_ = value;
        }
      } else {
        requestMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder clearRequestMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requestMetadata_ = null;
      if (requestMetadataBuilder_ != null) {
        requestMetadataBuilder_.dispose();
        requestMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder
        getRequestMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRequestMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder
        getRequestMetadataOrBuilder() {
      if (requestMetadataBuilder_ != null) {
        return requestMetadataBuilder_.getMessageOrBuilder();
      } else {
        return requestMetadata_ == null
            ? com.google.cloud.contentwarehouse.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The meta information collected about the document creator, used to enforce
     * access control for the service.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.RequestMetadata,
            com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
            com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>
        getRequestMetadataFieldBuilder() {
      if (requestMetadataBuilder_ == null) {
        requestMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.RequestMetadata,
                com.google.cloud.contentwarehouse.v1.RequestMetadata.Builder,
                com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder>(
                getRequestMetadata(), getParentForChildren(), isClean());
        requestMetadata_ = null;
      }
      return requestMetadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest)
  private static final com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest();
  }

  public static com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLinkedTargetsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListLinkedTargetsRequest>() {
        @java.lang.Override
        public ListLinkedTargetsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLinkedTargetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLinkedTargetsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ListLinkedTargetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
