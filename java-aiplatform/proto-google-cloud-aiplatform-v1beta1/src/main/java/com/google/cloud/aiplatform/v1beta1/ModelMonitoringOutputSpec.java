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
// source: google/cloud/aiplatform/v1beta1/model_monitoring_spec.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Specification for the export destination of monitoring results, including
 * metrics, logs, etc.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec}
 */
public final class ModelMonitoringOutputSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec)
    ModelMonitoringOutputSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModelMonitoringOutputSpec.newBuilder() to construct.
  private ModelMonitoringOutputSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModelMonitoringOutputSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModelMonitoringOutputSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.class,
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.Builder.class);
  }

  private int bitField0_;
  public static final int GCS_BASE_DIRECTORY_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.GcsDestination gcsBaseDirectory_;
  /**
   *
   *
   * <pre>
   * Google Cloud Storage base folder path for metrics, error logs, etc.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
   *
   * @return Whether the gcsBaseDirectory field is set.
   */
  @java.lang.Override
  public boolean hasGcsBaseDirectory() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage base folder path for metrics, error logs, etc.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
   *
   * @return The gcsBaseDirectory.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsDestination getGcsBaseDirectory() {
    return gcsBaseDirectory_ == null
        ? com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()
        : gcsBaseDirectory_;
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage base folder path for metrics, error logs, etc.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder
      getGcsBaseDirectoryOrBuilder() {
    return gcsBaseDirectory_ == null
        ? com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()
        : gcsBaseDirectory_;
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
      output.writeMessage(1, getGcsBaseDirectory());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsBaseDirectory());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec other =
        (com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec) obj;

    if (hasGcsBaseDirectory() != other.hasGcsBaseDirectory()) return false;
    if (hasGcsBaseDirectory()) {
      if (!getGcsBaseDirectory().equals(other.getGcsBaseDirectory())) return false;
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
    if (hasGcsBaseDirectory()) {
      hash = (37 * hash) + GCS_BASE_DIRECTORY_FIELD_NUMBER;
      hash = (53 * hash) + getGcsBaseDirectory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec prototype) {
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
   * Specification for the export destination of monitoring results, including
   * metrics, logs, etc.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec)
      com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.class,
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getGcsBaseDirectoryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcsBaseDirectory_ = null;
      if (gcsBaseDirectoryBuilder_ != null) {
        gcsBaseDirectoryBuilder_.dispose();
        gcsBaseDirectoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelMonitoringSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringOutputSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec build() {
      com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec result =
          new com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsBaseDirectory_ =
            gcsBaseDirectoryBuilder_ == null ? gcsBaseDirectory_ : gcsBaseDirectoryBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec.getDefaultInstance())
        return this;
      if (other.hasGcsBaseDirectory()) {
        mergeGcsBaseDirectory(other.getGcsBaseDirectory());
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
                    getGcsBaseDirectoryFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.aiplatform.v1beta1.GcsDestination gcsBaseDirectory_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GcsDestination,
            com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder,
            com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder>
        gcsBaseDirectoryBuilder_;
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     *
     * @return Whether the gcsBaseDirectory field is set.
     */
    public boolean hasGcsBaseDirectory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     *
     * @return The gcsBaseDirectory.
     */
    public com.google.cloud.aiplatform.v1beta1.GcsDestination getGcsBaseDirectory() {
      if (gcsBaseDirectoryBuilder_ == null) {
        return gcsBaseDirectory_ == null
            ? com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()
            : gcsBaseDirectory_;
      } else {
        return gcsBaseDirectoryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public Builder setGcsBaseDirectory(com.google.cloud.aiplatform.v1beta1.GcsDestination value) {
      if (gcsBaseDirectoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsBaseDirectory_ = value;
      } else {
        gcsBaseDirectoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public Builder setGcsBaseDirectory(
        com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder builderForValue) {
      if (gcsBaseDirectoryBuilder_ == null) {
        gcsBaseDirectory_ = builderForValue.build();
      } else {
        gcsBaseDirectoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public Builder mergeGcsBaseDirectory(com.google.cloud.aiplatform.v1beta1.GcsDestination value) {
      if (gcsBaseDirectoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && gcsBaseDirectory_ != null
            && gcsBaseDirectory_
                != com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()) {
          getGcsBaseDirectoryBuilder().mergeFrom(value);
        } else {
          gcsBaseDirectory_ = value;
        }
      } else {
        gcsBaseDirectoryBuilder_.mergeFrom(value);
      }
      if (gcsBaseDirectory_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public Builder clearGcsBaseDirectory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gcsBaseDirectory_ = null;
      if (gcsBaseDirectoryBuilder_ != null) {
        gcsBaseDirectoryBuilder_.dispose();
        gcsBaseDirectoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder getGcsBaseDirectoryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGcsBaseDirectoryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder
        getGcsBaseDirectoryOrBuilder() {
      if (gcsBaseDirectoryBuilder_ != null) {
        return gcsBaseDirectoryBuilder_.getMessageOrBuilder();
      } else {
        return gcsBaseDirectory_ == null
            ? com.google.cloud.aiplatform.v1beta1.GcsDestination.getDefaultInstance()
            : gcsBaseDirectory_;
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage base folder path for metrics, error logs, etc.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.GcsDestination gcs_base_directory = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.GcsDestination,
            com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder,
            com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder>
        getGcsBaseDirectoryFieldBuilder() {
      if (gcsBaseDirectoryBuilder_ == null) {
        gcsBaseDirectoryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.GcsDestination,
                com.google.cloud.aiplatform.v1beta1.GcsDestination.Builder,
                com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder>(
                getGcsBaseDirectory(), getParentForChildren(), isClean());
        gcsBaseDirectory_ = null;
      }
      return gcsBaseDirectoryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec)
  private static final com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelMonitoringOutputSpec> PARSER =
      new com.google.protobuf.AbstractParser<ModelMonitoringOutputSpec>() {
        @java.lang.Override
        public ModelMonitoringOutputSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelMonitoringOutputSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelMonitoringOutputSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelMonitoringOutputSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
