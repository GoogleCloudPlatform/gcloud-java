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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

/**
 *
 *
 * <pre>
 * A subject line of a notification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.advisorynotifications.v1.Subject}
 */
public final class Subject extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.advisorynotifications.v1.Subject)
    SubjectOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Subject.newBuilder() to construct.
  private Subject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Subject() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Subject();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.advisorynotifications.v1.ServiceProto
        .internal_static_google_cloud_advisorynotifications_v1_Subject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.advisorynotifications.v1.ServiceProto
        .internal_static_google_cloud_advisorynotifications_v1_Subject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.advisorynotifications.v1.Subject.class,
            com.google.cloud.advisorynotifications.v1.Subject.Builder.class);
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.cloud.advisorynotifications.v1.Text text_;
  /**
   *
   *
   * <pre>
   * The text content.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The text content.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
   *
   * @return The text.
   */
  @java.lang.Override
  public com.google.cloud.advisorynotifications.v1.Text getText() {
    return text_ == null
        ? com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()
        : text_;
  }
  /**
   *
   *
   * <pre>
   * The text content.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.advisorynotifications.v1.TextOrBuilder getTextOrBuilder() {
    return text_ == null
        ? com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()
        : text_;
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
      output.writeMessage(1, getText());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getText());
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
    if (!(obj instanceof com.google.cloud.advisorynotifications.v1.Subject)) {
      return super.equals(obj);
    }
    com.google.cloud.advisorynotifications.v1.Subject other =
        (com.google.cloud.advisorynotifications.v1.Subject) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText().equals(other.getText())) return false;
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.advisorynotifications.v1.Subject parseFrom(
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

  public static Builder newBuilder(com.google.cloud.advisorynotifications.v1.Subject prototype) {
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
   * A subject line of a notification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.advisorynotifications.v1.Subject}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.advisorynotifications.v1.Subject)
      com.google.cloud.advisorynotifications.v1.SubjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Subject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Subject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.advisorynotifications.v1.Subject.class,
              com.google.cloud.advisorynotifications.v1.Subject.Builder.class);
    }

    // Construct using com.google.cloud.advisorynotifications.v1.Subject.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTextFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto
          .internal_static_google_cloud_advisorynotifications_v1_Subject_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Subject getDefaultInstanceForType() {
      return com.google.cloud.advisorynotifications.v1.Subject.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Subject build() {
      com.google.cloud.advisorynotifications.v1.Subject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.advisorynotifications.v1.Subject buildPartial() {
      com.google.cloud.advisorynotifications.v1.Subject result =
          new com.google.cloud.advisorynotifications.v1.Subject(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.advisorynotifications.v1.Subject result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = textBuilder_ == null ? text_ : textBuilder_.build();
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
      if (other instanceof com.google.cloud.advisorynotifications.v1.Subject) {
        return mergeFrom((com.google.cloud.advisorynotifications.v1.Subject) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.advisorynotifications.v1.Subject other) {
      if (other == com.google.cloud.advisorynotifications.v1.Subject.getDefaultInstance())
        return this;
      if (other.hasText()) {
        mergeText(other.getText());
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
                input.readMessage(getTextFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.advisorynotifications.v1.Text text_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.advisorynotifications.v1.Text,
            com.google.cloud.advisorynotifications.v1.Text.Builder,
            com.google.cloud.advisorynotifications.v1.TextOrBuilder>
        textBuilder_;
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     *
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     *
     * @return The text.
     */
    public com.google.cloud.advisorynotifications.v1.Text getText() {
      if (textBuilder_ == null) {
        return text_ == null
            ? com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()
            : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public Builder setText(com.google.cloud.advisorynotifications.v1.Text value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
      } else {
        textBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public Builder setText(com.google.cloud.advisorynotifications.v1.Text.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public Builder mergeText(com.google.cloud.advisorynotifications.v1.Text value) {
      if (textBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && text_ != null
            && text_ != com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()) {
          getTextBuilder().mergeFrom(value);
        } else {
          text_ = value;
        }
      } else {
        textBuilder_.mergeFrom(value);
      }
      if (text_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000001);
      text_ = null;
      if (textBuilder_ != null) {
        textBuilder_.dispose();
        textBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public com.google.cloud.advisorynotifications.v1.Text.Builder getTextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    public com.google.cloud.advisorynotifications.v1.TextOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null
            ? com.google.cloud.advisorynotifications.v1.Text.getDefaultInstance()
            : text_;
      }
    }
    /**
     *
     *
     * <pre>
     * The text content.
     * </pre>
     *
     * <code>.google.cloud.advisorynotifications.v1.Text text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.advisorynotifications.v1.Text,
            com.google.cloud.advisorynotifications.v1.Text.Builder,
            com.google.cloud.advisorynotifications.v1.TextOrBuilder>
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.advisorynotifications.v1.Text,
                com.google.cloud.advisorynotifications.v1.Text.Builder,
                com.google.cloud.advisorynotifications.v1.TextOrBuilder>(
                getText(), getParentForChildren(), isClean());
        text_ = null;
      }
      return textBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.advisorynotifications.v1.Subject)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.advisorynotifications.v1.Subject)
  private static final com.google.cloud.advisorynotifications.v1.Subject DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.advisorynotifications.v1.Subject();
  }

  public static com.google.cloud.advisorynotifications.v1.Subject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Subject> PARSER =
      new com.google.protobuf.AbstractParser<Subject>() {
        @java.lang.Override
        public Subject parsePartialFrom(
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

  public static com.google.protobuf.Parser<Subject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Subject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.advisorynotifications.v1.Subject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
