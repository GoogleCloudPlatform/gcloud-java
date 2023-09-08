// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

/**
 * <pre>
 * Request to create notes in batch.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.BatchCreateNotesRequest}
 */
public final class BatchCreateNotesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.BatchCreateNotesRequest)
    BatchCreateNotesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchCreateNotesRequest.newBuilder() to construct.
  private BatchCreateNotesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateNotesRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchCreateNotesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetNotes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.BatchCreateNotesRequest.class, io.grafeas.v1.BatchCreateNotesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTES_FIELD_NUMBER = 2;
  private static final class NotesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.grafeas.v1.Note> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.grafeas.v1.Note>newDefaultInstance(
                io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_NotesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.grafeas.v1.Note.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, io.grafeas.v1.Note> notes_;
  private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1.Note>
  internalGetNotes() {
    if (notes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          NotesDefaultEntryHolder.defaultEntry);
    }
    return notes_;
  }
  public int getNotesCount() {
    return internalGetNotes().getMap().size();
  }
  /**
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public boolean containsNotes(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetNotes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getNotesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotes() {
    return getNotesMap();
  }
  /**
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotesMap() {
    return internalGetNotes().getMap();
  }
  /**
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public /* nullable */
io.grafeas.v1.Note getNotesOrDefault(
      java.lang.String key,
      /* nullable */
io.grafeas.v1.Note defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.grafeas.v1.Note> map =
        internalGetNotes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public io.grafeas.v1.Note getNotesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.grafeas.v1.Note> map =
        internalGetNotes().getMap();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetNotes(),
        NotesDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (java.util.Map.Entry<java.lang.String, io.grafeas.v1.Note> entry
         : internalGetNotes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.grafeas.v1.Note>
      notes__ = NotesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, notes__);
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
    if (!(obj instanceof io.grafeas.v1.BatchCreateNotesRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1.BatchCreateNotesRequest other = (io.grafeas.v1.BatchCreateNotesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!internalGetNotes().equals(
        other.internalGetNotes())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (!internalGetNotes().getMap().isEmpty()) {
      hash = (37 * hash) + NOTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetNotes().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.BatchCreateNotesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.BatchCreateNotesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.BatchCreateNotesRequest parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1.BatchCreateNotesRequest prototype) {
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
   * Request to create notes in batch.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.BatchCreateNotesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.BatchCreateNotesRequest)
      io.grafeas.v1.BatchCreateNotesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetNotes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableNotes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.BatchCreateNotesRequest.class, io.grafeas.v1.BatchCreateNotesRequest.Builder.class);
    }

    // Construct using io.grafeas.v1.BatchCreateNotesRequest.newBuilder()
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
      parent_ = "";
      internalGetMutableNotes().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_BatchCreateNotesRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.BatchCreateNotesRequest getDefaultInstanceForType() {
      return io.grafeas.v1.BatchCreateNotesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.BatchCreateNotesRequest build() {
      io.grafeas.v1.BatchCreateNotesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.BatchCreateNotesRequest buildPartial() {
      io.grafeas.v1.BatchCreateNotesRequest result = new io.grafeas.v1.BatchCreateNotesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.BatchCreateNotesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.notes_ = internalGetNotes();
        result.notes_.makeImmutable();
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
      if (other instanceof io.grafeas.v1.BatchCreateNotesRequest) {
        return mergeFrom((io.grafeas.v1.BatchCreateNotesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.BatchCreateNotesRequest other) {
      if (other == io.grafeas.v1.BatchCreateNotesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableNotes().mergeFrom(
          other.internalGetNotes());
      bitField0_ |= 0x00000002;
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, io.grafeas.v1.Note>
              notes__ = input.readMessage(
                  NotesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableNotes().getMutableMap().put(
                  notes__.getKey(), notes__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.grafeas.v1.Note> notes_;
    private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1.Note>
        internalGetNotes() {
      if (notes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            NotesDefaultEntryHolder.defaultEntry);
      }
      return notes_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.grafeas.v1.Note>
        internalGetMutableNotes() {
      if (notes_ == null) {
        notes_ = com.google.protobuf.MapField.newMapField(
            NotesDefaultEntryHolder.defaultEntry);
      }
      if (!notes_.isMutable()) {
        notes_ = notes_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return notes_;
    }
    public int getNotesCount() {
      return internalGetNotes().getMap().size();
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override
    public boolean containsNotes(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetNotes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getNotesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotes() {
      return getNotesMap();
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotesMap() {
      return internalGetNotes().getMap();
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override
    public /* nullable */
io.grafeas.v1.Note getNotesOrDefault(
        java.lang.String key,
        /* nullable */
io.grafeas.v1.Note defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.grafeas.v1.Note> map =
          internalGetNotes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    @java.lang.Override
    public io.grafeas.v1.Note getNotesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.grafeas.v1.Note> map =
          internalGetNotes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearNotes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableNotes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeNotes(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableNotes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.grafeas.v1.Note>
        getMutableNotes() {
      bitField0_ |= 0x00000002;
      return internalGetMutableNotes().getMutableMap();
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder putNotes(
        java.lang.String key,
        io.grafeas.v1.Note value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableNotes().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * The notes to create. Max allowed length is 1000.
     * </pre>
     *
     * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder putAllNotes(
        java.util.Map<java.lang.String, io.grafeas.v1.Note> values) {
      internalGetMutableNotes().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1.BatchCreateNotesRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.BatchCreateNotesRequest)
  private static final io.grafeas.v1.BatchCreateNotesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.BatchCreateNotesRequest();
  }

  public static io.grafeas.v1.BatchCreateNotesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateNotesRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateNotesRequest>() {
    @java.lang.Override
    public BatchCreateNotesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateNotesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateNotesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.BatchCreateNotesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

