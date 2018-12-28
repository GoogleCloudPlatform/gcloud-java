// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/mutation_record.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Describes a change made to a configuration.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.MutationRecord}
 */
public final class MutationRecord extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.MutationRecord)
    MutationRecordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MutationRecord.newBuilder() to construct.
  private MutationRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MutationRecord() {
    mutatedBy_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MutationRecord(
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
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (mutateTime_ != null) {
                subBuilder = mutateTime_.toBuilder();
              }
              mutateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mutateTime_);
                mutateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mutatedBy_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MutationRecordProto
        .internal_static_google_monitoring_v3_MutationRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MutationRecordProto
        .internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.MutationRecord.class,
            com.google.monitoring.v3.MutationRecord.Builder.class);
  }

  public static final int MUTATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp mutateTime_;
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  public boolean hasMutateTime() {
    return mutateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  public com.google.protobuf.Timestamp getMutateTime() {
    return mutateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : mutateTime_;
  }
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder() {
    return getMutateTime();
  }

  public static final int MUTATED_BY_FIELD_NUMBER = 2;
  private volatile java.lang.Object mutatedBy_;
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   */
  public java.lang.String getMutatedBy() {
    java.lang.Object ref = mutatedBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mutatedBy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   */
  public com.google.protobuf.ByteString getMutatedByBytes() {
    java.lang.Object ref = mutatedBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mutatedBy_ = b;
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
    if (mutateTime_ != null) {
      output.writeMessage(1, getMutateTime());
    }
    if (!getMutatedByBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mutatedBy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mutateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMutateTime());
    }
    if (!getMutatedByBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mutatedBy_);
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
    if (!(obj instanceof com.google.monitoring.v3.MutationRecord)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.MutationRecord other = (com.google.monitoring.v3.MutationRecord) obj;

    boolean result = true;
    result = result && (hasMutateTime() == other.hasMutateTime());
    if (hasMutateTime()) {
      result = result && getMutateTime().equals(other.getMutateTime());
    }
    result = result && getMutatedBy().equals(other.getMutatedBy());
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
    if (hasMutateTime()) {
      hash = (37 * hash) + MUTATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMutateTime().hashCode();
    }
    hash = (37 * hash) + MUTATED_BY_FIELD_NUMBER;
    hash = (53 * hash) + getMutatedBy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.MutationRecord prototype) {
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
   * Describes a change made to a configuration.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.MutationRecord}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.MutationRecord)
      com.google.monitoring.v3.MutationRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.MutationRecord.class,
              com.google.monitoring.v3.MutationRecord.Builder.class);
    }

    // Construct using com.google.monitoring.v3.MutationRecord.newBuilder()
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
      if (mutateTimeBuilder_ == null) {
        mutateTime_ = null;
      } else {
        mutateTime_ = null;
        mutateTimeBuilder_ = null;
      }
      mutatedBy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord getDefaultInstanceForType() {
      return com.google.monitoring.v3.MutationRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord build() {
      com.google.monitoring.v3.MutationRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord buildPartial() {
      com.google.monitoring.v3.MutationRecord result =
          new com.google.monitoring.v3.MutationRecord(this);
      if (mutateTimeBuilder_ == null) {
        result.mutateTime_ = mutateTime_;
      } else {
        result.mutateTime_ = mutateTimeBuilder_.build();
      }
      result.mutatedBy_ = mutatedBy_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.MutationRecord) {
        return mergeFrom((com.google.monitoring.v3.MutationRecord) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.MutationRecord other) {
      if (other == com.google.monitoring.v3.MutationRecord.getDefaultInstance()) return this;
      if (other.hasMutateTime()) {
        mergeMutateTime(other.getMutateTime());
      }
      if (!other.getMutatedBy().isEmpty()) {
        mutatedBy_ = other.mutatedBy_;
        onChanged();
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
      com.google.monitoring.v3.MutationRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.MutationRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp mutateTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        mutateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public boolean hasMutateTime() {
      return mutateTimeBuilder_ != null || mutateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public com.google.protobuf.Timestamp getMutateTime() {
      if (mutateTimeBuilder_ == null) {
        return mutateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : mutateTime_;
      } else {
        return mutateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder setMutateTime(com.google.protobuf.Timestamp value) {
      if (mutateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mutateTime_ = value;
        onChanged();
      } else {
        mutateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder setMutateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (mutateTimeBuilder_ == null) {
        mutateTime_ = builderForValue.build();
        onChanged();
      } else {
        mutateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder mergeMutateTime(com.google.protobuf.Timestamp value) {
      if (mutateTimeBuilder_ == null) {
        if (mutateTime_ != null) {
          mutateTime_ =
              com.google.protobuf.Timestamp.newBuilder(mutateTime_).mergeFrom(value).buildPartial();
        } else {
          mutateTime_ = value;
        }
        onChanged();
      } else {
        mutateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder clearMutateTime() {
      if (mutateTimeBuilder_ == null) {
        mutateTime_ = null;
        onChanged();
      } else {
        mutateTime_ = null;
        mutateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMutateTimeBuilder() {

      onChanged();
      return getMutateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder() {
      if (mutateTimeBuilder_ != null) {
        return mutateTimeBuilder_.getMessageOrBuilder();
      } else {
        return mutateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : mutateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getMutateTimeFieldBuilder() {
      if (mutateTimeBuilder_ == null) {
        mutateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getMutateTime(), getParentForChildren(), isClean());
        mutateTime_ = null;
      }
      return mutateTimeBuilder_;
    }

    private java.lang.Object mutatedBy_ = "";
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     */
    public java.lang.String getMutatedBy() {
      java.lang.Object ref = mutatedBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mutatedBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     */
    public com.google.protobuf.ByteString getMutatedByBytes() {
      java.lang.Object ref = mutatedBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mutatedBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     */
    public Builder setMutatedBy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mutatedBy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     */
    public Builder clearMutatedBy() {

      mutatedBy_ = getDefaultInstance().getMutatedBy();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     */
    public Builder setMutatedByBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mutatedBy_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.MutationRecord)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.MutationRecord)
  private static final com.google.monitoring.v3.MutationRecord DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.MutationRecord();
  }

  public static com.google.monitoring.v3.MutationRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutationRecord> PARSER =
      new com.google.protobuf.AbstractParser<MutationRecord>() {
        @java.lang.Override
        public MutationRecord parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MutationRecord(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MutationRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutationRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.MutationRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
