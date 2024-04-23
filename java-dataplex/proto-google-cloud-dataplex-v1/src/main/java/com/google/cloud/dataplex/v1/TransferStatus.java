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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Denotes the transfer status of a resource. It is unspecified for resources
 * created from Dataplex API.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dataplex.v1.TransferStatus}
 */
public enum TransferStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default value. It is set for resources that were not subject for
   * migration from Data Catalog service.
   * </pre>
   *
   * <code>TRANSFER_STATUS_UNSPECIFIED = 0;</code>
   */
  TRANSFER_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Indicates that a resource was migrated from Data Catalog service but it
   * hasn't been transferred yet. In particular the resource cannot be updated
   * from Dataplex API.
   * </pre>
   *
   * <code>TRANSFER_STATUS_MIGRATED = 1;</code>
   */
  TRANSFER_STATUS_MIGRATED(1),
  /**
   *
   *
   * <pre>
   * Indicates that a resource was transferred from Data Catalog service. The
   * resource can only be updated from Dataplex API.
   * </pre>
   *
   * <code>TRANSFER_STATUS_TRANSFERRED = 2;</code>
   */
  TRANSFER_STATUS_TRANSFERRED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default value. It is set for resources that were not subject for
   * migration from Data Catalog service.
   * </pre>
   *
   * <code>TRANSFER_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSFER_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Indicates that a resource was migrated from Data Catalog service but it
   * hasn't been transferred yet. In particular the resource cannot be updated
   * from Dataplex API.
   * </pre>
   *
   * <code>TRANSFER_STATUS_MIGRATED = 1;</code>
   */
  public static final int TRANSFER_STATUS_MIGRATED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Indicates that a resource was transferred from Data Catalog service. The
   * resource can only be updated from Dataplex API.
   * </pre>
   *
   * <code>TRANSFER_STATUS_TRANSFERRED = 2;</code>
   */
  public static final int TRANSFER_STATUS_TRANSFERRED_VALUE = 2;

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
  public static TransferStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransferStatus forNumber(int value) {
    switch (value) {
      case 0:
        return TRANSFER_STATUS_UNSPECIFIED;
      case 1:
        return TRANSFER_STATUS_MIGRATED;
      case 2:
        return TRANSFER_STATUS_TRANSFERRED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransferStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransferStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TransferStatus>() {
        public TransferStatus findValueByNumber(int number) {
          return TransferStatus.forNumber(number);
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
    return com.google.cloud.dataplex.v1.CatalogProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TransferStatus[] VALUES = values();

  public static TransferStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransferStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dataplex.v1.TransferStatus)
}
