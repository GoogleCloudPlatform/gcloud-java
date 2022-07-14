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
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Create metadata partition request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreatePartitionRequest}
 */
public final class CreatePartitionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreatePartitionRequest)
    CreatePartitionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePartitionRequest.newBuilder() to construct.
  private CreatePartitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePartitionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePartitionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreatePartitionRequest(
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
          case 26:
            {
              com.google.cloud.dataplex.v1.Partition.Builder subBuilder = null;
              if (partition_ != null) {
                subBuilder = partition_.toBuilder();
              }
              partition_ =
                  input.readMessage(
                      com.google.cloud.dataplex.v1.Partition.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(partition_);
                partition_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              validateOnly_ = input.readBool();
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
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreatePartitionRequest.class,
            com.google.cloud.dataplex.v1.CreatePartitionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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

  public static final int PARTITION_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.Partition partition_;
  /**
   *
   *
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the partition field is set.
   */
  @java.lang.Override
  public boolean hasPartition() {
    return partition_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The partition.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Partition getPartition() {
    return partition_ == null
        ? com.google.cloud.dataplex.v1.Partition.getDefaultInstance()
        : partition_;
  }
  /**
   *
   *
   * <pre>
   * Required. Partition resource.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.PartitionOrBuilder getPartitionOrBuilder() {
    return getPartition();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
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
    if (partition_ != null) {
      output.writeMessage(3, getPartition());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
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
    if (partition_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPartition());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreatePartitionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreatePartitionRequest other =
        (com.google.cloud.dataplex.v1.CreatePartitionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPartition() != other.hasPartition()) return false;
    if (hasPartition()) {
      if (!getPartition().equals(other.getPartition())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasPartition()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreatePartitionRequest prototype) {
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
   * Create metadata partition request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreatePartitionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreatePartitionRequest)
      com.google.cloud.dataplex.v1.CreatePartitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreatePartitionRequest.class,
              com.google.cloud.dataplex.v1.CreatePartitionRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreatePartitionRequest.newBuilder()
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

      if (partitionBuilder_ == null) {
        partition_ = null;
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_CreatePartitionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreatePartitionRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreatePartitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreatePartitionRequest build() {
      com.google.cloud.dataplex.v1.CreatePartitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreatePartitionRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreatePartitionRequest result =
          new com.google.cloud.dataplex.v1.CreatePartitionRequest(this);
      result.parent_ = parent_;
      if (partitionBuilder_ == null) {
        result.partition_ = partition_;
      } else {
        result.partition_ = partitionBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreatePartitionRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreatePartitionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreatePartitionRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreatePartitionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasPartition()) {
        mergePartition(other.getPartition());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.cloud.dataplex.v1.CreatePartitionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataplex.v1.CreatePartitionRequest) e.getUnfinishedMessage();
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
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
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

    private com.google.cloud.dataplex.v1.Partition partition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Partition,
            com.google.cloud.dataplex.v1.Partition.Builder,
            com.google.cloud.dataplex.v1.PartitionOrBuilder>
        partitionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the partition field is set.
     */
    public boolean hasPartition() {
      return partitionBuilder_ != null || partition_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The partition.
     */
    public com.google.cloud.dataplex.v1.Partition getPartition() {
      if (partitionBuilder_ == null) {
        return partition_ == null
            ? com.google.cloud.dataplex.v1.Partition.getDefaultInstance()
            : partition_;
      } else {
        return partitionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPartition(com.google.cloud.dataplex.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partition_ = value;
        onChanged();
      } else {
        partitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPartition(com.google.cloud.dataplex.v1.Partition.Builder builderForValue) {
      if (partitionBuilder_ == null) {
        partition_ = builderForValue.build();
        onChanged();
      } else {
        partitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePartition(com.google.cloud.dataplex.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (partition_ != null) {
          partition_ =
              com.google.cloud.dataplex.v1.Partition.newBuilder(partition_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          partition_ = value;
        }
        onChanged();
      } else {
        partitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPartition() {
      if (partitionBuilder_ == null) {
        partition_ = null;
        onChanged();
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.Partition.Builder getPartitionBuilder() {

      onChanged();
      return getPartitionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataplex.v1.PartitionOrBuilder getPartitionOrBuilder() {
      if (partitionBuilder_ != null) {
        return partitionBuilder_.getMessageOrBuilder();
      } else {
        return partition_ == null
            ? com.google.cloud.dataplex.v1.Partition.getDefaultInstance()
            : partition_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Partition resource.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.Partition partition = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Partition,
            com.google.cloud.dataplex.v1.Partition.Builder,
            com.google.cloud.dataplex.v1.PartitionOrBuilder>
        getPartitionFieldBuilder() {
      if (partitionBuilder_ == null) {
        partitionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataplex.v1.Partition,
                com.google.cloud.dataplex.v1.Partition.Builder,
                com.google.cloud.dataplex.v1.PartitionOrBuilder>(
                getPartition(), getParentForChildren(), isClean());
        partition_ = null;
      }
      return partitionBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
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
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreatePartitionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreatePartitionRequest)
  private static final com.google.cloud.dataplex.v1.CreatePartitionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreatePartitionRequest();
  }

  public static com.google.cloud.dataplex.v1.CreatePartitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePartitionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePartitionRequest>() {
        @java.lang.Override
        public CreatePartitionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreatePartitionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreatePartitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePartitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreatePartitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
