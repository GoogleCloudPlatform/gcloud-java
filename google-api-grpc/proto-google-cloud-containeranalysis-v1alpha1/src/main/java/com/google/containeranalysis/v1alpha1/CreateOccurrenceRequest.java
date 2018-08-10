// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

/**
 * <pre>
 * Request to insert a new occurrence.
 * </pre>
 *
 * Protobuf type {@code google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest}
 */
public  final class CreateOccurrenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest)
    CreateOccurrenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOccurrenceRequest.newBuilder() to construct.
  private CreateOccurrenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOccurrenceRequest() {
    name_ = "";
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateOccurrenceRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.containeranalysis.v1alpha1.Occurrence.Builder subBuilder = null;
            if (occurrence_ != null) {
              subBuilder = occurrence_.toBuilder();
            }
            occurrence_ = input.readMessage(com.google.containeranalysis.v1alpha1.Occurrence.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(occurrence_);
              occurrence_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
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
    return com.google.containeranalysis.v1alpha1.Containeranalysis.internal_static_google_devtools_containeranalysis_v1alpha1_CreateOccurrenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.containeranalysis.v1alpha1.Containeranalysis.internal_static_google_devtools_containeranalysis_v1alpha1_CreateOccurrenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.class, com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the project.  Should be of the form "projects/{project_id}".
   * &#64;Deprecated
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the project.  Should be of the form "projects/{project_id}".
   * &#64;Deprecated
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * This field contains the project Id for example: "projects/{project_id}"
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
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
   * This field contains the project Id for example: "projects/{project_id}"
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
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

  public static final int OCCURRENCE_FIELD_NUMBER = 2;
  private com.google.containeranalysis.v1alpha1.Occurrence occurrence_;
  /**
   * <pre>
   * The occurrence to be inserted
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  public boolean hasOccurrence() {
    return occurrence_ != null;
  }
  /**
   * <pre>
   * The occurrence to be inserted
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  public com.google.containeranalysis.v1alpha1.Occurrence getOccurrence() {
    return occurrence_ == null ? com.google.containeranalysis.v1alpha1.Occurrence.getDefaultInstance() : occurrence_;
  }
  /**
   * <pre>
   * The occurrence to be inserted
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  public com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder getOccurrenceOrBuilder() {
    return getOccurrence();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (occurrence_ != null) {
      output.writeMessage(2, getOccurrence());
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parent_);
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
    if (occurrence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOccurrence());
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parent_);
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
    if (!(obj instanceof com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest)) {
      return super.equals(obj);
    }
    com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest other = (com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasOccurrence() == other.hasOccurrence());
    if (hasOccurrence()) {
      result = result && getOccurrence()
          .equals(other.getOccurrence());
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasOccurrence()) {
      hash = (37 * hash) + OCCURRENCE_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrence().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parseFrom(
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
  public static Builder newBuilder(com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest prototype) {
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
   * Request to insert a new occurrence.
   * </pre>
   *
   * Protobuf type {@code google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest)
      com.google.containeranalysis.v1alpha1.CreateOccurrenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.containeranalysis.v1alpha1.Containeranalysis.internal_static_google_devtools_containeranalysis_v1alpha1_CreateOccurrenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.containeranalysis.v1alpha1.Containeranalysis.internal_static_google_devtools_containeranalysis_v1alpha1_CreateOccurrenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.class, com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.Builder.class);
    }

    // Construct using com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.newBuilder()
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
      name_ = "";

      parent_ = "";

      if (occurrenceBuilder_ == null) {
        occurrence_ = null;
      } else {
        occurrence_ = null;
        occurrenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.containeranalysis.v1alpha1.Containeranalysis.internal_static_google_devtools_containeranalysis_v1alpha1_CreateOccurrenceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest getDefaultInstanceForType() {
      return com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest build() {
      com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest buildPartial() {
      com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest result = new com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest(this);
      result.name_ = name_;
      result.parent_ = parent_;
      if (occurrenceBuilder_ == null) {
        result.occurrence_ = occurrence_;
      } else {
        result.occurrence_ = occurrenceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest) {
        return mergeFrom((com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest other) {
      if (other == com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasOccurrence()) {
        mergeOccurrence(other.getOccurrence());
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
      com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest) e.getUnfinishedMessage();
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
     * <pre>
     * The name of the project.  Should be of the form "projects/{project_id}".
     * &#64;Deprecated
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the project.  Should be of the form "projects/{project_id}".
     * &#64;Deprecated
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the project.  Should be of the form "projects/{project_id}".
     * &#64;Deprecated
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the project.  Should be of the form "projects/{project_id}".
     * &#64;Deprecated
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
     * <pre>
     * The name of the project.  Should be of the form "projects/{project_id}".
     * &#64;Deprecated
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * This field contains the project Id for example: "projects/{project_id}"
     * </pre>
     *
     * <code>string parent = 3;</code>
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
     * This field contains the project Id for example: "projects/{project_id}"
     * </pre>
     *
     * <code>string parent = 3;</code>
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
     * This field contains the project Id for example: "projects/{project_id}"
     * </pre>
     *
     * <code>string parent = 3;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field contains the project Id for example: "projects/{project_id}"
     * </pre>
     *
     * <code>string parent = 3;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field contains the project Id for example: "projects/{project_id}"
     * </pre>
     *
     * <code>string parent = 3;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.containeranalysis.v1alpha1.Occurrence occurrence_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.Occurrence, com.google.containeranalysis.v1alpha1.Occurrence.Builder, com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder> occurrenceBuilder_;
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public boolean hasOccurrence() {
      return occurrenceBuilder_ != null || occurrence_ != null;
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public com.google.containeranalysis.v1alpha1.Occurrence getOccurrence() {
      if (occurrenceBuilder_ == null) {
        return occurrence_ == null ? com.google.containeranalysis.v1alpha1.Occurrence.getDefaultInstance() : occurrence_;
      } else {
        return occurrenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public Builder setOccurrence(com.google.containeranalysis.v1alpha1.Occurrence value) {
      if (occurrenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        occurrence_ = value;
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public Builder setOccurrence(
        com.google.containeranalysis.v1alpha1.Occurrence.Builder builderForValue) {
      if (occurrenceBuilder_ == null) {
        occurrence_ = builderForValue.build();
        onChanged();
      } else {
        occurrenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public Builder mergeOccurrence(com.google.containeranalysis.v1alpha1.Occurrence value) {
      if (occurrenceBuilder_ == null) {
        if (occurrence_ != null) {
          occurrence_ =
            com.google.containeranalysis.v1alpha1.Occurrence.newBuilder(occurrence_).mergeFrom(value).buildPartial();
        } else {
          occurrence_ = value;
        }
        onChanged();
      } else {
        occurrenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public Builder clearOccurrence() {
      if (occurrenceBuilder_ == null) {
        occurrence_ = null;
        onChanged();
      } else {
        occurrence_ = null;
        occurrenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public com.google.containeranalysis.v1alpha1.Occurrence.Builder getOccurrenceBuilder() {
      
      onChanged();
      return getOccurrenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    public com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder getOccurrenceOrBuilder() {
      if (occurrenceBuilder_ != null) {
        return occurrenceBuilder_.getMessageOrBuilder();
      } else {
        return occurrence_ == null ?
            com.google.containeranalysis.v1alpha1.Occurrence.getDefaultInstance() : occurrence_;
      }
    }
    /**
     * <pre>
     * The occurrence to be inserted
     * </pre>
     *
     * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.containeranalysis.v1alpha1.Occurrence, com.google.containeranalysis.v1alpha1.Occurrence.Builder, com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder> 
        getOccurrenceFieldBuilder() {
      if (occurrenceBuilder_ == null) {
        occurrenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.containeranalysis.v1alpha1.Occurrence, com.google.containeranalysis.v1alpha1.Occurrence.Builder, com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder>(
                getOccurrence(),
                getParentForChildren(),
                isClean());
        occurrence_ = null;
      }
      return occurrenceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest)
  private static final com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest();
  }

  public static com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOccurrenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOccurrenceRequest>() {
    @java.lang.Override
    public CreateOccurrenceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateOccurrenceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateOccurrenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOccurrenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.containeranalysis.v1alpha1.CreateOccurrenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

