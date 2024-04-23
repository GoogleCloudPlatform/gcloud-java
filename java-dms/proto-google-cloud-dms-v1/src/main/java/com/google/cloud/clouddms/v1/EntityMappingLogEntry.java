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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * A single record of a rule which was used for a mapping.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.EntityMappingLogEntry}
 */
public final class EntityMappingLogEntry extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.EntityMappingLogEntry)
    EntityMappingLogEntryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EntityMappingLogEntry.newBuilder() to construct.
  private EntityMappingLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EntityMappingLogEntry() {
    ruleId_ = "";
    ruleRevisionId_ = "";
    mappingComment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EntityMappingLogEntry();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_EntityMappingLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_EntityMappingLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.EntityMappingLogEntry.class,
            com.google.cloud.clouddms.v1.EntityMappingLogEntry.Builder.class);
  }

  public static final int RULE_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleId_ = "";
  /**
   *
   *
   * <pre>
   * Which rule caused this log entry.
   * </pre>
   *
   * <code>string rule_id = 1;</code>
   *
   * @return The ruleId.
   */
  @java.lang.Override
  public java.lang.String getRuleId() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Which rule caused this log entry.
   * </pre>
   *
   * <code>string rule_id = 1;</code>
   *
   * @return The bytes for ruleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRuleIdBytes() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ruleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_REVISION_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleRevisionId_ = "";
  /**
   *
   *
   * <pre>
   * Rule revision ID.
   * </pre>
   *
   * <code>string rule_revision_id = 2;</code>
   *
   * @return The ruleRevisionId.
   */
  @java.lang.Override
  public java.lang.String getRuleRevisionId() {
    java.lang.Object ref = ruleRevisionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleRevisionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Rule revision ID.
   * </pre>
   *
   * <code>string rule_revision_id = 2;</code>
   *
   * @return The bytes for ruleRevisionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRuleRevisionIdBytes() {
    java.lang.Object ref = ruleRevisionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ruleRevisionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAPPING_COMMENT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object mappingComment_ = "";
  /**
   *
   *
   * <pre>
   * Comment.
   * </pre>
   *
   * <code>string mapping_comment = 3;</code>
   *
   * @return The mappingComment.
   */
  @java.lang.Override
  public java.lang.String getMappingComment() {
    java.lang.Object ref = mappingComment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mappingComment_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Comment.
   * </pre>
   *
   * <code>string mapping_comment = 3;</code>
   *
   * @return The bytes for mappingComment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMappingCommentBytes() {
    java.lang.Object ref = mappingComment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mappingComment_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleRevisionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleRevisionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingComment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mappingComment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleRevisionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleRevisionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mappingComment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mappingComment_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.EntityMappingLogEntry)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.EntityMappingLogEntry other =
        (com.google.cloud.clouddms.v1.EntityMappingLogEntry) obj;

    if (!getRuleId().equals(other.getRuleId())) return false;
    if (!getRuleRevisionId().equals(other.getRuleRevisionId())) return false;
    if (!getMappingComment().equals(other.getMappingComment())) return false;
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
    hash = (37 * hash) + RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleId().hashCode();
    hash = (37 * hash) + RULE_REVISION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleRevisionId().hashCode();
    hash = (37 * hash) + MAPPING_COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getMappingComment().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.EntityMappingLogEntry prototype) {
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
   * A single record of a rule which was used for a mapping.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.EntityMappingLogEntry}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.EntityMappingLogEntry)
      com.google.cloud.clouddms.v1.EntityMappingLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_EntityMappingLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_EntityMappingLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.EntityMappingLogEntry.class,
              com.google.cloud.clouddms.v1.EntityMappingLogEntry.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.EntityMappingLogEntry.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ruleId_ = "";
      ruleRevisionId_ = "";
      mappingComment_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_EntityMappingLogEntry_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.EntityMappingLogEntry getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.EntityMappingLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.EntityMappingLogEntry build() {
      com.google.cloud.clouddms.v1.EntityMappingLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.EntityMappingLogEntry buildPartial() {
      com.google.cloud.clouddms.v1.EntityMappingLogEntry result =
          new com.google.cloud.clouddms.v1.EntityMappingLogEntry(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.EntityMappingLogEntry result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruleId_ = ruleId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ruleRevisionId_ = ruleRevisionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mappingComment_ = mappingComment_;
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
      if (other instanceof com.google.cloud.clouddms.v1.EntityMappingLogEntry) {
        return mergeFrom((com.google.cloud.clouddms.v1.EntityMappingLogEntry) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.EntityMappingLogEntry other) {
      if (other == com.google.cloud.clouddms.v1.EntityMappingLogEntry.getDefaultInstance())
        return this;
      if (!other.getRuleId().isEmpty()) {
        ruleId_ = other.ruleId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRuleRevisionId().isEmpty()) {
        ruleRevisionId_ = other.ruleRevisionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMappingComment().isEmpty()) {
        mappingComment_ = other.mappingComment_;
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
                ruleId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ruleRevisionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                mappingComment_ = input.readStringRequireUtf8();
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

    private java.lang.Object ruleId_ = "";
    /**
     *
     *
     * <pre>
     * Which rule caused this log entry.
     * </pre>
     *
     * <code>string rule_id = 1;</code>
     *
     * @return The ruleId.
     */
    public java.lang.String getRuleId() {
      java.lang.Object ref = ruleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Which rule caused this log entry.
     * </pre>
     *
     * <code>string rule_id = 1;</code>
     *
     * @return The bytes for ruleId.
     */
    public com.google.protobuf.ByteString getRuleIdBytes() {
      java.lang.Object ref = ruleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ruleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Which rule caused this log entry.
     * </pre>
     *
     * <code>string rule_id = 1;</code>
     *
     * @param value The ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ruleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which rule caused this log entry.
     * </pre>
     *
     * <code>string rule_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRuleId() {
      ruleId_ = getDefaultInstance().getRuleId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which rule caused this log entry.
     * </pre>
     *
     * <code>string rule_id = 1;</code>
     *
     * @param value The bytes for ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ruleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ruleRevisionId_ = "";
    /**
     *
     *
     * <pre>
     * Rule revision ID.
     * </pre>
     *
     * <code>string rule_revision_id = 2;</code>
     *
     * @return The ruleRevisionId.
     */
    public java.lang.String getRuleRevisionId() {
      java.lang.Object ref = ruleRevisionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleRevisionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Rule revision ID.
     * </pre>
     *
     * <code>string rule_revision_id = 2;</code>
     *
     * @return The bytes for ruleRevisionId.
     */
    public com.google.protobuf.ByteString getRuleRevisionIdBytes() {
      java.lang.Object ref = ruleRevisionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ruleRevisionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Rule revision ID.
     * </pre>
     *
     * <code>string rule_revision_id = 2;</code>
     *
     * @param value The ruleRevisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleRevisionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ruleRevisionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rule revision ID.
     * </pre>
     *
     * <code>string rule_revision_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRuleRevisionId() {
      ruleRevisionId_ = getDefaultInstance().getRuleRevisionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rule revision ID.
     * </pre>
     *
     * <code>string rule_revision_id = 2;</code>
     *
     * @param value The bytes for ruleRevisionId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleRevisionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ruleRevisionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object mappingComment_ = "";
    /**
     *
     *
     * <pre>
     * Comment.
     * </pre>
     *
     * <code>string mapping_comment = 3;</code>
     *
     * @return The mappingComment.
     */
    public java.lang.String getMappingComment() {
      java.lang.Object ref = mappingComment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mappingComment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Comment.
     * </pre>
     *
     * <code>string mapping_comment = 3;</code>
     *
     * @return The bytes for mappingComment.
     */
    public com.google.protobuf.ByteString getMappingCommentBytes() {
      java.lang.Object ref = mappingComment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mappingComment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Comment.
     * </pre>
     *
     * <code>string mapping_comment = 3;</code>
     *
     * @param value The mappingComment to set.
     * @return This builder for chaining.
     */
    public Builder setMappingComment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      mappingComment_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Comment.
     * </pre>
     *
     * <code>string mapping_comment = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMappingComment() {
      mappingComment_ = getDefaultInstance().getMappingComment();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Comment.
     * </pre>
     *
     * <code>string mapping_comment = 3;</code>
     *
     * @param value The bytes for mappingComment to set.
     * @return This builder for chaining.
     */
    public Builder setMappingCommentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      mappingComment_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.EntityMappingLogEntry)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.EntityMappingLogEntry)
  private static final com.google.cloud.clouddms.v1.EntityMappingLogEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.EntityMappingLogEntry();
  }

  public static com.google.cloud.clouddms.v1.EntityMappingLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityMappingLogEntry> PARSER =
      new com.google.protobuf.AbstractParser<EntityMappingLogEntry>() {
        @java.lang.Override
        public EntityMappingLogEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntityMappingLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityMappingLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.EntityMappingLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
