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
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Describes full or partial data disk assignment information of the computation
 * ranges.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.StreamingComputationRanges}
 */
public final class StreamingComputationRanges extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.StreamingComputationRanges)
    StreamingComputationRangesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingComputationRanges.newBuilder() to construct.
  private StreamingComputationRanges(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingComputationRanges() {
    computationId_ = "";
    rangeAssignments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingComputationRanges();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingComputationRanges(
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

              computationId_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rangeAssignments_ =
                    new java.util.ArrayList<
                        com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>();
                mutable_bitField0_ |= 0x00000001;
              }
              rangeAssignments_.add(
                  input.readMessage(
                      com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.parser(),
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
        rangeAssignments_ = java.util.Collections.unmodifiableList(rangeAssignments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.StreamingProto
        .internal_static_google_dataflow_v1beta3_StreamingComputationRanges_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.StreamingComputationRanges.class,
            com.google.dataflow.v1beta3.StreamingComputationRanges.Builder.class);
  }

  public static final int COMPUTATION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object computationId_;
  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 1;</code>
   *
   * @return The computationId.
   */
  @java.lang.Override
  public java.lang.String getComputationId() {
    java.lang.Object ref = computationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      computationId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the computation.
   * </pre>
   *
   * <code>string computation_id = 1;</code>
   *
   * @return The bytes for computationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getComputationIdBytes() {
    java.lang.Object ref = computationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      computationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANGE_ASSIGNMENTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment> rangeAssignments_;
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>
      getRangeAssignmentsList() {
    return rangeAssignments_;
  }
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>
      getRangeAssignmentsOrBuilderList() {
    return rangeAssignments_;
  }
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  @java.lang.Override
  public int getRangeAssignmentsCount() {
    return rangeAssignments_.size();
  }
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getRangeAssignments(int index) {
    return rangeAssignments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Data disk assignments for ranges from this computation.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder
      getRangeAssignmentsOrBuilder(int index) {
    return rangeAssignments_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(computationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, computationId_);
    }
    for (int i = 0; i < rangeAssignments_.size(); i++) {
      output.writeMessage(2, rangeAssignments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(computationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, computationId_);
    }
    for (int i = 0; i < rangeAssignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, rangeAssignments_.get(i));
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
    if (!(obj instanceof com.google.dataflow.v1beta3.StreamingComputationRanges)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.StreamingComputationRanges other =
        (com.google.dataflow.v1beta3.StreamingComputationRanges) obj;

    if (!getComputationId().equals(other.getComputationId())) return false;
    if (!getRangeAssignmentsList().equals(other.getRangeAssignmentsList())) return false;
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
    hash = (37 * hash) + COMPUTATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getComputationId().hashCode();
    if (getRangeAssignmentsCount() > 0) {
      hash = (37 * hash) + RANGE_ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getRangeAssignmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges parseFrom(
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
      com.google.dataflow.v1beta3.StreamingComputationRanges prototype) {
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
   * Describes full or partial data disk assignment information of the computation
   * ranges.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.StreamingComputationRanges}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.StreamingComputationRanges)
      com.google.dataflow.v1beta3.StreamingComputationRangesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingComputationRanges_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.StreamingComputationRanges.class,
              com.google.dataflow.v1beta3.StreamingComputationRanges.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.StreamingComputationRanges.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRangeAssignmentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      computationId_ = "";

      if (rangeAssignmentsBuilder_ == null) {
        rangeAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rangeAssignmentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.StreamingProto
          .internal_static_google_dataflow_v1beta3_StreamingComputationRanges_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingComputationRanges getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.StreamingComputationRanges.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingComputationRanges build() {
      com.google.dataflow.v1beta3.StreamingComputationRanges result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.StreamingComputationRanges buildPartial() {
      com.google.dataflow.v1beta3.StreamingComputationRanges result =
          new com.google.dataflow.v1beta3.StreamingComputationRanges(this);
      int from_bitField0_ = bitField0_;
      result.computationId_ = computationId_;
      if (rangeAssignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rangeAssignments_ = java.util.Collections.unmodifiableList(rangeAssignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rangeAssignments_ = rangeAssignments_;
      } else {
        result.rangeAssignments_ = rangeAssignmentsBuilder_.build();
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
      if (other instanceof com.google.dataflow.v1beta3.StreamingComputationRanges) {
        return mergeFrom((com.google.dataflow.v1beta3.StreamingComputationRanges) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.StreamingComputationRanges other) {
      if (other == com.google.dataflow.v1beta3.StreamingComputationRanges.getDefaultInstance())
        return this;
      if (!other.getComputationId().isEmpty()) {
        computationId_ = other.computationId_;
        onChanged();
      }
      if (rangeAssignmentsBuilder_ == null) {
        if (!other.rangeAssignments_.isEmpty()) {
          if (rangeAssignments_.isEmpty()) {
            rangeAssignments_ = other.rangeAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRangeAssignmentsIsMutable();
            rangeAssignments_.addAll(other.rangeAssignments_);
          }
          onChanged();
        }
      } else {
        if (!other.rangeAssignments_.isEmpty()) {
          if (rangeAssignmentsBuilder_.isEmpty()) {
            rangeAssignmentsBuilder_.dispose();
            rangeAssignmentsBuilder_ = null;
            rangeAssignments_ = other.rangeAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rangeAssignmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRangeAssignmentsFieldBuilder()
                    : null;
          } else {
            rangeAssignmentsBuilder_.addAllMessages(other.rangeAssignments_);
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
      com.google.dataflow.v1beta3.StreamingComputationRanges parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.dataflow.v1beta3.StreamingComputationRanges) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object computationId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the computation.
     * </pre>
     *
     * <code>string computation_id = 1;</code>
     *
     * @return The computationId.
     */
    public java.lang.String getComputationId() {
      java.lang.Object ref = computationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        computationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the computation.
     * </pre>
     *
     * <code>string computation_id = 1;</code>
     *
     * @return The bytes for computationId.
     */
    public com.google.protobuf.ByteString getComputationIdBytes() {
      java.lang.Object ref = computationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        computationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the computation.
     * </pre>
     *
     * <code>string computation_id = 1;</code>
     *
     * @param value The computationId to set.
     * @return This builder for chaining.
     */
    public Builder setComputationId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      computationId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the computation.
     * </pre>
     *
     * <code>string computation_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComputationId() {

      computationId_ = getDefaultInstance().getComputationId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the computation.
     * </pre>
     *
     * <code>string computation_id = 1;</code>
     *
     * @param value The bytes for computationId to set.
     * @return This builder for chaining.
     */
    public Builder setComputationIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      computationId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>
        rangeAssignments_ = java.util.Collections.emptyList();

    private void ensureRangeAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rangeAssignments_ =
            new java.util.ArrayList<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>(
                rangeAssignments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment,
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder,
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>
        rangeAssignmentsBuilder_;

    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>
        getRangeAssignmentsList() {
      if (rangeAssignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rangeAssignments_);
      } else {
        return rangeAssignmentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public int getRangeAssignmentsCount() {
      if (rangeAssignmentsBuilder_ == null) {
        return rangeAssignments_.size();
      } else {
        return rangeAssignmentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment getRangeAssignments(int index) {
      if (rangeAssignmentsBuilder_ == null) {
        return rangeAssignments_.get(index);
      } else {
        return rangeAssignmentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder setRangeAssignments(
        int index, com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment value) {
      if (rangeAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.set(index, value);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder setRangeAssignments(
        int index, com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder builderForValue) {
      if (rangeAssignmentsBuilder_ == null) {
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        rangeAssignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder addRangeAssignments(
        com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment value) {
      if (rangeAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.add(value);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder addRangeAssignments(
        int index, com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment value) {
      if (rangeAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.add(index, value);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder addRangeAssignments(
        com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder builderForValue) {
      if (rangeAssignmentsBuilder_ == null) {
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.add(builderForValue.build());
        onChanged();
      } else {
        rangeAssignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder addRangeAssignments(
        int index, com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder builderForValue) {
      if (rangeAssignmentsBuilder_ == null) {
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        rangeAssignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder addAllRangeAssignments(
        java.lang.Iterable<? extends com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment>
            values) {
      if (rangeAssignmentsBuilder_ == null) {
        ensureRangeAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rangeAssignments_);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder clearRangeAssignments() {
      if (rangeAssignmentsBuilder_ == null) {
        rangeAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public Builder removeRangeAssignments(int index) {
      if (rangeAssignmentsBuilder_ == null) {
        ensureRangeAssignmentsIsMutable();
        rangeAssignments_.remove(index);
        onChanged();
      } else {
        rangeAssignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder
        getRangeAssignmentsBuilder(int index) {
      return getRangeAssignmentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder
        getRangeAssignmentsOrBuilder(int index) {
      if (rangeAssignmentsBuilder_ == null) {
        return rangeAssignments_.get(index);
      } else {
        return rangeAssignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public java.util.List<? extends com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>
        getRangeAssignmentsOrBuilderList() {
      if (rangeAssignmentsBuilder_ != null) {
        return rangeAssignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rangeAssignments_);
      }
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder
        addRangeAssignmentsBuilder() {
      return getRangeAssignmentsFieldBuilder()
          .addBuilder(com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder
        addRangeAssignmentsBuilder(int index) {
      return getRangeAssignmentsFieldBuilder()
          .addBuilder(
              index, com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Data disk assignments for ranges from this computation.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.KeyRangeDataDiskAssignment range_assignments = 2;
     * </code>
     */
    public java.util.List<com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder>
        getRangeAssignmentsBuilderList() {
      return getRangeAssignmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment,
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder,
            com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>
        getRangeAssignmentsFieldBuilder() {
      if (rangeAssignmentsBuilder_ == null) {
        rangeAssignmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment,
                com.google.dataflow.v1beta3.KeyRangeDataDiskAssignment.Builder,
                com.google.dataflow.v1beta3.KeyRangeDataDiskAssignmentOrBuilder>(
                rangeAssignments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rangeAssignments_ = null;
      }
      return rangeAssignmentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.StreamingComputationRanges)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.StreamingComputationRanges)
  private static final com.google.dataflow.v1beta3.StreamingComputationRanges DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.StreamingComputationRanges();
  }

  public static com.google.dataflow.v1beta3.StreamingComputationRanges getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingComputationRanges> PARSER =
      new com.google.protobuf.AbstractParser<StreamingComputationRanges>() {
        @java.lang.Override
        public StreamingComputationRanges parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingComputationRanges(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingComputationRanges> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingComputationRanges> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.StreamingComputationRanges getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
