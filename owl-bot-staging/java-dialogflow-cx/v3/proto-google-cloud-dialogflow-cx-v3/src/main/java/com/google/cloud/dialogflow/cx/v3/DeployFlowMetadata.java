// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/environment.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * Metadata returned for the
 * [Environments.DeployFlow][google.cloud.dialogflow.cx.v3.Environments.DeployFlow]
 * long running operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.DeployFlowMetadata}
 */
public final class DeployFlowMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.DeployFlowMetadata)
    DeployFlowMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeployFlowMetadata.newBuilder() to construct.
  private DeployFlowMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeployFlowMetadata() {
    testErrors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeployFlowMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_DeployFlowMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_DeployFlowMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.class, com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.Builder.class);
  }

  public static final int TEST_ERRORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3.TestError> testErrors_;
  /**
   * <pre>
   * Errors of running deployment tests.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.TestError> getTestErrorsList() {
    return testErrors_;
  }
  /**
   * <pre>
   * Errors of running deployment tests.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder> 
      getTestErrorsOrBuilderList() {
    return testErrors_;
  }
  /**
   * <pre>
   * Errors of running deployment tests.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
   */
  @java.lang.Override
  public int getTestErrorsCount() {
    return testErrors_.size();
  }
  /**
   * <pre>
   * Errors of running deployment tests.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestError getTestErrors(int index) {
    return testErrors_.get(index);
  }
  /**
   * <pre>
   * Errors of running deployment tests.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder getTestErrorsOrBuilder(
      int index) {
    return testErrors_.get(index);
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
    for (int i = 0; i < testErrors_.size(); i++) {
      output.writeMessage(1, testErrors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < testErrors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, testErrors_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata other = (com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata) obj;

    if (!getTestErrorsList()
        .equals(other.getTestErrorsList())) return false;
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
    if (getTestErrorsCount() > 0) {
      hash = (37 * hash) + TEST_ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getTestErrorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata prototype) {
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
   * Metadata returned for the
   * [Environments.DeployFlow][google.cloud.dialogflow.cx.v3.Environments.DeployFlow]
   * long running operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.DeployFlowMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.DeployFlowMetadata)
      com.google.cloud.dialogflow.cx.v3.DeployFlowMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_DeployFlowMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_DeployFlowMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.class, com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.newBuilder()
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
      if (testErrorsBuilder_ == null) {
        testErrors_ = java.util.Collections.emptyList();
      } else {
        testErrors_ = null;
        testErrorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3_DeployFlowMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata build() {
      com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata buildPartial() {
      com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata result = new com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata result) {
      if (testErrorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          testErrors_ = java.util.Collections.unmodifiableList(testErrors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.testErrors_ = testErrors_;
      } else {
        result.testErrors_ = testErrorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata other) {
      if (other == com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata.getDefaultInstance()) return this;
      if (testErrorsBuilder_ == null) {
        if (!other.testErrors_.isEmpty()) {
          if (testErrors_.isEmpty()) {
            testErrors_ = other.testErrors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTestErrorsIsMutable();
            testErrors_.addAll(other.testErrors_);
          }
          onChanged();
        }
      } else {
        if (!other.testErrors_.isEmpty()) {
          if (testErrorsBuilder_.isEmpty()) {
            testErrorsBuilder_.dispose();
            testErrorsBuilder_ = null;
            testErrors_ = other.testErrors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            testErrorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTestErrorsFieldBuilder() : null;
          } else {
            testErrorsBuilder_.addAllMessages(other.testErrors_);
          }
        }
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
              com.google.cloud.dialogflow.cx.v3.TestError m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3.TestError.parser(),
                      extensionRegistry);
              if (testErrorsBuilder_ == null) {
                ensureTestErrorsIsMutable();
                testErrors_.add(m);
              } else {
                testErrorsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3.TestError> testErrors_ =
      java.util.Collections.emptyList();
    private void ensureTestErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testErrors_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.TestError>(testErrors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestError, com.google.cloud.dialogflow.cx.v3.TestError.Builder, com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder> testErrorsBuilder_;

    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.TestError> getTestErrorsList() {
      if (testErrorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(testErrors_);
      } else {
        return testErrorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public int getTestErrorsCount() {
      if (testErrorsBuilder_ == null) {
        return testErrors_.size();
      } else {
        return testErrorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestError getTestErrors(int index) {
      if (testErrorsBuilder_ == null) {
        return testErrors_.get(index);
      } else {
        return testErrorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder setTestErrors(
        int index, com.google.cloud.dialogflow.cx.v3.TestError value) {
      if (testErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestErrorsIsMutable();
        testErrors_.set(index, value);
        onChanged();
      } else {
        testErrorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder setTestErrors(
        int index, com.google.cloud.dialogflow.cx.v3.TestError.Builder builderForValue) {
      if (testErrorsBuilder_ == null) {
        ensureTestErrorsIsMutable();
        testErrors_.set(index, builderForValue.build());
        onChanged();
      } else {
        testErrorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder addTestErrors(com.google.cloud.dialogflow.cx.v3.TestError value) {
      if (testErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestErrorsIsMutable();
        testErrors_.add(value);
        onChanged();
      } else {
        testErrorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder addTestErrors(
        int index, com.google.cloud.dialogflow.cx.v3.TestError value) {
      if (testErrorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestErrorsIsMutable();
        testErrors_.add(index, value);
        onChanged();
      } else {
        testErrorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder addTestErrors(
        com.google.cloud.dialogflow.cx.v3.TestError.Builder builderForValue) {
      if (testErrorsBuilder_ == null) {
        ensureTestErrorsIsMutable();
        testErrors_.add(builderForValue.build());
        onChanged();
      } else {
        testErrorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder addTestErrors(
        int index, com.google.cloud.dialogflow.cx.v3.TestError.Builder builderForValue) {
      if (testErrorsBuilder_ == null) {
        ensureTestErrorsIsMutable();
        testErrors_.add(index, builderForValue.build());
        onChanged();
      } else {
        testErrorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder addAllTestErrors(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.TestError> values) {
      if (testErrorsBuilder_ == null) {
        ensureTestErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, testErrors_);
        onChanged();
      } else {
        testErrorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder clearTestErrors() {
      if (testErrorsBuilder_ == null) {
        testErrors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testErrorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public Builder removeTestErrors(int index) {
      if (testErrorsBuilder_ == null) {
        ensureTestErrorsIsMutable();
        testErrors_.remove(index);
        onChanged();
      } else {
        testErrorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestError.Builder getTestErrorsBuilder(
        int index) {
      return getTestErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder getTestErrorsOrBuilder(
        int index) {
      if (testErrorsBuilder_ == null) {
        return testErrors_.get(index);  } else {
        return testErrorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder> 
         getTestErrorsOrBuilderList() {
      if (testErrorsBuilder_ != null) {
        return testErrorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(testErrors_);
      }
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestError.Builder addTestErrorsBuilder() {
      return getTestErrorsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3.TestError.getDefaultInstance());
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.TestError.Builder addTestErrorsBuilder(
        int index) {
      return getTestErrorsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3.TestError.getDefaultInstance());
    }
    /**
     * <pre>
     * Errors of running deployment tests.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.TestError test_errors = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.TestError.Builder> 
         getTestErrorsBuilderList() {
      return getTestErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.TestError, com.google.cloud.dialogflow.cx.v3.TestError.Builder, com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder> 
        getTestErrorsFieldBuilder() {
      if (testErrorsBuilder_ == null) {
        testErrorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.TestError, com.google.cloud.dialogflow.cx.v3.TestError.Builder, com.google.cloud.dialogflow.cx.v3.TestErrorOrBuilder>(
                testErrors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        testErrors_ = null;
      }
      return testErrorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.DeployFlowMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.DeployFlowMetadata)
  private static final com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata();
  }

  public static com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployFlowMetadata>
      PARSER = new com.google.protobuf.AbstractParser<DeployFlowMetadata>() {
    @java.lang.Override
    public DeployFlowMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployFlowMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployFlowMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.DeployFlowMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

