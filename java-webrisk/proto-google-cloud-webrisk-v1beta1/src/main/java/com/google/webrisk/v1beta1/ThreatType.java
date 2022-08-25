/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

/**
 *
 *
 * <pre>
 * The type of threat. This maps dirrectly to the threat list a threat may
 * belong to.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.webrisk.v1beta1.ThreatType}
 */
public enum ThreatType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>THREAT_TYPE_UNSPECIFIED = 0;</code>
   */
  THREAT_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Malware targeting any platform.
   * </pre>
   *
   * <code>MALWARE = 1;</code>
   */
  MALWARE(1),
  /**
   *
   *
   * <pre>
   * Social engineering targeting any platform.
   * </pre>
   *
   * <code>SOCIAL_ENGINEERING = 2;</code>
   */
  SOCIAL_ENGINEERING(2),
  /**
   *
   *
   * <pre>
   * Unwanted software targeting any platform.
   * </pre>
   *
   * <code>UNWANTED_SOFTWARE = 3;</code>
   */
  UNWANTED_SOFTWARE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>THREAT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int THREAT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Malware targeting any platform.
   * </pre>
   *
   * <code>MALWARE = 1;</code>
   */
  public static final int MALWARE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Social engineering targeting any platform.
   * </pre>
   *
   * <code>SOCIAL_ENGINEERING = 2;</code>
   */
  public static final int SOCIAL_ENGINEERING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Unwanted software targeting any platform.
   * </pre>
   *
   * <code>UNWANTED_SOFTWARE = 3;</code>
   */
  public static final int UNWANTED_SOFTWARE_VALUE = 3;

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
  public static ThreatType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ThreatType forNumber(int value) {
    switch (value) {
      case 0:
        return THREAT_TYPE_UNSPECIFIED;
      case 1:
        return MALWARE;
      case 2:
        return SOCIAL_ENGINEERING;
      case 3:
        return UNWANTED_SOFTWARE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ThreatType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ThreatType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ThreatType>() {
        public ThreatType findValueByNumber(int number) {
          return ThreatType.forNumber(number);
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
    return com.google.webrisk.v1beta1.WebRiskProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ThreatType[] VALUES = values();

  public static ThreatType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ThreatType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.webrisk.v1beta1.ThreatType)
}
