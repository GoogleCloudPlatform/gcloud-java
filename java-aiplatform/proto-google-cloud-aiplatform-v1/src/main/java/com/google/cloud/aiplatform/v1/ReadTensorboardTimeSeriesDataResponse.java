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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [TensorboardService.ReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1.TensorboardService.ReadTensorboardTimeSeriesData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse}
 */
public final class ReadTensorboardTimeSeriesDataResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse)
    ReadTensorboardTimeSeriesDataResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadTensorboardTimeSeriesDataResponse.newBuilder() to construct.
  private ReadTensorboardTimeSeriesDataResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadTensorboardTimeSeriesDataResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadTensorboardTimeSeriesDataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_ReadTensorboardTimeSeriesDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1_ReadTensorboardTimeSeriesDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse.class,
            com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse.Builder.class);
  }

  public static final int TIME_SERIES_DATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.TimeSeriesData timeSeriesData_;
  /**
   *
   *
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   *
   * @return Whether the timeSeriesData field is set.
   */
  @java.lang.Override
  public boolean hasTimeSeriesData() {
    return timeSeriesData_ != null;
  }
  /**
   *
   *
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   *
   * @return The timeSeriesData.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TimeSeriesData getTimeSeriesData() {
    return timeSeriesData_ == null
        ? com.google.cloud.aiplatform.v1.TimeSeriesData.getDefaultInstance()
        : timeSeriesData_;
  }
  /**
   *
   *
   * <pre>
   * The returned time series data.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder getTimeSeriesDataOrBuilder() {
    return getTimeSeriesData();
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
    if (timeSeriesData_ != null) {
      output.writeMessage(1, getTimeSeriesData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeSeriesData_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeSeriesData());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse other =
        (com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse) obj;

    if (hasTimeSeriesData() != other.hasTimeSeriesData()) return false;
    if (hasTimeSeriesData()) {
      if (!getTimeSeriesData().equals(other.getTimeSeriesData())) return false;
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
    if (hasTimeSeriesData()) {
      hash = (37 * hash) + TIME_SERIES_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSeriesData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse prototype) {
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
   * [TensorboardService.ReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1.TensorboardService.ReadTensorboardTimeSeriesData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse)
      com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadTensorboardTimeSeriesDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadTensorboardTimeSeriesDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse.class,
              com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timeSeriesDataBuilder_ == null) {
        timeSeriesData_ = null;
      } else {
        timeSeriesData_ = null;
        timeSeriesDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadTensorboardTimeSeriesDataResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse build() {
      com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse result =
          new com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse(this);
      if (timeSeriesDataBuilder_ == null) {
        result.timeSeriesData_ = timeSeriesData_;
      } else {
        result.timeSeriesData_ = timeSeriesDataBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
              .getDefaultInstance()) return this;
      if (other.hasTimeSeriesData()) {
        mergeTimeSeriesData(other.getTimeSeriesData());
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
                input.readMessage(getTimeSeriesDataFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.aiplatform.v1.TimeSeriesData timeSeriesData_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TimeSeriesData,
            com.google.cloud.aiplatform.v1.TimeSeriesData.Builder,
            com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder>
        timeSeriesDataBuilder_;
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     *
     * @return Whether the timeSeriesData field is set.
     */
    public boolean hasTimeSeriesData() {
      return timeSeriesDataBuilder_ != null || timeSeriesData_ != null;
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     *
     * @return The timeSeriesData.
     */
    public com.google.cloud.aiplatform.v1.TimeSeriesData getTimeSeriesData() {
      if (timeSeriesDataBuilder_ == null) {
        return timeSeriesData_ == null
            ? com.google.cloud.aiplatform.v1.TimeSeriesData.getDefaultInstance()
            : timeSeriesData_;
      } else {
        return timeSeriesDataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public Builder setTimeSeriesData(com.google.cloud.aiplatform.v1.TimeSeriesData value) {
      if (timeSeriesDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSeriesData_ = value;
        onChanged();
      } else {
        timeSeriesDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public Builder setTimeSeriesData(
        com.google.cloud.aiplatform.v1.TimeSeriesData.Builder builderForValue) {
      if (timeSeriesDataBuilder_ == null) {
        timeSeriesData_ = builderForValue.build();
        onChanged();
      } else {
        timeSeriesDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public Builder mergeTimeSeriesData(com.google.cloud.aiplatform.v1.TimeSeriesData value) {
      if (timeSeriesDataBuilder_ == null) {
        if (timeSeriesData_ != null) {
          timeSeriesData_ =
              com.google.cloud.aiplatform.v1.TimeSeriesData.newBuilder(timeSeriesData_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          timeSeriesData_ = value;
        }
        onChanged();
      } else {
        timeSeriesDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public Builder clearTimeSeriesData() {
      if (timeSeriesDataBuilder_ == null) {
        timeSeriesData_ = null;
        onChanged();
      } else {
        timeSeriesData_ = null;
        timeSeriesDataBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TimeSeriesData.Builder getTimeSeriesDataBuilder() {

      onChanged();
      return getTimeSeriesDataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder getTimeSeriesDataOrBuilder() {
      if (timeSeriesDataBuilder_ != null) {
        return timeSeriesDataBuilder_.getMessageOrBuilder();
      } else {
        return timeSeriesData_ == null
            ? com.google.cloud.aiplatform.v1.TimeSeriesData.getDefaultInstance()
            : timeSeriesData_;
      }
    }
    /**
     *
     *
     * <pre>
     * The returned time series data.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.TimeSeriesData time_series_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.TimeSeriesData,
            com.google.cloud.aiplatform.v1.TimeSeriesData.Builder,
            com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder>
        getTimeSeriesDataFieldBuilder() {
      if (timeSeriesDataBuilder_ == null) {
        timeSeriesDataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.TimeSeriesData,
                com.google.cloud.aiplatform.v1.TimeSeriesData.Builder,
                com.google.cloud.aiplatform.v1.TimeSeriesDataOrBuilder>(
                getTimeSeriesData(), getParentForChildren(), isClean());
        timeSeriesData_ = null;
      }
      return timeSeriesDataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse)
  private static final com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse();
  }

  public static com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReadTensorboardTimeSeriesDataResponse>() {
        @java.lang.Override
        public ReadTensorboardTimeSeriesDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadTensorboardTimeSeriesDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
