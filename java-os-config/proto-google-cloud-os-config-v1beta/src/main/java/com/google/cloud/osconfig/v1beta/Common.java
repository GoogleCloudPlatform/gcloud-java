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
// source: google/cloud/osconfig/v1beta/osconfig_common.proto

package com.google.cloud.osconfig.v1beta;

public final class Common {
  private Common() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface FixedOrPercentOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1beta.FixedOrPercent)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Specifies a fixed value.
     * </pre>
     *
     * <code>int32 fixed = 1;</code>
     *
     * @return Whether the fixed field is set.
     */
    boolean hasFixed();
    /**
     *
     *
     * <pre>
     * Specifies a fixed value.
     * </pre>
     *
     * <code>int32 fixed = 1;</code>
     *
     * @return The fixed.
     */
    int getFixed();

    /**
     *
     *
     * <pre>
     * Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * </pre>
     *
     * <code>int32 percent = 2;</code>
     *
     * @return Whether the percent field is set.
     */
    boolean hasPercent();
    /**
     *
     *
     * <pre>
     * Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * </pre>
     *
     * <code>int32 percent = 2;</code>
     *
     * @return The percent.
     */
    int getPercent();

    public com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.ModeCase getModeCase();
  }
  /**
   *
   *
   * <pre>
   * Message encapsulating a value that can be either absolute ("fixed") or
   * relative ("percent") to a value.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1beta.FixedOrPercent}
   */
  public static final class FixedOrPercent extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1beta.FixedOrPercent)
      FixedOrPercentOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use FixedOrPercent.newBuilder() to construct.
    private FixedOrPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private FixedOrPercent() {}

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new FixedOrPercent();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private FixedOrPercent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8:
              {
                mode_ = input.readInt32();
                modeCase_ = 1;
                break;
              }
            case 16:
              {
                mode_ = input.readInt32();
                modeCase_ = 2;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.osconfig.v1beta.Common
          .internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1beta.Common
          .internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.class,
              com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.Builder.class);
    }

    private int modeCase_ = 0;
    private java.lang.Object mode_;

    public enum ModeCase
        implements
            com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      FIXED(1),
      PERCENT(2),
      MODE_NOT_SET(0);
      private final int value;

      private ModeCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ModeCase valueOf(int value) {
        return forNumber(value);
      }

      public static ModeCase forNumber(int value) {
        switch (value) {
          case 1:
            return FIXED;
          case 2:
            return PERCENT;
          case 0:
            return MODE_NOT_SET;
          default:
            return null;
        }
      }

      public int getNumber() {
        return this.value;
      }
    };

    public ModeCase getModeCase() {
      return ModeCase.forNumber(modeCase_);
    }

    public static final int FIXED_FIELD_NUMBER = 1;
    /**
     *
     *
     * <pre>
     * Specifies a fixed value.
     * </pre>
     *
     * <code>int32 fixed = 1;</code>
     *
     * @return Whether the fixed field is set.
     */
    @java.lang.Override
    public boolean hasFixed() {
      return modeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Specifies a fixed value.
     * </pre>
     *
     * <code>int32 fixed = 1;</code>
     *
     * @return The fixed.
     */
    @java.lang.Override
    public int getFixed() {
      if (modeCase_ == 1) {
        return (java.lang.Integer) mode_;
      }
      return 0;
    }

    public static final int PERCENT_FIELD_NUMBER = 2;
    /**
     *
     *
     * <pre>
     * Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * </pre>
     *
     * <code>int32 percent = 2;</code>
     *
     * @return Whether the percent field is set.
     */
    @java.lang.Override
    public boolean hasPercent() {
      return modeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * </pre>
     *
     * <code>int32 percent = 2;</code>
     *
     * @return The percent.
     */
    @java.lang.Override
    public int getPercent() {
      if (modeCase_ == 2) {
        return (java.lang.Integer) mode_;
      }
      return 0;
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
      if (modeCase_ == 1) {
        output.writeInt32(1, (int) ((java.lang.Integer) mode_));
      }
      if (modeCase_ == 2) {
        output.writeInt32(2, (int) ((java.lang.Integer) mode_));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (modeCase_ == 1) {
        size +=
            com.google.protobuf.CodedOutputStream.computeInt32Size(
                1, (int) ((java.lang.Integer) mode_));
      }
      if (modeCase_ == 2) {
        size +=
            com.google.protobuf.CodedOutputStream.computeInt32Size(
                2, (int) ((java.lang.Integer) mode_));
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
      if (!(obj instanceof com.google.cloud.osconfig.v1beta.Common.FixedOrPercent)) {
        return super.equals(obj);
      }
      com.google.cloud.osconfig.v1beta.Common.FixedOrPercent other =
          (com.google.cloud.osconfig.v1beta.Common.FixedOrPercent) obj;

      if (!getModeCase().equals(other.getModeCase())) return false;
      switch (modeCase_) {
        case 1:
          if (getFixed() != other.getFixed()) return false;
          break;
        case 2:
          if (getPercent() != other.getPercent()) return false;
          break;
        case 0:
        default:
      }
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
      switch (modeCase_) {
        case 1:
          hash = (37 * hash) + FIXED_FIELD_NUMBER;
          hash = (53 * hash) + getFixed();
          break;
        case 2:
          hash = (37 * hash) + PERCENT_FIELD_NUMBER;
          hash = (53 * hash) + getPercent();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parseFrom(
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
        com.google.cloud.osconfig.v1beta.Common.FixedOrPercent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Message encapsulating a value that can be either absolute ("fixed") or
     * relative ("percent") to a value.
     * </pre>
     *
     * Protobuf type {@code google.cloud.osconfig.v1beta.FixedOrPercent}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1beta.FixedOrPercent)
        com.google.cloud.osconfig.v1beta.Common.FixedOrPercentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.cloud.osconfig.v1beta.Common
            .internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.cloud.osconfig.v1beta.Common
            .internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.class,
                com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.Builder.class);
      }

      // Construct using com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        modeCase_ = 0;
        mode_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.cloud.osconfig.v1beta.Common
            .internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor;
      }

      @java.lang.Override
      public com.google.cloud.osconfig.v1beta.Common.FixedOrPercent getDefaultInstanceForType() {
        return com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.getDefaultInstance();
      }

      @java.lang.Override
      public com.google.cloud.osconfig.v1beta.Common.FixedOrPercent build() {
        com.google.cloud.osconfig.v1beta.Common.FixedOrPercent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.google.cloud.osconfig.v1beta.Common.FixedOrPercent buildPartial() {
        com.google.cloud.osconfig.v1beta.Common.FixedOrPercent result =
            new com.google.cloud.osconfig.v1beta.Common.FixedOrPercent(this);
        if (modeCase_ == 1) {
          result.mode_ = mode_;
        }
        if (modeCase_ == 2) {
          result.mode_ = mode_;
        }
        result.modeCase_ = modeCase_;
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.cloud.osconfig.v1beta.Common.FixedOrPercent) {
          return mergeFrom((com.google.cloud.osconfig.v1beta.Common.FixedOrPercent) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.cloud.osconfig.v1beta.Common.FixedOrPercent other) {
        if (other == com.google.cloud.osconfig.v1beta.Common.FixedOrPercent.getDefaultInstance())
          return this;
        switch (other.getModeCase()) {
          case FIXED:
            {
              setFixed(other.getFixed());
              break;
            }
          case PERCENT:
            {
              setPercent(other.getPercent());
              break;
            }
          case MODE_NOT_SET:
            {
              break;
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
        com.google.cloud.osconfig.v1beta.Common.FixedOrPercent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.cloud.osconfig.v1beta.Common.FixedOrPercent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int modeCase_ = 0;
      private java.lang.Object mode_;

      public ModeCase getModeCase() {
        return ModeCase.forNumber(modeCase_);
      }

      public Builder clearMode() {
        modeCase_ = 0;
        mode_ = null;
        onChanged();
        return this;
      }

      /**
       *
       *
       * <pre>
       * Specifies a fixed value.
       * </pre>
       *
       * <code>int32 fixed = 1;</code>
       *
       * @return Whether the fixed field is set.
       */
      public boolean hasFixed() {
        return modeCase_ == 1;
      }
      /**
       *
       *
       * <pre>
       * Specifies a fixed value.
       * </pre>
       *
       * <code>int32 fixed = 1;</code>
       *
       * @return The fixed.
       */
      public int getFixed() {
        if (modeCase_ == 1) {
          return (java.lang.Integer) mode_;
        }
        return 0;
      }
      /**
       *
       *
       * <pre>
       * Specifies a fixed value.
       * </pre>
       *
       * <code>int32 fixed = 1;</code>
       *
       * @param value The fixed to set.
       * @return This builder for chaining.
       */
      public Builder setFixed(int value) {
        modeCase_ = 1;
        mode_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies a fixed value.
       * </pre>
       *
       * <code>int32 fixed = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearFixed() {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
        return this;
      }

      /**
       *
       *
       * <pre>
       * Specifies the relative value defined as a percentage, which will be
       * multiplied by a reference value.
       * </pre>
       *
       * <code>int32 percent = 2;</code>
       *
       * @return Whether the percent field is set.
       */
      public boolean hasPercent() {
        return modeCase_ == 2;
      }
      /**
       *
       *
       * <pre>
       * Specifies the relative value defined as a percentage, which will be
       * multiplied by a reference value.
       * </pre>
       *
       * <code>int32 percent = 2;</code>
       *
       * @return The percent.
       */
      public int getPercent() {
        if (modeCase_ == 2) {
          return (java.lang.Integer) mode_;
        }
        return 0;
      }
      /**
       *
       *
       * <pre>
       * Specifies the relative value defined as a percentage, which will be
       * multiplied by a reference value.
       * </pre>
       *
       * <code>int32 percent = 2;</code>
       *
       * @param value The percent to set.
       * @return This builder for chaining.
       */
      public Builder setPercent(int value) {
        modeCase_ = 2;
        mode_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specifies the relative value defined as a percentage, which will be
       * multiplied by a reference value.
       * </pre>
       *
       * <code>int32 percent = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearPercent() {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
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

      // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1beta.FixedOrPercent)
    }

    // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1beta.FixedOrPercent)
    private static final com.google.cloud.osconfig.v1beta.Common.FixedOrPercent DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1beta.Common.FixedOrPercent();
    }

    public static com.google.cloud.osconfig.v1beta.Common.FixedOrPercent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FixedOrPercent> PARSER =
        new com.google.protobuf.AbstractParser<FixedOrPercent>() {
          @java.lang.Override
          public FixedOrPercent parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new FixedOrPercent(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<FixedOrPercent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FixedOrPercent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1beta.Common.FixedOrPercent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/osconfig/v1beta/osconfig_"
          + "common.proto\022\034google.cloud.osconfig.v1be"
          + "ta\032\034google/api/annotations.proto\"<\n\016Fixe"
          + "dOrPercent\022\017\n\005fixed\030\001 \001(\005H\000\022\021\n\007percent\030\002"
          + " \001(\005H\000B\006\n\004modeBp\n com.google.cloud.oscon"
          + "fig.v1betaB\006CommonZDgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/osconfig/v1beta;"
          + "osconfigb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1beta_FixedOrPercent_descriptor,
            new java.lang.String[] {
              "Fixed", "Percent", "Mode",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
