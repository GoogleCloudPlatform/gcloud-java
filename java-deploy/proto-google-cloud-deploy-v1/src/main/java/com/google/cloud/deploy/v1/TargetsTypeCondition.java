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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * TargetsTypeCondition contains information on whether the Targets defined in
 * the Delivery Pipeline are of the same type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.TargetsTypeCondition}
 */
public final class TargetsTypeCondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.TargetsTypeCondition)
    TargetsTypeConditionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetsTypeCondition.newBuilder() to construct.
  private TargetsTypeCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetsTypeCondition() {
    errorDetails_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetsTypeCondition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetsTypeCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_TargetsTypeCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.TargetsTypeCondition.class,
            com.google.cloud.deploy.v1.TargetsTypeCondition.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_ = false;
  /**
   *
   *
   * <pre>
   * True if the targets are all a comparable type. For example this is true if
   * all targets are GKE clusters. This is false if some targets are Cloud Run
   * targets and others are GKE clusters.
   * </pre>
   *
   * <code>bool status = 1;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public boolean getStatus() {
    return status_;
  }

  public static final int ERROR_DETAILS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object errorDetails_ = "";
  /**
   *
   *
   * <pre>
   * Human readable error message.
   * </pre>
   *
   * <code>string error_details = 2;</code>
   *
   * @return The errorDetails.
   */
  @java.lang.Override
  public java.lang.String getErrorDetails() {
    java.lang.Object ref = errorDetails_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorDetails_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human readable error message.
   * </pre>
   *
   * <code>string error_details = 2;</code>
   *
   * @return The bytes for errorDetails.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrorDetailsBytes() {
    java.lang.Object ref = errorDetails_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      errorDetails_ = b;
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorDetails_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorDetails_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorDetails_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorDetails_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.TargetsTypeCondition)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.TargetsTypeCondition other =
        (com.google.cloud.deploy.v1.TargetsTypeCondition) obj;

    if (getStatus() != other.getStatus()) return false;
    if (!getErrorDetails().equals(other.getErrorDetails())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStatus());
    hash = (37 * hash) + ERROR_DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getErrorDetails().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.TargetsTypeCondition prototype) {
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
   * TargetsTypeCondition contains information on whether the Targets defined in
   * the Delivery Pipeline are of the same type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.TargetsTypeCondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.TargetsTypeCondition)
      com.google.cloud.deploy.v1.TargetsTypeConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsTypeCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsTypeCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.TargetsTypeCondition.class,
              com.google.cloud.deploy.v1.TargetsTypeCondition.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.TargetsTypeCondition.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      status_ = false;
      errorDetails_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_TargetsTypeCondition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsTypeCondition getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.TargetsTypeCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsTypeCondition build() {
      com.google.cloud.deploy.v1.TargetsTypeCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.TargetsTypeCondition buildPartial() {
      com.google.cloud.deploy.v1.TargetsTypeCondition result =
          new com.google.cloud.deploy.v1.TargetsTypeCondition(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.TargetsTypeCondition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorDetails_ = errorDetails_;
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
      if (other instanceof com.google.cloud.deploy.v1.TargetsTypeCondition) {
        return mergeFrom((com.google.cloud.deploy.v1.TargetsTypeCondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.TargetsTypeCondition other) {
      if (other == com.google.cloud.deploy.v1.TargetsTypeCondition.getDefaultInstance())
        return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (!other.getErrorDetails().isEmpty()) {
        errorDetails_ = other.errorDetails_;
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
            case 8:
              {
                status_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                errorDetails_ = input.readStringRequireUtf8();
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

    private boolean status_;
    /**
     *
     *
     * <pre>
     * True if the targets are all a comparable type. For example this is true if
     * all targets are GKE clusters. This is false if some targets are Cloud Run
     * targets and others are GKE clusters.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public boolean getStatus() {
      return status_;
    }
    /**
     *
     *
     * <pre>
     * True if the targets are all a comparable type. For example this is true if
     * all targets are GKE clusters. This is false if some targets are Cloud Run
     * targets and others are GKE clusters.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(boolean value) {

      status_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * True if the targets are all a comparable type. For example this is true if
     * all targets are GKE clusters. This is false if some targets are Cloud Run
     * targets and others are GKE clusters.
     * </pre>
     *
     * <code>bool status = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object errorDetails_ = "";
    /**
     *
     *
     * <pre>
     * Human readable error message.
     * </pre>
     *
     * <code>string error_details = 2;</code>
     *
     * @return The errorDetails.
     */
    public java.lang.String getErrorDetails() {
      java.lang.Object ref = errorDetails_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorDetails_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable error message.
     * </pre>
     *
     * <code>string error_details = 2;</code>
     *
     * @return The bytes for errorDetails.
     */
    public com.google.protobuf.ByteString getErrorDetailsBytes() {
      java.lang.Object ref = errorDetails_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        errorDetails_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable error message.
     * </pre>
     *
     * <code>string error_details = 2;</code>
     *
     * @param value The errorDetails to set.
     * @return This builder for chaining.
     */
    public Builder setErrorDetails(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      errorDetails_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable error message.
     * </pre>
     *
     * <code>string error_details = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearErrorDetails() {
      errorDetails_ = getDefaultInstance().getErrorDetails();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable error message.
     * </pre>
     *
     * <code>string error_details = 2;</code>
     *
     * @param value The bytes for errorDetails to set.
     * @return This builder for chaining.
     */
    public Builder setErrorDetailsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      errorDetails_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.TargetsTypeCondition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.TargetsTypeCondition)
  private static final com.google.cloud.deploy.v1.TargetsTypeCondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.TargetsTypeCondition();
  }

  public static com.google.cloud.deploy.v1.TargetsTypeCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetsTypeCondition> PARSER =
      new com.google.protobuf.AbstractParser<TargetsTypeCondition>() {
        @java.lang.Override
        public TargetsTypeCondition parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetsTypeCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetsTypeCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetsTypeCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
