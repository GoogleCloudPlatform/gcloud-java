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
// source: google/cloud/dialogflow/v2/generator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Request message of CreateGenerator.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateGeneratorRequest}
 */
public final class CreateGeneratorRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateGeneratorRequest)
    CreateGeneratorRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGeneratorRequest.newBuilder() to construct.
  private CreateGeneratorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGeneratorRequest() {
    parent_ = "";
    generatorId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGeneratorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.GeneratorProto
        .internal_static_google_cloud_dialogflow_v2_CreateGeneratorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.GeneratorProto
        .internal_static_google_cloud_dialogflow_v2_CreateGeneratorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateGeneratorRequest.class,
            com.google.cloud.dialogflow.v2.CreateGeneratorRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project/location to create generator for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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
   * Required. The project/location to create generator for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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

  public static final int GENERATOR_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.Generator generator_;
  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the generator field is set.
   */
  @java.lang.Override
  public boolean hasGenerator() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The generator.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Generator getGenerator() {
    return generator_ == null
        ? com.google.cloud.dialogflow.v2.Generator.getDefaultInstance()
        : generator_;
  }
  /**
   *
   *
   * <pre>
   * Required. The generator to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.GeneratorOrBuilder getGeneratorOrBuilder() {
    return generator_ == null
        ? com.google.cloud.dialogflow.v2.Generator.getDefaultInstance()
        : generator_;
  }

  public static final int GENERATOR_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object generatorId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the generator, which will become the final
   * component of the generator's resource name.
   *
   * The generator ID must be compliant with the regression formula
   * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
   * If the field is not provided, an Id will be auto-generated.
   * If the field is provided, the caller is responsible for
   * 1. the uniqueness of the ID, otherwise the request will be rejected.
   * 2. the consistency for whether to use custom ID or not under a project to
   * better ensure uniqueness.
   * </pre>
   *
   * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The generatorId.
   */
  @java.lang.Override
  public java.lang.String getGeneratorId() {
    java.lang.Object ref = generatorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      generatorId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the generator, which will become the final
   * component of the generator's resource name.
   *
   * The generator ID must be compliant with the regression formula
   * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
   * If the field is not provided, an Id will be auto-generated.
   * If the field is provided, the caller is responsible for
   * 1. the uniqueness of the ID, otherwise the request will be rejected.
   * 2. the consistency for whether to use custom ID or not under a project to
   * better ensure uniqueness.
   * </pre>
   *
   * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for generatorId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGeneratorIdBytes() {
    java.lang.Object ref = generatorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      generatorId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getGenerator());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(generatorId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, generatorId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGenerator());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(generatorId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, generatorId_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateGeneratorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateGeneratorRequest other =
        (com.google.cloud.dialogflow.v2.CreateGeneratorRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasGenerator() != other.hasGenerator()) return false;
    if (hasGenerator()) {
      if (!getGenerator().equals(other.getGenerator())) return false;
    }
    if (!getGeneratorId().equals(other.getGeneratorId())) return false;
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
    if (hasGenerator()) {
      hash = (37 * hash) + GENERATOR_FIELD_NUMBER;
      hash = (53 * hash) + getGenerator().hashCode();
    }
    hash = (37 * hash) + GENERATOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGeneratorId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.CreateGeneratorRequest prototype) {
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
   * Request message of CreateGenerator.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateGeneratorRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateGeneratorRequest)
      com.google.cloud.dialogflow.v2.CreateGeneratorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_CreateGeneratorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_CreateGeneratorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateGeneratorRequest.class,
              com.google.cloud.dialogflow.v2.CreateGeneratorRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateGeneratorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGeneratorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      generator_ = null;
      if (generatorBuilder_ != null) {
        generatorBuilder_.dispose();
        generatorBuilder_ = null;
      }
      generatorId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.GeneratorProto
          .internal_static_google_cloud_dialogflow_v2_CreateGeneratorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateGeneratorRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateGeneratorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateGeneratorRequest build() {
      com.google.cloud.dialogflow.v2.CreateGeneratorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateGeneratorRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateGeneratorRequest result =
          new com.google.cloud.dialogflow.v2.CreateGeneratorRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.CreateGeneratorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.generator_ = generatorBuilder_ == null ? generator_ : generatorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.generatorId_ = generatorId_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.CreateGeneratorRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateGeneratorRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.CreateGeneratorRequest other) {
      if (other == com.google.cloud.dialogflow.v2.CreateGeneratorRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasGenerator()) {
        mergeGenerator(other.getGenerator());
      }
      if (!other.getGeneratorId().isEmpty()) {
        generatorId_ = other.generatorId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getGeneratorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                generatorId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. The project/location to create generator for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The project/location to create generator for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The project/location to create generator for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The project/location to create generator for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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
     * Required. The project/location to create generator for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
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

    private com.google.cloud.dialogflow.v2.Generator generator_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Generator,
            com.google.cloud.dialogflow.v2.Generator.Builder,
            com.google.cloud.dialogflow.v2.GeneratorOrBuilder>
        generatorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the generator field is set.
     */
    public boolean hasGenerator() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The generator.
     */
    public com.google.cloud.dialogflow.v2.Generator getGenerator() {
      if (generatorBuilder_ == null) {
        return generator_ == null
            ? com.google.cloud.dialogflow.v2.Generator.getDefaultInstance()
            : generator_;
      } else {
        return generatorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGenerator(com.google.cloud.dialogflow.v2.Generator value) {
      if (generatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        generator_ = value;
      } else {
        generatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGenerator(com.google.cloud.dialogflow.v2.Generator.Builder builderForValue) {
      if (generatorBuilder_ == null) {
        generator_ = builderForValue.build();
      } else {
        generatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGenerator(com.google.cloud.dialogflow.v2.Generator value) {
      if (generatorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && generator_ != null
            && generator_ != com.google.cloud.dialogflow.v2.Generator.getDefaultInstance()) {
          getGeneratorBuilder().mergeFrom(value);
        } else {
          generator_ = value;
        }
      } else {
        generatorBuilder_.mergeFrom(value);
      }
      if (generator_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGenerator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      generator_ = null;
      if (generatorBuilder_ != null) {
        generatorBuilder_.dispose();
        generatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.Generator.Builder getGeneratorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getGeneratorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.GeneratorOrBuilder getGeneratorOrBuilder() {
      if (generatorBuilder_ != null) {
        return generatorBuilder_.getMessageOrBuilder();
      } else {
        return generator_ == null
            ? com.google.cloud.dialogflow.v2.Generator.getDefaultInstance()
            : generator_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The generator to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Generator generator = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Generator,
            com.google.cloud.dialogflow.v2.Generator.Builder,
            com.google.cloud.dialogflow.v2.GeneratorOrBuilder>
        getGeneratorFieldBuilder() {
      if (generatorBuilder_ == null) {
        generatorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.Generator,
                com.google.cloud.dialogflow.v2.Generator.Builder,
                com.google.cloud.dialogflow.v2.GeneratorOrBuilder>(
                getGenerator(), getParentForChildren(), isClean());
        generator_ = null;
      }
      return generatorBuilder_;
    }

    private java.lang.Object generatorId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the generator, which will become the final
     * component of the generator's resource name.
     *
     * The generator ID must be compliant with the regression formula
     * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
     * If the field is not provided, an Id will be auto-generated.
     * If the field is provided, the caller is responsible for
     * 1. the uniqueness of the ID, otherwise the request will be rejected.
     * 2. the consistency for whether to use custom ID or not under a project to
     * better ensure uniqueness.
     * </pre>
     *
     * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The generatorId.
     */
    public java.lang.String getGeneratorId() {
      java.lang.Object ref = generatorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        generatorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the generator, which will become the final
     * component of the generator's resource name.
     *
     * The generator ID must be compliant with the regression formula
     * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
     * If the field is not provided, an Id will be auto-generated.
     * If the field is provided, the caller is responsible for
     * 1. the uniqueness of the ID, otherwise the request will be rejected.
     * 2. the consistency for whether to use custom ID or not under a project to
     * better ensure uniqueness.
     * </pre>
     *
     * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for generatorId.
     */
    public com.google.protobuf.ByteString getGeneratorIdBytes() {
      java.lang.Object ref = generatorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        generatorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the generator, which will become the final
     * component of the generator's resource name.
     *
     * The generator ID must be compliant with the regression formula
     * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
     * If the field is not provided, an Id will be auto-generated.
     * If the field is provided, the caller is responsible for
     * 1. the uniqueness of the ID, otherwise the request will be rejected.
     * 2. the consistency for whether to use custom ID or not under a project to
     * better ensure uniqueness.
     * </pre>
     *
     * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The generatorId to set.
     * @return This builder for chaining.
     */
    public Builder setGeneratorId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      generatorId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the generator, which will become the final
     * component of the generator's resource name.
     *
     * The generator ID must be compliant with the regression formula
     * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
     * If the field is not provided, an Id will be auto-generated.
     * If the field is provided, the caller is responsible for
     * 1. the uniqueness of the ID, otherwise the request will be rejected.
     * 2. the consistency for whether to use custom ID or not under a project to
     * better ensure uniqueness.
     * </pre>
     *
     * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGeneratorId() {
      generatorId_ = getDefaultInstance().getGeneratorId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the generator, which will become the final
     * component of the generator's resource name.
     *
     * The generator ID must be compliant with the regression formula
     * `[a-zA-Z][a-zA-Z0-9_-]*` with the characters length in range of [3,64].
     * If the field is not provided, an Id will be auto-generated.
     * If the field is provided, the caller is responsible for
     * 1. the uniqueness of the ID, otherwise the request will be rejected.
     * 2. the consistency for whether to use custom ID or not under a project to
     * better ensure uniqueness.
     * </pre>
     *
     * <code>string generator_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for generatorId to set.
     * @return This builder for chaining.
     */
    public Builder setGeneratorIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      generatorId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateGeneratorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateGeneratorRequest)
  private static final com.google.cloud.dialogflow.v2.CreateGeneratorRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateGeneratorRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateGeneratorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGeneratorRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGeneratorRequest>() {
        @java.lang.Override
        public CreateGeneratorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGeneratorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGeneratorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateGeneratorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
