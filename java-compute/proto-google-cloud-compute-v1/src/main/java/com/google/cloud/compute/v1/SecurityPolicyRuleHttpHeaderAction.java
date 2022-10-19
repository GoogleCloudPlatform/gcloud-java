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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction}
 */
public final class SecurityPolicyRuleHttpHeaderAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction)
    SecurityPolicyRuleHttpHeaderActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecurityPolicyRuleHttpHeaderAction.newBuilder() to construct.
  private SecurityPolicyRuleHttpHeaderAction(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityPolicyRuleHttpHeaderAction() {
    requestHeadersToAdds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityPolicyRuleHttpHeaderAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyRuleHttpHeaderAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPolicyRuleHttpHeaderAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.class,
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.Builder.class);
  }

  public static final int REQUEST_HEADERS_TO_ADDS_FIELD_NUMBER = 87987661;
  private java.util.List<
          com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>
      requestHeadersToAdds_;
  /**
   *
   *
   * <pre>
   * The list of request headers to add or overwrite if they're already present.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>
      getRequestHeadersToAddsList() {
    return requestHeadersToAdds_;
  }
  /**
   *
   *
   * <pre>
   * The list of request headers to add or overwrite if they're already present.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder>
      getRequestHeadersToAddsOrBuilderList() {
    return requestHeadersToAdds_;
  }
  /**
   *
   *
   * <pre>
   * The list of request headers to add or overwrite if they're already present.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
   * </code>
   */
  @java.lang.Override
  public int getRequestHeadersToAddsCount() {
    return requestHeadersToAdds_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of request headers to add or overwrite if they're already present.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption
      getRequestHeadersToAdds(int index) {
    return requestHeadersToAdds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of request headers to add or overwrite if they're already present.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder
      getRequestHeadersToAddsOrBuilder(int index) {
    return requestHeadersToAdds_.get(index);
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
    for (int i = 0; i < requestHeadersToAdds_.size(); i++) {
      output.writeMessage(87987661, requestHeadersToAdds_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < requestHeadersToAdds_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              87987661, requestHeadersToAdds_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction other =
        (com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction) obj;

    if (!getRequestHeadersToAddsList().equals(other.getRequestHeadersToAddsList())) return false;
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
    if (getRequestHeadersToAddsCount() > 0) {
      hash = (37 * hash) + REQUEST_HEADERS_TO_ADDS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestHeadersToAddsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction parseFrom(
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
      com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction)
      com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleHttpHeaderAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleHttpHeaderAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.class,
              com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestHeadersToAddsBuilder_ == null) {
        requestHeadersToAdds_ = java.util.Collections.emptyList();
      } else {
        requestHeadersToAdds_ = null;
        requestHeadersToAddsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPolicyRuleHttpHeaderAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction build() {
      com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction buildPartial() {
      com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction result =
          new com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction(this);
      int from_bitField0_ = bitField0_;
      if (requestHeadersToAddsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requestHeadersToAdds_ = java.util.Collections.unmodifiableList(requestHeadersToAdds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requestHeadersToAdds_ = requestHeadersToAdds_;
      } else {
        result.requestHeadersToAdds_ = requestHeadersToAddsBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction) {
        return mergeFrom((com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction other) {
      if (other
          == com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction.getDefaultInstance())
        return this;
      if (requestHeadersToAddsBuilder_ == null) {
        if (!other.requestHeadersToAdds_.isEmpty()) {
          if (requestHeadersToAdds_.isEmpty()) {
            requestHeadersToAdds_ = other.requestHeadersToAdds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestHeadersToAddsIsMutable();
            requestHeadersToAdds_.addAll(other.requestHeadersToAdds_);
          }
          onChanged();
        }
      } else {
        if (!other.requestHeadersToAdds_.isEmpty()) {
          if (requestHeadersToAddsBuilder_.isEmpty()) {
            requestHeadersToAddsBuilder_.dispose();
            requestHeadersToAddsBuilder_ = null;
            requestHeadersToAdds_ = other.requestHeadersToAdds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestHeadersToAddsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRequestHeadersToAddsFieldBuilder()
                    : null;
          } else {
            requestHeadersToAddsBuilder_.addAllMessages(other.requestHeadersToAdds_);
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
            case 703901290:
              {
                com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption m =
                    input.readMessage(
                        com.google.cloud.compute.v1
                            .SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.parser(),
                        extensionRegistry);
                if (requestHeadersToAddsBuilder_ == null) {
                  ensureRequestHeadersToAddsIsMutable();
                  requestHeadersToAdds_.add(m);
                } else {
                  requestHeadersToAddsBuilder_.addMessage(m);
                }
                break;
              } // case 703901290
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

    private java.util.List<
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>
        requestHeadersToAdds_ = java.util.Collections.emptyList();

    private void ensureRequestHeadersToAddsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requestHeadersToAdds_ =
            new java.util.ArrayList<
                com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>(
                requestHeadersToAdds_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption,
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder,
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder>
        requestHeadersToAddsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public java.util.List<
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>
        getRequestHeadersToAddsList() {
      if (requestHeadersToAddsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requestHeadersToAdds_);
      } else {
        return requestHeadersToAddsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public int getRequestHeadersToAddsCount() {
      if (requestHeadersToAddsBuilder_ == null) {
        return requestHeadersToAdds_.size();
      } else {
        return requestHeadersToAddsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption
        getRequestHeadersToAdds(int index) {
      if (requestHeadersToAddsBuilder_ == null) {
        return requestHeadersToAdds_.get(index);
      } else {
        return requestHeadersToAddsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder setRequestHeadersToAdds(
        int index,
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption value) {
      if (requestHeadersToAddsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.set(index, value);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder setRequestHeadersToAdds(
        int index,
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
            builderForValue) {
      if (requestHeadersToAddsBuilder_ == null) {
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder addRequestHeadersToAdds(
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption value) {
      if (requestHeadersToAddsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.add(value);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder addRequestHeadersToAdds(
        int index,
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption value) {
      if (requestHeadersToAddsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.add(index, value);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder addRequestHeadersToAdds(
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
            builderForValue) {
      if (requestHeadersToAddsBuilder_ == null) {
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.add(builderForValue.build());
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder addRequestHeadersToAdds(
        int index,
        com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
            builderForValue) {
      if (requestHeadersToAddsBuilder_ == null) {
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder addAllRequestHeadersToAdds(
        java.lang.Iterable<
                ? extends
                    com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption>
            values) {
      if (requestHeadersToAddsBuilder_ == null) {
        ensureRequestHeadersToAddsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requestHeadersToAdds_);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder clearRequestHeadersToAdds() {
      if (requestHeadersToAddsBuilder_ == null) {
        requestHeadersToAdds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public Builder removeRequestHeadersToAdds(int index) {
      if (requestHeadersToAddsBuilder_ == null) {
        ensureRequestHeadersToAddsIsMutable();
        requestHeadersToAdds_.remove(index);
        onChanged();
      } else {
        requestHeadersToAddsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
        getRequestHeadersToAddsBuilder(int index) {
      return getRequestHeadersToAddsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder
        getRequestHeadersToAddsOrBuilder(int index) {
      if (requestHeadersToAddsBuilder_ == null) {
        return requestHeadersToAdds_.get(index);
      } else {
        return requestHeadersToAddsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public java.util.List<
            ? extends
                com.google.cloud.compute.v1
                    .SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder>
        getRequestHeadersToAddsOrBuilderList() {
      if (requestHeadersToAddsBuilder_ != null) {
        return requestHeadersToAddsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requestHeadersToAdds_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
        addRequestHeadersToAddsBuilder() {
      return getRequestHeadersToAddsFieldBuilder()
          .addBuilder(
              com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder
        addRequestHeadersToAddsBuilder(int index) {
      return getRequestHeadersToAddsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption
                  .getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of request headers to add or overwrite if they're already present.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption request_headers_to_adds = 87987661;
     * </code>
     */
    public java.util.List<
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder>
        getRequestHeadersToAddsBuilderList() {
      return getRequestHeadersToAddsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption,
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption.Builder,
            com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder>
        getRequestHeadersToAddsFieldBuilder() {
      if (requestHeadersToAddsBuilder_ == null) {
        requestHeadersToAddsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption,
                com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderActionHttpHeaderOption
                    .Builder,
                com.google.cloud.compute.v1
                    .SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionOrBuilder>(
                requestHeadersToAdds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        requestHeadersToAdds_ = null;
      }
      return requestHeadersToAddsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction)
  private static final com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction();
  }

  public static com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityPolicyRuleHttpHeaderAction> PARSER =
      new com.google.protobuf.AbstractParser<SecurityPolicyRuleHttpHeaderAction>() {
        @java.lang.Override
        public SecurityPolicyRuleHttpHeaderAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityPolicyRuleHttpHeaderAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityPolicyRuleHttpHeaderAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPolicyRuleHttpHeaderAction
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
