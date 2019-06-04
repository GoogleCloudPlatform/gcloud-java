// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Input only.
 * Outcome Notes Filter.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter}
 */
public final class ApplicationOutcomeNotesFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
    ApplicationOutcomeNotesFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplicationOutcomeNotesFilter.newBuilder() to construct.
  private ApplicationOutcomeNotesFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplicationOutcomeNotesFilter() {
    outcomeNotes_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ApplicationOutcomeNotesFilter(
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
              java.lang.String s = input.readStringRequireUtf8();

              outcomeNotes_ = s;
              break;
            }
          case 16:
            {
              negated_ = input.readBool();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.class,
            com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.Builder.class);
  }

  public static final int OUTCOME_NOTES_FIELD_NUMBER = 1;
  private volatile java.lang.Object outcomeNotes_;
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected outcome reason. The API does an exact match on the
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
   * in profiles.
   * </pre>
   *
   * <code>string outcome_notes = 1;</code>
   */
  public java.lang.String getOutcomeNotes() {
    java.lang.Object ref = outcomeNotes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outcomeNotes_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected outcome reason. The API does an exact match on the
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
   * in profiles.
   * </pre>
   *
   * <code>string outcome_notes = 1;</code>
   */
  public com.google.protobuf.ByteString getOutcomeNotesBytes() {
    java.lang.Object ref = outcomeNotes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      outcomeNotes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEGATED_FIELD_NUMBER = 2;
  private boolean negated_;
  /**
   *
   *
   * <pre>
   * Optional.
   * If true, The API excludes all candidates with any
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
   * matching the outcome reason specified in the filter.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  public boolean getNegated() {
    return negated_;
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
    if (!getOutcomeNotesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outcomeNotes_);
    }
    if (negated_ != false) {
      output.writeBool(2, negated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOutcomeNotesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outcomeNotes_);
    }
    if (negated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, negated_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter other =
        (com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter) obj;

    if (!getOutcomeNotes().equals(other.getOutcomeNotes())) return false;
    if (getNegated() != other.getNegated()) return false;
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
    hash = (37 * hash) + OUTCOME_NOTES_FIELD_NUMBER;
    hash = (53 * hash) + getOutcomeNotes().hashCode();
    hash = (37 * hash) + NEGATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNegated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parseFrom(
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
      com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter prototype) {
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
   * Input only.
   * Outcome Notes Filter.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
      com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.class,
              com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.newBuilder()
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
      outcomeNotes_ = "";

      negated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationOutcomeNotesFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter
        getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter build() {
      com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter buildPartial() {
      com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter result =
          new com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter(this);
      result.outcomeNotes_ = outcomeNotes_;
      result.negated_ = negated_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter other) {
      if (other
          == com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter.getDefaultInstance())
        return this;
      if (!other.getOutcomeNotes().isEmpty()) {
        outcomeNotes_ = other.outcomeNotes_;
        onChanged();
      }
      if (other.getNegated() != false) {
        setNegated(other.getNegated());
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
      com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outcomeNotes_ = "";
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected outcome reason. The API does an exact match on the
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * in profiles.
     * </pre>
     *
     * <code>string outcome_notes = 1;</code>
     */
    public java.lang.String getOutcomeNotes() {
      java.lang.Object ref = outcomeNotes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outcomeNotes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected outcome reason. The API does an exact match on the
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * in profiles.
     * </pre>
     *
     * <code>string outcome_notes = 1;</code>
     */
    public com.google.protobuf.ByteString getOutcomeNotesBytes() {
      java.lang.Object ref = outcomeNotes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        outcomeNotes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected outcome reason. The API does an exact match on the
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * in profiles.
     * </pre>
     *
     * <code>string outcome_notes = 1;</code>
     */
    public Builder setOutcomeNotes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      outcomeNotes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected outcome reason. The API does an exact match on the
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * in profiles.
     * </pre>
     *
     * <code>string outcome_notes = 1;</code>
     */
    public Builder clearOutcomeNotes() {

      outcomeNotes_ = getDefaultInstance().getOutcomeNotes();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected outcome reason. The API does an exact match on the
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * in profiles.
     * </pre>
     *
     * <code>string outcome_notes = 1;</code>
     */
    public Builder setOutcomeNotesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      outcomeNotes_ = value;
      onChanged();
      return this;
    }

    private boolean negated_;
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * matching the outcome reason specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public boolean getNegated() {
      return negated_;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * matching the outcome reason specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public Builder setNegated(boolean value) {

      negated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes]
     * matching the outcome reason specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public Builder clearNegated() {

      negated_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
  private static final com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter();
  }

  public static com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationOutcomeNotesFilter> PARSER =
      new com.google.protobuf.AbstractParser<ApplicationOutcomeNotesFilter>() {
        @java.lang.Override
        public ApplicationOutcomeNotesFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApplicationOutcomeNotesFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ApplicationOutcomeNotesFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationOutcomeNotesFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
