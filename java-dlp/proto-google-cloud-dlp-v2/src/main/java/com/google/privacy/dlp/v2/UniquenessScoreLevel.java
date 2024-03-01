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
 * Bucketized uniqueness score levels. A higher uniqueness score is a strong
 * signal that the column may contain a unique identifier like user id. A low
 * value indicates that the column contains few unique values like booleans or
 * other classifiers.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.UniquenessScoreLevel}
 */
public enum UniquenessScoreLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Some columns do not have estimated uniqueness. Possible reasons include
   * having too few values.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_LEVEL_UNSPECIFIED = 0;</code>
   */
  UNIQUENESS_SCORE_LEVEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Low uniqueness, possibly a boolean, enum or similiarly typed column.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_LOW = 1;</code>
   */
  UNIQUENESS_SCORE_LOW(1),
  /**
   *
   *
   * <pre>
   * Medium uniqueness.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_MEDIUM = 2;</code>
   */
  UNIQUENESS_SCORE_MEDIUM(2),
  /**
   *
   *
   * <pre>
   * High uniqueness, possibly a column of free text or unique identifiers.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_HIGH = 3;</code>
   */
  UNIQUENESS_SCORE_HIGH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Some columns do not have estimated uniqueness. Possible reasons include
   * having too few values.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int UNIQUENESS_SCORE_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Low uniqueness, possibly a boolean, enum or similiarly typed column.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_LOW = 1;</code>
   */
  public static final int UNIQUENESS_SCORE_LOW_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Medium uniqueness.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_MEDIUM = 2;</code>
   */
  public static final int UNIQUENESS_SCORE_MEDIUM_VALUE = 2;
  /**
   *
   *
   * <pre>
   * High uniqueness, possibly a column of free text or unique identifiers.
   * </pre>
   *
   * <code>UNIQUENESS_SCORE_HIGH = 3;</code>
   */
  public static final int UNIQUENESS_SCORE_HIGH_VALUE = 3;

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
  public static UniquenessScoreLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UniquenessScoreLevel forNumber(int value) {
    switch (value) {
      case 0:
        return UNIQUENESS_SCORE_LEVEL_UNSPECIFIED;
      case 1:
        return UNIQUENESS_SCORE_LOW;
      case 2:
        return UNIQUENESS_SCORE_MEDIUM;
      case 3:
        return UNIQUENESS_SCORE_HIGH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UniquenessScoreLevel>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UniquenessScoreLevel>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UniquenessScoreLevel>() {
            public UniquenessScoreLevel findValueByNumber(int number) {
              return UniquenessScoreLevel.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(18);
  }

  private static final UniquenessScoreLevel[] VALUES = values();

  public static UniquenessScoreLevel valueOf(
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

  private UniquenessScoreLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.UniquenessScoreLevel)
}
