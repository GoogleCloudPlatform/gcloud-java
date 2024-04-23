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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

// Protobuf Java Version: 3.25.3
package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * Request of [UpdateGcpUserAccessBinding]
 * [google.identity.accesscontextmanager.v1.AccessContextManager.UpdateGcpUserAccessBinding].
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest}
 */
public final class UpdateGcpUserAccessBindingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)
    UpdateGcpUserAccessBindingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateGcpUserAccessBindingRequest.newBuilder() to construct.
  private UpdateGcpUserAccessBindingRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateGcpUserAccessBindingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateGcpUserAccessBindingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateGcpUserAccessBindingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateGcpUserAccessBindingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest.class,
            com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest.Builder
                .class);
  }

  private int bitField0_;
  public static final int GCP_USER_ACCESS_BINDING_FIELD_NUMBER = 1;
  private com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcpUserAccessBinding_;
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gcpUserAccessBinding field is set.
   */
  @java.lang.Override
  public boolean hasGcpUserAccessBinding() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gcpUserAccessBinding.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
      getGcpUserAccessBinding() {
    return gcpUserAccessBinding_ == null
        ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
        : gcpUserAccessBinding_;
  }
  /**
   *
   *
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder
      getGcpUserAccessBindingOrBuilder() {
    return gcpUserAccessBinding_ == null
        ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
        : gcpUserAccessBinding_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   *
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   *
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   *
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getGcpUserAccessBinding());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcpUserAccessBinding());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj
        instanceof com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest other =
        (com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest) obj;

    if (hasGcpUserAccessBinding() != other.hasGcpUserAccessBinding()) return false;
    if (hasGcpUserAccessBinding()) {
      if (!getGcpUserAccessBinding().equals(other.getGcpUserAccessBinding())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasGcpUserAccessBinding()) {
      hash = (37 * hash) + GCP_USER_ACCESS_BINDING_FIELD_NUMBER;
      hash = (53 * hash) + getGcpUserAccessBinding().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      parseFrom(
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
      com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest prototype) {
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
   * Request of [UpdateGcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.AccessContextManager.UpdateGcpUserAccessBinding].
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)
      com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateGcpUserAccessBindingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateGcpUserAccessBindingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest.class,
              com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGcpUserAccessBindingFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcpUserAccessBinding_ = null;
      if (gcpUserAccessBindingBuilder_ != null) {
        gcpUserAccessBindingBuilder_.dispose();
        gcpUserAccessBindingBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateGcpUserAccessBindingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest build() {
      com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
        buildPartial() {
      com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest result =
          new com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcpUserAccessBinding_ =
            gcpUserAccessBindingBuilder_ == null
                ? gcpUserAccessBinding_
                : gcpUserAccessBindingBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other
          instanceof
          com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
              .getDefaultInstance()) return this;
      if (other.hasGcpUserAccessBinding()) {
        mergeGcpUserAccessBinding(other.getGcpUserAccessBinding());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getGcpUserAccessBindingFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcpUserAccessBinding_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>
        gcpUserAccessBindingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the gcpUserAccessBinding field is set.
     */
    public boolean hasGcpUserAccessBinding() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The gcpUserAccessBinding.
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
        getGcpUserAccessBinding() {
      if (gcpUserAccessBindingBuilder_ == null) {
        return gcpUserAccessBinding_ == null
            ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
            : gcpUserAccessBinding_;
      } else {
        return gcpUserAccessBindingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding value) {
      if (gcpUserAccessBindingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcpUserAccessBinding_ = value;
      } else {
        gcpUserAccessBindingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder builderForValue) {
      if (gcpUserAccessBindingBuilder_ == null) {
        gcpUserAccessBinding_ = builderForValue.build();
      } else {
        gcpUserAccessBindingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGcpUserAccessBinding(
        com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding value) {
      if (gcpUserAccessBindingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && gcpUserAccessBinding_ != null
            && gcpUserAccessBinding_
                != com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding
                    .getDefaultInstance()) {
          getGcpUserAccessBindingBuilder().mergeFrom(value);
        } else {
          gcpUserAccessBinding_ = value;
        }
      } else {
        gcpUserAccessBindingBuilder_.mergeFrom(value);
      }
      if (gcpUserAccessBinding_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGcpUserAccessBinding() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gcpUserAccessBinding_ = null;
      if (gcpUserAccessBindingBuilder_ != null) {
        gcpUserAccessBindingBuilder_.dispose();
        gcpUserAccessBindingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder
        getGcpUserAccessBindingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGcpUserAccessBindingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder
        getGcpUserAccessBindingOrBuilder() {
      if (gcpUserAccessBindingBuilder_ != null) {
        return gcpUserAccessBindingBuilder_.getMessageOrBuilder();
      } else {
        return gcpUserAccessBinding_ == null
            ? com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.getDefaultInstance()
            : gcpUserAccessBinding_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [GcpUserAccessBinding]
     * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
            com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>
        getGcpUserAccessBindingFieldBuilder() {
      if (gcpUserAccessBindingBuilder_ == null) {
        gcpUserAccessBindingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding,
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding.Builder,
                com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder>(
                getGcpUserAccessBinding(), getParentForChildren(), isClean());
        gcpUserAccessBinding_ = null;
      }
      return gcpUserAccessBindingBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Only the fields specified in this mask are updated. Because name and
     * group_key cannot be changed, update_mask is required and must always be:
     *
     * update_mask {
     * paths: "access_levels"
     * }
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)
  private static final com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest();
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGcpUserAccessBindingRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateGcpUserAccessBindingRequest>() {
        @java.lang.Override
        public UpdateGcpUserAccessBindingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGcpUserAccessBindingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGcpUserAccessBindingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
