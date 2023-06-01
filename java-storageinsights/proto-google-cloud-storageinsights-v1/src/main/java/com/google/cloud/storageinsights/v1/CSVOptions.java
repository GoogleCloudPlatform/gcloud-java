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
// source: google/cloud/storageinsights/v1/storageinsights.proto

package com.google.cloud.storageinsights.v1;

/**
 *
 *
 * <pre>
 * Options to configure CSV formatted reports.
 * </pre>
 *
 * Protobuf type {@code google.cloud.storageinsights.v1.CSVOptions}
 */
public final class CSVOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.storageinsights.v1.CSVOptions)
    CSVOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CSVOptions.newBuilder() to construct.
  private CSVOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CSVOptions() {
    recordSeparator_ = "";
    delimiter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CSVOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.storageinsights.v1.V1Proto
        .internal_static_google_cloud_storageinsights_v1_CSVOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.storageinsights.v1.V1Proto
        .internal_static_google_cloud_storageinsights_v1_CSVOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.storageinsights.v1.CSVOptions.class,
            com.google.cloud.storageinsights.v1.CSVOptions.Builder.class);
  }

  public static final int RECORD_SEPARATOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object recordSeparator_ = "";
  /**
   *
   *
   * <pre>
   * Record separator characters in CSV.
   * </pre>
   *
   * <code>string record_separator = 1;</code>
   *
   * @return The recordSeparator.
   */
  @java.lang.Override
  public java.lang.String getRecordSeparator() {
    java.lang.Object ref = recordSeparator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordSeparator_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Record separator characters in CSV.
   * </pre>
   *
   * <code>string record_separator = 1;</code>
   *
   * @return The bytes for recordSeparator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordSeparatorBytes() {
    java.lang.Object ref = recordSeparator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      recordSeparator_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIMITER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object delimiter_ = "";
  /**
   *
   *
   * <pre>
   * Delimiter characters in CSV.
   * </pre>
   *
   * <code>string delimiter = 2;</code>
   *
   * @return The delimiter.
   */
  @java.lang.Override
  public java.lang.String getDelimiter() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delimiter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Delimiter characters in CSV.
   * </pre>
   *
   * <code>string delimiter = 2;</code>
   *
   * @return The bytes for delimiter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDelimiterBytes() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      delimiter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADER_REQUIRED_FIELD_NUMBER = 3;
  private boolean headerRequired_ = false;
  /**
   *
   *
   * <pre>
   * If set, will include a header row in the CSV report.
   * </pre>
   *
   * <code>bool header_required = 3;</code>
   *
   * @return The headerRequired.
   */
  @java.lang.Override
  public boolean getHeaderRequired() {
    return headerRequired_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordSeparator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recordSeparator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delimiter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, delimiter_);
    }
    if (headerRequired_ != false) {
      output.writeBool(3, headerRequired_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recordSeparator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, recordSeparator_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delimiter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, delimiter_);
    }
    if (headerRequired_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, headerRequired_);
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
    if (!(obj instanceof com.google.cloud.storageinsights.v1.CSVOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.storageinsights.v1.CSVOptions other =
        (com.google.cloud.storageinsights.v1.CSVOptions) obj;

    if (!getRecordSeparator().equals(other.getRecordSeparator())) return false;
    if (!getDelimiter().equals(other.getDelimiter())) return false;
    if (getHeaderRequired() != other.getHeaderRequired()) return false;
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
    hash = (37 * hash) + RECORD_SEPARATOR_FIELD_NUMBER;
    hash = (53 * hash) + getRecordSeparator().hashCode();
    hash = (37 * hash) + DELIMITER_FIELD_NUMBER;
    hash = (53 * hash) + getDelimiter().hashCode();
    hash = (37 * hash) + HEADER_REQUIRED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHeaderRequired());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions parseFrom(
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

  public static Builder newBuilder(com.google.cloud.storageinsights.v1.CSVOptions prototype) {
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
   * Options to configure CSV formatted reports.
   * </pre>
   *
   * Protobuf type {@code google.cloud.storageinsights.v1.CSVOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.storageinsights.v1.CSVOptions)
      com.google.cloud.storageinsights.v1.CSVOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_CSVOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_CSVOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.storageinsights.v1.CSVOptions.class,
              com.google.cloud.storageinsights.v1.CSVOptions.Builder.class);
    }

    // Construct using com.google.cloud.storageinsights.v1.CSVOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      recordSeparator_ = "";
      delimiter_ = "";
      headerRequired_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_CSVOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CSVOptions getDefaultInstanceForType() {
      return com.google.cloud.storageinsights.v1.CSVOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CSVOptions build() {
      com.google.cloud.storageinsights.v1.CSVOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.CSVOptions buildPartial() {
      com.google.cloud.storageinsights.v1.CSVOptions result =
          new com.google.cloud.storageinsights.v1.CSVOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.storageinsights.v1.CSVOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recordSeparator_ = recordSeparator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.delimiter_ = delimiter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.headerRequired_ = headerRequired_;
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
      if (other instanceof com.google.cloud.storageinsights.v1.CSVOptions) {
        return mergeFrom((com.google.cloud.storageinsights.v1.CSVOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.storageinsights.v1.CSVOptions other) {
      if (other == com.google.cloud.storageinsights.v1.CSVOptions.getDefaultInstance()) return this;
      if (!other.getRecordSeparator().isEmpty()) {
        recordSeparator_ = other.recordSeparator_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDelimiter().isEmpty()) {
        delimiter_ = other.delimiter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getHeaderRequired() != false) {
        setHeaderRequired(other.getHeaderRequired());
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
                recordSeparator_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                delimiter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                headerRequired_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object recordSeparator_ = "";
    /**
     *
     *
     * <pre>
     * Record separator characters in CSV.
     * </pre>
     *
     * <code>string record_separator = 1;</code>
     *
     * @return The recordSeparator.
     */
    public java.lang.String getRecordSeparator() {
      java.lang.Object ref = recordSeparator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordSeparator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Record separator characters in CSV.
     * </pre>
     *
     * <code>string record_separator = 1;</code>
     *
     * @return The bytes for recordSeparator.
     */
    public com.google.protobuf.ByteString getRecordSeparatorBytes() {
      java.lang.Object ref = recordSeparator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        recordSeparator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Record separator characters in CSV.
     * </pre>
     *
     * <code>string record_separator = 1;</code>
     *
     * @param value The recordSeparator to set.
     * @return This builder for chaining.
     */
    public Builder setRecordSeparator(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      recordSeparator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Record separator characters in CSV.
     * </pre>
     *
     * <code>string record_separator = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRecordSeparator() {
      recordSeparator_ = getDefaultInstance().getRecordSeparator();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Record separator characters in CSV.
     * </pre>
     *
     * <code>string record_separator = 1;</code>
     *
     * @param value The bytes for recordSeparator to set.
     * @return This builder for chaining.
     */
    public Builder setRecordSeparatorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      recordSeparator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object delimiter_ = "";
    /**
     *
     *
     * <pre>
     * Delimiter characters in CSV.
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The delimiter.
     */
    public java.lang.String getDelimiter() {
      java.lang.Object ref = delimiter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delimiter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Delimiter characters in CSV.
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return The bytes for delimiter.
     */
    public com.google.protobuf.ByteString getDelimiterBytes() {
      java.lang.Object ref = delimiter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        delimiter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Delimiter characters in CSV.
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @param value The delimiter to set.
     * @return This builder for chaining.
     */
    public Builder setDelimiter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      delimiter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Delimiter characters in CSV.
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDelimiter() {
      delimiter_ = getDefaultInstance().getDelimiter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Delimiter characters in CSV.
     * </pre>
     *
     * <code>string delimiter = 2;</code>
     *
     * @param value The bytes for delimiter to set.
     * @return This builder for chaining.
     */
    public Builder setDelimiterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      delimiter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean headerRequired_;
    /**
     *
     *
     * <pre>
     * If set, will include a header row in the CSV report.
     * </pre>
     *
     * <code>bool header_required = 3;</code>
     *
     * @return The headerRequired.
     */
    @java.lang.Override
    public boolean getHeaderRequired() {
      return headerRequired_;
    }
    /**
     *
     *
     * <pre>
     * If set, will include a header row in the CSV report.
     * </pre>
     *
     * <code>bool header_required = 3;</code>
     *
     * @param value The headerRequired to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderRequired(boolean value) {

      headerRequired_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, will include a header row in the CSV report.
     * </pre>
     *
     * <code>bool header_required = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeaderRequired() {
      bitField0_ = (bitField0_ & ~0x00000004);
      headerRequired_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.storageinsights.v1.CSVOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.storageinsights.v1.CSVOptions)
  private static final com.google.cloud.storageinsights.v1.CSVOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.storageinsights.v1.CSVOptions();
  }

  public static com.google.cloud.storageinsights.v1.CSVOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CSVOptions> PARSER =
      new com.google.protobuf.AbstractParser<CSVOptions>() {
        @java.lang.Override
        public CSVOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<CSVOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CSVOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.storageinsights.v1.CSVOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
