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
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

// Protobuf Java Version: 3.25.4
package io.grafeas.v1beta1;

/**
 *
 *
 * <pre>
 * Request to create occurrences in batch.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.BatchCreateOccurrencesRequest}
 */
public final class BatchCreateOccurrencesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.BatchCreateOccurrencesRequest)
    BatchCreateOccurrencesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateOccurrencesRequest.newBuilder() to construct.
  private BatchCreateOccurrencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateOccurrencesRequest() {
    parent_ = "";
    occurrences_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateOccurrencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.Grafeas
        .internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas
        .internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.BatchCreateOccurrencesRequest.class,
            io.grafeas.v1beta1.BatchCreateOccurrencesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrences are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrences are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OCCURRENCES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<io.grafeas.v1beta1.Occurrence> occurrences_;
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1beta1.Occurrence> getOccurrencesList() {
    return occurrences_;
  }
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1beta1.OccurrenceOrBuilder>
      getOccurrencesOrBuilderList() {
    return occurrences_;
  }
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  @java.lang.Override
  public int getOccurrencesCount() {
    return occurrences_.size();
  }
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.Occurrence getOccurrences(int index) {
    return occurrences_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The occurrences to create.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
   */
  @java.lang.Override
  public io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index) {
    return occurrences_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < occurrences_.size(); i++) {
      output.writeMessage(2, occurrences_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (int i = 0; i < occurrences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, occurrences_.get(i));
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
    if (!(obj instanceof io.grafeas.v1beta1.BatchCreateOccurrencesRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.BatchCreateOccurrencesRequest other =
        (io.grafeas.v1beta1.BatchCreateOccurrencesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getOccurrencesList().equals(other.getOccurrencesList())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getOccurrencesCount() > 0) {
      hash = (37 * hash) + OCCURRENCES_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.BatchCreateOccurrencesRequest prototype) {
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
   * Request to create occurrences in batch.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.BatchCreateOccurrencesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.BatchCreateOccurrencesRequest)
      io.grafeas.v1beta1.BatchCreateOccurrencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.BatchCreateOccurrencesRequest.class,
              io.grafeas.v1beta1.BatchCreateOccurrencesRequest.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.BatchCreateOccurrencesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
      } else {
        occurrences_ = null;
        occurrencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas
          .internal_static_grafeas_v1beta1_BatchCreateOccurrencesRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesRequest getDefaultInstanceForType() {
      return io.grafeas.v1beta1.BatchCreateOccurrencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesRequest build() {
      io.grafeas.v1beta1.BatchCreateOccurrencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesRequest buildPartial() {
      io.grafeas.v1beta1.BatchCreateOccurrencesRequest result =
          new io.grafeas.v1beta1.BatchCreateOccurrencesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        io.grafeas.v1beta1.BatchCreateOccurrencesRequest result) {
      if (occurrencesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          occurrences_ = java.util.Collections.unmodifiableList(occurrences_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.occurrences_ = occurrences_;
      } else {
        result.occurrences_ = occurrencesBuilder_.build();
      }
    }

    private void buildPartial0(io.grafeas.v1beta1.BatchCreateOccurrencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
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
      if (other instanceof io.grafeas.v1beta1.BatchCreateOccurrencesRequest) {
        return mergeFrom((io.grafeas.v1beta1.BatchCreateOccurrencesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.BatchCreateOccurrencesRequest other) {
      if (other == io.grafeas.v1beta1.BatchCreateOccurrencesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (occurrencesBuilder_ == null) {
        if (!other.occurrences_.isEmpty()) {
          if (occurrences_.isEmpty()) {
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOccurrencesIsMutable();
            occurrences_.addAll(other.occurrences_);
          }
          onChanged();
        }
      } else {
        if (!other.occurrences_.isEmpty()) {
          if (occurrencesBuilder_.isEmpty()) {
            occurrencesBuilder_.dispose();
            occurrencesBuilder_ = null;
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000002);
            occurrencesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOccurrencesFieldBuilder()
                    : null;
          } else {
            occurrencesBuilder_.addAllMessages(other.occurrences_);
          }
        }
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                io.grafeas.v1beta1.Occurrence m =
                    input.readMessage(io.grafeas.v1beta1.Occurrence.parser(), extensionRegistry);
                if (occurrencesBuilder_ == null) {
                  ensureOccurrencesIsMutable();
                  occurrences_.add(m);
                } else {
                  occurrencesBuilder_.addMessage(m);
                }
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the occurrences are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the occurrences are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the occurrences are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the occurrences are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the occurrences are to be created.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<io.grafeas.v1beta1.Occurrence> occurrences_ =
        java.util.Collections.emptyList();

    private void ensureOccurrencesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        occurrences_ = new java.util.ArrayList<io.grafeas.v1beta1.Occurrence>(occurrences_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.Occurrence,
            io.grafeas.v1beta1.Occurrence.Builder,
            io.grafeas.v1beta1.OccurrenceOrBuilder>
        occurrencesBuilder_;

    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public java.util.List<io.grafeas.v1beta1.Occurrence> getOccurrencesList() {
      if (occurrencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(occurrences_);
      } else {
        return occurrencesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public int getOccurrencesCount() {
      if (occurrencesBuilder_ == null) {
        return occurrences_.size();
      } else {
        return occurrencesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public io.grafeas.v1beta1.Occurrence getOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);
      } else {
        return occurrencesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder setOccurrences(int index, io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.set(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder setOccurrences(
        int index, io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.set(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder addOccurrences(io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder addOccurrences(int index, io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder addOccurrences(io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder addOccurrences(
        int index, io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder addAllOccurrences(
        java.lang.Iterable<? extends io.grafeas.v1beta1.Occurrence> values) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, occurrences_);
        onChanged();
      } else {
        occurrencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder clearOccurrences() {
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        occurrencesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public Builder removeOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.remove(index);
        onChanged();
      } else {
        occurrencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder getOccurrencesBuilder(int index) {
      return getOccurrencesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);
      } else {
        return occurrencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public java.util.List<? extends io.grafeas.v1beta1.OccurrenceOrBuilder>
        getOccurrencesOrBuilderList() {
      if (occurrencesBuilder_ != null) {
        return occurrencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(occurrences_);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder addOccurrencesBuilder() {
      return getOccurrencesFieldBuilder()
          .addBuilder(io.grafeas.v1beta1.Occurrence.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder addOccurrencesBuilder(int index) {
      return getOccurrencesFieldBuilder()
          .addBuilder(index, io.grafeas.v1beta1.Occurrence.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The occurrences to create.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 2;</code>
     */
    public java.util.List<io.grafeas.v1beta1.Occurrence.Builder> getOccurrencesBuilderList() {
      return getOccurrencesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.Occurrence,
            io.grafeas.v1beta1.Occurrence.Builder,
            io.grafeas.v1beta1.OccurrenceOrBuilder>
        getOccurrencesFieldBuilder() {
      if (occurrencesBuilder_ == null) {
        occurrencesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1beta1.Occurrence,
                io.grafeas.v1beta1.Occurrence.Builder,
                io.grafeas.v1beta1.OccurrenceOrBuilder>(
                occurrences_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        occurrences_ = null;
      }
      return occurrencesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.BatchCreateOccurrencesRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.BatchCreateOccurrencesRequest)
  private static final io.grafeas.v1beta1.BatchCreateOccurrencesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.BatchCreateOccurrencesRequest();
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateOccurrencesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateOccurrencesRequest>() {
        @java.lang.Override
        public BatchCreateOccurrencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateOccurrencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateOccurrencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.BatchCreateOccurrencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
