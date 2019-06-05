// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/ranges.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * A range between two double numbers.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.DoubleRange}
 */
public final class DoubleRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.DoubleRange)
    DoubleRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DoubleRange.newBuilder() to construct.
  private DoubleRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DoubleRange() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DoubleRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DoubleRange(
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
          case 9:
            {
              start_ = input.readDouble();
              break;
            }
          case 17:
            {
              end_ = input.readDouble();
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
    return com.google.cloud.automl.v1beta1.RangesProto
        .internal_static_google_cloud_automl_v1beta1_DoubleRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.RangesProto
        .internal_static_google_cloud_automl_v1beta1_DoubleRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.DoubleRange.class,
            com.google.cloud.automl.v1beta1.DoubleRange.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private double start_;
  /**
   *
   *
   * <pre>
   * Start of the range, inclusive.
   * </pre>
   *
   * <code>double start = 1;</code>
   */
  public double getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private double end_;
  /**
   *
   *
   * <pre>
   * End of the range, exclusive.
   * </pre>
   *
   * <code>double end = 2;</code>
   */
  public double getEnd() {
    return end_;
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
    if (start_ != 0D) {
      output.writeDouble(1, start_);
    }
    if (end_ != 0D) {
      output.writeDouble(2, end_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, start_);
    }
    if (end_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, end_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.DoubleRange)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.DoubleRange other =
        (com.google.cloud.automl.v1beta1.DoubleRange) obj;

    if (java.lang.Double.doubleToLongBits(getStart())
        != java.lang.Double.doubleToLongBits(other.getStart())) return false;
    if (java.lang.Double.doubleToLongBits(getEnd())
        != java.lang.Double.doubleToLongBits(other.getEnd())) return false;
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getStart()));
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getEnd()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.DoubleRange prototype) {
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
   * A range between two double numbers.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.DoubleRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.DoubleRange)
      com.google.cloud.automl.v1beta1.DoubleRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.RangesProto
          .internal_static_google_cloud_automl_v1beta1_DoubleRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.RangesProto
          .internal_static_google_cloud_automl_v1beta1_DoubleRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.DoubleRange.class,
              com.google.cloud.automl.v1beta1.DoubleRange.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.DoubleRange.newBuilder()
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
      start_ = 0D;

      end_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.RangesProto
          .internal_static_google_cloud_automl_v1beta1_DoubleRange_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.DoubleRange getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.DoubleRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.DoubleRange build() {
      com.google.cloud.automl.v1beta1.DoubleRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.DoubleRange buildPartial() {
      com.google.cloud.automl.v1beta1.DoubleRange result =
          new com.google.cloud.automl.v1beta1.DoubleRange(this);
      result.start_ = start_;
      result.end_ = end_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.DoubleRange) {
        return mergeFrom((com.google.cloud.automl.v1beta1.DoubleRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.DoubleRange other) {
      if (other == com.google.cloud.automl.v1beta1.DoubleRange.getDefaultInstance()) return this;
      if (other.getStart() != 0D) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0D) {
        setEnd(other.getEnd());
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
      com.google.cloud.automl.v1beta1.DoubleRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.DoubleRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double start_;
    /**
     *
     *
     * <pre>
     * Start of the range, inclusive.
     * </pre>
     *
     * <code>double start = 1;</code>
     */
    public double getStart() {
      return start_;
    }
    /**
     *
     *
     * <pre>
     * Start of the range, inclusive.
     * </pre>
     *
     * <code>double start = 1;</code>
     */
    public Builder setStart(double value) {

      start_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Start of the range, inclusive.
     * </pre>
     *
     * <code>double start = 1;</code>
     */
    public Builder clearStart() {

      start_ = 0D;
      onChanged();
      return this;
    }

    private double end_;
    /**
     *
     *
     * <pre>
     * End of the range, exclusive.
     * </pre>
     *
     * <code>double end = 2;</code>
     */
    public double getEnd() {
      return end_;
    }
    /**
     *
     *
     * <pre>
     * End of the range, exclusive.
     * </pre>
     *
     * <code>double end = 2;</code>
     */
    public Builder setEnd(double value) {

      end_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * End of the range, exclusive.
     * </pre>
     *
     * <code>double end = 2;</code>
     */
    public Builder clearEnd() {

      end_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.DoubleRange)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.DoubleRange)
  private static final com.google.cloud.automl.v1beta1.DoubleRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.DoubleRange();
  }

  public static com.google.cloud.automl.v1beta1.DoubleRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleRange> PARSER =
      new com.google.protobuf.AbstractParser<DoubleRange>() {
        @java.lang.Override
        public DoubleRange parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DoubleRange(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DoubleRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.DoubleRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
