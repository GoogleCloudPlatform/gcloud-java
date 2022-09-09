// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

/**
 * <pre>
 * Response message for fetch processor types.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.FetchProcessorTypesResponse}
 */
public final class FetchProcessorTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)
    FetchProcessorTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchProcessorTypesResponse.newBuilder() to construct.
  private FetchProcessorTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchProcessorTypesResponse() {
    processorTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetchProcessorTypesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FetchProcessorTypesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              processorTypes_ = new java.util.ArrayList<com.google.cloud.documentai.v1beta3.ProcessorType>();
              mutable_bitField0_ |= 0x00000001;
            }
            processorTypes_.add(
                input.readMessage(com.google.cloud.documentai.v1beta3.ProcessorType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        processorTypes_ = java.util.Collections.unmodifiableList(processorTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_FetchProcessorTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_FetchProcessorTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.class, com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.Builder.class);
  }

  public static final int PROCESSOR_TYPES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.documentai.v1beta3.ProcessorType> processorTypes_;
  /**
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1beta3.ProcessorType> getProcessorTypesList() {
    return processorTypes_;
  }
  /**
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder> 
      getProcessorTypesOrBuilderList() {
    return processorTypes_;
  }
  /**
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public int getProcessorTypesCount() {
    return processorTypes_.size();
  }
  /**
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.ProcessorType getProcessorTypes(int index) {
    return processorTypes_.get(index);
  }
  /**
   * <pre>
   * The list of processor types.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder getProcessorTypesOrBuilder(
      int index) {
    return processorTypes_.get(index);
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
    for (int i = 0; i < processorTypes_.size(); i++) {
      output.writeMessage(1, processorTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processorTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, processorTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse other = (com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse) obj;

    if (!getProcessorTypesList()
        .equals(other.getProcessorTypesList())) return false;
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
    if (getProcessorTypesCount() > 0) {
      hash = (37 * hash) + PROCESSOR_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getProcessorTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse prototype) {
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
   * Response message for fetch processor types.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.FetchProcessorTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_FetchProcessorTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_FetchProcessorTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.class, com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.newBuilder()
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
        getProcessorTypesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (processorTypesBuilder_ == null) {
        processorTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        processorTypesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_FetchProcessorTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse build() {
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse buildPartial() {
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse result = new com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse(this);
      int from_bitField0_ = bitField0_;
      if (processorTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processorTypes_ = java.util.Collections.unmodifiableList(processorTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processorTypes_ = processorTypes_;
      } else {
        result.processorTypes_ = processorTypesBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse other) {
      if (other == com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.getDefaultInstance()) return this;
      if (processorTypesBuilder_ == null) {
        if (!other.processorTypes_.isEmpty()) {
          if (processorTypes_.isEmpty()) {
            processorTypes_ = other.processorTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessorTypesIsMutable();
            processorTypes_.addAll(other.processorTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.processorTypes_.isEmpty()) {
          if (processorTypesBuilder_.isEmpty()) {
            processorTypesBuilder_.dispose();
            processorTypesBuilder_ = null;
            processorTypes_ = other.processorTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processorTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProcessorTypesFieldBuilder() : null;
          } else {
            processorTypesBuilder_.addAllMessages(other.processorTypes_);
          }
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
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.documentai.v1beta3.ProcessorType> processorTypes_ =
      java.util.Collections.emptyList();
    private void ensureProcessorTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processorTypes_ = new java.util.ArrayList<com.google.cloud.documentai.v1beta3.ProcessorType>(processorTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.ProcessorType, com.google.cloud.documentai.v1beta3.ProcessorType.Builder, com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder> processorTypesBuilder_;

    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta3.ProcessorType> getProcessorTypesList() {
      if (processorTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processorTypes_);
      } else {
        return processorTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public int getProcessorTypesCount() {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.size();
      } else {
        return processorTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.ProcessorType getProcessorTypes(int index) {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.get(index);
      } else {
        return processorTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder setProcessorTypes(
        int index, com.google.cloud.documentai.v1beta3.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.set(index, value);
        onChanged();
      } else {
        processorTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder setProcessorTypes(
        int index, com.google.cloud.documentai.v1beta3.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(com.google.cloud.documentai.v1beta3.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.add(value);
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        int index, com.google.cloud.documentai.v1beta3.ProcessorType value) {
      if (processorTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorTypesIsMutable();
        processorTypes_.add(index, value);
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        com.google.cloud.documentai.v1beta3.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.add(builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder addProcessorTypes(
        int index, com.google.cloud.documentai.v1beta3.ProcessorType.Builder builderForValue) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        processorTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder addAllProcessorTypes(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1beta3.ProcessorType> values) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, processorTypes_);
        onChanged();
      } else {
        processorTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder clearProcessorTypes() {
      if (processorTypesBuilder_ == null) {
        processorTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processorTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public Builder removeProcessorTypes(int index) {
      if (processorTypesBuilder_ == null) {
        ensureProcessorTypesIsMutable();
        processorTypes_.remove(index);
        onChanged();
      } else {
        processorTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.ProcessorType.Builder getProcessorTypesBuilder(
        int index) {
      return getProcessorTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder getProcessorTypesOrBuilder(
        int index) {
      if (processorTypesBuilder_ == null) {
        return processorTypes_.get(index);  } else {
        return processorTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder> 
         getProcessorTypesOrBuilderList() {
      if (processorTypesBuilder_ != null) {
        return processorTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processorTypes_);
      }
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.ProcessorType.Builder addProcessorTypesBuilder() {
      return getProcessorTypesFieldBuilder().addBuilder(
          com.google.cloud.documentai.v1beta3.ProcessorType.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.ProcessorType.Builder addProcessorTypesBuilder(
        int index) {
      return getProcessorTypesFieldBuilder().addBuilder(
          index, com.google.cloud.documentai.v1beta3.ProcessorType.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of processor types.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta3.ProcessorType processor_types = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta3.ProcessorType.Builder> 
         getProcessorTypesBuilderList() {
      return getProcessorTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.ProcessorType, com.google.cloud.documentai.v1beta3.ProcessorType.Builder, com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder> 
        getProcessorTypesFieldBuilder() {
      if (processorTypesBuilder_ == null) {
        processorTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.ProcessorType, com.google.cloud.documentai.v1beta3.ProcessorType.Builder, com.google.cloud.documentai.v1beta3.ProcessorTypeOrBuilder>(
                processorTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        processorTypes_ = null;
      }
      return processorTypesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.FetchProcessorTypesResponse)
  private static final com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse();
  }

  public static com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchProcessorTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchProcessorTypesResponse>() {
    @java.lang.Override
    public FetchProcessorTypesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FetchProcessorTypesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchProcessorTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchProcessorTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

