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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Configuration for parameter validation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ParameterValidation}
 */
public final class ParameterValidation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ParameterValidation)
    ParameterValidationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ParameterValidation.newBuilder() to construct.
  private ParameterValidation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ParameterValidation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ParameterValidation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ParameterValidation(
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
              com.google.cloud.dataproc.v1.RegexValidation.Builder subBuilder = null;
              if (validationTypeCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.dataproc.v1.RegexValidation) validationType_).toBuilder();
              }
              validationType_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.RegexValidation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.dataproc.v1.RegexValidation) validationType_);
                validationType_ = subBuilder.buildPartial();
              }
              validationTypeCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.cloud.dataproc.v1.ValueValidation.Builder subBuilder = null;
              if (validationTypeCase_ == 2) {
                subBuilder =
                    ((com.google.cloud.dataproc.v1.ValueValidation) validationType_).toBuilder();
              }
              validationType_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.ValueValidation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.dataproc.v1.ValueValidation) validationType_);
                validationType_ = subBuilder.buildPartial();
              }
              validationTypeCase_ = 2;
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
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_ParameterValidation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_ParameterValidation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ParameterValidation.class,
            com.google.cloud.dataproc.v1.ParameterValidation.Builder.class);
  }

  private int validationTypeCase_ = 0;
  private java.lang.Object validationType_;

  public enum ValidationTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REGEX(1),
    VALUES(2),
    VALIDATIONTYPE_NOT_SET(0);
    private final int value;

    private ValidationTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValidationTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValidationTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return REGEX;
        case 2:
          return VALUES;
        case 0:
          return VALIDATIONTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ValidationTypeCase getValidationTypeCase() {
    return ValidationTypeCase.forNumber(validationTypeCase_);
  }

  public static final int REGEX_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   *
   * @return Whether the regex field is set.
   */
  @java.lang.Override
  public boolean hasRegex() {
    return validationTypeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   *
   * @return The regex.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.RegexValidation getRegex() {
    if (validationTypeCase_ == 1) {
      return (com.google.cloud.dataproc.v1.RegexValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.RegexValidationOrBuilder getRegexOrBuilder() {
    if (validationTypeCase_ == 1) {
      return (com.google.cloud.dataproc.v1.RegexValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   *
   * @return Whether the values field is set.
   */
  @java.lang.Override
  public boolean hasValues() {
    return validationTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   *
   * @return The values.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ValueValidation getValues() {
    if (validationTypeCase_ == 2) {
      return (com.google.cloud.dataproc.v1.ValueValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ValueValidationOrBuilder getValuesOrBuilder() {
    if (validationTypeCase_ == 2) {
      return (com.google.cloud.dataproc.v1.ValueValidation) validationType_;
    }
    return com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
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
    if (validationTypeCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.dataproc.v1.RegexValidation) validationType_);
    }
    if (validationTypeCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.dataproc.v1.ValueValidation) validationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validationTypeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.dataproc.v1.RegexValidation) validationType_);
    }
    if (validationTypeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.dataproc.v1.ValueValidation) validationType_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.ParameterValidation)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ParameterValidation other =
        (com.google.cloud.dataproc.v1.ParameterValidation) obj;

    if (!getValidationTypeCase().equals(other.getValidationTypeCase())) return false;
    switch (validationTypeCase_) {
      case 1:
        if (!getRegex().equals(other.getRegex())) return false;
        break;
      case 2:
        if (!getValues().equals(other.getValues())) return false;
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
    switch (validationTypeCase_) {
      case 1:
        hash = (37 * hash) + REGEX_FIELD_NUMBER;
        hash = (53 * hash) + getRegex().hashCode();
        break;
      case 2:
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValues().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.ParameterValidation prototype) {
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
   * Configuration for parameter validation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ParameterValidation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ParameterValidation)
      com.google.cloud.dataproc.v1.ParameterValidationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ParameterValidation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ParameterValidation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ParameterValidation.class,
              com.google.cloud.dataproc.v1.ParameterValidation.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ParameterValidation.newBuilder()
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
      validationTypeCase_ = 0;
      validationType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ParameterValidation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ParameterValidation getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ParameterValidation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ParameterValidation build() {
      com.google.cloud.dataproc.v1.ParameterValidation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ParameterValidation buildPartial() {
      com.google.cloud.dataproc.v1.ParameterValidation result =
          new com.google.cloud.dataproc.v1.ParameterValidation(this);
      if (validationTypeCase_ == 1) {
        if (regexBuilder_ == null) {
          result.validationType_ = validationType_;
        } else {
          result.validationType_ = regexBuilder_.build();
        }
      }
      if (validationTypeCase_ == 2) {
        if (valuesBuilder_ == null) {
          result.validationType_ = validationType_;
        } else {
          result.validationType_ = valuesBuilder_.build();
        }
      }
      result.validationTypeCase_ = validationTypeCase_;
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
      if (other instanceof com.google.cloud.dataproc.v1.ParameterValidation) {
        return mergeFrom((com.google.cloud.dataproc.v1.ParameterValidation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ParameterValidation other) {
      if (other == com.google.cloud.dataproc.v1.ParameterValidation.getDefaultInstance())
        return this;
      switch (other.getValidationTypeCase()) {
        case REGEX:
          {
            mergeRegex(other.getRegex());
            break;
          }
        case VALUES:
          {
            mergeValues(other.getValues());
            break;
          }
        case VALIDATIONTYPE_NOT_SET:
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
      com.google.cloud.dataproc.v1.ParameterValidation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.ParameterValidation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int validationTypeCase_ = 0;
    private java.lang.Object validationType_;

    public ValidationTypeCase getValidationTypeCase() {
      return ValidationTypeCase.forNumber(validationTypeCase_);
    }

    public Builder clearValidationType() {
      validationTypeCase_ = 0;
      validationType_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.RegexValidation,
            com.google.cloud.dataproc.v1.RegexValidation.Builder,
            com.google.cloud.dataproc.v1.RegexValidationOrBuilder>
        regexBuilder_;
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     *
     * @return Whether the regex field is set.
     */
    @java.lang.Override
    public boolean hasRegex() {
      return validationTypeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     *
     * @return The regex.
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.RegexValidation getRegex() {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1) {
          return (com.google.cloud.dataproc.v1.RegexValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
      } else {
        if (validationTypeCase_ == 1) {
          return regexBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    public Builder setRegex(com.google.cloud.dataproc.v1.RegexValidation value) {
      if (regexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validationType_ = value;
        onChanged();
      } else {
        regexBuilder_.setMessage(value);
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    public Builder setRegex(com.google.cloud.dataproc.v1.RegexValidation.Builder builderForValue) {
      if (regexBuilder_ == null) {
        validationType_ = builderForValue.build();
        onChanged();
      } else {
        regexBuilder_.setMessage(builderForValue.build());
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    public Builder mergeRegex(com.google.cloud.dataproc.v1.RegexValidation value) {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1
            && validationType_
                != com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance()) {
          validationType_ =
              com.google.cloud.dataproc.v1.RegexValidation.newBuilder(
                      (com.google.cloud.dataproc.v1.RegexValidation) validationType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          validationType_ = value;
        }
        onChanged();
      } else {
        if (validationTypeCase_ == 1) {
          regexBuilder_.mergeFrom(value);
        } else {
          regexBuilder_.setMessage(value);
        }
      }
      validationTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    public Builder clearRegex() {
      if (regexBuilder_ == null) {
        if (validationTypeCase_ == 1) {
          validationTypeCase_ = 0;
          validationType_ = null;
          onChanged();
        }
      } else {
        if (validationTypeCase_ == 1) {
          validationTypeCase_ = 0;
          validationType_ = null;
        }
        regexBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    public com.google.cloud.dataproc.v1.RegexValidation.Builder getRegexBuilder() {
      return getRegexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.RegexValidationOrBuilder getRegexOrBuilder() {
      if ((validationTypeCase_ == 1) && (regexBuilder_ != null)) {
        return regexBuilder_.getMessageOrBuilder();
      } else {
        if (validationTypeCase_ == 1) {
          return (com.google.cloud.dataproc.v1.RegexValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Validation based on regular expressions.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.RegexValidation,
            com.google.cloud.dataproc.v1.RegexValidation.Builder,
            com.google.cloud.dataproc.v1.RegexValidationOrBuilder>
        getRegexFieldBuilder() {
      if (regexBuilder_ == null) {
        if (!(validationTypeCase_ == 1)) {
          validationType_ = com.google.cloud.dataproc.v1.RegexValidation.getDefaultInstance();
        }
        regexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.RegexValidation,
                com.google.cloud.dataproc.v1.RegexValidation.Builder,
                com.google.cloud.dataproc.v1.RegexValidationOrBuilder>(
                (com.google.cloud.dataproc.v1.RegexValidation) validationType_,
                getParentForChildren(),
                isClean());
        validationType_ = null;
      }
      validationTypeCase_ = 1;
      onChanged();
      ;
      return regexBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.ValueValidation,
            com.google.cloud.dataproc.v1.ValueValidation.Builder,
            com.google.cloud.dataproc.v1.ValueValidationOrBuilder>
        valuesBuilder_;
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     *
     * @return Whether the values field is set.
     */
    @java.lang.Override
    public boolean hasValues() {
      return validationTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     *
     * @return The values.
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.ValueValidation getValues() {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2) {
          return (com.google.cloud.dataproc.v1.ValueValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
      } else {
        if (validationTypeCase_ == 2) {
          return valuesBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    public Builder setValues(com.google.cloud.dataproc.v1.ValueValidation value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validationType_ = value;
        onChanged();
      } else {
        valuesBuilder_.setMessage(value);
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    public Builder setValues(com.google.cloud.dataproc.v1.ValueValidation.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        validationType_ = builderForValue.build();
        onChanged();
      } else {
        valuesBuilder_.setMessage(builderForValue.build());
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    public Builder mergeValues(com.google.cloud.dataproc.v1.ValueValidation value) {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2
            && validationType_
                != com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance()) {
          validationType_ =
              com.google.cloud.dataproc.v1.ValueValidation.newBuilder(
                      (com.google.cloud.dataproc.v1.ValueValidation) validationType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          validationType_ = value;
        }
        onChanged();
      } else {
        if (validationTypeCase_ == 2) {
          valuesBuilder_.mergeFrom(value);
        } else {
          valuesBuilder_.setMessage(value);
        }
      }
      validationTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        if (validationTypeCase_ == 2) {
          validationTypeCase_ = 0;
          validationType_ = null;
          onChanged();
        }
      } else {
        if (validationTypeCase_ == 2) {
          validationTypeCase_ = 0;
          validationType_ = null;
        }
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    public com.google.cloud.dataproc.v1.ValueValidation.Builder getValuesBuilder() {
      return getValuesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.ValueValidationOrBuilder getValuesOrBuilder() {
      if ((validationTypeCase_ == 2) && (valuesBuilder_ != null)) {
        return valuesBuilder_.getMessageOrBuilder();
      } else {
        if (validationTypeCase_ == 2) {
          return (com.google.cloud.dataproc.v1.ValueValidation) validationType_;
        }
        return com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Validation based on a list of allowed values.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.ValueValidation,
            com.google.cloud.dataproc.v1.ValueValidation.Builder,
            com.google.cloud.dataproc.v1.ValueValidationOrBuilder>
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        if (!(validationTypeCase_ == 2)) {
          validationType_ = com.google.cloud.dataproc.v1.ValueValidation.getDefaultInstance();
        }
        valuesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.ValueValidation,
                com.google.cloud.dataproc.v1.ValueValidation.Builder,
                com.google.cloud.dataproc.v1.ValueValidationOrBuilder>(
                (com.google.cloud.dataproc.v1.ValueValidation) validationType_,
                getParentForChildren(),
                isClean());
        validationType_ = null;
      }
      validationTypeCase_ = 2;
      onChanged();
      ;
      return valuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ParameterValidation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ParameterValidation)
  private static final com.google.cloud.dataproc.v1.ParameterValidation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ParameterValidation();
  }

  public static com.google.cloud.dataproc.v1.ParameterValidation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParameterValidation> PARSER =
      new com.google.protobuf.AbstractParser<ParameterValidation>() {
        @java.lang.Override
        public ParameterValidation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ParameterValidation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ParameterValidation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParameterValidation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ParameterValidation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
