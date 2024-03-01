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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Specifies the columns on which numeric filter needs to be applied.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.clouddms.v1.NumericFilterOption}
 */
public enum NumericFilterOption implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Numeric filter option unspecified
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_UNSPECIFIED = 0;</code>
   */
  NUMERIC_FILTER_OPTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches all numeric columns.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_ALL = 1;</code>
   */
  NUMERIC_FILTER_OPTION_ALL(1),
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches columns having numeric datatypes with
   * specified precision and scale within the limited range of filter.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_LIMIT = 2;</code>
   */
  NUMERIC_FILTER_OPTION_LIMIT(2),
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches only the numeric columns with no
   * precision and scale specified.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_LIMITLESS = 3;</code>
   */
  NUMERIC_FILTER_OPTION_LIMITLESS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Numeric filter option unspecified
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_UNSPECIFIED = 0;</code>
   */
  public static final int NUMERIC_FILTER_OPTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches all numeric columns.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_ALL = 1;</code>
   */
  public static final int NUMERIC_FILTER_OPTION_ALL_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches columns having numeric datatypes with
   * specified precision and scale within the limited range of filter.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_LIMIT = 2;</code>
   */
  public static final int NUMERIC_FILTER_OPTION_LIMIT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Numeric filter option that matches only the numeric columns with no
   * precision and scale specified.
   * </pre>
   *
   * <code>NUMERIC_FILTER_OPTION_LIMITLESS = 3;</code>
   */
  public static final int NUMERIC_FILTER_OPTION_LIMITLESS_VALUE = 3;

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
  public static NumericFilterOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NumericFilterOption forNumber(int value) {
    switch (value) {
      case 0:
        return NUMERIC_FILTER_OPTION_UNSPECIFIED;
      case 1:
        return NUMERIC_FILTER_OPTION_ALL;
      case 2:
        return NUMERIC_FILTER_OPTION_LIMIT;
      case 3:
        return NUMERIC_FILTER_OPTION_LIMITLESS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NumericFilterOption>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NumericFilterOption>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NumericFilterOption>() {
            public NumericFilterOption findValueByNumber(int number) {
              return NumericFilterOption.forNumber(number);
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
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(6);
  }

  private static final NumericFilterOption[] VALUES = values();

  public static NumericFilterOption valueOf(
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

  private NumericFilterOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.v1.NumericFilterOption)
}
