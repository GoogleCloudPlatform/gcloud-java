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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Metadata about the recognition request and response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.RecognitionResponseMetadata}
 */
public final class RecognitionResponseMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.RecognitionResponseMetadata)
    RecognitionResponseMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecognitionResponseMetadata.newBuilder() to construct.
  private RecognitionResponseMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecognitionResponseMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecognitionResponseMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_RecognitionResponseMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_RecognitionResponseMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.RecognitionResponseMetadata.class,
            com.google.cloud.speech.v2.RecognitionResponseMetadata.Builder.class);
  }

  public static final int TOTAL_BILLED_DURATION_FIELD_NUMBER = 6;
  private com.google.protobuf.Duration totalBilledDuration_;
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   *
   * @return Whether the totalBilledDuration field is set.
   */
  @java.lang.Override
  public boolean hasTotalBilledDuration() {
    return totalBilledDuration_ != null;
  }
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   *
   * @return The totalBilledDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTotalBilledDuration() {
    return totalBilledDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : totalBilledDuration_;
  }
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTotalBilledDurationOrBuilder() {
    return totalBilledDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : totalBilledDuration_;
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
    if (totalBilledDuration_ != null) {
      output.writeMessage(6, getTotalBilledDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalBilledDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getTotalBilledDuration());
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
    if (!(obj instanceof com.google.cloud.speech.v2.RecognitionResponseMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.RecognitionResponseMetadata other =
        (com.google.cloud.speech.v2.RecognitionResponseMetadata) obj;

    if (hasTotalBilledDuration() != other.hasTotalBilledDuration()) return false;
    if (hasTotalBilledDuration()) {
      if (!getTotalBilledDuration().equals(other.getTotalBilledDuration())) return false;
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
    if (hasTotalBilledDuration()) {
      hash = (37 * hash) + TOTAL_BILLED_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getTotalBilledDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata parseFrom(
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
      com.google.cloud.speech.v2.RecognitionResponseMetadata prototype) {
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
   * Metadata about the recognition request and response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.RecognitionResponseMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.RecognitionResponseMetadata)
      com.google.cloud.speech.v2.RecognitionResponseMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_RecognitionResponseMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_RecognitionResponseMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.RecognitionResponseMetadata.class,
              com.google.cloud.speech.v2.RecognitionResponseMetadata.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.RecognitionResponseMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      totalBilledDuration_ = null;
      if (totalBilledDurationBuilder_ != null) {
        totalBilledDurationBuilder_.dispose();
        totalBilledDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_RecognitionResponseMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.RecognitionResponseMetadata getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.RecognitionResponseMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.RecognitionResponseMetadata build() {
      com.google.cloud.speech.v2.RecognitionResponseMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.RecognitionResponseMetadata buildPartial() {
      com.google.cloud.speech.v2.RecognitionResponseMetadata result =
          new com.google.cloud.speech.v2.RecognitionResponseMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.RecognitionResponseMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalBilledDuration_ =
            totalBilledDurationBuilder_ == null
                ? totalBilledDuration_
                : totalBilledDurationBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v2.RecognitionResponseMetadata) {
        return mergeFrom((com.google.cloud.speech.v2.RecognitionResponseMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.RecognitionResponseMetadata other) {
      if (other == com.google.cloud.speech.v2.RecognitionResponseMetadata.getDefaultInstance())
        return this;
      if (other.hasTotalBilledDuration()) {
        mergeTotalBilledDuration(other.getTotalBilledDuration());
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
            case 50:
              {
                input.readMessage(
                    getTotalBilledDurationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 50
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

    private com.google.protobuf.Duration totalBilledDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        totalBilledDurationBuilder_;
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     *
     * @return Whether the totalBilledDuration field is set.
     */
    public boolean hasTotalBilledDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     *
     * @return The totalBilledDuration.
     */
    public com.google.protobuf.Duration getTotalBilledDuration() {
      if (totalBilledDurationBuilder_ == null) {
        return totalBilledDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : totalBilledDuration_;
      } else {
        return totalBilledDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public Builder setTotalBilledDuration(com.google.protobuf.Duration value) {
      if (totalBilledDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalBilledDuration_ = value;
      } else {
        totalBilledDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public Builder setTotalBilledDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (totalBilledDurationBuilder_ == null) {
        totalBilledDuration_ = builderForValue.build();
      } else {
        totalBilledDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public Builder mergeTotalBilledDuration(com.google.protobuf.Duration value) {
      if (totalBilledDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && totalBilledDuration_ != null
            && totalBilledDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTotalBilledDurationBuilder().mergeFrom(value);
        } else {
          totalBilledDuration_ = value;
        }
      } else {
        totalBilledDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public Builder clearTotalBilledDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalBilledDuration_ = null;
      if (totalBilledDurationBuilder_ != null) {
        totalBilledDurationBuilder_.dispose();
        totalBilledDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public com.google.protobuf.Duration.Builder getTotalBilledDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTotalBilledDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTotalBilledDurationOrBuilder() {
      if (totalBilledDurationBuilder_ != null) {
        return totalBilledDurationBuilder_.getMessageOrBuilder();
      } else {
        return totalBilledDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : totalBilledDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTotalBilledDurationFieldBuilder() {
      if (totalBilledDurationBuilder_ == null) {
        totalBilledDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTotalBilledDuration(), getParentForChildren(), isClean());
        totalBilledDuration_ = null;
      }
      return totalBilledDurationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.RecognitionResponseMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.RecognitionResponseMetadata)
  private static final com.google.cloud.speech.v2.RecognitionResponseMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.RecognitionResponseMetadata();
  }

  public static com.google.cloud.speech.v2.RecognitionResponseMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecognitionResponseMetadata> PARSER =
      new com.google.protobuf.AbstractParser<RecognitionResponseMetadata>() {
        @java.lang.Override
        public RecognitionResponseMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecognitionResponseMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognitionResponseMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.RecognitionResponseMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
