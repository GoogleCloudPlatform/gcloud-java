/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Result of executing the [ExecutableCode].
 *
 * Always follows a `part` containing the [ExecutableCode].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CodeExecutionResult}
 */
public final class CodeExecutionResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CodeExecutionResult)
    CodeExecutionResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CodeExecutionResult.newBuilder() to construct.
  private CodeExecutionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CodeExecutionResult() {
    outcome_ = 0;
    output_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CodeExecutionResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_CodeExecutionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_CodeExecutionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CodeExecutionResult.class,
            com.google.cloud.aiplatform.v1.CodeExecutionResult.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enumeration of possible outcomes of the code execution.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.CodeExecutionResult.Outcome}
   */
  public enum Outcome implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified status. This value should not be used.
     * </pre>
     *
     * <code>OUTCOME_UNSPECIFIED = 0;</code>
     */
    OUTCOME_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Code execution completed successfully.
     * </pre>
     *
     * <code>OUTCOME_OK = 1;</code>
     */
    OUTCOME_OK(1),
    /**
     *
     *
     * <pre>
     * Code execution finished but with a failure. `stderr` should contain the
     * reason.
     * </pre>
     *
     * <code>OUTCOME_FAILED = 2;</code>
     */
    OUTCOME_FAILED(2),
    /**
     *
     *
     * <pre>
     * Code execution ran for too long, and was cancelled. There may or may not
     * be a partial output present.
     * </pre>
     *
     * <code>OUTCOME_DEADLINE_EXCEEDED = 3;</code>
     */
    OUTCOME_DEADLINE_EXCEEDED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified status. This value should not be used.
     * </pre>
     *
     * <code>OUTCOME_UNSPECIFIED = 0;</code>
     */
    public static final int OUTCOME_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Code execution completed successfully.
     * </pre>
     *
     * <code>OUTCOME_OK = 1;</code>
     */
    public static final int OUTCOME_OK_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Code execution finished but with a failure. `stderr` should contain the
     * reason.
     * </pre>
     *
     * <code>OUTCOME_FAILED = 2;</code>
     */
    public static final int OUTCOME_FAILED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Code execution ran for too long, and was cancelled. There may or may not
     * be a partial output present.
     * </pre>
     *
     * <code>OUTCOME_DEADLINE_EXCEEDED = 3;</code>
     */
    public static final int OUTCOME_DEADLINE_EXCEEDED_VALUE = 3;

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
    public static Outcome valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Outcome forNumber(int value) {
      switch (value) {
        case 0:
          return OUTCOME_UNSPECIFIED;
        case 1:
          return OUTCOME_OK;
        case 2:
          return OUTCOME_FAILED;
        case 3:
          return OUTCOME_DEADLINE_EXCEEDED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Outcome> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Outcome> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Outcome>() {
          public Outcome findValueByNumber(int number) {
            return Outcome.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.CodeExecutionResult.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Outcome[] VALUES = values();

    public static Outcome valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Outcome(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.CodeExecutionResult.Outcome)
  }

  public static final int OUTCOME_FIELD_NUMBER = 1;
  private int outcome_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Outcome of the code execution.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for outcome.
   */
  @java.lang.Override
  public int getOutcomeValue() {
    return outcome_;
  }
  /**
   *
   *
   * <pre>
   * Required. Outcome of the code execution.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outcome.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome getOutcome() {
    com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome result =
        com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.forNumber(outcome_);
    return result == null
        ? com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.UNRECOGNIZED
        : result;
  }

  public static final int OUTPUT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object output_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Contains stdout when code execution is successful, stderr or
   * other description otherwise.
   * </pre>
   *
   * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The output.
   */
  @java.lang.Override
  public java.lang.String getOutput() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      output_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Contains stdout when code execution is successful, stderr or
   * other description otherwise.
   * </pre>
   *
   * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for output.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOutputBytes() {
    java.lang.Object ref = output_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      output_ = b;
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
    if (outcome_
        != com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.OUTCOME_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, outcome_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, output_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (outcome_
        != com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.OUTCOME_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, outcome_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(output_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, output_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CodeExecutionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CodeExecutionResult other =
        (com.google.cloud.aiplatform.v1.CodeExecutionResult) obj;

    if (outcome_ != other.outcome_) return false;
    if (!getOutput().equals(other.getOutput())) return false;
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
    hash = (37 * hash) + OUTCOME_FIELD_NUMBER;
    hash = (53 * hash) + outcome_;
    hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
    hash = (53 * hash) + getOutput().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CodeExecutionResult prototype) {
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
   * Result of executing the [ExecutableCode].
   *
   * Always follows a `part` containing the [ExecutableCode].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CodeExecutionResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CodeExecutionResult)
      com.google.cloud.aiplatform.v1.CodeExecutionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_CodeExecutionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_CodeExecutionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CodeExecutionResult.class,
              com.google.cloud.aiplatform.v1.CodeExecutionResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CodeExecutionResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      outcome_ = 0;
      output_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_CodeExecutionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CodeExecutionResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CodeExecutionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CodeExecutionResult build() {
      com.google.cloud.aiplatform.v1.CodeExecutionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CodeExecutionResult buildPartial() {
      com.google.cloud.aiplatform.v1.CodeExecutionResult result =
          new com.google.cloud.aiplatform.v1.CodeExecutionResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.CodeExecutionResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.outcome_ = outcome_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.output_ = output_;
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.CodeExecutionResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CodeExecutionResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CodeExecutionResult other) {
      if (other == com.google.cloud.aiplatform.v1.CodeExecutionResult.getDefaultInstance())
        return this;
      if (other.outcome_ != 0) {
        setOutcomeValue(other.getOutcomeValue());
      }
      if (!other.getOutput().isEmpty()) {
        output_ = other.output_;
        bitField0_ |= 0x00000002;
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
            case 8:
              {
                outcome_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                output_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private int outcome_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Outcome of the code execution.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for outcome.
     */
    @java.lang.Override
    public int getOutcomeValue() {
      return outcome_;
    }
    /**
     *
     *
     * <pre>
     * Required. Outcome of the code execution.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcomeValue(int value) {
      outcome_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Outcome of the code execution.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The outcome.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome getOutcome() {
      com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome result =
          com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.forNumber(outcome_);
      return result == null
          ? com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Outcome of the code execution.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The outcome to set.
     * @return This builder for chaining.
     */
    public Builder setOutcome(com.google.cloud.aiplatform.v1.CodeExecutionResult.Outcome value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      outcome_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Outcome of the code execution.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.CodeExecutionResult.Outcome outcome = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutcome() {
      bitField0_ = (bitField0_ & ~0x00000001);
      outcome_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object output_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Contains stdout when code execution is successful, stderr or
     * other description otherwise.
     * </pre>
     *
     * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The output.
     */
    public java.lang.String getOutput() {
      java.lang.Object ref = output_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        output_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Contains stdout when code execution is successful, stderr or
     * other description otherwise.
     * </pre>
     *
     * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for output.
     */
    public com.google.protobuf.ByteString getOutputBytes() {
      java.lang.Object ref = output_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        output_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Contains stdout when code execution is successful, stderr or
     * other description otherwise.
     * </pre>
     *
     * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The output to set.
     * @return This builder for chaining.
     */
    public Builder setOutput(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      output_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Contains stdout when code execution is successful, stderr or
     * other description otherwise.
     * </pre>
     *
     * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutput() {
      output_ = getDefaultInstance().getOutput();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Contains stdout when code execution is successful, stderr or
     * other description otherwise.
     * </pre>
     *
     * <code>string output = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for output to set.
     * @return This builder for chaining.
     */
    public Builder setOutputBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      output_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CodeExecutionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CodeExecutionResult)
  private static final com.google.cloud.aiplatform.v1.CodeExecutionResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CodeExecutionResult();
  }

  public static com.google.cloud.aiplatform.v1.CodeExecutionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CodeExecutionResult> PARSER =
      new com.google.protobuf.AbstractParser<CodeExecutionResult>() {
        @java.lang.Override
        public CodeExecutionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CodeExecutionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CodeExecutionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CodeExecutionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
