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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Configuration to suppress records whose suppression conditions evaluate to
 * true.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.RecordSuppression}
 */
public final class RecordSuppression extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.RecordSuppression)
    RecordSuppressionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecordSuppression.newBuilder() to construct.
  private RecordSuppression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecordSuppression() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecordSuppression();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RecordSuppression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RecordSuppression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.RecordSuppression.class,
            com.google.privacy.dlp.v2.RecordSuppression.Builder.class);
  }

  public static final int CONDITION_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.RecordCondition condition_;
  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   *
   * @return Whether the condition field is set.
   */
  @java.lang.Override
  public boolean hasCondition() {
    return condition_ != null;
  }
  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   *
   * @return The condition.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordCondition getCondition() {
    return condition_ == null
        ? com.google.privacy.dlp.v2.RecordCondition.getDefaultInstance()
        : condition_;
  }
  /**
   *
   *
   * <pre>
   * A condition that when it evaluates to true will result in the record being
   * evaluated to be suppressed from the transformed content.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordConditionOrBuilder getConditionOrBuilder() {
    return condition_ == null
        ? com.google.privacy.dlp.v2.RecordCondition.getDefaultInstance()
        : condition_;
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
    if (condition_ != null) {
      output.writeMessage(1, getCondition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (condition_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCondition());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.RecordSuppression)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.RecordSuppression other =
        (com.google.privacy.dlp.v2.RecordSuppression) obj;

    if (hasCondition() != other.hasCondition()) return false;
    if (hasCondition()) {
      if (!getCondition().equals(other.getCondition())) return false;
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
    if (hasCondition()) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getCondition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordSuppression parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.RecordSuppression prototype) {
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
   * Configuration to suppress records whose suppression conditions evaluate to
   * true.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.RecordSuppression}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.RecordSuppression)
      com.google.privacy.dlp.v2.RecordSuppressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordSuppression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordSuppression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.RecordSuppression.class,
              com.google.privacy.dlp.v2.RecordSuppression.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.RecordSuppression.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      condition_ = null;
      if (conditionBuilder_ != null) {
        conditionBuilder_.dispose();
        conditionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordSuppression_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordSuppression getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.RecordSuppression.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordSuppression build() {
      com.google.privacy.dlp.v2.RecordSuppression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordSuppression buildPartial() {
      com.google.privacy.dlp.v2.RecordSuppression result =
          new com.google.privacy.dlp.v2.RecordSuppression(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.RecordSuppression result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.condition_ = conditionBuilder_ == null ? condition_ : conditionBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.RecordSuppression) {
        return mergeFrom((com.google.privacy.dlp.v2.RecordSuppression) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.RecordSuppression other) {
      if (other == com.google.privacy.dlp.v2.RecordSuppression.getDefaultInstance()) return this;
      if (other.hasCondition()) {
        mergeCondition(other.getCondition());
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
                input.readMessage(getConditionFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.privacy.dlp.v2.RecordCondition condition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.RecordCondition,
            com.google.privacy.dlp.v2.RecordCondition.Builder,
            com.google.privacy.dlp.v2.RecordConditionOrBuilder>
        conditionBuilder_;
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     *
     * @return Whether the condition field is set.
     */
    public boolean hasCondition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     *
     * @return The condition.
     */
    public com.google.privacy.dlp.v2.RecordCondition getCondition() {
      if (conditionBuilder_ == null) {
        return condition_ == null
            ? com.google.privacy.dlp.v2.RecordCondition.getDefaultInstance()
            : condition_;
      } else {
        return conditionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public Builder setCondition(com.google.privacy.dlp.v2.RecordCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        condition_ = value;
      } else {
        conditionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public Builder setCondition(com.google.privacy.dlp.v2.RecordCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        condition_ = builderForValue.build();
      } else {
        conditionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public Builder mergeCondition(com.google.privacy.dlp.v2.RecordCondition value) {
      if (conditionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && condition_ != null
            && condition_ != com.google.privacy.dlp.v2.RecordCondition.getDefaultInstance()) {
          getConditionBuilder().mergeFrom(value);
        } else {
          condition_ = value;
        }
      } else {
        conditionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public Builder clearCondition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      condition_ = null;
      if (conditionBuilder_ != null) {
        conditionBuilder_.dispose();
        conditionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public com.google.privacy.dlp.v2.RecordCondition.Builder getConditionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConditionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    public com.google.privacy.dlp.v2.RecordConditionOrBuilder getConditionOrBuilder() {
      if (conditionBuilder_ != null) {
        return conditionBuilder_.getMessageOrBuilder();
      } else {
        return condition_ == null
            ? com.google.privacy.dlp.v2.RecordCondition.getDefaultInstance()
            : condition_;
      }
    }
    /**
     *
     *
     * <pre>
     * A condition that when it evaluates to true will result in the record being
     * evaluated to be suppressed from the transformed content.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordCondition condition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.RecordCondition,
            com.google.privacy.dlp.v2.RecordCondition.Builder,
            com.google.privacy.dlp.v2.RecordConditionOrBuilder>
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        conditionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.RecordCondition,
                com.google.privacy.dlp.v2.RecordCondition.Builder,
                com.google.privacy.dlp.v2.RecordConditionOrBuilder>(
                getCondition(), getParentForChildren(), isClean());
        condition_ = null;
      }
      return conditionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.RecordSuppression)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.RecordSuppression)
  private static final com.google.privacy.dlp.v2.RecordSuppression DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.RecordSuppression();
  }

  public static com.google.privacy.dlp.v2.RecordSuppression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordSuppression> PARSER =
      new com.google.protobuf.AbstractParser<RecordSuppression>() {
        @java.lang.Override
        public RecordSuppression parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordSuppression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordSuppression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordSuppression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
