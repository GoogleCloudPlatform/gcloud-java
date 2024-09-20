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
// source: google/cloud/aiplatform/v1/schedule_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ScheduleService.ListSchedules][google.cloud.aiplatform.v1.ScheduleService.ListSchedules]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListSchedulesResponse}
 */
public final class ListSchedulesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListSchedulesResponse)
    ListSchedulesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSchedulesResponse.newBuilder() to construct.
  private ListSchedulesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSchedulesResponse() {
    schedules_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSchedulesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ScheduleServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListSchedulesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ScheduleServiceProto
        .internal_static_google_cloud_aiplatform_v1_ListSchedulesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListSchedulesResponse.class,
            com.google.cloud.aiplatform.v1.ListSchedulesResponse.Builder.class);
  }

  public static final int SCHEDULES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1.Schedule> schedules_;
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.Schedule> getSchedulesList() {
    return schedules_;
  }
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.ScheduleOrBuilder>
      getSchedulesOrBuilderList() {
    return schedules_;
  }
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
   */
  @java.lang.Override
  public int getSchedulesCount() {
    return schedules_.size();
  }
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Schedule getSchedules(int index) {
    return schedules_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of Schedules in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ScheduleOrBuilder getSchedulesOrBuilder(int index) {
    return schedules_.get(index);
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
   * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
   * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
    for (int i = 0; i < schedules_.size(); i++) {
      output.writeMessage(1, schedules_.get(i));
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
    for (int i = 0; i < schedules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, schedules_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListSchedulesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListSchedulesResponse other =
        (com.google.cloud.aiplatform.v1.ListSchedulesResponse) obj;

    if (!getSchedulesList().equals(other.getSchedulesList())) return false;
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
    if (getSchedulesCount() > 0) {
      hash = (37 * hash) + SCHEDULES_FIELD_NUMBER;
      hash = (53 * hash) + getSchedulesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListSchedulesResponse prototype) {
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
   * [ScheduleService.ListSchedules][google.cloud.aiplatform.v1.ScheduleService.ListSchedules]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListSchedulesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListSchedulesResponse)
      com.google.cloud.aiplatform.v1.ListSchedulesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ScheduleServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListSchedulesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ScheduleServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListSchedulesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListSchedulesResponse.class,
              com.google.cloud.aiplatform.v1.ListSchedulesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListSchedulesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (schedulesBuilder_ == null) {
        schedules_ = java.util.Collections.emptyList();
      } else {
        schedules_ = null;
        schedulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ScheduleServiceProto
          .internal_static_google_cloud_aiplatform_v1_ListSchedulesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListSchedulesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListSchedulesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListSchedulesResponse build() {
      com.google.cloud.aiplatform.v1.ListSchedulesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListSchedulesResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListSchedulesResponse result =
          new com.google.cloud.aiplatform.v1.ListSchedulesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1.ListSchedulesResponse result) {
      if (schedulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          schedules_ = java.util.Collections.unmodifiableList(schedules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schedules_ = schedules_;
      } else {
        result.schedules_ = schedulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ListSchedulesResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListSchedulesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListSchedulesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListSchedulesResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListSchedulesResponse.getDefaultInstance())
        return this;
      if (schedulesBuilder_ == null) {
        if (!other.schedules_.isEmpty()) {
          if (schedules_.isEmpty()) {
            schedules_ = other.schedules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSchedulesIsMutable();
            schedules_.addAll(other.schedules_);
          }
          onChanged();
        }
      } else {
        if (!other.schedules_.isEmpty()) {
          if (schedulesBuilder_.isEmpty()) {
            schedulesBuilder_.dispose();
            schedulesBuilder_ = null;
            schedules_ = other.schedules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            schedulesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSchedulesFieldBuilder()
                    : null;
          } else {
            schedulesBuilder_.addAllMessages(other.schedules_);
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
                com.google.cloud.aiplatform.v1.Schedule m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1.Schedule.parser(), extensionRegistry);
                if (schedulesBuilder_ == null) {
                  ensureSchedulesIsMutable();
                  schedules_.add(m);
                } else {
                  schedulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1.Schedule> schedules_ =
        java.util.Collections.emptyList();

    private void ensureSchedulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        schedules_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.Schedule>(schedules_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Schedule,
            com.google.cloud.aiplatform.v1.Schedule.Builder,
            com.google.cloud.aiplatform.v1.ScheduleOrBuilder>
        schedulesBuilder_;

    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Schedule> getSchedulesList() {
      if (schedulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(schedules_);
      } else {
        return schedulesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public int getSchedulesCount() {
      if (schedulesBuilder_ == null) {
        return schedules_.size();
      } else {
        return schedulesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Schedule getSchedules(int index) {
      if (schedulesBuilder_ == null) {
        return schedules_.get(index);
      } else {
        return schedulesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder setSchedules(int index, com.google.cloud.aiplatform.v1.Schedule value) {
      if (schedulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchedulesIsMutable();
        schedules_.set(index, value);
        onChanged();
      } else {
        schedulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder setSchedules(
        int index, com.google.cloud.aiplatform.v1.Schedule.Builder builderForValue) {
      if (schedulesBuilder_ == null) {
        ensureSchedulesIsMutable();
        schedules_.set(index, builderForValue.build());
        onChanged();
      } else {
        schedulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder addSchedules(com.google.cloud.aiplatform.v1.Schedule value) {
      if (schedulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchedulesIsMutable();
        schedules_.add(value);
        onChanged();
      } else {
        schedulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder addSchedules(int index, com.google.cloud.aiplatform.v1.Schedule value) {
      if (schedulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchedulesIsMutable();
        schedules_.add(index, value);
        onChanged();
      } else {
        schedulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder addSchedules(com.google.cloud.aiplatform.v1.Schedule.Builder builderForValue) {
      if (schedulesBuilder_ == null) {
        ensureSchedulesIsMutable();
        schedules_.add(builderForValue.build());
        onChanged();
      } else {
        schedulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder addSchedules(
        int index, com.google.cloud.aiplatform.v1.Schedule.Builder builderForValue) {
      if (schedulesBuilder_ == null) {
        ensureSchedulesIsMutable();
        schedules_.add(index, builderForValue.build());
        onChanged();
      } else {
        schedulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder addAllSchedules(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.Schedule> values) {
      if (schedulesBuilder_ == null) {
        ensureSchedulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, schedules_);
        onChanged();
      } else {
        schedulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder clearSchedules() {
      if (schedulesBuilder_ == null) {
        schedules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        schedulesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public Builder removeSchedules(int index) {
      if (schedulesBuilder_ == null) {
        ensureSchedulesIsMutable();
        schedules_.remove(index);
        onChanged();
      } else {
        schedulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Schedule.Builder getSchedulesBuilder(int index) {
      return getSchedulesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.ScheduleOrBuilder getSchedulesOrBuilder(int index) {
      if (schedulesBuilder_ == null) {
        return schedules_.get(index);
      } else {
        return schedulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.ScheduleOrBuilder>
        getSchedulesOrBuilderList() {
      if (schedulesBuilder_ != null) {
        return schedulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(schedules_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Schedule.Builder addSchedulesBuilder() {
      return getSchedulesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1.Schedule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.Schedule.Builder addSchedulesBuilder(int index) {
      return getSchedulesFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1.Schedule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Schedules in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.Schedule schedules = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.Schedule.Builder>
        getSchedulesBuilderList() {
      return getSchedulesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Schedule,
            com.google.cloud.aiplatform.v1.Schedule.Builder,
            com.google.cloud.aiplatform.v1.ScheduleOrBuilder>
        getSchedulesFieldBuilder() {
      if (schedulesBuilder_ == null) {
        schedulesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Schedule,
                com.google.cloud.aiplatform.v1.Schedule.Builder,
                com.google.cloud.aiplatform.v1.ScheduleOrBuilder>(
                schedules_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        schedules_ = null;
      }
      return schedulesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
     * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
     * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
     * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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
     * [ListSchedulesRequest.page_token][google.cloud.aiplatform.v1.ListSchedulesRequest.page_token]
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListSchedulesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListSchedulesResponse)
  private static final com.google.cloud.aiplatform.v1.ListSchedulesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListSchedulesResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListSchedulesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSchedulesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSchedulesResponse>() {
        @java.lang.Override
        public ListSchedulesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSchedulesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSchedulesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListSchedulesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
