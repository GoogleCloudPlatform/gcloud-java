// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

package com.google.cloud.config.v1;

/**
 * <pre>
 * Outputs and artifacts from applying a deployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.config.v1.ApplyResults}
 */
public final class ApplyResults extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.config.v1.ApplyResults)
    ApplyResultsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplyResults.newBuilder() to construct.
  private ApplyResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplyResults() {
    content_ = "";
    artifacts_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplyResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetOutputs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.config.v1.ApplyResults.class, com.google.cloud.config.v1.ApplyResults.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * Location of a blueprint copy and other manifests in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Location of a blueprint copy and other manifests in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARTIFACTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object artifacts_ = "";
  /**
   * <pre>
   * Location of artifacts (e.g. logs) in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string artifacts = 2;</code>
   * @return The artifacts.
   */
  @java.lang.Override
  public java.lang.String getArtifacts() {
    java.lang.Object ref = artifacts_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      artifacts_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Location of artifacts (e.g. logs) in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`
   * </pre>
   *
   * <code>string artifacts = 2;</code>
   * @return The bytes for artifacts.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArtifactsBytes() {
    java.lang.Object ref = artifacts_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      artifacts_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUTS_FIELD_NUMBER = 3;
  private static final class OutputsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.config.v1.TerraformOutput> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.config.v1.TerraformOutput>newDefaultInstance(
                com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_OutputsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.config.v1.TerraformOutput.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.config.v1.TerraformOutput> outputs_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
  internalGetOutputs() {
    if (outputs_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          OutputsDefaultEntryHolder.defaultEntry);
    }
    return outputs_;
  }
  public int getOutputsCount() {
    return internalGetOutputs().getMap().size();
  }
  /**
   * <pre>
   * Map of output name to output info.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
   */
  @java.lang.Override
  public boolean containsOutputs(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetOutputs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getOutputsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> getOutputs() {
    return getOutputsMap();
  }
  /**
   * <pre>
   * Map of output name to output info.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> getOutputsMap() {
    return internalGetOutputs().getMap();
  }
  /**
   * <pre>
   * Map of output name to output info.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.cloud.config.v1.TerraformOutput getOutputsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.config.v1.TerraformOutput defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> map =
        internalGetOutputs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map of output name to output info.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.config.v1.TerraformOutput getOutputsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> map =
        internalGetOutputs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifacts_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, artifacts_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetOutputs(),
        OutputsDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(artifacts_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, artifacts_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.config.v1.TerraformOutput> entry
         : internalGetOutputs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
      outputs__ = OutputsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, outputs__);
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
    if (!(obj instanceof com.google.cloud.config.v1.ApplyResults)) {
      return super.equals(obj);
    }
    com.google.cloud.config.v1.ApplyResults other = (com.google.cloud.config.v1.ApplyResults) obj;

    if (!getContent()
        .equals(other.getContent())) return false;
    if (!getArtifacts()
        .equals(other.getArtifacts())) return false;
    if (!internalGetOutputs().equals(
        other.internalGetOutputs())) return false;
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + ARTIFACTS_FIELD_NUMBER;
    hash = (53 * hash) + getArtifacts().hashCode();
    if (!internalGetOutputs().getMap().isEmpty()) {
      hash = (37 * hash) + OUTPUTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetOutputs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.config.v1.ApplyResults parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.config.v1.ApplyResults parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.config.v1.ApplyResults parseFrom(
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
  public static Builder newBuilder(com.google.cloud.config.v1.ApplyResults prototype) {
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
   * Outputs and artifacts from applying a deployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.config.v1.ApplyResults}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.config.v1.ApplyResults)
      com.google.cloud.config.v1.ApplyResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetOutputs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableOutputs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.config.v1.ApplyResults.class, com.google.cloud.config.v1.ApplyResults.Builder.class);
    }

    // Construct using com.google.cloud.config.v1.ApplyResults.newBuilder()
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
      content_ = "";
      artifacts_ = "";
      internalGetMutableOutputs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.config.v1.ConfigProto.internal_static_google_cloud_config_v1_ApplyResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.ApplyResults getDefaultInstanceForType() {
      return com.google.cloud.config.v1.ApplyResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.config.v1.ApplyResults build() {
      com.google.cloud.config.v1.ApplyResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.config.v1.ApplyResults buildPartial() {
      com.google.cloud.config.v1.ApplyResults result = new com.google.cloud.config.v1.ApplyResults(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.config.v1.ApplyResults result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.artifacts_ = artifacts_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.outputs_ = internalGetOutputs();
        result.outputs_.makeImmutable();
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
      if (other instanceof com.google.cloud.config.v1.ApplyResults) {
        return mergeFrom((com.google.cloud.config.v1.ApplyResults)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.config.v1.ApplyResults other) {
      if (other == com.google.cloud.config.v1.ApplyResults.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getArtifacts().isEmpty()) {
        artifacts_ = other.artifacts_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      internalGetMutableOutputs().mergeFrom(
          other.internalGetOutputs());
      bitField0_ |= 0x00000004;
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
              content_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              artifacts_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
              outputs__ = input.readMessage(
                  OutputsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableOutputs().getMutableMap().put(
                  outputs__.getKey(), outputs__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * Location of a blueprint copy and other manifests in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Location of a blueprint copy and other manifests in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Location of a blueprint copy and other manifests in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location of a blueprint copy and other manifests in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string content = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location of a blueprint copy and other manifests in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string content = 1;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object artifacts_ = "";
    /**
     * <pre>
     * Location of artifacts (e.g. logs) in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string artifacts = 2;</code>
     * @return The artifacts.
     */
    public java.lang.String getArtifacts() {
      java.lang.Object ref = artifacts_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        artifacts_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Location of artifacts (e.g. logs) in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string artifacts = 2;</code>
     * @return The bytes for artifacts.
     */
    public com.google.protobuf.ByteString
        getArtifactsBytes() {
      java.lang.Object ref = artifacts_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        artifacts_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Location of artifacts (e.g. logs) in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string artifacts = 2;</code>
     * @param value The artifacts to set.
     * @return This builder for chaining.
     */
    public Builder setArtifacts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      artifacts_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location of artifacts (e.g. logs) in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string artifacts = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearArtifacts() {
      artifacts_ = getDefaultInstance().getArtifacts();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location of artifacts (e.g. logs) in Google Cloud Storage.
     * Format: `gs://{bucket}/{object}`
     * </pre>
     *
     * <code>string artifacts = 2;</code>
     * @param value The bytes for artifacts to set.
     * @return This builder for chaining.
     */
    public Builder setArtifactsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      artifacts_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.cloud.config.v1.TerraformOutput> outputs_;
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
        internalGetOutputs() {
      if (outputs_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            OutputsDefaultEntryHolder.defaultEntry);
      }
      return outputs_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
        internalGetMutableOutputs() {
      if (outputs_ == null) {
        outputs_ = com.google.protobuf.MapField.newMapField(
            OutputsDefaultEntryHolder.defaultEntry);
      }
      if (!outputs_.isMutable()) {
        outputs_ = outputs_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return outputs_;
    }
    public int getOutputsCount() {
      return internalGetOutputs().getMap().size();
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    @java.lang.Override
    public boolean containsOutputs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetOutputs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getOutputsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> getOutputs() {
      return getOutputsMap();
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> getOutputsMap() {
      return internalGetOutputs().getMap();
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.cloud.config.v1.TerraformOutput getOutputsOrDefault(
        java.lang.String key,
        /* nullable */
com.google.cloud.config.v1.TerraformOutput defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> map =
          internalGetOutputs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.config.v1.TerraformOutput getOutputsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> map =
          internalGetOutputs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearOutputs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableOutputs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    public Builder removeOutputs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableOutputs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput>
        getMutableOutputs() {
      bitField0_ |= 0x00000004;
      return internalGetMutableOutputs().getMutableMap();
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    public Builder putOutputs(
        java.lang.String key,
        com.google.cloud.config.v1.TerraformOutput value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableOutputs().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Map of output name to output info.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.config.v1.TerraformOutput&gt; outputs = 3;</code>
     */
    public Builder putAllOutputs(
        java.util.Map<java.lang.String, com.google.cloud.config.v1.TerraformOutput> values) {
      internalGetMutableOutputs().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.config.v1.ApplyResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.config.v1.ApplyResults)
  private static final com.google.cloud.config.v1.ApplyResults DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.config.v1.ApplyResults();
  }

  public static com.google.cloud.config.v1.ApplyResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplyResults>
      PARSER = new com.google.protobuf.AbstractParser<ApplyResults>() {
    @java.lang.Override
    public ApplyResults parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApplyResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplyResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.config.v1.ApplyResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

