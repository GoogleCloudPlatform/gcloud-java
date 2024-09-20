/*
 * Copyright 2024 Google LLC
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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_object_tracking.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 *
 *
 * <pre>
 * A TrainingJob that trains and uploads an AutoML Video ObjectTracking Model.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking}
 */
public final class AutoMlVideoObjectTracking extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
    AutoMlVideoObjectTrackingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoMlVideoObjectTracking.newBuilder() to construct.
  private AutoMlVideoObjectTracking(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoMlVideoObjectTracking() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoMlVideoObjectTracking();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoObjectTrackingProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
        .AutoMLVideoObjectTrackingProto
        .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTracking.class,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTracking.Builder.class);
  }

  private int bitField0_;
  public static final int INPUTS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      inputs_;
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  @java.lang.Override
  public boolean hasInputs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   *
   * @return The inputs.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputs
      getInputs() {
    return inputs_ == null
        ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.getDefaultInstance()
        : inputs_;
  }
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputsOrBuilder
      getInputsOrBuilder() {
    return inputs_ == null
        ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.getDefaultInstance()
        : inputs_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getInputs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInputs());
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
    if (!(obj
        instanceof
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTracking)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
        other =
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTracking)
                obj;

    if (hasInputs() != other.hasInputs()) return false;
    if (hasInputs()) {
      if (!getInputs().equals(other.getInputs())) return false;
    }
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
    if (hasInputs()) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
          prototype) {
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
   * A TrainingJob that trains and uploads an AutoML Video ObjectTracking Model.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTracking.class,
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTracking.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInputsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inputs_ = null;
      if (inputsBuilder_ != null) {
        inputsBuilder_.dispose();
        inputsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMLVideoObjectTrackingProto
          .internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTracking
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTracking
        build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTracking
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
          result =
              new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                  .AutoMlVideoObjectTracking(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
            result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inputs_ = inputsBuilder_ == null ? inputs_ : inputsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTracking) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTracking)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
            other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
              .AutoMlVideoObjectTracking.getDefaultInstance()) return this;
      if (other.hasInputs()) {
        mergeInputs(other.getInputs());
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
            case 10:
              {
                input.readMessage(getInputsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        inputs_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.Builder,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputsOrBuilder>
        inputsBuilder_;
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     *
     * @return Whether the inputs field is set.
     */
    public boolean hasInputs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     *
     * @return The inputs.
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs
        getInputs() {
      if (inputsBuilder_ == null) {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.getDefaultInstance()
            : inputs_;
      } else {
        return inputsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs
            value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputs_ = value;
      } else {
        inputsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public Builder setInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.Builder
            builderForValue) {
      if (inputsBuilder_ == null) {
        inputs_ = builderForValue.build();
      } else {
        inputsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public Builder mergeInputs(
        com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs
            value) {
      if (inputsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && inputs_ != null
            && inputs_
                != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputs.getDefaultInstance()) {
          getInputsBuilder().mergeFrom(value);
        } else {
          inputs_ = value;
        }
      } else {
        inputsBuilder_.mergeFrom(value);
      }
      if (inputs_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public Builder clearInputs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inputs_ = null;
      if (inputsBuilder_ != null) {
        inputsBuilder_.dispose();
        inputsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputs.Builder
        getInputsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTrackingInputsOrBuilder
        getInputsOrBuilder() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilder();
      } else {
        return inputs_ == null
            ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.getDefaultInstance()
            : inputs_;
      }
    }
    /**
     *
     *
     * <pre>
     * The input parameters of this TrainingJob.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputs.Builder,
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                .AutoMlVideoObjectTrackingInputsOrBuilder>
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputs,
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputs.Builder,
                com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
                    .AutoMlVideoObjectTrackingInputsOrBuilder>(
                getInputs(), getParentForChildren(), isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
            .AutoMlVideoObjectTracking();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTracking
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlVideoObjectTracking> PARSER =
      new com.google.protobuf.AbstractParser<AutoMlVideoObjectTracking>() {
        @java.lang.Override
        public AutoMlVideoObjectTracking parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlVideoObjectTracking> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlVideoObjectTracking> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
