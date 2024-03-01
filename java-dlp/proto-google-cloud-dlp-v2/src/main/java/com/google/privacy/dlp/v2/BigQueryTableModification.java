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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Attributes evaluated to determine if a table has been modified. New values
 * may be added at a later time.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.BigQueryTableModification}
 */
public enum BigQueryTableModification implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>TABLE_MODIFICATION_UNSPECIFIED = 0;</code>
   */
  TABLE_MODIFICATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A table will be considered modified when the last_modified_time from
   * BigQuery has been updated.
   * </pre>
   *
   * <code>TABLE_MODIFIED_TIMESTAMP = 1;</code>
   */
  TABLE_MODIFIED_TIMESTAMP(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>TABLE_MODIFICATION_UNSPECIFIED = 0;</code>
   */
  public static final int TABLE_MODIFICATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A table will be considered modified when the last_modified_time from
   * BigQuery has been updated.
   * </pre>
   *
   * <code>TABLE_MODIFIED_TIMESTAMP = 1;</code>
   */
  public static final int TABLE_MODIFIED_TIMESTAMP_VALUE = 1;

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
  public static BigQueryTableModification valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BigQueryTableModification forNumber(int value) {
    switch (value) {
      case 0:
        return TABLE_MODIFICATION_UNSPECIFIED;
      case 1:
        return TABLE_MODIFIED_TIMESTAMP;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BigQueryTableModification>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<BigQueryTableModification>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BigQueryTableModification>() {
            public BigQueryTableModification findValueByNumber(int number) {
              return BigQueryTableModification.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final BigQueryTableModification[] VALUES = values();

  public static BigQueryTableModification valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BigQueryTableModification(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.BigQueryTableModification)
}
