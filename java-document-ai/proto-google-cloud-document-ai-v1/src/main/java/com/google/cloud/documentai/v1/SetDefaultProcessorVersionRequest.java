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
 * [SetDefaultProcessorVersion][google.cloud.documentai.v1.DocumentProcessorService.SetDefaultProcessorVersion]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.SetDefaultProcessorVersionRequest}
 */
public final class SetDefaultProcessorVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)
    SetDefaultProcessorVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetDefaultProcessorVersionRequest.newBuilder() to construct.
  private SetDefaultProcessorVersionRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetDefaultProcessorVersionRequest() {
    processor_ = "";
    defaultProcessorVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetDefaultProcessorVersionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_SetDefaultProcessorVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_SetDefaultProcessorVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.class,
            com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.Builder.class);
  }

  public static final int PROCESSOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object processor_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] to change default
   * version.
   * </pre>
   *
   * <code>
   * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The processor.
   */
  @java.lang.Override
  public java.lang.String getProcessor() {
    java.lang.Object ref = processor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processor_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] to change default
   * version.
   * </pre>
   *
   * <code>
   * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for processor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProcessorBytes() {
    java.lang.Object ref = processor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      processor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_PROCESSOR_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultProcessorVersion_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of child
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
   * default. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
   * </pre>
   *
   * <code>
   * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The defaultProcessorVersion.
   */
  @java.lang.Override
  public java.lang.String getDefaultProcessorVersion() {
    java.lang.Object ref = defaultProcessorVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultProcessorVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of child
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
   * default. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
   * </pre>
   *
   * <code>
   * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for defaultProcessorVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDefaultProcessorVersionBytes() {
    java.lang.Object ref = defaultProcessorVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      defaultProcessorVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultProcessorVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultProcessorVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, processor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultProcessorVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultProcessorVersion_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest other =
        (com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest) obj;

    if (!getProcessor().equals(other.getProcessor())) return false;
    if (!getDefaultProcessorVersion().equals(other.getDefaultProcessorVersion())) return false;
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
    hash = (37 * hash) + PROCESSOR_FIELD_NUMBER;
    hash = (53 * hash) + getProcessor().hashCode();
    hash = (37 * hash) + DEFAULT_PROCESSOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultProcessorVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest parseFrom(
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
      com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest prototype) {
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
   * [SetDefaultProcessorVersion][google.cloud.documentai.v1.DocumentProcessorService.SetDefaultProcessorVersion]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.SetDefaultProcessorVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)
      com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_SetDefaultProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_SetDefaultProcessorVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.class,
              com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      processor_ = "";
      defaultProcessorVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_SetDefaultProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest build() {
      com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest buildPartial() {
      com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest result =
          new com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.processor_ = processor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultProcessorVersion_ = defaultProcessorVersion_;
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
      if (other instanceof com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest) {
        return mergeFrom((com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest other) {
      if (other
          == com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest.getDefaultInstance())
        return this;
      if (!other.getProcessor().isEmpty()) {
        processor_ = other.processor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDefaultProcessorVersion().isEmpty()) {
        defaultProcessorVersion_ = other.defaultProcessorVersion_;
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
                processor_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                defaultProcessorVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object processor_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Processor][google.cloud.documentai.v1.Processor] to change default
     * version.
     * </pre>
     *
     * <code>
     * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The processor.
     */
    public java.lang.String getProcessor() {
      java.lang.Object ref = processor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Processor][google.cloud.documentai.v1.Processor] to change default
     * version.
     * </pre>
     *
     * <code>
     * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for processor.
     */
    public com.google.protobuf.ByteString getProcessorBytes() {
      java.lang.Object ref = processor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        processor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Processor][google.cloud.documentai.v1.Processor] to change default
     * version.
     * </pre>
     *
     * <code>
     * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The processor to set.
     * @return This builder for chaining.
     */
    public Builder setProcessor(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      processor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Processor][google.cloud.documentai.v1.Processor] to change default
     * version.
     * </pre>
     *
     * <code>
     * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProcessor() {
      processor_ = getDefaultInstance().getProcessor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the
     * [Processor][google.cloud.documentai.v1.Processor] to change default
     * version.
     * </pre>
     *
     * <code>
     * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for processor to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      processor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object defaultProcessorVersion_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of child
     * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
     * default. Format:
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
     * </pre>
     *
     * <code>
     * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The defaultProcessorVersion.
     */
    public java.lang.String getDefaultProcessorVersion() {
      java.lang.Object ref = defaultProcessorVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultProcessorVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of child
     * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
     * default. Format:
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
     * </pre>
     *
     * <code>
     * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for defaultProcessorVersion.
     */
    public com.google.protobuf.ByteString getDefaultProcessorVersionBytes() {
      java.lang.Object ref = defaultProcessorVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        defaultProcessorVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of child
     * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
     * default. Format:
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
     * </pre>
     *
     * <code>
     * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The defaultProcessorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultProcessorVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      defaultProcessorVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of child
     * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
     * default. Format:
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
     * </pre>
     *
     * <code>
     * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultProcessorVersion() {
      defaultProcessorVersion_ = getDefaultInstance().getDefaultProcessorVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of child
     * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
     * default. Format:
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
     * </pre>
     *
     * <code>
     * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for defaultProcessorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultProcessorVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      defaultProcessorVersion_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)
  private static final com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest();
  }

  public static com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetDefaultProcessorVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetDefaultProcessorVersionRequest>() {
        @java.lang.Override
        public SetDefaultProcessorVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetDefaultProcessorVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetDefaultProcessorVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
