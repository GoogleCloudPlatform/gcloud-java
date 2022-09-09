// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The data for an entity mention annotation.
 * This represents a mention of an `Entity` in the conversation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.EntityMentionData}
 */
public final class EntityMentionData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.EntityMentionData)
    EntityMentionDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityMentionData.newBuilder() to construct.
  private EntityMentionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityMentionData() {
    entityUniqueId_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityMentionData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityMentionData(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            entityUniqueId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            com.google.cloud.contactcenterinsights.v1.SentimentData.Builder subBuilder = null;
            if (sentiment_ != null) {
              subBuilder = sentiment_.toBuilder();
            }
            sentiment_ = input.readMessage(com.google.cloud.contactcenterinsights.v1.SentimentData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sentiment_);
              sentiment_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_EntityMentionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_EntityMentionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.EntityMentionData.class, com.google.cloud.contactcenterinsights.v1.EntityMentionData.Builder.class);
  }

  /**
   * <pre>
   * The supported types of mentions.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType}
   */
  public enum MentionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>MENTION_TYPE_UNSPECIFIED = 0;</code>
     */
    MENTION_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Proper noun.
     * </pre>
     *
     * <code>PROPER = 1;</code>
     */
    PROPER(1),
    /**
     * <pre>
     * Common noun (or noun compound).
     * </pre>
     *
     * <code>COMMON = 2;</code>
     */
    COMMON(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>MENTION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MENTION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Proper noun.
     * </pre>
     *
     * <code>PROPER = 1;</code>
     */
    public static final int PROPER_VALUE = 1;
    /**
     * <pre>
     * Common noun (or noun compound).
     * </pre>
     *
     * <code>COMMON = 2;</code>
     */
    public static final int COMMON_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MentionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MentionType forNumber(int value) {
      switch (value) {
        case 0: return MENTION_TYPE_UNSPECIFIED;
        case 1: return PROPER;
        case 2: return COMMON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MentionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MentionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MentionType>() {
            public MentionType findValueByNumber(int number) {
              return MentionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.EntityMentionData.getDescriptor().getEnumTypes().get(0);
    }

    private static final MentionType[] VALUES = values();

    public static MentionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MentionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType)
  }

  public static final int ENTITY_UNIQUE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityUniqueId_;
  /**
   * <pre>
   * The key of this entity in conversation entities.
   * Can be used to retrieve the exact `Entity` this mention is attached to.
   * </pre>
   *
   * <code>string entity_unique_id = 1;</code>
   * @return The entityUniqueId.
   */
  @java.lang.Override
  public java.lang.String getEntityUniqueId() {
    java.lang.Object ref = entityUniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityUniqueId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The key of this entity in conversation entities.
   * Can be used to retrieve the exact `Entity` this mention is attached to.
   * </pre>
   *
   * <code>string entity_unique_id = 1;</code>
   * @return The bytes for entityUniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityUniqueIdBytes() {
    java.lang.Object ref = entityUniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityUniqueId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType result = com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.valueOf(type_);
    return result == null ? com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.UNRECOGNIZED : result;
  }

  public static final int SENTIMENT_FIELD_NUMBER = 3;
  private com.google.cloud.contactcenterinsights.v1.SentimentData sentiment_;
  /**
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   * @return Whether the sentiment field is set.
   */
  @java.lang.Override
  public boolean hasSentiment() {
    return sentiment_ != null;
  }
  /**
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   * @return The sentiment.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.SentimentData getSentiment() {
    return sentiment_ == null ? com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentiment_;
  }
  /**
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentOrBuilder() {
    return getSentiment();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityUniqueId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityUniqueId_);
    }
    if (type_ != com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.MENTION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (sentiment_ != null) {
      output.writeMessage(3, getSentiment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityUniqueId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityUniqueId_);
    }
    if (type_ != com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.MENTION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (sentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSentiment());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.EntityMentionData)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.EntityMentionData other = (com.google.cloud.contactcenterinsights.v1.EntityMentionData) obj;

    if (!getEntityUniqueId()
        .equals(other.getEntityUniqueId())) return false;
    if (type_ != other.type_) return false;
    if (hasSentiment() != other.hasSentiment()) return false;
    if (hasSentiment()) {
      if (!getSentiment()
          .equals(other.getSentiment())) return false;
    }
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
    hash = (37 * hash) + ENTITY_UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityUniqueId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasSentiment()) {
      hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSentiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.EntityMentionData prototype) {
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
   * The data for an entity mention annotation.
   * This represents a mention of an `Entity` in the conversation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.EntityMentionData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.EntityMentionData)
      com.google.cloud.contactcenterinsights.v1.EntityMentionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_EntityMentionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_EntityMentionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.EntityMentionData.class, com.google.cloud.contactcenterinsights.v1.EntityMentionData.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.EntityMentionData.newBuilder()
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
      entityUniqueId_ = "";

      type_ = 0;

      if (sentimentBuilder_ == null) {
        sentiment_ = null;
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_EntityMentionData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.EntityMentionData getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.EntityMentionData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.EntityMentionData build() {
      com.google.cloud.contactcenterinsights.v1.EntityMentionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.EntityMentionData buildPartial() {
      com.google.cloud.contactcenterinsights.v1.EntityMentionData result = new com.google.cloud.contactcenterinsights.v1.EntityMentionData(this);
      result.entityUniqueId_ = entityUniqueId_;
      result.type_ = type_;
      if (sentimentBuilder_ == null) {
        result.sentiment_ = sentiment_;
      } else {
        result.sentiment_ = sentimentBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.EntityMentionData) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.EntityMentionData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.EntityMentionData other) {
      if (other == com.google.cloud.contactcenterinsights.v1.EntityMentionData.getDefaultInstance()) return this;
      if (!other.getEntityUniqueId().isEmpty()) {
        entityUniqueId_ = other.entityUniqueId_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasSentiment()) {
        mergeSentiment(other.getSentiment());
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
      com.google.cloud.contactcenterinsights.v1.EntityMentionData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.contactcenterinsights.v1.EntityMentionData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object entityUniqueId_ = "";
    /**
     * <pre>
     * The key of this entity in conversation entities.
     * Can be used to retrieve the exact `Entity` this mention is attached to.
     * </pre>
     *
     * <code>string entity_unique_id = 1;</code>
     * @return The entityUniqueId.
     */
    public java.lang.String getEntityUniqueId() {
      java.lang.Object ref = entityUniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityUniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The key of this entity in conversation entities.
     * Can be used to retrieve the exact `Entity` this mention is attached to.
     * </pre>
     *
     * <code>string entity_unique_id = 1;</code>
     * @return The bytes for entityUniqueId.
     */
    public com.google.protobuf.ByteString
        getEntityUniqueIdBytes() {
      java.lang.Object ref = entityUniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityUniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The key of this entity in conversation entities.
     * Can be used to retrieve the exact `Entity` this mention is attached to.
     * </pre>
     *
     * <code>string entity_unique_id = 1;</code>
     * @param value The entityUniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityUniqueId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityUniqueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of this entity in conversation entities.
     * Can be used to retrieve the exact `Entity` this mention is attached to.
     * </pre>
     *
     * <code>string entity_unique_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityUniqueId() {
      
      entityUniqueId_ = getDefaultInstance().getEntityUniqueId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of this entity in conversation entities.
     * Can be used to retrieve the exact `Entity` this mention is attached to.
     * </pre>
     *
     * <code>string entity_unique_id = 1;</code>
     * @param value The bytes for entityUniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityUniqueId_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType result = com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.valueOf(type_);
      return result == null ? com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity mention.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.SentimentData sentiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder> sentimentBuilder_;
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     * @return Whether the sentiment field is set.
     */
    public boolean hasSentiment() {
      return sentimentBuilder_ != null || sentiment_ != null;
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     * @return The sentiment.
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentData getSentiment() {
      if (sentimentBuilder_ == null) {
        return sentiment_ == null ? com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentiment_;
      } else {
        return sentimentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public Builder setSentiment(com.google.cloud.contactcenterinsights.v1.SentimentData value) {
      if (sentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentiment_ = value;
        onChanged();
      } else {
        sentimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public Builder setSentiment(
        com.google.cloud.contactcenterinsights.v1.SentimentData.Builder builderForValue) {
      if (sentimentBuilder_ == null) {
        sentiment_ = builderForValue.build();
        onChanged();
      } else {
        sentimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public Builder mergeSentiment(com.google.cloud.contactcenterinsights.v1.SentimentData value) {
      if (sentimentBuilder_ == null) {
        if (sentiment_ != null) {
          sentiment_ =
            com.google.cloud.contactcenterinsights.v1.SentimentData.newBuilder(sentiment_).mergeFrom(value).buildPartial();
        } else {
          sentiment_ = value;
        }
        onChanged();
      } else {
        sentimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public Builder clearSentiment() {
      if (sentimentBuilder_ == null) {
        sentiment_ = null;
        onChanged();
      } else {
        sentiment_ = null;
        sentimentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentData.Builder getSentimentBuilder() {
      
      onChanged();
      return getSentimentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentOrBuilder() {
      if (sentimentBuilder_ != null) {
        return sentimentBuilder_.getMessageOrBuilder();
      } else {
        return sentiment_ == null ?
            com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentiment_;
      }
    }
    /**
     * <pre>
     * Sentiment expressed for this mention of the entity.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder> 
        getSentimentFieldBuilder() {
      if (sentimentBuilder_ == null) {
        sentimentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder>(
                getSentiment(),
                getParentForChildren(),
                isClean());
        sentiment_ = null;
      }
      return sentimentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.EntityMentionData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.EntityMentionData)
  private static final com.google.cloud.contactcenterinsights.v1.EntityMentionData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.EntityMentionData();
  }

  public static com.google.cloud.contactcenterinsights.v1.EntityMentionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityMentionData>
      PARSER = new com.google.protobuf.AbstractParser<EntityMentionData>() {
    @java.lang.Override
    public EntityMentionData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityMentionData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityMentionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityMentionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.EntityMentionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

