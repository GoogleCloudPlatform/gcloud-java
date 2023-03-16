// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for
 * [EntityTypes.BatchDeleteEntities][google.cloud.dialogflow.v2beta1.EntityTypes.BatchDeleteEntities].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest}
 */
public final class BatchDeleteEntitiesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)
    BatchDeleteEntitiesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchDeleteEntitiesRequest.newBuilder() to construct.
  private BatchDeleteEntitiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchDeleteEntitiesRequest() {
    parent_ = "";
    entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchDeleteEntitiesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.class, com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The name of the entity type to delete entries for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
   *   Type ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the entity type to delete entries for.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
   *   Type ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_VALUES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList entityValues_;
  /**
   * <pre>
   * Required. The reference `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the entityValues.
   */
  public com.google.protobuf.ProtocolStringList
      getEntityValuesList() {
    return entityValues_;
  }
  /**
   * <pre>
   * Required. The reference `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of entityValues.
   */
  public int getEntityValuesCount() {
    return entityValues_.size();
  }
  /**
   * <pre>
   * Required. The reference `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The entityValues at the given index.
   */
  public java.lang.String getEntityValues(int index) {
    return entityValues_.get(index);
  }
  /**
   * <pre>
   * Required. The reference `values` of the entities to delete. Note that
   * these are not fully-qualified names, i.e. they don't start with
   * `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entityValues at the given index.
   */
  public com.google.protobuf.ByteString
      getEntityValuesBytes(int index) {
    return entityValues_.getByteString(index);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < entityValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityValues_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < entityValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityValuesList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest other = (com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getEntityValuesList()
        .equals(other.getEntityValuesList())) return false;
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getEntityValuesCount() > 0) {
      hash = (37 * hash) + ENTITY_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityValuesList().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest prototype) {
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
   * The request message for
   * [EntityTypes.BatchDeleteEntities][google.cloud.dialogflow.v2beta1.EntityTypes.BatchDeleteEntities].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)
      com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.class, com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.newBuilder()
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
      parent_ = "";
      entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest build() {
      com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest result = new com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        entityValues_ = entityValues_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.entityValues_ = entityValues_;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.entityValues_.isEmpty()) {
        if (entityValues_.isEmpty()) {
          entityValues_ = other.entityValues_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEntityValuesIsMutable();
          entityValues_.addAll(other.entityValues_);
        }
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntityValuesIsMutable();
              entityValues_.add(s);
              break;
            } // case 18
            case 26: {
              languageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the entity type to delete entries for.
     * Supported formats:
     * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
     * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
     *   Type ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the entity type to delete entries for.
     * Supported formats:
     * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
     * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
     *   Type ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the entity type to delete entries for.
     * Supported formats:
     * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
     * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
     *   Type ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the entity type to delete entries for.
     * Supported formats:
     * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
     * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
     *   Type ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the entity type to delete entries for.
     * Supported formats:
     * - `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`
     * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/entityTypes/&lt;Entity
     *   Type ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEntityValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        entityValues_ = new com.google.protobuf.LazyStringArrayList(entityValues_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the entityValues.
     */
    public com.google.protobuf.ProtocolStringList
        getEntityValuesList() {
      return entityValues_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of entityValues.
     */
    public int getEntityValuesCount() {
      return entityValues_.size();
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The entityValues at the given index.
     */
    public java.lang.String getEntityValues(int index) {
      return entityValues_.get(index);
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entityValues at the given index.
     */
    public com.google.protobuf.ByteString
        getEntityValuesBytes(int index) {
      return entityValues_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The entityValues to set.
     * @return This builder for chaining.
     */
    public Builder setEntityValues(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityValuesIsMutable();
      entityValues_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The entityValues to add.
     * @return This builder for chaining.
     */
    public Builder addEntityValues(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityValuesIsMutable();
      entityValues_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The entityValues to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntityValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntityValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entityValues_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityValues() {
      entityValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The reference `values` of the entities to delete. Note that
     * these are not fully-qualified names, i.e. they don't start with
     * `projects/&lt;Project ID&gt;`.
     * </pre>
     *
     * <code>repeated string entity_values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the entityValues to add.
     * @return This builder for chaining.
     */
    public Builder addEntityValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntityValuesIsMutable();
      entityValues_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest)
  private static final com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteEntitiesRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchDeleteEntitiesRequest>() {
    @java.lang.Override
    public BatchDeleteEntitiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchDeleteEntitiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteEntitiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

