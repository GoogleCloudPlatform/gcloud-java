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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Target used to match against for Discovery.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DiscoveryTarget}
 */
public final class DiscoveryTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DiscoveryTarget)
    DiscoveryTargetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiscoveryTarget.newBuilder() to construct.
  private DiscoveryTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoveryTarget() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoveryTarget();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DiscoveryTarget.class,
            com.google.privacy.dlp.v2.DiscoveryTarget.Builder.class);
  }

  private int targetCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object target_;

  public enum TargetCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BIG_QUERY_TARGET(1),
    TARGET_NOT_SET(0);
    private final int value;

    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 1:
          return BIG_QUERY_TARGET;
        case 0:
          return TARGET_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase getTargetCase() {
    return TargetCase.forNumber(targetCase_);
  }

  public static final int BIG_QUERY_TARGET_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * BigQuery target for Discovery. The first target to match a table will be
   * the one applied.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
   *
   * @return Whether the bigQueryTarget field is set.
   */
  @java.lang.Override
  public boolean hasBigQueryTarget() {
    return targetCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * BigQuery target for Discovery. The first target to match a table will be
   * the one applied.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
   *
   * @return The bigQueryTarget.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryDiscoveryTarget getBigQueryTarget() {
    if (targetCase_ == 1) {
      return (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_;
    }
    return com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * BigQuery target for Discovery. The first target to match a table will be
   * the one applied.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryDiscoveryTargetOrBuilder getBigQueryTargetOrBuilder() {
    if (targetCase_ == 1) {
      return (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_;
    }
    return com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
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
    if (targetCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DiscoveryTarget)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DiscoveryTarget other =
        (com.google.privacy.dlp.v2.DiscoveryTarget) obj;

    if (!getTargetCase().equals(other.getTargetCase())) return false;
    switch (targetCase_) {
      case 1:
        if (!getBigQueryTarget().equals(other.getBigQueryTarget())) return false;
        break;
      case 0:
      default:
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
    switch (targetCase_) {
      case 1:
        hash = (37 * hash) + BIG_QUERY_TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getBigQueryTarget().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DiscoveryTarget prototype) {
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
   * Target used to match against for Discovery.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DiscoveryTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DiscoveryTarget)
      com.google.privacy.dlp.v2.DiscoveryTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DiscoveryTarget.class,
              com.google.privacy.dlp.v2.DiscoveryTarget.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DiscoveryTarget.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (bigQueryTargetBuilder_ != null) {
        bigQueryTargetBuilder_.clear();
      }
      targetCase_ = 0;
      target_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryTarget_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryTarget getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DiscoveryTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryTarget build() {
      com.google.privacy.dlp.v2.DiscoveryTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryTarget buildPartial() {
      com.google.privacy.dlp.v2.DiscoveryTarget result =
          new com.google.privacy.dlp.v2.DiscoveryTarget(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DiscoveryTarget result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.DiscoveryTarget result) {
      result.targetCase_ = targetCase_;
      result.target_ = this.target_;
      if (targetCase_ == 1 && bigQueryTargetBuilder_ != null) {
        result.target_ = bigQueryTargetBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.DiscoveryTarget) {
        return mergeFrom((com.google.privacy.dlp.v2.DiscoveryTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DiscoveryTarget other) {
      if (other == com.google.privacy.dlp.v2.DiscoveryTarget.getDefaultInstance()) return this;
      switch (other.getTargetCase()) {
        case BIG_QUERY_TARGET:
          {
            mergeBigQueryTarget(other.getBigQueryTarget());
            break;
          }
        case TARGET_NOT_SET:
          {
            break;
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
                input.readMessage(getBigQueryTargetFieldBuilder().getBuilder(), extensionRegistry);
                targetCase_ = 1;
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

    private int targetCase_ = 0;
    private java.lang.Object target_;

    public TargetCase getTargetCase() {
      return TargetCase.forNumber(targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryDiscoveryTarget,
            com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.Builder,
            com.google.privacy.dlp.v2.BigQueryDiscoveryTargetOrBuilder>
        bigQueryTargetBuilder_;
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     *
     * @return Whether the bigQueryTarget field is set.
     */
    @java.lang.Override
    public boolean hasBigQueryTarget() {
      return targetCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     *
     * @return The bigQueryTarget.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryDiscoveryTarget getBigQueryTarget() {
      if (bigQueryTargetBuilder_ == null) {
        if (targetCase_ == 1) {
          return (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_;
        }
        return com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
      } else {
        if (targetCase_ == 1) {
          return bigQueryTargetBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    public Builder setBigQueryTarget(com.google.privacy.dlp.v2.BigQueryDiscoveryTarget value) {
      if (bigQueryTargetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        bigQueryTargetBuilder_.setMessage(value);
      }
      targetCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    public Builder setBigQueryTarget(
        com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.Builder builderForValue) {
      if (bigQueryTargetBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        bigQueryTargetBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    public Builder mergeBigQueryTarget(com.google.privacy.dlp.v2.BigQueryDiscoveryTarget value) {
      if (bigQueryTargetBuilder_ == null) {
        if (targetCase_ == 1
            && target_ != com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance()) {
          target_ =
              com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.newBuilder(
                      (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 1) {
          bigQueryTargetBuilder_.mergeFrom(value);
        } else {
          bigQueryTargetBuilder_.setMessage(value);
        }
      }
      targetCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    public Builder clearBigQueryTarget() {
      if (bigQueryTargetBuilder_ == null) {
        if (targetCase_ == 1) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 1) {
          targetCase_ = 0;
          target_ = null;
        }
        bigQueryTargetBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.Builder getBigQueryTargetBuilder() {
      return getBigQueryTargetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryDiscoveryTargetOrBuilder getBigQueryTargetOrBuilder() {
      if ((targetCase_ == 1) && (bigQueryTargetBuilder_ != null)) {
        return bigQueryTargetBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 1) {
          return (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_;
        }
        return com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * BigQuery target for Discovery. The first target to match a table will be
     * the one applied.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryDiscoveryTarget big_query_target = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryDiscoveryTarget,
            com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.Builder,
            com.google.privacy.dlp.v2.BigQueryDiscoveryTargetOrBuilder>
        getBigQueryTargetFieldBuilder() {
      if (bigQueryTargetBuilder_ == null) {
        if (!(targetCase_ == 1)) {
          target_ = com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.getDefaultInstance();
        }
        bigQueryTargetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.BigQueryDiscoveryTarget,
                com.google.privacy.dlp.v2.BigQueryDiscoveryTarget.Builder,
                com.google.privacy.dlp.v2.BigQueryDiscoveryTargetOrBuilder>(
                (com.google.privacy.dlp.v2.BigQueryDiscoveryTarget) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 1;
      onChanged();
      return bigQueryTargetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DiscoveryTarget)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DiscoveryTarget)
  private static final com.google.privacy.dlp.v2.DiscoveryTarget DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DiscoveryTarget();
  }

  public static com.google.privacy.dlp.v2.DiscoveryTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryTarget> PARSER =
      new com.google.protobuf.AbstractParser<DiscoveryTarget>() {
        @java.lang.Override
        public DiscoveryTarget parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiscoveryTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoveryTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
