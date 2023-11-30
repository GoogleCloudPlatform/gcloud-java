// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/layouts.proto

package com.google.monitoring.dashboard.v1;

/**
 * <pre>
 * A basic layout divides the available space into vertical columns of equal
 * width and arranges a list of widgets using a row-first strategy.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.GridLayout}
 */
public final class GridLayout extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.GridLayout)
    GridLayoutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GridLayout.newBuilder() to construct.
  private GridLayout(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GridLayout() {
    widgets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GridLayout();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.dashboard.v1.LayoutsProto.internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.LayoutsProto.internal_static_google_monitoring_dashboard_v1_GridLayout_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.GridLayout.class, com.google.monitoring.dashboard.v1.GridLayout.Builder.class);
  }

  public static final int COLUMNS_FIELD_NUMBER = 1;
  private long columns_ = 0L;
  /**
   * <pre>
   * The number of columns into which the view's width is divided. If omitted
   * or set to zero, a system default will be used while rendering.
   * </pre>
   *
   * <code>int64 columns = 1;</code>
   * @return The columns.
   */
  @java.lang.Override
  public long getColumns() {
    return columns_;
  }

  public static final int WIDGETS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.monitoring.dashboard.v1.Widget> widgets_;
  /**
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.monitoring.dashboard.v1.Widget> getWidgetsList() {
    return widgets_;
  }
  /**
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.monitoring.dashboard.v1.WidgetOrBuilder> 
      getWidgetsOrBuilderList() {
    return widgets_;
  }
  /**
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  @java.lang.Override
  public int getWidgetsCount() {
    return widgets_.size();
  }
  /**
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.Widget getWidgets(int index) {
    return widgets_.get(index);
  }
  /**
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.WidgetOrBuilder getWidgetsOrBuilder(
      int index) {
    return widgets_.get(index);
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
    if (columns_ != 0L) {
      output.writeInt64(1, columns_);
    }
    for (int i = 0; i < widgets_.size(); i++) {
      output.writeMessage(2, widgets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (columns_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, columns_);
    }
    for (int i = 0; i < widgets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, widgets_.get(i));
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.GridLayout)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.GridLayout other = (com.google.monitoring.dashboard.v1.GridLayout) obj;

    if (getColumns()
        != other.getColumns()) return false;
    if (!getWidgetsList()
        .equals(other.getWidgetsList())) return false;
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
    hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getColumns());
    if (getWidgetsCount() > 0) {
      hash = (37 * hash) + WIDGETS_FIELD_NUMBER;
      hash = (53 * hash) + getWidgetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.GridLayout parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.GridLayout parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.GridLayout parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.dashboard.v1.GridLayout prototype) {
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
   * A basic layout divides the available space into vertical columns of equal
   * width and arranges a list of widgets using a row-first strategy.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.GridLayout}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.GridLayout)
      com.google.monitoring.dashboard.v1.GridLayoutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.dashboard.v1.LayoutsProto.internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.LayoutsProto.internal_static_google_monitoring_dashboard_v1_GridLayout_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.GridLayout.class, com.google.monitoring.dashboard.v1.GridLayout.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.GridLayout.newBuilder()
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
      columns_ = 0L;
      if (widgetsBuilder_ == null) {
        widgets_ = java.util.Collections.emptyList();
      } else {
        widgets_ = null;
        widgetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.LayoutsProto.internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.GridLayout getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.GridLayout.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.GridLayout build() {
      com.google.monitoring.dashboard.v1.GridLayout result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.GridLayout buildPartial() {
      com.google.monitoring.dashboard.v1.GridLayout result = new com.google.monitoring.dashboard.v1.GridLayout(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.monitoring.dashboard.v1.GridLayout result) {
      if (widgetsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          widgets_ = java.util.Collections.unmodifiableList(widgets_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.widgets_ = widgets_;
      } else {
        result.widgets_ = widgetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.GridLayout result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.columns_ = columns_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.GridLayout) {
        return mergeFrom((com.google.monitoring.dashboard.v1.GridLayout)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.GridLayout other) {
      if (other == com.google.monitoring.dashboard.v1.GridLayout.getDefaultInstance()) return this;
      if (other.getColumns() != 0L) {
        setColumns(other.getColumns());
      }
      if (widgetsBuilder_ == null) {
        if (!other.widgets_.isEmpty()) {
          if (widgets_.isEmpty()) {
            widgets_ = other.widgets_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWidgetsIsMutable();
            widgets_.addAll(other.widgets_);
          }
          onChanged();
        }
      } else {
        if (!other.widgets_.isEmpty()) {
          if (widgetsBuilder_.isEmpty()) {
            widgetsBuilder_.dispose();
            widgetsBuilder_ = null;
            widgets_ = other.widgets_;
            bitField0_ = (bitField0_ & ~0x00000002);
            widgetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWidgetsFieldBuilder() : null;
          } else {
            widgetsBuilder_.addAllMessages(other.widgets_);
          }
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
            case 8: {
              columns_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.monitoring.dashboard.v1.Widget m =
                  input.readMessage(
                      com.google.monitoring.dashboard.v1.Widget.parser(),
                      extensionRegistry);
              if (widgetsBuilder_ == null) {
                ensureWidgetsIsMutable();
                widgets_.add(m);
              } else {
                widgetsBuilder_.addMessage(m);
              }
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

    private long columns_ ;
    /**
     * <pre>
     * The number of columns into which the view's width is divided. If omitted
     * or set to zero, a system default will be used while rendering.
     * </pre>
     *
     * <code>int64 columns = 1;</code>
     * @return The columns.
     */
    @java.lang.Override
    public long getColumns() {
      return columns_;
    }
    /**
     * <pre>
     * The number of columns into which the view's width is divided. If omitted
     * or set to zero, a system default will be used while rendering.
     * </pre>
     *
     * <code>int64 columns = 1;</code>
     * @param value The columns to set.
     * @return This builder for chaining.
     */
    public Builder setColumns(long value) {

      columns_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of columns into which the view's width is divided. If omitted
     * or set to zero, a system default will be used while rendering.
     * </pre>
     *
     * <code>int64 columns = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumns() {
      bitField0_ = (bitField0_ & ~0x00000001);
      columns_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.monitoring.dashboard.v1.Widget> widgets_ =
      java.util.Collections.emptyList();
    private void ensureWidgetsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        widgets_ = new java.util.ArrayList<com.google.monitoring.dashboard.v1.Widget>(widgets_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.dashboard.v1.Widget, com.google.monitoring.dashboard.v1.Widget.Builder, com.google.monitoring.dashboard.v1.WidgetOrBuilder> widgetsBuilder_;

    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public java.util.List<com.google.monitoring.dashboard.v1.Widget> getWidgetsList() {
      if (widgetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(widgets_);
      } else {
        return widgetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public int getWidgetsCount() {
      if (widgetsBuilder_ == null) {
        return widgets_.size();
      } else {
        return widgetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public com.google.monitoring.dashboard.v1.Widget getWidgets(int index) {
      if (widgetsBuilder_ == null) {
        return widgets_.get(index);
      } else {
        return widgetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder setWidgets(
        int index, com.google.monitoring.dashboard.v1.Widget value) {
      if (widgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWidgetsIsMutable();
        widgets_.set(index, value);
        onChanged();
      } else {
        widgetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder setWidgets(
        int index, com.google.monitoring.dashboard.v1.Widget.Builder builderForValue) {
      if (widgetsBuilder_ == null) {
        ensureWidgetsIsMutable();
        widgets_.set(index, builderForValue.build());
        onChanged();
      } else {
        widgetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder addWidgets(com.google.monitoring.dashboard.v1.Widget value) {
      if (widgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWidgetsIsMutable();
        widgets_.add(value);
        onChanged();
      } else {
        widgetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder addWidgets(
        int index, com.google.monitoring.dashboard.v1.Widget value) {
      if (widgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWidgetsIsMutable();
        widgets_.add(index, value);
        onChanged();
      } else {
        widgetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder addWidgets(
        com.google.monitoring.dashboard.v1.Widget.Builder builderForValue) {
      if (widgetsBuilder_ == null) {
        ensureWidgetsIsMutable();
        widgets_.add(builderForValue.build());
        onChanged();
      } else {
        widgetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder addWidgets(
        int index, com.google.monitoring.dashboard.v1.Widget.Builder builderForValue) {
      if (widgetsBuilder_ == null) {
        ensureWidgetsIsMutable();
        widgets_.add(index, builderForValue.build());
        onChanged();
      } else {
        widgetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder addAllWidgets(
        java.lang.Iterable<? extends com.google.monitoring.dashboard.v1.Widget> values) {
      if (widgetsBuilder_ == null) {
        ensureWidgetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, widgets_);
        onChanged();
      } else {
        widgetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder clearWidgets() {
      if (widgetsBuilder_ == null) {
        widgets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        widgetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public Builder removeWidgets(int index) {
      if (widgetsBuilder_ == null) {
        ensureWidgetsIsMutable();
        widgets_.remove(index);
        onChanged();
      } else {
        widgetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public com.google.monitoring.dashboard.v1.Widget.Builder getWidgetsBuilder(
        int index) {
      return getWidgetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public com.google.monitoring.dashboard.v1.WidgetOrBuilder getWidgetsOrBuilder(
        int index) {
      if (widgetsBuilder_ == null) {
        return widgets_.get(index);  } else {
        return widgetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public java.util.List<? extends com.google.monitoring.dashboard.v1.WidgetOrBuilder> 
         getWidgetsOrBuilderList() {
      if (widgetsBuilder_ != null) {
        return widgetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(widgets_);
      }
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public com.google.monitoring.dashboard.v1.Widget.Builder addWidgetsBuilder() {
      return getWidgetsFieldBuilder().addBuilder(
          com.google.monitoring.dashboard.v1.Widget.getDefaultInstance());
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public com.google.monitoring.dashboard.v1.Widget.Builder addWidgetsBuilder(
        int index) {
      return getWidgetsFieldBuilder().addBuilder(
          index, com.google.monitoring.dashboard.v1.Widget.getDefaultInstance());
    }
    /**
     * <pre>
     * The informational elements that are arranged into the columns row-first.
     * </pre>
     *
     * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
     */
    public java.util.List<com.google.monitoring.dashboard.v1.Widget.Builder> 
         getWidgetsBuilderList() {
      return getWidgetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.dashboard.v1.Widget, com.google.monitoring.dashboard.v1.Widget.Builder, com.google.monitoring.dashboard.v1.WidgetOrBuilder> 
        getWidgetsFieldBuilder() {
      if (widgetsBuilder_ == null) {
        widgetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.dashboard.v1.Widget, com.google.monitoring.dashboard.v1.Widget.Builder, com.google.monitoring.dashboard.v1.WidgetOrBuilder>(
                widgets_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        widgets_ = null;
      }
      return widgetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.GridLayout)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.GridLayout)
  private static final com.google.monitoring.dashboard.v1.GridLayout DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.GridLayout();
  }

  public static com.google.monitoring.dashboard.v1.GridLayout getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GridLayout>
      PARSER = new com.google.protobuf.AbstractParser<GridLayout>() {
    @java.lang.Override
    public GridLayout parsePartialFrom(
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

  public static com.google.protobuf.Parser<GridLayout> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GridLayout> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.GridLayout getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

