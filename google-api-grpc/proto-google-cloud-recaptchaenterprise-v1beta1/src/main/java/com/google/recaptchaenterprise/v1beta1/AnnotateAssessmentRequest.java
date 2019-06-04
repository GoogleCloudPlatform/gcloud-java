// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

/**
 *
 *
 * <pre>
 * The request message to annotate an Assessment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest}
 */
public final class AnnotateAssessmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
    AnnotateAssessmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnnotateAssessmentRequest.newBuilder() to construct.
  private AnnotateAssessmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnnotateAssessmentRequest() {
    name_ = "";
    annotation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnnotateAssessmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnnotateAssessmentRequest(
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

              name_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              annotation_ = rawValue;
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
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.class,
            com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum that reprensents the types of annotations.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation}
   */
  public enum Annotation implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>ANNOTATION_UNSPECIFIED = 0;</code>
     */
    ANNOTATION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Provides information that the event turned out to be legitimate.
     * </pre>
     *
     * <code>LEGITIMATE = 1;</code>
     */
    LEGITIMATE(1),
    /**
     *
     *
     * <pre>
     * Provides information that the event turned out to be fraudulent.
     * </pre>
     *
     * <code>FRAUDULENT = 2;</code>
     */
    FRAUDULENT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>ANNOTATION_UNSPECIFIED = 0;</code>
     */
    public static final int ANNOTATION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Provides information that the event turned out to be legitimate.
     * </pre>
     *
     * <code>LEGITIMATE = 1;</code>
     */
    public static final int LEGITIMATE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Provides information that the event turned out to be fraudulent.
     * </pre>
     *
     * <code>FRAUDULENT = 2;</code>
     */
    public static final int FRAUDULENT_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static Annotation valueOf(int value) {
      return forNumber(value);
    }

    public static Annotation forNumber(int value) {
      switch (value) {
        case 0:
          return ANNOTATION_UNSPECIFIED;
        case 1:
          return LEGITIMATE;
        case 2:
          return FRAUDULENT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Annotation> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Annotation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Annotation>() {
          public Annotation findValueByNumber(int number) {
            return Annotation.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Annotation[] VALUES = values();

    public static Annotation valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Annotation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project_number}/assessments/{assessment_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project_number}/assessments/{assessment_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANNOTATION_FIELD_NUMBER = 2;
  private int annotation_;
  /**
   *
   *
   * <pre>
   * The annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
   * </code>
   */
  public int getAnnotationValue() {
    return annotation_;
  }
  /**
   *
   *
   * <pre>
   * The annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
   * </code>
   */
  public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation
      getAnnotation() {
    @SuppressWarnings("deprecation")
    com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation result =
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation.valueOf(
            annotation_);
    return result == null
        ? com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation.UNRECOGNIZED
        : result;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (annotation_
        != com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation
            .ANNOTATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, annotation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (annotation_
        != com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation
            .ANNOTATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, annotation_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest other =
        (com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (annotation_ != other.annotation_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ANNOTATION_FIELD_NUMBER;
    hash = (53 * hash) + annotation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parseFrom(
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
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest prototype) {
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
   * The request message to annotate an Assessment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.class,
              com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.newBuilder()
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
      name_ = "";

      annotation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest
        getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest build() {
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest buildPartial() {
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest result =
          new com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest(this);
      result.name_ = name_;
      result.annotation_ = annotation_;
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
      if (other instanceof com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest) {
        return mergeFrom((com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest other) {
      if (other
          == com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.annotation_ != 0) {
        setAnnotationValue(other.getAnnotationValue());
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
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Assessment, in the format
     * "projects/{project_number}/assessments/{assessment_id}".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Assessment, in the format
     * "projects/{project_number}/assessments/{assessment_id}".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Assessment, in the format
     * "projects/{project_number}/assessments/{assessment_id}".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Assessment, in the format
     * "projects/{project_number}/assessments/{assessment_id}".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Assessment, in the format
     * "projects/{project_number}/assessments/{assessment_id}".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int annotation_ = 0;
    /**
     *
     *
     * <pre>
     * The annotation that will be assigned to the Event.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
     * </code>
     */
    public int getAnnotationValue() {
      return annotation_;
    }
    /**
     *
     *
     * <pre>
     * The annotation that will be assigned to the Event.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
     * </code>
     */
    public Builder setAnnotationValue(int value) {
      annotation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The annotation that will be assigned to the Event.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
     * </code>
     */
    public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation
        getAnnotation() {
      @SuppressWarnings("deprecation")
      com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation result =
          com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation.valueOf(
              annotation_);
      return result == null
          ? com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The annotation that will be assigned to the Event.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
     * </code>
     */
    public Builder setAnnotation(
        com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation value) {
      if (value == null) {
        throw new NullPointerException();
      }

      annotation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The annotation that will be assigned to the Event.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
     * </code>
     */
    public Builder clearAnnotation() {

      annotation_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
  private static final com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest();
  }

  public static com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotateAssessmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<AnnotateAssessmentRequest>() {
        @java.lang.Override
        public AnnotateAssessmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnnotateAssessmentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnnotateAssessmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotateAssessmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
