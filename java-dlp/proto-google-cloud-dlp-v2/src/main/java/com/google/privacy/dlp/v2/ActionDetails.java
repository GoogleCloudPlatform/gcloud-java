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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * The results of an [Action][google.privacy.dlp.v2.Action].
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ActionDetails}
 */
public final class ActionDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ActionDetails)
    ActionDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ActionDetails.newBuilder() to construct.
  private ActionDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ActionDetails() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ActionDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ActionDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ActionDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ActionDetails.class,
            com.google.privacy.dlp.v2.ActionDetails.Builder.class);
  }

  private int detailsCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object details_;

  public enum DetailsCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DEIDENTIFY_DETAILS(1),
    DETAILS_NOT_SET(0);
    private final int value;

    private DetailsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DetailsCase valueOf(int value) {
      return forNumber(value);
    }

    public static DetailsCase forNumber(int value) {
      switch (value) {
        case 1:
          return DEIDENTIFY_DETAILS;
        case 0:
          return DETAILS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DetailsCase getDetailsCase() {
    return DetailsCase.forNumber(detailsCase_);
  }

  public static final int DEIDENTIFY_DETAILS_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Outcome of a de-identification action.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
   *
   * @return Whether the deidentifyDetails field is set.
   */
  @java.lang.Override
  public boolean hasDeidentifyDetails() {
    return detailsCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Outcome of a de-identification action.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
   *
   * @return The deidentifyDetails.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyDataSourceDetails getDeidentifyDetails() {
    if (detailsCase_ == 1) {
      return (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_;
    }
    return com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Outcome of a de-identification action.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyDataSourceDetailsOrBuilder
      getDeidentifyDetailsOrBuilder() {
    if (detailsCase_ == 1) {
      return (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_;
    }
    return com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
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
    if (detailsCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (detailsCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ActionDetails)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ActionDetails other = (com.google.privacy.dlp.v2.ActionDetails) obj;

    if (!getDetailsCase().equals(other.getDetailsCase())) return false;
    switch (detailsCase_) {
      case 1:
        if (!getDeidentifyDetails().equals(other.getDeidentifyDetails())) return false;
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
    switch (detailsCase_) {
      case 1:
        hash = (37 * hash) + DEIDENTIFY_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getDeidentifyDetails().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ActionDetails parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ActionDetails prototype) {
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
   * The results of an [Action][google.privacy.dlp.v2.Action].
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ActionDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ActionDetails)
      com.google.privacy.dlp.v2.ActionDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ActionDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ActionDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ActionDetails.class,
              com.google.privacy.dlp.v2.ActionDetails.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ActionDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (deidentifyDetailsBuilder_ != null) {
        deidentifyDetailsBuilder_.clear();
      }
      detailsCase_ = 0;
      details_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ActionDetails_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ActionDetails getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ActionDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ActionDetails build() {
      com.google.privacy.dlp.v2.ActionDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ActionDetails buildPartial() {
      com.google.privacy.dlp.v2.ActionDetails result =
          new com.google.privacy.dlp.v2.ActionDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ActionDetails result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.ActionDetails result) {
      result.detailsCase_ = detailsCase_;
      result.details_ = this.details_;
      if (detailsCase_ == 1 && deidentifyDetailsBuilder_ != null) {
        result.details_ = deidentifyDetailsBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.ActionDetails) {
        return mergeFrom((com.google.privacy.dlp.v2.ActionDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ActionDetails other) {
      if (other == com.google.privacy.dlp.v2.ActionDetails.getDefaultInstance()) return this;
      switch (other.getDetailsCase()) {
        case DEIDENTIFY_DETAILS:
          {
            mergeDeidentifyDetails(other.getDeidentifyDetails());
            break;
          }
        case DETAILS_NOT_SET:
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
                input.readMessage(
                    getDeidentifyDetailsFieldBuilder().getBuilder(), extensionRegistry);
                detailsCase_ = 1;
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

    private int detailsCase_ = 0;
    private java.lang.Object details_;

    public DetailsCase getDetailsCase() {
      return DetailsCase.forNumber(detailsCase_);
    }

    public Builder clearDetails() {
      detailsCase_ = 0;
      details_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetails,
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.Builder,
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetailsOrBuilder>
        deidentifyDetailsBuilder_;
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     *
     * @return Whether the deidentifyDetails field is set.
     */
    @java.lang.Override
    public boolean hasDeidentifyDetails() {
      return detailsCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     *
     * @return The deidentifyDetails.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyDataSourceDetails getDeidentifyDetails() {
      if (deidentifyDetailsBuilder_ == null) {
        if (detailsCase_ == 1) {
          return (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_;
        }
        return com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
      } else {
        if (detailsCase_ == 1) {
          return deidentifyDetailsBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    public Builder setDeidentifyDetails(
        com.google.privacy.dlp.v2.DeidentifyDataSourceDetails value) {
      if (deidentifyDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        deidentifyDetailsBuilder_.setMessage(value);
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    public Builder setDeidentifyDetails(
        com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.Builder builderForValue) {
      if (deidentifyDetailsBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        deidentifyDetailsBuilder_.setMessage(builderForValue.build());
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    public Builder mergeDeidentifyDetails(
        com.google.privacy.dlp.v2.DeidentifyDataSourceDetails value) {
      if (deidentifyDetailsBuilder_ == null) {
        if (detailsCase_ == 1
            && details_
                != com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance()) {
          details_ =
              com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.newBuilder(
                      (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        if (detailsCase_ == 1) {
          deidentifyDetailsBuilder_.mergeFrom(value);
        } else {
          deidentifyDetailsBuilder_.setMessage(value);
        }
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    public Builder clearDeidentifyDetails() {
      if (deidentifyDetailsBuilder_ == null) {
        if (detailsCase_ == 1) {
          detailsCase_ = 0;
          details_ = null;
          onChanged();
        }
      } else {
        if (detailsCase_ == 1) {
          detailsCase_ = 0;
          details_ = null;
        }
        deidentifyDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.Builder
        getDeidentifyDetailsBuilder() {
      return getDeidentifyDetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyDataSourceDetailsOrBuilder
        getDeidentifyDetailsOrBuilder() {
      if ((detailsCase_ == 1) && (deidentifyDetailsBuilder_ != null)) {
        return deidentifyDetailsBuilder_.getMessageOrBuilder();
      } else {
        if (detailsCase_ == 1) {
          return (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_;
        }
        return com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Outcome of a de-identification action.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DeidentifyDataSourceDetails deidentify_details = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetails,
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.Builder,
            com.google.privacy.dlp.v2.DeidentifyDataSourceDetailsOrBuilder>
        getDeidentifyDetailsFieldBuilder() {
      if (deidentifyDetailsBuilder_ == null) {
        if (!(detailsCase_ == 1)) {
          details_ = com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.getDefaultInstance();
        }
        deidentifyDetailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DeidentifyDataSourceDetails,
                com.google.privacy.dlp.v2.DeidentifyDataSourceDetails.Builder,
                com.google.privacy.dlp.v2.DeidentifyDataSourceDetailsOrBuilder>(
                (com.google.privacy.dlp.v2.DeidentifyDataSourceDetails) details_,
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      detailsCase_ = 1;
      onChanged();
      return deidentifyDetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ActionDetails)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ActionDetails)
  private static final com.google.privacy.dlp.v2.ActionDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ActionDetails();
  }

  public static com.google.privacy.dlp.v2.ActionDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionDetails> PARSER =
      new com.google.protobuf.AbstractParser<ActionDetails>() {
        @java.lang.Override
        public ActionDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ActionDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ActionDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
