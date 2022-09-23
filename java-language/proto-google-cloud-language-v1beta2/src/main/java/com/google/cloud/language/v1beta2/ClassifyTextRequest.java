/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

/**
 *
 *
 * <pre>
 * The document classification request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1beta2.ClassifyTextRequest}
 */
public final class ClassifyTextRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1beta2.ClassifyTextRequest)
    ClassifyTextRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClassifyTextRequest.newBuilder() to construct.
  private ClassifyTextRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClassifyTextRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClassifyTextRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ClassifyTextRequest(
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
              com.google.cloud.language.v1beta2.Document.Builder subBuilder = null;
              if (document_ != null) {
                subBuilder = document_.toBuilder();
              }
              document_ =
                  input.readMessage(
                      com.google.cloud.language.v1beta2.Document.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(document_);
                document_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder subBuilder =
                  null;
              if (classificationModelOptions_ != null) {
                subBuilder = classificationModelOptions_.toBuilder();
              }
              classificationModelOptions_ =
                  input.readMessage(
                      com.google.cloud.language.v1beta2.ClassificationModelOptions.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(classificationModelOptions_);
                classificationModelOptions_ = subBuilder.buildPartial();
              }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_ClassifyTextRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_ClassifyTextRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1beta2.ClassifyTextRequest.class,
            com.google.cloud.language.v1beta2.ClassifyTextRequest.Builder.class);
  }

  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1beta2.Document document_;
  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.Document getDocument() {
    return document_ == null
        ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
        : document_;
  }
  /**
   *
   *
   * <pre>
   * Required. Input document.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
  }

  public static final int CLASSIFICATION_MODEL_OPTIONS_FIELD_NUMBER = 3;
  private com.google.cloud.language.v1beta2.ClassificationModelOptions classificationModelOptions_;
  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
   * </code>
   *
   * @return Whether the classificationModelOptions field is set.
   */
  @java.lang.Override
  public boolean hasClassificationModelOptions() {
    return classificationModelOptions_ != null;
  }
  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
   * </code>
   *
   * @return The classificationModelOptions.
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.ClassificationModelOptions
      getClassificationModelOptions() {
    return classificationModelOptions_ == null
        ? com.google.cloud.language.v1beta2.ClassificationModelOptions.getDefaultInstance()
        : classificationModelOptions_;
  }
  /**
   *
   *
   * <pre>
   * Model options to use for classification. Defaults to v1 options if not
   * specified.
   * </pre>
   *
   * <code>
   * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.language.v1beta2.ClassificationModelOptionsOrBuilder
      getClassificationModelOptionsOrBuilder() {
    return getClassificationModelOptions();
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
    if (document_ != null) {
      output.writeMessage(1, getDocument());
    }
    if (classificationModelOptions_ != null) {
      output.writeMessage(3, getClassificationModelOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDocument());
    }
    if (classificationModelOptions_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, getClassificationModelOptions());
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
    if (!(obj instanceof com.google.cloud.language.v1beta2.ClassifyTextRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1beta2.ClassifyTextRequest other =
        (com.google.cloud.language.v1beta2.ClassifyTextRequest) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument().equals(other.getDocument())) return false;
    }
    if (hasClassificationModelOptions() != other.hasClassificationModelOptions()) return false;
    if (hasClassificationModelOptions()) {
      if (!getClassificationModelOptions().equals(other.getClassificationModelOptions()))
        return false;
    }
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    if (hasClassificationModelOptions()) {
      hash = (37 * hash) + CLASSIFICATION_MODEL_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getClassificationModelOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest parseFrom(
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
      com.google.cloud.language.v1beta2.ClassifyTextRequest prototype) {
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
   * The document classification request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1beta2.ClassifyTextRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1beta2.ClassifyTextRequest)
      com.google.cloud.language.v1beta2.ClassifyTextRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ClassifyTextRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ClassifyTextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1beta2.ClassifyTextRequest.class,
              com.google.cloud.language.v1beta2.ClassifyTextRequest.Builder.class);
    }

    // Construct using com.google.cloud.language.v1beta2.ClassifyTextRequest.newBuilder()
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
      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      if (classificationModelOptionsBuilder_ == null) {
        classificationModelOptions_ = null;
      } else {
        classificationModelOptions_ = null;
        classificationModelOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_ClassifyTextRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ClassifyTextRequest getDefaultInstanceForType() {
      return com.google.cloud.language.v1beta2.ClassifyTextRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ClassifyTextRequest build() {
      com.google.cloud.language.v1beta2.ClassifyTextRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.ClassifyTextRequest buildPartial() {
      com.google.cloud.language.v1beta2.ClassifyTextRequest result =
          new com.google.cloud.language.v1beta2.ClassifyTextRequest(this);
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
      }
      if (classificationModelOptionsBuilder_ == null) {
        result.classificationModelOptions_ = classificationModelOptions_;
      } else {
        result.classificationModelOptions_ = classificationModelOptionsBuilder_.build();
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
      if (other instanceof com.google.cloud.language.v1beta2.ClassifyTextRequest) {
        return mergeFrom((com.google.cloud.language.v1beta2.ClassifyTextRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1beta2.ClassifyTextRequest other) {
      if (other == com.google.cloud.language.v1beta2.ClassifyTextRequest.getDefaultInstance())
        return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (other.hasClassificationModelOptions()) {
        mergeClassificationModelOptions(other.getClassificationModelOptions());
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
      com.google.cloud.language.v1beta2.ClassifyTextRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.language.v1beta2.ClassifyTextRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1beta2.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.Document,
            com.google.cloud.language.v1beta2.Document.Builder,
            com.google.cloud.language.v1beta2.DocumentOrBuilder>
        documentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The document.
     */
    public com.google.cloud.language.v1beta2.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null
            ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
            : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDocument(com.google.cloud.language.v1beta2.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDocument(com.google.cloud.language.v1beta2.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDocument(com.google.cloud.language.v1beta2.Document value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
              com.google.cloud.language.v1beta2.Document.newBuilder(document_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.language.v1beta2.Document.Builder getDocumentBuilder() {

      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null
            ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
            : document_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Input document.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.Document,
            com.google.cloud.language.v1beta2.Document.Builder,
            com.google.cloud.language.v1beta2.DocumentOrBuilder>
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.language.v1beta2.Document,
                com.google.cloud.language.v1beta2.Document.Builder,
                com.google.cloud.language.v1beta2.DocumentOrBuilder>(
                getDocument(), getParentForChildren(), isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private com.google.cloud.language.v1beta2.ClassificationModelOptions
        classificationModelOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.ClassificationModelOptions,
            com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder,
            com.google.cloud.language.v1beta2.ClassificationModelOptionsOrBuilder>
        classificationModelOptionsBuilder_;
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     *
     * @return Whether the classificationModelOptions field is set.
     */
    public boolean hasClassificationModelOptions() {
      return classificationModelOptionsBuilder_ != null || classificationModelOptions_ != null;
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     *
     * @return The classificationModelOptions.
     */
    public com.google.cloud.language.v1beta2.ClassificationModelOptions
        getClassificationModelOptions() {
      if (classificationModelOptionsBuilder_ == null) {
        return classificationModelOptions_ == null
            ? com.google.cloud.language.v1beta2.ClassificationModelOptions.getDefaultInstance()
            : classificationModelOptions_;
      } else {
        return classificationModelOptionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public Builder setClassificationModelOptions(
        com.google.cloud.language.v1beta2.ClassificationModelOptions value) {
      if (classificationModelOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        classificationModelOptions_ = value;
        onChanged();
      } else {
        classificationModelOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public Builder setClassificationModelOptions(
        com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder builderForValue) {
      if (classificationModelOptionsBuilder_ == null) {
        classificationModelOptions_ = builderForValue.build();
        onChanged();
      } else {
        classificationModelOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public Builder mergeClassificationModelOptions(
        com.google.cloud.language.v1beta2.ClassificationModelOptions value) {
      if (classificationModelOptionsBuilder_ == null) {
        if (classificationModelOptions_ != null) {
          classificationModelOptions_ =
              com.google.cloud.language.v1beta2.ClassificationModelOptions.newBuilder(
                      classificationModelOptions_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          classificationModelOptions_ = value;
        }
        onChanged();
      } else {
        classificationModelOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public Builder clearClassificationModelOptions() {
      if (classificationModelOptionsBuilder_ == null) {
        classificationModelOptions_ = null;
        onChanged();
      } else {
        classificationModelOptions_ = null;
        classificationModelOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder
        getClassificationModelOptionsBuilder() {

      onChanged();
      return getClassificationModelOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    public com.google.cloud.language.v1beta2.ClassificationModelOptionsOrBuilder
        getClassificationModelOptionsOrBuilder() {
      if (classificationModelOptionsBuilder_ != null) {
        return classificationModelOptionsBuilder_.getMessageOrBuilder();
      } else {
        return classificationModelOptions_ == null
            ? com.google.cloud.language.v1beta2.ClassificationModelOptions.getDefaultInstance()
            : classificationModelOptions_;
      }
    }
    /**
     *
     *
     * <pre>
     * Model options to use for classification. Defaults to v1 options if not
     * specified.
     * </pre>
     *
     * <code>
     * .google.cloud.language.v1beta2.ClassificationModelOptions classification_model_options = 3;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.ClassificationModelOptions,
            com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder,
            com.google.cloud.language.v1beta2.ClassificationModelOptionsOrBuilder>
        getClassificationModelOptionsFieldBuilder() {
      if (classificationModelOptionsBuilder_ == null) {
        classificationModelOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.language.v1beta2.ClassificationModelOptions,
                com.google.cloud.language.v1beta2.ClassificationModelOptions.Builder,
                com.google.cloud.language.v1beta2.ClassificationModelOptionsOrBuilder>(
                getClassificationModelOptions(), getParentForChildren(), isClean());
        classificationModelOptions_ = null;
      }
      return classificationModelOptionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1beta2.ClassifyTextRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1beta2.ClassifyTextRequest)
  private static final com.google.cloud.language.v1beta2.ClassifyTextRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1beta2.ClassifyTextRequest();
  }

  public static com.google.cloud.language.v1beta2.ClassifyTextRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassifyTextRequest> PARSER =
      new com.google.protobuf.AbstractParser<ClassifyTextRequest>() {
        @java.lang.Override
        public ClassifyTextRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ClassifyTextRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ClassifyTextRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassifyTextRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.language.v1beta2.ClassifyTextRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
