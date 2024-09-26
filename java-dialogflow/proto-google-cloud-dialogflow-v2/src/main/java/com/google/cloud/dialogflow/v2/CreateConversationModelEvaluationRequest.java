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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for
 * [ConversationModels.CreateConversationModelEvaluation][google.cloud.dialogflow.v2.ConversationModels.CreateConversationModelEvaluation]
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest}
 */
public final class CreateConversationModelEvaluationRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)
    CreateConversationModelEvaluationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversationModelEvaluationRequest.newBuilder() to construct.
  private CreateConversationModelEvaluationRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversationModelEvaluationRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversationModelEvaluationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest.class,
            com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The conversation model resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation model resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERSATION_MODEL_EVALUATION_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.ConversationModelEvaluation conversationModelEvaluation_;
  /**
   *
   *
   * <pre>
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationModelEvaluation field is set.
   */
  @java.lang.Override
  public boolean hasConversationModelEvaluation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationModelEvaluation.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModelEvaluation
      getConversationModelEvaluation() {
    return conversationModelEvaluation_ == null
        ? com.google.cloud.dialogflow.v2.ConversationModelEvaluation.getDefaultInstance()
        : conversationModelEvaluation_;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation model evaluation to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder
      getConversationModelEvaluationOrBuilder() {
    return conversationModelEvaluation_ == null
        ? com.google.cloud.dialogflow.v2.ConversationModelEvaluation.getDefaultInstance()
        : conversationModelEvaluation_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getConversationModelEvaluation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getConversationModelEvaluation());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest other =
        (com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasConversationModelEvaluation() != other.hasConversationModelEvaluation()) return false;
    if (hasConversationModelEvaluation()) {
      if (!getConversationModelEvaluation().equals(other.getConversationModelEvaluation()))
        return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasConversationModelEvaluation()) {
      hash = (37 * hash) + CONVERSATION_MODEL_EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversationModelEvaluation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest prototype) {
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
   * The request message for
   * [ConversationModels.CreateConversationModelEvaluation][google.cloud.dialogflow.v2.ConversationModels.CreateConversationModelEvaluation]
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)
      com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest.class,
              com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getConversationModelEvaluationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      conversationModelEvaluation_ = null;
      if (conversationModelEvaluationBuilder_ != null) {
        conversationModelEvaluationBuilder_.dispose();
        conversationModelEvaluationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationModelEvaluationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest build() {
      com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest result =
          new com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversationModelEvaluation_ =
            conversationModelEvaluationBuilder_ == null
                ? conversationModelEvaluation_
                : conversationModelEvaluationBuilder_.build();
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
          instanceof com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest) {
        return mergeFrom(
            (com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversationModelEvaluation()) {
        mergeConversationModelEvaluation(other.getConversationModelEvaluation());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getConversationModelEvaluationFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The conversation model resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationModels/&lt;Conversation Model ID&gt;`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.ConversationModelEvaluation conversationModelEvaluation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationModelEvaluation,
            com.google.cloud.dialogflow.v2.ConversationModelEvaluation.Builder,
            com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder>
        conversationModelEvaluationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversationModelEvaluation field is set.
     */
    public boolean hasConversationModelEvaluation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversationModelEvaluation.
     */
    public com.google.cloud.dialogflow.v2.ConversationModelEvaluation
        getConversationModelEvaluation() {
      if (conversationModelEvaluationBuilder_ == null) {
        return conversationModelEvaluation_ == null
            ? com.google.cloud.dialogflow.v2.ConversationModelEvaluation.getDefaultInstance()
            : conversationModelEvaluation_;
      } else {
        return conversationModelEvaluationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationModelEvaluation(
        com.google.cloud.dialogflow.v2.ConversationModelEvaluation value) {
      if (conversationModelEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversationModelEvaluation_ = value;
      } else {
        conversationModelEvaluationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationModelEvaluation(
        com.google.cloud.dialogflow.v2.ConversationModelEvaluation.Builder builderForValue) {
      if (conversationModelEvaluationBuilder_ == null) {
        conversationModelEvaluation_ = builderForValue.build();
      } else {
        conversationModelEvaluationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversationModelEvaluation(
        com.google.cloud.dialogflow.v2.ConversationModelEvaluation value) {
      if (conversationModelEvaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && conversationModelEvaluation_ != null
            && conversationModelEvaluation_
                != com.google.cloud.dialogflow.v2.ConversationModelEvaluation
                    .getDefaultInstance()) {
          getConversationModelEvaluationBuilder().mergeFrom(value);
        } else {
          conversationModelEvaluation_ = value;
        }
      } else {
        conversationModelEvaluationBuilder_.mergeFrom(value);
      }
      if (conversationModelEvaluation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversationModelEvaluation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conversationModelEvaluation_ = null;
      if (conversationModelEvaluationBuilder_ != null) {
        conversationModelEvaluationBuilder_.dispose();
        conversationModelEvaluationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModelEvaluation.Builder
        getConversationModelEvaluationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversationModelEvaluationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder
        getConversationModelEvaluationOrBuilder() {
      if (conversationModelEvaluationBuilder_ != null) {
        return conversationModelEvaluationBuilder_.getMessageOrBuilder();
      } else {
        return conversationModelEvaluation_ == null
            ? com.google.cloud.dialogflow.v2.ConversationModelEvaluation.getDefaultInstance()
            : conversationModelEvaluation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation model evaluation to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationModelEvaluation conversation_model_evaluation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationModelEvaluation,
            com.google.cloud.dialogflow.v2.ConversationModelEvaluation.Builder,
            com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder>
        getConversationModelEvaluationFieldBuilder() {
      if (conversationModelEvaluationBuilder_ == null) {
        conversationModelEvaluationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ConversationModelEvaluation,
                com.google.cloud.dialogflow.v2.ConversationModelEvaluation.Builder,
                com.google.cloud.dialogflow.v2.ConversationModelEvaluationOrBuilder>(
                getConversationModelEvaluation(), getParentForChildren(), isClean());
        conversationModelEvaluation_ = null;
      }
      return conversationModelEvaluationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest)
  private static final com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationModelEvaluationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConversationModelEvaluationRequest>() {
        @java.lang.Override
        public CreateConversationModelEvaluationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConversationModelEvaluationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationModelEvaluationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateConversationModelEvaluationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
