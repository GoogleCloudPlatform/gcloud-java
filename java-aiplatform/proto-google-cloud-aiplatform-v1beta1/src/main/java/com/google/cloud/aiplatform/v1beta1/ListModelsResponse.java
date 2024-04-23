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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ModelService.ListModels][google.cloud.aiplatform.v1beta1.ModelService.ListModels]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListModelsResponse}
 */
public final class ListModelsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListModelsResponse)
    ListModelsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListModelsResponse.newBuilder() to construct.
  private ListModelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListModelsResponse() {
    models_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListModelsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListModelsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListModelsResponse.Builder.class);
  }

  public static final int MODELS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.Model> models_;
  /**
   *
   *
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.Model> getModelsList() {
    return models_;
  }
  /**
   *
   *
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
      getModelsOrBuilderList() {
    return models_;
  }
  /**
   *
   *
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
   */
  @java.lang.Override
  public int getModelsCount() {
    return models_.size();
  }
  /**
   *
   *
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Model getModels(int index) {
    return models_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of Models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelsOrBuilder(int index) {
    return models_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < models_.size(); i++) {
      output.writeMessage(1, models_.get(i));
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
    for (int i = 0; i < models_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, models_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListModelsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListModelsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListModelsResponse) obj;

    if (!getModelsList().equals(other.getModelsList())) return false;
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
    if (getModelsCount() > 0) {
      hash = (37 * hash) + MODELS_FIELD_NUMBER;
      hash = (53 * hash) + getModelsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListModelsResponse prototype) {
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
   * [ModelService.ListModels][google.cloud.aiplatform.v1beta1.ModelService.ListModels]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListModelsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListModelsResponse)
      com.google.cloud.aiplatform.v1beta1.ListModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListModelsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListModelsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListModelsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
      } else {
        models_ = null;
        modelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListModelsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListModelsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListModelsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListModelsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListModelsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListModelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ListModelsResponse result) {
      if (modelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          models_ = java.util.Collections.unmodifiableList(models_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.models_ = models_;
      } else {
        result.models_ = modelsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListModelsResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListModelsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListModelsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListModelsResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListModelsResponse.getDefaultInstance())
        return this;
      if (modelsBuilder_ == null) {
        if (!other.models_.isEmpty()) {
          if (models_.isEmpty()) {
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelsIsMutable();
            models_.addAll(other.models_);
          }
          onChanged();
        }
      } else {
        if (!other.models_.isEmpty()) {
          if (modelsBuilder_.isEmpty()) {
            modelsBuilder_.dispose();
            modelsBuilder_ = null;
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getModelsFieldBuilder()
                    : null;
          } else {
            modelsBuilder_.addAllMessages(other.models_);
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
                com.google.cloud.aiplatform.v1beta1.Model m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.Model.parser(), extensionRegistry);
                if (modelsBuilder_ == null) {
                  ensureModelsIsMutable();
                  models_.add(m);
                } else {
                  modelsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.Model> models_ =
        java.util.Collections.emptyList();

    private void ensureModelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        models_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.Model>(models_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Model,
            com.google.cloud.aiplatform.v1beta1.Model.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
        modelsBuilder_;

    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Model> getModelsList() {
      if (modelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(models_);
      } else {
        return modelsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public int getModelsCount() {
      if (modelsBuilder_ == null) {
        return models_.size();
      } else {
        return modelsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Model getModels(int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder setModels(int index, com.google.cloud.aiplatform.v1beta1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.set(index, value);
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder setModels(
        int index, com.google.cloud.aiplatform.v1beta1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder addModels(com.google.cloud.aiplatform.v1beta1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder addModels(int index, com.google.cloud.aiplatform.v1beta1.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(index, value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder addModels(com.google.cloud.aiplatform.v1beta1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder addModels(
        int index, com.google.cloud.aiplatform.v1beta1.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder addAllModels(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.Model> values) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, models_);
        onChanged();
      } else {
        modelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder clearModels() {
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public Builder removeModels(int index) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.remove(index);
        onChanged();
      } else {
        modelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Model.Builder getModelsBuilder(int index) {
      return getModelsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ModelOrBuilder getModelsOrBuilder(int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
        getModelsOrBuilderList() {
      if (modelsBuilder_ != null) {
        return modelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(models_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Model.Builder addModelsBuilder() {
      return getModelsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.Model.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Model.Builder addModelsBuilder(int index) {
      return getModelsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.Model.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Models in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.Model models = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.Model.Builder>
        getModelsBuilderList() {
      return getModelsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Model,
            com.google.cloud.aiplatform.v1beta1.Model.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>
        getModelsFieldBuilder() {
      if (modelsBuilder_ == null) {
        modelsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Model,
                com.google.cloud.aiplatform.v1beta1.Model.Builder,
                com.google.cloud.aiplatform.v1beta1.ModelOrBuilder>(
                models_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        models_ = null;
      }
      return modelsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListModelsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelsRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListModelsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListModelsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListModelsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListModelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListModelsResponse>() {
        @java.lang.Override
        public ListModelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListModelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
