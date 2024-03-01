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
// source: google/cloud/dialogflow/v2/document.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Metadata related to the Export Data Operations (e.g. ExportDocument).
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ExportOperationMetadata}
 */
public final class ExportOperationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ExportOperationMetadata)
    ExportOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportOperationMetadata.newBuilder() to construct.
  private ExportOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportOperationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportOperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.DocumentProto
        .internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.DocumentProto
        .internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ExportOperationMetadata.class,
            com.google.cloud.dialogflow.v2.ExportOperationMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int EXPORTED_GCS_DESTINATION_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.GcsDestination exportedGcsDestination_;
  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   *
   * @return Whether the exportedGcsDestination field is set.
   */
  @java.lang.Override
  public boolean hasExportedGcsDestination() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   *
   * @return The exportedGcsDestination.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.GcsDestination getExportedGcsDestination() {
    return exportedGcsDestination_ == null
        ? com.google.cloud.dialogflow.v2.GcsDestination.getDefaultInstance()
        : exportedGcsDestination_;
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder
      getExportedGcsDestinationOrBuilder() {
    return exportedGcsDestination_ == null
        ? com.google.cloud.dialogflow.v2.GcsDestination.getDefaultInstance()
        : exportedGcsDestination_;
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
      output.writeMessage(1, getExportedGcsDestination());
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
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getExportedGcsDestination());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ExportOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ExportOperationMetadata other =
        (com.google.cloud.dialogflow.v2.ExportOperationMetadata) obj;

    if (hasExportedGcsDestination() != other.hasExportedGcsDestination()) return false;
    if (hasExportedGcsDestination()) {
      if (!getExportedGcsDestination().equals(other.getExportedGcsDestination())) return false;
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
    if (hasExportedGcsDestination()) {
      hash = (37 * hash) + EXPORTED_GCS_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getExportedGcsDestination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata parseFrom(
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
      com.google.cloud.dialogflow.v2.ExportOperationMetadata prototype) {
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
   * Metadata related to the Export Data Operations (e.g. ExportDocument).
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ExportOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ExportOperationMetadata)
      com.google.cloud.dialogflow.v2.ExportOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ExportOperationMetadata.class,
              com.google.cloud.dialogflow.v2.ExportOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ExportOperationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExportedGcsDestinationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      exportedGcsDestination_ = null;
      if (exportedGcsDestinationBuilder_ != null) {
        exportedGcsDestinationBuilder_.dispose();
        exportedGcsDestinationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ExportOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ExportOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ExportOperationMetadata build() {
      com.google.cloud.dialogflow.v2.ExportOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ExportOperationMetadata buildPartial() {
      com.google.cloud.dialogflow.v2.ExportOperationMetadata result =
          new com.google.cloud.dialogflow.v2.ExportOperationMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.ExportOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exportedGcsDestination_ =
            exportedGcsDestinationBuilder_ == null
                ? exportedGcsDestination_
                : exportedGcsDestinationBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ExportOperationMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ExportOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ExportOperationMetadata other) {
      if (other == com.google.cloud.dialogflow.v2.ExportOperationMetadata.getDefaultInstance())
        return this;
      if (other.hasExportedGcsDestination()) {
        mergeExportedGcsDestination(other.getExportedGcsDestination());
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
                    getExportedGcsDestinationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.dialogflow.v2.GcsDestination exportedGcsDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.GcsDestination,
            com.google.cloud.dialogflow.v2.GcsDestination.Builder,
            com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder>
        exportedGcsDestinationBuilder_;
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     *
     * @return Whether the exportedGcsDestination field is set.
     */
    public boolean hasExportedGcsDestination() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     *
     * @return The exportedGcsDestination.
     */
    public com.google.cloud.dialogflow.v2.GcsDestination getExportedGcsDestination() {
      if (exportedGcsDestinationBuilder_ == null) {
        return exportedGcsDestination_ == null
            ? com.google.cloud.dialogflow.v2.GcsDestination.getDefaultInstance()
            : exportedGcsDestination_;
      } else {
        return exportedGcsDestinationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public Builder setExportedGcsDestination(com.google.cloud.dialogflow.v2.GcsDestination value) {
      if (exportedGcsDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exportedGcsDestination_ = value;
      } else {
        exportedGcsDestinationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public Builder setExportedGcsDestination(
        com.google.cloud.dialogflow.v2.GcsDestination.Builder builderForValue) {
      if (exportedGcsDestinationBuilder_ == null) {
        exportedGcsDestination_ = builderForValue.build();
      } else {
        exportedGcsDestinationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public Builder mergeExportedGcsDestination(
        com.google.cloud.dialogflow.v2.GcsDestination value) {
      if (exportedGcsDestinationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && exportedGcsDestination_ != null
            && exportedGcsDestination_
                != com.google.cloud.dialogflow.v2.GcsDestination.getDefaultInstance()) {
          getExportedGcsDestinationBuilder().mergeFrom(value);
        } else {
          exportedGcsDestination_ = value;
        }
      } else {
        exportedGcsDestinationBuilder_.mergeFrom(value);
      }
      if (exportedGcsDestination_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public Builder clearExportedGcsDestination() {
      bitField0_ = (bitField0_ & ~0x00000001);
      exportedGcsDestination_ = null;
      if (exportedGcsDestinationBuilder_ != null) {
        exportedGcsDestinationBuilder_.dispose();
        exportedGcsDestinationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.GcsDestination.Builder
        getExportedGcsDestinationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExportedGcsDestinationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder
        getExportedGcsDestinationOrBuilder() {
      if (exportedGcsDestinationBuilder_ != null) {
        return exportedGcsDestinationBuilder_.getMessageOrBuilder();
      } else {
        return exportedGcsDestination_ == null
            ? com.google.cloud.dialogflow.v2.GcsDestination.getDefaultInstance()
            : exportedGcsDestination_;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage file path of the exported data.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.GcsDestination,
            com.google.cloud.dialogflow.v2.GcsDestination.Builder,
            com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder>
        getExportedGcsDestinationFieldBuilder() {
      if (exportedGcsDestinationBuilder_ == null) {
        exportedGcsDestinationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.GcsDestination,
                com.google.cloud.dialogflow.v2.GcsDestination.Builder,
                com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder>(
                getExportedGcsDestination(), getParentForChildren(), isClean());
        exportedGcsDestination_ = null;
      }
      return exportedGcsDestinationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ExportOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ExportOperationMetadata)
  private static final com.google.cloud.dialogflow.v2.ExportOperationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ExportOperationMetadata();
  }

  public static com.google.cloud.dialogflow.v2.ExportOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportOperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ExportOperationMetadata>() {
        @java.lang.Override
        public ExportOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ExportOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
