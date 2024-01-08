/*
 * Copyright 2023 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * What must take place for a profile to be updated and how
 * frequently it should occur.
 * New tables are scanned as quickly as possible depending on system
 * capacity.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DiscoveryGenerationCadence}
 */
public final class DiscoveryGenerationCadence extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DiscoveryGenerationCadence)
    DiscoveryGenerationCadenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiscoveryGenerationCadence.newBuilder() to construct.
  private DiscoveryGenerationCadence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoveryGenerationCadence() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoveryGenerationCadence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryGenerationCadence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryGenerationCadence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DiscoveryGenerationCadence.class,
            com.google.privacy.dlp.v2.DiscoveryGenerationCadence.Builder.class);
  }

  public static final int SCHEMA_MODIFIED_CADENCE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schemaModifiedCadence_;
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a schema is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;</code>
   *
   * @return Whether the schemaModifiedCadence field is set.
   */
  @java.lang.Override
  public boolean hasSchemaModifiedCadence() {
    return schemaModifiedCadence_ != null;
  }
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a schema is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;</code>
   *
   * @return The schemaModifiedCadence.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence getSchemaModifiedCadence() {
    return schemaModifiedCadence_ == null
        ? com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance()
        : schemaModifiedCadence_;
  }
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a schema is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder
      getSchemaModifiedCadenceOrBuilder() {
    return schemaModifiedCadence_ == null
        ? com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance()
        : schemaModifiedCadence_;
  }

  public static final int TABLE_MODIFIED_CADENCE_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence tableModifiedCadence_;
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a table is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
   *
   * @return Whether the tableModifiedCadence field is set.
   */
  @java.lang.Override
  public boolean hasTableModifiedCadence() {
    return tableModifiedCadence_ != null;
  }
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a table is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
   *
   * @return The tableModifiedCadence.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence getTableModifiedCadence() {
    return tableModifiedCadence_ == null
        ? com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.getDefaultInstance()
        : tableModifiedCadence_;
  }
  /**
   *
   *
   * <pre>
   * Governs when to update data profiles when a table is modified.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoveryTableModifiedCadenceOrBuilder
      getTableModifiedCadenceOrBuilder() {
    return tableModifiedCadence_ == null
        ? com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.getDefaultInstance()
        : tableModifiedCadence_;
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
    if (schemaModifiedCadence_ != null) {
      output.writeMessage(1, getSchemaModifiedCadence());
    }
    if (tableModifiedCadence_ != null) {
      output.writeMessage(2, getTableModifiedCadence());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schemaModifiedCadence_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSchemaModifiedCadence());
    }
    if (tableModifiedCadence_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTableModifiedCadence());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DiscoveryGenerationCadence)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DiscoveryGenerationCadence other =
        (com.google.privacy.dlp.v2.DiscoveryGenerationCadence) obj;

    if (hasSchemaModifiedCadence() != other.hasSchemaModifiedCadence()) return false;
    if (hasSchemaModifiedCadence()) {
      if (!getSchemaModifiedCadence().equals(other.getSchemaModifiedCadence())) return false;
    }
    if (hasTableModifiedCadence() != other.hasTableModifiedCadence()) return false;
    if (hasTableModifiedCadence()) {
      if (!getTableModifiedCadence().equals(other.getTableModifiedCadence())) return false;
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
    if (hasSchemaModifiedCadence()) {
      hash = (37 * hash) + SCHEMA_MODIFIED_CADENCE_FIELD_NUMBER;
      hash = (53 * hash) + getSchemaModifiedCadence().hashCode();
    }
    if (hasTableModifiedCadence()) {
      hash = (37 * hash) + TABLE_MODIFIED_CADENCE_FIELD_NUMBER;
      hash = (53 * hash) + getTableModifiedCadence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DiscoveryGenerationCadence prototype) {
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
   * What must take place for a profile to be updated and how
   * frequently it should occur.
   * New tables are scanned as quickly as possible depending on system
   * capacity.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DiscoveryGenerationCadence}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DiscoveryGenerationCadence)
      com.google.privacy.dlp.v2.DiscoveryGenerationCadenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryGenerationCadence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryGenerationCadence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DiscoveryGenerationCadence.class,
              com.google.privacy.dlp.v2.DiscoveryGenerationCadence.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DiscoveryGenerationCadence.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schemaModifiedCadence_ = null;
      if (schemaModifiedCadenceBuilder_ != null) {
        schemaModifiedCadenceBuilder_.dispose();
        schemaModifiedCadenceBuilder_ = null;
      }
      tableModifiedCadence_ = null;
      if (tableModifiedCadenceBuilder_ != null) {
        tableModifiedCadenceBuilder_.dispose();
        tableModifiedCadenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryGenerationCadence_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryGenerationCadence getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DiscoveryGenerationCadence.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryGenerationCadence build() {
      com.google.privacy.dlp.v2.DiscoveryGenerationCadence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryGenerationCadence buildPartial() {
      com.google.privacy.dlp.v2.DiscoveryGenerationCadence result =
          new com.google.privacy.dlp.v2.DiscoveryGenerationCadence(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DiscoveryGenerationCadence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schemaModifiedCadence_ =
            schemaModifiedCadenceBuilder_ == null
                ? schemaModifiedCadence_
                : schemaModifiedCadenceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tableModifiedCadence_ =
            tableModifiedCadenceBuilder_ == null
                ? tableModifiedCadence_
                : tableModifiedCadenceBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.DiscoveryGenerationCadence) {
        return mergeFrom((com.google.privacy.dlp.v2.DiscoveryGenerationCadence) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DiscoveryGenerationCadence other) {
      if (other == com.google.privacy.dlp.v2.DiscoveryGenerationCadence.getDefaultInstance())
        return this;
      if (other.hasSchemaModifiedCadence()) {
        mergeSchemaModifiedCadence(other.getSchemaModifiedCadence());
      }
      if (other.hasTableModifiedCadence()) {
        mergeTableModifiedCadence(other.getTableModifiedCadence());
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
                    getSchemaModifiedCadenceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getTableModifiedCadenceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schemaModifiedCadence_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence,
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder,
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder>
        schemaModifiedCadenceBuilder_;
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     *
     * @return Whether the schemaModifiedCadence field is set.
     */
    public boolean hasSchemaModifiedCadence() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     *
     * @return The schemaModifiedCadence.
     */
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence getSchemaModifiedCadence() {
      if (schemaModifiedCadenceBuilder_ == null) {
        return schemaModifiedCadence_ == null
            ? com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance()
            : schemaModifiedCadence_;
      } else {
        return schemaModifiedCadenceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public Builder setSchemaModifiedCadence(
        com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence value) {
      if (schemaModifiedCadenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schemaModifiedCadence_ = value;
      } else {
        schemaModifiedCadenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public Builder setSchemaModifiedCadence(
        com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder builderForValue) {
      if (schemaModifiedCadenceBuilder_ == null) {
        schemaModifiedCadence_ = builderForValue.build();
      } else {
        schemaModifiedCadenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public Builder mergeSchemaModifiedCadence(
        com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence value) {
      if (schemaModifiedCadenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && schemaModifiedCadence_ != null
            && schemaModifiedCadence_
                != com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance()) {
          getSchemaModifiedCadenceBuilder().mergeFrom(value);
        } else {
          schemaModifiedCadence_ = value;
        }
      } else {
        schemaModifiedCadenceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public Builder clearSchemaModifiedCadence() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schemaModifiedCadence_ = null;
      if (schemaModifiedCadenceBuilder_ != null) {
        schemaModifiedCadenceBuilder_.dispose();
        schemaModifiedCadenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder
        getSchemaModifiedCadenceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSchemaModifiedCadenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder
        getSchemaModifiedCadenceOrBuilder() {
      if (schemaModifiedCadenceBuilder_ != null) {
        return schemaModifiedCadenceBuilder_.getMessageOrBuilder();
      } else {
        return schemaModifiedCadence_ == null
            ? com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance()
            : schemaModifiedCadence_;
      }
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a schema is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence schema_modified_cadence = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence,
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder,
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder>
        getSchemaModifiedCadenceFieldBuilder() {
      if (schemaModifiedCadenceBuilder_ == null) {
        schemaModifiedCadenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence,
                com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder,
                com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder>(
                getSchemaModifiedCadence(), getParentForChildren(), isClean());
        schemaModifiedCadence_ = null;
      }
      return schemaModifiedCadenceBuilder_;
    }

    private com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence tableModifiedCadence_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence,
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.Builder,
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadenceOrBuilder>
        tableModifiedCadenceBuilder_;
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     *
     * @return Whether the tableModifiedCadence field is set.
     */
    public boolean hasTableModifiedCadence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     *
     * @return The tableModifiedCadence.
     */
    public com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence getTableModifiedCadence() {
      if (tableModifiedCadenceBuilder_ == null) {
        return tableModifiedCadence_ == null
            ? com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.getDefaultInstance()
            : tableModifiedCadence_;
      } else {
        return tableModifiedCadenceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public Builder setTableModifiedCadence(
        com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence value) {
      if (tableModifiedCadenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableModifiedCadence_ = value;
      } else {
        tableModifiedCadenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public Builder setTableModifiedCadence(
        com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.Builder builderForValue) {
      if (tableModifiedCadenceBuilder_ == null) {
        tableModifiedCadence_ = builderForValue.build();
      } else {
        tableModifiedCadenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public Builder mergeTableModifiedCadence(
        com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence value) {
      if (tableModifiedCadenceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && tableModifiedCadence_ != null
            && tableModifiedCadence_
                != com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.getDefaultInstance()) {
          getTableModifiedCadenceBuilder().mergeFrom(value);
        } else {
          tableModifiedCadence_ = value;
        }
      } else {
        tableModifiedCadenceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public Builder clearTableModifiedCadence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tableModifiedCadence_ = null;
      if (tableModifiedCadenceBuilder_ != null) {
        tableModifiedCadenceBuilder_.dispose();
        tableModifiedCadenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.Builder
        getTableModifiedCadenceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTableModifiedCadenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    public com.google.privacy.dlp.v2.DiscoveryTableModifiedCadenceOrBuilder
        getTableModifiedCadenceOrBuilder() {
      if (tableModifiedCadenceBuilder_ != null) {
        return tableModifiedCadenceBuilder_.getMessageOrBuilder();
      } else {
        return tableModifiedCadence_ == null
            ? com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.getDefaultInstance()
            : tableModifiedCadence_;
      }
    }
    /**
     *
     *
     * <pre>
     * Governs when to update data profiles when a table is modified.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DiscoveryTableModifiedCadence table_modified_cadence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence,
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.Builder,
            com.google.privacy.dlp.v2.DiscoveryTableModifiedCadenceOrBuilder>
        getTableModifiedCadenceFieldBuilder() {
      if (tableModifiedCadenceBuilder_ == null) {
        tableModifiedCadenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence,
                com.google.privacy.dlp.v2.DiscoveryTableModifiedCadence.Builder,
                com.google.privacy.dlp.v2.DiscoveryTableModifiedCadenceOrBuilder>(
                getTableModifiedCadence(), getParentForChildren(), isClean());
        tableModifiedCadence_ = null;
      }
      return tableModifiedCadenceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DiscoveryGenerationCadence)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DiscoveryGenerationCadence)
  private static final com.google.privacy.dlp.v2.DiscoveryGenerationCadence DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DiscoveryGenerationCadence();
  }

  public static com.google.privacy.dlp.v2.DiscoveryGenerationCadence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryGenerationCadence> PARSER =
      new com.google.protobuf.AbstractParser<DiscoveryGenerationCadence>() {
        @java.lang.Override
        public DiscoveryGenerationCadence parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiscoveryGenerationCadence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryGenerationCadence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoveryGenerationCadence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
