// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * Specifies an atomic read/modify/write operation on the latest value of the
 * specified column.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.ReadModifyWriteRule}
 */
public final class ReadModifyWriteRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ReadModifyWriteRule)
    ReadModifyWriteRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadModifyWriteRule.newBuilder() to construct.
  private ReadModifyWriteRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadModifyWriteRule() {
    familyName_ = "";
    columnQualifier_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadModifyWriteRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReadModifyWriteRule(
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
              java.lang.String s = input.readStringRequireUtf8();

              familyName_ = s;
              break;
            }
          case 18:
            {
              columnQualifier_ = input.readBytes();
              break;
            }
          case 26:
            {
              ruleCase_ = 3;
              rule_ = input.readBytes();
              break;
            }
          case 32:
            {
              ruleCase_ = 4;
              rule_ = input.readInt64();
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
    return com.google.bigtable.v2.DataProto
        .internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto
        .internal_static_google_bigtable_v2_ReadModifyWriteRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ReadModifyWriteRule.class,
            com.google.bigtable.v2.ReadModifyWriteRule.Builder.class);
  }

  private int ruleCase_ = 0;
  private java.lang.Object rule_;

  public enum RuleCase implements com.google.protobuf.Internal.EnumLite {
    APPEND_VALUE(3),
    INCREMENT_AMOUNT(4),
    RULE_NOT_SET(0);
    private final int value;

    private RuleCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static RuleCase valueOf(int value) {
      return forNumber(value);
    }

    public static RuleCase forNumber(int value) {
      switch (value) {
        case 3:
          return APPEND_VALUE;
        case 4:
          return INCREMENT_AMOUNT;
        case 0:
          return RULE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public RuleCase getRuleCase() {
    return RuleCase.forNumber(ruleCase_);
  }

  public static final int FAMILY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object familyName_;
  /**
   *
   *
   * <pre>
   * The name of the family to which the read/modify/write should be applied.
   * Must match `[-_.a-zA-Z0-9]+`
   * </pre>
   *
   * <code>string family_name = 1;</code>
   */
  public java.lang.String getFamilyName() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      familyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the family to which the read/modify/write should be applied.
   * Must match `[-_.a-zA-Z0-9]+`
   * </pre>
   *
   * <code>string family_name = 1;</code>
   */
  public com.google.protobuf.ByteString getFamilyNameBytes() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      familyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_QUALIFIER_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString columnQualifier_;
  /**
   *
   *
   * <pre>
   * The qualifier of the column to which the read/modify/write should be
   * applied.
   * Can be any byte string, including the empty string.
   * </pre>
   *
   * <code>bytes column_qualifier = 2;</code>
   */
  public com.google.protobuf.ByteString getColumnQualifier() {
    return columnQualifier_;
  }

  public static final int APPEND_VALUE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Rule specifying that `append_value` be appended to the existing value.
   * If the targeted cell is unset, it will be treated as containing the
   * empty string.
   * </pre>
   *
   * <code>bytes append_value = 3;</code>
   */
  public com.google.protobuf.ByteString getAppendValue() {
    if (ruleCase_ == 3) {
      return (com.google.protobuf.ByteString) rule_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int INCREMENT_AMOUNT_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Rule specifying that `increment_amount` be added to the existing value.
   * If the targeted cell is unset, it will be treated as containing a zero.
   * Otherwise, the targeted cell must contain an 8-byte value (interpreted
   * as a 64-bit big-endian signed integer), or the entire request will fail.
   * </pre>
   *
   * <code>int64 increment_amount = 4;</code>
   */
  public long getIncrementAmount() {
    if (ruleCase_ == 4) {
      return (java.lang.Long) rule_;
    }
    return 0L;
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
    if (!getFamilyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, familyName_);
    }
    if (!columnQualifier_.isEmpty()) {
      output.writeBytes(2, columnQualifier_);
    }
    if (ruleCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) rule_);
    }
    if (ruleCase_ == 4) {
      output.writeInt64(4, (long) ((java.lang.Long) rule_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFamilyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, familyName_);
    }
    if (!columnQualifier_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, columnQualifier_);
    }
    if (ruleCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) rule_);
    }
    if (ruleCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              4, (long) ((java.lang.Long) rule_));
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
    if (!(obj instanceof com.google.bigtable.v2.ReadModifyWriteRule)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.ReadModifyWriteRule other =
        (com.google.bigtable.v2.ReadModifyWriteRule) obj;

    if (!getFamilyName().equals(other.getFamilyName())) return false;
    if (!getColumnQualifier().equals(other.getColumnQualifier())) return false;
    if (!getRuleCase().equals(other.getRuleCase())) return false;
    switch (ruleCase_) {
      case 3:
        if (!getAppendValue().equals(other.getAppendValue())) return false;
        break;
      case 4:
        if (getIncrementAmount() != other.getIncrementAmount()) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + FAMILY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFamilyName().hashCode();
    hash = (37 * hash) + COLUMN_QUALIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getColumnQualifier().hashCode();
    switch (ruleCase_) {
      case 3:
        hash = (37 * hash) + APPEND_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getAppendValue().hashCode();
        break;
      case 4:
        hash = (37 * hash) + INCREMENT_AMOUNT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIncrementAmount());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule parseFrom(
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

  public static Builder newBuilder(com.google.bigtable.v2.ReadModifyWriteRule prototype) {
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
   * Specifies an atomic read/modify/write operation on the latest value of the
   * specified column.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.ReadModifyWriteRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ReadModifyWriteRule)
      com.google.bigtable.v2.ReadModifyWriteRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ReadModifyWriteRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ReadModifyWriteRule.class,
              com.google.bigtable.v2.ReadModifyWriteRule.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ReadModifyWriteRule.newBuilder()
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
      familyName_ = "";

      columnQualifier_ = com.google.protobuf.ByteString.EMPTY;

      ruleCase_ = 0;
      rule_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ReadModifyWriteRule_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadModifyWriteRule getDefaultInstanceForType() {
      return com.google.bigtable.v2.ReadModifyWriteRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadModifyWriteRule build() {
      com.google.bigtable.v2.ReadModifyWriteRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ReadModifyWriteRule buildPartial() {
      com.google.bigtable.v2.ReadModifyWriteRule result =
          new com.google.bigtable.v2.ReadModifyWriteRule(this);
      result.familyName_ = familyName_;
      result.columnQualifier_ = columnQualifier_;
      if (ruleCase_ == 3) {
        result.rule_ = rule_;
      }
      if (ruleCase_ == 4) {
        result.rule_ = rule_;
      }
      result.ruleCase_ = ruleCase_;
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
      if (other instanceof com.google.bigtable.v2.ReadModifyWriteRule) {
        return mergeFrom((com.google.bigtable.v2.ReadModifyWriteRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ReadModifyWriteRule other) {
      if (other == com.google.bigtable.v2.ReadModifyWriteRule.getDefaultInstance()) return this;
      if (!other.getFamilyName().isEmpty()) {
        familyName_ = other.familyName_;
        onChanged();
      }
      if (other.getColumnQualifier() != com.google.protobuf.ByteString.EMPTY) {
        setColumnQualifier(other.getColumnQualifier());
      }
      switch (other.getRuleCase()) {
        case APPEND_VALUE:
          {
            setAppendValue(other.getAppendValue());
            break;
          }
        case INCREMENT_AMOUNT:
          {
            setIncrementAmount(other.getIncrementAmount());
            break;
          }
        case RULE_NOT_SET:
          {
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
      com.google.bigtable.v2.ReadModifyWriteRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.ReadModifyWriteRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ruleCase_ = 0;
    private java.lang.Object rule_;

    public RuleCase getRuleCase() {
      return RuleCase.forNumber(ruleCase_);
    }

    public Builder clearRule() {
      ruleCase_ = 0;
      rule_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object familyName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public java.lang.String getFamilyName() {
      java.lang.Object ref = familyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        familyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public com.google.protobuf.ByteString getFamilyNameBytes() {
      java.lang.Object ref = familyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        familyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public Builder setFamilyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      familyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public Builder clearFamilyName() {

      familyName_ = getDefaultInstance().getFamilyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public Builder setFamilyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      familyName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString columnQualifier_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public com.google.protobuf.ByteString getColumnQualifier() {
      return columnQualifier_;
    }
    /**
     *
     *
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public Builder setColumnQualifier(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      columnQualifier_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public Builder clearColumnQualifier() {

      columnQualifier_ = getDefaultInstance().getColumnQualifier();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Rule specifying that `append_value` be appended to the existing value.
     * If the targeted cell is unset, it will be treated as containing the
     * empty string.
     * </pre>
     *
     * <code>bytes append_value = 3;</code>
     */
    public com.google.protobuf.ByteString getAppendValue() {
      if (ruleCase_ == 3) {
        return (com.google.protobuf.ByteString) rule_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Rule specifying that `append_value` be appended to the existing value.
     * If the targeted cell is unset, it will be treated as containing the
     * empty string.
     * </pre>
     *
     * <code>bytes append_value = 3;</code>
     */
    public Builder setAppendValue(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ruleCase_ = 3;
      rule_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rule specifying that `append_value` be appended to the existing value.
     * If the targeted cell is unset, it will be treated as containing the
     * empty string.
     * </pre>
     *
     * <code>bytes append_value = 3;</code>
     */
    public Builder clearAppendValue() {
      if (ruleCase_ == 3) {
        ruleCase_ = 0;
        rule_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Rule specifying that `increment_amount` be added to the existing value.
     * If the targeted cell is unset, it will be treated as containing a zero.
     * Otherwise, the targeted cell must contain an 8-byte value (interpreted
     * as a 64-bit big-endian signed integer), or the entire request will fail.
     * </pre>
     *
     * <code>int64 increment_amount = 4;</code>
     */
    public long getIncrementAmount() {
      if (ruleCase_ == 4) {
        return (java.lang.Long) rule_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * Rule specifying that `increment_amount` be added to the existing value.
     * If the targeted cell is unset, it will be treated as containing a zero.
     * Otherwise, the targeted cell must contain an 8-byte value (interpreted
     * as a 64-bit big-endian signed integer), or the entire request will fail.
     * </pre>
     *
     * <code>int64 increment_amount = 4;</code>
     */
    public Builder setIncrementAmount(long value) {
      ruleCase_ = 4;
      rule_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Rule specifying that `increment_amount` be added to the existing value.
     * If the targeted cell is unset, it will be treated as containing a zero.
     * Otherwise, the targeted cell must contain an 8-byte value (interpreted
     * as a 64-bit big-endian signed integer), or the entire request will fail.
     * </pre>
     *
     * <code>int64 increment_amount = 4;</code>
     */
    public Builder clearIncrementAmount() {
      if (ruleCase_ == 4) {
        ruleCase_ = 0;
        rule_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ReadModifyWriteRule)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ReadModifyWriteRule)
  private static final com.google.bigtable.v2.ReadModifyWriteRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ReadModifyWriteRule();
  }

  public static com.google.bigtable.v2.ReadModifyWriteRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadModifyWriteRule> PARSER =
      new com.google.protobuf.AbstractParser<ReadModifyWriteRule>() {
        @java.lang.Override
        public ReadModifyWriteRule parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReadModifyWriteRule(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReadModifyWriteRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadModifyWriteRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.ReadModifyWriteRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
