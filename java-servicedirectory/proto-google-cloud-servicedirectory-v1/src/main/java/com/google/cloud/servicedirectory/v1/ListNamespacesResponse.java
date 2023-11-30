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
// source: google/cloud/servicedirectory/v1/registration_service.proto

package com.google.cloud.servicedirectory.v1;

/**
 *
 *
 * <pre>
 * The response message for
 * [RegistrationService.ListNamespaces][google.cloud.servicedirectory.v1.RegistrationService.ListNamespaces].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1.ListNamespacesResponse}
 */
public final class ListNamespacesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1.ListNamespacesResponse)
    ListNamespacesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListNamespacesResponse.newBuilder() to construct.
  private ListNamespacesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNamespacesResponse() {
    namespaces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNamespacesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1_ListNamespacesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto
        .internal_static_google_cloud_servicedirectory_v1_ListNamespacesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1.ListNamespacesResponse.class,
            com.google.cloud.servicedirectory.v1.ListNamespacesResponse.Builder.class);
  }

  public static final int NAMESPACES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.servicedirectory.v1.Namespace> namespaces_;
  /**
   *
   *
   * <pre>
   * The list of namespaces.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.servicedirectory.v1.Namespace> getNamespacesList() {
    return namespaces_;
  }
  /**
   *
   *
   * <pre>
   * The list of namespaces.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.servicedirectory.v1.NamespaceOrBuilder>
      getNamespacesOrBuilderList() {
    return namespaces_;
  }
  /**
   *
   *
   * <pre>
   * The list of namespaces.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
   */
  @java.lang.Override
  public int getNamespacesCount() {
    return namespaces_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of namespaces.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.Namespace getNamespaces(int index) {
    return namespaces_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of namespaces.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.NamespaceOrBuilder getNamespacesOrBuilder(int index) {
    return namespaces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < namespaces_.size(); i++) {
      output.writeMessage(1, namespaces_.get(i));
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
    for (int i = 0; i < namespaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, namespaces_.get(i));
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
    if (!(obj instanceof com.google.cloud.servicedirectory.v1.ListNamespacesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1.ListNamespacesResponse other =
        (com.google.cloud.servicedirectory.v1.ListNamespacesResponse) obj;

    if (!getNamespacesList().equals(other.getNamespacesList())) return false;
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
    if (getNamespacesCount() > 0) {
      hash = (37 * hash) + NAMESPACES_FIELD_NUMBER;
      hash = (53 * hash) + getNamespacesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse parseFrom(
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
      com.google.cloud.servicedirectory.v1.ListNamespacesResponse prototype) {
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
   * The response message for
   * [RegistrationService.ListNamespaces][google.cloud.servicedirectory.v1.RegistrationService.ListNamespaces].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1.ListNamespacesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1.ListNamespacesResponse)
      com.google.cloud.servicedirectory.v1.ListNamespacesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ListNamespacesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ListNamespacesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1.ListNamespacesResponse.class,
              com.google.cloud.servicedirectory.v1.ListNamespacesResponse.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1.ListNamespacesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
      } else {
        namespaces_ = null;
        namespacesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto
          .internal_static_google_cloud_servicedirectory_v1_ListNamespacesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ListNamespacesResponse getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1.ListNamespacesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ListNamespacesResponse build() {
      com.google.cloud.servicedirectory.v1.ListNamespacesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.ListNamespacesResponse buildPartial() {
      com.google.cloud.servicedirectory.v1.ListNamespacesResponse result =
          new com.google.cloud.servicedirectory.v1.ListNamespacesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.servicedirectory.v1.ListNamespacesResponse result) {
      if (namespacesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          namespaces_ = java.util.Collections.unmodifiableList(namespaces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.namespaces_ = namespaces_;
      } else {
        result.namespaces_ = namespacesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.servicedirectory.v1.ListNamespacesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.servicedirectory.v1.ListNamespacesResponse) {
        return mergeFrom((com.google.cloud.servicedirectory.v1.ListNamespacesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1.ListNamespacesResponse other) {
      if (other == com.google.cloud.servicedirectory.v1.ListNamespacesResponse.getDefaultInstance())
        return this;
      if (namespacesBuilder_ == null) {
        if (!other.namespaces_.isEmpty()) {
          if (namespaces_.isEmpty()) {
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNamespacesIsMutable();
            namespaces_.addAll(other.namespaces_);
          }
          onChanged();
        }
      } else {
        if (!other.namespaces_.isEmpty()) {
          if (namespacesBuilder_.isEmpty()) {
            namespacesBuilder_.dispose();
            namespacesBuilder_ = null;
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            namespacesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNamespacesFieldBuilder()
                    : null;
          } else {
            namespacesBuilder_.addAllMessages(other.namespaces_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.servicedirectory.v1.Namespace m =
                    input.readMessage(
                        com.google.cloud.servicedirectory.v1.Namespace.parser(), extensionRegistry);
                if (namespacesBuilder_ == null) {
                  ensureNamespacesIsMutable();
                  namespaces_.add(m);
                } else {
                  namespacesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.servicedirectory.v1.Namespace> namespaces_ =
        java.util.Collections.emptyList();

    private void ensureNamespacesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        namespaces_ =
            new java.util.ArrayList<com.google.cloud.servicedirectory.v1.Namespace>(namespaces_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Namespace,
            com.google.cloud.servicedirectory.v1.Namespace.Builder,
            com.google.cloud.servicedirectory.v1.NamespaceOrBuilder>
        namespacesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public java.util.List<com.google.cloud.servicedirectory.v1.Namespace> getNamespacesList() {
      if (namespacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(namespaces_);
      } else {
        return namespacesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public int getNamespacesCount() {
      if (namespacesBuilder_ == null) {
        return namespaces_.size();
      } else {
        return namespacesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1.Namespace getNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);
      } else {
        return namespacesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder setNamespaces(int index, com.google.cloud.servicedirectory.v1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.set(index, value);
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder setNamespaces(
        int index, com.google.cloud.servicedirectory.v1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder addNamespaces(com.google.cloud.servicedirectory.v1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder addNamespaces(int index, com.google.cloud.servicedirectory.v1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(index, value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder addNamespaces(
        com.google.cloud.servicedirectory.v1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder addNamespaces(
        int index, com.google.cloud.servicedirectory.v1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder addAllNamespaces(
        java.lang.Iterable<? extends com.google.cloud.servicedirectory.v1.Namespace> values) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, namespaces_);
        onChanged();
      } else {
        namespacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder clearNamespaces() {
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        namespacesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public Builder removeNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.remove(index);
        onChanged();
      } else {
        namespacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1.Namespace.Builder getNamespacesBuilder(int index) {
      return getNamespacesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1.NamespaceOrBuilder getNamespacesOrBuilder(
        int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);
      } else {
        return namespacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.servicedirectory.v1.NamespaceOrBuilder>
        getNamespacesOrBuilderList() {
      if (namespacesBuilder_ != null) {
        return namespacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(namespaces_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1.Namespace.Builder addNamespacesBuilder() {
      return getNamespacesFieldBuilder()
          .addBuilder(com.google.cloud.servicedirectory.v1.Namespace.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public com.google.cloud.servicedirectory.v1.Namespace.Builder addNamespacesBuilder(int index) {
      return getNamespacesFieldBuilder()
          .addBuilder(index, com.google.cloud.servicedirectory.v1.Namespace.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of namespaces.
     * </pre>
     *
     * <code>repeated .google.cloud.servicedirectory.v1.Namespace namespaces = 1;</code>
     */
    public java.util.List<com.google.cloud.servicedirectory.v1.Namespace.Builder>
        getNamespacesBuilderList() {
      return getNamespacesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Namespace,
            com.google.cloud.servicedirectory.v1.Namespace.Builder,
            com.google.cloud.servicedirectory.v1.NamespaceOrBuilder>
        getNamespacesFieldBuilder() {
      if (namespacesBuilder_ == null) {
        namespacesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.servicedirectory.v1.Namespace,
                com.google.cloud.servicedirectory.v1.Namespace.Builder,
                com.google.cloud.servicedirectory.v1.NamespaceOrBuilder>(
                namespaces_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        namespaces_ = null;
      }
      return namespacesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1.ListNamespacesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.ListNamespacesResponse)
  private static final com.google.cloud.servicedirectory.v1.ListNamespacesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1.ListNamespacesResponse();
  }

  public static com.google.cloud.servicedirectory.v1.ListNamespacesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNamespacesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNamespacesResponse>() {
        @java.lang.Override
        public ListNamespacesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNamespacesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNamespacesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.ListNamespacesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
