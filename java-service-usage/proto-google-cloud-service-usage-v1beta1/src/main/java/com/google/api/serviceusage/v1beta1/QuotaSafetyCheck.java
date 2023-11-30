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
// source: google/api/serviceusage/v1beta1/resources.proto

package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Enumerations of quota safety checks.
 * </pre>
 *
 * Protobuf enum {@code google.api.serviceusage.v1beta1.QuotaSafetyCheck}
 */
public enum QuotaSafetyCheck implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified quota safety check.
   * </pre>
   *
   * <code>QUOTA_SAFETY_CHECK_UNSPECIFIED = 0;</code>
   */
  QUOTA_SAFETY_CHECK_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Validates that a quota mutation would not cause the consumer's effective
   * limit to be lower than the consumer's quota usage.
   * </pre>
   *
   * <code>LIMIT_DECREASE_BELOW_USAGE = 1;</code>
   */
  LIMIT_DECREASE_BELOW_USAGE(1),
  /**
   *
   *
   * <pre>
   * Validates that a quota mutation would not cause the consumer's effective
   * limit to decrease by more than 10 percent.
   * </pre>
   *
   * <code>LIMIT_DECREASE_PERCENTAGE_TOO_HIGH = 2;</code>
   */
  LIMIT_DECREASE_PERCENTAGE_TOO_HIGH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified quota safety check.
   * </pre>
   *
   * <code>QUOTA_SAFETY_CHECK_UNSPECIFIED = 0;</code>
   */
  public static final int QUOTA_SAFETY_CHECK_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Validates that a quota mutation would not cause the consumer's effective
   * limit to be lower than the consumer's quota usage.
   * </pre>
   *
   * <code>LIMIT_DECREASE_BELOW_USAGE = 1;</code>
   */
  public static final int LIMIT_DECREASE_BELOW_USAGE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Validates that a quota mutation would not cause the consumer's effective
   * limit to decrease by more than 10 percent.
   * </pre>
   *
   * <code>LIMIT_DECREASE_PERCENTAGE_TOO_HIGH = 2;</code>
   */
  public static final int LIMIT_DECREASE_PERCENTAGE_TOO_HIGH_VALUE = 2;

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
  public static QuotaSafetyCheck valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QuotaSafetyCheck forNumber(int value) {
    switch (value) {
      case 0:
        return QUOTA_SAFETY_CHECK_UNSPECIFIED;
      case 1:
        return LIMIT_DECREASE_BELOW_USAGE;
      case 2:
        return LIMIT_DECREASE_PERCENTAGE_TOO_HIGH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QuotaSafetyCheck> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<QuotaSafetyCheck> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<QuotaSafetyCheck>() {
        public QuotaSafetyCheck findValueByNumber(int number) {
          return QuotaSafetyCheck.forNumber(number);
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
    return com.google.api.serviceusage.v1beta1.ResourcesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final QuotaSafetyCheck[] VALUES = values();

  public static QuotaSafetyCheck valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private QuotaSafetyCheck(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.serviceusage.v1beta1.QuotaSafetyCheck)
}
