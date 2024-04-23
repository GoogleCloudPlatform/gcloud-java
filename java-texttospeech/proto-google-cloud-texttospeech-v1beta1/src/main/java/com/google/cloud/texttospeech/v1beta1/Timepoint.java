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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.texttospeech.v1beta1;

/**
 *
 *
 * <pre>
 * This contains a mapping between a certain point in the input text and a
 * corresponding time in the output audio.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1beta1.Timepoint}
 */
public final class Timepoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1beta1.Timepoint)
    TimepointOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Timepoint.newBuilder() to construct.
  private Timepoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Timepoint() {
    markName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Timepoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1beta1_Timepoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1beta1.Timepoint.class,
            com.google.cloud.texttospeech.v1beta1.Timepoint.Builder.class);
  }

  public static final int MARK_NAME_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object markName_ = "";
  /**
   *
   *
   * <pre>
   * Timepoint name as received from the client within `&lt;mark&gt;` tag.
   * </pre>
   *
   * <code>string mark_name = 4;</code>
   *
   * @return The markName.
   */
  @java.lang.Override
  public java.lang.String getMarkName() {
    java.lang.Object ref = markName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      markName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Timepoint name as received from the client within `&lt;mark&gt;` tag.
   * </pre>
   *
   * <code>string mark_name = 4;</code>
   *
   * @return The bytes for markName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMarkNameBytes() {
    java.lang.Object ref = markName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      markName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_SECONDS_FIELD_NUMBER = 3;
  private double timeSeconds_ = 0D;
  /**
   *
   *
   * <pre>
   * Time offset in seconds from the start of the synthesized audio.
   * </pre>
   *
   * <code>double time_seconds = 3;</code>
   *
   * @return The timeSeconds.
   */
  @java.lang.Override
  public double getTimeSeconds() {
    return timeSeconds_;
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
    if (java.lang.Double.doubleToRawLongBits(timeSeconds_) != 0) {
      output.writeDouble(3, timeSeconds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(markName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, markName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(timeSeconds_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, timeSeconds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(markName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, markName_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1beta1.Timepoint)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1beta1.Timepoint other =
        (com.google.cloud.texttospeech.v1beta1.Timepoint) obj;

    if (!getMarkName().equals(other.getMarkName())) return false;
    if (java.lang.Double.doubleToLongBits(getTimeSeconds())
        != java.lang.Double.doubleToLongBits(other.getTimeSeconds())) return false;
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
    hash = (37 * hash) + MARK_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMarkName().hashCode();
    hash = (37 * hash) + TIME_SECONDS_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTimeSeconds()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint parseFrom(
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

  public static Builder newBuilder(com.google.cloud.texttospeech.v1beta1.Timepoint prototype) {
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
   * This contains a mapping between a certain point in the input text and a
   * corresponding time in the output audio.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1beta1.Timepoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1beta1.Timepoint)
      com.google.cloud.texttospeech.v1beta1.TimepointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Timepoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1beta1.Timepoint.class,
              com.google.cloud.texttospeech.v1beta1.Timepoint.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1beta1.Timepoint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      markName_ = "";
      timeSeconds_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Timepoint getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1beta1.Timepoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Timepoint build() {
      com.google.cloud.texttospeech.v1beta1.Timepoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.Timepoint buildPartial() {
      com.google.cloud.texttospeech.v1beta1.Timepoint result =
          new com.google.cloud.texttospeech.v1beta1.Timepoint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.texttospeech.v1beta1.Timepoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.markName_ = markName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeSeconds_ = timeSeconds_;
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
      if (other instanceof com.google.cloud.texttospeech.v1beta1.Timepoint) {
        return mergeFrom((com.google.cloud.texttospeech.v1beta1.Timepoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1beta1.Timepoint other) {
      if (other == com.google.cloud.texttospeech.v1beta1.Timepoint.getDefaultInstance())
        return this;
      if (!other.getMarkName().isEmpty()) {
        markName_ = other.markName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getTimeSeconds() != 0D) {
        setTimeSeconds(other.getTimeSeconds());
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
            case 25:
              {
                timeSeconds_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 25
            case 34:
              {
                markName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 34
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

    private java.lang.Object markName_ = "";
    /**
     *
     *
     * <pre>
     * Timepoint name as received from the client within `&lt;mark&gt;` tag.
     * </pre>
     *
     * <code>string mark_name = 4;</code>
     *
     * @return The markName.
     */
    public java.lang.String getMarkName() {
      java.lang.Object ref = markName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        markName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Timepoint name as received from the client within `&lt;mark&gt;` tag.
     * </pre>
     *
     * <code>string mark_name = 4;</code>
     *
     * @return The bytes for markName.
     */
    public com.google.protobuf.ByteString getMarkNameBytes() {
      java.lang.Object ref = markName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        markName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Timepoint name as received from the client within `&lt;mark&gt;` tag.
     * </pre>
     *
     * <code>string mark_name = 4;</code>
     *
     * @param value The markName to set.
     * @return This builder for chaining.
     */
    public Builder setMarkName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      markName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timepoint name as received from the client within `&lt;mark&gt;` tag.
     * </pre>
     *
     * <code>string mark_name = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMarkName() {
      markName_ = getDefaultInstance().getMarkName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timepoint name as received from the client within `&lt;mark&gt;` tag.
     * </pre>
     *
     * <code>string mark_name = 4;</code>
     *
     * @param value The bytes for markName to set.
     * @return This builder for chaining.
     */
    public Builder setMarkNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      markName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double timeSeconds_;
    /**
     *
     *
     * <pre>
     * Time offset in seconds from the start of the synthesized audio.
     * </pre>
     *
     * <code>double time_seconds = 3;</code>
     *
     * @return The timeSeconds.
     */
    @java.lang.Override
    public double getTimeSeconds() {
      return timeSeconds_;
    }
    /**
     *
     *
     * <pre>
     * Time offset in seconds from the start of the synthesized audio.
     * </pre>
     *
     * <code>double time_seconds = 3;</code>
     *
     * @param value The timeSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSeconds(double value) {

      timeSeconds_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time offset in seconds from the start of the synthesized audio.
     * </pre>
     *
     * <code>double time_seconds = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeSeconds() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeSeconds_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1beta1.Timepoint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1beta1.Timepoint)
  private static final com.google.cloud.texttospeech.v1beta1.Timepoint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1beta1.Timepoint();
  }

  public static com.google.cloud.texttospeech.v1beta1.Timepoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timepoint> PARSER =
      new com.google.protobuf.AbstractParser<Timepoint>() {
        @java.lang.Override
        public Timepoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<Timepoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timepoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1beta1.Timepoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
