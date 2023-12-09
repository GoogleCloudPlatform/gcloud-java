// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

/**
 * <pre>
 * Prediction output format for Image and Text Classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult}
 */
public final class ClassificationPredictionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)
    ClassificationPredictionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClassificationPredictionResult.newBuilder() to construct.
  private ClassificationPredictionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClassificationPredictionResult() {
    ids_ = emptyLongList();
    displayNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    confidences_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClassificationPredictionResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.class, com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList ids_;
  /**
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   * @return A list containing the ids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * The resource IDs of the AnnotationSpecs that had been identified.
   * </pre>
   *
   * <code>repeated int64 ids = 1;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public long getIds(int index) {
    return ids_.getLong(index);
  }
  private int idsMemoizedSerializedSize = -1;

  public static final int DISPLAY_NAMES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList displayNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The display names of the AnnotationSpecs that had been identified, order
   * matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   * @return A list containing the displayNames.
   */
  public com.google.protobuf.ProtocolStringList
      getDisplayNamesList() {
    return displayNames_;
  }
  /**
   * <pre>
   * The display names of the AnnotationSpecs that had been identified, order
   * matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   * @return The count of displayNames.
   */
  public int getDisplayNamesCount() {
    return displayNames_.size();
  }
  /**
   * <pre>
   * The display names of the AnnotationSpecs that had been identified, order
   * matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   * @param index The index of the element to return.
   * @return The displayNames at the given index.
   */
  public java.lang.String getDisplayNames(int index) {
    return displayNames_.get(index);
  }
  /**
   * <pre>
   * The display names of the AnnotationSpecs that had been identified, order
   * matches the IDs.
   * </pre>
   *
   * <code>repeated string display_names = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the displayNames at the given index.
   */
  public com.google.protobuf.ByteString
      getDisplayNamesBytes(int index) {
    return displayNames_.getByteString(index);
  }

  public static final int CONFIDENCES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList confidences_;
  /**
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher value
   * means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 3;</code>
   * @return A list containing the confidences.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getConfidencesList() {
    return confidences_;
  }
  /**
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher value
   * means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 3;</code>
   * @return The count of confidences.
   */
  public int getConfidencesCount() {
    return confidences_.size();
  }
  /**
   * <pre>
   * The Model's confidences in correctness of the predicted IDs, higher value
   * means higher confidence. Order matches the Ids.
   * </pre>
   *
   * <code>repeated float confidences = 3;</code>
   * @param index The index of the element to return.
   * @return The confidences at the given index.
   */
  public float getConfidences(int index) {
    return confidences_.getFloat(index);
  }
  private int confidencesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idsMemoizedSerializedSize);
    }
    for (int i = 0; i < ids_.size(); i++) {
      output.writeInt64NoTag(ids_.getLong(i));
    }
    for (int i = 0; i < displayNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayNames_.getRaw(i));
    }
    if (getConfidencesList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(confidencesMemoizedSerializedSize);
    }
    for (int i = 0; i < confidences_.size(); i++) {
      output.writeFloatNoTag(confidences_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(ids_.getLong(i));
      }
      size += dataSize;
      if (!getIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idsMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < displayNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(displayNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDisplayNamesList().size();
    }
    {
      int dataSize = 0;
      dataSize = 4 * getConfidencesList().size();
      size += dataSize;
      if (!getConfidencesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      confidencesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult other = (com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult) obj;

    if (!getIdsList()
        .equals(other.getIdsList())) return false;
    if (!getDisplayNamesList()
        .equals(other.getDisplayNamesList())) return false;
    if (!getConfidencesList()
        .equals(other.getConfidencesList())) return false;
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    if (getDisplayNamesCount() > 0) {
      hash = (37 * hash) + DISPLAY_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayNamesList().hashCode();
    }
    if (getConfidencesCount() > 0) {
      hash = (37 * hash) + CONFIDENCES_FIELD_NUMBER;
      hash = (53 * hash) + getConfidencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult prototype) {
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
   * Prediction output format for Image and Text Classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)
      com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.class, com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ids_ = emptyLongList();
      displayNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      confidences_ = emptyFloatList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResultProto.internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult build() {
      com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult buildPartial() {
      com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult result = new com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        ids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
      if (((bitField0_ & 0x00000004) != 0)) {
        confidences_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.confidences_ = confidences_;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        displayNames_.makeImmutable();
        result.displayNames_ = displayNames_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult other) {
      if (other == com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
      }
      if (!other.displayNames_.isEmpty()) {
        if (displayNames_.isEmpty()) {
          displayNames_ = other.displayNames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDisplayNamesIsMutable();
          displayNames_.addAll(other.displayNames_);
        }
        onChanged();
      }
      if (!other.confidences_.isEmpty()) {
        if (confidences_.isEmpty()) {
          confidences_ = other.confidences_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureConfidencesIsMutable();
          confidences_.addAll(other.confidences_);
        }
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
            case 8: {
              long v = input.readInt64();
              ensureIdsIsMutable();
              ids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                ids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDisplayNamesIsMutable();
              displayNames_.add(s);
              break;
            } // case 18
            case 29: {
              float v = input.readFloat();
              ensureConfidencesIsMutable();
              confidences_.addFloat(v);
              break;
            } // case 29
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureConfidencesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                confidences_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 26
            default: {
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

    private com.google.protobuf.Internal.LongList ids_ = emptyLongList();
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ids_ = mutableCopy(ids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @return A list containing the ids.
     */
    public java.util.List<java.lang.Long>
        getIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ids_) : ids_;
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public long getIds(int index) {
      return ids_.getLong(index);
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, long value) {

      ensureIdsIsMutable();
      ids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(long value) {

      ensureIdsIsMutable();
      ids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource IDs of the AnnotationSpecs that had been identified.
     * </pre>
     *
     * <code>repeated int64 ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList displayNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDisplayNamesIsMutable() {
      if (!displayNames_.isModifiable()) {
        displayNames_ = new com.google.protobuf.LazyStringArrayList(displayNames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @return A list containing the displayNames.
     */
    public com.google.protobuf.ProtocolStringList
        getDisplayNamesList() {
      displayNames_.makeImmutable();
      return displayNames_;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @return The count of displayNames.
     */
    public int getDisplayNamesCount() {
      return displayNames_.size();
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param index The index of the element to return.
     * @return The displayNames at the given index.
     */
    public java.lang.String getDisplayNames(int index) {
      return displayNames_.get(index);
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the displayNames at the given index.
     */
    public com.google.protobuf.ByteString
        getDisplayNamesBytes(int index) {
      return displayNames_.getByteString(index);
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param index The index to set the value at.
     * @param value The displayNames to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDisplayNamesIsMutable();
      displayNames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param value The displayNames to add.
     * @return This builder for chaining.
     */
    public Builder addDisplayNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDisplayNamesIsMutable();
      displayNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param values The displayNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllDisplayNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureDisplayNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, displayNames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayNames() {
      displayNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The display names of the AnnotationSpecs that had been identified, order
     * matches the IDs.
     * </pre>
     *
     * <code>repeated string display_names = 2;</code>
     * @param value The bytes of the displayNames to add.
     * @return This builder for chaining.
     */
    public Builder addDisplayNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDisplayNamesIsMutable();
      displayNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList confidences_ = emptyFloatList();
    private void ensureConfidencesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        confidences_ = mutableCopy(confidences_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @return A list containing the confidences.
     */
    public java.util.List<java.lang.Float>
        getConfidencesList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(confidences_) : confidences_;
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @return The count of confidences.
     */
    public int getConfidencesCount() {
      return confidences_.size();
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @param index The index of the element to return.
     * @return The confidences at the given index.
     */
    public float getConfidences(int index) {
      return confidences_.getFloat(index);
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @param index The index to set the value at.
     * @param value The confidences to set.
     * @return This builder for chaining.
     */
    public Builder setConfidences(
        int index, float value) {

      ensureConfidencesIsMutable();
      confidences_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @param value The confidences to add.
     * @return This builder for chaining.
     */
    public Builder addConfidences(float value) {

      ensureConfidencesIsMutable();
      confidences_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @param values The confidences to add.
     * @return This builder for chaining.
     */
    public Builder addAllConfidences(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureConfidencesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, confidences_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Model's confidences in correctness of the predicted IDs, higher value
     * means higher confidence. Order matches the Ids.
     * </pre>
     *
     * <code>repeated float confidences = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidences() {
      confidences_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult)
  private static final com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult();
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassificationPredictionResult>
      PARSER = new com.google.protobuf.AbstractParser<ClassificationPredictionResult>() {
    @java.lang.Override
    public ClassificationPredictionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClassificationPredictionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassificationPredictionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.predict.prediction.ClassificationPredictionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

