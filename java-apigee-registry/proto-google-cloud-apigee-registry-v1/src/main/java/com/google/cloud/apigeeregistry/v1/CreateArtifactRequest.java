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
 * Request message for CreateArtifact.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateArtifactRequest}
 */
public final class CreateArtifactRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.CreateArtifactRequest)
    CreateArtifactRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateArtifactRequest.newBuilder() to construct.
  private CreateArtifactRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateArtifactRequest() {
    parent_ = "";
    artifactId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateArtifactRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateArtifactRequest(
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
              com.google.cloud.apigeeregistry.v1.Artifact.Builder subBuilder = null;
              if (artifact_ != null) {
                subBuilder = artifact_.toBuilder();
              }
              artifact_ =
                  input.readMessage(
                      com.google.cloud.apigeeregistry.v1.Artifact.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(artifact_);
                artifact_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              artifactId_ = s;
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
        .internal_static_google_cloud_apigeeregistry_v1_CreateArtifactRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_CreateArtifactRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.class,
            com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of artifacts.
   * Format: `{parent}`
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
   * Required. The parent, which owns this collection of artifacts.
   * Format: `{parent}`
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

  public static final int ARTIFACT_FIELD_NUMBER = 2;
  private com.google.cloud.apigeeregistry.v1.Artifact artifact_;
  /**
   *
   *
   * <pre>
   * Required. The artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the artifact field is set.
   */
  @java.lang.Override
  public boolean hasArtifact() {
    return artifact_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The artifact.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.Artifact getArtifact() {
    return artifact_ == null
        ? com.google.cloud.apigeeregistry.v1.Artifact.getDefaultInstance()
        : artifact_;
  }
  /**
   *
   *
   * <pre>
   * Required. The artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder getArtifactOrBuilder() {
    return getArtifact();
  }

  public static final int ARTIFACT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object artifactId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the artifact, which will become the final component of
   * the artifact's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The artifactId.
   */
  @java.lang.Override
  public java.lang.String getArtifactId() {
    java.lang.Object ref = artifactId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artifactId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the artifact, which will become the final component of
   * the artifact's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for artifactId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getArtifactIdBytes() {
    java.lang.Object ref = artifactId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      artifactId_ = b;
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
    if (artifact_ != null) {
      output.writeMessage(2, getArtifact());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, artifactId_);
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
    if (artifact_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getArtifact());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifactId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, artifactId_);
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.CreateArtifactRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.CreateArtifactRequest other =
        (com.google.cloud.apigeeregistry.v1.CreateArtifactRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasArtifact() != other.hasArtifact()) return false;
    if (hasArtifact()) {
      if (!getArtifact().equals(other.getArtifact())) return false;
    }
    if (!getArtifactId().equals(other.getArtifactId())) return false;
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
    if (hasArtifact()) {
      hash = (37 * hash) + ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getArtifact().hashCode();
    }
    hash = (37 * hash) + ARTIFACT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getArtifactId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parseFrom(
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
      com.google.cloud.apigeeregistry.v1.CreateArtifactRequest prototype) {
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
   * Request message for CreateArtifact.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateArtifactRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.CreateArtifactRequest)
      com.google.cloud.apigeeregistry.v1.CreateArtifactRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateArtifactRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateArtifactRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.class,
              com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.newBuilder()
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

      if (artifactBuilder_ == null) {
        artifact_ = null;
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }
      artifactId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_CreateArtifactRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateArtifactRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateArtifactRequest build() {
      com.google.cloud.apigeeregistry.v1.CreateArtifactRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateArtifactRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.CreateArtifactRequest result =
          new com.google.cloud.apigeeregistry.v1.CreateArtifactRequest(this);
      result.parent_ = parent_;
      if (artifactBuilder_ == null) {
        result.artifact_ = artifact_;
      } else {
        result.artifact_ = artifactBuilder_.build();
      }
      result.artifactId_ = artifactId_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.CreateArtifactRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.CreateArtifactRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.CreateArtifactRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.CreateArtifactRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasArtifact()) {
        mergeArtifact(other.getArtifact());
      }
      if (!other.getArtifactId().isEmpty()) {
        artifactId_ = other.artifactId_;
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
      com.google.cloud.apigeeregistry.v1.CreateArtifactRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.apigeeregistry.v1.CreateArtifactRequest) e.getUnfinishedMessage();
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
     * Required. The parent, which owns this collection of artifacts.
     * Format: `{parent}`
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
     * Required. The parent, which owns this collection of artifacts.
     * Format: `{parent}`
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
     * Required. The parent, which owns this collection of artifacts.
     * Format: `{parent}`
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
     * Required. The parent, which owns this collection of artifacts.
     * Format: `{parent}`
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
     * Required. The parent, which owns this collection of artifacts.
     * Format: `{parent}`
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

    private com.google.cloud.apigeeregistry.v1.Artifact artifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.Artifact,
            com.google.cloud.apigeeregistry.v1.Artifact.Builder,
            com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder>
        artifactBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the artifact field is set.
     */
    public boolean hasArtifact() {
      return artifactBuilder_ != null || artifact_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The artifact.
     */
    public com.google.cloud.apigeeregistry.v1.Artifact getArtifact() {
      if (artifactBuilder_ == null) {
        return artifact_ == null
            ? com.google.cloud.apigeeregistry.v1.Artifact.getDefaultInstance()
            : artifact_;
      } else {
        return artifactBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setArtifact(com.google.cloud.apigeeregistry.v1.Artifact value) {
      if (artifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artifact_ = value;
        onChanged();
      } else {
        artifactBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setArtifact(
        com.google.cloud.apigeeregistry.v1.Artifact.Builder builderForValue) {
      if (artifactBuilder_ == null) {
        artifact_ = builderForValue.build();
        onChanged();
      } else {
        artifactBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeArtifact(com.google.cloud.apigeeregistry.v1.Artifact value) {
      if (artifactBuilder_ == null) {
        if (artifact_ != null) {
          artifact_ =
              com.google.cloud.apigeeregistry.v1.Artifact.newBuilder(artifact_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          artifact_ = value;
        }
        onChanged();
      } else {
        artifactBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearArtifact() {
      if (artifactBuilder_ == null) {
        artifact_ = null;
        onChanged();
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.Artifact.Builder getArtifactBuilder() {

      onChanged();
      return getArtifactFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder getArtifactOrBuilder() {
      if (artifactBuilder_ != null) {
        return artifactBuilder_.getMessageOrBuilder();
      } else {
        return artifact_ == null
            ? com.google.cloud.apigeeregistry.v1.Artifact.getDefaultInstance()
            : artifact_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The artifact to create.
     * </pre>
     *
     * <code>
     * .google.cloud.apigeeregistry.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.Artifact,
            com.google.cloud.apigeeregistry.v1.Artifact.Builder,
            com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder>
        getArtifactFieldBuilder() {
      if (artifactBuilder_ == null) {
        artifactBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apigeeregistry.v1.Artifact,
                com.google.cloud.apigeeregistry.v1.Artifact.Builder,
                com.google.cloud.apigeeregistry.v1.ArtifactOrBuilder>(
                getArtifact(), getParentForChildren(), isClean());
        artifact_ = null;
      }
      return artifactBuilder_;
    }

    private java.lang.Object artifactId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the artifact, which will become the final component of
     * the artifact's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The artifactId.
     */
    public java.lang.String getArtifactId() {
      java.lang.Object ref = artifactId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifactId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the artifact, which will become the final component of
     * the artifact's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for artifactId.
     */
    public com.google.protobuf.ByteString getArtifactIdBytes() {
      java.lang.Object ref = artifactId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        artifactId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the artifact, which will become the final component of
     * the artifact's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The artifactId to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      artifactId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the artifact, which will become the final component of
     * the artifact's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearArtifactId() {

      artifactId_ = getDefaultInstance().getArtifactId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the artifact, which will become the final component of
     * the artifact's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string artifact_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for artifactId to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      artifactId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.CreateArtifactRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.CreateArtifactRequest)
  private static final com.google.cloud.apigeeregistry.v1.CreateArtifactRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.CreateArtifactRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.CreateArtifactRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateArtifactRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateArtifactRequest>() {
        @java.lang.Override
        public CreateArtifactRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateArtifactRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateArtifactRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateArtifactRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.CreateArtifactRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
