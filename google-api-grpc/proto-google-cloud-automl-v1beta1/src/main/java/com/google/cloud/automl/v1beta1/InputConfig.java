// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

/**
 * <pre>
 * Input configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.InputConfig}
 */
public  final class InputConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.InputConfig)
    InputConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputConfig.newBuilder() to construct.
  private InputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InputConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.cloud.automl.v1beta1.GcsSource.Builder subBuilder = null;
            if (sourceCase_ == 1) {
              subBuilder = ((com.google.cloud.automl.v1beta1.GcsSource) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.google.cloud.automl.v1beta1.GcsSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.cloud.automl.v1beta1.GcsSource) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 1;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1beta1.Io.internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.Io.internal_static_google_cloud_automl_v1beta1_InputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.InputConfig.class, com.google.cloud.automl.v1beta1.InputConfig.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite {
    GCS_SOURCE(1),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return GCS_SOURCE;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The GCS location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  public boolean hasGcsSource() {
    return sourceCase_ == 1;
  }
  /**
   * <pre>
   * The GCS location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.GcsSource getGcsSource() {
    if (sourceCase_ == 1) {
       return (com.google.cloud.automl.v1beta1.GcsSource) source_;
    }
    return com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
  }
  /**
   * <pre>
   * The GCS location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 1) {
       return (com.google.cloud.automl.v1beta1.GcsSource) source_;
    }
    return com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.automl.v1beta1.GcsSource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.automl.v1beta1.GcsSource) source_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.InputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.InputConfig other = (com.google.cloud.automl.v1beta1.InputConfig) obj;

    boolean result = true;
    result = result && getSourceCase().equals(
        other.getSourceCase());
    if (!result) return false;
    switch (sourceCase_) {
      case 1:
        result = result && getGcsSource()
            .equals(other.getGcsSource());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1beta1.InputConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.automl.v1beta1.InputConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Input configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.InputConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.InputConfig)
      com.google.cloud.automl.v1beta1.InputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1beta1.Io.internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.Io.internal_static_google_cloud_automl_v1beta1_InputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.InputConfig.class, com.google.cloud.automl.v1beta1.InputConfig.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.InputConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.Io.internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.InputConfig getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.InputConfig build() {
      com.google.cloud.automl.v1beta1.InputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.InputConfig buildPartial() {
      com.google.cloud.automl.v1beta1.InputConfig result = new com.google.cloud.automl.v1beta1.InputConfig(this);
      if (sourceCase_ == 1) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.InputConfig) {
        return mergeFrom((com.google.cloud.automl.v1beta1.InputConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.InputConfig other) {
      if (other == com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case GCS_SOURCE: {
          mergeGcsSource(other.getGcsSource());
          break;
        }
        case SOURCE_NOT_SET: {
          break;
        }
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
      com.google.cloud.automl.v1beta1.InputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.InputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.automl.v1beta1.GcsSource, com.google.cloud.automl.v1beta1.GcsSource.Builder, com.google.cloud.automl.v1beta1.GcsSourceOrBuilder> gcsSourceBuilder_;
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public boolean hasGcsSource() {
      return sourceCase_ == 1;
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.automl.v1beta1.GcsSource) source_;
        }
        return com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.automl.v1beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.automl.v1beta1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.automl.v1beta1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1 &&
            source_ != com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance()) {
          source_ = com.google.cloud.automl.v1beta1.GcsSource.newBuilder((com.google.cloud.automl.v1beta1.GcsSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsSourceBuilder_.mergeFrom(value);
        }
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 1) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.automl.v1beta1.GcsSource) source_;
        }
        return com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The GCS location for the input content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.automl.v1beta1.GcsSource, com.google.cloud.automl.v1beta1.GcsSource.Builder, com.google.cloud.automl.v1beta1.GcsSourceOrBuilder> 
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.automl.v1beta1.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.GcsSource, com.google.cloud.automl.v1beta1.GcsSource.Builder, com.google.cloud.automl.v1beta1.GcsSourceOrBuilder>(
                (com.google.cloud.automl.v1beta1.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();;
      return gcsSourceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.InputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.InputConfig)
  private static final com.google.cloud.automl.v1beta1.InputConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.InputConfig();
  }

  public static com.google.cloud.automl.v1beta1.InputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputConfig>
      PARSER = new com.google.protobuf.AbstractParser<InputConfig>() {
    @java.lang.Override
    public InputConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InputConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.InputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

