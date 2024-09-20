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
// source: google/cloud/aiplatform/v1beta1/feature_registry_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [FeatureRegistryService.CreateFeatureGroup][google.cloud.aiplatform.v1beta1.FeatureRegistryService.CreateFeatureGroup].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest}
 */
public final class CreateFeatureGroupRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)
    CreateFeatureGroupRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateFeatureGroupRequest.newBuilder() to construct.
  private CreateFeatureGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateFeatureGroupRequest() {
    parent_ = "";
    featureGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateFeatureGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create FeatureGroups.
   * Format:
   * `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to create FeatureGroups.
   * Format:
   * `projects/{project}/locations/{location}`
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

  public static final int FEATURE_GROUP_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.FeatureGroup featureGroup_;
  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureGroup field is set.
   */
  @java.lang.Override
  public boolean hasFeatureGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureGroup.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureGroup getFeatureGroup() {
    return featureGroup_ == null
        ? com.google.cloud.aiplatform.v1beta1.FeatureGroup.getDefaultInstance()
        : featureGroup_;
  }
  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder getFeatureGroupOrBuilder() {
    return featureGroup_ == null
        ? com.google.cloud.aiplatform.v1beta1.FeatureGroup.getDefaultInstance()
        : featureGroup_;
  }

  public static final int FEATURE_GROUP_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object featureGroupId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this FeatureGroup, which will become the final
   * component of the FeatureGroup's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The featureGroupId.
   */
  @java.lang.Override
  public java.lang.String getFeatureGroupId() {
    java.lang.Object ref = featureGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureGroupId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for this FeatureGroup, which will become the final
   * component of the FeatureGroup's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within the project and location.
   * </pre>
   *
   * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for featureGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFeatureGroupIdBytes() {
    java.lang.Object ref = featureGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      featureGroupId_ = b;
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
      output.writeMessage(2, getFeatureGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, featureGroupId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFeatureGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(featureGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, featureGroupId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasFeatureGroup() != other.hasFeatureGroup()) return false;
    if (hasFeatureGroup()) {
      if (!getFeatureGroup().equals(other.getFeatureGroup())) return false;
    }
    if (!getFeatureGroupId().equals(other.getFeatureGroupId())) return false;
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
    if (hasFeatureGroup()) {
      hash = (37 * hash) + FEATURE_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureGroup().hashCode();
    }
    hash = (37 * hash) + FEATURE_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureGroupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest prototype) {
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
   * [FeatureRegistryService.CreateFeatureGroup][google.cloud.aiplatform.v1beta1.FeatureRegistryService.CreateFeatureGroup].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)
      com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFeatureGroupFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      featureGroup_ = null;
      if (featureGroupBuilder_ != null) {
        featureGroupBuilder_.dispose();
        featureGroupBuilder_ = null;
      }
      featureGroupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeatureRegistryServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateFeatureGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.featureGroup_ =
            featureGroupBuilder_ == null ? featureGroup_ : featureGroupBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.featureGroupId_ = featureGroupId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFeatureGroup()) {
        mergeFeatureGroup(other.getFeatureGroup());
      }
      if (!other.getFeatureGroupId().isEmpty()) {
        featureGroupId_ = other.featureGroupId_;
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
                input.readMessage(getFeatureGroupFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                featureGroupId_ = input.readStringRequireUtf8();
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
     * Required. The resource name of the Location to create FeatureGroups.
     * Format:
     * `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create FeatureGroups.
     * Format:
     * `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create FeatureGroups.
     * Format:
     * `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create FeatureGroups.
     * Format:
     * `projects/{project}/locations/{location}`
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
     * Required. The resource name of the Location to create FeatureGroups.
     * Format:
     * `projects/{project}/locations/{location}`
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

    private com.google.cloud.aiplatform.v1beta1.FeatureGroup featureGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FeatureGroup,
            com.google.cloud.aiplatform.v1beta1.FeatureGroup.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder>
        featureGroupBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the featureGroup field is set.
     */
    public boolean hasFeatureGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The featureGroup.
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureGroup getFeatureGroup() {
      if (featureGroupBuilder_ == null) {
        return featureGroup_ == null
            ? com.google.cloud.aiplatform.v1beta1.FeatureGroup.getDefaultInstance()
            : featureGroup_;
      } else {
        return featureGroupBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeatureGroup(com.google.cloud.aiplatform.v1beta1.FeatureGroup value) {
      if (featureGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureGroup_ = value;
      } else {
        featureGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeatureGroup(
        com.google.cloud.aiplatform.v1beta1.FeatureGroup.Builder builderForValue) {
      if (featureGroupBuilder_ == null) {
        featureGroup_ = builderForValue.build();
      } else {
        featureGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFeatureGroup(com.google.cloud.aiplatform.v1beta1.FeatureGroup value) {
      if (featureGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && featureGroup_ != null
            && featureGroup_
                != com.google.cloud.aiplatform.v1beta1.FeatureGroup.getDefaultInstance()) {
          getFeatureGroupBuilder().mergeFrom(value);
        } else {
          featureGroup_ = value;
        }
      } else {
        featureGroupBuilder_.mergeFrom(value);
      }
      if (featureGroup_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFeatureGroup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      featureGroup_ = null;
      if (featureGroupBuilder_ != null) {
        featureGroupBuilder_.dispose();
        featureGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureGroup.Builder getFeatureGroupBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFeatureGroupFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder getFeatureGroupOrBuilder() {
      if (featureGroupBuilder_ != null) {
        return featureGroupBuilder_.getMessageOrBuilder();
      } else {
        return featureGroup_ == null
            ? com.google.cloud.aiplatform.v1beta1.FeatureGroup.getDefaultInstance()
            : featureGroup_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The FeatureGroup to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.FeatureGroup feature_group = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.FeatureGroup,
            com.google.cloud.aiplatform.v1beta1.FeatureGroup.Builder,
            com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder>
        getFeatureGroupFieldBuilder() {
      if (featureGroupBuilder_ == null) {
        featureGroupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.FeatureGroup,
                com.google.cloud.aiplatform.v1beta1.FeatureGroup.Builder,
                com.google.cloud.aiplatform.v1beta1.FeatureGroupOrBuilder>(
                getFeatureGroup(), getParentForChildren(), isClean());
        featureGroup_ = null;
      }
      return featureGroupBuilder_;
    }

    private java.lang.Object featureGroupId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this FeatureGroup, which will become the final
     * component of the FeatureGroup's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within the project and location.
     * </pre>
     *
     * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The featureGroupId.
     */
    public java.lang.String getFeatureGroupId() {
      java.lang.Object ref = featureGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this FeatureGroup, which will become the final
     * component of the FeatureGroup's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within the project and location.
     * </pre>
     *
     * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for featureGroupId.
     */
    public com.google.protobuf.ByteString getFeatureGroupIdBytes() {
      java.lang.Object ref = featureGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        featureGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this FeatureGroup, which will become the final
     * component of the FeatureGroup's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within the project and location.
     * </pre>
     *
     * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The featureGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureGroupId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      featureGroupId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this FeatureGroup, which will become the final
     * component of the FeatureGroup's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within the project and location.
     * </pre>
     *
     * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatureGroupId() {
      featureGroupId_ = getDefaultInstance().getFeatureGroupId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for this FeatureGroup, which will become the final
     * component of the FeatureGroup's resource name.
     *
     * This value may be up to 60 characters, and valid characters are
     * `[a-z0-9_]`. The first character cannot be a number.
     *
     * The value must be unique within the project and location.
     * </pre>
     *
     * <code>string feature_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for featureGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureGroupIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      featureGroupId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFeatureGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateFeatureGroupRequest>() {
        @java.lang.Override
        public CreateFeatureGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFeatureGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFeatureGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateFeatureGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
