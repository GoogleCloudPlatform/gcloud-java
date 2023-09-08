// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 * <pre>
 * Response message for 'GenerateTcpProxyScript' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.TcpProxyScript}
 */
public final class TcpProxyScript extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.TcpProxyScript)
    TcpProxyScriptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TcpProxyScript.newBuilder() to construct.
  private TcpProxyScript(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TcpProxyScript() {
    script_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TcpProxyScript();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_TcpProxyScript_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_TcpProxyScript_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.TcpProxyScript.class, com.google.cloud.clouddms.v1.TcpProxyScript.Builder.class);
  }

  public static final int SCRIPT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object script_ = "";
  /**
   * <pre>
   * The TCP Proxy configuration script.
   * </pre>
   *
   * <code>string script = 1;</code>
   * @return The script.
   */
  @java.lang.Override
  public java.lang.String getScript() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      script_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The TCP Proxy configuration script.
   * </pre>
   *
   * <code>string script = 1;</code>
   * @return The bytes for script.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScriptBytes() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      script_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, script_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, script_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.TcpProxyScript)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.TcpProxyScript other = (com.google.cloud.clouddms.v1.TcpProxyScript) obj;

    if (!getScript()
        .equals(other.getScript())) return false;
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
    hash = (37 * hash) + SCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getScript().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.TcpProxyScript parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.TcpProxyScript parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.clouddms.v1.TcpProxyScript parseFrom(
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
  public static Builder newBuilder(com.google.cloud.clouddms.v1.TcpProxyScript prototype) {
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
   * Response message for 'GenerateTcpProxyScript' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.TcpProxyScript}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.TcpProxyScript)
      com.google.cloud.clouddms.v1.TcpProxyScriptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_TcpProxyScript_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_TcpProxyScript_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.TcpProxyScript.class, com.google.cloud.clouddms.v1.TcpProxyScript.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.TcpProxyScript.newBuilder()
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
      script_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto.internal_static_google_cloud_clouddms_v1_TcpProxyScript_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.TcpProxyScript getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.TcpProxyScript.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.TcpProxyScript build() {
      com.google.cloud.clouddms.v1.TcpProxyScript result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.TcpProxyScript buildPartial() {
      com.google.cloud.clouddms.v1.TcpProxyScript result = new com.google.cloud.clouddms.v1.TcpProxyScript(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.TcpProxyScript result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.script_ = script_;
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
      if (other instanceof com.google.cloud.clouddms.v1.TcpProxyScript) {
        return mergeFrom((com.google.cloud.clouddms.v1.TcpProxyScript)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.TcpProxyScript other) {
      if (other == com.google.cloud.clouddms.v1.TcpProxyScript.getDefaultInstance()) return this;
      if (!other.getScript().isEmpty()) {
        script_ = other.script_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              script_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object script_ = "";
    /**
     * <pre>
     * The TCP Proxy configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     * @return The script.
     */
    public java.lang.String getScript() {
      java.lang.Object ref = script_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        script_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The TCP Proxy configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     * @return The bytes for script.
     */
    public com.google.protobuf.ByteString
        getScriptBytes() {
      java.lang.Object ref = script_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        script_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The TCP Proxy configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     * @param value The script to set.
     * @return This builder for chaining.
     */
    public Builder setScript(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      script_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TCP Proxy configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScript() {
      script_ = getDefaultInstance().getScript();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The TCP Proxy configuration script.
     * </pre>
     *
     * <code>string script = 1;</code>
     * @param value The bytes for script to set.
     * @return This builder for chaining.
     */
    public Builder setScriptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      script_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.TcpProxyScript)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.TcpProxyScript)
  private static final com.google.cloud.clouddms.v1.TcpProxyScript DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.TcpProxyScript();
  }

  public static com.google.cloud.clouddms.v1.TcpProxyScript getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TcpProxyScript>
      PARSER = new com.google.protobuf.AbstractParser<TcpProxyScript>() {
    @java.lang.Override
    public TcpProxyScript parsePartialFrom(
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

  public static com.google.protobuf.Parser<TcpProxyScript> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TcpProxyScript> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.TcpProxyScript getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

