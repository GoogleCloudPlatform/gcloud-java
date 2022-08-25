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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateApiSpec.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiSpecRequest}
 */
public final class CreateApiSpecRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.CreateApiSpecRequest)
    CreateApiSpecRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateApiSpecRequest.newBuilder() to construct.
  private CreateApiSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateApiSpecRequest() {
    parent_ = "";
    apiSpecId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateApiSpecRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateApiSpecRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.apigeeregistry.v1.ApiSpec.Builder subBuilder = null;
              if (apiSpec_ != null) {
                subBuilder = apiSpec_.toBuilder();
              }
              apiSpec_ =
                  input.readMessage(
                      com.google.cloud.apigeeregistry.v1.ApiSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(apiSpec_);
                apiSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              apiSpecId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_CreateApiSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_CreateApiSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.class,
            com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of specs.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
   * Required. The parent, which owns this collection of specs.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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

  public static final int API_SPEC_FIELD_NUMBER = 2;
  private com.google.cloud.apigeeregistry.v1.ApiSpec apiSpec_;
  /**
   *
   *
   * <pre>
   * Required. The spec to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the apiSpec field is set.
   */
  @java.lang.Override
  public boolean hasApiSpec() {
    return apiSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The spec to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The apiSpec.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiSpec getApiSpec() {
    return apiSpec_ == null
        ? com.google.cloud.apigeeregistry.v1.ApiSpec.getDefaultInstance()
        : apiSpec_;
  }
  /**
   *
   *
   * <pre>
   * Required. The spec to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder getApiSpecOrBuilder() {
    return getApiSpec();
  }

  public static final int API_SPEC_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object apiSpecId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the spec, which will become the final component of
   * the spec's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The apiSpecId.
   */
  @java.lang.Override
  public java.lang.String getApiSpecId() {
    java.lang.Object ref = apiSpecId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiSpecId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the spec, which will become the final component of
   * the spec's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for apiSpecId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getApiSpecIdBytes() {
    java.lang.Object ref = apiSpecId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      apiSpecId_ = b;
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
    if (apiSpec_ != null) {
      output.writeMessage(2, getApiSpec());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiSpecId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, apiSpecId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (apiSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getApiSpec());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiSpecId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, apiSpecId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest other =
        (com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasApiSpec() != other.hasApiSpec()) return false;
    if (hasApiSpec()) {
      if (!getApiSpec().equals(other.getApiSpec())) return false;
    }
    if (!getApiSpecId().equals(other.getApiSpecId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasApiSpec()) {
      hash = (37 * hash) + API_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getApiSpec().hashCode();
    }
    hash = (37 * hash) + API_SPEC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApiSpecId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parseFrom(
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
      com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest prototype) {
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
   * Request message for CreateApiSpec.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiSpecRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.CreateApiSpecRequest)
      com.google.cloud.apigeeregistry.v1.CreateApiSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.class,
              com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (apiSpecBuilder_ == null) {
        apiSpec_ = null;
      } else {
        apiSpec_ = null;
        apiSpecBuilder_ = null;
      }
      apiSpecId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateApiSpecRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest build() {
      com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest result =
          new com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest(this);
      result.parent_ = parent_;
      if (apiSpecBuilder_ == null) {
        result.apiSpec_ = apiSpec_;
      } else {
        result.apiSpec_ = apiSpecBuilder_.build();
      }
      result.apiSpecId_ = apiSpecId_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasApiSpec()) {
        mergeApiSpec(other.getApiSpec());
      }
      if (!other.getApiSpecId().isEmpty()) {
        apiSpecId_ = other.apiSpecId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent, which owns this collection of specs.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
     * Required. The parent, which owns this collection of specs.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
     * Required. The parent, which owns this collection of specs.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent, which owns this collection of specs.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent, which owns this collection of specs.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;versions/&#42;`
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
      onChanged();
      return this;
    }

    private com.google.cloud.apigeeregistry.v1.ApiSpec apiSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiSpec,
            com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
            com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
        apiSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the apiSpec field is set.
     */
    public boolean hasApiSpec() {
      return apiSpecBuilder_ != null || apiSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The apiSpec.
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec getApiSpec() {
      if (apiSpecBuilder_ == null) {
        return apiSpec_ == null
            ? com.google.cloud.apigeeregistry.v1.ApiSpec.getDefaultInstance()
            : apiSpec_;
      } else {
        return apiSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApiSpec(com.google.cloud.apigeeregistry.v1.ApiSpec value) {
      if (apiSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiSpec_ = value;
        onChanged();
      } else {
        apiSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApiSpec(com.google.cloud.apigeeregistry.v1.ApiSpec.Builder builderForValue) {
      if (apiSpecBuilder_ == null) {
        apiSpec_ = builderForValue.build();
        onChanged();
      } else {
        apiSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeApiSpec(com.google.cloud.apigeeregistry.v1.ApiSpec value) {
      if (apiSpecBuilder_ == null) {
        if (apiSpec_ != null) {
          apiSpec_ =
              com.google.cloud.apigeeregistry.v1.ApiSpec.newBuilder(apiSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          apiSpec_ = value;
        }
        onChanged();
      } else {
        apiSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearApiSpec() {
      if (apiSpecBuilder_ == null) {
        apiSpec_ = null;
        onChanged();
      } else {
        apiSpec_ = null;
        apiSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec.Builder getApiSpecBuilder() {

      onChanged();
      return getApiSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder getApiSpecOrBuilder() {
      if (apiSpecBuilder_ != null) {
        return apiSpecBuilder_.getMessageOrBuilder();
      } else {
        return apiSpec_ == null
            ? com.google.cloud.apigeeregistry.v1.ApiSpec.getDefaultInstance()
            : apiSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The spec to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.ApiSpec api_spec = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiSpec,
            com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
            com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
        getApiSpecFieldBuilder() {
      if (apiSpecBuilder_ == null) {
        apiSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apigeeregistry.v1.ApiSpec,
                com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
                com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>(
                getApiSpec(), getParentForChildren(), isClean());
        apiSpec_ = null;
      }
      return apiSpecBuilder_;
    }

    private java.lang.Object apiSpecId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the spec, which will become the final component of
     * the spec's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The apiSpecId.
     */
    public java.lang.String getApiSpecId() {
      java.lang.Object ref = apiSpecId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiSpecId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the spec, which will become the final component of
     * the spec's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for apiSpecId.
     */
    public com.google.protobuf.ByteString getApiSpecIdBytes() {
      java.lang.Object ref = apiSpecId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiSpecId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the spec, which will become the final component of
     * the spec's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The apiSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setApiSpecId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      apiSpecId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the spec, which will become the final component of
     * the spec's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApiSpecId() {

      apiSpecId_ = getDefaultInstance().getApiSpecId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the spec, which will become the final component of
     * the spec's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_spec_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for apiSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setApiSpecIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      apiSpecId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.CreateApiSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.CreateApiSpecRequest)
  private static final com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApiSpecRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateApiSpecRequest>() {
        @java.lang.Override
        public CreateApiSpecRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateApiSpecRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateApiSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApiSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.CreateApiSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
