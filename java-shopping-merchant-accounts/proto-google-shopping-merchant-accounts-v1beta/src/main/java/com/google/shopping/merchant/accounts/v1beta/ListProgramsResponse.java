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
// source: google/shopping/merchant/accounts/v1beta/programs.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Response message for the ListPrograms method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.ListProgramsResponse}
 */
public final class ListProgramsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.ListProgramsResponse)
    ListProgramsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProgramsResponse.newBuilder() to construct.
  private ListProgramsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProgramsResponse() {
    programs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProgramsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.ProgramsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_ListProgramsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.ProgramsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_ListProgramsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.class,
            com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.Builder.class);
  }

  public static final int PROGRAMS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.shopping.merchant.accounts.v1beta.Program> programs_;
  /**
   *
   *
   * <pre>
   * The programs for the given account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.shopping.merchant.accounts.v1beta.Program> getProgramsList() {
    return programs_;
  }
  /**
   *
   *
   * <pre>
   * The programs for the given account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder>
      getProgramsOrBuilderList() {
    return programs_;
  }
  /**
   *
   *
   * <pre>
   * The programs for the given account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
   */
  @java.lang.Override
  public int getProgramsCount() {
    return programs_.size();
  }
  /**
   *
   *
   * <pre>
   * The programs for the given account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.Program getPrograms(int index) {
    return programs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The programs for the given account.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder getProgramsOrBuilder(
      int index) {
    return programs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < programs_.size(); i++) {
      output.writeMessage(1, programs_.get(i));
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
    for (int i = 0; i < programs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, programs_.get(i));
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse other =
        (com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse) obj;

    if (!getProgramsList().equals(other.getProgramsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getProgramsCount() > 0) {
      hash = (37 * hash) + PROGRAMS_FIELD_NUMBER;
      hash = (53 * hash) + getProgramsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse prototype) {
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
   * Response message for the ListPrograms method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.ListProgramsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.ListProgramsResponse)
      com.google.shopping.merchant.accounts.v1beta.ListProgramsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.ProgramsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListProgramsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.ProgramsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListProgramsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.class,
              com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.Builder.class);
    }

    // Construct using
    // com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (programsBuilder_ == null) {
        programs_ = java.util.Collections.emptyList();
      } else {
        programs_ = null;
        programsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.ProgramsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_ListProgramsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse build() {
      com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse result =
          new com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse result) {
      if (programsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          programs_ = java.util.Collections.unmodifiableList(programs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.programs_ = programs_;
      } else {
        result.programs_ = programsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse result) {
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse) {
        return mergeFrom((com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse other) {
      if (other
          == com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse.getDefaultInstance())
        return this;
      if (programsBuilder_ == null) {
        if (!other.programs_.isEmpty()) {
          if (programs_.isEmpty()) {
            programs_ = other.programs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProgramsIsMutable();
            programs_.addAll(other.programs_);
          }
          onChanged();
        }
      } else {
        if (!other.programs_.isEmpty()) {
          if (programsBuilder_.isEmpty()) {
            programsBuilder_.dispose();
            programsBuilder_ = null;
            programs_ = other.programs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            programsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProgramsFieldBuilder()
                    : null;
          } else {
            programsBuilder_.addAllMessages(other.programs_);
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
            case 10:
              {
                com.google.shopping.merchant.accounts.v1beta.Program m =
                    input.readMessage(
                        com.google.shopping.merchant.accounts.v1beta.Program.parser(),
                        extensionRegistry);
                if (programsBuilder_ == null) {
                  ensureProgramsIsMutable();
                  programs_.add(m);
                } else {
                  programsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.shopping.merchant.accounts.v1beta.Program> programs_ =
        java.util.Collections.emptyList();

    private void ensureProgramsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        programs_ =
            new java.util.ArrayList<com.google.shopping.merchant.accounts.v1beta.Program>(
                programs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.Program,
            com.google.shopping.merchant.accounts.v1beta.Program.Builder,
            com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder>
        programsBuilder_;

    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.Program> getProgramsList() {
      if (programsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(programs_);
      } else {
        return programsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public int getProgramsCount() {
      if (programsBuilder_ == null) {
        return programs_.size();
      } else {
        return programsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Program getPrograms(int index) {
      if (programsBuilder_ == null) {
        return programs_.get(index);
      } else {
        return programsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder setPrograms(
        int index, com.google.shopping.merchant.accounts.v1beta.Program value) {
      if (programsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProgramsIsMutable();
        programs_.set(index, value);
        onChanged();
      } else {
        programsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder setPrograms(
        int index, com.google.shopping.merchant.accounts.v1beta.Program.Builder builderForValue) {
      if (programsBuilder_ == null) {
        ensureProgramsIsMutable();
        programs_.set(index, builderForValue.build());
        onChanged();
      } else {
        programsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder addPrograms(com.google.shopping.merchant.accounts.v1beta.Program value) {
      if (programsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProgramsIsMutable();
        programs_.add(value);
        onChanged();
      } else {
        programsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder addPrograms(
        int index, com.google.shopping.merchant.accounts.v1beta.Program value) {
      if (programsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProgramsIsMutable();
        programs_.add(index, value);
        onChanged();
      } else {
        programsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder addPrograms(
        com.google.shopping.merchant.accounts.v1beta.Program.Builder builderForValue) {
      if (programsBuilder_ == null) {
        ensureProgramsIsMutable();
        programs_.add(builderForValue.build());
        onChanged();
      } else {
        programsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder addPrograms(
        int index, com.google.shopping.merchant.accounts.v1beta.Program.Builder builderForValue) {
      if (programsBuilder_ == null) {
        ensureProgramsIsMutable();
        programs_.add(index, builderForValue.build());
        onChanged();
      } else {
        programsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder addAllPrograms(
        java.lang.Iterable<? extends com.google.shopping.merchant.accounts.v1beta.Program> values) {
      if (programsBuilder_ == null) {
        ensureProgramsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, programs_);
        onChanged();
      } else {
        programsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder clearPrograms() {
      if (programsBuilder_ == null) {
        programs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        programsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public Builder removePrograms(int index) {
      if (programsBuilder_ == null) {
        ensureProgramsIsMutable();
        programs_.remove(index);
        onChanged();
      } else {
        programsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Program.Builder getProgramsBuilder(
        int index) {
      return getProgramsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder getProgramsOrBuilder(
        int index) {
      if (programsBuilder_ == null) {
        return programs_.get(index);
      } else {
        return programsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder>
        getProgramsOrBuilderList() {
      if (programsBuilder_ != null) {
        return programsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(programs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Program.Builder addProgramsBuilder() {
      return getProgramsFieldBuilder()
          .addBuilder(com.google.shopping.merchant.accounts.v1beta.Program.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Program.Builder addProgramsBuilder(
        int index) {
      return getProgramsFieldBuilder()
          .addBuilder(
              index, com.google.shopping.merchant.accounts.v1beta.Program.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The programs for the given account.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.accounts.v1beta.Program programs = 1;</code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.Program.Builder>
        getProgramsBuilderList() {
      return getProgramsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.Program,
            com.google.shopping.merchant.accounts.v1beta.Program.Builder,
            com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder>
        getProgramsFieldBuilder() {
      if (programsBuilder_ == null) {
        programsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.shopping.merchant.accounts.v1beta.Program,
                com.google.shopping.merchant.accounts.v1beta.Program.Builder,
                com.google.shopping.merchant.accounts.v1beta.ProgramOrBuilder>(
                programs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        programs_ = null;
      }
      return programsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page. If this
     * field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page. If this
     * field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page. If this
     * field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page. If this
     * field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page. If this
     * field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.ListProgramsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.ListProgramsResponse)
  private static final com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse();
  }

  public static com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProgramsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProgramsResponse>() {
        @java.lang.Override
        public ListProgramsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListProgramsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProgramsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.ListProgramsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
