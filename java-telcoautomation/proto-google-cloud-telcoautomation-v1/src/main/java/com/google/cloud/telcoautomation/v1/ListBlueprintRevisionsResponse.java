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
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1;

/**
 *
 *
 * <pre>
 * Response object for `ListBlueprintRevisions`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse}
 */
public final class ListBlueprintRevisionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse)
    ListBlueprintRevisionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListBlueprintRevisionsResponse.newBuilder() to construct.
  private ListBlueprintRevisionsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListBlueprintRevisionsResponse() {
    blueprints_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListBlueprintRevisionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto
        .internal_static_google_cloud_telcoautomation_v1_ListBlueprintRevisionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto
        .internal_static_google_cloud_telcoautomation_v1_ListBlueprintRevisionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse.class,
            com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse.Builder.class);
  }

  public static final int BLUEPRINTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.telcoautomation.v1.Blueprint> blueprints_;
  /**
   *
   *
   * <pre>
   * The revisions of the blueprint.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.telcoautomation.v1.Blueprint> getBlueprintsList() {
    return blueprints_;
  }
  /**
   *
   *
   * <pre>
   * The revisions of the blueprint.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.telcoautomation.v1.BlueprintOrBuilder>
      getBlueprintsOrBuilderList() {
    return blueprints_;
  }
  /**
   *
   *
   * <pre>
   * The revisions of the blueprint.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  @java.lang.Override
  public int getBlueprintsCount() {
    return blueprints_.size();
  }
  /**
   *
   *
   * <pre>
   * The revisions of the blueprint.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.Blueprint getBlueprints(int index) {
    return blueprints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The revisions of the blueprint.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.BlueprintOrBuilder getBlueprintsOrBuilder(int index) {
    return blueprints_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < blueprints_.size(); i++) {
      output.writeMessage(1, blueprints_.get(i));
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
    for (int i = 0; i < blueprints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, blueprints_.get(i));
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse other =
        (com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse) obj;

    if (!getBlueprintsList().equals(other.getBlueprintsList())) return false;
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
    if (getBlueprintsCount() > 0) {
      hash = (37 * hash) + BLUEPRINTS_FIELD_NUMBER;
      hash = (53 * hash) + getBlueprintsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse parseFrom(
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
      com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse prototype) {
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
   * Response object for `ListBlueprintRevisions`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse)
      com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1_ListBlueprintRevisionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1_ListBlueprintRevisionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse.class,
              com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (blueprintsBuilder_ == null) {
        blueprints_ = java.util.Collections.emptyList();
      } else {
        blueprints_ = null;
        blueprintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto
          .internal_static_google_cloud_telcoautomation_v1_ListBlueprintRevisionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse build() {
      com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse buildPartial() {
      com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse result =
          new com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse result) {
      if (blueprintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          blueprints_ = java.util.Collections.unmodifiableList(blueprints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.blueprints_ = blueprints_;
      } else {
        result.blueprints_ = blueprintsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse result) {
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
      if (other instanceof com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse) {
        return mergeFrom(
            (com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse other) {
      if (other
          == com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
              .getDefaultInstance()) return this;
      if (blueprintsBuilder_ == null) {
        if (!other.blueprints_.isEmpty()) {
          if (blueprints_.isEmpty()) {
            blueprints_ = other.blueprints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBlueprintsIsMutable();
            blueprints_.addAll(other.blueprints_);
          }
          onChanged();
        }
      } else {
        if (!other.blueprints_.isEmpty()) {
          if (blueprintsBuilder_.isEmpty()) {
            blueprintsBuilder_.dispose();
            blueprintsBuilder_ = null;
            blueprints_ = other.blueprints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            blueprintsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getBlueprintsFieldBuilder()
                    : null;
          } else {
            blueprintsBuilder_.addAllMessages(other.blueprints_);
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
                com.google.cloud.telcoautomation.v1.Blueprint m =
                    input.readMessage(
                        com.google.cloud.telcoautomation.v1.Blueprint.parser(), extensionRegistry);
                if (blueprintsBuilder_ == null) {
                  ensureBlueprintsIsMutable();
                  blueprints_.add(m);
                } else {
                  blueprintsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.telcoautomation.v1.Blueprint> blueprints_ =
        java.util.Collections.emptyList();

    private void ensureBlueprintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blueprints_ =
            new java.util.ArrayList<com.google.cloud.telcoautomation.v1.Blueprint>(blueprints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.telcoautomation.v1.Blueprint,
            com.google.cloud.telcoautomation.v1.Blueprint.Builder,
            com.google.cloud.telcoautomation.v1.BlueprintOrBuilder>
        blueprintsBuilder_;

    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1.Blueprint> getBlueprintsList() {
      if (blueprintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blueprints_);
      } else {
        return blueprintsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public int getBlueprintsCount() {
      if (blueprintsBuilder_ == null) {
        return blueprints_.size();
      } else {
        return blueprintsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Blueprint getBlueprints(int index) {
      if (blueprintsBuilder_ == null) {
        return blueprints_.get(index);
      } else {
        return blueprintsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder setBlueprints(int index, com.google.cloud.telcoautomation.v1.Blueprint value) {
      if (blueprintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlueprintsIsMutable();
        blueprints_.set(index, value);
        onChanged();
      } else {
        blueprintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder setBlueprints(
        int index, com.google.cloud.telcoautomation.v1.Blueprint.Builder builderForValue) {
      if (blueprintsBuilder_ == null) {
        ensureBlueprintsIsMutable();
        blueprints_.set(index, builderForValue.build());
        onChanged();
      } else {
        blueprintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder addBlueprints(com.google.cloud.telcoautomation.v1.Blueprint value) {
      if (blueprintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlueprintsIsMutable();
        blueprints_.add(value);
        onChanged();
      } else {
        blueprintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder addBlueprints(int index, com.google.cloud.telcoautomation.v1.Blueprint value) {
      if (blueprintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlueprintsIsMutable();
        blueprints_.add(index, value);
        onChanged();
      } else {
        blueprintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder addBlueprints(
        com.google.cloud.telcoautomation.v1.Blueprint.Builder builderForValue) {
      if (blueprintsBuilder_ == null) {
        ensureBlueprintsIsMutable();
        blueprints_.add(builderForValue.build());
        onChanged();
      } else {
        blueprintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder addBlueprints(
        int index, com.google.cloud.telcoautomation.v1.Blueprint.Builder builderForValue) {
      if (blueprintsBuilder_ == null) {
        ensureBlueprintsIsMutable();
        blueprints_.add(index, builderForValue.build());
        onChanged();
      } else {
        blueprintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder addAllBlueprints(
        java.lang.Iterable<? extends com.google.cloud.telcoautomation.v1.Blueprint> values) {
      if (blueprintsBuilder_ == null) {
        ensureBlueprintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, blueprints_);
        onChanged();
      } else {
        blueprintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder clearBlueprints() {
      if (blueprintsBuilder_ == null) {
        blueprints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        blueprintsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public Builder removeBlueprints(int index) {
      if (blueprintsBuilder_ == null) {
        ensureBlueprintsIsMutable();
        blueprints_.remove(index);
        onChanged();
      } else {
        blueprintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Blueprint.Builder getBlueprintsBuilder(int index) {
      return getBlueprintsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.BlueprintOrBuilder getBlueprintsOrBuilder(
        int index) {
      if (blueprintsBuilder_ == null) {
        return blueprints_.get(index);
      } else {
        return blueprintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.telcoautomation.v1.BlueprintOrBuilder>
        getBlueprintsOrBuilderList() {
      if (blueprintsBuilder_ != null) {
        return blueprintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blueprints_);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Blueprint.Builder addBlueprintsBuilder() {
      return getBlueprintsFieldBuilder()
          .addBuilder(com.google.cloud.telcoautomation.v1.Blueprint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public com.google.cloud.telcoautomation.v1.Blueprint.Builder addBlueprintsBuilder(int index) {
      return getBlueprintsFieldBuilder()
          .addBuilder(index, com.google.cloud.telcoautomation.v1.Blueprint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The revisions of the blueprint.
     * </pre>
     *
     * <code>repeated .google.cloud.telcoautomation.v1.Blueprint blueprints = 1;</code>
     */
    public java.util.List<com.google.cloud.telcoautomation.v1.Blueprint.Builder>
        getBlueprintsBuilderList() {
      return getBlueprintsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.telcoautomation.v1.Blueprint,
            com.google.cloud.telcoautomation.v1.Blueprint.Builder,
            com.google.cloud.telcoautomation.v1.BlueprintOrBuilder>
        getBlueprintsFieldBuilder() {
      if (blueprintsBuilder_ == null) {
        blueprintsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.telcoautomation.v1.Blueprint,
                com.google.cloud.telcoautomation.v1.Blueprint.Builder,
                com.google.cloud.telcoautomation.v1.BlueprintOrBuilder>(
                blueprints_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        blueprints_ = null;
      }
      return blueprintsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse)
  private static final com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse();
  }

  public static com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBlueprintRevisionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListBlueprintRevisionsResponse>() {
        @java.lang.Override
        public ListBlueprintRevisionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBlueprintRevisionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBlueprintRevisionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.ListBlueprintRevisionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
