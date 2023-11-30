// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/mapsplatformdatasets/v1alpha/data_source.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

/**
 * <pre>
 * The details about the data source when it is a local file.
 * </pre>
 *
 * Protobuf type {@code google.maps.mapsplatformdatasets.v1alpha.LocalFileSource}
 */
public final class LocalFileSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)
    LocalFileSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalFileSource.newBuilder() to construct.
  private LocalFileSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalFileSource() {
    filename_ = "";
    fileFormat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalFileSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.internal_static_google_maps_mapsplatformdatasets_v1alpha_LocalFileSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.internal_static_google_maps_mapsplatformdatasets_v1alpha_LocalFileSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.class, com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.Builder.class);
  }

  public static final int FILENAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object filename_ = "";
  /**
   * <pre>
   * The file name and extension of the uploaded file.
   * </pre>
   *
   * <code>string filename = 1;</code>
   * @return The filename.
   */
  @java.lang.Override
  public java.lang.String getFilename() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The file name and extension of the uploaded file.
   * </pre>
   *
   * <code>string filename = 1;</code>
   * @return The bytes for filename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_FORMAT_FIELD_NUMBER = 2;
  private int fileFormat_ = 0;
  /**
   * <pre>
   * The format of the file that is being uploaded.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
   * @return The enum numeric value on the wire for fileFormat.
   */
  @java.lang.Override public int getFileFormatValue() {
    return fileFormat_;
  }
  /**
   * <pre>
   * The format of the file that is being uploaded.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
   * @return The fileFormat.
   */
  @java.lang.Override public com.google.maps.mapsplatformdatasets.v1alpha.FileFormat getFileFormat() {
    com.google.maps.mapsplatformdatasets.v1alpha.FileFormat result = com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.forNumber(fileFormat_);
    return result == null ? com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filename_);
    }
    if (fileFormat_ != com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.FILE_FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, fileFormat_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filename_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filename_);
    }
    if (fileFormat_ != com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.FILE_FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, fileFormat_);
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
    if (!(obj instanceof com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)) {
      return super.equals(obj);
    }
    com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource other = (com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource) obj;

    if (!getFilename()
        .equals(other.getFilename())) return false;
    if (fileFormat_ != other.fileFormat_) return false;
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
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (37 * hash) + FILE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + fileFormat_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The details about the data source when it is a local file.
   * </pre>
   *
   * Protobuf type {@code google.maps.mapsplatformdatasets.v1alpha.LocalFileSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)
      com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.internal_static_google_maps_mapsplatformdatasets_v1alpha_LocalFileSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.internal_static_google_maps_mapsplatformdatasets_v1alpha_LocalFileSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.class, com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.Builder.class);
    }

    // Construct using com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filename_ = "";
      fileFormat_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.maps.mapsplatformdatasets.v1alpha.DataSourceProto.internal_static_google_maps_mapsplatformdatasets_v1alpha_LocalFileSource_descriptor;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource getDefaultInstanceForType() {
      return com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource build() {
      com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource buildPartial() {
      com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource result = new com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filename_ = filename_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileFormat_ = fileFormat_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource) {
        return mergeFrom((com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource other) {
      if (other == com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource.getDefaultInstance()) return this;
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.fileFormat_ != 0) {
        setFileFormatValue(other.getFileFormatValue());
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
            case 10: {
              filename_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              fileFormat_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
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

    private java.lang.Object filename_ = "";
    /**
     * <pre>
     * The file name and extension of the uploaded file.
     * </pre>
     *
     * <code>string filename = 1;</code>
     * @return The filename.
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The file name and extension of the uploaded file.
     * </pre>
     *
     * <code>string filename = 1;</code>
     * @return The bytes for filename.
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The file name and extension of the uploaded file.
     * </pre>
     *
     * <code>string filename = 1;</code>
     * @param value The filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      filename_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The file name and extension of the uploaded file.
     * </pre>
     *
     * <code>string filename = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilename() {
      filename_ = getDefaultInstance().getFilename();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The file name and extension of the uploaded file.
     * </pre>
     *
     * <code>string filename = 1;</code>
     * @param value The bytes for filename to set.
     * @return This builder for chaining.
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      filename_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int fileFormat_ = 0;
    /**
     * <pre>
     * The format of the file that is being uploaded.
     * </pre>
     *
     * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
     * @return The enum numeric value on the wire for fileFormat.
     */
    @java.lang.Override public int getFileFormatValue() {
      return fileFormat_;
    }
    /**
     * <pre>
     * The format of the file that is being uploaded.
     * </pre>
     *
     * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
     * @param value The enum numeric value on the wire for fileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setFileFormatValue(int value) {
      fileFormat_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the file that is being uploaded.
     * </pre>
     *
     * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
     * @return The fileFormat.
     */
    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.FileFormat getFileFormat() {
      com.google.maps.mapsplatformdatasets.v1alpha.FileFormat result = com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.forNumber(fileFormat_);
      return result == null ? com.google.maps.mapsplatformdatasets.v1alpha.FileFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The format of the file that is being uploaded.
     * </pre>
     *
     * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
     * @param value The fileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setFileFormat(com.google.maps.mapsplatformdatasets.v1alpha.FileFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      fileFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the file that is being uploaded.
     * </pre>
     *
     * <code>.google.maps.mapsplatformdatasets.v1alpha.FileFormat file_format = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileFormat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileFormat_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)
  }

  // @@protoc_insertion_point(class_scope:google.maps.mapsplatformdatasets.v1alpha.LocalFileSource)
  private static final com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource();
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalFileSource>
      PARSER = new com.google.protobuf.AbstractParser<LocalFileSource>() {
    @java.lang.Override
    public LocalFileSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocalFileSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalFileSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

