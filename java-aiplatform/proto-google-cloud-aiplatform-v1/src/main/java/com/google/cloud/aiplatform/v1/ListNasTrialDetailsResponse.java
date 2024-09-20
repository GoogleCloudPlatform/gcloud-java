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
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [JobService.ListNasTrialDetails][google.cloud.aiplatform.v1.JobService.ListNasTrialDetails]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListNasTrialDetailsResponse}
 */
public final class ListNasTrialDetailsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListNasTrialDetailsResponse)
    ListNasTrialDetailsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListNasTrialDetailsResponse.newBuilder() to construct.
  private ListNasTrialDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNasTrialDetailsResponse() {
    nasTrialDetails_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNasTrialDetailsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListNasTrialDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.JobServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListNasTrialDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.class,
            com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.Builder.class);
  }

  public static final int NAS_TRIAL_DETAILS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.NasTrialDetail> nasTrialDetails_;
  /**
   *
   *
   * <pre>
   * List of top NasTrials in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.NasTrialDetail> getNasTrialDetailsList() {
    return nasTrialDetails_;
  }
  /**
   *
   *
   * <pre>
   * List of top NasTrials in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder>
      getNasTrialDetailsOrBuilderList() {
    return nasTrialDetails_;
  }
  /**
   *
   *
   * <pre>
   * List of top NasTrials in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
   */
  @java.lang.Override
  public int getNasTrialDetailsCount() {
    return nasTrialDetails_.size();
  }
  /**
   *
   *
   * <pre>
   * List of top NasTrials in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NasTrialDetail getNasTrialDetails(int index) {
    return nasTrialDetails_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of top NasTrials in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder getNasTrialDetailsOrBuilder(
      int index) {
    return nasTrialDetails_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < nasTrialDetails_.size(); i++) {
      output.writeMessage(1, nasTrialDetails_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nasTrialDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, nasTrialDetails_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse other =
        (com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse) obj;

    if (!getNasTrialDetailsList().equals(other.getNasTrialDetailsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getNasTrialDetailsCount() > 0) {
      hash = (37 * hash) + NAS_TRIAL_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getNasTrialDetailsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse prototype) {
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
   * Response message for
   * [JobService.ListNasTrialDetails][google.cloud.aiplatform.v1.JobService.ListNasTrialDetails]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListNasTrialDetailsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListNasTrialDetailsResponse)
      com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListNasTrialDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListNasTrialDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.class,
              com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (nasTrialDetailsBuilder_ == null) {
        nasTrialDetails_ = java.util.Collections.emptyList();
      } else {
        nasTrialDetails_ = null;
        nasTrialDetailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.JobServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListNasTrialDetailsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse build() {
      com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse result =
          new com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse result) {
      if (nasTrialDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nasTrialDetails_ = java.util.Collections.unmodifiableList(nasTrialDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nasTrialDetails_ = nasTrialDetails_;
      } else {
        result.nasTrialDetails_ = nasTrialDetailsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse.getDefaultInstance())
        return this;
      if (nasTrialDetailsBuilder_ == null) {
        if (!other.nasTrialDetails_.isEmpty()) {
          if (nasTrialDetails_.isEmpty()) {
            nasTrialDetails_ = other.nasTrialDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNasTrialDetailsIsMutable();
            nasTrialDetails_.addAll(other.nasTrialDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.nasTrialDetails_.isEmpty()) {
          if (nasTrialDetailsBuilder_.isEmpty()) {
            nasTrialDetailsBuilder_.dispose();
            nasTrialDetailsBuilder_ = null;
            nasTrialDetails_ = other.nasTrialDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nasTrialDetailsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNasTrialDetailsFieldBuilder()
                    : null;
          } else {
            nasTrialDetailsBuilder_.addAllMessages(other.nasTrialDetails_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10:
              {
                com.google.cloud.aiplatform.v1.NasTrialDetail m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.NasTrialDetail.parser(), extensionRegistry);
                if (nasTrialDetailsBuilder_ == null) {
                  ensureNasTrialDetailsIsMutable();
                  nasTrialDetails_.add(m);
                } else {
                  nasTrialDetailsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.aiplatform.v1.NasTrialDetail> nasTrialDetails_ =
        java.util.Collections.emptyList();

    private void ensureNasTrialDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nasTrialDetails_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1.NasTrialDetail>(
                nasTrialDetails_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.NasTrialDetail,
            com.google.cloud.aiplatform.v1.NasTrialDetail.Builder,
            com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder>
        nasTrialDetailsBuilder_;

    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.NasTrialDetail> getNasTrialDetailsList() {
      if (nasTrialDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nasTrialDetails_);
      } else {
        return nasTrialDetailsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public int getNasTrialDetailsCount() {
      if (nasTrialDetailsBuilder_ == null) {
        return nasTrialDetails_.size();
      } else {
        return nasTrialDetailsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasTrialDetail getNasTrialDetails(int index) {
      if (nasTrialDetailsBuilder_ == null) {
        return nasTrialDetails_.get(index);
      } else {
        return nasTrialDetailsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder setNasTrialDetails(
        int index, com.google.cloud.aiplatform.v1.NasTrialDetail value) {
      if (nasTrialDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.set(index, value);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder setNasTrialDetails(
        int index, com.google.cloud.aiplatform.v1.NasTrialDetail.Builder builderForValue) {
      if (nasTrialDetailsBuilder_ == null) {
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        nasTrialDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder addNasTrialDetails(com.google.cloud.aiplatform.v1.NasTrialDetail value) {
      if (nasTrialDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.add(value);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder addNasTrialDetails(
        int index, com.google.cloud.aiplatform.v1.NasTrialDetail value) {
      if (nasTrialDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.add(index, value);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder addNasTrialDetails(
        com.google.cloud.aiplatform.v1.NasTrialDetail.Builder builderForValue) {
      if (nasTrialDetailsBuilder_ == null) {
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.add(builderForValue.build());
        onChanged();
      } else {
        nasTrialDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder addNasTrialDetails(
        int index, com.google.cloud.aiplatform.v1.NasTrialDetail.Builder builderForValue) {
      if (nasTrialDetailsBuilder_ == null) {
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        nasTrialDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder addAllNasTrialDetails(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.NasTrialDetail> values) {
      if (nasTrialDetailsBuilder_ == null) {
        ensureNasTrialDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nasTrialDetails_);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder clearNasTrialDetails() {
      if (nasTrialDetailsBuilder_ == null) {
        nasTrialDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public Builder removeNasTrialDetails(int index) {
      if (nasTrialDetailsBuilder_ == null) {
        ensureNasTrialDetailsIsMutable();
        nasTrialDetails_.remove(index);
        onChanged();
      } else {
        nasTrialDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasTrialDetail.Builder getNasTrialDetailsBuilder(
        int index) {
      return getNasTrialDetailsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder getNasTrialDetailsOrBuilder(
        int index) {
      if (nasTrialDetailsBuilder_ == null) {
        return nasTrialDetails_.get(index);
      } else {
        return nasTrialDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder>
        getNasTrialDetailsOrBuilderList() {
      if (nasTrialDetailsBuilder_ != null) {
        return nasTrialDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nasTrialDetails_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasTrialDetail.Builder addNasTrialDetailsBuilder() {
      return getNasTrialDetailsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.NasTrialDetail.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NasTrialDetail.Builder addNasTrialDetailsBuilder(
        int index) {
      return getNasTrialDetailsFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.NasTrialDetail.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of top NasTrials in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.NasTrialDetail nas_trial_details = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.NasTrialDetail.Builder>
        getNasTrialDetailsBuilderList() {
      return getNasTrialDetailsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.NasTrialDetail,
            com.google.cloud.aiplatform.v1.NasTrialDetail.Builder,
            com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder>
        getNasTrialDetailsFieldBuilder() {
      if (nasTrialDetailsBuilder_ == null) {
        nasTrialDetailsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.NasTrialDetail,
                com.google.cloud.aiplatform.v1.NasTrialDetail.Builder,
                com.google.cloud.aiplatform.v1.NasTrialDetailOrBuilder>(
                nasTrialDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nasTrialDetails_ = null;
      }
      return nasTrialDetailsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListNasTrialDetailsRequest.page_token][google.cloud.aiplatform.v1.ListNasTrialDetailsRequest.page_token]
     * to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListNasTrialDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListNasTrialDetailsResponse)
  private static final com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNasTrialDetailsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNasTrialDetailsResponse>() {
        @java.lang.Override
        public ListNasTrialDetailsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNasTrialDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNasTrialDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListNasTrialDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
