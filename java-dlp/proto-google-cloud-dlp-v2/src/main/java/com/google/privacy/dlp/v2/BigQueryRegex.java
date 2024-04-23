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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * A pattern to match against one or more tables, datasets, or projects that
 * contain BigQuery tables. At least one pattern must be specified.
 * Regular expressions use RE2
 * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
 * under the google/re2 repository on GitHub.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.BigQueryRegex}
 */
public final class BigQueryRegex extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.BigQueryRegex)
    BigQueryRegexOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryRegex.newBuilder() to construct.
  private BigQueryRegex(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryRegex() {
    projectIdRegex_ = "";
    datasetIdRegex_ = "";
    tableIdRegex_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryRegex();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_BigQueryRegex_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_BigQueryRegex_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.BigQueryRegex.class,
            com.google.privacy.dlp.v2.BigQueryRegex.Builder.class);
  }

  public static final int PROJECT_ID_REGEX_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectIdRegex_ = "";
  /**
   *
   *
   * <pre>
   * For organizations, if unset, will match all projects. Has no effect
   * for data profile configurations created within a project.
   * </pre>
   *
   * <code>string project_id_regex = 1;</code>
   *
   * @return The projectIdRegex.
   */
  @java.lang.Override
  public java.lang.String getProjectIdRegex() {
    java.lang.Object ref = projectIdRegex_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectIdRegex_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * For organizations, if unset, will match all projects. Has no effect
   * for data profile configurations created within a project.
   * </pre>
   *
   * <code>string project_id_regex = 1;</code>
   *
   * @return The bytes for projectIdRegex.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdRegexBytes() {
    java.lang.Object ref = projectIdRegex_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectIdRegex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_ID_REGEX_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object datasetIdRegex_ = "";
  /**
   *
   *
   * <pre>
   * If unset, this property matches all datasets.
   * </pre>
   *
   * <code>string dataset_id_regex = 2;</code>
   *
   * @return The datasetIdRegex.
   */
  @java.lang.Override
  public java.lang.String getDatasetIdRegex() {
    java.lang.Object ref = datasetIdRegex_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datasetIdRegex_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If unset, this property matches all datasets.
   * </pre>
   *
   * <code>string dataset_id_regex = 2;</code>
   *
   * @return The bytes for datasetIdRegex.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatasetIdRegexBytes() {
    java.lang.Object ref = datasetIdRegex_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      datasetIdRegex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_ID_REGEX_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tableIdRegex_ = "";
  /**
   *
   *
   * <pre>
   * If unset, this property matches all tables.
   * </pre>
   *
   * <code>string table_id_regex = 3;</code>
   *
   * @return The tableIdRegex.
   */
  @java.lang.Override
  public java.lang.String getTableIdRegex() {
    java.lang.Object ref = tableIdRegex_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableIdRegex_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If unset, this property matches all tables.
   * </pre>
   *
   * <code>string table_id_regex = 3;</code>
   *
   * @return The bytes for tableIdRegex.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTableIdRegexBytes() {
    java.lang.Object ref = tableIdRegex_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tableIdRegex_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectIdRegex_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectIdRegex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetIdRegex_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, datasetIdRegex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableIdRegex_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tableIdRegex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectIdRegex_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectIdRegex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetIdRegex_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, datasetIdRegex_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableIdRegex_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tableIdRegex_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.BigQueryRegex)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.BigQueryRegex other = (com.google.privacy.dlp.v2.BigQueryRegex) obj;

    if (!getProjectIdRegex().equals(other.getProjectIdRegex())) return false;
    if (!getDatasetIdRegex().equals(other.getDatasetIdRegex())) return false;
    if (!getTableIdRegex().equals(other.getTableIdRegex())) return false;
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
    hash = (37 * hash) + PROJECT_ID_REGEX_FIELD_NUMBER;
    hash = (53 * hash) + getProjectIdRegex().hashCode();
    hash = (37 * hash) + DATASET_ID_REGEX_FIELD_NUMBER;
    hash = (53 * hash) + getDatasetIdRegex().hashCode();
    hash = (37 * hash) + TABLE_ID_REGEX_FIELD_NUMBER;
    hash = (53 * hash) + getTableIdRegex().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.BigQueryRegex prototype) {
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
   * A pattern to match against one or more tables, datasets, or projects that
   * contain BigQuery tables. At least one pattern must be specified.
   * Regular expressions use RE2
   * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
   * under the google/re2 repository on GitHub.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.BigQueryRegex}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.BigQueryRegex)
      com.google.privacy.dlp.v2.BigQueryRegexOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_BigQueryRegex_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_BigQueryRegex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.BigQueryRegex.class,
              com.google.privacy.dlp.v2.BigQueryRegex.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.BigQueryRegex.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectIdRegex_ = "";
      datasetIdRegex_ = "";
      tableIdRegex_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_BigQueryRegex_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryRegex getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.BigQueryRegex.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryRegex build() {
      com.google.privacy.dlp.v2.BigQueryRegex result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryRegex buildPartial() {
      com.google.privacy.dlp.v2.BigQueryRegex result =
          new com.google.privacy.dlp.v2.BigQueryRegex(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.BigQueryRegex result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectIdRegex_ = projectIdRegex_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.datasetIdRegex_ = datasetIdRegex_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tableIdRegex_ = tableIdRegex_;
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
      if (other instanceof com.google.privacy.dlp.v2.BigQueryRegex) {
        return mergeFrom((com.google.privacy.dlp.v2.BigQueryRegex) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.BigQueryRegex other) {
      if (other == com.google.privacy.dlp.v2.BigQueryRegex.getDefaultInstance()) return this;
      if (!other.getProjectIdRegex().isEmpty()) {
        projectIdRegex_ = other.projectIdRegex_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDatasetIdRegex().isEmpty()) {
        datasetIdRegex_ = other.datasetIdRegex_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTableIdRegex().isEmpty()) {
        tableIdRegex_ = other.tableIdRegex_;
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
                projectIdRegex_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                datasetIdRegex_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                tableIdRegex_ = input.readStringRequireUtf8();
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

    private java.lang.Object projectIdRegex_ = "";
    /**
     *
     *
     * <pre>
     * For organizations, if unset, will match all projects. Has no effect
     * for data profile configurations created within a project.
     * </pre>
     *
     * <code>string project_id_regex = 1;</code>
     *
     * @return The projectIdRegex.
     */
    public java.lang.String getProjectIdRegex() {
      java.lang.Object ref = projectIdRegex_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectIdRegex_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For organizations, if unset, will match all projects. Has no effect
     * for data profile configurations created within a project.
     * </pre>
     *
     * <code>string project_id_regex = 1;</code>
     *
     * @return The bytes for projectIdRegex.
     */
    public com.google.protobuf.ByteString getProjectIdRegexBytes() {
      java.lang.Object ref = projectIdRegex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectIdRegex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For organizations, if unset, will match all projects. Has no effect
     * for data profile configurations created within a project.
     * </pre>
     *
     * <code>string project_id_regex = 1;</code>
     *
     * @param value The projectIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdRegex(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectIdRegex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For organizations, if unset, will match all projects. Has no effect
     * for data profile configurations created within a project.
     * </pre>
     *
     * <code>string project_id_regex = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectIdRegex() {
      projectIdRegex_ = getDefaultInstance().getProjectIdRegex();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For organizations, if unset, will match all projects. Has no effect
     * for data profile configurations created within a project.
     * </pre>
     *
     * <code>string project_id_regex = 1;</code>
     *
     * @param value The bytes for projectIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdRegexBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectIdRegex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object datasetIdRegex_ = "";
    /**
     *
     *
     * <pre>
     * If unset, this property matches all datasets.
     * </pre>
     *
     * <code>string dataset_id_regex = 2;</code>
     *
     * @return The datasetIdRegex.
     */
    public java.lang.String getDatasetIdRegex() {
      java.lang.Object ref = datasetIdRegex_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datasetIdRegex_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all datasets.
     * </pre>
     *
     * <code>string dataset_id_regex = 2;</code>
     *
     * @return The bytes for datasetIdRegex.
     */
    public com.google.protobuf.ByteString getDatasetIdRegexBytes() {
      java.lang.Object ref = datasetIdRegex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        datasetIdRegex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all datasets.
     * </pre>
     *
     * <code>string dataset_id_regex = 2;</code>
     *
     * @param value The datasetIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetIdRegex(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      datasetIdRegex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all datasets.
     * </pre>
     *
     * <code>string dataset_id_regex = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatasetIdRegex() {
      datasetIdRegex_ = getDefaultInstance().getDatasetIdRegex();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all datasets.
     * </pre>
     *
     * <code>string dataset_id_regex = 2;</code>
     *
     * @param value The bytes for datasetIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetIdRegexBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      datasetIdRegex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object tableIdRegex_ = "";
    /**
     *
     *
     * <pre>
     * If unset, this property matches all tables.
     * </pre>
     *
     * <code>string table_id_regex = 3;</code>
     *
     * @return The tableIdRegex.
     */
    public java.lang.String getTableIdRegex() {
      java.lang.Object ref = tableIdRegex_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableIdRegex_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all tables.
     * </pre>
     *
     * <code>string table_id_regex = 3;</code>
     *
     * @return The bytes for tableIdRegex.
     */
    public com.google.protobuf.ByteString getTableIdRegexBytes() {
      java.lang.Object ref = tableIdRegex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tableIdRegex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all tables.
     * </pre>
     *
     * <code>string table_id_regex = 3;</code>
     *
     * @param value The tableIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setTableIdRegex(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tableIdRegex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all tables.
     * </pre>
     *
     * <code>string table_id_regex = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTableIdRegex() {
      tableIdRegex_ = getDefaultInstance().getTableIdRegex();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If unset, this property matches all tables.
     * </pre>
     *
     * <code>string table_id_regex = 3;</code>
     *
     * @param value The bytes for tableIdRegex to set.
     * @return This builder for chaining.
     */
    public Builder setTableIdRegexBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tableIdRegex_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.BigQueryRegex)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.BigQueryRegex)
  private static final com.google.privacy.dlp.v2.BigQueryRegex DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.BigQueryRegex();
  }

  public static com.google.privacy.dlp.v2.BigQueryRegex getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryRegex> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryRegex>() {
        @java.lang.Override
        public BigQueryRegex parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryRegex> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryRegex> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryRegex getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
