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
// source: google/cloud/discoveryengine/v1beta/schema_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Request message for
 * [SchemaService.UpdateSchema][google.cloud.discoveryengine.v1beta.SchemaService.UpdateSchema]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.UpdateSchemaRequest}
 */
public final class UpdateSchemaRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.UpdateSchemaRequest)
    UpdateSchemaRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSchemaRequest.newBuilder() to construct.
  private UpdateSchemaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSchemaRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSchemaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.SchemaServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.SchemaServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.class,
            com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SCHEMA_FIELD_NUMBER = 1;
  private com.google.cloud.discoveryengine.v1beta.Schema schema_;
  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schema field is set.
   */
  @java.lang.Override
  public boolean hasSchema() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schema.
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.Schema getSchema() {
    return schema_ == null
        ? com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()
        : schema_;
  }
  /**
   *
   *
   * <pre>
   * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
   * update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder getSchemaOrBuilder() {
    return schema_ == null
        ? com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()
        : schema_;
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_ = false;
  /**
   *
   *
   * <pre>
   * If set to true, and the
   * [Schema][google.cloud.discoveryengine.v1beta.Schema] is not found, a new
   * [Schema][google.cloud.discoveryengine.v1beta.Schema] will be created. In
   * this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSchema());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSchema());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest other =
        (com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest) obj;

    if (hasSchema() != other.hasSchema()) return false;
    if (hasSchema()) {
      if (!getSchema().equals(other.getSchema())) return false;
    }
    if (getAllowMissing() != other.getAllowMissing()) return false;
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
    if (hasSchema()) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchema().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowMissing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest prototype) {
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
   * Request message for
   * [SchemaService.UpdateSchema][google.cloud.discoveryengine.v1beta.SchemaService.UpdateSchema]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.UpdateSchemaRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.UpdateSchemaRequest)
      com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.SchemaServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.SchemaServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.class,
              com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSchemaFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schema_ = null;
      if (schemaBuilder_ != null) {
        schemaBuilder_.dispose();
        schemaBuilder_ = null;
      }
      allowMissing_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.SchemaServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateSchemaRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest build() {
      com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest buildPartial() {
      com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest result =
          new com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schema_ = schemaBuilder_ == null ? schema_ : schemaBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.allowMissing_ = allowMissing_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest other) {
      if (other == com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest.getDefaultInstance())
        return this;
      if (other.hasSchema()) {
        mergeSchema(other.getSchema());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
                input.readMessage(getSchemaFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 24:
              {
                allowMissing_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
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

    private com.google.cloud.discoveryengine.v1beta.Schema schema_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.Schema,
            com.google.cloud.discoveryengine.v1beta.Schema.Builder,
            com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder>
        schemaBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the schema field is set.
     */
    public boolean hasSchema() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The schema.
     */
    public com.google.cloud.discoveryengine.v1beta.Schema getSchema() {
      if (schemaBuilder_ == null) {
        return schema_ == null
            ? com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()
            : schema_;
      } else {
        return schemaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSchema(com.google.cloud.discoveryengine.v1beta.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schema_ = value;
      } else {
        schemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSchema(
        com.google.cloud.discoveryengine.v1beta.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        schema_ = builderForValue.build();
      } else {
        schemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSchema(com.google.cloud.discoveryengine.v1beta.Schema value) {
      if (schemaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && schema_ != null
            && schema_ != com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()) {
          getSchemaBuilder().mergeFrom(value);
        } else {
          schema_ = value;
        }
      } else {
        schemaBuilder_.mergeFrom(value);
      }
      if (schema_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSchema() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schema_ = null;
      if (schemaBuilder_ != null) {
        schemaBuilder_.dispose();
        schemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1beta.Schema.Builder getSchemaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSchemaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder getSchemaOrBuilder() {
      if (schemaBuilder_ != null) {
        return schemaBuilder_.getMessageOrBuilder();
      } else {
        return schema_ == null
            ? com.google.cloud.discoveryengine.v1beta.Schema.getDefaultInstance()
            : schema_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Schema][google.cloud.discoveryengine.v1beta.Schema] to
     * update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Schema schema = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.Schema,
            com.google.cloud.discoveryengine.v1beta.Schema.Builder,
            com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder>
        getSchemaFieldBuilder() {
      if (schemaBuilder_ == null) {
        schemaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.discoveryengine.v1beta.Schema,
                com.google.cloud.discoveryengine.v1beta.Schema.Builder,
                com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder>(
                getSchema(), getParentForChildren(), isClean());
        schema_ = null;
      }
      return schemaBuilder_;
    }

    private boolean allowMissing_;
    /**
     *
     *
     * <pre>
     * If set to true, and the
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] is not found, a new
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] will be created. In
     * this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     *
     *
     * <pre>
     * If set to true, and the
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] is not found, a new
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] will be created. In
     * this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {

      allowMissing_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, and the
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] is not found, a new
     * [Schema][google.cloud.discoveryengine.v1beta.Schema] will be created. In
     * this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      bitField0_ = (bitField0_ & ~0x00000002);
      allowMissing_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.UpdateSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.UpdateSchemaRequest)
  private static final com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest();
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSchemaRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSchemaRequest>() {
        @java.lang.Override
        public UpdateSchemaRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSchemaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSchemaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.UpdateSchemaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
