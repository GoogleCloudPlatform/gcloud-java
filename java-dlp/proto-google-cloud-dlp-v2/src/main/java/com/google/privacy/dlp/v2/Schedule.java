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
 * Schedule for inspect job triggers.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.Schedule}
 */
public final class Schedule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.Schedule)
    ScheduleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Schedule.newBuilder() to construct.
  private Schedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Schedule() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Schedule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_Schedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_Schedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.Schedule.class,
            com.google.privacy.dlp.v2.Schedule.Builder.class);
  }

  private int optionCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object option_;

  public enum OptionCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RECURRENCE_PERIOD_DURATION(1),
    OPTION_NOT_SET(0);
    private final int value;

    private OptionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionCase forNumber(int value) {
      switch (value) {
        case 1:
          return RECURRENCE_PERIOD_DURATION;
        case 0:
          return OPTION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OptionCase getOptionCase() {
    return OptionCase.forNumber(optionCase_);
  }

  public static final int RECURRENCE_PERIOD_DURATION_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   *
   * @return Whether the recurrencePeriodDuration field is set.
   */
  @java.lang.Override
  public boolean hasRecurrencePeriodDuration() {
    return optionCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   *
   * @return The recurrencePeriodDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRecurrencePeriodDuration() {
    if (optionCase_ == 1) {
      return (com.google.protobuf.Duration) option_;
    }
    return com.google.protobuf.Duration.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * With this option a job is started on a regular periodic basis. For
   * example: every day (86400 seconds).
   *
   * A scheduled start time will be skipped if the previous
   * execution has not ended when its scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal
   * to 1 day and can be no longer than 60 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRecurrencePeriodDurationOrBuilder() {
    if (optionCase_ == 1) {
      return (com.google.protobuf.Duration) option_;
    }
    return com.google.protobuf.Duration.getDefaultInstance();
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
    if (optionCase_ == 1) {
      output.writeMessage(1, (com.google.protobuf.Duration) option_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optionCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.protobuf.Duration) option_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.Schedule)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.Schedule other = (com.google.privacy.dlp.v2.Schedule) obj;

    if (!getOptionCase().equals(other.getOptionCase())) return false;
    switch (optionCase_) {
      case 1:
        if (!getRecurrencePeriodDuration().equals(other.getRecurrencePeriodDuration()))
          return false;
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
    switch (optionCase_) {
      case 1:
        hash = (37 * hash) + RECURRENCE_PERIOD_DURATION_FIELD_NUMBER;
        hash = (53 * hash) + getRecurrencePeriodDuration().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.Schedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.Schedule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.Schedule parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.Schedule prototype) {
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
   * Schedule for inspect job triggers.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.Schedule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.Schedule)
      com.google.privacy.dlp.v2.ScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_Schedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_Schedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.Schedule.class,
              com.google.privacy.dlp.v2.Schedule.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.Schedule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (recurrencePeriodDurationBuilder_ != null) {
        recurrencePeriodDurationBuilder_.clear();
      }
      optionCase_ = 0;
      option_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_Schedule_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Schedule getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.Schedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Schedule build() {
      com.google.privacy.dlp.v2.Schedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Schedule buildPartial() {
      com.google.privacy.dlp.v2.Schedule result = new com.google.privacy.dlp.v2.Schedule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.Schedule result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.privacy.dlp.v2.Schedule result) {
      result.optionCase_ = optionCase_;
      result.option_ = this.option_;
      if (optionCase_ == 1 && recurrencePeriodDurationBuilder_ != null) {
        result.option_ = recurrencePeriodDurationBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.Schedule) {
        return mergeFrom((com.google.privacy.dlp.v2.Schedule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.Schedule other) {
      if (other == com.google.privacy.dlp.v2.Schedule.getDefaultInstance()) return this;
      switch (other.getOptionCase()) {
        case RECURRENCE_PERIOD_DURATION:
          {
            mergeRecurrencePeriodDuration(other.getRecurrencePeriodDuration());
            break;
          }
        case OPTION_NOT_SET:
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
                    getRecurrencePeriodDurationFieldBuilder().getBuilder(), extensionRegistry);
                optionCase_ = 1;
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

    private int optionCase_ = 0;
    private java.lang.Object option_;

    public OptionCase getOptionCase() {
      return OptionCase.forNumber(optionCase_);
    }

    public Builder clearOption() {
      optionCase_ = 0;
      option_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        recurrencePeriodDurationBuilder_;
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     *
     * @return Whether the recurrencePeriodDuration field is set.
     */
    @java.lang.Override
    public boolean hasRecurrencePeriodDuration() {
      return optionCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     *
     * @return The recurrencePeriodDuration.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getRecurrencePeriodDuration() {
      if (recurrencePeriodDurationBuilder_ == null) {
        if (optionCase_ == 1) {
          return (com.google.protobuf.Duration) option_;
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      } else {
        if (optionCase_ == 1) {
          return recurrencePeriodDurationBuilder_.getMessage();
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    public Builder setRecurrencePeriodDuration(com.google.protobuf.Duration value) {
      if (recurrencePeriodDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        option_ = value;
        onChanged();
      } else {
        recurrencePeriodDurationBuilder_.setMessage(value);
      }
      optionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    public Builder setRecurrencePeriodDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (recurrencePeriodDurationBuilder_ == null) {
        option_ = builderForValue.build();
        onChanged();
      } else {
        recurrencePeriodDurationBuilder_.setMessage(builderForValue.build());
      }
      optionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    public Builder mergeRecurrencePeriodDuration(com.google.protobuf.Duration value) {
      if (recurrencePeriodDurationBuilder_ == null) {
        if (optionCase_ == 1 && option_ != com.google.protobuf.Duration.getDefaultInstance()) {
          option_ =
              com.google.protobuf.Duration.newBuilder((com.google.protobuf.Duration) option_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          option_ = value;
        }
        onChanged();
      } else {
        if (optionCase_ == 1) {
          recurrencePeriodDurationBuilder_.mergeFrom(value);
        } else {
          recurrencePeriodDurationBuilder_.setMessage(value);
        }
      }
      optionCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    public Builder clearRecurrencePeriodDuration() {
      if (recurrencePeriodDurationBuilder_ == null) {
        if (optionCase_ == 1) {
          optionCase_ = 0;
          option_ = null;
          onChanged();
        }
      } else {
        if (optionCase_ == 1) {
          optionCase_ = 0;
          option_ = null;
        }
        recurrencePeriodDurationBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getRecurrencePeriodDurationBuilder() {
      return getRecurrencePeriodDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getRecurrencePeriodDurationOrBuilder() {
      if ((optionCase_ == 1) && (recurrencePeriodDurationBuilder_ != null)) {
        return recurrencePeriodDurationBuilder_.getMessageOrBuilder();
      } else {
        if (optionCase_ == 1) {
          return (com.google.protobuf.Duration) option_;
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * With this option a job is started on a regular periodic basis. For
     * example: every day (86400 seconds).
     *
     * A scheduled start time will be skipped if the previous
     * execution has not ended when its scheduled time occurs.
     *
     * This value must be set to a time duration greater than or equal
     * to 1 day and can be no longer than 60 days.
     * </pre>
     *
     * <code>.google.protobuf.Duration recurrence_period_duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getRecurrencePeriodDurationFieldBuilder() {
      if (recurrencePeriodDurationBuilder_ == null) {
        if (!(optionCase_ == 1)) {
          option_ = com.google.protobuf.Duration.getDefaultInstance();
        }
        recurrencePeriodDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                (com.google.protobuf.Duration) option_, getParentForChildren(), isClean());
        option_ = null;
      }
      optionCase_ = 1;
      onChanged();
      return recurrencePeriodDurationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.Schedule)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.Schedule)
  private static final com.google.privacy.dlp.v2.Schedule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.Schedule();
  }

  public static com.google.privacy.dlp.v2.Schedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Schedule> PARSER =
      new com.google.protobuf.AbstractParser<Schedule>() {
        @java.lang.Override
        public Schedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<Schedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Schedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.Schedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
