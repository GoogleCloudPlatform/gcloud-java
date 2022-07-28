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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Row key for identifying a record in BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.BigQueryKey}
 */
public final class BigQueryKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.BigQueryKey)
    BigQueryKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryKey.newBuilder() to construct.
  private BigQueryKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryKey() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BigQueryKey(
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
              com.google.privacy.dlp.v2.BigQueryTable.Builder subBuilder = null;
              if (tableReference_ != null) {
                subBuilder = tableReference_.toBuilder();
              }
              tableReference_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.BigQueryTable.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tableReference_);
                tableReference_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              rowNumber_ = input.readInt64();
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
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_BigQueryKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_BigQueryKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.BigQueryKey.class,
            com.google.privacy.dlp.v2.BigQueryKey.Builder.class);
  }

  public static final int TABLE_REFERENCE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.BigQueryTable tableReference_;
  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   *
   * @return Whether the tableReference field is set.
   */
  @java.lang.Override
  public boolean hasTableReference() {
    return tableReference_ != null;
  }
  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   *
   * @return The tableReference.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTable getTableReference() {
    return tableReference_ == null
        ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance()
        : tableReference_;
  }
  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
    return getTableReference();
  }

  public static final int ROW_NUMBER_FIELD_NUMBER = 2;
  private long rowNumber_;
  /**
   *
   *
   * <pre>
   * Row number inferred at the time the table was scanned. This value is
   * nondeterministic, cannot be queried, and may be null for inspection
   * jobs. To locate findings within a table, specify
   * `inspect_job.storage_config.big_query_options.identifying_fields` in
   * `CreateDlpJobRequest`.
   * </pre>
   *
   * <code>int64 row_number = 2;</code>
   *
   * @return The rowNumber.
   */
  @java.lang.Override
  public long getRowNumber() {
    return rowNumber_;
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
    if (tableReference_ != null) {
      output.writeMessage(1, getTableReference());
    }
    if (rowNumber_ != 0L) {
      output.writeInt64(2, rowNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableReference_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTableReference());
    }
    if (rowNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, rowNumber_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.BigQueryKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.BigQueryKey other = (com.google.privacy.dlp.v2.BigQueryKey) obj;

    if (hasTableReference() != other.hasTableReference()) return false;
    if (hasTableReference()) {
      if (!getTableReference().equals(other.getTableReference())) return false;
    }
    if (getRowNumber() != other.getRowNumber()) return false;
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
    if (hasTableReference()) {
      hash = (37 * hash) + TABLE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getTableReference().hashCode();
    }
    hash = (37 * hash) + ROW_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getRowNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.BigQueryKey parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.BigQueryKey prototype) {
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
   * Row key for identifying a record in BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.BigQueryKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.BigQueryKey)
      com.google.privacy.dlp.v2.BigQueryKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_BigQueryKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_BigQueryKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.BigQueryKey.class,
              com.google.privacy.dlp.v2.BigQueryKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.BigQueryKey.newBuilder()
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
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }
      rowNumber_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_BigQueryKey_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryKey build() {
      com.google.privacy.dlp.v2.BigQueryKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryKey buildPartial() {
      com.google.privacy.dlp.v2.BigQueryKey result =
          new com.google.privacy.dlp.v2.BigQueryKey(this);
      if (tableReferenceBuilder_ == null) {
        result.tableReference_ = tableReference_;
      } else {
        result.tableReference_ = tableReferenceBuilder_.build();
      }
      result.rowNumber_ = rowNumber_;
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
      if (other instanceof com.google.privacy.dlp.v2.BigQueryKey) {
        return mergeFrom((com.google.privacy.dlp.v2.BigQueryKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.BigQueryKey other) {
      if (other == com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance()) return this;
      if (other.hasTableReference()) {
        mergeTableReference(other.getTableReference());
      }
      if (other.getRowNumber() != 0L) {
        setRowNumber(other.getRowNumber());
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
      com.google.privacy.dlp.v2.BigQueryKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.BigQueryKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.BigQueryTable tableReference_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryTable,
            com.google.privacy.dlp.v2.BigQueryTable.Builder,
            com.google.privacy.dlp.v2.BigQueryTableOrBuilder>
        tableReferenceBuilder_;
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     *
     * @return Whether the tableReference field is set.
     */
    public boolean hasTableReference() {
      return tableReferenceBuilder_ != null || tableReference_ != null;
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     *
     * @return The tableReference.
     */
    public com.google.privacy.dlp.v2.BigQueryTable getTableReference() {
      if (tableReferenceBuilder_ == null) {
        return tableReference_ == null
            ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance()
            : tableReference_;
      } else {
        return tableReferenceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableReference_ = value;
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(
        com.google.privacy.dlp.v2.BigQueryTable.Builder builderForValue) {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = builderForValue.build();
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public Builder mergeTableReference(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (tableReference_ != null) {
          tableReference_ =
              com.google.privacy.dlp.v2.BigQueryTable.newBuilder(tableReference_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tableReference_ = value;
        }
        onChanged();
      } else {
        tableReferenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public Builder clearTableReference() {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
        onChanged();
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryTable.Builder getTableReferenceBuilder() {

      onChanged();
      return getTableReferenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
      if (tableReferenceBuilder_ != null) {
        return tableReferenceBuilder_.getMessageOrBuilder();
      } else {
        return tableReference_ == null
            ? com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance()
            : tableReference_;
      }
    }
    /**
     *
     *
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryTable,
            com.google.privacy.dlp.v2.BigQueryTable.Builder,
            com.google.privacy.dlp.v2.BigQueryTableOrBuilder>
        getTableReferenceFieldBuilder() {
      if (tableReferenceBuilder_ == null) {
        tableReferenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.BigQueryTable,
                com.google.privacy.dlp.v2.BigQueryTable.Builder,
                com.google.privacy.dlp.v2.BigQueryTableOrBuilder>(
                getTableReference(), getParentForChildren(), isClean());
        tableReference_ = null;
      }
      return tableReferenceBuilder_;
    }

    private long rowNumber_;
    /**
     *
     *
     * <pre>
     * Row number inferred at the time the table was scanned. This value is
     * nondeterministic, cannot be queried, and may be null for inspection
     * jobs. To locate findings within a table, specify
     * `inspect_job.storage_config.big_query_options.identifying_fields` in
     * `CreateDlpJobRequest`.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     *
     * @return The rowNumber.
     */
    @java.lang.Override
    public long getRowNumber() {
      return rowNumber_;
    }
    /**
     *
     *
     * <pre>
     * Row number inferred at the time the table was scanned. This value is
     * nondeterministic, cannot be queried, and may be null for inspection
     * jobs. To locate findings within a table, specify
     * `inspect_job.storage_config.big_query_options.identifying_fields` in
     * `CreateDlpJobRequest`.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     *
     * @param value The rowNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRowNumber(long value) {

      rowNumber_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Row number inferred at the time the table was scanned. This value is
     * nondeterministic, cannot be queried, and may be null for inspection
     * jobs. To locate findings within a table, specify
     * `inspect_job.storage_config.big_query_options.identifying_fields` in
     * `CreateDlpJobRequest`.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRowNumber() {

      rowNumber_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.BigQueryKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.BigQueryKey)
  private static final com.google.privacy.dlp.v2.BigQueryKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.BigQueryKey();
  }

  public static com.google.privacy.dlp.v2.BigQueryKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryKey> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryKey>() {
        @java.lang.Override
        public BigQueryKey parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BigQueryKey(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BigQueryKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
