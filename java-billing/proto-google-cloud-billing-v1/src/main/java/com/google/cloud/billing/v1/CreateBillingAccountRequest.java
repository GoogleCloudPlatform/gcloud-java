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
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

/**
 *
 *
 * <pre>
 * Request message for `CreateBillingAccount`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.CreateBillingAccountRequest}
 */
public final class CreateBillingAccountRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.CreateBillingAccountRequest)
    CreateBillingAccountRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateBillingAccountRequest.newBuilder() to construct.
  private CreateBillingAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBillingAccountRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBillingAccountRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateBillingAccountRequest(
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
          case 10:
            {
              com.google.cloud.billing.v1.BillingAccount.Builder subBuilder = null;
              if (billingAccount_ != null) {
                subBuilder = billingAccount_.toBuilder();
              }
              billingAccount_ =
                  input.readMessage(
                      com.google.cloud.billing.v1.BillingAccount.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(billingAccount_);
                billingAccount_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.billing.v1.CloudBillingProto
        .internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudBillingProto
        .internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.CreateBillingAccountRequest.class,
            com.google.cloud.billing.v1.CreateBillingAccountRequest.Builder.class);
  }

  public static final int BILLING_ACCOUNT_FIELD_NUMBER = 1;
  private com.google.cloud.billing.v1.BillingAccount billingAccount_;
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided master billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the billingAccount field is set.
   */
  @java.lang.Override
  public boolean hasBillingAccount() {
    return billingAccount_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided master billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The billingAccount.
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.BillingAccount getBillingAccount() {
    return billingAccount_ == null
        ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
        : billingAccount_;
  }
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to create.
   * Currently CreateBillingAccount only supports subaccount creation, so
   * any created billing accounts must be under a provided master billing
   * account.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.BillingAccountOrBuilder getBillingAccountOrBuilder() {
    return getBillingAccount();
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
    if (billingAccount_ != null) {
      output.writeMessage(1, getBillingAccount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (billingAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBillingAccount());
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
    if (!(obj instanceof com.google.cloud.billing.v1.CreateBillingAccountRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.CreateBillingAccountRequest other =
        (com.google.cloud.billing.v1.CreateBillingAccountRequest) obj;

    if (hasBillingAccount() != other.hasBillingAccount()) return false;
    if (hasBillingAccount()) {
      if (!getBillingAccount().equals(other.getBillingAccount())) return false;
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
    if (hasBillingAccount()) {
      hash = (37 * hash) + BILLING_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBillingAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest parseFrom(
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
      com.google.cloud.billing.v1.CreateBillingAccountRequest prototype) {
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
   * Request message for `CreateBillingAccount`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.CreateBillingAccountRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.CreateBillingAccountRequest)
      com.google.cloud.billing.v1.CreateBillingAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.CreateBillingAccountRequest.class,
              com.google.cloud.billing.v1.CreateBillingAccountRequest.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.CreateBillingAccountRequest.newBuilder()
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
      if (billingAccountBuilder_ == null) {
        billingAccount_ = null;
      } else {
        billingAccount_ = null;
        billingAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_CreateBillingAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.CreateBillingAccountRequest getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.CreateBillingAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.CreateBillingAccountRequest build() {
      com.google.cloud.billing.v1.CreateBillingAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.CreateBillingAccountRequest buildPartial() {
      com.google.cloud.billing.v1.CreateBillingAccountRequest result =
          new com.google.cloud.billing.v1.CreateBillingAccountRequest(this);
      if (billingAccountBuilder_ == null) {
        result.billingAccount_ = billingAccount_;
      } else {
        result.billingAccount_ = billingAccountBuilder_.build();
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
      if (other instanceof com.google.cloud.billing.v1.CreateBillingAccountRequest) {
        return mergeFrom((com.google.cloud.billing.v1.CreateBillingAccountRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.CreateBillingAccountRequest other) {
      if (other == com.google.cloud.billing.v1.CreateBillingAccountRequest.getDefaultInstance())
        return this;
      if (other.hasBillingAccount()) {
        mergeBillingAccount(other.getBillingAccount());
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
      com.google.cloud.billing.v1.CreateBillingAccountRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.billing.v1.CreateBillingAccountRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.billing.v1.BillingAccount billingAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.v1.BillingAccount,
            com.google.cloud.billing.v1.BillingAccount.Builder,
            com.google.cloud.billing.v1.BillingAccountOrBuilder>
        billingAccountBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the billingAccount field is set.
     */
    public boolean hasBillingAccount() {
      return billingAccountBuilder_ != null || billingAccount_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The billingAccount.
     */
    public com.google.cloud.billing.v1.BillingAccount getBillingAccount() {
      if (billingAccountBuilder_ == null) {
        return billingAccount_ == null
            ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
            : billingAccount_;
      } else {
        return billingAccountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBillingAccount(com.google.cloud.billing.v1.BillingAccount value) {
      if (billingAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        billingAccount_ = value;
        onChanged();
      } else {
        billingAccountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBillingAccount(
        com.google.cloud.billing.v1.BillingAccount.Builder builderForValue) {
      if (billingAccountBuilder_ == null) {
        billingAccount_ = builderForValue.build();
        onChanged();
      } else {
        billingAccountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBillingAccount(com.google.cloud.billing.v1.BillingAccount value) {
      if (billingAccountBuilder_ == null) {
        if (billingAccount_ != null) {
          billingAccount_ =
              com.google.cloud.billing.v1.BillingAccount.newBuilder(billingAccount_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          billingAccount_ = value;
        }
        onChanged();
      } else {
        billingAccountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBillingAccount() {
      if (billingAccountBuilder_ == null) {
        billingAccount_ = null;
        onChanged();
      } else {
        billingAccount_ = null;
        billingAccountBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.v1.BillingAccount.Builder getBillingAccountBuilder() {

      onChanged();
      return getBillingAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.v1.BillingAccountOrBuilder getBillingAccountOrBuilder() {
      if (billingAccountBuilder_ != null) {
        return billingAccountBuilder_.getMessageOrBuilder();
      } else {
        return billingAccount_ == null
            ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
            : billingAccount_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to create.
     * Currently CreateBillingAccount only supports subaccount creation, so
     * any created billing accounts must be under a provided master billing
     * account.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount billing_account = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.v1.BillingAccount,
            com.google.cloud.billing.v1.BillingAccount.Builder,
            com.google.cloud.billing.v1.BillingAccountOrBuilder>
        getBillingAccountFieldBuilder() {
      if (billingAccountBuilder_ == null) {
        billingAccountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.billing.v1.BillingAccount,
                com.google.cloud.billing.v1.BillingAccount.Builder,
                com.google.cloud.billing.v1.BillingAccountOrBuilder>(
                getBillingAccount(), getParentForChildren(), isClean());
        billingAccount_ = null;
      }
      return billingAccountBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.CreateBillingAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.CreateBillingAccountRequest)
  private static final com.google.cloud.billing.v1.CreateBillingAccountRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.CreateBillingAccountRequest();
  }

  public static com.google.cloud.billing.v1.CreateBillingAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBillingAccountRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBillingAccountRequest>() {
        @java.lang.Override
        public CreateBillingAccountRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateBillingAccountRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateBillingAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBillingAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.CreateBillingAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
