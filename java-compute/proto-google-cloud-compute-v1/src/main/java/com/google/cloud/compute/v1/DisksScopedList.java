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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.DisksScopedList}
 */
public final class DisksScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.DisksScopedList)
    DisksScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DisksScopedList.newBuilder() to construct.
  private DisksScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DisksScopedList() {
    disks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DisksScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DisksScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_DisksScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.DisksScopedList.class,
            com.google.cloud.compute.v1.DisksScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int DISKS_FIELD_NUMBER = 95594102;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.Disk> disks_;
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Disk> getDisksList() {
    return disks_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.DiskOrBuilder>
      getDisksOrBuilderList() {
    return disks_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
   */
  @java.lang.Override
  public int getDisksCount() {
    return disks_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Disk getDisks(int index) {
    return disks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of disks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskOrBuilder getDisksOrBuilder(int index) {
    return disks_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disks when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disks when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of disks when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < disks_.size(); i++) {
      output.writeMessage(95594102, disks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < disks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(95594102, disks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.DisksScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.DisksScopedList other =
        (com.google.cloud.compute.v1.DisksScopedList) obj;

    if (!getDisksList().equals(other.getDisksList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getDisksCount() > 0) {
      hash = (37 * hash) + DISKS_FIELD_NUMBER;
      hash = (53 * hash) + getDisksList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.DisksScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.DisksScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.DisksScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.DisksScopedList)
      com.google.cloud.compute.v1.DisksScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DisksScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DisksScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.DisksScopedList.class,
              com.google.cloud.compute.v1.DisksScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.DisksScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDisksFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
      } else {
        disks_ = null;
        disksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_DisksScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.DisksScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksScopedList build() {
      com.google.cloud.compute.v1.DisksScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksScopedList buildPartial() {
      com.google.cloud.compute.v1.DisksScopedList result =
          new com.google.cloud.compute.v1.DisksScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.DisksScopedList result) {
      if (disksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          disks_ = java.util.Collections.unmodifiableList(disks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.disks_ = disks_;
      } else {
        result.disks_ = disksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.DisksScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.DisksScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.DisksScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.DisksScopedList other) {
      if (other == com.google.cloud.compute.v1.DisksScopedList.getDefaultInstance()) return this;
      if (disksBuilder_ == null) {
        if (!other.disks_.isEmpty()) {
          if (disks_.isEmpty()) {
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDisksIsMutable();
            disks_.addAll(other.disks_);
          }
          onChanged();
        }
      } else {
        if (!other.disks_.isEmpty()) {
          if (disksBuilder_.isEmpty()) {
            disksBuilder_.dispose();
            disksBuilder_ = null;
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            disksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDisksFieldBuilder()
                    : null;
          } else {
            disksBuilder_.addAllMessages(other.disks_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case 764752818:
              {
                com.google.cloud.compute.v1.Disk m =
                    input.readMessage(com.google.cloud.compute.v1.Disk.parser(), extensionRegistry);
                if (disksBuilder_ == null) {
                  ensureDisksIsMutable();
                  disks_.add(m);
                } else {
                  disksBuilder_.addMessage(m);
                }
                break;
              } // case 764752818
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

    private java.util.List<com.google.cloud.compute.v1.Disk> disks_ =
        java.util.Collections.emptyList();

    private void ensureDisksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        disks_ = new java.util.ArrayList<com.google.cloud.compute.v1.Disk>(disks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Disk,
            com.google.cloud.compute.v1.Disk.Builder,
            com.google.cloud.compute.v1.DiskOrBuilder>
        disksBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Disk> getDisksList() {
      if (disksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(disks_);
      } else {
        return disksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public int getDisksCount() {
      if (disksBuilder_ == null) {
        return disks_.size();
      } else {
        return disksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public com.google.cloud.compute.v1.Disk getDisks(int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);
      } else {
        return disksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder setDisks(int index, com.google.cloud.compute.v1.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.set(index, value);
        onChanged();
      } else {
        disksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder setDisks(int index, com.google.cloud.compute.v1.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.set(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder addDisks(com.google.cloud.compute.v1.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(value);
        onChanged();
      } else {
        disksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder addDisks(int index, com.google.cloud.compute.v1.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(index, value);
        onChanged();
      } else {
        disksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder addDisks(com.google.cloud.compute.v1.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder addDisks(int index, com.google.cloud.compute.v1.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder addAllDisks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Disk> values) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, disks_);
        onChanged();
      } else {
        disksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder clearDisks() {
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        disksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public Builder removeDisks(int index) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.remove(index);
        onChanged();
      } else {
        disksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public com.google.cloud.compute.v1.Disk.Builder getDisksBuilder(int index) {
      return getDisksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public com.google.cloud.compute.v1.DiskOrBuilder getDisksOrBuilder(int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);
      } else {
        return disksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.DiskOrBuilder>
        getDisksOrBuilderList() {
      if (disksBuilder_ != null) {
        return disksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(disks_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public com.google.cloud.compute.v1.Disk.Builder addDisksBuilder() {
      return getDisksFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Disk.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public com.google.cloud.compute.v1.Disk.Builder addDisksBuilder(int index) {
      return getDisksFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Disk.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of disks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Disk disks = 95594102;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Disk.Builder> getDisksBuilderList() {
      return getDisksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Disk,
            com.google.cloud.compute.v1.Disk.Builder,
            com.google.cloud.compute.v1.DiskOrBuilder>
        getDisksFieldBuilder() {
      if (disksBuilder_ == null) {
        disksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Disk,
                com.google.cloud.compute.v1.Disk.Builder,
                com.google.cloud.compute.v1.DiskOrBuilder>(
                disks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        disks_ = null;
      }
      return disksBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of disks when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.DisksScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.DisksScopedList)
  private static final com.google.cloud.compute.v1.DisksScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.DisksScopedList();
  }

  public static com.google.cloud.compute.v1.DisksScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisksScopedList> PARSER =
      new com.google.protobuf.AbstractParser<DisksScopedList>() {
        @java.lang.Override
        public DisksScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DisksScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisksScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.DisksScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
