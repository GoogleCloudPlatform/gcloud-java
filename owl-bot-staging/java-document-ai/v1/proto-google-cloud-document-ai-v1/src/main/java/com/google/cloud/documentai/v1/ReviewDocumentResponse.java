// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 * <pre>
 * Response message for the
 * [ReviewDocument][google.cloud.documentai.v1.DocumentProcessorService.ReviewDocument]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ReviewDocumentResponse}
 */
public final class ReviewDocumentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ReviewDocumentResponse)
    ReviewDocumentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviewDocumentResponse.newBuilder() to construct.
  private ReviewDocumentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviewDocumentResponse() {
    gcsDestination_ = "";
    state_ = 0;
    rejectionReason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviewDocumentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ReviewDocumentResponse.class, com.google.cloud.documentai.v1.ReviewDocumentResponse.Builder.class);
  }

  /**
   * <pre>
   * Possible states of the review operation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.documentai.v1.ReviewDocumentResponse.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The default value. This value is used if the state is omitted.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * The review operation is rejected by the reviewer.
     * </pre>
     *
     * <code>REJECTED = 1;</code>
     */
    REJECTED(1),
    /**
     * <pre>
     * The review operation is succeeded.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    SUCCEEDED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The default value. This value is used if the state is omitted.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The review operation is rejected by the reviewer.
     * </pre>
     *
     * <code>REJECTED = 1;</code>
     */
    public static final int REJECTED_VALUE = 1;
    /**
     * <pre>
     * The review operation is succeeded.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    public static final int SUCCEEDED_VALUE = 2;


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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return STATE_UNSPECIFIED;
        case 1: return REJECTED;
        case 2: return SUCCEEDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
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
      return com.google.cloud.documentai.v1.ReviewDocumentResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
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

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.documentai.v1.ReviewDocumentResponse.State)
  }

  public static final int GCS_DESTINATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gcsDestination_ = "";
  /**
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   * @return The gcsDestination.
   */
  @java.lang.Override
  public java.lang.String getGcsDestination() {
    java.lang.Object ref = gcsDestination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsDestination_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   * @return The bytes for gcsDestination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGcsDestinationBytes() {
    java.lang.Object ref = gcsDestination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcsDestination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.documentai.v1.ReviewDocumentResponse.State getState() {
    com.google.cloud.documentai.v1.ReviewDocumentResponse.State result = com.google.cloud.documentai.v1.ReviewDocumentResponse.State.forNumber(state_);
    return result == null ? com.google.cloud.documentai.v1.ReviewDocumentResponse.State.UNRECOGNIZED : result;
  }

  public static final int REJECTION_REASON_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rejectionReason_ = "";
  /**
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   * @return The rejectionReason.
   */
  @java.lang.Override
  public java.lang.String getRejectionReason() {
    java.lang.Object ref = rejectionReason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rejectionReason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   * @return The bytes for rejectionReason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRejectionReasonBytes() {
    java.lang.Object ref = rejectionReason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rejectionReason_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsDestination_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsDestination_);
    }
    if (state_ != com.google.cloud.documentai.v1.ReviewDocumentResponse.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rejectionReason_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rejectionReason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsDestination_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsDestination_);
    }
    if (state_ != com.google.cloud.documentai.v1.ReviewDocumentResponse.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rejectionReason_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rejectionReason_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1.ReviewDocumentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ReviewDocumentResponse other = (com.google.cloud.documentai.v1.ReviewDocumentResponse) obj;

    if (!getGcsDestination()
        .equals(other.getGcsDestination())) return false;
    if (state_ != other.state_) return false;
    if (!getRejectionReason()
        .equals(other.getRejectionReason())) return false;
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
    hash = (37 * hash) + GCS_DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getGcsDestination().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + REJECTION_REASON_FIELD_NUMBER;
    hash = (53 * hash) + getRejectionReason().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1.ReviewDocumentResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1.ReviewDocumentResponse prototype) {
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
   * Response message for the
   * [ReviewDocument][google.cloud.documentai.v1.DocumentProcessorService.ReviewDocument]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ReviewDocumentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ReviewDocumentResponse)
      com.google.cloud.documentai.v1.ReviewDocumentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ReviewDocumentResponse.class, com.google.cloud.documentai.v1.ReviewDocumentResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ReviewDocumentResponse.newBuilder()
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
      gcsDestination_ = "";
      state_ = 0;
      rejectionReason_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1_ReviewDocumentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ReviewDocumentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentResponse build() {
      com.google.cloud.documentai.v1.ReviewDocumentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentResponse buildPartial() {
      com.google.cloud.documentai.v1.ReviewDocumentResponse result = new com.google.cloud.documentai.v1.ReviewDocumentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1.ReviewDocumentResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsDestination_ = gcsDestination_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rejectionReason_ = rejectionReason_;
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
      if (other instanceof com.google.cloud.documentai.v1.ReviewDocumentResponse) {
        return mergeFrom((com.google.cloud.documentai.v1.ReviewDocumentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ReviewDocumentResponse other) {
      if (other == com.google.cloud.documentai.v1.ReviewDocumentResponse.getDefaultInstance()) return this;
      if (!other.getGcsDestination().isEmpty()) {
        gcsDestination_ = other.gcsDestination_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getRejectionReason().isEmpty()) {
        rejectionReason_ = other.rejectionReason_;
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
              gcsDestination_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              rejectionReason_ = input.readStringRequireUtf8();
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

    private java.lang.Object gcsDestination_ = "";
    /**
     * <pre>
     * The Cloud Storage uri for the human reviewed document if the review is
     * succeeded.
     * </pre>
     *
     * <code>string gcs_destination = 1;</code>
     * @return The gcsDestination.
     */
    public java.lang.String getGcsDestination() {
      java.lang.Object ref = gcsDestination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsDestination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Cloud Storage uri for the human reviewed document if the review is
     * succeeded.
     * </pre>
     *
     * <code>string gcs_destination = 1;</code>
     * @return The bytes for gcsDestination.
     */
    public com.google.protobuf.ByteString
        getGcsDestinationBytes() {
      java.lang.Object ref = gcsDestination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcsDestination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Cloud Storage uri for the human reviewed document if the review is
     * succeeded.
     * </pre>
     *
     * <code>string gcs_destination = 1;</code>
     * @param value The gcsDestination to set.
     * @return This builder for chaining.
     */
    public Builder setGcsDestination(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gcsDestination_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud Storage uri for the human reviewed document if the review is
     * succeeded.
     * </pre>
     *
     * <code>string gcs_destination = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsDestination() {
      gcsDestination_ = getDefaultInstance().getGcsDestination();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Cloud Storage uri for the human reviewed document if the review is
     * succeeded.
     * </pre>
     *
     * <code>string gcs_destination = 1;</code>
     * @param value The bytes for gcsDestination to set.
     * @return This builder for chaining.
     */
    public Builder setGcsDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gcsDestination_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * The state of the review operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * The state of the review operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the review operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1.ReviewDocumentResponse.State getState() {
      com.google.cloud.documentai.v1.ReviewDocumentResponse.State result = com.google.cloud.documentai.v1.ReviewDocumentResponse.State.forNumber(state_);
      return result == null ? com.google.cloud.documentai.v1.ReviewDocumentResponse.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state of the review operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.documentai.v1.ReviewDocumentResponse.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the review operation.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object rejectionReason_ = "";
    /**
     * <pre>
     * The reason why the review is rejected by reviewer.
     * </pre>
     *
     * <code>string rejection_reason = 3;</code>
     * @return The rejectionReason.
     */
    public java.lang.String getRejectionReason() {
      java.lang.Object ref = rejectionReason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rejectionReason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The reason why the review is rejected by reviewer.
     * </pre>
     *
     * <code>string rejection_reason = 3;</code>
     * @return The bytes for rejectionReason.
     */
    public com.google.protobuf.ByteString
        getRejectionReasonBytes() {
      java.lang.Object ref = rejectionReason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rejectionReason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The reason why the review is rejected by reviewer.
     * </pre>
     *
     * <code>string rejection_reason = 3;</code>
     * @param value The rejectionReason to set.
     * @return This builder for chaining.
     */
    public Builder setRejectionReason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rejectionReason_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason why the review is rejected by reviewer.
     * </pre>
     *
     * <code>string rejection_reason = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRejectionReason() {
      rejectionReason_ = getDefaultInstance().getRejectionReason();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason why the review is rejected by reviewer.
     * </pre>
     *
     * <code>string rejection_reason = 3;</code>
     * @param value The bytes for rejectionReason to set.
     * @return This builder for chaining.
     */
    public Builder setRejectionReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rejectionReason_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ReviewDocumentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ReviewDocumentResponse)
  private static final com.google.cloud.documentai.v1.ReviewDocumentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ReviewDocumentResponse();
  }

  public static com.google.cloud.documentai.v1.ReviewDocumentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviewDocumentResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReviewDocumentResponse>() {
    @java.lang.Override
    public ReviewDocumentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReviewDocumentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewDocumentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ReviewDocumentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

