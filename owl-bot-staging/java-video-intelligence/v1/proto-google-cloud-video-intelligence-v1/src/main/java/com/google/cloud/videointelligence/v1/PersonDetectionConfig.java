// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 * <pre>
 * Config for PERSON_DETECTION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.PersonDetectionConfig}
 */
public final class PersonDetectionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.PersonDetectionConfig)
    PersonDetectionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonDetectionConfig.newBuilder() to construct.
  private PersonDetectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonDetectionConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PersonDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonDetectionConfig(
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
          case 8: {

            includeBoundingBoxes_ = input.readBool();
            break;
          }
          case 16: {

            includePoseLandmarks_ = input.readBool();
            break;
          }
          case 24: {

            includeAttributes_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_PersonDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_PersonDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.PersonDetectionConfig.class, com.google.cloud.videointelligence.v1.PersonDetectionConfig.Builder.class);
  }

  public static final int INCLUDE_BOUNDING_BOXES_FIELD_NUMBER = 1;
  private boolean includeBoundingBoxes_;
  /**
   * <pre>
   * Whether bounding boxes are included in the person detection annotation
   * output.
   * </pre>
   *
   * <code>bool include_bounding_boxes = 1;</code>
   * @return The includeBoundingBoxes.
   */
  @java.lang.Override
  public boolean getIncludeBoundingBoxes() {
    return includeBoundingBoxes_;
  }

  public static final int INCLUDE_POSE_LANDMARKS_FIELD_NUMBER = 2;
  private boolean includePoseLandmarks_;
  /**
   * <pre>
   * Whether to enable pose landmarks detection. Ignored if
   * 'include_bounding_boxes' is set to false.
   * </pre>
   *
   * <code>bool include_pose_landmarks = 2;</code>
   * @return The includePoseLandmarks.
   */
  @java.lang.Override
  public boolean getIncludePoseLandmarks() {
    return includePoseLandmarks_;
  }

  public static final int INCLUDE_ATTRIBUTES_FIELD_NUMBER = 3;
  private boolean includeAttributes_;
  /**
   * <pre>
   * Whether to enable person attributes detection, such as cloth color (black,
   * blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair,
   * etc.
   * Ignored if 'include_bounding_boxes' is set to false.
   * </pre>
   *
   * <code>bool include_attributes = 3;</code>
   * @return The includeAttributes.
   */
  @java.lang.Override
  public boolean getIncludeAttributes() {
    return includeAttributes_;
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
    if (includeBoundingBoxes_ != false) {
      output.writeBool(1, includeBoundingBoxes_);
    }
    if (includePoseLandmarks_ != false) {
      output.writeBool(2, includePoseLandmarks_);
    }
    if (includeAttributes_ != false) {
      output.writeBool(3, includeAttributes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (includeBoundingBoxes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, includeBoundingBoxes_);
    }
    if (includePoseLandmarks_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includePoseLandmarks_);
    }
    if (includeAttributes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeAttributes_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.PersonDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.PersonDetectionConfig other = (com.google.cloud.videointelligence.v1.PersonDetectionConfig) obj;

    if (getIncludeBoundingBoxes()
        != other.getIncludeBoundingBoxes()) return false;
    if (getIncludePoseLandmarks()
        != other.getIncludePoseLandmarks()) return false;
    if (getIncludeAttributes()
        != other.getIncludeAttributes()) return false;
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
    hash = (37 * hash) + INCLUDE_BOUNDING_BOXES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeBoundingBoxes());
    hash = (37 * hash) + INCLUDE_POSE_LANDMARKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludePoseLandmarks());
    hash = (37 * hash) + INCLUDE_ATTRIBUTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeAttributes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1.PersonDetectionConfig prototype) {
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
   * Config for PERSON_DETECTION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.PersonDetectionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.PersonDetectionConfig)
      com.google.cloud.videointelligence.v1.PersonDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_PersonDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_PersonDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.PersonDetectionConfig.class, com.google.cloud.videointelligence.v1.PersonDetectionConfig.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.PersonDetectionConfig.newBuilder()
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
      includeBoundingBoxes_ = false;

      includePoseLandmarks_ = false;

      includeAttributes_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_PersonDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.PersonDetectionConfig getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.PersonDetectionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.PersonDetectionConfig build() {
      com.google.cloud.videointelligence.v1.PersonDetectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.PersonDetectionConfig buildPartial() {
      com.google.cloud.videointelligence.v1.PersonDetectionConfig result = new com.google.cloud.videointelligence.v1.PersonDetectionConfig(this);
      result.includeBoundingBoxes_ = includeBoundingBoxes_;
      result.includePoseLandmarks_ = includePoseLandmarks_;
      result.includeAttributes_ = includeAttributes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1.PersonDetectionConfig) {
        return mergeFrom((com.google.cloud.videointelligence.v1.PersonDetectionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.PersonDetectionConfig other) {
      if (other == com.google.cloud.videointelligence.v1.PersonDetectionConfig.getDefaultInstance()) return this;
      if (other.getIncludeBoundingBoxes() != false) {
        setIncludeBoundingBoxes(other.getIncludeBoundingBoxes());
      }
      if (other.getIncludePoseLandmarks() != false) {
        setIncludePoseLandmarks(other.getIncludePoseLandmarks());
      }
      if (other.getIncludeAttributes() != false) {
        setIncludeAttributes(other.getIncludeAttributes());
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
      com.google.cloud.videointelligence.v1.PersonDetectionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1.PersonDetectionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean includeBoundingBoxes_ ;
    /**
     * <pre>
     * Whether bounding boxes are included in the person detection annotation
     * output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 1;</code>
     * @return The includeBoundingBoxes.
     */
    @java.lang.Override
    public boolean getIncludeBoundingBoxes() {
      return includeBoundingBoxes_;
    }
    /**
     * <pre>
     * Whether bounding boxes are included in the person detection annotation
     * output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 1;</code>
     * @param value The includeBoundingBoxes to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeBoundingBoxes(boolean value) {
      
      includeBoundingBoxes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether bounding boxes are included in the person detection annotation
     * output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeBoundingBoxes() {
      
      includeBoundingBoxes_ = false;
      onChanged();
      return this;
    }

    private boolean includePoseLandmarks_ ;
    /**
     * <pre>
     * Whether to enable pose landmarks detection. Ignored if
     * 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_pose_landmarks = 2;</code>
     * @return The includePoseLandmarks.
     */
    @java.lang.Override
    public boolean getIncludePoseLandmarks() {
      return includePoseLandmarks_;
    }
    /**
     * <pre>
     * Whether to enable pose landmarks detection. Ignored if
     * 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_pose_landmarks = 2;</code>
     * @param value The includePoseLandmarks to set.
     * @return This builder for chaining.
     */
    public Builder setIncludePoseLandmarks(boolean value) {
      
      includePoseLandmarks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to enable pose landmarks detection. Ignored if
     * 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_pose_landmarks = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludePoseLandmarks() {
      
      includePoseLandmarks_ = false;
      onChanged();
      return this;
    }

    private boolean includeAttributes_ ;
    /**
     * <pre>
     * Whether to enable person attributes detection, such as cloth color (black,
     * blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair,
     * etc.
     * Ignored if 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_attributes = 3;</code>
     * @return The includeAttributes.
     */
    @java.lang.Override
    public boolean getIncludeAttributes() {
      return includeAttributes_;
    }
    /**
     * <pre>
     * Whether to enable person attributes detection, such as cloth color (black,
     * blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair,
     * etc.
     * Ignored if 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_attributes = 3;</code>
     * @param value The includeAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeAttributes(boolean value) {
      
      includeAttributes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to enable person attributes detection, such as cloth color (black,
     * blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair,
     * etc.
     * Ignored if 'include_bounding_boxes' is set to false.
     * </pre>
     *
     * <code>bool include_attributes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeAttributes() {
      
      includeAttributes_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.PersonDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.PersonDetectionConfig)
  private static final com.google.cloud.videointelligence.v1.PersonDetectionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.PersonDetectionConfig();
  }

  public static com.google.cloud.videointelligence.v1.PersonDetectionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonDetectionConfig>
      PARSER = new com.google.protobuf.AbstractParser<PersonDetectionConfig>() {
    @java.lang.Override
    public PersonDetectionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonDetectionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.PersonDetectionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

