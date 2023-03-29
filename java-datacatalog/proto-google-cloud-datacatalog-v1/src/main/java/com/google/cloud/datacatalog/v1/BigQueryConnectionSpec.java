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
// source: google/cloud/datacatalog/v1/bigquery.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification for the BigQuery connection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryConnectionSpec}
 */
public final class BigQueryConnectionSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.BigQueryConnectionSpec)
    BigQueryConnectionSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryConnectionSpec.newBuilder() to construct.
  private BigQueryConnectionSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryConnectionSpec() {
    connectionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BigQueryConnectionSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.BigQueryProto
        .internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.BigQueryProto
        .internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.class,
            com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of the BigQuery connection.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType}
   */
  public enum ConnectionType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified type.
     * </pre>
     *
     * <code>CONNECTION_TYPE_UNSPECIFIED = 0;</code>
     */
    CONNECTION_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Cloud SQL connection.
     * </pre>
     *
     * <code>CLOUD_SQL = 1;</code>
     */
    CLOUD_SQL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified type.
     * </pre>
     *
     * <code>CONNECTION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int CONNECTION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Cloud SQL connection.
     * </pre>
     *
     * <code>CLOUD_SQL = 1;</code>
     */
    public static final int CLOUD_SQL_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConnectionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConnectionType forNumber(int value) {
      switch (value) {
        case 0:
          return CONNECTION_TYPE_UNSPECIFIED;
        case 1:
          return CLOUD_SQL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ConnectionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConnectionType>() {
          public ConnectionType findValueByNumber(int number) {
            return ConnectionType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ConnectionType[] VALUES = values();

    public static ConnectionType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ConnectionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType)
  }

  private int connectionSpecCase_ = 0;
  private java.lang.Object connectionSpec_;

  public enum ConnectionSpecCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CLOUD_SQL(2),
    CONNECTIONSPEC_NOT_SET(0);
    private final int value;

    private ConnectionSpecCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConnectionSpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConnectionSpecCase forNumber(int value) {
      switch (value) {
        case 2:
          return CLOUD_SQL;
        case 0:
          return CONNECTIONSPEC_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConnectionSpecCase getConnectionSpecCase() {
    return ConnectionSpecCase.forNumber(connectionSpecCase_);
  }

  public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
  private int connectionType_ = 0;
  /**
   *
   *
   * <pre>
   * The type of the BigQuery connection.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for connectionType.
   */
  @java.lang.Override
  public int getConnectionTypeValue() {
    return connectionType_;
  }
  /**
   *
   *
   * <pre>
   * The type of the BigQuery connection.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
   * </code>
   *
   * @return The connectionType.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType getConnectionType() {
    com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType result =
        com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType.forNumber(
            connectionType_);
    return result == null
        ? com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType.UNRECOGNIZED
        : result;
  }

  public static final int CLOUD_SQL_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   *
   * @return Whether the cloudSql field is set.
   */
  @java.lang.Override
  public boolean hasCloudSql() {
    return connectionSpecCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   *
   * @return The cloudSql.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec getCloudSql() {
    if (connectionSpecCase_ == 2) {
      return (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_;
    }
    return com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder
      getCloudSqlOrBuilder() {
    if (connectionSpecCase_ == 2) {
      return (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_;
    }
    return com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
  }

  public static final int HAS_CREDENTIAL_FIELD_NUMBER = 3;
  private boolean hasCredential_ = false;
  /**
   *
   *
   * <pre>
   * True if there are credentials attached to the BigQuery connection; false
   * otherwise.
   * </pre>
   *
   * <code>bool has_credential = 3;</code>
   *
   * @return The hasCredential.
   */
  @java.lang.Override
  public boolean getHasCredential() {
    return hasCredential_;
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
    if (connectionType_
        != com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType
            .CONNECTION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, connectionType_);
    }
    if (connectionSpecCase_ == 2) {
      output.writeMessage(
          2, (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_);
    }
    if (hasCredential_ != false) {
      output.writeBool(3, hasCredential_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (connectionType_
        != com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType
            .CONNECTION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, connectionType_);
    }
    if (connectionSpecCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_);
    }
    if (hasCredential_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, hasCredential_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.BigQueryConnectionSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.BigQueryConnectionSpec other =
        (com.google.cloud.datacatalog.v1.BigQueryConnectionSpec) obj;

    if (connectionType_ != other.connectionType_) return false;
    if (getHasCredential() != other.getHasCredential()) return false;
    if (!getConnectionSpecCase().equals(other.getConnectionSpecCase())) return false;
    switch (connectionSpecCase_) {
      case 2:
        if (!getCloudSql().equals(other.getCloudSql())) return false;
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
    hash = (37 * hash) + CONNECTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + connectionType_;
    hash = (37 * hash) + HAS_CREDENTIAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHasCredential());
    switch (connectionSpecCase_) {
      case 2:
        hash = (37 * hash) + CLOUD_SQL_FIELD_NUMBER;
        hash = (53 * hash) + getCloudSql().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec parseFrom(
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
      com.google.cloud.datacatalog.v1.BigQueryConnectionSpec prototype) {
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
   * Specification for the BigQuery connection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.BigQueryConnectionSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.BigQueryConnectionSpec)
      com.google.cloud.datacatalog.v1.BigQueryConnectionSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.class,
              com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      connectionType_ = 0;
      if (cloudSqlBuilder_ != null) {
        cloudSqlBuilder_.clear();
      }
      hasCredential_ = false;
      connectionSpecCase_ = 0;
      connectionSpec_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.BigQueryProto
          .internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec build() {
      com.google.cloud.datacatalog.v1.BigQueryConnectionSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec buildPartial() {
      com.google.cloud.datacatalog.v1.BigQueryConnectionSpec result =
          new com.google.cloud.datacatalog.v1.BigQueryConnectionSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.BigQueryConnectionSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectionType_ = connectionType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hasCredential_ = hasCredential_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.datacatalog.v1.BigQueryConnectionSpec result) {
      result.connectionSpecCase_ = connectionSpecCase_;
      result.connectionSpec_ = this.connectionSpec_;
      if (connectionSpecCase_ == 2 && cloudSqlBuilder_ != null) {
        result.connectionSpec_ = cloudSqlBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.BigQueryConnectionSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.BigQueryConnectionSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.BigQueryConnectionSpec other) {
      if (other == com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.getDefaultInstance())
        return this;
      if (other.connectionType_ != 0) {
        setConnectionTypeValue(other.getConnectionTypeValue());
      }
      if (other.getHasCredential() != false) {
        setHasCredential(other.getHasCredential());
      }
      switch (other.getConnectionSpecCase()) {
        case CLOUD_SQL:
          {
            mergeCloudSql(other.getCloudSql());
            break;
          }
        case CONNECTIONSPEC_NOT_SET:
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
            case 8:
              {
                connectionType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getCloudSqlFieldBuilder().getBuilder(), extensionRegistry);
                connectionSpecCase_ = 2;
                break;
              } // case 18
            case 24:
              {
                hasCredential_ = input.readBool();
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

    private int connectionSpecCase_ = 0;
    private java.lang.Object connectionSpec_;

    public ConnectionSpecCase getConnectionSpecCase() {
      return ConnectionSpecCase.forNumber(connectionSpecCase_);
    }

    public Builder clearConnectionSpec() {
      connectionSpecCase_ = 0;
      connectionSpec_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int connectionType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of the BigQuery connection.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for connectionType.
     */
    @java.lang.Override
    public int getConnectionTypeValue() {
      return connectionType_;
    }
    /**
     *
     *
     * <pre>
     * The type of the BigQuery connection.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for connectionType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionTypeValue(int value) {
      connectionType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the BigQuery connection.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
     * </code>
     *
     * @return The connectionType.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType
        getConnectionType() {
      com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType result =
          com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType.forNumber(
              connectionType_);
      return result == null
          ? com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of the BigQuery connection.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
     * </code>
     *
     * @param value The connectionType to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionType(
        com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      connectionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the BigQuery connection.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConnectionType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      connectionType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec,
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.Builder,
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder>
        cloudSqlBuilder_;
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     *
     * @return Whether the cloudSql field is set.
     */
    @java.lang.Override
    public boolean hasCloudSql() {
      return connectionSpecCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     *
     * @return The cloudSql.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec getCloudSql() {
      if (cloudSqlBuilder_ == null) {
        if (connectionSpecCase_ == 2) {
          return (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_;
        }
        return com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
      } else {
        if (connectionSpecCase_ == 2) {
          return cloudSqlBuilder_.getMessage();
        }
        return com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    public Builder setCloudSql(
        com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec value) {
      if (cloudSqlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connectionSpec_ = value;
        onChanged();
      } else {
        cloudSqlBuilder_.setMessage(value);
      }
      connectionSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    public Builder setCloudSql(
        com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.Builder builderForValue) {
      if (cloudSqlBuilder_ == null) {
        connectionSpec_ = builderForValue.build();
        onChanged();
      } else {
        cloudSqlBuilder_.setMessage(builderForValue.build());
      }
      connectionSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    public Builder mergeCloudSql(
        com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec value) {
      if (cloudSqlBuilder_ == null) {
        if (connectionSpecCase_ == 2
            && connectionSpec_
                != com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec
                    .getDefaultInstance()) {
          connectionSpec_ =
              com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.newBuilder(
                      (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec)
                          connectionSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          connectionSpec_ = value;
        }
        onChanged();
      } else {
        if (connectionSpecCase_ == 2) {
          cloudSqlBuilder_.mergeFrom(value);
        } else {
          cloudSqlBuilder_.setMessage(value);
        }
      }
      connectionSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    public Builder clearCloudSql() {
      if (cloudSqlBuilder_ == null) {
        if (connectionSpecCase_ == 2) {
          connectionSpecCase_ = 0;
          connectionSpec_ = null;
          onChanged();
        }
      } else {
        if (connectionSpecCase_ == 2) {
          connectionSpecCase_ = 0;
          connectionSpec_ = null;
        }
        cloudSqlBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.Builder
        getCloudSqlBuilder() {
      return getCloudSqlFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder
        getCloudSqlOrBuilder() {
      if ((connectionSpecCase_ == 2) && (cloudSqlBuilder_ != null)) {
        return cloudSqlBuilder_.getMessageOrBuilder();
      } else {
        if (connectionSpecCase_ == 2) {
          return (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_;
        }
        return com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec,
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.Builder,
            com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder>
        getCloudSqlFieldBuilder() {
      if (cloudSqlBuilder_ == null) {
        if (!(connectionSpecCase_ == 2)) {
          connectionSpec_ =
              com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.getDefaultInstance();
        }
        cloudSqlBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec,
                com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec.Builder,
                com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder>(
                (com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec) connectionSpec_,
                getParentForChildren(),
                isClean());
        connectionSpec_ = null;
      }
      connectionSpecCase_ = 2;
      onChanged();
      return cloudSqlBuilder_;
    }

    private boolean hasCredential_;
    /**
     *
     *
     * <pre>
     * True if there are credentials attached to the BigQuery connection; false
     * otherwise.
     * </pre>
     *
     * <code>bool has_credential = 3;</code>
     *
     * @return The hasCredential.
     */
    @java.lang.Override
    public boolean getHasCredential() {
      return hasCredential_;
    }
    /**
     *
     *
     * <pre>
     * True if there are credentials attached to the BigQuery connection; false
     * otherwise.
     * </pre>
     *
     * <code>bool has_credential = 3;</code>
     *
     * @param value The hasCredential to set.
     * @return This builder for chaining.
     */
    public Builder setHasCredential(boolean value) {

      hasCredential_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * True if there are credentials attached to the BigQuery connection; false
     * otherwise.
     * </pre>
     *
     * <code>bool has_credential = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHasCredential() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hasCredential_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.BigQueryConnectionSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.BigQueryConnectionSpec)
  private static final com.google.cloud.datacatalog.v1.BigQueryConnectionSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.BigQueryConnectionSpec();
  }

  public static com.google.cloud.datacatalog.v1.BigQueryConnectionSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryConnectionSpec> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryConnectionSpec>() {
        @java.lang.Override
        public BigQueryConnectionSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<BigQueryConnectionSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryConnectionSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.BigQueryConnectionSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
