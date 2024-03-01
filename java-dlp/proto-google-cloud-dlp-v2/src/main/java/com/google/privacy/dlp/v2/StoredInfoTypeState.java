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
 * State of a StoredInfoType version.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.StoredInfoTypeState}
 */
public enum StoredInfoTypeState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused
   * </pre>
   *
   * <code>STORED_INFO_TYPE_STATE_UNSPECIFIED = 0;</code>
   */
  STORED_INFO_TYPE_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * StoredInfoType version is being created.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  PENDING(1),
  /**
   *
   *
   * <pre>
   * StoredInfoType version is ready for use.
   * </pre>
   *
   * <code>READY = 2;</code>
   */
  READY(2),
  /**
   *
   *
   * <pre>
   * StoredInfoType creation failed. All relevant error messages are returned in
   * the `StoredInfoTypeVersion` message.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  /**
   *
   *
   * <pre>
   * StoredInfoType is no longer valid because artifacts stored in
   * user-controlled storage were modified. To fix an invalid StoredInfoType,
   * use the `UpdateStoredInfoType` method to create a new version.
   * </pre>
   *
   * <code>INVALID = 4;</code>
   */
  INVALID(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused
   * </pre>
   *
   * <code>STORED_INFO_TYPE_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int STORED_INFO_TYPE_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * StoredInfoType version is being created.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  public static final int PENDING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * StoredInfoType version is ready for use.
   * </pre>
   *
   * <code>READY = 2;</code>
   */
  public static final int READY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * StoredInfoType creation failed. All relevant error messages are returned in
   * the `StoredInfoTypeVersion` message.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * StoredInfoType is no longer valid because artifacts stored in
   * user-controlled storage were modified. To fix an invalid StoredInfoType,
   * use the `UpdateStoredInfoType` method to create a new version.
   * </pre>
   *
   * <code>INVALID = 4;</code>
   */
  public static final int INVALID_VALUE = 4;

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
  public static StoredInfoTypeState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StoredInfoTypeState forNumber(int value) {
    switch (value) {
      case 0:
        return STORED_INFO_TYPE_STATE_UNSPECIFIED;
      case 1:
        return PENDING;
      case 2:
        return READY;
      case 3:
        return FAILED;
      case 4:
        return INVALID;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StoredInfoTypeState>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<StoredInfoTypeState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StoredInfoTypeState>() {
            public StoredInfoTypeState findValueByNumber(int number) {
              return StoredInfoTypeState.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(14);
  }

  private static final StoredInfoTypeState[] VALUES = values();

  public static StoredInfoTypeState valueOf(
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

  private StoredInfoTypeState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.StoredInfoTypeState)
}
