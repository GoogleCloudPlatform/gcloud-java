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
// source: google/cloud/apphub/v1/attributes.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.apphub.v1;

/**
 *
 *
 * <pre>
 * Contact information of stakeholders.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apphub.v1.ContactInfo}
 */
public final class ContactInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apphub.v1.ContactInfo)
    ContactInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContactInfo.newBuilder() to construct.
  private ContactInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContactInfo() {
    displayName_ = "";
    email_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContactInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apphub.v1.AttributesProto
        .internal_static_google_cloud_apphub_v1_ContactInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apphub.v1.AttributesProto
        .internal_static_google_cloud_apphub_v1_ContactInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apphub.v1.ContactInfo.class,
            com.google.cloud.apphub.v1.ContactInfo.Builder.class);
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Contact's name.
   * Can have a maximum length of 63 characters.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Contact's name.
   * Can have a maximum length of 63 characters.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   *
   *
   * <pre>
   * Required. Email address of the contacts.
   * </pre>
   *
   * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Email address of the contacts.
   * </pre>
   *
   * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      email_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
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
    if (!(obj instanceof com.google.cloud.apphub.v1.ContactInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.apphub.v1.ContactInfo other = (com.google.cloud.apphub.v1.ContactInfo) obj;

    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getEmail().equals(other.getEmail())) return false;
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.ContactInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apphub.v1.ContactInfo prototype) {
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
   * Contact information of stakeholders.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apphub.v1.ContactInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apphub.v1.ContactInfo)
      com.google.cloud.apphub.v1.ContactInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apphub.v1.AttributesProto
          .internal_static_google_cloud_apphub_v1_ContactInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apphub.v1.AttributesProto
          .internal_static_google_cloud_apphub_v1_ContactInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apphub.v1.ContactInfo.class,
              com.google.cloud.apphub.v1.ContactInfo.Builder.class);
    }

    // Construct using com.google.cloud.apphub.v1.ContactInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      displayName_ = "";
      email_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apphub.v1.AttributesProto
          .internal_static_google_cloud_apphub_v1_ContactInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.ContactInfo getDefaultInstanceForType() {
      return com.google.cloud.apphub.v1.ContactInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.ContactInfo build() {
      com.google.cloud.apphub.v1.ContactInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.ContactInfo buildPartial() {
      com.google.cloud.apphub.v1.ContactInfo result =
          new com.google.cloud.apphub.v1.ContactInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apphub.v1.ContactInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayName_ = displayName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.email_ = email_;
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
      if (other instanceof com.google.cloud.apphub.v1.ContactInfo) {
        return mergeFrom((com.google.cloud.apphub.v1.ContactInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apphub.v1.ContactInfo other) {
      if (other == com.google.cloud.apphub.v1.ContactInfo.getDefaultInstance()) return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
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
                displayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                email_ = input.readStringRequireUtf8();
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

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Contact's name.
     * Can have a maximum length of 63 characters.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Contact's name.
     * Can have a maximum length of 63 characters.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Contact's name.
     * Can have a maximum length of 63 characters.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Contact's name.
     * Can have a maximum length of 63 characters.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Contact's name.
     * Can have a maximum length of 63 characters.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     *
     *
     * <pre>
     * Required. Email address of the contacts.
     * </pre>
     *
     * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Email address of the contacts.
     * </pre>
     *
     * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Email address of the contacts.
     * </pre>
     *
     * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      email_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Email address of the contacts.
     * </pre>
     *
     * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Email address of the contacts.
     * </pre>
     *
     * <code>string email = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      email_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apphub.v1.ContactInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apphub.v1.ContactInfo)
  private static final com.google.cloud.apphub.v1.ContactInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apphub.v1.ContactInfo();
  }

  public static com.google.cloud.apphub.v1.ContactInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactInfo> PARSER =
      new com.google.protobuf.AbstractParser<ContactInfo>() {
        @java.lang.Override
        public ContactInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apphub.v1.ContactInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
