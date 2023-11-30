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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

/**
 *
 *
 * <pre>
 * The top-level message sent by the client for the `ListVoices` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1.ListVoicesRequest}
 */
public final class ListVoicesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1.ListVoicesRequest)
    ListVoicesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListVoicesRequest.newBuilder() to construct.
  private ListVoicesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListVoicesRequest() {
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListVoicesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1.ListVoicesRequest.class,
            com.google.cloud.texttospeech.v1.ListVoicesRequest.Builder.class);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * If not specified, the API will return all supported voices.
   * If specified, the ListVoices call will only return voices that can be used
   * to synthesize this language_code. For example, if you specify `"en-NZ"`,
   * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
   * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
   * returned.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * If not specified, the API will return all supported voices.
   * If specified, the ListVoices call will only return voices that can be used
   * to synthesize this language_code. For example, if you specify `"en-NZ"`,
   * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
   * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
   * returned.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, languageCode_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1.ListVoicesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1.ListVoicesRequest other =
        (com.google.cloud.texttospeech.v1.ListVoicesRequest) obj;

    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
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
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.texttospeech.v1.ListVoicesRequest prototype) {
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
   * The top-level message sent by the client for the `ListVoices` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1.ListVoicesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1.ListVoicesRequest)
      com.google.cloud.texttospeech.v1.ListVoicesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1.ListVoicesRequest.class,
              com.google.cloud.texttospeech.v1.ListVoicesRequest.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1.ListVoicesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesRequest getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1.ListVoicesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesRequest build() {
      com.google.cloud.texttospeech.v1.ListVoicesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesRequest buildPartial() {
      com.google.cloud.texttospeech.v1.ListVoicesRequest result =
          new com.google.cloud.texttospeech.v1.ListVoicesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.texttospeech.v1.ListVoicesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.texttospeech.v1.ListVoicesRequest) {
        return mergeFrom((com.google.cloud.texttospeech.v1.ListVoicesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1.ListVoicesRequest other) {
      if (other == com.google.cloud.texttospeech.v1.ListVoicesRequest.getDefaultInstance())
        return this;
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        bitField0_ |= 0x00000001;
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
            case 10:
              {
                languageCode_ = input.readStringRequireUtf8();
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

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Recommended.
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
     * If not specified, the API will return all supported voices.
     * If specified, the ListVoices call will only return voices that can be used
     * to synthesize this language_code. For example, if you specify `"en-NZ"`,
     * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
     * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
     * returned.
     * </pre>
     *
     * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Recommended.
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
     * If not specified, the API will return all supported voices.
     * If specified, the ListVoices call will only return voices that can be used
     * to synthesize this language_code. For example, if you specify `"en-NZ"`,
     * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
     * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
     * returned.
     * </pre>
     *
     * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Recommended.
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
     * If not specified, the API will return all supported voices.
     * If specified, the ListVoices call will only return voices that can be used
     * to synthesize this language_code. For example, if you specify `"en-NZ"`,
     * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
     * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
     * returned.
     * </pre>
     *
     * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      languageCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Recommended.
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
     * If not specified, the API will return all supported voices.
     * If specified, the ListVoices call will only return voices that can be used
     * to synthesize this language_code. For example, if you specify `"en-NZ"`,
     * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
     * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
     * returned.
     * </pre>
     *
     * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Recommended.
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
     * If not specified, the API will return all supported voices.
     * If specified, the ListVoices call will only return voices that can be used
     * to synthesize this language_code. For example, if you specify `"en-NZ"`,
     * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
     * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
     * returned.
     * </pre>
     *
     * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1.ListVoicesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1.ListVoicesRequest)
  private static final com.google.cloud.texttospeech.v1.ListVoicesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1.ListVoicesRequest();
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVoicesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListVoicesRequest>() {
        @java.lang.Override
        public ListVoicesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVoicesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVoicesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1.ListVoicesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
