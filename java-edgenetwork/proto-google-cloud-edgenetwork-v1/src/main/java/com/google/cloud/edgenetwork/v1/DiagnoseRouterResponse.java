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
// source: google/cloud/edgenetwork/v1/service.proto

package com.google.cloud.edgenetwork.v1;

/**
 *
 *
 * <pre>
 * DiagnoseRouterResponse contains the current status for a specific router.
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgenetwork.v1.DiagnoseRouterResponse}
 */
public final class DiagnoseRouterResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgenetwork.v1.DiagnoseRouterResponse)
    DiagnoseRouterResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiagnoseRouterResponse.newBuilder() to construct.
  private DiagnoseRouterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiagnoseRouterResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiagnoseRouterResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgenetwork.v1.ServiceProto
        .internal_static_google_cloud_edgenetwork_v1_DiagnoseRouterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgenetwork.v1.ServiceProto
        .internal_static_google_cloud_edgenetwork_v1_DiagnoseRouterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.class,
            com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.Builder.class);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * The time when the router status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when the router status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the router status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.cloud.edgenetwork.v1.RouterStatus result_;
  /**
   *
   *
   * <pre>
   * The network status of a specific router.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
   *
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   *
   *
   * <pre>
   * The network status of a specific router.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
   *
   * @return The result.
   */
  @java.lang.Override
  public com.google.cloud.edgenetwork.v1.RouterStatus getResult() {
    return result_ == null
        ? com.google.cloud.edgenetwork.v1.RouterStatus.getDefaultInstance()
        : result_;
  }
  /**
   *
   *
   * <pre>
   * The network status of a specific router.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.edgenetwork.v1.RouterStatusOrBuilder getResultOrBuilder() {
    return result_ == null
        ? com.google.cloud.edgenetwork.v1.RouterStatus.getDefaultInstance()
        : result_;
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
    if (updateTime_ != null) {
      output.writeMessage(1, getUpdateTime());
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateTime());
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse other =
        (com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult().equals(other.getResult())) return false;
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
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse parseFrom(
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
      com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse prototype) {
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
   * DiagnoseRouterResponse contains the current status for a specific router.
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgenetwork.v1.DiagnoseRouterResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgenetwork.v1.DiagnoseRouterResponse)
      com.google.cloud.edgenetwork.v1.DiagnoseRouterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgenetwork.v1.ServiceProto
          .internal_static_google_cloud_edgenetwork_v1_DiagnoseRouterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgenetwork.v1.ServiceProto
          .internal_static_google_cloud_edgenetwork_v1_DiagnoseRouterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.class,
              com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.Builder.class);
    }

    // Construct using com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgenetwork.v1.ServiceProto
          .internal_static_google_cloud_edgenetwork_v1_DiagnoseRouterResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse getDefaultInstanceForType() {
      return com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse build() {
      com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse buildPartial() {
      com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse result =
          new com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.result_ = resultBuilder_ == null ? result_ : resultBuilder_.build();
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
      if (other instanceof com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse) {
        return mergeFrom((com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse other) {
      if (other == com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse.getDefaultInstance())
        return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getResultFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the router status was last updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private com.google.cloud.edgenetwork.v1.RouterStatus result_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgenetwork.v1.RouterStatus,
            com.google.cloud.edgenetwork.v1.RouterStatus.Builder,
            com.google.cloud.edgenetwork.v1.RouterStatusOrBuilder>
        resultBuilder_;
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     *
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     *
     * @return The result.
     */
    public com.google.cloud.edgenetwork.v1.RouterStatus getResult() {
      if (resultBuilder_ == null) {
        return result_ == null
            ? com.google.cloud.edgenetwork.v1.RouterStatus.getDefaultInstance()
            : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public Builder setResult(com.google.cloud.edgenetwork.v1.RouterStatus value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public Builder setResult(com.google.cloud.edgenetwork.v1.RouterStatus.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public Builder mergeResult(com.google.cloud.edgenetwork.v1.RouterStatus value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && result_ != null
            && result_ != com.google.cloud.edgenetwork.v1.RouterStatus.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public com.google.cloud.edgenetwork.v1.RouterStatus.Builder getResultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    public com.google.cloud.edgenetwork.v1.RouterStatusOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null
            ? com.google.cloud.edgenetwork.v1.RouterStatus.getDefaultInstance()
            : result_;
      }
    }
    /**
     *
     *
     * <pre>
     * The network status of a specific router.
     * </pre>
     *
     * <code>.google.cloud.edgenetwork.v1.RouterStatus result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.edgenetwork.v1.RouterStatus,
            com.google.cloud.edgenetwork.v1.RouterStatus.Builder,
            com.google.cloud.edgenetwork.v1.RouterStatusOrBuilder>
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.edgenetwork.v1.RouterStatus,
                com.google.cloud.edgenetwork.v1.RouterStatus.Builder,
                com.google.cloud.edgenetwork.v1.RouterStatusOrBuilder>(
                getResult(), getParentForChildren(), isClean());
        result_ = null;
      }
      return resultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.edgenetwork.v1.DiagnoseRouterResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgenetwork.v1.DiagnoseRouterResponse)
  private static final com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse();
  }

  public static com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnoseRouterResponse> PARSER =
      new com.google.protobuf.AbstractParser<DiagnoseRouterResponse>() {
        @java.lang.Override
        public DiagnoseRouterResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiagnoseRouterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnoseRouterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgenetwork.v1.DiagnoseRouterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
