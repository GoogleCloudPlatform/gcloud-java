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
// source: google/cloud/eventarc/v1/eventarc.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * The request message for the CreatePipeline method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.CreatePipelineRequest}
 */
public final class CreatePipelineRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.CreatePipelineRequest)
    CreatePipelineRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePipelineRequest.newBuilder() to construct.
  private CreatePipelineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePipelineRequest() {
    parent_ = "";
    pipelineId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePipelineRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_CreatePipelineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_CreatePipelineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.CreatePipelineRequest.class,
            com.google.cloud.eventarc.v1.CreatePipelineRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this pipeline.
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
   * Required. The parent collection in which to add this pipeline.
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

  public static final int PIPELINE_FIELD_NUMBER = 2;
  private com.google.cloud.eventarc.v1.Pipeline pipeline_;
  /**
   *
   *
   * <pre>
   * Required. The pipeline to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pipeline field is set.
   */
  @java.lang.Override
  public boolean hasPipeline() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The pipeline to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pipeline.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.Pipeline getPipeline() {
    return pipeline_ == null
        ? com.google.cloud.eventarc.v1.Pipeline.getDefaultInstance()
        : pipeline_;
  }
  /**
   *
   *
   * <pre>
   * Required. The pipeline to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.PipelineOrBuilder getPipelineOrBuilder() {
    return pipeline_ == null
        ? com.google.cloud.eventarc.v1.Pipeline.getDefaultInstance()
        : pipeline_;
  }

  public static final int PIPELINE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pipelineId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the Pipeline.
   * </pre>
   *
   * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pipelineId.
   */
  @java.lang.Override
  public java.lang.String getPipelineId() {
    java.lang.Object ref = pipelineId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pipelineId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the Pipeline.
   * </pre>
   *
   * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for pipelineId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPipelineIdBytes() {
    java.lang.Object ref = pipelineId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pipelineId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getPipeline());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pipelineId_);
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPipeline());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pipelineId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pipelineId_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.CreatePipelineRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.CreatePipelineRequest other =
        (com.google.cloud.eventarc.v1.CreatePipelineRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPipeline() != other.hasPipeline()) return false;
    if (hasPipeline()) {
      if (!getPipeline().equals(other.getPipeline())) return false;
    }
    if (!getPipelineId().equals(other.getPipelineId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPipeline()) {
      hash = (37 * hash) + PIPELINE_FIELD_NUMBER;
      hash = (53 * hash) + getPipeline().hashCode();
    }
    hash = (37 * hash) + PIPELINE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPipelineId().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.eventarc.v1.CreatePipelineRequest prototype) {
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
   * The request message for the CreatePipeline method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.CreatePipelineRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.CreatePipelineRequest)
      com.google.cloud.eventarc.v1.CreatePipelineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreatePipelineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreatePipelineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.CreatePipelineRequest.class,
              com.google.cloud.eventarc.v1.CreatePipelineRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.CreatePipelineRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPipelineFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      pipeline_ = null;
      if (pipelineBuilder_ != null) {
        pipelineBuilder_.dispose();
        pipelineBuilder_ = null;
      }
      pipelineId_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_CreatePipelineRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreatePipelineRequest getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.CreatePipelineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreatePipelineRequest build() {
      com.google.cloud.eventarc.v1.CreatePipelineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.CreatePipelineRequest buildPartial() {
      com.google.cloud.eventarc.v1.CreatePipelineRequest result =
          new com.google.cloud.eventarc.v1.CreatePipelineRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.eventarc.v1.CreatePipelineRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pipeline_ = pipelineBuilder_ == null ? pipeline_ : pipelineBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pipelineId_ = pipelineId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
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
      if (other instanceof com.google.cloud.eventarc.v1.CreatePipelineRequest) {
        return mergeFrom((com.google.cloud.eventarc.v1.CreatePipelineRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.CreatePipelineRequest other) {
      if (other == com.google.cloud.eventarc.v1.CreatePipelineRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPipeline()) {
        mergePipeline(other.getPipeline());
      }
      if (!other.getPipelineId().isEmpty()) {
        pipelineId_ = other.pipelineId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPipelineFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                pipelineId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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
     * Required. The parent collection in which to add this pipeline.
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
     * Required. The parent collection in which to add this pipeline.
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
     * Required. The parent collection in which to add this pipeline.
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
     * Required. The parent collection in which to add this pipeline.
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
     * Required. The parent collection in which to add this pipeline.
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

    private com.google.cloud.eventarc.v1.Pipeline pipeline_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Pipeline,
            com.google.cloud.eventarc.v1.Pipeline.Builder,
            com.google.cloud.eventarc.v1.PipelineOrBuilder>
        pipelineBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the pipeline field is set.
     */
    public boolean hasPipeline() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The pipeline.
     */
    public com.google.cloud.eventarc.v1.Pipeline getPipeline() {
      if (pipelineBuilder_ == null) {
        return pipeline_ == null
            ? com.google.cloud.eventarc.v1.Pipeline.getDefaultInstance()
            : pipeline_;
      } else {
        return pipelineBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPipeline(com.google.cloud.eventarc.v1.Pipeline value) {
      if (pipelineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pipeline_ = value;
      } else {
        pipelineBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPipeline(com.google.cloud.eventarc.v1.Pipeline.Builder builderForValue) {
      if (pipelineBuilder_ == null) {
        pipeline_ = builderForValue.build();
      } else {
        pipelineBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePipeline(com.google.cloud.eventarc.v1.Pipeline value) {
      if (pipelineBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && pipeline_ != null
            && pipeline_ != com.google.cloud.eventarc.v1.Pipeline.getDefaultInstance()) {
          getPipelineBuilder().mergeFrom(value);
        } else {
          pipeline_ = value;
        }
      } else {
        pipelineBuilder_.mergeFrom(value);
      }
      if (pipeline_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPipeline() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pipeline_ = null;
      if (pipelineBuilder_ != null) {
        pipelineBuilder_.dispose();
        pipelineBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.Pipeline.Builder getPipelineBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPipelineFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.eventarc.v1.PipelineOrBuilder getPipelineOrBuilder() {
      if (pipelineBuilder_ != null) {
        return pipelineBuilder_.getMessageOrBuilder();
      } else {
        return pipeline_ == null
            ? com.google.cloud.eventarc.v1.Pipeline.getDefaultInstance()
            : pipeline_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The pipeline to create.
     * </pre>
     *
     * <code>
     * .google.cloud.eventarc.v1.Pipeline pipeline = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Pipeline,
            com.google.cloud.eventarc.v1.Pipeline.Builder,
            com.google.cloud.eventarc.v1.PipelineOrBuilder>
        getPipelineFieldBuilder() {
      if (pipelineBuilder_ == null) {
        pipelineBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.eventarc.v1.Pipeline,
                com.google.cloud.eventarc.v1.Pipeline.Builder,
                com.google.cloud.eventarc.v1.PipelineOrBuilder>(
                getPipeline(), getParentForChildren(), isClean());
        pipeline_ = null;
      }
      return pipelineBuilder_;
    }

    private java.lang.Object pipelineId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the Pipeline.
     * </pre>
     *
     * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The pipelineId.
     */
    public java.lang.String getPipelineId() {
      java.lang.Object ref = pipelineId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pipelineId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the Pipeline.
     * </pre>
     *
     * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for pipelineId.
     */
    public com.google.protobuf.ByteString getPipelineIdBytes() {
      java.lang.Object ref = pipelineId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pipelineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the Pipeline.
     * </pre>
     *
     * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The pipelineId to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pipelineId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the Pipeline.
     * </pre>
     *
     * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPipelineId() {
      pipelineId_ = getDefaultInstance().getPipelineId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user-provided ID to be assigned to the Pipeline.
     * </pre>
     *
     * <code>string pipeline_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for pipelineId to set.
     * @return This builder for chaining.
     */
    public Builder setPipelineIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pipelineId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.CreatePipelineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.CreatePipelineRequest)
  private static final com.google.cloud.eventarc.v1.CreatePipelineRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.CreatePipelineRequest();
  }

  public static com.google.cloud.eventarc.v1.CreatePipelineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePipelineRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePipelineRequest>() {
        @java.lang.Override
        public CreatePipelineRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePipelineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePipelineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.CreatePipelineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
