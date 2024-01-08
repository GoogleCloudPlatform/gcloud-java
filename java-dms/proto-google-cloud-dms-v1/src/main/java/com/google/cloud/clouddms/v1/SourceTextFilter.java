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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Filter for text-based data types like varchar.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SourceTextFilter}
 */
public final class SourceTextFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SourceTextFilter)
    SourceTextFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceTextFilter.newBuilder() to construct.
  private SourceTextFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceTextFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceTextFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SourceTextFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SourceTextFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SourceTextFilter.class,
            com.google.cloud.clouddms.v1.SourceTextFilter.Builder.class);
  }

  public static final int SOURCE_MIN_LENGTH_FILTER_FIELD_NUMBER = 1;
  private long sourceMinLengthFilter_ = 0L;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with length greater than or equal
   * to this number.
   * </pre>
   *
   * <code>int64 source_min_length_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMinLengthFilter.
   */
  @java.lang.Override
  public long getSourceMinLengthFilter() {
    return sourceMinLengthFilter_;
  }

  public static final int SOURCE_MAX_LENGTH_FILTER_FIELD_NUMBER = 2;
  private long sourceMaxLengthFilter_ = 0L;
  /**
   *
   *
   * <pre>
   * Optional. The filter will match columns with length smaller than or equal
   * to this number.
   * </pre>
   *
   * <code>int64 source_max_length_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceMaxLengthFilter.
   */
  @java.lang.Override
  public long getSourceMaxLengthFilter() {
    return sourceMaxLengthFilter_;
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
    if (sourceMinLengthFilter_ != 0L) {
      output.writeInt64(1, sourceMinLengthFilter_);
    }
    if (sourceMaxLengthFilter_ != 0L) {
      output.writeInt64(2, sourceMaxLengthFilter_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceMinLengthFilter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, sourceMinLengthFilter_);
    }
    if (sourceMaxLengthFilter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, sourceMaxLengthFilter_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SourceTextFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SourceTextFilter other =
        (com.google.cloud.clouddms.v1.SourceTextFilter) obj;

    if (getSourceMinLengthFilter() != other.getSourceMinLengthFilter()) return false;
    if (getSourceMaxLengthFilter() != other.getSourceMaxLengthFilter()) return false;
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
    hash = (37 * hash) + SOURCE_MIN_LENGTH_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSourceMinLengthFilter());
    hash = (37 * hash) + SOURCE_MAX_LENGTH_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSourceMaxLengthFilter());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.SourceTextFilter prototype) {
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
   * Filter for text-based data types like varchar.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SourceTextFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SourceTextFilter)
      com.google.cloud.clouddms.v1.SourceTextFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceTextFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceTextFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SourceTextFilter.class,
              com.google.cloud.clouddms.v1.SourceTextFilter.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SourceTextFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceMinLengthFilter_ = 0L;
      sourceMaxLengthFilter_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SourceTextFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceTextFilter getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SourceTextFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceTextFilter build() {
      com.google.cloud.clouddms.v1.SourceTextFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SourceTextFilter buildPartial() {
      com.google.cloud.clouddms.v1.SourceTextFilter result =
          new com.google.cloud.clouddms.v1.SourceTextFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.SourceTextFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceMinLengthFilter_ = sourceMinLengthFilter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceMaxLengthFilter_ = sourceMaxLengthFilter_;
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
      if (other instanceof com.google.cloud.clouddms.v1.SourceTextFilter) {
        return mergeFrom((com.google.cloud.clouddms.v1.SourceTextFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SourceTextFilter other) {
      if (other == com.google.cloud.clouddms.v1.SourceTextFilter.getDefaultInstance()) return this;
      if (other.getSourceMinLengthFilter() != 0L) {
        setSourceMinLengthFilter(other.getSourceMinLengthFilter());
      }
      if (other.getSourceMaxLengthFilter() != 0L) {
        setSourceMaxLengthFilter(other.getSourceMaxLengthFilter());
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
            case 8:
              {
                sourceMinLengthFilter_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                sourceMaxLengthFilter_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private long sourceMinLengthFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length greater than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_min_length_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMinLengthFilter.
     */
    @java.lang.Override
    public long getSourceMinLengthFilter() {
      return sourceMinLengthFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length greater than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_min_length_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMinLengthFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMinLengthFilter(long value) {

      sourceMinLengthFilter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length greater than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_min_length_filter = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMinLengthFilter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceMinLengthFilter_ = 0L;
      onChanged();
      return this;
    }

    private long sourceMaxLengthFilter_;
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length smaller than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_max_length_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sourceMaxLengthFilter.
     */
    @java.lang.Override
    public long getSourceMaxLengthFilter() {
      return sourceMaxLengthFilter_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length smaller than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_max_length_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sourceMaxLengthFilter to set.
     * @return This builder for chaining.
     */
    public Builder setSourceMaxLengthFilter(long value) {

      sourceMaxLengthFilter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The filter will match columns with length smaller than or equal
     * to this number.
     * </pre>
     *
     * <code>int64 source_max_length_filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceMaxLengthFilter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sourceMaxLengthFilter_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SourceTextFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SourceTextFilter)
  private static final com.google.cloud.clouddms.v1.SourceTextFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SourceTextFilter();
  }

  public static com.google.cloud.clouddms.v1.SourceTextFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceTextFilter> PARSER =
      new com.google.protobuf.AbstractParser<SourceTextFilter>() {
        @java.lang.Override
        public SourceTextFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceTextFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceTextFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SourceTextFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
