/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/advisorynotifications/v1/service.proto

package com.google.cloud.advisorynotifications.v1;

/**
 *
 *
 * <pre>
 * Status of localized text.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.advisorynotifications.v1.LocalizationState}
 */
public enum LocalizationState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_UNSPECIFIED = 0;</code>
   */
  LOCALIZATION_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Localization is not applicable for requested language. This can happen
   * when:
   * - The requested language was not supported by Advisory Notifications at the
   * time of localization (including notifications created before the
   * localization feature was launched).
   * - The requested language is English, so only the English text is returned.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_NOT_APPLICABLE = 1;</code>
   */
  LOCALIZATION_STATE_NOT_APPLICABLE(1),
  /**
   *
   *
   * <pre>
   * Localization for requested language is in progress, and not ready yet.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_PENDING = 2;</code>
   */
  LOCALIZATION_STATE_PENDING(2),
  /**
   *
   *
   * <pre>
   * Localization for requested language is completed.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_COMPLETED = 3;</code>
   */
  LOCALIZATION_STATE_COMPLETED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int LOCALIZATION_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Localization is not applicable for requested language. This can happen
   * when:
   * - The requested language was not supported by Advisory Notifications at the
   * time of localization (including notifications created before the
   * localization feature was launched).
   * - The requested language is English, so only the English text is returned.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_NOT_APPLICABLE = 1;</code>
   */
  public static final int LOCALIZATION_STATE_NOT_APPLICABLE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Localization for requested language is in progress, and not ready yet.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_PENDING = 2;</code>
   */
  public static final int LOCALIZATION_STATE_PENDING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Localization for requested language is completed.
   * </pre>
   *
   * <code>LOCALIZATION_STATE_COMPLETED = 3;</code>
   */
  public static final int LOCALIZATION_STATE_COMPLETED_VALUE = 3;

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
  public static LocalizationState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LocalizationState forNumber(int value) {
    switch (value) {
      case 0:
        return LOCALIZATION_STATE_UNSPECIFIED;
      case 1:
        return LOCALIZATION_STATE_NOT_APPLICABLE;
      case 2:
        return LOCALIZATION_STATE_PENDING;
      case 3:
        return LOCALIZATION_STATE_COMPLETED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LocalizationState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LocalizationState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocalizationState>() {
            public LocalizationState findValueByNumber(int number) {
              return LocalizationState.forNumber(number);
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
    return com.google.cloud.advisorynotifications.v1.ServiceProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final LocalizationState[] VALUES = values();

  public static LocalizationState valueOf(
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

  private LocalizationState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.advisorynotifications.v1.LocalizationState)
}
