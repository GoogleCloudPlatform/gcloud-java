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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * Request message for the
 * [CreateProcessor][google.cloud.documentai.v1.DocumentProcessorService.CreateProcessor]
 * method. Notice this request is sent to a regionalized backend service. If the
 * [ProcessorType][google.cloud.documentai.v1.ProcessorType] isn't available in
 * that region, the creation fails.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.CreateProcessorRequest}
 */
public final class CreateProcessorRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.CreateProcessorRequest)
    CreateProcessorRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateProcessorRequest.newBuilder() to construct.
  private CreateProcessorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateProcessorRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateProcessorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_CreateProcessorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_CreateProcessorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.CreateProcessorRequest.class,
            com.google.cloud.documentai.v1.CreateProcessorRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) under which to create the
   * processor. Format: `projects/{project}/locations/{location}`
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
   * Required. The parent (project and location) under which to create the
   * processor. Format: `projects/{project}/locations/{location}`
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

  public static final int PROCESSOR_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1.Processor processor_;
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the processor field is set.
   */
  @java.lang.Override
  public boolean hasProcessor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The processor.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.Processor getProcessor() {
    return processor_ == null
        ? com.google.cloud.documentai.v1.Processor.getDefaultInstance()
        : processor_;
  }
  /**
   *
   *
   * <pre>
   * Required. The processor to be created, requires
   * [Processor.type][google.cloud.documentai.v1.Processor.type] and
   * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
   * to be set. Also, the
   * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
   * field must be set if the processor is under CMEK.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorOrBuilder getProcessorOrBuilder() {
    return processor_ == null
        ? com.google.cloud.documentai.v1.Processor.getDefaultInstance()
        : processor_;
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
      output.writeMessage(2, getProcessor());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProcessor());
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
    if (!(obj instanceof com.google.cloud.documentai.v1.CreateProcessorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.CreateProcessorRequest other =
        (com.google.cloud.documentai.v1.CreateProcessorRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasProcessor() != other.hasProcessor()) return false;
    if (hasProcessor()) {
      if (!getProcessor().equals(other.getProcessor())) return false;
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
    if (hasProcessor()) {
      hash = (37 * hash) + PROCESSOR_FIELD_NUMBER;
      hash = (53 * hash) + getProcessor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest parseFrom(
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
      com.google.cloud.documentai.v1.CreateProcessorRequest prototype) {
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
   * Request message for the
   * [CreateProcessor][google.cloud.documentai.v1.DocumentProcessorService.CreateProcessor]
   * method. Notice this request is sent to a regionalized backend service. If the
   * [ProcessorType][google.cloud.documentai.v1.ProcessorType] isn't available in
   * that region, the creation fails.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.CreateProcessorRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.CreateProcessorRequest)
      com.google.cloud.documentai.v1.CreateProcessorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_CreateProcessorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_CreateProcessorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.CreateProcessorRequest.class,
              com.google.cloud.documentai.v1.CreateProcessorRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.CreateProcessorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProcessorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      processor_ = null;
      if (processorBuilder_ != null) {
        processorBuilder_.dispose();
        processorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_CreateProcessorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.CreateProcessorRequest getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.CreateProcessorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.CreateProcessorRequest build() {
      com.google.cloud.documentai.v1.CreateProcessorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.CreateProcessorRequest buildPartial() {
      com.google.cloud.documentai.v1.CreateProcessorRequest result =
          new com.google.cloud.documentai.v1.CreateProcessorRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1.CreateProcessorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.processor_ = processorBuilder_ == null ? processor_ : processorBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.documentai.v1.CreateProcessorRequest) {
        return mergeFrom((com.google.cloud.documentai.v1.CreateProcessorRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.CreateProcessorRequest other) {
      if (other == com.google.cloud.documentai.v1.CreateProcessorRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProcessor()) {
        mergeProcessor(other.getProcessor());
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
                input.readMessage(getProcessorFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The parent (project and location) under which to create the
     * processor. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent (project and location) under which to create the
     * processor. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent (project and location) under which to create the
     * processor. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent (project and location) under which to create the
     * processor. Format: `projects/{project}/locations/{location}`
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
     * Required. The parent (project and location) under which to create the
     * processor. Format: `projects/{project}/locations/{location}`
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

    private com.google.cloud.documentai.v1.Processor processor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.Processor,
            com.google.cloud.documentai.v1.Processor.Builder,
            com.google.cloud.documentai.v1.ProcessorOrBuilder>
        processorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the processor field is set.
     */
    public boolean hasProcessor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The processor.
     */
    public com.google.cloud.documentai.v1.Processor getProcessor() {
      if (processorBuilder_ == null) {
        return processor_ == null
            ? com.google.cloud.documentai.v1.Processor.getDefaultInstance()
            : processor_;
      } else {
        return processorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProcessor(com.google.cloud.documentai.v1.Processor value) {
      if (processorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        processor_ = value;
      } else {
        processorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProcessor(com.google.cloud.documentai.v1.Processor.Builder builderForValue) {
      if (processorBuilder_ == null) {
        processor_ = builderForValue.build();
      } else {
        processorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProcessor(com.google.cloud.documentai.v1.Processor value) {
      if (processorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && processor_ != null
            && processor_ != com.google.cloud.documentai.v1.Processor.getDefaultInstance()) {
          getProcessorBuilder().mergeFrom(value);
        } else {
          processor_ = value;
        }
      } else {
        processorBuilder_.mergeFrom(value);
      }
      if (processor_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProcessor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      processor_ = null;
      if (processorBuilder_ != null) {
        processorBuilder_.dispose();
        processorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1.Processor.Builder getProcessorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProcessorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1.ProcessorOrBuilder getProcessorOrBuilder() {
      if (processorBuilder_ != null) {
        return processorBuilder_.getMessageOrBuilder();
      } else {
        return processor_ == null
            ? com.google.cloud.documentai.v1.Processor.getDefaultInstance()
            : processor_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The processor to be created, requires
     * [Processor.type][google.cloud.documentai.v1.Processor.type] and
     * [Processor.display_name][google.cloud.documentai.v1.Processor.display_name]
     * to be set. Also, the
     * [Processor.kms_key_name][google.cloud.documentai.v1.Processor.kms_key_name]
     * field must be set if the processor is under CMEK.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.Processor processor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.Processor,
            com.google.cloud.documentai.v1.Processor.Builder,
            com.google.cloud.documentai.v1.ProcessorOrBuilder>
        getProcessorFieldBuilder() {
      if (processorBuilder_ == null) {
        processorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1.Processor,
                com.google.cloud.documentai.v1.Processor.Builder,
                com.google.cloud.documentai.v1.ProcessorOrBuilder>(
                getProcessor(), getParentForChildren(), isClean());
        processor_ = null;
      }
      return processorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.CreateProcessorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.CreateProcessorRequest)
  private static final com.google.cloud.documentai.v1.CreateProcessorRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.CreateProcessorRequest();
  }

  public static com.google.cloud.documentai.v1.CreateProcessorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProcessorRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateProcessorRequest>() {
        @java.lang.Override
        public CreateProcessorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProcessorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProcessorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.CreateProcessorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
