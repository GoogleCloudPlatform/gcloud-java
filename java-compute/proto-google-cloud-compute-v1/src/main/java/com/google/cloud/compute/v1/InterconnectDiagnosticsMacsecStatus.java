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
 * Describes the status of MACsec encryption on the link.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus}
 */
public final class InterconnectDiagnosticsMacsecStatus
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)
    InterconnectDiagnosticsMacsecStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectDiagnosticsMacsecStatus.newBuilder() to construct.
  private InterconnectDiagnosticsMacsecStatus(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectDiagnosticsMacsecStatus() {
    ckn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectDiagnosticsMacsecStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectDiagnosticsMacsecStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectDiagnosticsMacsecStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.class,
            com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.Builder.class);
  }

  private int bitField0_;
  public static final int CKN_FIELD_NUMBER = 98566;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ckn_ = "";
  /**
   *
   *
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   *
   * @return Whether the ckn field is set.
   */
  @java.lang.Override
  public boolean hasCkn() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   *
   * @return The ckn.
   */
  @java.lang.Override
  public java.lang.String getCkn() {
    java.lang.Object ref = ckn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ckn_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
   * </pre>
   *
   * <code>optional string ckn = 98566;</code>
   *
   * @return The bytes for ckn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCknBytes() {
    java.lang.Object ref = ckn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ckn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATIONAL_FIELD_NUMBER = 129704914;
  private boolean operational_ = false;
  /**
   *
   *
   * <pre>
   * Indicates whether or not MACsec is operational on this link.
   * </pre>
   *
   * <code>optional bool operational = 129704914;</code>
   *
   * @return Whether the operational field is set.
   */
  @java.lang.Override
  public boolean hasOperational() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Indicates whether or not MACsec is operational on this link.
   * </pre>
   *
   * <code>optional bool operational = 129704914;</code>
   *
   * @return The operational.
   */
  @java.lang.Override
  public boolean getOperational() {
    return operational_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98566, ckn_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(129704914, operational_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98566, ckn_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(129704914, operational_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus other =
        (com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus) obj;

    if (hasCkn() != other.hasCkn()) return false;
    if (hasCkn()) {
      if (!getCkn().equals(other.getCkn())) return false;
    }
    if (hasOperational() != other.hasOperational()) return false;
    if (hasOperational()) {
      if (getOperational() != other.getOperational()) return false;
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
    if (hasCkn()) {
      hash = (37 * hash) + CKN_FIELD_NUMBER;
      hash = (53 * hash) + getCkn().hashCode();
    }
    if (hasOperational()) {
      hash = (37 * hash) + OPERATIONAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOperational());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus parseFrom(
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
      com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus prototype) {
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
   * Describes the status of MACsec encryption on the link.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)
      com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectDiagnosticsMacsecStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectDiagnosticsMacsecStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.class,
              com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ckn_ = "";
      operational_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectDiagnosticsMacsecStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus build() {
      com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus buildPartial() {
      com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus result =
          new com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ckn_ = ckn_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operational_ = operational_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus other) {
      if (other
          == com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus.getDefaultInstance())
        return this;
      if (other.hasCkn()) {
        ckn_ = other.ckn_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOperational()) {
        setOperational(other.getOperational());
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
            case 788530:
              {
                ckn_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 788530
            case 1037639312:
              {
                operational_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 1037639312
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

    private java.lang.Object ckn_ = "";
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @return Whether the ckn field is set.
     */
    public boolean hasCkn() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @return The ckn.
     */
    public java.lang.String getCkn() {
      java.lang.Object ref = ckn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ckn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @return The bytes for ckn.
     */
    public com.google.protobuf.ByteString getCknBytes() {
      java.lang.Object ref = ckn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ckn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @param value The ckn to set.
     * @return This builder for chaining.
     */
    public Builder setCkn(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ckn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCkn() {
      ckn_ = getDefaultInstance().getCkn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates the Connectivity Association Key Name (CKN) currently being used if MACsec is operational.
     * </pre>
     *
     * <code>optional string ckn = 98566;</code>
     *
     * @param value The bytes for ckn to set.
     * @return This builder for chaining.
     */
    public Builder setCknBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ckn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean operational_;
    /**
     *
     *
     * <pre>
     * Indicates whether or not MACsec is operational on this link.
     * </pre>
     *
     * <code>optional bool operational = 129704914;</code>
     *
     * @return Whether the operational field is set.
     */
    @java.lang.Override
    public boolean hasOperational() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not MACsec is operational on this link.
     * </pre>
     *
     * <code>optional bool operational = 129704914;</code>
     *
     * @return The operational.
     */
    @java.lang.Override
    public boolean getOperational() {
      return operational_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not MACsec is operational on this link.
     * </pre>
     *
     * <code>optional bool operational = 129704914;</code>
     *
     * @param value The operational to set.
     * @return This builder for chaining.
     */
    public Builder setOperational(boolean value) {

      operational_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not MACsec is operational on this link.
     * </pre>
     *
     * <code>optional bool operational = 129704914;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOperational() {
      bitField0_ = (bitField0_ & ~0x00000002);
      operational_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus)
  private static final com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus();
  }

  public static com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectDiagnosticsMacsecStatus> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectDiagnosticsMacsecStatus>() {
        @java.lang.Override
        public InterconnectDiagnosticsMacsecStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectDiagnosticsMacsecStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectDiagnosticsMacsecStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectDiagnosticsMacsecStatus
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
