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
// source: google/cloud/datastream/v1/datastream.proto

package com.google.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Response from a discover request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.DiscoverConnectionProfileResponse}
 */
public final class DiscoverConnectionProfileResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
    DiscoverConnectionProfileResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiscoverConnectionProfileResponse.newBuilder() to construct.
  private DiscoverConnectionProfileResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoverConnectionProfileResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoverConnectionProfileResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DiscoverConnectionProfileResponse(
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
          case 802:
            {
              com.google.cloud.datastream.v1.OracleRdbms.Builder subBuilder = null;
              if (dataObjectCase_ == 100) {
                subBuilder = ((com.google.cloud.datastream.v1.OracleRdbms) dataObject_).toBuilder();
              }
              dataObject_ =
                  input.readMessage(
                      com.google.cloud.datastream.v1.OracleRdbms.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.datastream.v1.OracleRdbms) dataObject_);
                dataObject_ = subBuilder.buildPartial();
              }
              dataObjectCase_ = 100;
              break;
            }
          case 810:
            {
              com.google.cloud.datastream.v1.MysqlRdbms.Builder subBuilder = null;
              if (dataObjectCase_ == 101) {
                subBuilder = ((com.google.cloud.datastream.v1.MysqlRdbms) dataObject_).toBuilder();
              }
              dataObject_ =
                  input.readMessage(
                      com.google.cloud.datastream.v1.MysqlRdbms.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.datastream.v1.MysqlRdbms) dataObject_);
                dataObject_ = subBuilder.buildPartial();
              }
              dataObjectCase_ = 101;
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
    return com.google.cloud.datastream.v1.DatastreamProto
        .internal_static_google_cloud_datastream_v1_DiscoverConnectionProfileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamProto
        .internal_static_google_cloud_datastream_v1_DiscoverConnectionProfileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.class,
            com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.Builder.class);
  }

  private int dataObjectCase_ = 0;
  private java.lang.Object dataObject_;

  public enum DataObjectCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ORACLE_RDBMS(100),
    MYSQL_RDBMS(101),
    DATAOBJECT_NOT_SET(0);
    private final int value;

    private DataObjectCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataObjectCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataObjectCase forNumber(int value) {
      switch (value) {
        case 100:
          return ORACLE_RDBMS;
        case 101:
          return MYSQL_RDBMS;
        case 0:
          return DATAOBJECT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DataObjectCase getDataObjectCase() {
    return DataObjectCase.forNumber(dataObjectCase_);
  }

  public static final int ORACLE_RDBMS_FIELD_NUMBER = 100;
  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return Whether the oracleRdbms field is set.
   */
  @java.lang.Override
  public boolean hasOracleRdbms() {
    return dataObjectCase_ == 100;
  }
  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   *
   * @return The oracleRdbms.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbms getOracleRdbms() {
    if (dataObjectCase_ == 100) {
      return (com.google.cloud.datastream.v1.OracleRdbms) dataObject_;
    }
    return com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Enriched Oracle RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getOracleRdbmsOrBuilder() {
    if (dataObjectCase_ == 100) {
      return (com.google.cloud.datastream.v1.OracleRdbms) dataObject_;
    }
    return com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
  }

  public static final int MYSQL_RDBMS_FIELD_NUMBER = 101;
  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return Whether the mysqlRdbms field is set.
   */
  @java.lang.Override
  public boolean hasMysqlRdbms() {
    return dataObjectCase_ == 101;
  }
  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   *
   * @return The mysqlRdbms.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbms getMysqlRdbms() {
    if (dataObjectCase_ == 101) {
      return (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_;
    }
    return com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Enriched MySQL RDBMS object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getMysqlRdbmsOrBuilder() {
    if (dataObjectCase_ == 101) {
      return (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_;
    }
    return com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
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
    if (dataObjectCase_ == 100) {
      output.writeMessage(100, (com.google.cloud.datastream.v1.OracleRdbms) dataObject_);
    }
    if (dataObjectCase_ == 101) {
      output.writeMessage(101, (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataObjectCase_ == 100) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              100, (com.google.cloud.datastream.v1.OracleRdbms) dataObject_);
    }
    if (dataObjectCase_ == 101) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              101, (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse other =
        (com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse) obj;

    if (!getDataObjectCase().equals(other.getDataObjectCase())) return false;
    switch (dataObjectCase_) {
      case 100:
        if (!getOracleRdbms().equals(other.getOracleRdbms())) return false;
        break;
      case 101:
        if (!getMysqlRdbms().equals(other.getMysqlRdbms())) return false;
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
    switch (dataObjectCase_) {
      case 100:
        hash = (37 * hash) + ORACLE_RDBMS_FIELD_NUMBER;
        hash = (53 * hash) + getOracleRdbms().hashCode();
        break;
      case 101:
        hash = (37 * hash) + MYSQL_RDBMS_FIELD_NUMBER;
        hash = (53 * hash) + getMysqlRdbms().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parseFrom(
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
      com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse prototype) {
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
   * Response from a discover request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.DiscoverConnectionProfileResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
      com.google.cloud.datastream.v1.DiscoverConnectionProfileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_DiscoverConnectionProfileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_DiscoverConnectionProfileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.class,
              com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.newBuilder()
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
      dataObjectCase_ = 0;
      dataObject_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamProto
          .internal_static_google_cloud_datastream_v1_DiscoverConnectionProfileResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse build() {
      com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse buildPartial() {
      com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse result =
          new com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse(this);
      if (dataObjectCase_ == 100) {
        if (oracleRdbmsBuilder_ == null) {
          result.dataObject_ = dataObject_;
        } else {
          result.dataObject_ = oracleRdbmsBuilder_.build();
        }
      }
      if (dataObjectCase_ == 101) {
        if (mysqlRdbmsBuilder_ == null) {
          result.dataObject_ = dataObject_;
        } else {
          result.dataObject_ = mysqlRdbmsBuilder_.build();
        }
      }
      result.dataObjectCase_ = dataObjectCase_;
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
      if (other instanceof com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse) {
        return mergeFrom((com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse other) {
      if (other
          == com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse.getDefaultInstance())
        return this;
      switch (other.getDataObjectCase()) {
        case ORACLE_RDBMS:
          {
            mergeOracleRdbms(other.getOracleRdbms());
            break;
          }
        case MYSQL_RDBMS:
          {
            mergeMysqlRdbms(other.getMysqlRdbms());
            break;
          }
        case DATAOBJECT_NOT_SET:
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
      com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dataObjectCase_ = 0;
    private java.lang.Object dataObject_;

    public DataObjectCase getDataObjectCase() {
      return DataObjectCase.forNumber(dataObjectCase_);
    }

    public Builder clearDataObject() {
      dataObjectCase_ = 0;
      dataObject_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.OracleRdbms,
            com.google.cloud.datastream.v1.OracleRdbms.Builder,
            com.google.cloud.datastream.v1.OracleRdbmsOrBuilder>
        oracleRdbmsBuilder_;
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     *
     * @return Whether the oracleRdbms field is set.
     */
    @java.lang.Override
    public boolean hasOracleRdbms() {
      return dataObjectCase_ == 100;
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     *
     * @return The oracleRdbms.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.OracleRdbms getOracleRdbms() {
      if (oracleRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 100) {
          return (com.google.cloud.datastream.v1.OracleRdbms) dataObject_;
        }
        return com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
      } else {
        if (dataObjectCase_ == 100) {
          return oracleRdbmsBuilder_.getMessage();
        }
        return com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    public Builder setOracleRdbms(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (oracleRdbmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataObject_ = value;
        onChanged();
      } else {
        oracleRdbmsBuilder_.setMessage(value);
      }
      dataObjectCase_ = 100;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    public Builder setOracleRdbms(
        com.google.cloud.datastream.v1.OracleRdbms.Builder builderForValue) {
      if (oracleRdbmsBuilder_ == null) {
        dataObject_ = builderForValue.build();
        onChanged();
      } else {
        oracleRdbmsBuilder_.setMessage(builderForValue.build());
      }
      dataObjectCase_ = 100;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    public Builder mergeOracleRdbms(com.google.cloud.datastream.v1.OracleRdbms value) {
      if (oracleRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 100
            && dataObject_ != com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance()) {
          dataObject_ =
              com.google.cloud.datastream.v1.OracleRdbms.newBuilder(
                      (com.google.cloud.datastream.v1.OracleRdbms) dataObject_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dataObject_ = value;
        }
        onChanged();
      } else {
        if (dataObjectCase_ == 100) {
          oracleRdbmsBuilder_.mergeFrom(value);
        } else {
          oracleRdbmsBuilder_.setMessage(value);
        }
      }
      dataObjectCase_ = 100;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    public Builder clearOracleRdbms() {
      if (oracleRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 100) {
          dataObjectCase_ = 0;
          dataObject_ = null;
          onChanged();
        }
      } else {
        if (dataObjectCase_ == 100) {
          dataObjectCase_ = 0;
          dataObject_ = null;
        }
        oracleRdbmsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    public com.google.cloud.datastream.v1.OracleRdbms.Builder getOracleRdbmsBuilder() {
      return getOracleRdbmsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getOracleRdbmsOrBuilder() {
      if ((dataObjectCase_ == 100) && (oracleRdbmsBuilder_ != null)) {
        return oracleRdbmsBuilder_.getMessageOrBuilder();
      } else {
        if (dataObjectCase_ == 100) {
          return (com.google.cloud.datastream.v1.OracleRdbms) dataObject_;
        }
        return com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Enriched Oracle RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.OracleRdbms oracle_rdbms = 100;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.OracleRdbms,
            com.google.cloud.datastream.v1.OracleRdbms.Builder,
            com.google.cloud.datastream.v1.OracleRdbmsOrBuilder>
        getOracleRdbmsFieldBuilder() {
      if (oracleRdbmsBuilder_ == null) {
        if (!(dataObjectCase_ == 100)) {
          dataObject_ = com.google.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
        }
        oracleRdbmsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datastream.v1.OracleRdbms,
                com.google.cloud.datastream.v1.OracleRdbms.Builder,
                com.google.cloud.datastream.v1.OracleRdbmsOrBuilder>(
                (com.google.cloud.datastream.v1.OracleRdbms) dataObject_,
                getParentForChildren(),
                isClean());
        dataObject_ = null;
      }
      dataObjectCase_ = 100;
      onChanged();
      ;
      return oracleRdbmsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlRdbms,
            com.google.cloud.datastream.v1.MysqlRdbms.Builder,
            com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder>
        mysqlRdbmsBuilder_;
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     *
     * @return Whether the mysqlRdbms field is set.
     */
    @java.lang.Override
    public boolean hasMysqlRdbms() {
      return dataObjectCase_ == 101;
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     *
     * @return The mysqlRdbms.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlRdbms getMysqlRdbms() {
      if (mysqlRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 101) {
          return (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_;
        }
        return com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
      } else {
        if (dataObjectCase_ == 101) {
          return mysqlRdbmsBuilder_.getMessage();
        }
        return com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    public Builder setMysqlRdbms(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (mysqlRdbmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataObject_ = value;
        onChanged();
      } else {
        mysqlRdbmsBuilder_.setMessage(value);
      }
      dataObjectCase_ = 101;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    public Builder setMysqlRdbms(
        com.google.cloud.datastream.v1.MysqlRdbms.Builder builderForValue) {
      if (mysqlRdbmsBuilder_ == null) {
        dataObject_ = builderForValue.build();
        onChanged();
      } else {
        mysqlRdbmsBuilder_.setMessage(builderForValue.build());
      }
      dataObjectCase_ = 101;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    public Builder mergeMysqlRdbms(com.google.cloud.datastream.v1.MysqlRdbms value) {
      if (mysqlRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 101
            && dataObject_ != com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance()) {
          dataObject_ =
              com.google.cloud.datastream.v1.MysqlRdbms.newBuilder(
                      (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          dataObject_ = value;
        }
        onChanged();
      } else {
        if (dataObjectCase_ == 101) {
          mysqlRdbmsBuilder_.mergeFrom(value);
        } else {
          mysqlRdbmsBuilder_.setMessage(value);
        }
      }
      dataObjectCase_ = 101;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    public Builder clearMysqlRdbms() {
      if (mysqlRdbmsBuilder_ == null) {
        if (dataObjectCase_ == 101) {
          dataObjectCase_ = 0;
          dataObject_ = null;
          onChanged();
        }
      } else {
        if (dataObjectCase_ == 101) {
          dataObjectCase_ = 0;
          dataObject_ = null;
        }
        mysqlRdbmsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    public com.google.cloud.datastream.v1.MysqlRdbms.Builder getMysqlRdbmsBuilder() {
      return getMysqlRdbmsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder getMysqlRdbmsOrBuilder() {
      if ((dataObjectCase_ == 101) && (mysqlRdbmsBuilder_ != null)) {
        return mysqlRdbmsBuilder_.getMessageOrBuilder();
      } else {
        if (dataObjectCase_ == 101) {
          return (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_;
        }
        return com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Enriched MySQL RDBMS object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlRdbms mysql_rdbms = 101;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlRdbms,
            com.google.cloud.datastream.v1.MysqlRdbms.Builder,
            com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder>
        getMysqlRdbmsFieldBuilder() {
      if (mysqlRdbmsBuilder_ == null) {
        if (!(dataObjectCase_ == 101)) {
          dataObject_ = com.google.cloud.datastream.v1.MysqlRdbms.getDefaultInstance();
        }
        mysqlRdbmsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datastream.v1.MysqlRdbms,
                com.google.cloud.datastream.v1.MysqlRdbms.Builder,
                com.google.cloud.datastream.v1.MysqlRdbmsOrBuilder>(
                (com.google.cloud.datastream.v1.MysqlRdbms) dataObject_,
                getParentForChildren(),
                isClean());
        dataObject_ = null;
      }
      dataObjectCase_ = 101;
      onChanged();
      ;
      return mysqlRdbmsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.DiscoverConnectionProfileResponse)
  private static final com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse();
  }

  public static com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoverConnectionProfileResponse> PARSER =
      new com.google.protobuf.AbstractParser<DiscoverConnectionProfileResponse>() {
        @java.lang.Override
        public DiscoverConnectionProfileResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DiscoverConnectionProfileResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DiscoverConnectionProfileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoverConnectionProfileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.DiscoverConnectionProfileResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
