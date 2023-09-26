// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

/**
 * <pre>
 * The response returned from the [ListConstraints]
 * [google.cloud.orgpolicy.v2.OrgPolicy.ListConstraints] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orgpolicy.v2.ListConstraintsResponse}
 */
public final class ListConstraintsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.orgpolicy.v2.ListConstraintsResponse)
    ListConstraintsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConstraintsResponse.newBuilder() to construct.
  private ListConstraintsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConstraintsResponse() {
    constraints_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConstraintsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orgpolicy.v2.ListConstraintsResponse.class, com.google.cloud.orgpolicy.v2.ListConstraintsResponse.Builder.class);
  }

  public static final int CONSTRAINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.orgpolicy.v2.Constraint> constraints_;
  /**
   * <pre>
   * The collection of constraints that are available on the targeted resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.orgpolicy.v2.Constraint> getConstraintsList() {
    return constraints_;
  }
  /**
   * <pre>
   * The collection of constraints that are available on the targeted resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.orgpolicy.v2.ConstraintOrBuilder> 
      getConstraintsOrBuilderList() {
    return constraints_;
  }
  /**
   * <pre>
   * The collection of constraints that are available on the targeted resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
   */
  @java.lang.Override
  public int getConstraintsCount() {
    return constraints_.size();
  }
  /**
   * <pre>
   * The collection of constraints that are available on the targeted resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.Constraint getConstraints(int index) {
    return constraints_.get(index);
  }
  /**
   * <pre>
   * The collection of constraints that are available on the targeted resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.ConstraintOrBuilder getConstraintsOrBuilder(
      int index) {
    return constraints_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently not used.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Page token used to retrieve the next page. This is currently not used.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < constraints_.size(); i++) {
      output.writeMessage(1, constraints_.get(i));
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
    for (int i = 0; i < constraints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, constraints_.get(i));
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
    if (!(obj instanceof com.google.cloud.orgpolicy.v2.ListConstraintsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.orgpolicy.v2.ListConstraintsResponse other = (com.google.cloud.orgpolicy.v2.ListConstraintsResponse) obj;

    if (!getConstraintsList()
        .equals(other.getConstraintsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getConstraintsCount() > 0) {
      hash = (37 * hash) + CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getConstraintsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.orgpolicy.v2.ListConstraintsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response returned from the [ListConstraints]
   * [google.cloud.orgpolicy.v2.OrgPolicy.ListConstraints] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orgpolicy.v2.ListConstraintsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orgpolicy.v2.ListConstraintsResponse)
      com.google.cloud.orgpolicy.v2.ListConstraintsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orgpolicy.v2.ListConstraintsResponse.class, com.google.cloud.orgpolicy.v2.ListConstraintsResponse.Builder.class);
    }

    // Construct using com.google.cloud.orgpolicy.v2.ListConstraintsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
      } else {
        constraints_ = null;
        constraintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto.internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.ListConstraintsResponse getDefaultInstanceForType() {
      return com.google.cloud.orgpolicy.v2.ListConstraintsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.ListConstraintsResponse build() {
      com.google.cloud.orgpolicy.v2.ListConstraintsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.ListConstraintsResponse buildPartial() {
      com.google.cloud.orgpolicy.v2.ListConstraintsResponse result = new com.google.cloud.orgpolicy.v2.ListConstraintsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.orgpolicy.v2.ListConstraintsResponse result) {
      if (constraintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          constraints_ = java.util.Collections.unmodifiableList(constraints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.constraints_ = constraints_;
      } else {
        result.constraints_ = constraintsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.orgpolicy.v2.ListConstraintsResponse result) {
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.orgpolicy.v2.ListConstraintsResponse) {
        return mergeFrom((com.google.cloud.orgpolicy.v2.ListConstraintsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orgpolicy.v2.ListConstraintsResponse other) {
      if (other == com.google.cloud.orgpolicy.v2.ListConstraintsResponse.getDefaultInstance()) return this;
      if (constraintsBuilder_ == null) {
        if (!other.constraints_.isEmpty()) {
          if (constraints_.isEmpty()) {
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConstraintsIsMutable();
            constraints_.addAll(other.constraints_);
          }
          onChanged();
        }
      } else {
        if (!other.constraints_.isEmpty()) {
          if (constraintsBuilder_.isEmpty()) {
            constraintsBuilder_.dispose();
            constraintsBuilder_ = null;
            constraints_ = other.constraints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            constraintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConstraintsFieldBuilder() : null;
          } else {
            constraintsBuilder_.addAllMessages(other.constraints_);
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
            case 10: {
              com.google.cloud.orgpolicy.v2.Constraint m =
                  input.readMessage(
                      com.google.cloud.orgpolicy.v2.Constraint.parser(),
                      extensionRegistry);
              if (constraintsBuilder_ == null) {
                ensureConstraintsIsMutable();
                constraints_.add(m);
              } else {
                constraintsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private java.util.List<com.google.cloud.orgpolicy.v2.Constraint> constraints_ =
      java.util.Collections.emptyList();
    private void ensureConstraintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        constraints_ = new java.util.ArrayList<com.google.cloud.orgpolicy.v2.Constraint>(constraints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.orgpolicy.v2.Constraint, com.google.cloud.orgpolicy.v2.Constraint.Builder, com.google.cloud.orgpolicy.v2.ConstraintOrBuilder> constraintsBuilder_;

    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public java.util.List<com.google.cloud.orgpolicy.v2.Constraint> getConstraintsList() {
      if (constraintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(constraints_);
      } else {
        return constraintsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public int getConstraintsCount() {
      if (constraintsBuilder_ == null) {
        return constraints_.size();
      } else {
        return constraintsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public com.google.cloud.orgpolicy.v2.Constraint getConstraints(int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);
      } else {
        return constraintsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder setConstraints(
        int index, com.google.cloud.orgpolicy.v2.Constraint value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.set(index, value);
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder setConstraints(
        int index, com.google.cloud.orgpolicy.v2.Constraint.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.set(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder addConstraints(com.google.cloud.orgpolicy.v2.Constraint value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder addConstraints(
        int index, com.google.cloud.orgpolicy.v2.Constraint value) {
      if (constraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConstraintsIsMutable();
        constraints_.add(index, value);
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder addConstraints(
        com.google.cloud.orgpolicy.v2.Constraint.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder addConstraints(
        int index, com.google.cloud.orgpolicy.v2.Constraint.Builder builderForValue) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.add(index, builderForValue.build());
        onChanged();
      } else {
        constraintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder addAllConstraints(
        java.lang.Iterable<? extends com.google.cloud.orgpolicy.v2.Constraint> values) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, constraints_);
        onChanged();
      } else {
        constraintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder clearConstraints() {
      if (constraintsBuilder_ == null) {
        constraints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        constraintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public Builder removeConstraints(int index) {
      if (constraintsBuilder_ == null) {
        ensureConstraintsIsMutable();
        constraints_.remove(index);
        onChanged();
      } else {
        constraintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public com.google.cloud.orgpolicy.v2.Constraint.Builder getConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public com.google.cloud.orgpolicy.v2.ConstraintOrBuilder getConstraintsOrBuilder(
        int index) {
      if (constraintsBuilder_ == null) {
        return constraints_.get(index);  } else {
        return constraintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.orgpolicy.v2.ConstraintOrBuilder> 
         getConstraintsOrBuilderList() {
      if (constraintsBuilder_ != null) {
        return constraintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(constraints_);
      }
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public com.google.cloud.orgpolicy.v2.Constraint.Builder addConstraintsBuilder() {
      return getConstraintsFieldBuilder().addBuilder(
          com.google.cloud.orgpolicy.v2.Constraint.getDefaultInstance());
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public com.google.cloud.orgpolicy.v2.Constraint.Builder addConstraintsBuilder(
        int index) {
      return getConstraintsFieldBuilder().addBuilder(
          index, com.google.cloud.orgpolicy.v2.Constraint.getDefaultInstance());
    }
    /**
     * <pre>
     * The collection of constraints that are available on the targeted resource.
     * </pre>
     *
     * <code>repeated .google.cloud.orgpolicy.v2.Constraint constraints = 1;</code>
     */
    public java.util.List<com.google.cloud.orgpolicy.v2.Constraint.Builder> 
         getConstraintsBuilderList() {
      return getConstraintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.orgpolicy.v2.Constraint, com.google.cloud.orgpolicy.v2.Constraint.Builder, com.google.cloud.orgpolicy.v2.ConstraintOrBuilder> 
        getConstraintsFieldBuilder() {
      if (constraintsBuilder_ == null) {
        constraintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.Constraint, com.google.cloud.orgpolicy.v2.Constraint.Builder, com.google.cloud.orgpolicy.v2.ConstraintOrBuilder>(
                constraints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        constraints_ = null;
      }
      return constraintsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Page token used to retrieve the next page. This is currently not used.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Page token used to retrieve the next page. This is currently not used.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Page token used to retrieve the next page. This is currently not used.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page token used to retrieve the next page. This is currently not used.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page token used to retrieve the next page. This is currently not used.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.orgpolicy.v2.ListConstraintsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orgpolicy.v2.ListConstraintsResponse)
  private static final com.google.cloud.orgpolicy.v2.ListConstraintsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.orgpolicy.v2.ListConstraintsResponse();
  }

  public static com.google.cloud.orgpolicy.v2.ListConstraintsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConstraintsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConstraintsResponse>() {
    @java.lang.Override
    public ListConstraintsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConstraintsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConstraintsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.ListConstraintsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

