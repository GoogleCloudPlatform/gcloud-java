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
// source: google/cloud/video/stitcher/v1/stitch_details.proto

package com.google.cloud.video.stitcher.v1;

/**
 *
 *
 * <pre>
 * Detailed information related to the interstitial of a VOD session.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.VodStitchDetail}
 */
public final class VodStitchDetail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.VodStitchDetail)
    VodStitchDetailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VodStitchDetail.newBuilder() to construct.
  private VodStitchDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VodStitchDetail() {
    name_ = "";
    adStitchDetails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VodStitchDetail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VodStitchDetail(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                adStitchDetails_ =
                    new java.util.ArrayList<com.google.cloud.video.stitcher.v1.AdStitchDetail>();
                mutable_bitField0_ |= 0x00000001;
              }
              adStitchDetails_.add(
                  input.readMessage(
                      com.google.cloud.video.stitcher.v1.AdStitchDetail.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        adStitchDetails_ = java.util.Collections.unmodifiableList(adStitchDetails_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.stitcher.v1.StitchDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_VodStitchDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.StitchDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_VodStitchDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.VodStitchDetail.class,
            com.google.cloud.video.stitcher.v1.VodStitchDetail.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name of the stitch detail in the specified VOD session, in the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the stitch detail in the specified VOD session, in the form of
   * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_STITCH_DETAILS_FIELD_NUMBER = 3;
  private java.util.List<com.google.cloud.video.stitcher.v1.AdStitchDetail> adStitchDetails_;
  /**
   *
   *
   * <pre>
   * A list of ad processing details for the fetched ad playlist.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.video.stitcher.v1.AdStitchDetail>
      getAdStitchDetailsList() {
    return adStitchDetails_;
  }
  /**
   *
   *
   * <pre>
   * A list of ad processing details for the fetched ad playlist.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder>
      getAdStitchDetailsOrBuilderList() {
    return adStitchDetails_;
  }
  /**
   *
   *
   * <pre>
   * A list of ad processing details for the fetched ad playlist.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
   */
  @java.lang.Override
  public int getAdStitchDetailsCount() {
    return adStitchDetails_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of ad processing details for the fetched ad playlist.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AdStitchDetail getAdStitchDetails(int index) {
    return adStitchDetails_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of ad processing details for the fetched ad playlist.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder getAdStitchDetailsOrBuilder(
      int index) {
    return adStitchDetails_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < adStitchDetails_.size(); i++) {
      output.writeMessage(3, adStitchDetails_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < adStitchDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, adStitchDetails_.get(i));
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.VodStitchDetail)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.VodStitchDetail other =
        (com.google.cloud.video.stitcher.v1.VodStitchDetail) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAdStitchDetailsList().equals(other.getAdStitchDetailsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getAdStitchDetailsCount() > 0) {
      hash = (37 * hash) + AD_STITCH_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getAdStitchDetailsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.VodStitchDetail prototype) {
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
   * Detailed information related to the interstitial of a VOD session.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.VodStitchDetail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.VodStitchDetail)
      com.google.cloud.video.stitcher.v1.VodStitchDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.stitcher.v1.StitchDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodStitchDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.StitchDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodStitchDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.VodStitchDetail.class,
              com.google.cloud.video.stitcher.v1.VodStitchDetail.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.VodStitchDetail.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAdStitchDetailsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (adStitchDetailsBuilder_ == null) {
        adStitchDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        adStitchDetailsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.StitchDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_VodStitchDetail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodStitchDetail getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.VodStitchDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodStitchDetail build() {
      com.google.cloud.video.stitcher.v1.VodStitchDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.VodStitchDetail buildPartial() {
      com.google.cloud.video.stitcher.v1.VodStitchDetail result =
          new com.google.cloud.video.stitcher.v1.VodStitchDetail(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (adStitchDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          adStitchDetails_ = java.util.Collections.unmodifiableList(adStitchDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adStitchDetails_ = adStitchDetails_;
      } else {
        result.adStitchDetails_ = adStitchDetailsBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.VodStitchDetail) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.VodStitchDetail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.VodStitchDetail other) {
      if (other == com.google.cloud.video.stitcher.v1.VodStitchDetail.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (adStitchDetailsBuilder_ == null) {
        if (!other.adStitchDetails_.isEmpty()) {
          if (adStitchDetails_.isEmpty()) {
            adStitchDetails_ = other.adStitchDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdStitchDetailsIsMutable();
            adStitchDetails_.addAll(other.adStitchDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.adStitchDetails_.isEmpty()) {
          if (adStitchDetailsBuilder_.isEmpty()) {
            adStitchDetailsBuilder_.dispose();
            adStitchDetailsBuilder_ = null;
            adStitchDetails_ = other.adStitchDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adStitchDetailsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAdStitchDetailsFieldBuilder()
                    : null;
          } else {
            adStitchDetailsBuilder_.addAllMessages(other.adStitchDetails_);
          }
        }
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
      com.google.cloud.video.stitcher.v1.VodStitchDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.video.stitcher.v1.VodStitchDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the stitch detail in the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the stitch detail in the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the stitch detail in the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the stitch detail in the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the stitch detail in the specified VOD session, in the form of
     * `projects/{project}/locations/{location}/vodSessions/{vod_session_id}/vodStitchDetails/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.video.stitcher.v1.AdStitchDetail> adStitchDetails_ =
        java.util.Collections.emptyList();

    private void ensureAdStitchDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        adStitchDetails_ =
            new java.util.ArrayList<com.google.cloud.video.stitcher.v1.AdStitchDetail>(
                adStitchDetails_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.AdStitchDetail,
            com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder,
            com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder>
        adStitchDetailsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.AdStitchDetail>
        getAdStitchDetailsList() {
      if (adStitchDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(adStitchDetails_);
      } else {
        return adStitchDetailsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public int getAdStitchDetailsCount() {
      if (adStitchDetailsBuilder_ == null) {
        return adStitchDetails_.size();
      } else {
        return adStitchDetailsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdStitchDetail getAdStitchDetails(int index) {
      if (adStitchDetailsBuilder_ == null) {
        return adStitchDetails_.get(index);
      } else {
        return adStitchDetailsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder setAdStitchDetails(
        int index, com.google.cloud.video.stitcher.v1.AdStitchDetail value) {
      if (adStitchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.set(index, value);
        onChanged();
      } else {
        adStitchDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder setAdStitchDetails(
        int index, com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder builderForValue) {
      if (adStitchDetailsBuilder_ == null) {
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        adStitchDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder addAdStitchDetails(com.google.cloud.video.stitcher.v1.AdStitchDetail value) {
      if (adStitchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.add(value);
        onChanged();
      } else {
        adStitchDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder addAdStitchDetails(
        int index, com.google.cloud.video.stitcher.v1.AdStitchDetail value) {
      if (adStitchDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.add(index, value);
        onChanged();
      } else {
        adStitchDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder addAdStitchDetails(
        com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder builderForValue) {
      if (adStitchDetailsBuilder_ == null) {
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.add(builderForValue.build());
        onChanged();
      } else {
        adStitchDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder addAdStitchDetails(
        int index, com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder builderForValue) {
      if (adStitchDetailsBuilder_ == null) {
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        adStitchDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder addAllAdStitchDetails(
        java.lang.Iterable<? extends com.google.cloud.video.stitcher.v1.AdStitchDetail> values) {
      if (adStitchDetailsBuilder_ == null) {
        ensureAdStitchDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, adStitchDetails_);
        onChanged();
      } else {
        adStitchDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder clearAdStitchDetails() {
      if (adStitchDetailsBuilder_ == null) {
        adStitchDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adStitchDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public Builder removeAdStitchDetails(int index) {
      if (adStitchDetailsBuilder_ == null) {
        ensureAdStitchDetailsIsMutable();
        adStitchDetails_.remove(index);
        onChanged();
      } else {
        adStitchDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder getAdStitchDetailsBuilder(
        int index) {
      return getAdStitchDetailsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder getAdStitchDetailsOrBuilder(
        int index) {
      if (adStitchDetailsBuilder_ == null) {
        return adStitchDetails_.get(index);
      } else {
        return adStitchDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public java.util.List<? extends com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder>
        getAdStitchDetailsOrBuilderList() {
      if (adStitchDetailsBuilder_ != null) {
        return adStitchDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(adStitchDetails_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder addAdStitchDetailsBuilder() {
      return getAdStitchDetailsFieldBuilder()
          .addBuilder(com.google.cloud.video.stitcher.v1.AdStitchDetail.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder addAdStitchDetailsBuilder(
        int index) {
      return getAdStitchDetailsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.video.stitcher.v1.AdStitchDetail.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of ad processing details for the fetched ad playlist.
     * </pre>
     *
     * <code>repeated .google.cloud.video.stitcher.v1.AdStitchDetail ad_stitch_details = 3;</code>
     */
    public java.util.List<com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder>
        getAdStitchDetailsBuilderList() {
      return getAdStitchDetailsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.AdStitchDetail,
            com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder,
            com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder>
        getAdStitchDetailsFieldBuilder() {
      if (adStitchDetailsBuilder_ == null) {
        adStitchDetailsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.video.stitcher.v1.AdStitchDetail,
                com.google.cloud.video.stitcher.v1.AdStitchDetail.Builder,
                com.google.cloud.video.stitcher.v1.AdStitchDetailOrBuilder>(
                adStitchDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        adStitchDetails_ = null;
      }
      return adStitchDetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.VodStitchDetail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.VodStitchDetail)
  private static final com.google.cloud.video.stitcher.v1.VodStitchDetail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.VodStitchDetail();
  }

  public static com.google.cloud.video.stitcher.v1.VodStitchDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodStitchDetail> PARSER =
      new com.google.protobuf.AbstractParser<VodStitchDetail>() {
        @java.lang.Override
        public VodStitchDetail parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VodStitchDetail(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VodStitchDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodStitchDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.VodStitchDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
