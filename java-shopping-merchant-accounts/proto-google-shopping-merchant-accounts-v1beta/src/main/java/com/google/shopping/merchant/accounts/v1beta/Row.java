/*
 * Copyright 2024 Google LLC
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
// source: google/shopping/merchant/accounts/v1beta/shippingsettings.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Include a list of cells.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.Row}
 */
public final class Row extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.Row)
    RowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Row() {
    cells_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Row();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_Row_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.Row.class,
            com.google.shopping.merchant.accounts.v1beta.Row.Builder.class);
  }

  public static final int CELLS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.shopping.merchant.accounts.v1beta.Value> cells_;
  /**
   *
   *
   * <pre>
   * Required. The list of cells that constitute the row. Must have the same
   * length as `columnHeaders` for two-dimensional tables, a length of 1 for
   * one-dimensional tables.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.shopping.merchant.accounts.v1beta.Value> getCellsList() {
    return cells_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of cells that constitute the row. Must have the same
   * length as `columnHeaders` for two-dimensional tables, a length of 1 for
   * one-dimensional tables.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder>
      getCellsOrBuilderList() {
    return cells_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of cells that constitute the row. Must have the same
   * length as `columnHeaders` for two-dimensional tables, a length of 1 for
   * one-dimensional tables.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getCellsCount() {
    return cells_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The list of cells that constitute the row. Must have the same
   * length as `columnHeaders` for two-dimensional tables, a length of 1 for
   * one-dimensional tables.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.Value getCells(int index) {
    return cells_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The list of cells that constitute the row. Must have the same
   * length as `columnHeaders` for two-dimensional tables, a length of 1 for
   * one-dimensional tables.
   * </pre>
   *
   * <code>
   * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder getCellsOrBuilder(int index) {
    return cells_.get(index);
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
    for (int i = 0; i < cells_.size(); i++) {
      output.writeMessage(1, cells_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cells_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, cells_.get(i));
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.Row)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.Row other =
        (com.google.shopping.merchant.accounts.v1beta.Row) obj;

    if (!getCellsList().equals(other.getCellsList())) return false;
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
    if (getCellsCount() > 0) {
      hash = (37 * hash) + CELLS_FIELD_NUMBER;
      hash = (53 * hash) + getCellsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row parseFrom(
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

  public static Builder newBuilder(com.google.shopping.merchant.accounts.v1beta.Row prototype) {
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
   * Include a list of cells.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.Row}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.Row)
      com.google.shopping.merchant.accounts.v1beta.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_Row_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.Row.class,
              com.google.shopping.merchant.accounts.v1beta.Row.Builder.class);
    }

    // Construct using com.google.shopping.merchant.accounts.v1beta.Row.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (cellsBuilder_ == null) {
        cells_ = java.util.Collections.emptyList();
      } else {
        cells_ = null;
        cellsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_Row_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.Row getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.Row.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.Row build() {
      com.google.shopping.merchant.accounts.v1beta.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.Row buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.Row result =
          new com.google.shopping.merchant.accounts.v1beta.Row(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.merchant.accounts.v1beta.Row result) {
      if (cellsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cells_ = java.util.Collections.unmodifiableList(cells_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cells_ = cells_;
      } else {
        result.cells_ = cellsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.shopping.merchant.accounts.v1beta.Row result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.Row) {
        return mergeFrom((com.google.shopping.merchant.accounts.v1beta.Row) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.accounts.v1beta.Row other) {
      if (other == com.google.shopping.merchant.accounts.v1beta.Row.getDefaultInstance())
        return this;
      if (cellsBuilder_ == null) {
        if (!other.cells_.isEmpty()) {
          if (cells_.isEmpty()) {
            cells_ = other.cells_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCellsIsMutable();
            cells_.addAll(other.cells_);
          }
          onChanged();
        }
      } else {
        if (!other.cells_.isEmpty()) {
          if (cellsBuilder_.isEmpty()) {
            cellsBuilder_.dispose();
            cellsBuilder_ = null;
            cells_ = other.cells_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cellsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCellsFieldBuilder()
                    : null;
          } else {
            cellsBuilder_.addAllMessages(other.cells_);
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
            case 10:
              {
                com.google.shopping.merchant.accounts.v1beta.Value m =
                    input.readMessage(
                        com.google.shopping.merchant.accounts.v1beta.Value.parser(),
                        extensionRegistry);
                if (cellsBuilder_ == null) {
                  ensureCellsIsMutable();
                  cells_.add(m);
                } else {
                  cellsBuilder_.addMessage(m);
                }
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

    private int bitField0_;

    private java.util.List<com.google.shopping.merchant.accounts.v1beta.Value> cells_ =
        java.util.Collections.emptyList();

    private void ensureCellsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cells_ =
            new java.util.ArrayList<com.google.shopping.merchant.accounts.v1beta.Value>(cells_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.Value,
            com.google.shopping.merchant.accounts.v1beta.Value.Builder,
            com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder>
        cellsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.Value> getCellsList() {
      if (cellsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cells_);
      } else {
        return cellsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getCellsCount() {
      if (cellsBuilder_ == null) {
        return cells_.size();
      } else {
        return cellsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Value getCells(int index) {
      if (cellsBuilder_ == null) {
        return cells_.get(index);
      } else {
        return cellsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCells(int index, com.google.shopping.merchant.accounts.v1beta.Value value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.set(index, value);
        onChanged();
      } else {
        cellsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCells(
        int index, com.google.shopping.merchant.accounts.v1beta.Value.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.set(index, builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCells(com.google.shopping.merchant.accounts.v1beta.Value value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.add(value);
        onChanged();
      } else {
        cellsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCells(int index, com.google.shopping.merchant.accounts.v1beta.Value value) {
      if (cellsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellsIsMutable();
        cells_.add(index, value);
        onChanged();
      } else {
        cellsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCells(
        com.google.shopping.merchant.accounts.v1beta.Value.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.add(builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addCells(
        int index, com.google.shopping.merchant.accounts.v1beta.Value.Builder builderForValue) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.add(index, builderForValue.build());
        onChanged();
      } else {
        cellsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllCells(
        java.lang.Iterable<? extends com.google.shopping.merchant.accounts.v1beta.Value> values) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, cells_);
        onChanged();
      } else {
        cellsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCells() {
      if (cellsBuilder_ == null) {
        cells_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cellsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeCells(int index) {
      if (cellsBuilder_ == null) {
        ensureCellsIsMutable();
        cells_.remove(index);
        onChanged();
      } else {
        cellsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Value.Builder getCellsBuilder(int index) {
      return getCellsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder getCellsOrBuilder(
        int index) {
      if (cellsBuilder_ == null) {
        return cells_.get(index);
      } else {
        return cellsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder>
        getCellsOrBuilderList() {
      if (cellsBuilder_ != null) {
        return cellsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cells_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Value.Builder addCellsBuilder() {
      return getCellsFieldBuilder()
          .addBuilder(com.google.shopping.merchant.accounts.v1beta.Value.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.Value.Builder addCellsBuilder(int index) {
      return getCellsFieldBuilder()
          .addBuilder(
              index, com.google.shopping.merchant.accounts.v1beta.Value.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The list of cells that constitute the row. Must have the same
     * length as `columnHeaders` for two-dimensional tables, a length of 1 for
     * one-dimensional tables.
     * </pre>
     *
     * <code>
     * repeated .google.shopping.merchant.accounts.v1beta.Value cells = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.accounts.v1beta.Value.Builder>
        getCellsBuilderList() {
      return getCellsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.Value,
            com.google.shopping.merchant.accounts.v1beta.Value.Builder,
            com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder>
        getCellsFieldBuilder() {
      if (cellsBuilder_ == null) {
        cellsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.shopping.merchant.accounts.v1beta.Value,
                com.google.shopping.merchant.accounts.v1beta.Value.Builder,
                com.google.shopping.merchant.accounts.v1beta.ValueOrBuilder>(
                cells_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        cells_ = null;
      }
      return cellsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.Row)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.Row)
  private static final com.google.shopping.merchant.accounts.v1beta.Row DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.Row();
  }

  public static com.google.shopping.merchant.accounts.v1beta.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row> PARSER =
      new com.google.protobuf.AbstractParser<Row>() {
        @java.lang.Override
        public Row parsePartialFrom(
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

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
