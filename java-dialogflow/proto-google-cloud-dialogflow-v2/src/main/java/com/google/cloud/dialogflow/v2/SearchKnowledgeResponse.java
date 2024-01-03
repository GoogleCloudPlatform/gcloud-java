/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/v2/conversation.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The response message for
 * [Conversations.SearchKnowledge][google.cloud.dialogflow.v2.Conversations.SearchKnowledge].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SearchKnowledgeResponse}
 */
public final class SearchKnowledgeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SearchKnowledgeResponse)
    SearchKnowledgeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchKnowledgeResponse.newBuilder() to construct.
  private SearchKnowledgeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchKnowledgeResponse() {
    answers_ = java.util.Collections.emptyList();
    rewrittenQuery_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchKnowledgeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationProto
        .internal_static_google_cloud_dialogflow_v2_SearchKnowledgeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProto
        .internal_static_google_cloud_dialogflow_v2_SearchKnowledgeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.class,
            com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.Builder.class);
  }

  public static final int ANSWERS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer> answers_;
  /**
   *
   *
   * <pre>
   * Most relevant snippets extracted from articles in the given knowledge base,
   * ordered by confidence.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer> getAnswersList() {
    return answers_;
  }
  /**
   *
   *
   * <pre>
   * Most relevant snippets extracted from articles in the given knowledge base,
   * ordered by confidence.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder>
      getAnswersOrBuilderList() {
    return answers_;
  }
  /**
   *
   *
   * <pre>
   * Most relevant snippets extracted from articles in the given knowledge base,
   * ordered by confidence.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
   */
  @java.lang.Override
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   *
   *
   * <pre>
   * Most relevant snippets extracted from articles in the given knowledge base,
   * ordered by confidence.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Most relevant snippets extracted from articles in the given knowledge base,
   * ordered by confidence.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder getAnswersOrBuilder(
      int index) {
    return answers_.get(index);
  }

  public static final int REWRITTEN_QUERY_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object rewrittenQuery_ = "";
  /**
   *
   *
   * <pre>
   * The rewritten query used to search knowledge.
   * </pre>
   *
   * <code>string rewritten_query = 3;</code>
   *
   * @return The rewrittenQuery.
   */
  @java.lang.Override
  public java.lang.String getRewrittenQuery() {
    java.lang.Object ref = rewrittenQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rewrittenQuery_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The rewritten query used to search knowledge.
   * </pre>
   *
   * <code>string rewritten_query = 3;</code>
   *
   * @return The bytes for rewrittenQuery.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRewrittenQueryBytes() {
    java.lang.Object ref = rewrittenQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      rewrittenQuery_ = b;
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
    for (int i = 0; i < answers_.size(); i++) {
      output.writeMessage(2, answers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewrittenQuery_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rewrittenQuery_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < answers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, answers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rewrittenQuery_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rewrittenQuery_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SearchKnowledgeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SearchKnowledgeResponse other =
        (com.google.cloud.dialogflow.v2.SearchKnowledgeResponse) obj;

    if (!getAnswersList().equals(other.getAnswersList())) return false;
    if (!getRewrittenQuery().equals(other.getRewrittenQuery())) return false;
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
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    hash = (37 * hash) + REWRITTEN_QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getRewrittenQuery().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse parseFrom(
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
      com.google.cloud.dialogflow.v2.SearchKnowledgeResponse prototype) {
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
   * The response message for
   * [Conversations.SearchKnowledge][google.cloud.dialogflow.v2.Conversations.SearchKnowledge].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SearchKnowledgeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SearchKnowledgeResponse)
      com.google.cloud.dialogflow.v2.SearchKnowledgeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProto
          .internal_static_google_cloud_dialogflow_v2_SearchKnowledgeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProto
          .internal_static_google_cloud_dialogflow_v2_SearchKnowledgeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.class,
              com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (answersBuilder_ == null) {
        answers_ = java.util.Collections.emptyList();
      } else {
        answers_ = null;
        answersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      rewrittenQuery_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProto
          .internal_static_google_cloud_dialogflow_v2_SearchKnowledgeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SearchKnowledgeResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SearchKnowledgeResponse build() {
      com.google.cloud.dialogflow.v2.SearchKnowledgeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SearchKnowledgeResponse buildPartial() {
      com.google.cloud.dialogflow.v2.SearchKnowledgeResponse result =
          new com.google.cloud.dialogflow.v2.SearchKnowledgeResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.v2.SearchKnowledgeResponse result) {
      if (answersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          answers_ = java.util.Collections.unmodifiableList(answers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.answers_ = answers_;
      } else {
        result.answers_ = answersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.SearchKnowledgeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rewrittenQuery_ = rewrittenQuery_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.SearchKnowledgeResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SearchKnowledgeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SearchKnowledgeResponse other) {
      if (other == com.google.cloud.dialogflow.v2.SearchKnowledgeResponse.getDefaultInstance())
        return this;
      if (answersBuilder_ == null) {
        if (!other.answers_.isEmpty()) {
          if (answers_.isEmpty()) {
            answers_ = other.answers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnswersIsMutable();
            answers_.addAll(other.answers_);
          }
          onChanged();
        }
      } else {
        if (!other.answers_.isEmpty()) {
          if (answersBuilder_.isEmpty()) {
            answersBuilder_.dispose();
            answersBuilder_ = null;
            answers_ = other.answers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            answersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnswersFieldBuilder()
                    : null;
          } else {
            answersBuilder_.addAllMessages(other.answers_);
          }
        }
      }
      if (!other.getRewrittenQuery().isEmpty()) {
        rewrittenQuery_ = other.rewrittenQuery_;
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
            case 18:
              {
                com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.parser(),
                        extensionRegistry);
                if (answersBuilder_ == null) {
                  ensureAnswersIsMutable();
                  answers_.add(m);
                } else {
                  answersBuilder_.addMessage(m);
                }
                break;
              } // case 18
            case 26:
              {
                rewrittenQuery_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer> answers_ =
        java.util.Collections.emptyList();

    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answers_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer>(answers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer,
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder,
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder>
        answersBuilder_;

    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer> getAnswersList() {
      if (answersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(answers_);
      } else {
        return answersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public int getAnswersCount() {
      if (answersBuilder_ == null) {
        return answers_.size();
      } else {
        return answersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer getAnswers(int index) {
      if (answersBuilder_ == null) {
        return answers_.get(index);
      } else {
        return answersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder setAnswers(
        int index, com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.set(index, value);
        onChanged();
      } else {
        answersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder setAnswers(
        int index, com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.set(index, builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder addAnswers(com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.add(value);
        onChanged();
      } else {
        answersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder addAnswers(
        int index, com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.add(index, value);
        onChanged();
      } else {
        answersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder addAnswers(
        com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.add(builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder addAnswers(
        int index, com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.add(index, builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder addAllAnswers(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer> values) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, answers_);
        onChanged();
      } else {
        answersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder clearAnswers() {
      if (answersBuilder_ == null) {
        answers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        answersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public Builder removeAnswers(int index) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.remove(index);
        onChanged();
      } else {
        answersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder getAnswersBuilder(
        int index) {
      return getAnswersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder getAnswersOrBuilder(
        int index) {
      if (answersBuilder_ == null) {
        return answers_.get(index);
      } else {
        return answersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder>
        getAnswersOrBuilderList() {
      if (answersBuilder_ != null) {
        return answersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(answers_);
      }
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder addAnswersBuilder() {
      return getAnswersFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder addAnswersBuilder(
        int index) {
      return getAnswersFieldBuilder()
          .addBuilder(
              index, com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Most relevant snippets extracted from articles in the given knowledge base,
     * ordered by confidence.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.SearchKnowledgeAnswer answers = 2;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder>
        getAnswersBuilderList() {
      return getAnswersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer,
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder,
            com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder>
        getAnswersFieldBuilder() {
      if (answersBuilder_ == null) {
        answersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer,
                com.google.cloud.dialogflow.v2.SearchKnowledgeAnswer.Builder,
                com.google.cloud.dialogflow.v2.SearchKnowledgeAnswerOrBuilder>(
                answers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        answers_ = null;
      }
      return answersBuilder_;
    }

    private java.lang.Object rewrittenQuery_ = "";
    /**
     *
     *
     * <pre>
     * The rewritten query used to search knowledge.
     * </pre>
     *
     * <code>string rewritten_query = 3;</code>
     *
     * @return The rewrittenQuery.
     */
    public java.lang.String getRewrittenQuery() {
      java.lang.Object ref = rewrittenQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rewrittenQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The rewritten query used to search knowledge.
     * </pre>
     *
     * <code>string rewritten_query = 3;</code>
     *
     * @return The bytes for rewrittenQuery.
     */
    public com.google.protobuf.ByteString getRewrittenQueryBytes() {
      java.lang.Object ref = rewrittenQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        rewrittenQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The rewritten query used to search knowledge.
     * </pre>
     *
     * <code>string rewritten_query = 3;</code>
     *
     * @param value The rewrittenQuery to set.
     * @return This builder for chaining.
     */
    public Builder setRewrittenQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      rewrittenQuery_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The rewritten query used to search knowledge.
     * </pre>
     *
     * <code>string rewritten_query = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRewrittenQuery() {
      rewrittenQuery_ = getDefaultInstance().getRewrittenQuery();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The rewritten query used to search knowledge.
     * </pre>
     *
     * <code>string rewritten_query = 3;</code>
     *
     * @param value The bytes for rewrittenQuery to set.
     * @return This builder for chaining.
     */
    public Builder setRewrittenQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      rewrittenQuery_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SearchKnowledgeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SearchKnowledgeResponse)
  private static final com.google.cloud.dialogflow.v2.SearchKnowledgeResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SearchKnowledgeResponse();
  }

  public static com.google.cloud.dialogflow.v2.SearchKnowledgeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchKnowledgeResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchKnowledgeResponse>() {
        @java.lang.Override
        public SearchKnowledgeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchKnowledgeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchKnowledgeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SearchKnowledgeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
