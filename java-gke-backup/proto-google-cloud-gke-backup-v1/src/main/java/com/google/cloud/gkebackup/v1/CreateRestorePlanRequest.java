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
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateRestorePlan.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.CreateRestorePlanRequest}
 */
public final class CreateRestorePlanRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.CreateRestorePlanRequest)
    CreateRestorePlanRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRestorePlanRequest.newBuilder() to construct.
  private CreateRestorePlanRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRestorePlanRequest() {
    parent_ = "";
    restorePlanId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRestorePlanRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_CreateRestorePlanRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_CreateRestorePlanRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.class,
            com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The location within which to create the RestorePlan.
   * Format: projects/&#42;&#47;locations/&#42;
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
   * Required. The location within which to create the RestorePlan.
   * Format: projects/&#42;&#47;locations/&#42;
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

  public static final int RESTORE_PLAN_FIELD_NUMBER = 2;
  private com.google.cloud.gkebackup.v1.RestorePlan restorePlan_;
  /**
   *
   *
   * <pre>
   * Required. The RestorePlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the restorePlan field is set.
   */
  @java.lang.Override
  public boolean hasRestorePlan() {
    return restorePlan_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The RestorePlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restorePlan.
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.RestorePlan getRestorePlan() {
    return restorePlan_ == null
        ? com.google.cloud.gkebackup.v1.RestorePlan.getDefaultInstance()
        : restorePlan_;
  }
  /**
   *
   *
   * <pre>
   * Required. The RestorePlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.RestorePlanOrBuilder getRestorePlanOrBuilder() {
    return restorePlan_ == null
        ? com.google.cloud.gkebackup.v1.RestorePlan.getDefaultInstance()
        : restorePlan_;
  }

  public static final int RESTORE_PLAN_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object restorePlanId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the RestorePlan resource.
   * This name must:
   *  - be between 1 and 63 characters long (inclusive)
   *  - consist of only lower-case ASCII letters, numbers, and dashes
   *  - start with a lower-case letter
   *  - end with a lower-case letter or number
   *  - be unique within the set of RestorePlans in this location
   * </pre>
   *
   * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The restorePlanId.
   */
  @java.lang.Override
  public java.lang.String getRestorePlanId() {
    java.lang.Object ref = restorePlanId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      restorePlanId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the RestorePlan resource.
   * This name must:
   *  - be between 1 and 63 characters long (inclusive)
   *  - consist of only lower-case ASCII letters, numbers, and dashes
   *  - start with a lower-case letter
   *  - end with a lower-case letter or number
   *  - be unique within the set of RestorePlans in this location
   * </pre>
   *
   * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for restorePlanId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRestorePlanIdBytes() {
    java.lang.Object ref = restorePlanId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      restorePlanId_ = b;
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
    if (restorePlan_ != null) {
      output.writeMessage(2, getRestorePlan());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restorePlanId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, restorePlanId_);
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
    if (restorePlan_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRestorePlan());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restorePlanId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, restorePlanId_);
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.CreateRestorePlanRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.CreateRestorePlanRequest other =
        (com.google.cloud.gkebackup.v1.CreateRestorePlanRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasRestorePlan() != other.hasRestorePlan()) return false;
    if (hasRestorePlan()) {
      if (!getRestorePlan().equals(other.getRestorePlan())) return false;
    }
    if (!getRestorePlanId().equals(other.getRestorePlanId())) return false;
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
    if (hasRestorePlan()) {
      hash = (37 * hash) + RESTORE_PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getRestorePlan().hashCode();
    }
    hash = (37 * hash) + RESTORE_PLAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRestorePlanId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest parseFrom(
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
      com.google.cloud.gkebackup.v1.CreateRestorePlanRequest prototype) {
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
   * Request message for CreateRestorePlan.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.CreateRestorePlanRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.CreateRestorePlanRequest)
      com.google.cloud.gkebackup.v1.CreateRestorePlanRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestorePlanRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestorePlanRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.class,
              com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      restorePlan_ = null;
      if (restorePlanBuilder_ != null) {
        restorePlanBuilder_.dispose();
        restorePlanBuilder_ = null;
      }
      restorePlanId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_CreateRestorePlanRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestorePlanRequest getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestorePlanRequest build() {
      com.google.cloud.gkebackup.v1.CreateRestorePlanRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.CreateRestorePlanRequest buildPartial() {
      com.google.cloud.gkebackup.v1.CreateRestorePlanRequest result =
          new com.google.cloud.gkebackup.v1.CreateRestorePlanRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.CreateRestorePlanRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restorePlan_ =
            restorePlanBuilder_ == null ? restorePlan_ : restorePlanBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.restorePlanId_ = restorePlanId_;
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
      if (other instanceof com.google.cloud.gkebackup.v1.CreateRestorePlanRequest) {
        return mergeFrom((com.google.cloud.gkebackup.v1.CreateRestorePlanRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.CreateRestorePlanRequest other) {
      if (other == com.google.cloud.gkebackup.v1.CreateRestorePlanRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRestorePlan()) {
        mergeRestorePlan(other.getRestorePlan());
      }
      if (!other.getRestorePlanId().isEmpty()) {
        restorePlanId_ = other.restorePlanId_;
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
                input.readMessage(getRestorePlanFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                restorePlanId_ = input.readStringRequireUtf8();
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
     * Required. The location within which to create the RestorePlan.
     * Format: projects/&#42;&#47;locations/&#42;
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
     * Required. The location within which to create the RestorePlan.
     * Format: projects/&#42;&#47;locations/&#42;
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
     * Required. The location within which to create the RestorePlan.
     * Format: projects/&#42;&#47;locations/&#42;
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
     * Required. The location within which to create the RestorePlan.
     * Format: projects/&#42;&#47;locations/&#42;
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
     * Required. The location within which to create the RestorePlan.
     * Format: projects/&#42;&#47;locations/&#42;
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

    private com.google.cloud.gkebackup.v1.RestorePlan restorePlan_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.RestorePlan,
            com.google.cloud.gkebackup.v1.RestorePlan.Builder,
            com.google.cloud.gkebackup.v1.RestorePlanOrBuilder>
        restorePlanBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the restorePlan field is set.
     */
    public boolean hasRestorePlan() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The restorePlan.
     */
    public com.google.cloud.gkebackup.v1.RestorePlan getRestorePlan() {
      if (restorePlanBuilder_ == null) {
        return restorePlan_ == null
            ? com.google.cloud.gkebackup.v1.RestorePlan.getDefaultInstance()
            : restorePlan_;
      } else {
        return restorePlanBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestorePlan(com.google.cloud.gkebackup.v1.RestorePlan value) {
      if (restorePlanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restorePlan_ = value;
      } else {
        restorePlanBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestorePlan(
        com.google.cloud.gkebackup.v1.RestorePlan.Builder builderForValue) {
      if (restorePlanBuilder_ == null) {
        restorePlan_ = builderForValue.build();
      } else {
        restorePlanBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRestorePlan(com.google.cloud.gkebackup.v1.RestorePlan value) {
      if (restorePlanBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && restorePlan_ != null
            && restorePlan_ != com.google.cloud.gkebackup.v1.RestorePlan.getDefaultInstance()) {
          getRestorePlanBuilder().mergeFrom(value);
        } else {
          restorePlan_ = value;
        }
      } else {
        restorePlanBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRestorePlan() {
      bitField0_ = (bitField0_ & ~0x00000002);
      restorePlan_ = null;
      if (restorePlanBuilder_ != null) {
        restorePlanBuilder_.dispose();
        restorePlanBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.RestorePlan.Builder getRestorePlanBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRestorePlanFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.RestorePlanOrBuilder getRestorePlanOrBuilder() {
      if (restorePlanBuilder_ != null) {
        return restorePlanBuilder_.getMessageOrBuilder();
      } else {
        return restorePlan_ == null
            ? com.google.cloud.gkebackup.v1.RestorePlan.getDefaultInstance()
            : restorePlan_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The RestorePlan resource object to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.RestorePlan restore_plan = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.RestorePlan,
            com.google.cloud.gkebackup.v1.RestorePlan.Builder,
            com.google.cloud.gkebackup.v1.RestorePlanOrBuilder>
        getRestorePlanFieldBuilder() {
      if (restorePlanBuilder_ == null) {
        restorePlanBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkebackup.v1.RestorePlan,
                com.google.cloud.gkebackup.v1.RestorePlan.Builder,
                com.google.cloud.gkebackup.v1.RestorePlanOrBuilder>(
                getRestorePlan(), getParentForChildren(), isClean());
        restorePlan_ = null;
      }
      return restorePlanBuilder_;
    }

    private java.lang.Object restorePlanId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the RestorePlan resource.
     * This name must:
     *  - be between 1 and 63 characters long (inclusive)
     *  - consist of only lower-case ASCII letters, numbers, and dashes
     *  - start with a lower-case letter
     *  - end with a lower-case letter or number
     *  - be unique within the set of RestorePlans in this location
     * </pre>
     *
     * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The restorePlanId.
     */
    public java.lang.String getRestorePlanId() {
      java.lang.Object ref = restorePlanId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        restorePlanId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the RestorePlan resource.
     * This name must:
     *  - be between 1 and 63 characters long (inclusive)
     *  - consist of only lower-case ASCII letters, numbers, and dashes
     *  - start with a lower-case letter
     *  - end with a lower-case letter or number
     *  - be unique within the set of RestorePlans in this location
     * </pre>
     *
     * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for restorePlanId.
     */
    public com.google.protobuf.ByteString getRestorePlanIdBytes() {
      java.lang.Object ref = restorePlanId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        restorePlanId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the RestorePlan resource.
     * This name must:
     *  - be between 1 and 63 characters long (inclusive)
     *  - consist of only lower-case ASCII letters, numbers, and dashes
     *  - start with a lower-case letter
     *  - end with a lower-case letter or number
     *  - be unique within the set of RestorePlans in this location
     * </pre>
     *
     * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The restorePlanId to set.
     * @return This builder for chaining.
     */
    public Builder setRestorePlanId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      restorePlanId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the RestorePlan resource.
     * This name must:
     *  - be between 1 and 63 characters long (inclusive)
     *  - consist of only lower-case ASCII letters, numbers, and dashes
     *  - start with a lower-case letter
     *  - end with a lower-case letter or number
     *  - be unique within the set of RestorePlans in this location
     * </pre>
     *
     * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRestorePlanId() {
      restorePlanId_ = getDefaultInstance().getRestorePlanId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The client-provided short name for the RestorePlan resource.
     * This name must:
     *  - be between 1 and 63 characters long (inclusive)
     *  - consist of only lower-case ASCII letters, numbers, and dashes
     *  - start with a lower-case letter
     *  - end with a lower-case letter or number
     *  - be unique within the set of RestorePlans in this location
     * </pre>
     *
     * <code>string restore_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for restorePlanId to set.
     * @return This builder for chaining.
     */
    public Builder setRestorePlanIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      restorePlanId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.CreateRestorePlanRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.CreateRestorePlanRequest)
  private static final com.google.cloud.gkebackup.v1.CreateRestorePlanRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.CreateRestorePlanRequest();
  }

  public static com.google.cloud.gkebackup.v1.CreateRestorePlanRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRestorePlanRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRestorePlanRequest>() {
        @java.lang.Override
        public CreateRestorePlanRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRestorePlanRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRestorePlanRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.CreateRestorePlanRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
