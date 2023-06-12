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
// source: google/cloud/retail/v2alpha/user_event.proto

package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Detailed completion information including completion attribution token and
 * clicked completion info.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.CompletionDetail}
 */
public final class CompletionDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.CompletionDetail)
    CompletionDetailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CompletionDetail.newBuilder() to construct.
  private CompletionDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CompletionDetail() {
    completionAttributionToken_ = "";
    selectedSuggestion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CompletionDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.UserEventProto
        .internal_static_google_cloud_retail_v2alpha_CompletionDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.UserEventProto
        .internal_static_google_cloud_retail_v2alpha_CompletionDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.CompletionDetail.class,
            com.google.cloud.retail.v2alpha.CompletionDetail.Builder.class);
  }

  public static final int COMPLETION_ATTRIBUTION_TOKEN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object completionAttributionToken_ = "";
  /**
   *
   *
   * <pre>
   * Completion attribution token in
   * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
   * </pre>
   *
   * <code>string completion_attribution_token = 1;</code>
   *
   * @return The completionAttributionToken.
   */
  @java.lang.Override
  public java.lang.String getCompletionAttributionToken() {
    java.lang.Object ref = completionAttributionToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      completionAttributionToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Completion attribution token in
   * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
   * </pre>
   *
   * <code>string completion_attribution_token = 1;</code>
   *
   * @return The bytes for completionAttributionToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCompletionAttributionTokenBytes() {
    java.lang.Object ref = completionAttributionToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      completionAttributionToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELECTED_SUGGESTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selectedSuggestion_ = "";
  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
   * </pre>
   *
   * <code>string selected_suggestion = 2;</code>
   *
   * @return The selectedSuggestion.
   */
  @java.lang.Override
  public java.lang.String getSelectedSuggestion() {
    java.lang.Object ref = selectedSuggestion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selectedSuggestion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
   * </pre>
   *
   * <code>string selected_suggestion = 2;</code>
   *
   * @return The bytes for selectedSuggestion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSelectedSuggestionBytes() {
    java.lang.Object ref = selectedSuggestion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      selectedSuggestion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELECTED_POSITION_FIELD_NUMBER = 3;
  private int selectedPosition_ = 0;
  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion]
   * position, starting from 0.
   * </pre>
   *
   * <code>int32 selected_position = 3;</code>
   *
   * @return The selectedPosition.
   */
  @java.lang.Override
  public int getSelectedPosition() {
    return selectedPosition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(completionAttributionToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, completionAttributionToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selectedSuggestion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, selectedSuggestion_);
    }
    if (selectedPosition_ != 0) {
      output.writeInt32(3, selectedPosition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(completionAttributionToken_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(1, completionAttributionToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selectedSuggestion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, selectedSuggestion_);
    }
    if (selectedPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, selectedPosition_);
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.CompletionDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.CompletionDetail other =
        (com.google.cloud.retail.v2alpha.CompletionDetail) obj;

    if (!getCompletionAttributionToken().equals(other.getCompletionAttributionToken()))
      return false;
    if (!getSelectedSuggestion().equals(other.getSelectedSuggestion())) return false;
    if (getSelectedPosition() != other.getSelectedPosition()) return false;
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
    hash = (37 * hash) + COMPLETION_ATTRIBUTION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getCompletionAttributionToken().hashCode();
    hash = (37 * hash) + SELECTED_SUGGESTION_FIELD_NUMBER;
    hash = (53 * hash) + getSelectedSuggestion().hashCode();
    hash = (37 * hash) + SELECTED_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getSelectedPosition();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2alpha.CompletionDetail prototype) {
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
   * Detailed completion information including completion attribution token and
   * clicked completion info.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.CompletionDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.CompletionDetail)
      com.google.cloud.retail.v2alpha.CompletionDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.UserEventProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.UserEventProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.CompletionDetail.class,
              com.google.cloud.retail.v2alpha.CompletionDetail.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.CompletionDetail.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      completionAttributionToken_ = "";
      selectedSuggestion_ = "";
      selectedPosition_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.UserEventProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDetail getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.CompletionDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDetail build() {
      com.google.cloud.retail.v2alpha.CompletionDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDetail buildPartial() {
      com.google.cloud.retail.v2alpha.CompletionDetail result =
          new com.google.cloud.retail.v2alpha.CompletionDetail(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.CompletionDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.completionAttributionToken_ = completionAttributionToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.selectedSuggestion_ = selectedSuggestion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.selectedPosition_ = selectedPosition_;
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
      if (other instanceof com.google.cloud.retail.v2alpha.CompletionDetail) {
        return mergeFrom((com.google.cloud.retail.v2alpha.CompletionDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.CompletionDetail other) {
      if (other == com.google.cloud.retail.v2alpha.CompletionDetail.getDefaultInstance())
        return this;
      if (!other.getCompletionAttributionToken().isEmpty()) {
        completionAttributionToken_ = other.completionAttributionToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSelectedSuggestion().isEmpty()) {
        selectedSuggestion_ = other.selectedSuggestion_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getSelectedPosition() != 0) {
        setSelectedPosition(other.getSelectedPosition());
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
                completionAttributionToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                selectedSuggestion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                selectedPosition_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object completionAttributionToken_ = "";
    /**
     *
     *
     * <pre>
     * Completion attribution token in
     * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
     * </pre>
     *
     * <code>string completion_attribution_token = 1;</code>
     *
     * @return The completionAttributionToken.
     */
    public java.lang.String getCompletionAttributionToken() {
      java.lang.Object ref = completionAttributionToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        completionAttributionToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Completion attribution token in
     * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
     * </pre>
     *
     * <code>string completion_attribution_token = 1;</code>
     *
     * @return The bytes for completionAttributionToken.
     */
    public com.google.protobuf.ByteString getCompletionAttributionTokenBytes() {
      java.lang.Object ref = completionAttributionToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        completionAttributionToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Completion attribution token in
     * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
     * </pre>
     *
     * <code>string completion_attribution_token = 1;</code>
     *
     * @param value The completionAttributionToken to set.
     * @return This builder for chaining.
     */
    public Builder setCompletionAttributionToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      completionAttributionToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Completion attribution token in
     * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
     * </pre>
     *
     * <code>string completion_attribution_token = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCompletionAttributionToken() {
      completionAttributionToken_ = getDefaultInstance().getCompletionAttributionToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Completion attribution token in
     * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2alpha.CompleteQueryResponse.attribution_token].
     * </pre>
     *
     * <code>string completion_attribution_token = 1;</code>
     *
     * @param value The bytes for completionAttributionToken to set.
     * @return This builder for chaining.
     */
    public Builder setCompletionAttributionTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      completionAttributionToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object selectedSuggestion_ = "";
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
     * </pre>
     *
     * <code>string selected_suggestion = 2;</code>
     *
     * @return The selectedSuggestion.
     */
    public java.lang.String getSelectedSuggestion() {
      java.lang.Object ref = selectedSuggestion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selectedSuggestion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
     * </pre>
     *
     * <code>string selected_suggestion = 2;</code>
     *
     * @return The bytes for selectedSuggestion.
     */
    public com.google.protobuf.ByteString getSelectedSuggestionBytes() {
      java.lang.Object ref = selectedSuggestion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        selectedSuggestion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
     * </pre>
     *
     * <code>string selected_suggestion = 2;</code>
     *
     * @param value The selectedSuggestion to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedSuggestion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      selectedSuggestion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
     * </pre>
     *
     * <code>string selected_suggestion = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSelectedSuggestion() {
      selectedSuggestion_ = getDefaultInstance().getSelectedSuggestion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion].
     * </pre>
     *
     * <code>string selected_suggestion = 2;</code>
     *
     * @param value The bytes for selectedSuggestion to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedSuggestionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      selectedSuggestion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int selectedPosition_;
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion]
     * position, starting from 0.
     * </pre>
     *
     * <code>int32 selected_position = 3;</code>
     *
     * @return The selectedPosition.
     */
    @java.lang.Override
    public int getSelectedPosition() {
      return selectedPosition_;
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion]
     * position, starting from 0.
     * </pre>
     *
     * <code>int32 selected_position = 3;</code>
     *
     * @param value The selectedPosition to set.
     * @return This builder for chaining.
     */
    public Builder setSelectedPosition(int value) {

      selectedPosition_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * End user selected
     * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2alpha.CompleteQueryResponse.CompletionResult.suggestion]
     * position, starting from 0.
     * </pre>
     *
     * <code>int32 selected_position = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSelectedPosition() {
      bitField0_ = (bitField0_ & ~0x00000004);
      selectedPosition_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.CompletionDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompletionDetail)
  private static final com.google.cloud.retail.v2alpha.CompletionDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.CompletionDetail();
  }

  public static com.google.cloud.retail.v2alpha.CompletionDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompletionDetail> PARSER =
      new com.google.protobuf.AbstractParser<CompletionDetail>() {
        @java.lang.Override
        public CompletionDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompletionDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompletionDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.CompletionDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
